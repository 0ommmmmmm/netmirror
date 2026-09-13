package p075s2;

import E2.b;
import java.util.AbstractSet;
import java.util.Set;

/* JADX INFO: renamed from: s2.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0483e extends AbstractSet implements Set, b {
    protected AbstractC0483e() {
    }

    public abstract int a();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return a();
    }
}
