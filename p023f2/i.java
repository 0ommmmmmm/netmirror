package p023f2;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;

/* JADX INFO: loaded from: classes.dex */
final class i implements ComponentCallbacks {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f9409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f9410c;

    interface a {
        void a(int i3);
    }

    public i(Configuration configuration) {
        this.f9409b = configuration.orientation;
    }

    void a(Context context) {
        context.getApplicationContext().unregisterComponentCallbacks(this);
        this.f9410c = null;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        int i3 = this.f9409b;
        int i4 = configuration.orientation;
        if (i3 == i4) {
            return;
        }
        this.f9409b = i4;
        a aVar = this.f9410c;
        if (aVar == null) {
            return;
        }
        aVar.a(i4);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }
}
