package p040k;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class a extends b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashMap f9565f = new HashMap();

    @Override // p040k.b
    protected b.c c(Object obj) {
        return (b.c) this.f9565f.get(obj);
    }

    public boolean contains(Object obj) {
        return this.f9565f.containsKey(obj);
    }

    @Override // p040k.b
    public Object i(Object obj, Object obj2) {
        b.c cVarC = c(obj);
        if (cVarC != null) {
            return cVarC.f9571c;
        }
        this.f9565f.put(obj, h(obj, obj2));
        return null;
    }

    @Override // p040k.b
    public Object j(Object obj) {
        Object objJ = super.j(obj);
        this.f9565f.remove(obj);
        return objJ;
    }

    public Map.Entry k(Object obj) {
        if (contains(obj)) {
            return ((b.c) this.f9565f.get(obj)).f9573e;
        }
        return null;
    }
}
