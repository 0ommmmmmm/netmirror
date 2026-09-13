package p014d1;

import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.uimanager.ViewManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p015d2.b;

/* JADX INFO: renamed from: d1.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0457h implements O {

    /* JADX INFO: renamed from: d1.h$a */
    class a implements Iterator {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f9213b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f9214c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Map f9215d;

        a(List list, Map map) {
            this.f9214c = list;
            this.f9215d = map;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ModuleHolder next() {
            List list = this.f9214c;
            int i3 = this.f9213b;
            this.f9213b = i3 + 1;
            ModuleSpec moduleSpec = (ModuleSpec) list.get(i3);
            String name = moduleSpec.getName();
            ReactModuleInfo reactModuleInfo = (ReactModuleInfo) this.f9215d.get(name);
            if (reactModuleInfo != null) {
                return new ModuleHolder(reactModuleInfo, moduleSpec.getProvider());
            }
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_START, name);
            try {
                return new ModuleHolder((NativeModule) moduleSpec.getProvider().get());
            } finally {
                ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_END);
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f9213b < this.f9214c.size();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Cannot remove native modules from the list");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Iterator h(List list, Map map) {
        return new a(list, map);
    }

    Iterable b(ReactApplicationContext reactApplicationContext) {
        final Map mapA = d().a();
        final List listC = c(reactApplicationContext);
        return new Iterable() { // from class: d1.g
            @Override // java.lang.Iterable
            public final Iterator iterator() {
                return this.f9210b.h(listC, mapA);
            }
        };
    }

    protected abstract List c(ReactApplicationContext reactApplicationContext);

    public abstract p090w1.a d();

    @Override // p014d1.O
    public final List e(ReactApplicationContext reactApplicationContext) {
        ArrayList arrayList = new ArrayList();
        for (ModuleSpec moduleSpec : c(reactApplicationContext)) {
            b.a(0L, "createNativeModule").c();
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_START, moduleSpec.getName());
            try {
                NativeModule nativeModule = (NativeModule) moduleSpec.getProvider().get();
                ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_END);
                b.b(0L).c();
                arrayList.add(nativeModule);
            } catch (Throwable th) {
                ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_END);
                b.b(0L).c();
                throw th;
            }
        }
        return arrayList;
    }

    @Override // p014d1.O
    public List f(ReactApplicationContext reactApplicationContext) {
        List listG = g(reactApplicationContext);
        if (listG == null || listG.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = listG.iterator();
        while (it.hasNext()) {
            arrayList.add((ViewManager) ((ModuleSpec) it.next()).getProvider().get());
        }
        return arrayList;
    }

    public List g(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }
}
