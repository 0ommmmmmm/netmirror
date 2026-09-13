package com.facebook.imagepipeline.memory;

import R0.E;
import R0.F;
import R0.z;
import X.k;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p005b0.h f5935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final b f5936b;

    class a implements p005b0.h {
        a() {
        }

        @Override // p005b0.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(byte[] bArr) {
            d.this.b(bArr);
        }
    }

    static class b extends e {
        public b(p001a0.d dVar, E e4, F f3) {
            super(dVar, e4, f3);
        }

        @Override // com.facebook.imagepipeline.memory.a
        com.facebook.imagepipeline.memory.b w(int i3) {
            return new h(o(i3), this.f5920c.f1952g, 0);
        }
    }

    public d(p001a0.d dVar, E e4) {
        k.b(Boolean.valueOf(e4.f1952g > 0));
        this.f5936b = new b(dVar, e4, z.h());
        this.f5935a = new a();
    }

    public p005b0.a a(int i3) {
        return p005b0.a.n0((byte[]) this.f5936b.get(i3), this.f5935a);
    }

    public void b(byte[] bArr) {
        this.f5936b.a(bArr);
    }
}
