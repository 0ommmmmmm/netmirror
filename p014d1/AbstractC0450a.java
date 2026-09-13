package p014d1;

import D2.h;
import E2.a;
import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.uimanager.ViewManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import javax.inject.Provider;
import p075s2.AbstractC0492n;

/* JADX INFO: renamed from: d1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0450a implements O {

    /* JADX INFO: renamed from: d1.a$a, reason: collision with other inner class name */
    private final class C0123a implements Provider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f9163a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ReactApplicationContext f9164b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC0450a f9165c;

        public C0123a(AbstractC0450a abstractC0450a, String str, ReactApplicationContext reactApplicationContext) {
            h.f(str, "name");
            h.f(reactApplicationContext, "reactContext");
            this.f9165c = abstractC0450a;
            this.f9163a = str;
            this.f9164b = reactApplicationContext;
        }

        @Override // javax.inject.Provider
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return this.f9165c.g(this.f9163a, this.f9164b);
        }
    }

    /* JADX INFO: renamed from: d1.a$b */
    public static final class b implements Iterable, a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Iterator f9166b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC0450a f9167c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ReactApplicationContext f9168d;

        public b(Iterator it, AbstractC0450a abstractC0450a, ReactApplicationContext reactApplicationContext) {
            this.f9166b = it;
            this.f9167c = abstractC0450a;
            this.f9168d = reactApplicationContext;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return new c(this.f9166b, this.f9167c, this.f9168d);
        }
    }

    /* JADX INFO: renamed from: d1.a$c */
    public static final class c implements Iterator, a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Map.Entry f9169b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Iterator f9170c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ AbstractC0450a f9171d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ ReactApplicationContext f9172e;

        c(Iterator it, AbstractC0450a abstractC0450a, ReactApplicationContext reactApplicationContext) {
            this.f9170c = it;
            this.f9171d = abstractC0450a;
            this.f9172e = reactApplicationContext;
        }

        private final void a() {
            while (this.f9170c.hasNext()) {
                Map.Entry entry = (Map.Entry) this.f9170c.next();
                ReactModuleInfo reactModuleInfo = (ReactModuleInfo) entry.getValue();
                if (!p070r1.b.t() || !reactModuleInfo.e()) {
                    this.f9169b = entry;
                    return;
                }
            }
            this.f9169b = null;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ModuleHolder next() {
            if (this.f9169b == null) {
                a();
            }
            Map.Entry entry = this.f9169b;
            if (entry == null) {
                throw new NoSuchElementException("ModuleHolder not found");
            }
            a();
            return new ModuleHolder((ReactModuleInfo) entry.getValue(), new C0123a(this.f9171d, (String) entry.getKey(), this.f9172e));
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f9169b == null) {
                a();
            }
            return this.f9169b != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // p014d1.O
    public List e(ReactApplicationContext reactApplicationContext) {
        h.f(reactApplicationContext, "reactContext");
        throw new UnsupportedOperationException("createNativeModules method is not supported. Use getModule() method instead.");
    }

    @Override // p014d1.O
    public List f(ReactApplicationContext reactApplicationContext) {
        h.f(reactApplicationContext, "reactContext");
        List listJ = j(reactApplicationContext);
        if (listJ == null || listJ.isEmpty()) {
            return AbstractC0492n.g();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = listJ.iterator();
        while (it.hasNext()) {
            Object obj = ((ModuleSpec) it.next()).getProvider().get();
            h.d(obj, "null cannot be cast to non-null type com.facebook.react.uimanager.ViewManager<*, *>");
            arrayList.add((ViewManager) obj);
        }
        return arrayList;
    }

    public abstract NativeModule g(String str, ReactApplicationContext reactApplicationContext);

    public final Iterable h(ReactApplicationContext reactApplicationContext) {
        h.f(reactApplicationContext, "reactContext");
        return new b(i().a().entrySet().iterator(), this, reactApplicationContext);
    }

    public abstract p090w1.a i();

    protected List j(ReactApplicationContext reactApplicationContext) {
        h.f(reactApplicationContext, "reactContext");
        return AbstractC0492n.g();
    }
}
