package p093x0;

import X.k;
import X.n;
import android.content.Context;
import android.content.res.TypedArray;
import android.net.Uri;
import android.util.AttributeSet;
import p021f0.f;
import p065q0.b;
import p081u0.a;

/* JADX INFO: loaded from: classes.dex */
public class e extends d {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static n f10972j;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private b f10973i;

    public e(Context context, a aVar) {
        super(context, aVar);
        h(context, null);
    }

    private void h(Context context, AttributeSet attributeSet) {
        int resourceId;
        try {
            if (V0.b.d()) {
                V0.b.a("SimpleDraweeView#init");
            }
            if (isInEditMode()) {
                getTopLevelDrawable().setVisible(true, false);
                getTopLevelDrawable().invalidateSelf();
            } else {
                k.h(f10972j, "SimpleDraweeView was not initialized!");
                this.f10973i = (b) f10972j.get();
            }
            if (attributeSet != null) {
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p045l0.a.f9670E);
                try {
                    if (typedArrayObtainStyledAttributes.hasValue(p045l0.a.f9672G)) {
                        k(Uri.parse(typedArrayObtainStyledAttributes.getString(p045l0.a.f9672G)), null);
                    } else if (typedArrayObtainStyledAttributes.hasValue(p045l0.a.f9671F) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(p045l0.a.f9671F, -1)) != -1) {
                        if (isInEditMode()) {
                            setImageResource(resourceId);
                        } else {
                            setActualImageResource(resourceId);
                        }
                    }
                    typedArrayObtainStyledAttributes.recycle();
                } catch (Throwable th) {
                    typedArrayObtainStyledAttributes.recycle();
                    throw th;
                }
            }
            if (V0.b.d()) {
                V0.b.b();
            }
        } catch (Throwable th2) {
            if (V0.b.d()) {
                V0.b.b();
            }
            throw th2;
        }
    }

    public static void i(n nVar) {
        f10972j = nVar;
    }

    public b getControllerBuilder() {
        return this.f10973i;
    }

    public void j(int i3, Object obj) {
        k(f.g(i3), obj);
    }

    public void k(Uri uri, Object obj) {
        setController(this.f10973i.C(obj).c(uri).b(getController()).a());
    }

    public void l(String str, Object obj) {
        k(str != null ? Uri.parse(str) : null, obj);
    }

    public void setActualImageResource(int i3) {
        j(i3, null);
    }

    public void setImageRequest(U0.b bVar) {
        setController(this.f10973i.E(bVar).b(getController()).a());
    }

    @Override // p093x0.c, android.widget.ImageView
    public void setImageResource(int i3) {
        super.setImageResource(i3);
    }

    @Override // p093x0.c, android.widget.ImageView
    public void setImageURI(Uri uri) {
        k(uri, null);
    }

    public void setImageURI(String str) {
        l(str, null);
    }

    public e(Context context) {
        super(context);
        h(context, null);
    }

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        h(context, attributeSet);
    }

    public e(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        h(context, attributeSet);
    }

    public e(Context context, AttributeSet attributeSet, int i3, int i4) {
        super(context, attributeSet, i3, i4);
        h(context, attributeSet);
    }
}
