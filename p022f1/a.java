package p022f1;

import D2.h;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.os.Build;
import android.util.SparseArray;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f9382c = new b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String[] f9383d = {"", "_bold", "_italic", "_bold_italic"};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String[] f9384e = {".ttf", ".otf"};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final a f9385f = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f9386a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f9387b = new LinkedHashMap();

    /* JADX INFO: renamed from: f1.a$a, reason: collision with other inner class name */
    private static final class C0127a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final SparseArray f9388a = new SparseArray(4);

        public final Typeface a(int i3) {
            return (Typeface) this.f9388a.get(i3);
        }

        public final void b(int i3, Typeface typeface) {
            this.f9388a.put(i3, typeface);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Typeface b(String str, int i3, AssetManager assetManager) {
            if (assetManager != null) {
                String str2 = a.f9383d[i3];
                for (String str3 : a.f9384e) {
                    try {
                        Typeface typefaceCreateFromAsset = Typeface.createFromAsset(assetManager, "fonts/" + str + str2 + str3);
                        h.e(typefaceCreateFromAsset, "createFromAsset(...)");
                        return typefaceCreateFromAsset;
                    } catch (RuntimeException unused) {
                    }
                }
            }
            Typeface typefaceCreate = Typeface.create(str, i3);
            h.e(typefaceCreate, "create(...)");
            return typefaceCreate;
        }

        public final a c() {
            return a.f9385f;
        }

        private b() {
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C0128a f9389c = new C0128a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f9390a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f9391b;

        /* JADX INFO: renamed from: f1.a$c$a, reason: collision with other inner class name */
        public static final class C0128a {
            public /* synthetic */ C0128a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C0128a() {
            }
        }

        public c(int i3) {
            this(i3, 0, 2, null);
        }

        public final Typeface a(Typeface typeface) {
            if (Build.VERSION.SDK_INT < 28) {
                Typeface typefaceCreate = Typeface.create(typeface, b());
                h.c(typefaceCreate);
                return typefaceCreate;
            }
            Typeface typefaceCreate2 = Typeface.create(typeface, this.f9391b, this.f9390a);
            h.c(typefaceCreate2);
            return typefaceCreate2;
        }

        public final int b() {
            if (this.f9391b < 700) {
                return this.f9390a ? 2 : 0;
            }
            return this.f9390a ? 3 : 1;
        }

        public c(int i3, boolean z3) {
            this.f9390a = z3;
            this.f9391b = i3 == -1 ? 400 : i3;
        }

        public /* synthetic */ c(int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
            this(i3, (i5 & 2) != 0 ? -1 : i4);
        }

        public c(int i3, int i4) {
            i3 = i3 == -1 ? 0 : i3;
            this.f9390a = (i3 & 2) != 0;
            this.f9391b = i4 == -1 ? (i3 & 1) != 0 ? 700 : 400 : i4;
        }
    }

    public final Typeface d(String str, int i3, AssetManager assetManager) {
        h.f(str, "fontFamilyName");
        return e(str, new c(i3, 0, 2, null), assetManager);
    }

    public final Typeface e(String str, c cVar, AssetManager assetManager) {
        h.f(str, "fontFamilyName");
        h.f(cVar, "typefaceStyle");
        if (this.f9387b.containsKey(str)) {
            return cVar.a((Typeface) this.f9387b.get(str));
        }
        Map map = this.f9386a;
        Object c0127a = map.get(str);
        if (c0127a == null) {
            c0127a = new C0127a();
            map.put(str, c0127a);
        }
        C0127a c0127a2 = (C0127a) c0127a;
        int iB = cVar.b();
        Typeface typefaceA = c0127a2.a(iB);
        if (typefaceA != null) {
            return typefaceA;
        }
        Typeface typefaceB = f9382c.b(str, iB, assetManager);
        c0127a2.b(iB, typefaceB);
        return typefaceB;
    }
}
