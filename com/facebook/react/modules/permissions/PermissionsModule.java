package com.facebook.react.modules.permissions;

import B1.f;
import B1.g;
import D2.h;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.util.SparseArray;
import com.facebook.fbreact.specs.NativePermissionsAndroidSpec;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableNativeMap;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@p086v1.a(name = "PermissionsAndroid")
public final class PermissionsModule extends NativePermissionsAndroidSpec implements g {
    public static final a Companion = new a(null);
    private static final String ERROR_INVALID_ACTIVITY = "E_INVALID_ACTIVITY";
    public static final String NAME = "PermissionsAndroid";
    private final String DENIED;
    private final String GRANTED;
    private final String NEVER_ASK_AGAIN;
    private final SparseArray<Callback> callbacks;
    private int requestCode;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements Callback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f7031b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ WritableNativeMap f7032c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ PermissionsModule f7033d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Promise f7034e;

        b(ArrayList arrayList, WritableNativeMap writableNativeMap, PermissionsModule permissionsModule, Promise promise) {
            this.f7031b = arrayList;
            this.f7032c = writableNativeMap;
            this.f7033d = permissionsModule;
            this.f7034e = promise;
        }

        @Override // com.facebook.react.bridge.Callback
        public void invoke(Object... objArr) {
            h.f(objArr, "args");
            Object obj = objArr[0];
            h.d(obj, "null cannot be cast to non-null type kotlin.IntArray");
            int[] iArr = (int[]) obj;
            Object obj2 = objArr[1];
            h.d(obj2, "null cannot be cast to non-null type com.facebook.react.modules.core.PermissionAwareActivity");
            f fVar = (f) obj2;
            int size = this.f7031b.size();
            for (int i3 = 0; i3 < size; i3++) {
                Object obj3 = this.f7031b.get(i3);
                h.e(obj3, "get(...)");
                String str = (String) obj3;
                if (iArr.length > i3 && iArr[i3] == 0) {
                    this.f7032c.putString(str, this.f7033d.GRANTED);
                } else if (fVar.shouldShowRequestPermissionRationale(str)) {
                    this.f7032c.putString(str, this.f7033d.DENIED);
                } else {
                    this.f7032c.putString(str, this.f7033d.NEVER_ASK_AGAIN);
                }
            }
            this.f7034e.resolve(this.f7032c);
        }
    }

    public static final class c implements Callback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Promise f7035b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ PermissionsModule f7036c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f7037d;

        c(Promise promise, PermissionsModule permissionsModule, String str) {
            this.f7035b = promise;
            this.f7036c = permissionsModule;
            this.f7037d = str;
        }

        @Override // com.facebook.react.bridge.Callback
        public void invoke(Object... objArr) {
            h.f(objArr, "args");
            Object obj = objArr[0];
            h.d(obj, "null cannot be cast to non-null type kotlin.IntArray");
            int[] iArr = (int[]) obj;
            if (iArr.length > 0 && iArr[0] == 0) {
                this.f7035b.resolve(this.f7036c.GRANTED);
                return;
            }
            Object obj2 = objArr[1];
            h.d(obj2, "null cannot be cast to non-null type com.facebook.react.modules.core.PermissionAwareActivity");
            if (((f) obj2).shouldShowRequestPermissionRationale(this.f7037d)) {
                this.f7035b.resolve(this.f7036c.DENIED);
            } else {
                this.f7035b.resolve(this.f7036c.NEVER_ASK_AGAIN);
            }
        }
    }

    public PermissionsModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.callbacks = new SparseArray<>();
        this.GRANTED = "granted";
        this.DENIED = "denied";
        this.NEVER_ASK_AGAIN = "never_ask_again";
    }

    private final f getPermissionAwareActivity() {
        ComponentCallbacks2 currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            throw new IllegalStateException("Tried to use permissions API while not attached to an Activity.");
        }
        if (currentActivity instanceof f) {
            return (f) currentActivity;
        }
        throw new IllegalStateException("Tried to use permissions API but the host Activity doesn't implement PermissionAwareActivity.");
    }

    @Override // com.facebook.fbreact.specs.NativePermissionsAndroidSpec
    public void checkPermission(String str, Promise promise) {
        h.f(str, "permission");
        h.f(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        promise.resolve(Boolean.valueOf(getReactApplicationContext().getBaseContext().checkSelfPermission(str) == 0));
    }

    @Override // B1.g
    public boolean onRequestPermissionsResult(int i3, String[] strArr, int[] iArr) {
        h.f(strArr, "permissions");
        h.f(iArr, "grantResults");
        try {
            Callback callback = this.callbacks.get(i3);
            if (callback != null) {
                callback.invoke(iArr, getPermissionAwareActivity());
                this.callbacks.remove(i3);
            } else {
                Y.a.K("PermissionsModule", "Unable to find callback with requestCode %d", Integer.valueOf(i3));
            }
            return this.callbacks.size() == 0;
        } catch (IllegalStateException e4) {
            Y.a.p("PermissionsModule", e4, "Unexpected invocation of `onRequestPermissionsResult` with invalid current activity", new Object[0]);
            return false;
        }
    }

    @Override // com.facebook.fbreact.specs.NativePermissionsAndroidSpec
    public void requestMultiplePermissions(ReadableArray readableArray, Promise promise) {
        h.f(readableArray, "permissions");
        h.f(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        ArrayList arrayList = new ArrayList();
        Context baseContext = getReactApplicationContext().getBaseContext();
        int size = readableArray.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            String string = readableArray.getString(i4);
            if (string != null) {
                if (baseContext.checkSelfPermission(string) == 0) {
                    writableNativeMap.putString(string, this.GRANTED);
                    i3++;
                } else {
                    arrayList.add(string);
                }
            }
        }
        if (readableArray.size() == i3) {
            promise.resolve(writableNativeMap);
            return;
        }
        try {
            f permissionAwareActivity = getPermissionAwareActivity();
            this.callbacks.put(this.requestCode, new b(arrayList, writableNativeMap, this, promise));
            permissionAwareActivity.m((String[]) arrayList.toArray(new String[0]), this.requestCode, this);
            this.requestCode++;
        } catch (IllegalStateException e4) {
            promise.reject(ERROR_INVALID_ACTIVITY, e4);
        }
    }

    @Override // com.facebook.fbreact.specs.NativePermissionsAndroidSpec
    public void requestPermission(String str, Promise promise) {
        h.f(str, "permission");
        h.f(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        if (getReactApplicationContext().getBaseContext().checkSelfPermission(str) == 0) {
            promise.resolve(this.GRANTED);
            return;
        }
        try {
            f permissionAwareActivity = getPermissionAwareActivity();
            this.callbacks.put(this.requestCode, new c(promise, this, str));
            permissionAwareActivity.m(new String[]{str}, this.requestCode, this);
            this.requestCode++;
        } catch (IllegalStateException e4) {
            promise.reject(ERROR_INVALID_ACTIVITY, e4);
        }
    }

    @Override // com.facebook.fbreact.specs.NativePermissionsAndroidSpec
    public void shouldShowRequestPermissionRationale(String str, Promise promise) {
        h.f(str, "permission");
        h.f(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        try {
            promise.resolve(Boolean.valueOf(getPermissionAwareActivity().shouldShowRequestPermissionRationale(str)));
        } catch (IllegalStateException e4) {
            promise.reject(ERROR_INVALID_ACTIVITY, e4);
        }
    }
}
