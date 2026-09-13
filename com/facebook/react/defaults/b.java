package com.facebook.react.defaults;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p014d1.AbstractActivityC0467s;
import p014d1.C0471w;

/* JADX INFO: loaded from: classes.dex */
public class b extends C0471w {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f6569f;

    public /* synthetic */ b(AbstractActivityC0467s abstractActivityC0467s, String str, boolean z3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractActivityC0467s, str, (i3 & 4) != 0 ? false : z3);
    }

    @Override // p014d1.C0471w
    protected boolean k() {
        return this.f6569f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(AbstractActivityC0467s abstractActivityC0467s, String str, boolean z3) {
        super(abstractActivityC0467s, str);
        D2.h.f(abstractActivityC0467s, "activity");
        D2.h.f(str, "mainComponentName");
        this.f6569f = z3;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(AbstractActivityC0467s abstractActivityC0467s, String str, boolean z3, boolean z4) {
        this(abstractActivityC0467s, str, z3);
        D2.h.f(abstractActivityC0467s, "activity");
        D2.h.f(str, "mainComponentName");
    }
}
