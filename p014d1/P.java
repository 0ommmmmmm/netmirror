package p014d1;

import D2.h;
import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final P f9153a = new P();

    public static final class a implements Iterable, E2.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f9154b;

        public a(List list) {
            this.f9154b = list;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return new b(this.f9154b);
        }
    }

    public static final class b implements Iterator, E2.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f9155b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f9156c;

        b(List list) {
            this.f9156c = list;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ModuleHolder next() {
            List list = this.f9156c;
            int i3 = this.f9155b;
            this.f9155b = i3 + 1;
            return new ModuleHolder((NativeModule) list.get(i3));
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f9155b < this.f9156c.size();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private P() {
    }

    public final Iterable a(O o3, ReactApplicationContext reactApplicationContext) {
        h.f(o3, "reactPackage");
        h.f(reactApplicationContext, "reactApplicationContext");
        Y.a.b("ReactNative", o3.getClass().getSimpleName() + " is not a LazyReactPackage, falling back to old version.");
        return new a(o3.e(reactApplicationContext));
    }
}
