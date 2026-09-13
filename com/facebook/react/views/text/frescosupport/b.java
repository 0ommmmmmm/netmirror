package com.facebook.react.views.text.frescosupport;

import U0.c;
import Z1.p;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.TextView;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.C0392f0;
import com.facebook.react.views.image.d;
import p064q.g;

/* JADX INFO: loaded from: classes.dex */
class b extends p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Drawable f7959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p065q0.b f7960c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p093x0.b f7961d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f7962e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f7963f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f7964g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Uri f7965h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f7966i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ReadableMap f7967j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f7968k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private TextView f7969l;

    public b(Resources resources, int i3, int i4, int i5, Uri uri, ReadableMap readableMap, p065q0.b bVar, Object obj, String str) {
        this.f7961d = new p093x0.b(p081u0.b.u(resources).a());
        this.f7960c = bVar;
        this.f7962e = obj;
        this.f7964g = i5;
        this.f7965h = uri == null ? Uri.EMPTY : uri;
        this.f7967j = readableMap;
        this.f7966i = (int) C0392f0.h(i4);
        this.f7963f = (int) C0392f0.h(i3);
        this.f7968k = str;
    }

    @Override // Z1.p
    public Drawable a() {
        return this.f7959b;
    }

    @Override // Z1.p
    public int b() {
        return this.f7963f;
    }

    @Override // Z1.p
    public void c() {
        this.f7961d.j();
    }

    @Override // Z1.p
    public void d() {
        this.f7961d.k();
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i3, int i4, float f3, int i5, int i6, int i7, Paint paint) {
        if (this.f7959b == null) {
            E1.b bVarA = E1.b.A(c.x(this.f7965h), this.f7967j);
            ((p081u0.a) this.f7961d.f()).v(d.c(this.f7968k));
            this.f7960c.A();
            this.f7960c.b(this.f7961d.e());
            Object obj = this.f7962e;
            if (obj != null) {
                this.f7960c.C(obj);
            }
            this.f7960c.E(bVarA);
            this.f7961d.o(this.f7960c.a());
            this.f7960c.A();
            Drawable drawable = (Drawable) g.g(this.f7961d.g());
            this.f7959b = drawable;
            drawable.setBounds(0, 0, this.f7966i, this.f7963f);
            int i8 = this.f7964g;
            if (i8 != 0) {
                this.f7959b.setColorFilter(i8, PorterDuff.Mode.SRC_IN);
            }
            this.f7959b.setCallback(this.f7969l);
        }
        canvas.save();
        canvas.translate(f3, ((i6 + ((int) paint.descent())) - (((int) (paint.descent() - paint.ascent())) / 2)) - ((this.f7959b.getBounds().bottom - this.f7959b.getBounds().top) / 2));
        this.f7959b.draw(canvas);
        canvas.restore();
    }

    @Override // Z1.p
    public void e() {
        this.f7961d.j();
    }

    @Override // Z1.p
    public void f() {
        this.f7961d.k();
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt != null) {
            int i5 = -this.f7963f;
            fontMetricsInt.ascent = i5;
            fontMetricsInt.descent = 0;
            fontMetricsInt.top = i5;
            fontMetricsInt.bottom = 0;
        }
        return this.f7966i;
    }

    @Override // Z1.p
    public void h(TextView textView) {
        this.f7969l = textView;
    }
}
