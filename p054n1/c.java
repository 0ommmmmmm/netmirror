package p054n1;

import android.os.SystemClock;
import com.facebook.react.bridge.ReactIgnorableMountingException;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.RetryableMountingLayerException;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.fabric.mounting.mountitems.MountItem;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import p070r1.b;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f9853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f9854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ConcurrentLinkedQueue f9855c = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ConcurrentLinkedQueue f9856d = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ConcurrentLinkedQueue f9857e = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f9858f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f9859g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f9860h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f9861i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f9862j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Runnable f9863k = new Runnable() { // from class: n1.b
        @Override // java.lang.Runnable
        public final void run() {
            this.f9852b.p();
        }
    };

    public interface a {
        void a(List list);

        void b(List list);

        void c();
    }

    public c(d dVar, a aVar) {
        this.f9853a = dVar;
        this.f9854b = aVar;
    }

    private void e() {
        g gVarF;
        this.f9859g = 0L;
        this.f9860h = SystemClock.uptimeMillis();
        List<com.facebook.react.fabric.mounting.mountitems.c> listM = m();
        List<MountItem> listK = k();
        if (listK == null && listM == null) {
            return;
        }
        this.f9854b.b(listK);
        if (listM != null) {
            p015d2.a.c(0L, "MountItemDispatcher::mountViews viewCommandMountItems");
            for (com.facebook.react.fabric.mounting.mountitems.c cVar : listM) {
                if (b.e()) {
                    q(cVar, "dispatchMountItems: Executing viewCommandMountItem");
                }
                try {
                    j(cVar);
                } catch (RetryableMountingLayerException e4) {
                    if (cVar.b() == 0) {
                        cVar.c();
                        d(cVar);
                    } else {
                        ReactSoftExceptionLogger.logSoftException("MountItemDispatcher", new ReactNoCrashSoftException("Caught exception executing ViewCommand: " + cVar.toString(), e4));
                    }
                } catch (Throwable th) {
                    ReactSoftExceptionLogger.logSoftException("MountItemDispatcher", new RuntimeException("Caught exception executing ViewCommand: " + cVar.toString(), th));
                }
            }
            p015d2.a.i(0L);
        }
        List<MountItem> listL = l();
        if (listL != null) {
            p015d2.a.c(0L, "MountItemDispatcher::mountViews preMountItems");
            for (MountItem mountItem : listL) {
                if (b.e()) {
                    q(mountItem, "dispatchMountItems: Executing preMountItem");
                }
                j(mountItem);
            }
            p015d2.a.i(0L);
        }
        if (listK != null) {
            p015d2.a.c(0L, "MountItemDispatcher::mountViews mountItems to execute");
            long jUptimeMillis = SystemClock.uptimeMillis();
            for (MountItem mountItem2 : listK) {
                if (b.e()) {
                    q(mountItem2, "dispatchMountItems: Executing mountItem");
                }
                try {
                    j(mountItem2);
                } catch (Throwable th2) {
                    Y.a.n("MountItemDispatcher", "dispatchMountItems: caught exception, displaying mount state", th2);
                    for (MountItem mountItem3 : listK) {
                        if (mountItem3 == mountItem2) {
                            Y.a.m("MountItemDispatcher", "dispatchMountItems: mountItem: next mountItem triggered exception!");
                        }
                        q(mountItem3, "dispatchMountItems: mountItem");
                    }
                    if (mountItem2.getSurfaceId() != -1 && (gVarF = this.f9853a.f(mountItem2.getSurfaceId())) != null) {
                        gVarF.B();
                    }
                    if (!ReactIgnorableMountingException.isIgnorable(th2)) {
                        throw th2;
                    }
                    ReactSoftExceptionLogger.logSoftException("MountItemDispatcher", th2);
                }
            }
            this.f9859g += SystemClock.uptimeMillis() - jUptimeMillis;
            p015d2.a.i(0L);
        }
        this.f9854b.a(listK);
    }

    private void h(long j3) {
        MountItem mountItem;
        p015d2.a.c(0L, "MountItemDispatcher::premountViews");
        this.f9858f = true;
        while (System.nanoTime() <= j3 && (mountItem = (MountItem) this.f9857e.poll()) != null) {
            try {
                if (b.e()) {
                    q(mountItem, "dispatchPreMountItems");
                }
                j(mountItem);
            } catch (Throwable th) {
                this.f9858f = false;
                throw th;
            }
        }
        this.f9858f = false;
        p015d2.a.i(0L);
    }

    private static List i(ConcurrentLinkedQueue concurrentLinkedQueue) {
        if (concurrentLinkedQueue.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        do {
            Object objPoll = concurrentLinkedQueue.poll();
            if (objPoll != null) {
                arrayList.add(objPoll);
            }
        } while (!concurrentLinkedQueue.isEmpty());
        if (arrayList.size() == 0) {
            return null;
        }
        return arrayList;
    }

    private void j(MountItem mountItem) {
        if (!this.f9853a.l(mountItem.getSurfaceId())) {
            mountItem.execute(this.f9853a);
            return;
        }
        if (b.e()) {
            Y.a.o("MountItemDispatcher", "executeOrEnqueue: Item execution delayed, surface %s is not ready yet", Integer.valueOf(mountItem.getSurfaceId()));
        }
        this.f9853a.f(mountItem.getSurfaceId()).F(mountItem);
    }

    private List k() {
        return i(this.f9856d);
    }

    private List l() {
        return i(this.f9857e);
    }

    private List m() {
        return i(this.f9855c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p() {
        this.f9862j = false;
        if (this.f9857e.isEmpty()) {
            return;
        }
        h(this.f9861i + 8333333);
    }

    private static void q(MountItem mountItem, String str) {
        for (String str2 : mountItem.toString().split("\n")) {
            Y.a.m("MountItemDispatcher", str + ": " + str2);
        }
    }

    public void b(MountItem mountItem) {
        this.f9856d.add(mountItem);
    }

    public void c(MountItem mountItem) {
        if (!this.f9853a.t(mountItem.getSurfaceId())) {
            this.f9857e.add(mountItem);
        } else if (FabricUIManager.IS_DEVELOPMENT_ENVIRONMENT) {
            Y.a.o("MountItemDispatcher", "Not queueing PreAllocateMountItem: surfaceId stopped: [%d] - %s", Integer.valueOf(mountItem.getSurfaceId()), mountItem.toString());
        }
    }

    public void d(com.facebook.react.fabric.mounting.mountitems.c cVar) {
        this.f9855c.add(cVar);
    }

    public void f(Queue queue) {
        while (!queue.isEmpty()) {
            MountItem mountItem = (MountItem) queue.poll();
            try {
                mountItem.execute(this.f9853a);
            } catch (RetryableMountingLayerException e4) {
                if (mountItem instanceof com.facebook.react.fabric.mounting.mountitems.c) {
                    com.facebook.react.fabric.mounting.mountitems.c cVar = (com.facebook.react.fabric.mounting.mountitems.c) mountItem;
                    if (cVar.b() == 0) {
                        cVar.c();
                        d(cVar);
                    }
                } else {
                    q(mountItem, "dispatchExternalMountItems: mounting failed with " + e4.getMessage());
                }
            }
        }
    }

    public void g(long j3) {
        this.f9861i = j3;
        if (this.f9857e.isEmpty()) {
            return;
        }
        if (!b.i()) {
            h(this.f9861i + 8333333);
        } else {
            if (this.f9862j) {
                return;
            }
            this.f9862j = true;
            UiThreadUtil.getUiThreadHandler().post(this.f9863k);
        }
    }

    public long n() {
        return this.f9859g;
    }

    public long o() {
        return this.f9860h;
    }

    public void r() {
        if (this.f9858f) {
            return;
        }
        this.f9858f = true;
        try {
            e();
            this.f9858f = false;
            this.f9854b.c();
        } catch (Throwable th) {
            this.f9858f = false;
            throw th;
        }
    }
}
