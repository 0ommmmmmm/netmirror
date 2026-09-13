package p014d1;

import B1.a;
import B1.f;
import B1.g;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import androidx.appcompat.app.c;

/* JADX INFO: renamed from: d1.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC0467s extends c implements a, f {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final C0471w f9309D = p0();

    protected AbstractActivityC0467s() {
    }

    @Override // B1.a
    public void c() {
        super.onBackPressed();
    }

    @Override // B1.f
    public void m(String[] strArr, int i3, g gVar) {
        this.f9309D.D(strArr, i3, gVar);
    }

    @Override // androidx.fragment.app.ActivityC0281j, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i3, int i4, Intent intent) {
        super.onActivityResult(i3, i4, intent);
        this.f9309D.p(i3, i4, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.f9309D.q()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // androidx.appcompat.app.c, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f9309D.r(configuration);
    }

    @Override // androidx.fragment.app.ActivityC0281j, androidx.activity.ComponentActivity, androidx.core.app.f, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f9309D.s(bundle);
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.ActivityC0281j, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.f9309D.t();
    }

    @Override // androidx.appcompat.app.c, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i3, KeyEvent keyEvent) {
        return this.f9309D.u(i3, keyEvent) || super.onKeyDown(i3, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyLongPress(int i3, KeyEvent keyEvent) {
        return this.f9309D.v(i3, keyEvent) || super.onKeyLongPress(i3, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i3, KeyEvent keyEvent) {
        return this.f9309D.w(i3, keyEvent) || super.onKeyUp(i3, keyEvent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        if (this.f9309D.x(intent)) {
            return;
        }
        super.onNewIntent(intent);
    }

    @Override // androidx.fragment.app.ActivityC0281j, android.app.Activity
    protected void onPause() {
        super.onPause();
        this.f9309D.y();
    }

    @Override // androidx.fragment.app.ActivityC0281j, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i3, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i3, strArr, iArr);
        this.f9309D.z(i3, strArr, iArr);
    }

    @Override // androidx.fragment.app.ActivityC0281j, android.app.Activity
    protected void onResume() {
        super.onResume();
        this.f9309D.A();
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        this.f9309D.B();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z3) {
        super.onWindowFocusChanged(z3);
        this.f9309D.C(z3);
    }

    protected abstract C0471w p0();
}
