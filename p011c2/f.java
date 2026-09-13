package p011c2;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public class f implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f5694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f5695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f5696c;

    public f(Context context, int i3) {
        this.f5694a = context;
        this.f5696c = i3;
        a aVar = new a(5);
        this.f5695b = aVar;
        aVar.a(context.getApplicationInfo().sourceDir);
    }

    @Override // p011c2.i
    public h get() {
        return new e(new g(this.f5694a, this.f5695b), new b(this.f5694a, this.f5695b), new l(), new c(this.f5694a), new j(this.f5696c), new d(), new k(), new l());
    }
}
