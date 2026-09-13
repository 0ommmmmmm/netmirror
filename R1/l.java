package R1;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Shader;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import kotlin.enums.EnumEntries;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f2054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m f2055b;

    private enum a {
        LINEAR_GRADIENT;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f2058d = p091w2.a.a(a());
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2059a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.LINEAR_GRADIENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f2059a = iArr;
        }
    }

    public l(ReadableMap readableMap, Context context) {
        D2.h.f(context, "context");
        if (readableMap == null) {
            throw new IllegalArgumentException("Gradient cannot be null");
        }
        String string = readableMap.getString("type");
        if (!D2.h.b(string, "linearGradient")) {
            throw new IllegalArgumentException("Unsupported gradient type: " + string);
        }
        this.f2054a = a.LINEAR_GRADIENT;
        ReadableMap map = readableMap.getMap("direction");
        if (map == null) {
            throw new IllegalArgumentException("Gradient must have direction");
        }
        ReadableArray array = readableMap.getArray("colorStops");
        if (array == null) {
            throw new IllegalArgumentException("Invalid colorStops array");
        }
        this.f2055b = new m(map, array, context);
    }

    public final Shader a(Rect rect) {
        D2.h.f(rect, "bounds");
        if (b.f2059a[this.f2054a.ordinal()] == 1) {
            return this.f2055b.d(rect.width(), rect.height());
        }
        throw new p071r2.h();
    }
}
