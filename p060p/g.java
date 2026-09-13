package p060p;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.core.graphics.d;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f10268a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final b[] f10269b;

        @Deprecated
        public a(int i3, b[] bVarArr) {
            this.f10268a = i3;
            this.f10269b = bVarArr;
        }

        static a a(int i3, b[] bVarArr) {
            return new a(i3, bVarArr);
        }

        public b[] b() {
            return this.f10269b;
        }

        public int c() {
            return this.f10268a;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Uri f10270a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f10271b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f10272c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f10273d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f10274e;

        @Deprecated
        public b(Uri uri, int i3, int i4, boolean z3, int i5) {
            this.f10270a = (Uri) p064q.g.g(uri);
            this.f10271b = i3;
            this.f10272c = i4;
            this.f10273d = z3;
            this.f10274e = i5;
        }

        static b a(Uri uri, int i3, int i4, boolean z3, int i5) {
            return new b(uri, i3, i4, z3, i5);
        }

        public int b() {
            return this.f10274e;
        }

        public int c() {
            return this.f10271b;
        }

        public Uri d() {
            return this.f10270a;
        }

        public int e() {
            return this.f10272c;
        }

        public boolean f() {
            return this.f10273d;
        }
    }

    public static class c {
        public void a(int i3) {
        }

        public void b(Typeface typeface) {
        }
    }

    public static Typeface a(Context context, CancellationSignal cancellationSignal, b[] bVarArr) {
        return d.b(context, cancellationSignal, bVarArr, 0);
    }

    public static a b(Context context, CancellationSignal cancellationSignal, e eVar) {
        return d.e(context, eVar, cancellationSignal);
    }

    public static Typeface c(Context context, e eVar, int i3, boolean z3, int i4, Handler handler, c cVar) {
        p060p.a aVar = new p060p.a(cVar, handler);
        return z3 ? f.e(context, eVar, aVar, i3, i4) : f.d(context, eVar, i3, null, aVar);
    }
}
