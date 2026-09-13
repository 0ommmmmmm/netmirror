package p060p;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p044l.g;

/* JADX INFO: loaded from: classes.dex */
abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final p044l.e f10252a = new p044l.e(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ExecutorService f10253b = h.a("fonts-androidx", 10, 10000);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final Object f10254c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final g f10255d = new g();

    class a implements Callable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f10256a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f10257b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p060p.e f10258c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f10259d;

        a(String str, Context context, p060p.e eVar, int i3) {
            this.f10256a = str;
            this.f10257b = context;
            this.f10258c = eVar;
            this.f10259d = i3;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            return f.c(this.f10256a, this.f10257b, this.f10258c, this.f10259d);
        }
    }

    class b implements p064q.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p060p.a f10260a;

        b(p060p.a aVar) {
            this.f10260a = aVar;
        }

        @Override // p064q.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(e eVar) {
            if (eVar == null) {
                eVar = new e(-3);
            }
            this.f10260a.b(eVar);
        }
    }

    class c implements Callable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f10261a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f10262b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p060p.e f10263c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f10264d;

        c(String str, Context context, p060p.e eVar, int i3) {
            this.f10261a = str;
            this.f10262b = context;
            this.f10263c = eVar;
            this.f10264d = i3;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            try {
                return f.c(this.f10261a, this.f10262b, this.f10263c, this.f10264d);
            } catch (Throwable unused) {
                return new e(-3);
            }
        }
    }

    class d implements p064q.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f10265a;

        d(String str) {
            this.f10265a = str;
        }

        @Override // p064q.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(e eVar) {
            synchronized (f.f10254c) {
                try {
                    g gVar = f.f10255d;
                    ArrayList arrayList = (ArrayList) gVar.get(this.f10265a);
                    if (arrayList == null) {
                        return;
                    }
                    gVar.remove(this.f10265a);
                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                        ((p064q.a) arrayList.get(i3)).a(eVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private static String a(p060p.e eVar, int i3) {
        return eVar.d() + "-" + i3;
    }

    private static int b(g.a aVar) {
        int i3 = 1;
        if (aVar.c() != 0) {
            return aVar.c() != 1 ? -3 : -2;
        }
        g.b[] bVarArrB = aVar.b();
        if (bVarArrB != null && bVarArrB.length != 0) {
            i3 = 0;
            for (g.b bVar : bVarArrB) {
                int iB = bVar.b();
                if (iB != 0) {
                    if (iB < 0) {
                        return -3;
                    }
                    return iB;
                }
            }
        }
        return i3;
    }

    static e c(String str, Context context, p060p.e eVar, int i3) {
        p044l.e eVar2 = f10252a;
        Typeface typeface = (Typeface) eVar2.c(str);
        if (typeface != null) {
            return new e(typeface);
        }
        try {
            g.a aVarE = p060p.d.e(context, eVar, null);
            int iB = b(aVarE);
            if (iB != 0) {
                return new e(iB);
            }
            Typeface typefaceB = androidx.core.graphics.d.b(context, null, aVarE.b(), i3);
            if (typefaceB == null) {
                return new e(-3);
            }
            eVar2.d(str, typefaceB);
            return new e(typefaceB);
        } catch (PackageManager.NameNotFoundException unused) {
            return new e(-1);
        }
    }

    static Typeface d(Context context, p060p.e eVar, int i3, Executor executor, p060p.a aVar) {
        String strA = a(eVar, i3);
        Typeface typeface = (Typeface) f10252a.c(strA);
        if (typeface != null) {
            aVar.b(new e(typeface));
            return typeface;
        }
        b bVar = new b(aVar);
        synchronized (f10254c) {
            try {
                g gVar = f10255d;
                ArrayList arrayList = (ArrayList) gVar.get(strA);
                if (arrayList != null) {
                    arrayList.add(bVar);
                    return null;
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(bVar);
                gVar.put(strA, arrayList2);
                c cVar = new c(strA, context, eVar, i3);
                if (executor == null) {
                    executor = f10253b;
                }
                h.b(executor, cVar, new d(strA));
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    static Typeface e(Context context, p060p.e eVar, p060p.a aVar, int i3, int i4) {
        String strA = a(eVar, i3);
        Typeface typeface = (Typeface) f10252a.c(strA);
        if (typeface != null) {
            aVar.b(new e(typeface));
            return typeface;
        }
        if (i4 == -1) {
            e eVarC = c(strA, context, eVar, i3);
            aVar.b(eVarC);
            return eVarC.f10266a;
        }
        try {
            e eVar2 = (e) h.c(f10253b, new a(strA, context, eVar, i3), i4);
            aVar.b(eVar2);
            return eVar2.f10266a;
        } catch (InterruptedException unused) {
            aVar.b(new e(-3));
            return null;
        }
    }

    static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Typeface f10266a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f10267b;

        e(int i3) {
            this.f10266a = null;
            this.f10267b = i3;
        }

        boolean a() {
            return this.f10267b == 0;
        }

        e(Typeface typeface) {
            this.f10266a = typeface;
            this.f10267b = 0;
        }
    }
}
