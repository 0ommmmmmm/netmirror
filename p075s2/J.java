package p075s2;

import D2.h;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
final class J extends AbstractC0482d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f10613b;

    public static final class a implements ListIterator, E2.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ListIterator f10614b;

        a(int i3) {
            this.f10614b = J.this.f10613b.listIterator(v.F(J.this, i3));
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            this.f10614b.add(obj);
            this.f10614b.previous();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f10614b.hasPrevious();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f10614b.hasNext();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            return this.f10614b.previous();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return v.E(J.this, this.f10614b.previousIndex());
        }

        @Override // java.util.ListIterator
        public Object previous() {
            return this.f10614b.next();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return v.E(J.this, this.f10614b.nextIndex());
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            this.f10614b.remove();
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            this.f10614b.set(obj);
        }
    }

    public J(List<Object> list) {
        h.f(list, "delegate");
        this.f10613b = list;
    }

    @Override // p075s2.AbstractC0482d
    public int a() {
        return this.f10613b.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i3, Object obj) {
        this.f10613b.add(v.F(this, i3), obj);
    }

    @Override // p075s2.AbstractC0482d
    public Object b(int i3) {
        return this.f10613b.remove(v.D(this, i3));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f10613b.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i3) {
        return this.f10613b.get(v.D(this, i3));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i3, Object obj) {
        return this.f10613b.set(v.D(this, i3), obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator(int i3) {
        return new a(i3);
    }
}
