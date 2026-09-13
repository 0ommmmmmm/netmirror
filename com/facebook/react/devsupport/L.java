package com.facebook.react.devsupport;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.react.bridge.ReactContext;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p014d1.AbstractC0462m;
import p014d1.AbstractC0464o;

/* JADX INFO: loaded from: classes.dex */
public final class L extends FrameLayout {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f6644e = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TextView f6645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.facebook.react.modules.debug.h f6646c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b f6647d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f6648b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f6649c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f6650d;

        public b() {
        }

        public final void a() {
            this.f6648b = false;
            L.this.post(this);
        }

        public final void b() {
            this.f6648b = true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f6648b) {
                return;
            }
            this.f6649c += L.this.f6646c.d() - L.this.f6646c.g();
            this.f6650d += L.this.f6646c.c();
            L l3 = L.this;
            l3.c(l3.f6646c.e(), L.this.f6646c.f(), this.f6649c, this.f6650d);
            L.this.f6646c.j();
            L.this.postDelayed(this, 500L);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(ReactContext reactContext) {
        super(reactContext);
        D2.h.c(reactContext);
        View.inflate(reactContext, AbstractC0464o.f9258c, this);
        View viewFindViewById = findViewById(AbstractC0462m.f9243o);
        D2.h.d(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        this.f6645b = (TextView) viewFindViewById;
        this.f6646c = new com.facebook.react.modules.debug.h(reactContext);
        this.f6647d = new b();
        c(0.0d, 0.0d, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(double d4, double d5, int i3, int i4) {
        D2.u uVar = D2.u.f192a;
        String str = String.format(Locale.US, "UI: %.1f fps\n%d dropped so far\n%d stutters (4+) so far\nJS: %.1f fps", Arrays.copyOf(new Object[]{Double.valueOf(d4), Integer.valueOf(i3), Integer.valueOf(i4), Double.valueOf(d5)}, 4));
        D2.h.e(str, "format(...)");
        this.f6645b.setText(str);
        Y.a.b("ReactNative", str);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f6646c.j();
        com.facebook.react.modules.debug.h.l(this.f6646c, 0.0d, 1, null);
        this.f6647d.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f6646c.n();
        this.f6647d.b();
    }
}
