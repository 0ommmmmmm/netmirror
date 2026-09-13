package p023f2;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
final class j implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f9411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h.a f9412c;

    j(h hVar, h.a aVar) {
        this.f9411b = hVar;
        this.f9412c = aVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        h.a aVar = this.f9412c;
        if (aVar == null) {
            return;
        }
        aVar.a(this.f9411b, view);
    }
}
