package com.facebook.react.views.progressbar;

import D2.h;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p014d1.AbstractC0462m;

/* JADX INFO: loaded from: classes.dex */
public final class a extends FrameLayout {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final C0114a f7738g = new C0114a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f7739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f7740c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f7741d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private double f7742e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ProgressBar f7743f;

    /* JADX INFO: renamed from: com.facebook.react.views.progressbar.a$a, reason: collision with other inner class name */
    private static final class C0114a {
        public /* synthetic */ C0114a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0114a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(context);
        h.f(context, "context");
        this.f7740c = true;
        this.f7741d = true;
    }

    private final void setColor(ProgressBar progressBar) {
        Drawable indeterminateDrawable = progressBar.isIndeterminate() ? progressBar.getIndeterminateDrawable() : progressBar.getProgressDrawable();
        if (indeterminateDrawable == null) {
            return;
        }
        Integer num = this.f7739b;
        if (num != null) {
            indeterminateDrawable.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        } else {
            indeterminateDrawable.clearColorFilter();
        }
    }

    public final void a() {
        ProgressBar progressBar = this.f7743f;
        if (progressBar == null) {
            throw new JSApplicationIllegalArgumentException("setStyle() not called");
        }
        progressBar.setIndeterminate(this.f7740c);
        setColor(progressBar);
        progressBar.setProgress((int) (this.f7742e * ((double) 1000)));
        progressBar.setVisibility(this.f7741d ? 0 : 4);
    }

    public final boolean getAnimating$ReactAndroid_release() {
        return this.f7741d;
    }

    public final Integer getColor$ReactAndroid_release() {
        return this.f7739b;
    }

    public final boolean getIndeterminate$ReactAndroid_release() {
        return this.f7740c;
    }

    public final double getProgress$ReactAndroid_release() {
        return this.f7742e;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        h.f(accessibilityNodeInfo, "info");
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String str = (String) getTag(AbstractC0462m.f9248t);
        if (str != null) {
            accessibilityNodeInfo.setViewIdResourceName(str);
        }
    }

    public final void setAnimating$ReactAndroid_release(boolean z3) {
        this.f7741d = z3;
    }

    public final void setColor$ReactAndroid_release(Integer num) {
        this.f7739b = num;
    }

    public final void setIndeterminate$ReactAndroid_release(boolean z3) {
        this.f7740c = z3;
    }

    public final void setProgress$ReactAndroid_release(double d4) {
        this.f7742e = d4;
    }

    public final void setStyle$ReactAndroid_release(String str) {
        ReactProgressBarViewManager.a aVar = ReactProgressBarViewManager.Companion;
        ProgressBar progressBarA = aVar.a(getContext(), aVar.b(str));
        progressBarA.setMax(1000);
        this.f7743f = progressBarA;
        removeAllViews();
        addView(this.f7743f, new ViewGroup.LayoutParams(-1, -1));
    }
}
