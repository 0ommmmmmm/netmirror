package org.lsposed.hiddenapibypass;

import android.util.Log;
import dalvik.system.VMRuntime;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandleInfo;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final class HiddenApiBypass {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Unsafe f10217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f10218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f10219c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f10220d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f10221e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f10222f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final long f10223g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final long f10224h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f10225i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final long f10226j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final long f10227k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final long f10228l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final long f10229m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Set f10230n = new HashSet();

    static {
        try {
            Unsafe unsafe = (Unsafe) Unsafe.class.getDeclaredMethod("getUnsafe", new Class[0]).invoke(null, new Object[0]);
            f10217a = unsafe;
            f10218b = unsafe.objectFieldOffset(Helper$Executable.class.getDeclaredField("artMethod"));
            f10219c = unsafe.objectFieldOffset(Helper$Executable.class.getDeclaredField("declaringClass"));
            long jObjectFieldOffset = unsafe.objectFieldOffset(Helper$MethodHandle.class.getDeclaredField("artFieldOrMethod"));
            f10220d = jObjectFieldOffset;
            f10221e = unsafe.objectFieldOffset(Helper$MethodHandleImpl.class.getDeclaredField("info"));
            long jObjectFieldOffset2 = unsafe.objectFieldOffset(Helper$Class.class.getDeclaredField("methods"));
            f10222f = jObjectFieldOffset2;
            long jObjectFieldOffset3 = unsafe.objectFieldOffset(Helper$Class.class.getDeclaredField("iFields"));
            f10223g = jObjectFieldOffset3;
            f10224h = unsafe.objectFieldOffset(Helper$Class.class.getDeclaredField("sFields"));
            f10225i = unsafe.objectFieldOffset(Helper$HandleInfo.class.getDeclaredField("member"));
            Method declaredMethod = Helper$NeverCall.class.getDeclaredMethod("a", new Class[0]);
            Method declaredMethod2 = Helper$NeverCall.class.getDeclaredMethod("b", new Class[0]);
            declaredMethod.setAccessible(true);
            declaredMethod2.setAccessible(true);
            MethodHandle methodHandleUnreflect = MethodHandles.lookup().unreflect(declaredMethod);
            MethodHandle methodHandleUnreflect2 = MethodHandles.lookup().unreflect(declaredMethod2);
            long j3 = unsafe.getLong(methodHandleUnreflect, jObjectFieldOffset);
            long j4 = unsafe.getLong(methodHandleUnreflect2, jObjectFieldOffset);
            long j5 = unsafe.getLong(Helper$NeverCall.class, jObjectFieldOffset2);
            long j6 = j4 - j3;
            f10226j = j6;
            f10227k = (j3 - j5) - j6;
            Field declaredField = Helper$NeverCall.class.getDeclaredField("i");
            Field declaredField2 = Helper$NeverCall.class.getDeclaredField("j");
            declaredField.setAccessible(true);
            declaredField2.setAccessible(true);
            MethodHandle methodHandleUnreflectGetter = MethodHandles.lookup().unreflectGetter(declaredField);
            MethodHandle methodHandleUnreflectGetter2 = MethodHandles.lookup().unreflectGetter(declaredField2);
            long j7 = unsafe.getLong(methodHandleUnreflectGetter, jObjectFieldOffset);
            long j8 = unsafe.getLong(methodHandleUnreflectGetter2, jObjectFieldOffset);
            long j9 = unsafe.getLong(Helper$NeverCall.class, jObjectFieldOffset3);
            f10228l = j8 - j7;
            f10229m = j7 - j9;
        } catch (ReflectiveOperationException e4) {
            Log.e("HiddenApiBypass", "Initialize error", e4);
            throw new ExceptionInInitializerError(e4);
        }
    }

    static boolean a(Class[] clsArr, Object[] objArr) {
        if (clsArr.length != objArr.length) {
            return false;
        }
        for (int i3 = 0; i3 < clsArr.length; i3++) {
            if (!clsArr[i3].isPrimitive()) {
                Object obj = objArr[i3];
                if (obj != null && !clsArr[i3].isInstance(obj)) {
                    return false;
                }
            } else {
                if (clsArr[i3] == Integer.TYPE && !(objArr[i3] instanceof Integer)) {
                    return false;
                }
                if (clsArr[i3] == Byte.TYPE && !(objArr[i3] instanceof Byte)) {
                    return false;
                }
                if (clsArr[i3] == Character.TYPE && !(objArr[i3] instanceof Character)) {
                    return false;
                }
                if (clsArr[i3] == Boolean.TYPE && !(objArr[i3] instanceof Boolean)) {
                    return false;
                }
                if (clsArr[i3] == Double.TYPE && !(objArr[i3] instanceof Double)) {
                    return false;
                }
                if (clsArr[i3] == Float.TYPE && !(objArr[i3] instanceof Float)) {
                    return false;
                }
                if (clsArr[i3] == Long.TYPE && !(objArr[i3] instanceof Long)) {
                    return false;
                }
                if (clsArr[i3] == Short.TYPE && !(objArr[i3] instanceof Short)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean addHiddenApiExemptions(String... strArr) {
        Set set = f10230n;
        set.addAll(Arrays.asList(strArr));
        String[] strArr2 = new String[((HashSet) set).size()];
        set.toArray(strArr2);
        return setHiddenApiExemptions(strArr2);
    }

    public static boolean clearHiddenApiExemptions() {
        ((HashSet) f10230n).clear();
        return setHiddenApiExemptions(new String[0]);
    }

    public static Constructor getDeclaredConstructor(Class cls, Class... clsArr) throws NoSuchMethodException {
        for (Executable executable : getDeclaredMethods(cls)) {
            if (executable instanceof Constructor) {
                Class<?>[] parameterTypes = executable.getParameterTypes();
                if (parameterTypes.length == clsArr.length) {
                    for (int i3 = 0; i3 < clsArr.length; i3++) {
                        if (clsArr[i3] == parameterTypes[i3]) {
                        }
                    }
                    return (Constructor) executable;
                }
                continue;
            }
        }
        throw new NoSuchMethodException("Cannot find matching constructor");
    }

    public static Method getDeclaredMethod(Class cls, String str, Class... clsArr) throws NoSuchMethodException {
        for (Executable executable : getDeclaredMethods(cls)) {
            if (executable.getName().equals(str) && (executable instanceof Method)) {
                Class<?>[] parameterTypes = executable.getParameterTypes();
                if (parameterTypes.length == clsArr.length) {
                    for (int i3 = 0; i3 < clsArr.length; i3++) {
                        if (clsArr[i3] == parameterTypes[i3]) {
                        }
                    }
                    return (Method) executable;
                }
                continue;
            }
        }
        throw new NoSuchMethodException("Cannot find matching method");
    }

    public static List getDeclaredMethods(Class cls) {
        ArrayList arrayList = new ArrayList();
        if (!cls.isPrimitive() && !cls.isArray()) {
            try {
                Method declaredMethod = Helper$NeverCall.class.getDeclaredMethod("a", new Class[0]);
                declaredMethod.setAccessible(true);
                MethodHandle methodHandleUnreflect = MethodHandles.lookup().unreflect(declaredMethod);
                Unsafe unsafe = f10217a;
                long j3 = unsafe.getLong(cls, f10222f);
                if (j3 == 0) {
                    return arrayList;
                }
                int i3 = unsafe.getInt(j3);
                for (int i4 = 0; i4 < i3; i4++) {
                    long j4 = (((long) i4) * f10226j) + j3 + f10227k;
                    Unsafe unsafe2 = f10217a;
                    unsafe2.putLong(methodHandleUnreflect, f10220d, j4);
                    unsafe2.putObject(methodHandleUnreflect, f10221e, (Object) null);
                    try {
                        MethodHandles.lookup().revealDirect(methodHandleUnreflect);
                    } catch (Throwable unused) {
                    }
                    Unsafe unsafe3 = f10217a;
                    arrayList.add((Executable) unsafe3.getObject((MethodHandleInfo) unsafe3.getObject(methodHandleUnreflect, f10221e), f10225i));
                }
            } catch (IllegalAccessException | NoSuchMethodException unused2) {
            }
        }
        return arrayList;
    }

    public static List getInstanceFields(Class cls) {
        ArrayList arrayList = new ArrayList();
        if (!cls.isPrimitive() && !cls.isArray()) {
            try {
                Field declaredField = Helper$NeverCall.class.getDeclaredField("i");
                declaredField.setAccessible(true);
                MethodHandle methodHandleUnreflectGetter = MethodHandles.lookup().unreflectGetter(declaredField);
                Unsafe unsafe = f10217a;
                long j3 = unsafe.getLong(cls, f10223g);
                if (j3 == 0) {
                    return arrayList;
                }
                int i3 = unsafe.getInt(j3);
                for (int i4 = 0; i4 < i3; i4++) {
                    long j4 = (((long) i4) * f10228l) + j3 + f10229m;
                    Unsafe unsafe2 = f10217a;
                    unsafe2.putLong(methodHandleUnreflectGetter, f10220d, j4);
                    unsafe2.putObject(methodHandleUnreflectGetter, f10221e, (Object) null);
                    try {
                        MethodHandles.lookup().revealDirect(methodHandleUnreflectGetter);
                    } catch (Throwable unused) {
                    }
                    Unsafe unsafe3 = f10217a;
                    arrayList.add((Field) unsafe3.getObject((MethodHandleInfo) unsafe3.getObject(methodHandleUnreflectGetter, f10221e), f10225i));
                }
            } catch (IllegalAccessException | NoSuchFieldException unused2) {
            }
        }
        return arrayList;
    }

    public static List getStaticFields(Class cls) {
        ArrayList arrayList = new ArrayList();
        if (!cls.isPrimitive() && !cls.isArray()) {
            try {
                Field declaredField = Helper$NeverCall.class.getDeclaredField("s");
                declaredField.setAccessible(true);
                MethodHandle methodHandleUnreflectGetter = MethodHandles.lookup().unreflectGetter(declaredField);
                Unsafe unsafe = f10217a;
                long j3 = unsafe.getLong(cls, f10224h);
                if (j3 == 0) {
                    return arrayList;
                }
                int i3 = unsafe.getInt(j3);
                for (int i4 = 0; i4 < i3; i4++) {
                    long j4 = (((long) i4) * f10228l) + j3 + f10229m;
                    Unsafe unsafe2 = f10217a;
                    unsafe2.putLong(methodHandleUnreflectGetter, f10220d, j4);
                    unsafe2.putObject(methodHandleUnreflectGetter, f10221e, (Object) null);
                    try {
                        MethodHandles.lookup().revealDirect(methodHandleUnreflectGetter);
                    } catch (Throwable unused) {
                    }
                    Unsafe unsafe3 = f10217a;
                    arrayList.add((Field) unsafe3.getObject((MethodHandleInfo) unsafe3.getObject(methodHandleUnreflectGetter, f10221e), f10225i));
                }
            } catch (IllegalAccessException | NoSuchFieldException unused2) {
            }
        }
        return arrayList;
    }

    public static Object invoke(Class cls, Object obj, String str, Object... objArr) throws NoSuchMethodException {
        if (obj != null && !cls.isInstance(obj)) {
            throw new IllegalArgumentException("this object is not an instance of the given class");
        }
        Method declaredMethod = Helper$InvokeStub.class.getDeclaredMethod("invoke", Object[].class);
        declaredMethod.setAccessible(true);
        Unsafe unsafe = f10217a;
        long j3 = unsafe.getLong(cls, f10222f);
        if (j3 == 0) {
            throw new NoSuchMethodException("Cannot find matching method");
        }
        int i3 = unsafe.getInt(j3);
        for (int i4 = 0; i4 < i3; i4++) {
            f10217a.putLong(declaredMethod, f10218b, (((long) i4) * f10226j) + j3 + f10227k);
            if (str.equals(declaredMethod.getName()) && a(declaredMethod.getParameterTypes(), objArr)) {
                return declaredMethod.invoke(obj, objArr);
            }
        }
        throw new NoSuchMethodException("Cannot find matching method");
    }

    public static Object newInstance(Class cls, Object... objArr) throws NoSuchMethodException {
        Method declaredMethod = Helper$InvokeStub.class.getDeclaredMethod("invoke", Object[].class);
        Constructor declaredConstructor = Helper$InvokeStub.class.getDeclaredConstructor(Object[].class);
        declaredConstructor.setAccessible(true);
        Unsafe unsafe = f10217a;
        long j3 = unsafe.getLong(cls, f10222f);
        if (j3 == 0) {
            throw new NoSuchMethodException("Cannot find matching constructor");
        }
        int i3 = unsafe.getInt(j3);
        for (int i4 = 0; i4 < i3; i4++) {
            long j4 = (((long) i4) * f10226j) + j3 + f10227k;
            Unsafe unsafe2 = f10217a;
            long j5 = f10218b;
            unsafe2.putLong(declaredMethod, j5, j4);
            if ("<init>".equals(declaredMethod.getName())) {
                unsafe2.putLong(declaredConstructor, j5, j4);
                unsafe2.putObject(declaredConstructor, f10219c, cls);
                if (a(declaredConstructor.getParameterTypes(), objArr)) {
                    return declaredConstructor.newInstance(objArr);
                }
            }
        }
        throw new NoSuchMethodException("Cannot find matching constructor");
    }

    public static boolean setHiddenApiExemptions(String... strArr) {
        try {
            invoke(VMRuntime.class, invoke(VMRuntime.class, null, "getRuntime", new Object[0]), "setHiddenApiExemptions", strArr);
            return true;
        } catch (Throwable th) {
            Log.w("HiddenApiBypass", "setHiddenApiExemptions", th);
            return false;
        }
    }
}
