package com.ting;

import D2.o;
import D2.p;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.ting.TingModule;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p023f2.h;
import p063p2.c;
import p063p2.d;
import p063p2.k;

/* JADX INFO: loaded from: classes.dex */
public final class TingModule extends TingSpec {
    public static final a Companion = new a(null);
    public static final String NAME = "Ting";
    private ReadableMap alertOptionInit;
    private final h alertWindow;
    private Context context;
    private ReadableMap toastOptionInit;
    private final h toastWindow;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends GestureDetector.SimpleOnGestureListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f8654a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f8655b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ TingModule f8656c;

        b(int i3, int i4, TingModule tingModule) {
            this.f8654a = i3;
            this.f8655b = i4;
            this.f8656c = tingModule;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f3, float f4) {
            D2.h.f(motionEvent2, "e2");
            if (Math.abs(f4) > Math.abs(f3)) {
                int i3 = this.f8654a;
                if (i3 == 48 && f4 > this.f8655b) {
                    this.f8656c.toastWindow.e();
                    return true;
                }
                if (i3 == 80 && f4 < (-this.f8655b)) {
                    this.f8656c.toastWindow.e();
                    return true;
                }
            }
            return super.onScroll(motionEvent, motionEvent2, f3, f4);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TingModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        D2.h.f(reactApplicationContext, "context");
        this.context = reactApplicationContext;
        this.alertWindow = new h(getCurrentActivity());
        this.toastWindow = new h(getCurrentActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void alert$lambda$8(TingModule tingModule, int i3, LinearLayout linearLayout, int i4, o oVar, final ReadableMap readableMap) {
        tingModule.alertWindow.e();
        h hVar = tingModule.alertWindow;
        hVar.A(i3);
        hVar.z(linearLayout);
        hVar.w(d.f10331a);
        hVar.F(true);
        hVar.B(17);
        hVar.y(i4);
        hVar.x((float) oVar.f186b);
        hVar.D(p063p2.b.f10324a, new h.a() { // from class: p2.i
            @Override // f2.h.a
            public final void a(h hVar2, View view) {
                TingModule.alert$lambda$8$lambda$7$lambda$6(readableMap, hVar2, (LinearLayout) view);
            }
        });
        hVar.J();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void alert$lambda$8$lambda$7$lambda$6(ReadableMap readableMap, h hVar, LinearLayout linearLayout) {
        D2.h.f(hVar, "alert");
        if (readableMap.hasKey("shouldDismissByTap") ? readableMap.getBoolean("shouldDismissByTap") : true) {
            hVar.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dismissAlert$lambda$9(TingModule tingModule) {
        tingModule.alertWindow.e();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:75:0x019b  */
    /* JADX WARN: Code duplicated, block: B:89:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:92:0x01da  */
    /* JADX WARN: Code duplicated, block: B:94:0x01ec  */
    private final LinearLayout getContainerView(int i3, ReadableMap readableMap, String str) {
        ReadableMap readableMap2;
        Integer numValueOf;
        String string;
        View viewInflate = LayoutInflater.from(this.context).inflate(i3, (ViewGroup) null);
        D2.h.d(viewInflate, "null cannot be cast to non-null type android.widget.LinearLayout");
        LinearLayout linearLayout = (LinearLayout) viewInflate;
        String string2 = readableMap != null ? readableMap.getString("title") : null;
        String string3 = readableMap != null ? readableMap.getString("titleColor") : null;
        String string4 = readableMap != null ? readableMap.getString("message") : null;
        String string5 = readableMap != null ? readableMap.getString("messageColor") : null;
        String string6 = readableMap != null ? readableMap.getString("progressColor") : null;
        String string7 = readableMap != null ? readableMap.getString("preset") : null;
        String string8 = readableMap != null ? readableMap.getString("backgroundColor") : null;
        Integer numValueOf2 = readableMap.hasKey("borderRadius") ? Integer.valueOf(readableMap.getInt("borderRadius")) : null;
        View viewFindViewById = linearLayout.findViewById(p063p2.b.f10327d);
        D2.h.e(viewFindViewById, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById;
        View viewFindViewById2 = linearLayout.findViewById(p063p2.b.f10328e);
        D2.h.e(viewFindViewById2, "findViewById(...)");
        TextView textView2 = (TextView) viewFindViewById2;
        View viewFindViewById3 = linearLayout.findViewById(p063p2.b.f10325b);
        D2.h.e(viewFindViewById3, "findViewById(...)");
        ImageView imageView = (ImageView) viewFindViewById3;
        ReadableMap map = readableMap.getMap("icon");
        String string9 = map != null ? map.getString("uri") : null;
        Drawable background = linearLayout.getBackground();
        D2.h.d(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        GradientDrawable gradientDrawable = (GradientDrawable) background;
        if (k.b(numValueOf2)) {
            gradientDrawable.setCornerRadius(k.a(numValueOf2));
        }
        if (string8 != null) {
            gradientDrawable.setColors(new int[]{k.e(string8), k.e(string8)});
        } else {
            gradientDrawable.setColors(new int[]{-1, -1});
        }
        textView2.setText(string2);
        if (string3 != null) {
            textView2.setTextColor(k.e(string3));
        }
        if (string4 == null) {
            textView.setVisibility(8);
        } else {
            textView.setText(string4);
        }
        if (string5 != null) {
            textView.setTextColor(k.e(string5));
        }
        if (string9 != null) {
            Bitmap bitmapC = k.c(string9);
            if (bitmapC != null) {
                imageView.setImageBitmap(bitmapC);
                if (map != null) {
                    readableMap2 = map;
                    numValueOf = readableMap2.hasKey("size") ? Integer.valueOf(readableMap2.getInt("size")) : null;
                    if (readableMap2 == null && readableMap2.hasKey("tintColor")) {
                        string = readableMap2.getString("tintColor");
                    } else {
                        string = null;
                    }
                    if (k.b(numValueOf)) {
                        int iA = k.a(numValueOf);
                        imageView.getLayoutParams().width = iA;
                        imageView.getLayoutParams().height = iA;
                    }
                    if (string != null) {
                        imageView.setColorFilter(k.e(string), PorterDuff.Mode.SRC_IN);
                    }
                } else {
                    readableMap2 = map;
                }
                if (readableMap2 == null) {
                    string = null;
                } else {
                    string = null;
                }
                if (k.b(numValueOf)) {
                    int iA2 = k.a(numValueOf);
                    imageView.getLayoutParams().width = iA2;
                    imageView.getLayoutParams().height = iA2;
                }
                if (string != null) {
                    imageView.setColorFilter(k.e(string), PorterDuff.Mode.SRC_IN);
                }
            } else {
                loadDoneIcon(imageView);
            }
        } else if (string7 != null) {
            switch (string7) {
                case "spinner":
                    ProgressBar progressBar = new ProgressBar(this.context);
                    LinearLayout.LayoutParams layoutParams = D2.h.b(str, "toast") ? new LinearLayout.LayoutParams(k.a(24), k.a(24)) : new LinearLayout.LayoutParams(-2, -2);
                    imageView.setVisibility(8);
                    progressBar.setId(p063p2.b.f10326c);
                    progressBar.setLayoutParams(layoutParams);
                    if (string6 != null) {
                        Drawable drawableMutate = progressBar.getIndeterminateDrawable().mutate();
                        D2.h.e(drawableMutate, "mutate(...)");
                        drawableMutate.setColorFilter(new PorterDuffColorFilter(k.e(string6), PorterDuff.Mode.SRC_IN));
                        progressBar.setIndeterminateDrawable(drawableMutate);
                    }
                    linearLayout.addView(progressBar, 0);
                    break;
                case "done":
                    loadDoneIcon(imageView);
                    break;
                case "none":
                    imageView.setVisibility(8);
                    break;
                case "error":
                    imageView.setImageResource(p063p2.a.f10323b);
                    break;
                default:
                    loadDoneIcon(imageView);
                    break;
            }
        } else {
            loadDoneIcon(imageView);
        }
        return linearLayout;
    }

    private final int getDuration(ReadableMap readableMap) {
        if (readableMap.hasKey("duration")) {
            return (int) (readableMap.getDouble("duration") * ((double) 1000));
        }
        return 3000;
    }

    private final void loadDoneIcon(ImageView imageView) {
        imageView.setImageResource(p063p2.a.f10322a);
        Drawable drawable = imageView.getDrawable();
        D2.h.d(drawable, "null cannot be cast to non-null type android.graphics.drawable.AnimatedVectorDrawable");
        final AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: p2.j
            @Override // java.lang.Runnable
            public final void run() {
                animatedVectorDrawable.start();
            }
        }, 300L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void toast$lambda$4(TingModule tingModule, int i3, LinearLayout linearLayout, int i4, p pVar, ReadableMap readableMap) {
        tingModule.toastWindow.e();
        h hVar = tingModule.toastWindow;
        hVar.A(i3);
        hVar.z(linearLayout);
        hVar.B(i4);
        hVar.I(48);
        hVar.w(pVar.f187b);
        hVar.F(true);
        if (readableMap.hasKey("shouldDismissByDrag") && readableMap.getBoolean("shouldDismissByDrag")) {
            int i5 = (int) ((12 * hVar.h().getResources().getDisplayMetrics().density) + 0.5f);
            View viewG = hVar.g();
            if (viewG != null) {
                final GestureDetector gestureDetector = new GestureDetector(hVar.h(), new b(i4, i5, tingModule));
                viewG.setOnTouchListener(new View.OnTouchListener() { // from class: p2.f
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        return TingModule.toast$lambda$4$lambda$3$lambda$2$lambda$1(gestureDetector, view, motionEvent);
                    }
                });
            }
        }
        hVar.J();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean toast$lambda$4$lambda$3$lambda$2$lambda$1(GestureDetector gestureDetector, View view, MotionEvent motionEvent) {
        gestureDetector.onTouchEvent(motionEvent);
        return true;
    }

    @Override // com.ting.NativeTingSpec
    @ReactMethod
    public void alert(ReadableMap readableMap) {
        WritableMap writableMapD;
        D2.h.f(readableMap, "rnOptions");
        ReadableMap readableMap2 = this.alertOptionInit;
        final ReadableMap readableMap3 = (readableMap2 == null || (writableMapD = k.d(readableMap2, readableMap)) == null) ? readableMap : writableMapD;
        final LinearLayout containerView = getContainerView(c.f10329a, readableMap3, "alert");
        final int duration = getDuration(readableMap3);
        final int i3 = readableMap3.hasKey("blurBackdrop") ? readableMap3.getInt("blurBackdrop") : 0;
        final o oVar = new o();
        double d4 = readableMap3.hasKey("backdropOpacity") ? readableMap3.getDouble("backdropOpacity") : 0.0d;
        oVar.f186b = d4;
        if (d4 < 0.0d) {
            oVar.f186b = 0.0d;
        } else if (d4 > 1.0d) {
            oVar.f186b = 1.0d;
        }
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: p2.g
            @Override // java.lang.Runnable
            public final void run() {
                TingModule.alert$lambda$8(this.f10341b, duration, containerView, i3, oVar, readableMap3);
            }
        });
    }

    @Override // com.ting.NativeTingSpec
    @ReactMethod
    public void dismissAlert() {
        if (this.alertWindow.m()) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: p2.h
                @Override // java.lang.Runnable
                public final void run() {
                    TingModule.dismissAlert$lambda$9(this.f10347b);
                }
            });
        }
    }

    @Override // com.ting.NativeTingSpec, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "Ting";
    }

    @Override // com.ting.NativeTingSpec
    @ReactMethod
    public void setup(ReadableMap readableMap) {
        D2.h.f(readableMap, "options");
        ReadableMap map = readableMap.getMap("toast");
        ReadableMap map2 = readableMap.getMap("alert");
        if (map != null) {
            this.toastOptionInit = map;
        }
        if (map2 != null) {
            this.alertOptionInit = map2;
        }
    }

    @Override // com.ting.NativeTingSpec
    @ReactMethod
    public void toast(ReadableMap readableMap) {
        int i3;
        WritableMap writableMapD;
        D2.h.f(readableMap, "rnOptions");
        ReadableMap readableMap2 = this.toastOptionInit;
        final ReadableMap readableMap3 = (readableMap2 == null || (writableMapD = k.d(readableMap2, readableMap)) == null) ? readableMap : writableMapD;
        final LinearLayout containerView = getContainerView(c.f10330b, readableMap3, "toast");
        final int duration = getDuration(readableMap3);
        final p pVar = new p();
        pVar.f187b = d.f10333c;
        if (D2.h.b(readableMap3.getString("position"), "bottom")) {
            pVar.f187b = d.f10332b;
            i3 = 80;
        } else {
            i3 = 48;
        }
        final int i4 = i3;
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: p2.e
            @Override // java.lang.Runnable
            public final void run() {
                TingModule.toast$lambda$4(this.f10334b, duration, containerView, i4, pVar, readableMap3);
            }
        });
    }
}
