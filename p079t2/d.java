package p079t2;

import D2.h;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class d extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f10811b;

    public d(c cVar) {
        h.f(cVar, "backing");
        this.f10811b = cVar;
    }

    @Override // p075s2.AbstractC0483e
    public int a() {
        return this.f10811b.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection collection) {
        h.f(collection, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // p079t2.a
    public boolean c(Map.Entry entry) {
        h.f(entry, "element");
        return this.f10811b.p(entry);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f10811b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        h.f(collection, "elements");
        return this.f10811b.o(collection);
    }

    @Override // p079t2.a
    public boolean e(Map.Entry entry) {
        h.f(entry, "element");
        return this.f10811b.J(entry);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean add(Map.Entry entry) {
        h.f(entry, "element");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f10811b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return this.f10811b.t();
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        h.f(collection, "elements");
        this.f10811b.m();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        h.f(collection, "elements");
        this.f10811b.m();
        return super.retainAll(collection);
    }
}
