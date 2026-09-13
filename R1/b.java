package R1;

import android.content.Context;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static Integer[] a(Integer[] numArr) {
        D2.h.f(numArr, "edgeColors");
        return numArr;
    }

    public static /* synthetic */ Integer[] b(Integer[] numArr, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i3 & 1) != 0) {
            numArr = new Integer[n.values().length];
        }
        return a(numArr);
    }

    public static final h c(Integer[] numArr, int i3, Context context) {
        h hVar;
        D2.h.f(context, "context");
        int iIntValue = -16777216;
        if (i3 == 0) {
            Integer num = numArr[n.START.ordinal()];
            int iIntValue2 = (num == null && (num = numArr[n.LEFT.ordinal()]) == null && (num = numArr[n.HORIZONTAL.ordinal()]) == null && (num = numArr[n.ALL.ordinal()]) == null) ? -16777216 : num.intValue();
            Integer num2 = numArr[n.BLOCK_START.ordinal()];
            int iIntValue3 = (num2 == null && (num2 = numArr[n.TOP.ordinal()]) == null && (num2 = numArr[n.BLOCK.ordinal()]) == null && (num2 = numArr[n.VERTICAL.ordinal()]) == null && (num2 = numArr[n.ALL.ordinal()]) == null) ? -16777216 : num2.intValue();
            Integer num3 = numArr[n.END.ordinal()];
            int iIntValue4 = (num3 == null && (num3 = numArr[n.RIGHT.ordinal()]) == null && (num3 = numArr[n.HORIZONTAL.ordinal()]) == null && (num3 = numArr[n.ALL.ordinal()]) == null) ? -16777216 : num3.intValue();
            Integer num4 = numArr[n.BLOCK_END.ordinal()];
            if (num4 == null && (num4 = numArr[n.BOTTOM.ordinal()]) == null && (num4 = numArr[n.BLOCK.ordinal()]) == null && (num4 = numArr[n.VERTICAL.ordinal()]) == null) {
                Integer num5 = numArr[n.ALL.ordinal()];
                if (num5 != null) {
                    iIntValue = num5.intValue();
                }
            } else {
                iIntValue = num4.intValue();
            }
            hVar = new h(iIntValue2, iIntValue3, iIntValue4, iIntValue);
        } else {
            if (i3 != 1) {
                throw new IllegalArgumentException("Expected resolved layout direction");
            }
            if (com.facebook.react.modules.i18nmanager.a.f6978a.a().d(context)) {
                Integer num6 = numArr[n.END.ordinal()];
                int iIntValue5 = (num6 == null && (num6 = numArr[n.RIGHT.ordinal()]) == null && (num6 = numArr[n.HORIZONTAL.ordinal()]) == null && (num6 = numArr[n.ALL.ordinal()]) == null) ? -16777216 : num6.intValue();
                Integer num7 = numArr[n.BLOCK_START.ordinal()];
                int iIntValue6 = (num7 == null && (num7 = numArr[n.TOP.ordinal()]) == null && (num7 = numArr[n.BLOCK.ordinal()]) == null && (num7 = numArr[n.VERTICAL.ordinal()]) == null && (num7 = numArr[n.ALL.ordinal()]) == null) ? -16777216 : num7.intValue();
                Integer num8 = numArr[n.START.ordinal()];
                int iIntValue7 = (num8 == null && (num8 = numArr[n.LEFT.ordinal()]) == null && (num8 = numArr[n.HORIZONTAL.ordinal()]) == null && (num8 = numArr[n.ALL.ordinal()]) == null) ? -16777216 : num8.intValue();
                Integer num9 = numArr[n.BLOCK_END.ordinal()];
                if (num9 == null && (num9 = numArr[n.BOTTOM.ordinal()]) == null && (num9 = numArr[n.BLOCK.ordinal()]) == null && (num9 = numArr[n.VERTICAL.ordinal()]) == null) {
                    Integer num10 = numArr[n.ALL.ordinal()];
                    if (num10 != null) {
                        iIntValue = num10.intValue();
                    }
                } else {
                    iIntValue = num9.intValue();
                }
                hVar = new h(iIntValue5, iIntValue6, iIntValue7, iIntValue);
            } else {
                Integer num11 = numArr[n.END.ordinal()];
                int iIntValue8 = (num11 == null && (num11 = numArr[n.LEFT.ordinal()]) == null && (num11 = numArr[n.HORIZONTAL.ordinal()]) == null && (num11 = numArr[n.ALL.ordinal()]) == null) ? -16777216 : num11.intValue();
                Integer num12 = numArr[n.BLOCK_START.ordinal()];
                int iIntValue9 = (num12 == null && (num12 = numArr[n.TOP.ordinal()]) == null && (num12 = numArr[n.BLOCK.ordinal()]) == null && (num12 = numArr[n.VERTICAL.ordinal()]) == null && (num12 = numArr[n.ALL.ordinal()]) == null) ? -16777216 : num12.intValue();
                Integer num13 = numArr[n.START.ordinal()];
                int iIntValue10 = (num13 == null && (num13 = numArr[n.RIGHT.ordinal()]) == null && (num13 = numArr[n.HORIZONTAL.ordinal()]) == null && (num13 = numArr[n.ALL.ordinal()]) == null) ? -16777216 : num13.intValue();
                Integer num14 = numArr[n.BLOCK_END.ordinal()];
                if (num14 == null && (num14 = numArr[n.BOTTOM.ordinal()]) == null && (num14 = numArr[n.BLOCK.ordinal()]) == null && (num14 = numArr[n.VERTICAL.ordinal()]) == null) {
                    Integer num15 = numArr[n.ALL.ordinal()];
                    if (num15 != null) {
                        iIntValue = num15.intValue();
                    }
                } else {
                    iIntValue = num14.intValue();
                }
                hVar = new h(iIntValue8, iIntValue9, iIntValue10, iIntValue);
            }
        }
        return hVar;
    }
}
