package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ThreadLocal f4432a = new ThreadLocal();

    public static ColorStateList a(Resources resources, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return b(resources, xmlPullParser, attributeSetAsAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static ColorStateList b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException {
        String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            return d(resources, xmlPullParser, attributeSet, theme);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
    }

    private static TypedValue c() {
        ThreadLocal threadLocal = f4432a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    private static ColorStateList d(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int color;
        int i3 = 1;
        int depth2 = xmlPullParser.getDepth() + 1;
        int[][] iArr = new int[20][];
        int[] iArrA = new int[20];
        int i4 = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == i3 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                TypedArray typedArrayG = g(resources, theme, attributeSet, p048m.c.f9772b);
                int resourceId = typedArrayG.getResourceId(p048m.c.f9773c, -1);
                if (resourceId == -1 || e(resources, resourceId)) {
                    color = typedArrayG.getColor(p048m.c.f9773c, -65281);
                } else {
                    try {
                        color = a(resources, resources.getXml(resourceId), theme).getDefaultColor();
                    } catch (Exception unused) {
                        color = typedArrayG.getColor(p048m.c.f9773c, -65281);
                    }
                }
                float f3 = 1.0f;
                if (typedArrayG.hasValue(p048m.c.f9774d)) {
                    f3 = typedArrayG.getFloat(p048m.c.f9774d, 1.0f);
                } else if (typedArrayG.hasValue(p048m.c.f9776f)) {
                    f3 = typedArrayG.getFloat(p048m.c.f9776f, 1.0f);
                }
                float f4 = (Build.VERSION.SDK_INT < 31 || !typedArrayG.hasValue(p048m.c.f9775e)) ? typedArrayG.getFloat(p048m.c.f9777g, -1.0f) : typedArrayG.getFloat(p048m.c.f9775e, -1.0f);
                typedArrayG.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr2 = new int[attributeCount];
                int i5 = 0;
                for (int i6 = 0; i6 < attributeCount; i6++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i6);
                    if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != p048m.a.f9721a && attributeNameResource != p048m.a.f9722b) {
                        int i7 = i5 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i6, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr2[i5] = attributeNameResource;
                        i5 = i7;
                    }
                }
                int[] iArrTrimStateSet = StateSet.trimStateSet(iArr2, i5);
                iArrA = e.a(iArrA, i4, f(color, f3, f4));
                iArr = (int[][]) e.b(iArr, i4, iArrTrimStateSet);
                i4++;
            }
            i3 = 1;
        }
        int[] iArr3 = new int[i4];
        int[][] iArr4 = new int[i4][];
        System.arraycopy(iArrA, 0, iArr3, 0, i4);
        System.arraycopy(iArr, 0, iArr4, 0, i4);
        return new ColorStateList(iArr4, iArr3);
    }

    private static boolean e(Resources resources, int i3) {
        TypedValue typedValueC = c();
        resources.getValue(i3, typedValueC, true);
        int i4 = typedValueC.type;
        return i4 >= 28 && i4 <= 31;
    }

    private static int f(int i3, float f3, float f4) {
        boolean z3 = f4 >= 0.0f && f4 <= 100.0f;
        if (f3 == 1.0f && !z3) {
            return i3;
        }
        int iA = p056o.a.a((int) ((Color.alpha(i3) * f3) + 0.5f), 0, 255);
        if (z3) {
            a aVarC = a.c(i3);
            i3 = a.m(aVarC.j(), aVarC.i(), f4);
        }
        return (i3 & 16777215) | (iA << 24);
    }

    private static TypedArray g(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}
