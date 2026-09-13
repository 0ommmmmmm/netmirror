package p097y0;

import D2.h;
import android.graphics.PointF;
import android.graphics.Rect;
import android.net.Uri;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f11036a = new b();

    private b() {
    }

    public static final z0.b.a a(Map map, Map map2, Map map3, Map map4, Rect rect, String str, PointF pointF, Map map5, Object obj, boolean z3, Uri uri) {
        h.f(map, "componentAttribution");
        h.f(map2, "shortcutAttribution");
        z0.b.a aVar = new z0.b.a();
        if (rect != null) {
            aVar.f11056h = rect.width();
            aVar.f11057i = rect.height();
        }
        aVar.f11058j = str;
        if (pointF != null) {
            aVar.f11059k = Float.valueOf(pointF.x);
            aVar.f11060l = Float.valueOf(pointF.y);
        }
        aVar.f11054f = obj;
        aVar.f11061m = z3;
        aVar.f11055g = uri;
        aVar.f11051c = map3;
        aVar.f11052d = map5;
        aVar.f11050b = map2;
        aVar.f11049a = map;
        aVar.f11053e = map4;
        return aVar;
    }
}
