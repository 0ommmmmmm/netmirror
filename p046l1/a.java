package p046l1;

import D2.h;
import androidx.activity.result.d;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p050m1.b;

/* JADX INFO: loaded from: classes.dex */
public final class a implements UIManagerListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f9699b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f9700c = new ArrayList();

    public final synchronized void a(p050m1.a aVar) {
        h.f(aVar, "block");
        this.f9700c.add(aVar);
    }

    public final synchronized void b(p050m1.a aVar) {
        h.f(aVar, "block");
        this.f9699b.add(aVar);
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didDispatchMountItems(UIManager uIManager) {
        h.f(uIManager, "uiManager");
        didMountItems(uIManager);
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didMountItems(UIManager uIManager) {
        h.f(uIManager, "uiManager");
        if (this.f9700c.isEmpty()) {
            return;
        }
        Iterator it = this.f9700c.iterator();
        while (it.hasNext()) {
            d.a(it.next());
            if (uIManager instanceof b) {
                throw null;
            }
        }
        this.f9700c.clear();
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didScheduleMountItems(UIManager uIManager) {
        h.f(uIManager, "uiManager");
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void willDispatchViewUpdates(UIManager uIManager) {
        h.f(uIManager, "uiManager");
        willMountItems(uIManager);
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void willMountItems(UIManager uIManager) {
        h.f(uIManager, "uiManager");
        if (this.f9699b.isEmpty()) {
            return;
        }
        Iterator it = this.f9699b.iterator();
        while (it.hasNext()) {
            d.a(it.next());
            if (uIManager instanceof b) {
                throw null;
            }
        }
        this.f9699b.clear();
    }
}
