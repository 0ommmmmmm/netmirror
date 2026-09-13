package com.facebook.react.modules.core;

import D2.h;
import com.facebook.fbreact.specs.NativeHeadlessJsTaskSupportSpec;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import p082u1.e;

/* JADX INFO: loaded from: classes.dex */
@p086v1.a(name = NativeHeadlessJsTaskSupportSpec.NAME)
public class HeadlessJsTaskSupportModule extends NativeHeadlessJsTaskSupportSpec {
    public HeadlessJsTaskSupportModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.fbreact.specs.NativeHeadlessJsTaskSupportSpec
    public void notifyTaskFinished(double d4) {
        int i3 = (int) d4;
        e.a aVar = e.f10878g;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        h.e(reactApplicationContext, "getReactApplicationContext(...)");
        e eVarA = aVar.a(reactApplicationContext);
        if (eVarA.i(i3)) {
            eVarA.f(i3);
        } else {
            Y.a.G(HeadlessJsTaskSupportModule.class, "Tried to finish non-active task with id %d. Did it time out?", Integer.valueOf(i3));
        }
    }

    @Override // com.facebook.fbreact.specs.NativeHeadlessJsTaskSupportSpec
    public void notifyTaskRetry(double d4, Promise promise) {
        h.f(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        int i3 = (int) d4;
        e.a aVar = e.f10878g;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        h.e(reactApplicationContext, "getReactApplicationContext(...)");
        e eVarA = aVar.a(reactApplicationContext);
        if (eVarA.i(i3)) {
            promise.resolve(Boolean.valueOf(eVarA.l(i3)));
        } else {
            Y.a.G(HeadlessJsTaskSupportModule.class, "Tried to retry non-active task with id %d. Did it time out?", Integer.valueOf(i3));
            promise.resolve(Boolean.FALSE);
        }
    }
}
