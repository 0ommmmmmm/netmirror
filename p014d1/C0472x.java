package p014d1;

import android.view.KeyEvent;
import android.view.View;
import com.facebook.react.bridge.WritableNativeMap;
import java.util.Map;
import p018e1.d;

/* JADX INFO: renamed from: d1.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C0472x {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map f9321c = d.a().b(23, "select").b(66, "select").b(62, "select").b(85, "playPause").b(89, "rewind").b(90, "fastForward").b(86, "stop").b(87, "next").b(88, "previous").b(19, "up").b(22, "right").b(20, "down").b(21, "left").b(165, "info").b(82, "menu").a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f9322a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a0 f9323b;

    C0472x(a0 a0Var) {
        this.f9323b = a0Var;
    }

    private void b(String str, int i3) {
        c(str, i3, -1);
    }

    private void c(String str, int i3, int i4) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("eventType", str);
        writableNativeMap.putInt("eventKeyAction", i4);
        if (i3 != -1) {
            writableNativeMap.putInt("tag", i3);
        }
        this.f9323b.r("onHWKeyEvent", writableNativeMap);
    }

    public void a() {
        int i3 = this.f9322a;
        if (i3 != -1) {
            b("blur", i3);
        }
        this.f9322a = -1;
    }

    public void d(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        int action = keyEvent.getAction();
        if (action == 1 || action == 0) {
            Map map = f9321c;
            if (map.containsKey(Integer.valueOf(keyCode))) {
                c((String) map.get(Integer.valueOf(keyCode)), this.f9322a, action);
            }
        }
    }

    public void e(View view) {
        if (this.f9322a == view.getId()) {
            return;
        }
        int i3 = this.f9322a;
        if (i3 != -1) {
            b("blur", i3);
        }
        this.f9322a = view.getId();
        b("focus", view.getId());
    }
}
