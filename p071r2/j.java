package p071r2;

import D2.h;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public abstract class j implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f10591b = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Throwable f10592b;

        public b(Throwable th) {
            h.f(th, "exception");
            this.f10592b = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof b) && h.b(this.f10592b, ((b) obj).f10592b);
        }

        public int hashCode() {
            return this.f10592b.hashCode();
        }

        public String toString() {
            return "Failure(" + this.f10592b + ')';
        }
    }

    public static Object a(Object obj) {
        return obj;
    }

    public static final boolean b(Object obj) {
        return obj instanceof b;
    }
}
