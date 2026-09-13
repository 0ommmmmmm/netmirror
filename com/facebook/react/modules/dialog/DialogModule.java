package com.facebook.react.modules.dialog;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.ActivityC0281j;
import androidx.fragment.app.x;
import com.facebook.fbreact.specs.NativeDialogManagerAndroidSpec;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.Map;
import p018e1.d;

/* JADX INFO: loaded from: classes.dex */
@p086v1.a(name = NativeDialogManagerAndroidSpec.NAME)
public class DialogModule extends NativeDialogManagerAndroidSpec implements LifecycleEventListener {
    static final String FRAGMENT_TAG = "com.facebook.catalyst.react.dialog.DialogModule";
    static final String KEY_CANCELABLE = "cancelable";
    static final String KEY_ITEMS = "items";
    static final String KEY_MESSAGE = "message";
    static final String KEY_TITLE = "title";
    private boolean mIsInForeground;
    static final String ACTION_BUTTON_CLICKED = "buttonClicked";
    static final String ACTION_DISMISSED = "dismissed";
    static final String KEY_BUTTON_POSITIVE = "buttonPositive";
    static final String KEY_BUTTON_NEGATIVE = "buttonNegative";
    static final String KEY_BUTTON_NEUTRAL = "buttonNeutral";
    static final Map<String, Object> CONSTANTS = d.h(ACTION_BUTTON_CLICKED, ACTION_BUTTON_CLICKED, ACTION_DISMISSED, ACTION_DISMISSED, KEY_BUTTON_POSITIVE, -1, KEY_BUTTON_NEGATIVE, -2, KEY_BUTTON_NEUTRAL, -3);

    class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c f6966b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Bundle f6967c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Callback f6968d;

        a(c cVar, Bundle bundle, Callback callback) {
            this.f6966b = cVar;
            this.f6967c = bundle;
            this.f6968d = callback;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f6966b.b(this.f6967c, this.f6968d);
        }
    }

    class b implements DialogInterface.OnClickListener, DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Callback f6970b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f6971c = false;

        public b(Callback callback) {
            this.f6970b = callback;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i3) {
            if (this.f6971c || !DialogModule.this.getReactApplicationContext().hasActiveReactInstance()) {
                return;
            }
            this.f6970b.invoke(DialogModule.ACTION_BUTTON_CLICKED, Integer.valueOf(i3));
            this.f6971c = true;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (this.f6971c || !DialogModule.this.getReactApplicationContext().hasActiveReactInstance()) {
                return;
            }
            this.f6970b.invoke(DialogModule.ACTION_DISMISSED);
            this.f6971c = true;
        }
    }

    private class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final x f6973a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Object f6974b;

        public c(x xVar) {
            this.f6973a = xVar;
        }

        private void a() {
            com.facebook.react.modules.dialog.b bVar;
            if (DialogModule.this.mIsInForeground && (bVar = (com.facebook.react.modules.dialog.b) this.f6973a.h0(DialogModule.FRAGMENT_TAG)) != null && bVar.b0()) {
                bVar.C1();
            }
        }

        public void b(Bundle bundle, Callback callback) {
            UiThreadUtil.assertOnUiThread();
            a();
            com.facebook.react.modules.dialog.b bVar = new com.facebook.react.modules.dialog.b(callback != null ? DialogModule.this.new b(callback) : null, bundle);
            if (!DialogModule.this.mIsInForeground || this.f6973a.N0()) {
                this.f6974b = bVar;
                return;
            }
            if (bundle.containsKey(DialogModule.KEY_CANCELABLE)) {
                bVar.J1(bundle.getBoolean(DialogModule.KEY_CANCELABLE));
            }
            bVar.L1(this.f6973a, DialogModule.FRAGMENT_TAG);
        }

        public void c() {
            UiThreadUtil.assertOnUiThread();
            SoftAssertions.assertCondition(DialogModule.this.mIsInForeground, "showPendingAlert() called in background");
            if (this.f6974b == null) {
                return;
            }
            a();
            ((com.facebook.react.modules.dialog.b) this.f6974b).L1(this.f6973a, DialogModule.FRAGMENT_TAG);
            this.f6974b = null;
        }
    }

    public DialogModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private c getFragmentManagerHelper() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null || !(currentActivity instanceof ActivityC0281j)) {
            return null;
        }
        return new c(((ActivityC0281j) currentActivity).T());
    }

    @Override // com.facebook.fbreact.specs.NativeDialogManagerAndroidSpec
    public Map<String, Object> getTypedExportedConstants() {
        return CONSTANTS;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        getReactApplicationContext().addLifecycleEventListener(this);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        getReactApplicationContext().removeLifecycleEventListener(this);
        super.invalidate();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        this.mIsInForeground = false;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        this.mIsInForeground = true;
        c fragmentManagerHelper = getFragmentManagerHelper();
        if (fragmentManagerHelper != null) {
            fragmentManagerHelper.c();
        } else {
            Y.a.E(DialogModule.class, "onHostResume called but no FragmentManager found");
        }
    }

    @Override // com.facebook.fbreact.specs.NativeDialogManagerAndroidSpec
    public void showAlert(ReadableMap readableMap, Callback callback, Callback callback2) {
        c fragmentManagerHelper = getFragmentManagerHelper();
        if (fragmentManagerHelper == null) {
            callback.invoke("Tried to show an alert while not attached to an Activity");
            return;
        }
        Bundle bundle = new Bundle();
        if (readableMap.hasKey(KEY_TITLE)) {
            bundle.putString(KEY_TITLE, readableMap.getString(KEY_TITLE));
        }
        if (readableMap.hasKey(KEY_MESSAGE)) {
            bundle.putString(KEY_MESSAGE, readableMap.getString(KEY_MESSAGE));
        }
        if (readableMap.hasKey(KEY_BUTTON_POSITIVE)) {
            bundle.putString("button_positive", readableMap.getString(KEY_BUTTON_POSITIVE));
        }
        if (readableMap.hasKey(KEY_BUTTON_NEGATIVE)) {
            bundle.putString("button_negative", readableMap.getString(KEY_BUTTON_NEGATIVE));
        }
        if (readableMap.hasKey(KEY_BUTTON_NEUTRAL)) {
            bundle.putString("button_neutral", readableMap.getString(KEY_BUTTON_NEUTRAL));
        }
        if (readableMap.hasKey(KEY_ITEMS)) {
            ReadableArray array = readableMap.getArray(KEY_ITEMS);
            CharSequence[] charSequenceArr = new CharSequence[array.size()];
            for (int i3 = 0; i3 < array.size(); i3++) {
                charSequenceArr[i3] = array.getString(i3);
            }
            bundle.putCharSequenceArray(KEY_ITEMS, charSequenceArr);
        }
        if (readableMap.hasKey(KEY_CANCELABLE)) {
            bundle.putBoolean(KEY_CANCELABLE, readableMap.getBoolean(KEY_CANCELABLE));
        }
        UiThreadUtil.runOnUiThread(new a(fragmentManagerHelper, bundle, callback2));
    }
}
