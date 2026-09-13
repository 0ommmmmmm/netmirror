package p079t2;

import D2.h;
import E2.b;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p075s2.AbstractC0483e;

/* JADX INFO: loaded from: classes.dex */
public final class e extends AbstractC0483e implements Set, b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f10812b;

    public e(c cVar) {
        h.f(cVar, "backing");
        this.f10812b = cVar;
    }

    @Override // p075s2.AbstractC0483e
    public int a() {
        return this.f10812b.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection collection) {
        h.f(collection, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f10812b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f10812b.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f10812b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return this.f10812b.D();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        return this.f10812b.M(obj);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        h.f(collection, "elements");
        this.f10812b.m();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        h.f(collection, "elements");
        this.f10812b.m();
        return super.retainAll(collection);
    }
}
