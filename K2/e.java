package K2;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
final class e implements J2.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CharSequence f824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f826c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C2.p f827d;

    public static final class a implements Iterator, E2.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f828b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f829c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f830d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private H2.c f831e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f832f;

        a() {
            int iF = H2.d.f(e.this.f825b, 0, e.this.f824a.length());
            this.f829c = iF;
            this.f830d = iF;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0031 A[ADDED_TO_REGION, REMOVE] */
        /* JADX WARN: Code duplicated, block: B:17:0x0098  */
        /* JADX WARN: Code duplicated, block: B:9:0x0023  */
        private final void a() {
            p071r2.i iVar;
            if (this.f830d < 0) {
                this.f828b = 0;
                this.f831e = null;
                return;
            }
            if (e.this.f826c > 0) {
                int i3 = this.f832f + 1;
                this.f832f = i3;
                if (i3 >= e.this.f826c) {
                    this.f831e = new H2.c(this.f829c, y.I(e.this.f824a));
                    this.f830d = -1;
                } else if (this.f830d > e.this.f824a.length() && (iVar = (p071r2.i) e.this.f827d.b(e.this.f824a, Integer.valueOf(this.f830d))) != null) {
                    int iIntValue = ((Number) iVar.a()).intValue();
                    int iIntValue2 = ((Number) iVar.b()).intValue();
                    this.f831e = H2.d.i(this.f829c, iIntValue);
                    int i4 = iIntValue + iIntValue2;
                    this.f829c = i4;
                    this.f830d = i4 + (iIntValue2 == 0 ? 1 : 0);
                } else {
                    this.f831e = new H2.c(this.f829c, y.I(e.this.f824a));
                    this.f830d = -1;
                }
            } else if (this.f830d > e.this.f824a.length()) {
                this.f831e = new H2.c(this.f829c, y.I(e.this.f824a));
                this.f830d = -1;
            } else {
                int iIntValue3 = ((Number) iVar.a()).intValue();
                int iIntValue4 = ((Number) iVar.b()).intValue();
                this.f831e = H2.d.i(this.f829c, iIntValue3);
                int i5 = iIntValue3 + iIntValue4;
                this.f829c = i5;
                this.f830d = i5 + (iIntValue4 == 0 ? 1 : 0);
            }
            this.f828b = 1;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public H2.c next() {
            if (this.f828b == -1) {
                a();
            }
            if (this.f828b == 0) {
                throw new NoSuchElementException();
            }
            H2.c cVar = this.f831e;
            D2.h.d(cVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
            this.f831e = null;
            this.f828b = -1;
            return cVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f828b == -1) {
                a();
            }
            return this.f828b == 1;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public e(CharSequence charSequence, int i3, int i4, C2.p pVar) {
        D2.h.f(charSequence, "input");
        D2.h.f(pVar, "getNextMatch");
        this.f824a = charSequence;
        this.f825b = i3;
        this.f826c = i4;
        this.f827d = pVar;
    }

    @Override // J2.c
    public Iterator iterator() {
        return new a();
    }
}
