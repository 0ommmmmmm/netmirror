package p040k;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class b implements Iterable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    c f9566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c f9567c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final WeakHashMap f9568d = new WeakHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f9569e = 0;

    static class a extends e {
        a(c cVar, c cVar2) {
            super(cVar, cVar2);
        }

        @Override // k.b.e
        c b(c cVar) {
            return cVar.f9573e;
        }

        @Override // k.b.e
        c c(c cVar) {
            return cVar.f9572d;
        }
    }

    /* JADX INFO: renamed from: k.b$b, reason: collision with other inner class name */
    private static class C0134b extends e {
        C0134b(c cVar, c cVar2) {
            super(cVar, cVar2);
        }

        @Override // k.b.e
        c b(c cVar) {
            return cVar.f9572d;
        }

        @Override // k.b.e
        c c(c cVar) {
            return cVar.f9573e;
        }
    }

    static class c implements Map.Entry {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Object f9570b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Object f9571c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        c f9572d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        c f9573e;

        c(Object obj, Object obj2) {
            this.f9570b = obj;
            this.f9571c = obj2;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f9570b.equals(cVar.f9570b) && this.f9571c.equals(cVar.f9571c);
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f9570b;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f9571c;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f9570b.hashCode() ^ this.f9571c.hashCode();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f9570b + "=" + this.f9571c;
        }
    }

    public class d extends f implements Iterator {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private c f9574b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f9575c = true;

        d() {
        }

        @Override // k.b.f
        void a(c cVar) {
            c cVar2 = this.f9574b;
            if (cVar == cVar2) {
                c cVar3 = cVar2.f9573e;
                this.f9574b = cVar3;
                this.f9575c = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            if (this.f9575c) {
                this.f9575c = false;
                this.f9574b = b.this.f9566b;
            } else {
                c cVar = this.f9574b;
                this.f9574b = cVar != null ? cVar.f9572d : null;
            }
            return this.f9574b;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f9575c) {
                return b.this.f9566b != null;
            }
            c cVar = this.f9574b;
            return (cVar == null || cVar.f9572d == null) ? false : true;
        }
    }

    private static abstract class e extends f implements Iterator {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        c f9577b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        c f9578c;

        e(c cVar, c cVar2) {
            this.f9577b = cVar2;
            this.f9578c = cVar;
        }

        private c e() {
            c cVar = this.f9578c;
            c cVar2 = this.f9577b;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return c(cVar);
        }

        @Override // k.b.f
        public void a(c cVar) {
            if (this.f9577b == cVar && cVar == this.f9578c) {
                this.f9578c = null;
                this.f9577b = null;
            }
            c cVar2 = this.f9577b;
            if (cVar2 == cVar) {
                this.f9577b = b(cVar2);
            }
            if (this.f9578c == cVar) {
                this.f9578c = e();
            }
        }

        abstract c b(c cVar);

        abstract c c(c cVar);

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            c cVar = this.f9578c;
            this.f9578c = e();
            return cVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f9578c != null;
        }
    }

    public static abstract class f {
        abstract void a(c cVar);
    }

    public Iterator a() {
        C0134b c0134b = new C0134b(this.f9567c, this.f9566b);
        this.f9568d.put(c0134b, Boolean.FALSE);
        return c0134b;
    }

    public Map.Entry b() {
        return this.f9566b;
    }

    protected c c(Object obj) {
        c cVar = this.f9566b;
        while (cVar != null && !cVar.f9570b.equals(obj)) {
            cVar = cVar.f9572d;
        }
        return cVar;
    }

    public d e() {
        d dVar = new d();
        this.f9568d.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (size() != bVar.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = bVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object next = it2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    public Map.Entry f() {
        return this.f9567c;
    }

    c h(Object obj, Object obj2) {
        c cVar = new c(obj, obj2);
        this.f9569e++;
        c cVar2 = this.f9567c;
        if (cVar2 == null) {
            this.f9566b = cVar;
            this.f9567c = cVar;
            return cVar;
        }
        cVar2.f9572d = cVar;
        cVar.f9573e = cVar2;
        this.f9567c = cVar;
        return cVar;
    }

    public int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode += ((Map.Entry) it.next()).hashCode();
        }
        return iHashCode;
    }

    public Object i(Object obj, Object obj2) {
        c cVarC = c(obj);
        if (cVarC != null) {
            return cVarC.f9571c;
        }
        h(obj, obj2);
        return null;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        a aVar = new a(this.f9566b, this.f9567c);
        this.f9568d.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public Object j(Object obj) {
        c cVarC = c(obj);
        if (cVarC == null) {
            return null;
        }
        this.f9569e--;
        if (!this.f9568d.isEmpty()) {
            Iterator it = this.f9568d.keySet().iterator();
            while (it.hasNext()) {
                ((f) it.next()).a(cVarC);
            }
        }
        c cVar = cVarC.f9573e;
        if (cVar != null) {
            cVar.f9572d = cVarC.f9572d;
        } else {
            this.f9566b = cVarC.f9572d;
        }
        c cVar2 = cVarC.f9572d;
        if (cVar2 != null) {
            cVar2.f9573e = cVar;
        } else {
            this.f9567c = cVar;
        }
        cVarC.f9572d = null;
        cVarC.f9573e = null;
        return cVarC.f9571c;
    }

    public int size() {
        return this.f9569e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb.append(((Map.Entry) it.next()).toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
