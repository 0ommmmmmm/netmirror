package p068r;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f10449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v f10450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f10451c;

    public a(int i3, v vVar, int i4) {
        this.f10449a = i3;
        this.f10450b = vVar;
        this.f10451c = i4;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f10449a);
        this.f10450b.f0(this.f10451c, bundle);
    }
}
