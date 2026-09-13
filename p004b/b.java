package p004b;

import android.content.Intent;
import java.util.ArrayList;
import java.util.Map;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p075s2.AbstractC0486h;
import p075s2.AbstractC0492n;
import p075s2.D;

/* JADX INFO: loaded from: classes.dex */
public final class b extends p004b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f5571a = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.Map, void] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.util.Map, void] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.util.Map, void] */
    @Override // p004b.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Map a(int i3, Intent intent) {
        if (i3 != -1) {
            return DebugProbesKt.probeCoroutineSuspended(-1);
        }
        if (intent == null) {
            return DebugProbesKt.probeCoroutineSuspended(-1);
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra == null || stringArrayExtra == null) {
            return DebugProbesKt.probeCoroutineSuspended("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        }
        ArrayList arrayList = new ArrayList(intArrayExtra.length);
        for (int i4 : intArrayExtra) {
            arrayList.add(Boolean.valueOf(i4 == 0));
        }
        return D.m(AbstractC0492n.i0(AbstractC0486h.m(stringArrayExtra), arrayList));
    }
}
