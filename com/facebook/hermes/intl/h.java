package com.facebook.hermes.intl;

import android.icu.text.RuleBasedCollator;

/* JADX INFO: loaded from: classes.dex */
public class h implements com.facebook.hermes.intl.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private RuleBasedCollator f5901a = null;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f5902a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f5903b;

        static {
            int[] iArr = new int[com.facebook.hermes.intl.a.b.values().length];
            f5903b = iArr;
            try {
                iArr[com.facebook.hermes.intl.a.b.UPPER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5903b[com.facebook.hermes.intl.a.b.LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5903b[com.facebook.hermes.intl.a.b.FALSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[com.facebook.hermes.intl.a.c.values().length];
            f5902a = iArr2;
            try {
                iArr2[com.facebook.hermes.intl.a.c.BASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f5902a[com.facebook.hermes.intl.a.c.ACCENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f5902a[com.facebook.hermes.intl.a.c.CASE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f5902a[com.facebook.hermes.intl.a.c.VARIANT.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    h() {
    }

    @Override // com.facebook.hermes.intl.a
    public com.facebook.hermes.intl.a a(com.facebook.hermes.intl.a.b bVar) {
        int i3 = a.f5903b[bVar.ordinal()];
        if (i3 == 1) {
            this.f5901a.setUpperCaseFirst(true);
        } else if (i3 != 2) {
            this.f5901a.setCaseFirstDefault();
        } else {
            this.f5901a.setLowerCaseFirst(true);
        }
        return this;
    }

    @Override // com.facebook.hermes.intl.a
    public com.facebook.hermes.intl.a b(B0.b bVar) {
        RuleBasedCollator ruleBasedCollator = (RuleBasedCollator) android.icu.text.Collator.getInstance(((B0.g) bVar).h());
        this.f5901a = ruleBasedCollator;
        ruleBasedCollator.setDecomposition(17);
        return this;
    }

    @Override // com.facebook.hermes.intl.a
    public com.facebook.hermes.intl.a c(boolean z3) {
        if (z3) {
            this.f5901a.setNumericCollation(B0.d.e(Boolean.TRUE));
        }
        return this;
    }

    @Override // com.facebook.hermes.intl.a
    public int d(String str, String str2) {
        return this.f5901a.compare(str, str2);
    }

    @Override // com.facebook.hermes.intl.a
    public com.facebook.hermes.intl.a e(com.facebook.hermes.intl.a.c cVar) {
        int i3 = a.f5902a[cVar.ordinal()];
        if (i3 == 1) {
            this.f5901a.setStrength(0);
        } else if (i3 == 2) {
            this.f5901a.setStrength(1);
        } else if (i3 == 3) {
            this.f5901a.setStrength(0);
            this.f5901a.setCaseLevel(true);
        } else if (i3 == 4) {
            this.f5901a.setStrength(2);
        }
        return this;
    }

    @Override // com.facebook.hermes.intl.a
    public com.facebook.hermes.intl.a.c f() {
        RuleBasedCollator ruleBasedCollator = this.f5901a;
        if (ruleBasedCollator == null) {
            return com.facebook.hermes.intl.a.c.LOCALE;
        }
        int strength = ruleBasedCollator.getStrength();
        if (strength == 0) {
            return this.f5901a.isCaseLevel() ? com.facebook.hermes.intl.a.c.CASE : com.facebook.hermes.intl.a.c.BASE;
        }
        return strength == 1 ? com.facebook.hermes.intl.a.c.ACCENT : com.facebook.hermes.intl.a.c.VARIANT;
    }

    @Override // com.facebook.hermes.intl.a
    public com.facebook.hermes.intl.a g(boolean z3) {
        if (z3) {
            this.f5901a.setAlternateHandlingShifted(true);
        }
        return this;
    }
}
