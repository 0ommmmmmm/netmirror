package S0;

import R0.D;
import R0.i;
import android.os.Build;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f2309a = new g();

    private g() {
    }

    public static final f a(D d4, boolean z3, boolean z4, h hVar) {
        D2.h.f(d4, "poolFactory");
        D2.h.f(hVar, "platformDecoderOptions");
        if (Build.VERSION.SDK_INT >= 26) {
            i iVarB = d4.b();
            D2.h.e(iVarB, "getBitmapPool(...)");
            return new e(iVarB, b(d4, z4), hVar);
        }
        i iVarB2 = d4.b();
        D2.h.e(iVarB2, "getBitmapPool(...)");
        return new a(iVarB2, b(d4, z4), hVar);
    }

    public static final p064q.e b(D d4, boolean z3) {
        D2.h.f(d4, "poolFactory");
        if (z3) {
            p001a0.b bVar = p001a0.b.f2850a;
            D2.h.e(bVar, "INSTANCE");
            return bVar;
        }
        int iD = d4.d();
        p064q.f fVar = new p064q.f(iD);
        for (int i3 = 0; i3 < iD; i3++) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(p001a0.b.e());
            D2.h.e(byteBufferAllocate, "allocate(...)");
            fVar.a(byteBufferAllocate);
        }
        return fVar;
    }
}
