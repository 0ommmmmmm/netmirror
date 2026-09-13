package p075s2;

import E2.b;
import java.util.AbstractCollection;
import java.util.Collection;

/* JADX INFO: renamed from: s2.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0481c extends AbstractCollection implements Collection, b {
    protected AbstractC0481c() {
    }

    public abstract int a();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ int size() {
        return a();
    }
}
