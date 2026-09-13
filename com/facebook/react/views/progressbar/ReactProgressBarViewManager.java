package com.facebook.react.views.progressbar;

import D2.h;
import U1.e;
import U1.f;
import android.R;
import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.widget.ProgressBar;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.B0;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.C0392f0;
import com.facebook.react.uimanager.Q0;
import com.facebook.yoga.p;
import com.facebook.yoga.q;
import java.util.WeakHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@p086v1.a(name = ReactProgressBarViewManager.REACT_CLASS)
public final class ReactProgressBarViewManager extends BaseViewManager<com.facebook.react.views.progressbar.a, b> implements f {
    public static final String DEFAULT_STYLE = "Normal";
    public static final String PROP_ANIMATING = "animating";
    public static final String PROP_ATTR = "typeAttr";
    public static final String PROP_INDETERMINATE = "indeterminate";
    public static final String PROP_PROGRESS = "progress";
    public static final String PROP_STYLE = "styleAttr";
    public static final String REACT_CLASS = "AndroidProgressBar";
    public static final a Companion = new a(null);
    private static final Object progressBarCtorLock = new Object();
    private final WeakHashMap<Integer, Pair<Integer, Integer>> measuredStyles = new WeakHashMap<>();
    private final Q0 delegate = new e(this);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ProgressBar a(Context context, int i3) {
            ProgressBar progressBar;
            synchronized (ReactProgressBarViewManager.progressBarCtorLock) {
                progressBar = new ProgressBar(context, null, i3);
            }
            return progressBar;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:39:0x0065  */
        /* JADX WARN: Instruction removed from duplicated block: B:39:0x0065, please report this as an issue */
        public final int b(String str) {
            if (str == null) {
                Y.a.I("ReactNative", "ProgressBar needs to have a style, null received");
                return R.attr.progressBarStyle;
            }
            switch (str) {
                case "Normal":
                    if (!str.equals(ReactProgressBarViewManager.DEFAULT_STYLE)) {
                        Y.a.I("ReactNative", "Unknown ProgressBar style: " + str);
                    }
                    return R.attr.progressBarStyle;
                case "SmallInverse":
                    return R.attr.progressBarStyleSmallInverse;
                case "Horizontal":
                    return R.attr.progressBarStyleHorizontal;
                case "Inverse":
                    return R.attr.progressBarStyleInverse;
                case "LargeInverse":
                    return R.attr.progressBarStyleLargeInverse;
                case "Large":
                    return R.attr.progressBarStyleLarge;
                case "Small":
                    return R.attr.progressBarStyleSmall;
                default:
                    Y.a.I("ReactNative", "Unknown ProgressBar style: " + str);
            }
        }

        private a() {
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    protected Q0 getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<b> getShadowNodeClass() {
        return b.class;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public long measure(Context context, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, float f3, p pVar, float f4, p pVar2, float[] fArr) {
        h.f(context, "context");
        h.f(readableMap, "localData");
        h.f(readableMap2, "props");
        h.f(readableMap3, "state");
        h.f(pVar, "widthMode");
        h.f(pVar2, "heightMode");
        a aVar = Companion;
        int iB = aVar.b(readableMap2.getString(PROP_STYLE));
        WeakHashMap<Integer, Pair<Integer, Integer>> weakHashMap = this.measuredStyles;
        Integer numValueOf = Integer.valueOf(iB);
        Pair<Integer, Integer> pairCreate = weakHashMap.get(numValueOf);
        if (pairCreate == null) {
            ProgressBar progressBarA = aVar.a(context, iB);
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            progressBarA.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            pairCreate = Pair.create(Integer.valueOf(progressBarA.getMeasuredWidth()), Integer.valueOf(progressBarA.getMeasuredHeight()));
            weakHashMap.put(numValueOf, pairCreate);
        }
        Pair<Integer, Integer> pair = pairCreate;
        return q.a(C0392f0.f(((Number) pair.first).intValue()), C0392f0.f(((Number) pair.second).intValue()));
    }

    @Override // U1.f
    @L1.a(name = PROP_ATTR)
    public void setTypeAttr(com.facebook.react.views.progressbar.a aVar, String str) {
        h.f(aVar, "view");
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(com.facebook.react.views.progressbar.a aVar, Object obj) {
        h.f(aVar, "root");
        h.f(obj, "extraData");
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public b createShadowNodeInstance() {
        return new b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public com.facebook.react.views.progressbar.a createViewInstance(B0 b4) {
        h.f(b4, "context");
        return new com.facebook.react.views.progressbar.a(b4);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(com.facebook.react.views.progressbar.a aVar) {
        h.f(aVar, "view");
        aVar.a();
    }

    @Override // U1.f
    @L1.a(name = PROP_ANIMATING)
    public void setAnimating(com.facebook.react.views.progressbar.a aVar, boolean z3) {
        h.f(aVar, "view");
        aVar.setAnimating$ReactAndroid_release(z3);
    }

    @Override // U1.f
    @L1.a(customType = "Color", name = "color")
    public void setColor(com.facebook.react.views.progressbar.a aVar, Integer num) {
        h.f(aVar, "view");
        aVar.setColor$ReactAndroid_release(num);
    }

    @Override // U1.f
    @L1.a(name = PROP_INDETERMINATE)
    public void setIndeterminate(com.facebook.react.views.progressbar.a aVar, boolean z3) {
        h.f(aVar, "view");
        aVar.setIndeterminate$ReactAndroid_release(z3);
    }

    @Override // U1.f
    @L1.a(name = PROP_PROGRESS)
    public void setProgress(com.facebook.react.views.progressbar.a aVar, double d4) {
        h.f(aVar, "view");
        aVar.setProgress$ReactAndroid_release(d4);
    }

    @Override // U1.f
    @L1.a(name = PROP_STYLE)
    public void setStyleAttr(com.facebook.react.views.progressbar.a aVar, String str) {
        h.f(aVar, "view");
        aVar.setStyle$ReactAndroid_release(str);
    }

    @Override // U1.f
    public void setTestID(com.facebook.react.views.progressbar.a aVar, String str) {
        h.f(aVar, "view");
        super.setTestId(aVar, str);
    }
}
