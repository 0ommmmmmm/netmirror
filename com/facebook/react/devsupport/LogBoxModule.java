package com.facebook.react.devsupport;

import com.facebook.fbreact.specs.NativeLogBoxSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@p086v1.a(name = "LogBox")
public final class LogBoxModule extends NativeLogBoxSpec {
    public static final a Companion = new a(null);
    public static final String NAME = "LogBox";
    private final p042k1.e devSupportManager;
    private final p018e1.j surfaceDelegate;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LogBoxModule(ReactApplicationContext reactApplicationContext, p042k1.e eVar) {
        super(reactApplicationContext);
        D2.h.f(eVar, "devSupportManager");
        this.devSupportManager = eVar;
        p018e1.j jVarG = eVar.g("LogBox");
        this.surfaceDelegate = jVarG == null ? new Q(eVar) : jVarG;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void hide$lambda$1(LogBoxModule logBoxModule) {
        logBoxModule.surfaceDelegate.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invalidate$lambda$2(LogBoxModule logBoxModule) {
        logBoxModule.surfaceDelegate.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void show$lambda$0(LogBoxModule logBoxModule) {
        if (!logBoxModule.surfaceDelegate.e()) {
            logBoxModule.surfaceDelegate.f("LogBox");
        }
        logBoxModule.surfaceDelegate.b();
    }

    @Override // com.facebook.fbreact.specs.NativeLogBoxSpec
    public void hide() {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.S
            @Override // java.lang.Runnable
            public final void run() {
                LogBoxModule.hide$lambda$1(this.f6658b);
            }
        });
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.T
            @Override // java.lang.Runnable
            public final void run() {
                LogBoxModule.invalidate$lambda$2(this.f6659b);
            }
        });
    }

    @Override // com.facebook.fbreact.specs.NativeLogBoxSpec
    public void show() {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.U
            @Override // java.lang.Runnable
            public final void run() {
                LogBoxModule.show$lambda$0(this.f6660b);
            }
        });
    }
}
