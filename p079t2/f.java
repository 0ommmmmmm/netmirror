package p079t2;

import D2.h;
import E2.b;
import java.util.Collection;
import java.util.Iterator;
import p075s2.AbstractC0481c;

/* JADX INFO: loaded from: classes.dex */
public final class f extends AbstractC0481c implements Collection, b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f10813b;

    public f(c cVar) {
        h.f(cVar, "backing");
        this.f10813b = cVar;
    }

    @Override // p075s2.AbstractC0481c
    public int a() {
        return this.f10813b.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection collection) {
        h.f(collection, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f10813b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f10813b.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.f10813b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return this.f10813b.P();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        return this.f10813b.N(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        h.f(collection, "elements");
        this.f10813b.m();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        h.f(collection, "elements");
        this.f10813b.m();
        return super.retainAll(collection);
    }
}
