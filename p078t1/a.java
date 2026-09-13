package p078t1;

import D2.h;
import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.jscexecutor.JSCExecutor;

/* JADX INFO: loaded from: classes.dex */
public final class a implements JavaScriptExecutorFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f10788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f10789b;

    public a(String str, String str2) {
        h.f(str, "appName");
        h.f(str2, "deviceName");
        this.f10788a = str;
        this.f10789b = str2;
    }

    @Override // com.facebook.react.bridge.JavaScriptExecutorFactory
    public JavaScriptExecutor create() {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("OwnerIdentity", "ReactNative");
        writableNativeMap.putString("AppIdentity", this.f10788a);
        writableNativeMap.putString("DeviceIdentity", this.f10789b);
        return new JSCExecutor(writableNativeMap);
    }

    @Override // com.facebook.react.bridge.JavaScriptExecutorFactory
    public void startSamplingProfiler() {
        throw new UnsupportedOperationException("Starting sampling profiler not supported on " + this);
    }

    @Override // com.facebook.react.bridge.JavaScriptExecutorFactory
    public void stopSamplingProfiler(String str) {
        h.f(str, "filename");
        throw new UnsupportedOperationException("Stopping sampling profiler not supported on " + this);
    }

    public String toString() {
        return "JSIExecutor+JSCRuntime";
    }
}
