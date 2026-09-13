package p014d1;

import J1.a;
import J1.t;
import android.app.Application;
import com.reactnativecommunity.asyncstorage.i;
import com.reactnativecommunity.blurview.b;
import com.reactnativecommunity.webview.q;
import java.util.ArrayList;
import java.util.Arrays;
import org.wonday.orientation.c;
import p039j2.e;
import p063p2.m;

/* JADX INFO: renamed from: d1.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0460k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Application f9220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private N f9221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f9222c;

    public C0460k(N n3) {
        this(n3, (a) null);
    }

    public ArrayList a() {
        return new ArrayList(Arrays.asList(new t(this.f9222c), new d3.a(), new m(), new i(), new b(), new e(), new com.learnium.RNDeviceInfo.b(), new p051m2.e(), new c(), new p035i2.c(), new com.oblador.vectoricons.c(), new q()));
    }

    public C0460k(Application application) {
        this(application, (a) null);
    }

    public C0460k(N n3, a aVar) {
        this.f9221b = n3;
        this.f9222c = aVar;
    }

    public C0460k(Application application, a aVar) {
        this.f9221b = null;
        this.f9220a = application;
        this.f9222c = aVar;
    }
}
