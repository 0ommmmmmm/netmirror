package androidx.appcompat.widget;

import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f3802a = {R.attr.state_checked};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f3803b = new int[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Rect f3804c = new Rect();

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final boolean f3805a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final Method f3806b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final Field f3807c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final Field f3808d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final Field f3809e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final Field f3810f;

        /* JADX WARN: Code duplicated, block: B:25:0x004c  */
        /* JADX WARN: Code duplicated, block: B:26:0x0059  */
        static {
            Method method;
            Field field;
            Field field2;
            Field field3;
            Field field4;
            boolean z3;
            try {
                Class<?> cls = Class.forName("android.graphics.Insets");
                method = Drawable.class.getMethod("getOpticalInsets", new Class[0]);
                try {
                    field = cls.getField("left");
                    try {
                        field2 = cls.getField("top");
                        try {
                            field3 = cls.getField("right");
                            try {
                                field4 = cls.getField("bottom");
                                z3 = true;
                            } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused) {
                                field4 = null;
                                z3 = false;
                            }
                        } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused2) {
                            field3 = null;
                        }
                    } catch (ClassNotFoundException unused3) {
                        field2 = null;
                        field3 = field2;
                        field4 = null;
                        z3 = false;
                        if (z3) {
                            f3806b = method;
                            f3807c = field;
                            f3808d = field2;
                            f3809e = field3;
                            f3810f = field4;
                            f3805a = true;
                            return;
                        }
                        f3806b = null;
                        f3807c = null;
                        f3808d = null;
                        f3809e = null;
                        f3810f = null;
                        f3805a = false;
                    } catch (NoSuchFieldException unused4) {
                        field2 = null;
                        field3 = field2;
                        field4 = null;
                        z3 = false;
                        if (z3) {
                            f3806b = method;
                            f3807c = field;
                            f3808d = field2;
                            f3809e = field3;
                            f3810f = field4;
                            f3805a = true;
                            return;
                        }
                        f3806b = null;
                        f3807c = null;
                        f3808d = null;
                        f3809e = null;
                        f3810f = null;
                        f3805a = false;
                    } catch (NoSuchMethodException unused5) {
                        field2 = null;
                        field3 = field2;
                        field4 = null;
                        z3 = false;
                        if (z3) {
                            f3806b = method;
                            f3807c = field;
                            f3808d = field2;
                            f3809e = field3;
                            f3810f = field4;
                            f3805a = true;
                            return;
                        }
                        f3806b = null;
                        f3807c = null;
                        f3808d = null;
                        f3809e = null;
                        f3810f = null;
                        f3805a = false;
                    }
                } catch (ClassNotFoundException unused6) {
                    field = null;
                    field2 = field;
                    field3 = field2;
                    field4 = null;
                    z3 = false;
                    if (z3) {
                        f3806b = method;
                        f3807c = field;
                        f3808d = field2;
                        f3809e = field3;
                        f3810f = field4;
                        f3805a = true;
                        return;
                    }
                    f3806b = null;
                    f3807c = null;
                    f3808d = null;
                    f3809e = null;
                    f3810f = null;
                    f3805a = false;
                } catch (NoSuchFieldException unused7) {
                    field = null;
                    field2 = field;
                    field3 = field2;
                    field4 = null;
                    z3 = false;
                    if (z3) {
                        f3806b = method;
                        f3807c = field;
                        f3808d = field2;
                        f3809e = field3;
                        f3810f = field4;
                        f3805a = true;
                        return;
                    }
                    f3806b = null;
                    f3807c = null;
                    f3808d = null;
                    f3809e = null;
                    f3810f = null;
                    f3805a = false;
                } catch (NoSuchMethodException unused8) {
                    field = null;
                    field2 = field;
                    field3 = field2;
                    field4 = null;
                    z3 = false;
                    if (z3) {
                        f3806b = method;
                        f3807c = field;
                        f3808d = field2;
                        f3809e = field3;
                        f3810f = field4;
                        f3805a = true;
                        return;
                    }
                    f3806b = null;
                    f3807c = null;
                    f3808d = null;
                    f3809e = null;
                    f3810f = null;
                    f3805a = false;
                }
            } catch (ClassNotFoundException unused9) {
                method = null;
                field = null;
            } catch (NoSuchFieldException unused10) {
                method = null;
                field = null;
            } catch (NoSuchMethodException unused11) {
                method = null;
                field = null;
            }
            if (z3) {
                f3806b = method;
                f3807c = field;
                f3808d = field2;
                f3809e = field3;
                f3810f = field4;
                f3805a = true;
                return;
            }
            f3806b = null;
            f3807c = null;
            f3808d = null;
            f3809e = null;
            f3810f = null;
            f3805a = false;
        }

        static Rect a(Drawable drawable) {
            if (Build.VERSION.SDK_INT < 29 && f3805a) {
                try {
                    Object objInvoke = f3806b.invoke(drawable, new Object[0]);
                    if (objInvoke != null) {
                        return new Rect(f3807c.getInt(objInvoke), f3808d.getInt(objInvoke), f3809e.getInt(objInvoke), f3810f.getInt(objInvoke));
                    }
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            }
            return O.f3804c;
        }
    }

    static class b {
        static Insets a(Drawable drawable) {
            return drawable.getOpticalInsets();
        }
    }

    static void a(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 29 || i3 >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            return;
        }
        b(drawable);
    }

    private static void b(Drawable drawable) {
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f3802a);
        } else {
            drawable.setState(f3803b);
        }
        drawable.setState(state);
    }

    public static Rect c(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 29) {
            return a.a(androidx.core.graphics.drawable.a.i(drawable));
        }
        Insets insetsA = b.a(drawable);
        return new Rect(insetsA.left, insetsA.top, insetsA.right, insetsA.bottom);
    }

    public static PorterDuff.Mode d(int i3, PorterDuff.Mode mode) {
        if (i3 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i3 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i3 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i3) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
