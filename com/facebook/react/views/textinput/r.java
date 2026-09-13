package com.facebook.react.views.textinput;

import android.text.SpannableStringBuilder;
import android.widget.EditText;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SpannableStringBuilder f8152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f8153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f8154c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f8155d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f8156e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f8157f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final CharSequence f8158g;

    public r(EditText editText) {
        this.f8152a = new SpannableStringBuilder(editText.getText());
        this.f8153b = editText.getTextSize();
        this.f8156e = editText.getInputType();
        this.f8158g = editText.getHint();
        this.f8154c = editText.getMinLines();
        this.f8155d = editText.getMaxLines();
        this.f8157f = editText.getBreakStrategy();
    }

    public void a(EditText editText) {
        editText.setText(this.f8152a);
        editText.setTextSize(0, this.f8153b);
        editText.setMinLines(this.f8154c);
        editText.setMaxLines(this.f8155d);
        editText.setInputType(this.f8156e);
        editText.setHint(this.f8158g);
        editText.setBreakStrategy(this.f8157f);
    }
}
