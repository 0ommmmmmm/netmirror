package p093x0;

import V0.b;
import android.content.Context;
import android.util.AttributeSet;
import p081u0.a;
import p081u0.c;

/* JADX INFO: loaded from: classes.dex */
public class d extends c {
    public d(Context context, a aVar) {
        super(context);
        setHierarchy(aVar);
    }

    protected void g(Context context, AttributeSet attributeSet) throws Throwable {
        if (b.d()) {
            b.a("GenericDraweeView#inflateHierarchy");
        }
        p081u0.b bVarD = c.d(context, attributeSet);
        setAspectRatio(bVarD.f());
        setHierarchy(bVarD.a());
        if (b.d()) {
            b.b();
        }
    }

    public d(Context context) throws Throwable {
        super(context);
        g(context, null);
    }

    public d(Context context, AttributeSet attributeSet) throws Throwable {
        super(context, attributeSet);
        g(context, attributeSet);
    }

    public d(Context context, AttributeSet attributeSet, int i3) throws Throwable {
        super(context, attributeSet, i3);
        g(context, attributeSet);
    }

    public d(Context context, AttributeSet attributeSet, int i3, int i4) throws Throwable {
        super(context, attributeSet, i3, i4);
        g(context, attributeSet);
    }
}
