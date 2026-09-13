package androidx.lifecycle;

import android.os.Bundle;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class LegacySavedStateHandleController {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LegacySavedStateHandleController f5282a = new LegacySavedStateHandleController();

    public static final class a implements androidx.savedstate.a.InterfaceC0083a {
        @Override // androidx.savedstate.a.InterfaceC0083a
        public void a(G.d dVar) {
            D2.h.f(dVar, "owner");
            if (!(dVar instanceof H)) {
                throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
            }
            G gS = ((H) dVar).s();
            androidx.savedstate.a aVarB = dVar.b();
            Iterator it = gS.c().iterator();
            while (it.hasNext()) {
                D dB = gS.b((String) it.next());
                D2.h.c(dB);
                LegacySavedStateHandleController.a(dB, aVarB, dVar.t());
            }
            if (gS.c().isEmpty()) {
                return;
            }
            aVarB.i(a.class);
        }
    }

    private LegacySavedStateHandleController() {
    }

    public static final void a(D d4, androidx.savedstate.a aVar, AbstractC0292g abstractC0292g) {
        D2.h.f(d4, "viewModel");
        D2.h.f(aVar, "registry");
        D2.h.f(abstractC0292g, "lifecycle");
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) d4.c("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController == null || savedStateHandleController.j()) {
            return;
        }
        savedStateHandleController.h(aVar, abstractC0292g);
        f5282a.c(aVar, abstractC0292g);
    }

    public static final SavedStateHandleController b(androidx.savedstate.a aVar, AbstractC0292g abstractC0292g, String str, Bundle bundle) {
        D2.h.f(aVar, "registry");
        D2.h.f(abstractC0292g, "lifecycle");
        D2.h.c(str);
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, x.f5361f.a(aVar.b(str), bundle));
        savedStateHandleController.h(aVar, abstractC0292g);
        f5282a.c(aVar, abstractC0292g);
        return savedStateHandleController;
    }

    private final void c(final androidx.savedstate.a aVar, final AbstractC0292g abstractC0292g) {
        AbstractC0292g.b bVarB = abstractC0292g.b();
        if (bVarB == AbstractC0292g.b.INITIALIZED || bVarB.b(AbstractC0292g.b.STARTED)) {
            aVar.i(a.class);
        } else {
            abstractC0292g.a(new InterfaceC0295j() { // from class: androidx.lifecycle.LegacySavedStateHandleController$tryToAddRecreator$1
                @Override // androidx.lifecycle.InterfaceC0295j
                public void d(l lVar, AbstractC0292g.a aVar2) {
                    D2.h.f(lVar, "source");
                    D2.h.f(aVar2, "event");
                    if (aVar2 == AbstractC0292g.a.ON_START) {
                        abstractC0292g.c(this);
                        aVar.i(LegacySavedStateHandleController.a.class);
                    }
                }
            });
        }
    }
}
