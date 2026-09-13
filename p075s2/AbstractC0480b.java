package p075s2;

import D2.h;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: s2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0480b extends AbstractC0479a implements List, E2.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f10620b = new a(null);

    /* JADX INFO: renamed from: s2.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(int i3, int i4) {
            if (i3 < 0 || i3 >= i4) {
                throw new IndexOutOfBoundsException("index: " + i3 + ", size: " + i4);
            }
        }

        public final void b(int i3, int i4) {
            if (i3 < 0 || i3 > i4) {
                throw new IndexOutOfBoundsException("index: " + i3 + ", size: " + i4);
            }
        }

        public final void c(int i3, int i4, int i5) {
            if (i3 < 0 || i4 > i5) {
                throw new IndexOutOfBoundsException("fromIndex: " + i3 + ", toIndex: " + i4 + ", size: " + i5);
            }
            if (i3 <= i4) {
                return;
            }
            throw new IllegalArgumentException("fromIndex: " + i3 + " > toIndex: " + i4);
        }

        public final int d(int i3, int i4) {
            int i5 = i3 + (i3 >> 1);
            if (i5 - i4 < 0) {
                i5 = i4;
            }
            if (i5 - 2147483639 > 0) {
                return i4 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            return i5;
        }

        public final boolean e(Collection collection, Collection collection2) {
            h.f(collection, "c");
            h.f(collection2, "other");
            if (collection.size() != collection2.size()) {
                return false;
            }
            Iterator it = collection2.iterator();
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                if (!h.b(it2.next(), it.next())) {
                    return false;
                }
            }
            return true;
        }

        public final int f(Collection collection) {
            h.f(collection, "c");
            Iterator it = collection.iterator();
            int iHashCode = 1;
            while (it.hasNext()) {
                Object next = it.next();
                iHashCode = (iHashCode * 31) + (next != null ? next.hashCode() : 0);
            }
            return iHashCode;
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: s2.b$b, reason: collision with other inner class name */
    private class C0145b implements Iterator, E2.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f10621b;

        public C0145b() {
        }

        protected final int a() {
            return this.f10621b;
        }

        protected final void b(int i3) {
            this.f10621b = i3;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f10621b < AbstractC0480b.this.size();
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            AbstractC0480b abstractC0480b = AbstractC0480b.this;
            int i3 = this.f10621b;
            this.f10621b = i3 + 1;
            return abstractC0480b.get(i3);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: renamed from: s2.b$c */
    private class c extends C0145b implements ListIterator, E2.a {
        public c(int i3) {
            super();
            AbstractC0480b.f10620b.b(i3, AbstractC0480b.this.size());
            b(i3);
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return a() > 0;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return a();
        }

        @Override // java.util.ListIterator
        public Object previous() {
            if (!hasPrevious()) {
                throw new NoSuchElementException();
            }
            AbstractC0480b abstractC0480b = AbstractC0480b.this;
            b(a() - 1);
            return abstractC0480b.get(a());
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return a() - 1;
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: renamed from: s2.b$d */
    private static final class d extends AbstractC0480b implements RandomAccess {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final AbstractC0480b f10624c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f10625d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f10626e;

        public d(AbstractC0480b abstractC0480b, int i3, int i4) {
            h.f(abstractC0480b, "list");
            this.f10624c = abstractC0480b;
            this.f10625d = i3;
            AbstractC0480b.f10620b.c(i3, i4, abstractC0480b.size());
            this.f10626e = i4 - i3;
        }

        @Override // p075s2.AbstractC0479a
        public int a() {
            return this.f10626e;
        }

        @Override // p075s2.AbstractC0480b, java.util.List
        public Object get(int i3) {
            AbstractC0480b.f10620b.a(i3, this.f10626e);
            return this.f10624c.get(this.f10625d + i3);
        }
    }

    protected AbstractC0480b() {
    }

    @Override // java.util.List
    public void add(int i3, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i3, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            return f10620b.e(this, (Collection) obj);
        }
        return false;
    }

    public abstract Object get(int i3);

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        return f10620b.f(this);
    }

    public int indexOf(Object obj) {
        Iterator it = iterator();
        int i3 = 0;
        while (it.hasNext()) {
            if (h.b(it.next(), obj)) {
                return i3;
            }
            i3++;
        }
        return -1;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new C0145b();
    }

    public int lastIndexOf(Object obj) {
        ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (h.b(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public ListIterator listIterator() {
        return new c(0);
    }

    @Override // java.util.List
    public Object remove(int i3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public Object set(int i3, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List subList(int i3, int i4) {
        return new d(this, i3, i4);
    }

    public ListIterator listIterator(int i3) {
        return new c(i3);
    }
}
