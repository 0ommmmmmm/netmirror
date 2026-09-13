package com.facebook.react.bridge;

import android.os.SystemClock;
import com.facebook.soloader.SoLoader;

/* JADX INFO: loaded from: classes.dex */
public final class ReactBridge {
    public static final ReactBridge INSTANCE = new ReactBridge();
    private static volatile boolean _didInit;
    private static volatile long _loadEndTime;
    private static volatile long _loadStartTime;

    private ReactBridge() {
    }

    public static final long getLoadEndTime() {
        return _loadEndTime;
    }

    public static /* synthetic */ void getLoadEndTime$annotations() {
    }

    public static final long getLoadStartTime() {
        return _loadStartTime;
    }

    public static /* synthetic */ void getLoadStartTime$annotations() {
    }

    public static final boolean isInitialized() {
        return _didInit;
    }

    public static /* synthetic */ void isInitialized$annotations() {
    }

    public static final synchronized void staticInit() {
        if (_didInit) {
            return;
        }
        _loadStartTime = SystemClock.uptimeMillis();
        p015d2.a.c(0L, "ReactBridge.staticInit::load:reactnativejni");
        ReactMarker.logMarker(ReactMarkerConstants.LOAD_REACT_NATIVE_SO_FILE_START);
        SoLoader.t("reactnativejni");
        ReactMarker.logMarker(ReactMarkerConstants.LOAD_REACT_NATIVE_SO_FILE_END);
        p015d2.a.i(0L);
        _loadEndTime = SystemClock.uptimeMillis();
        _didInit = true;
    }
}
