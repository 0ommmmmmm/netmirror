package p075s2;

import D2.h;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
class K extends AbstractC0480b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f10616c;

    public static final class a implements ListIterator, E2.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ListIterator f10617b;

        a(int i3) {
            this.f10617b = K.this.f10616c.listIterator(v.F(K.this, i3));
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f10617b.hasPrevious();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f10617b.hasNext();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            return this.f10617b.previous();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return v.E(K.this, this.f10617b.previousIndex());
        }

        @Override // java.util.ListIterator
        public Object previous() {
            return this.f10617b.next();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return v.E(K.this, this.f10617b.nextIndex());
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public K(List<Object> list) {
        h.f(list, "delegate");
        this.f10616c = list;
    }

    @Override // p075s2.AbstractC0479a
    public int a() {
        return this.f10616c.size();
    }

    @Override // p075s2.AbstractC0480b, java.util.List
    public Object get(int i3) {
        return this.f10616c.get(v.D(this, i3));
    }

    @Override // p075s2.AbstractC0480b, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // p075s2.AbstractC0480b, java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // p075s2.AbstractC0480b, java.util.List
    public ListIterator listIterator(int i3) {
        return new a(i3);
    }
}
