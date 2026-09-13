package com.facebook.hermes.intl;

import android.icu.text.MeasureFormat;
import java.text.AttributedCharacterIterator;

/* JADX INFO: loaded from: classes.dex */
public interface c {

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f5855a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f5856b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f5857c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final /* synthetic */ int[] f5858d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final /* synthetic */ int[] f5859e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static final /* synthetic */ int[] f5860f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        static final /* synthetic */ int[] f5861g;

        static {
            int[] iArr = new int[d.values().length];
            f5861g = iArr;
            try {
                iArr[d.ACCOUNTING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5861g[d.STANDARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[EnumC0091c.values().length];
            f5860f = iArr2;
            try {
                iArr2[EnumC0091c.SYMBOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5860f[EnumC0091c.NARROWSYMBOL.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f5860f[EnumC0091c.CODE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f5860f[EnumC0091c.NAME.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[i.values().length];
            f5859e = iArr3;
            try {
                iArr3[i.SHORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f5859e[i.NARROW.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f5859e[i.LONG.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr4 = new int[g.values().length];
            f5858d = iArr4;
            try {
                iArr4[g.AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f5858d[g.ALWAYS.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f5858d[g.NEVER.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f5858d[g.EXCEPTZERO.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            int[] iArr5 = new int[b.values().length];
            f5857c = iArr5;
            try {
                iArr5[b.SHORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f5857c[b.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            int[] iArr6 = new int[e.values().length];
            f5856b = iArr6;
            try {
                iArr6[e.STANDARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f5856b[e.SCIENTIFIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f5856b[e.ENGINEERING.ordinal()] = 3;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f5856b[e.COMPACT.ordinal()] = 4;
            } catch (NoSuchFieldError unused19) {
            }
            int[] iArr7 = new int[h.values().length];
            f5855a = iArr7;
            try {
                iArr7[h.DECIMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f5855a[h.PERCENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f5855a[h.CURRENCY.ordinal()] = 3;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f5855a[h.UNIT.ordinal()] = 4;
            } catch (NoSuchFieldError unused23) {
            }
        }
    }

    public enum b {
        SHORT,
        LONG;

        @Override // java.lang.Enum
        public String toString() {
            int i3 = a.f5857c[ordinal()];
            if (i3 == 1) {
                return "short";
            }
            if (i3 == 2) {
                return "long";
            }
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: com.facebook.hermes.intl.c$c, reason: collision with other inner class name */
    public enum EnumC0091c {
        SYMBOL,
        NARROWSYMBOL,
        CODE,
        NAME;

        public int b() {
            return a.f5860f[ordinal()] != 4 ? 0 : 1;
        }

        @Override // java.lang.Enum
        public String toString() {
            int i3 = a.f5860f[ordinal()];
            if (i3 == 1) {
                return "symbol";
            }
            if (i3 == 2) {
                return "narrowSymbol";
            }
            if (i3 == 3) {
                return "code";
            }
            if (i3 == 4) {
                return "name";
            }
            throw new IllegalArgumentException();
        }
    }

    public enum d {
        STANDARD,
        ACCOUNTING;

        @Override // java.lang.Enum
        public String toString() {
            int i3 = a.f5861g[ordinal()];
            if (i3 == 1) {
                return "accounting";
            }
            if (i3 == 2) {
                return "standard";
            }
            throw new IllegalArgumentException();
        }
    }

    public enum e {
        STANDARD,
        SCIENTIFIC,
        ENGINEERING,
        COMPACT;

        @Override // java.lang.Enum
        public String toString() {
            int i3 = a.f5856b[ordinal()];
            if (i3 == 1) {
                return "standard";
            }
            if (i3 == 2) {
                return "scientific";
            }
            if (i3 == 3) {
                return "engineering";
            }
            if (i3 == 4) {
                return "compact";
            }
            throw new IllegalArgumentException();
        }
    }

    public enum f {
        SIGNIFICANT_DIGITS,
        FRACTION_DIGITS,
        COMPACT_ROUNDING
    }

    public enum g {
        AUTO,
        ALWAYS,
        NEVER,
        EXCEPTZERO;

        @Override // java.lang.Enum
        public String toString() {
            int i3 = a.f5858d[ordinal()];
            if (i3 == 1) {
                return "auto";
            }
            if (i3 == 2) {
                return "always";
            }
            if (i3 == 3) {
                return "never";
            }
            if (i3 == 4) {
                return "exceptZero";
            }
            throw new IllegalArgumentException();
        }
    }

    public enum h {
        DECIMAL,
        PERCENT,
        CURRENCY,
        UNIT;

        public int b(e eVar, d dVar) throws B0.e {
            int i3 = a.f5855a[ordinal()];
            if (i3 == 2) {
                return 2;
            }
            if (i3 != 3) {
                return (eVar == e.SCIENTIFIC || eVar == e.ENGINEERING) ? 3 : 0;
            }
            if (dVar == d.ACCOUNTING) {
                return 7;
            }
            if (dVar == d.STANDARD) {
                return 1;
            }
            throw new B0.e("Unrecognized formatting style requested.");
        }

        @Override // java.lang.Enum
        public String toString() {
            int i3 = a.f5855a[ordinal()];
            if (i3 == 1) {
                return "decimal";
            }
            if (i3 == 2) {
                return "percent";
            }
            if (i3 == 3) {
                return "currency";
            }
            if (i3 == 4) {
                return "unit";
            }
            throw new IllegalArgumentException();
        }
    }

    public enum i {
        SHORT,
        NARROW,
        LONG;

        public MeasureFormat.FormatWidth b() {
            int i3 = a.f5859e[ordinal()];
            if (i3 != 2) {
                return i3 != 3 ? MeasureFormat.FormatWidth.SHORT : MeasureFormat.FormatWidth.WIDE;
            }
            return MeasureFormat.FormatWidth.NARROW;
        }

        @Override // java.lang.Enum
        public String toString() {
            int i3 = a.f5859e[ordinal()];
            if (i3 == 1) {
                return "short";
            }
            if (i3 == 2) {
                return "narrow";
            }
            if (i3 == 3) {
                return "long";
            }
            throw new IllegalArgumentException();
        }
    }

    AttributedCharacterIterator a(double d4);

    String b(double d4);

    String c(B0.b bVar);

    c d(f fVar, int i3, int i4);

    String e(AttributedCharacterIterator.Attribute attribute, double d4);

    c f(String str, i iVar);

    c g(B0.b bVar, String str, h hVar, d dVar, e eVar, b bVar2);

    c h(g gVar);

    c i(int i3);

    c j(String str, EnumC0091c enumC0091c);

    c k(boolean z3);

    c l(f fVar, int i3, int i4);
}
