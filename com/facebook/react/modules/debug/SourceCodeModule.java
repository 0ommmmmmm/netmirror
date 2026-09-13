package com.facebook.react.modules.debug;

import com.facebook.fbreact.specs.NativeSourceCodeSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.Map;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import p071r2.n;

/* JADX INFO: loaded from: classes.dex */
@p086v1.a(name = NativeSourceCodeSpec.NAME)
public final class SourceCodeModule extends NativeSourceCodeSpec {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SourceCodeModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        D2.h.f(reactApplicationContext, "reactContext");
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.Map<java.lang.String, java.lang.Object>, void] */
    @Override // com.facebook.fbreact.specs.NativeSourceCodeSpec
    protected Map<String, Object> getTypedExportedConstants() {
        return DebugProbesKt.probeCoroutineResumed(n.a("scriptURL", p002a1.a.d(getReactApplicationContext().getSourceURL(), "No source URL loaded, have you initialised the instance?")));
    }
}
