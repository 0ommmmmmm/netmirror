package androidx.fragment.app;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;

/* JADX INFO: renamed from: androidx.fragment.app.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0282k {
    private static int a(Fragment fragment, boolean z3, boolean z4) {
        if (z4) {
            return z3 ? fragment.G() : fragment.H();
        }
        return z3 ? fragment.q() : fragment.v();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0071 A[Catch: RuntimeException -> 0x0077, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x0077, blocks: (B:32:0x006b, B:34:0x0071), top: B:45:0x006b }] */
    static a b(Context context, Fragment fragment, boolean z3, boolean z4) {
        Animator animatorLoadAnimator;
        int iC = fragment.C();
        int iA = a(fragment, z3, z4);
        fragment.r1(0, 0, 0, 0);
        ViewGroup viewGroup = fragment.f4919I;
        if (viewGroup != null && viewGroup.getTag(B.b.f44c) != null) {
            fragment.f4919I.setTag(B.b.f44c, null);
        }
        ViewGroup viewGroup2 = fragment.f4919I;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        Animation animationL0 = fragment.l0(iC, z3, iA);
        if (animationL0 != null) {
            return new a(animationL0);
        }
        Animator animatorM0 = fragment.m0(iC, z3, iA);
        if (animatorM0 != null) {
            return new a(animatorM0);
        }
        if (iA == 0 && iC != 0) {
            iA = d(context, iC, z3);
        }
        if (iA != 0) {
            boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(iA));
            if (zEquals) {
                try {
                    Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, iA);
                    if (animationLoadAnimation != null) {
                        return new a(animationLoadAnimation);
                    }
                } catch (Resources.NotFoundException e4) {
                    throw e4;
                } catch (RuntimeException unused) {
                    try {
                        animatorLoadAnimator = AnimatorInflater.loadAnimator(context, iA);
                        if (animatorLoadAnimator != null) {
                            return new a(animatorLoadAnimator);
                        }
                    } catch (RuntimeException e5) {
                        if (zEquals) {
                            throw e5;
                        }
                        Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, iA);
                        if (animationLoadAnimation2 != null) {
                            return new a(animationLoadAnimation2);
                        }
                    }
                }
            } else {
                animatorLoadAnimator = AnimatorInflater.loadAnimator(context, iA);
                if (animatorLoadAnimator != null) {
                    return new a(animatorLoadAnimator);
                }
            }
        }
        return null;
    }

    private static int c(Context context, int i3) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i3});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    private static int d(Context context, int i3, boolean z3) {
        if (i3 == 4097) {
            return z3 ? B.a.f40e : B.a.f41f;
        }
        if (i3 == 8194) {
            return z3 ? B.a.f36a : B.a.f37b;
        }
        if (i3 == 8197) {
            return z3 ? c(context, R.attr.activityCloseEnterAnimation) : c(context, R.attr.activityCloseExitAnimation);
        }
        if (i3 == 4099) {
            return z3 ? B.a.f38c : B.a.f39d;
        }
        if (i3 != 4100) {
            return -1;
        }
        return z3 ? c(context, R.attr.activityOpenEnterAnimation) : c(context, R.attr.activityOpenExitAnimation);
    }

    /* JADX INFO: renamed from: androidx.fragment.app.k$a */
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Animation f5154a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Animator f5155b;

        a(Animation animation) {
            this.f5154a = animation;
            this.f5155b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        a(Animator animator) {
            this.f5154a = null;
            this.f5155b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.k$b */
    static class b extends AnimationSet implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ViewGroup f5156b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final View f5157c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f5158d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f5159e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f5160f;

        b(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f5160f = true;
            this.f5156b = viewGroup;
            this.f5157c = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j3, Transformation transformation) {
            this.f5160f = true;
            if (this.f5158d) {
                return !this.f5159e;
            }
            if (!super.getTransformation(j3, transformation)) {
                this.f5158d = true;
                androidx.core.view.L.a(this.f5156b, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f5158d || !this.f5160f) {
                this.f5156b.endViewTransition(this.f5157c);
                this.f5159e = true;
            } else {
                this.f5160f = false;
                this.f5156b.post(this);
            }
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j3, Transformation transformation, float f3) {
            this.f5160f = true;
            if (this.f5158d) {
                return !this.f5159e;
            }
            if (!super.getTransformation(j3, transformation, f3)) {
                this.f5158d = true;
                androidx.core.view.L.a(this.f5156b, this);
            }
            return true;
        }
    }
}
