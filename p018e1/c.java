package p018e1;

import D2.h;
import K2.k;
import K2.o;
import android.net.Uri;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;
import p075s2.AbstractC0486h;
import p075s2.AbstractC0492n;

/* JADX INFO: loaded from: classes.dex */
public final class c extends RuntimeException {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f9350c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f9351d = "\n\nTry the following to fix the issue:\n\\u2022 Ensure that Metro is running\n\\u2022 Ensure that your device/emulator is connected to your machine and has USB debugging enabled - run 'adb devices' to see a list of connected devices\n\\u2022 Ensure Airplane Mode is disabled\n\\u2022 If you're on a physical device connected to the same machine, run 'adb reverse tcp:<PORT> tcp:<PORT> to forward requests from your device\n\\u2022 If your device is on the same Wi-Fi network, set 'Debug server host & port for device' in 'Dev settings' to your machine's IP address and the port of the local dev server - e.g. 10.0.1.1:<PORT>\n\n";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f9352b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final String d(String str) {
            List listG;
            List listD = new k("/").d(str, 0);
            if (listD.isEmpty()) {
                listG = AbstractC0492n.g();
            } else {
                ListIterator listIterator = listD.listIterator(listD.size());
                while (listIterator.hasPrevious()) {
                    if (((String) listIterator.previous()).length() != 0) {
                        listG = AbstractC0492n.b0(listD, listIterator.nextIndex() + 1);
                    }
                }
                listG = AbstractC0492n.g();
            }
            return (String) AbstractC0486h.x((String[]) listG.toArray(new String[0]));
        }

        public final c a(String str, String str2, String str3, Throwable th) {
            h.f(str, "url");
            h.f(str2, "reason");
            h.f(str3, "extra");
            return new c(str2 + o.v(c.f9351d, "<PORT>", String.valueOf(Uri.parse(str).getPort()), false, 4, null) + str3, th);
        }

        public final c b(String str, String str2, Throwable th) {
            h.f(str, "url");
            h.f(str2, "reason");
            return a(str, str2, "", th);
        }

        public final c c(String str, String str2) {
            if (str2 != null && str2.length() != 0) {
                try {
                    JSONObject jSONObject = new JSONObject(str2);
                    String string = jSONObject.getString("filename");
                    String string2 = jSONObject.getString("message");
                    h.e(string2, "getString(...)");
                    h.c(string);
                    return new c(string2, d(string), jSONObject.getInt("lineNumber"), jSONObject.getInt("column"), null);
                } catch (JSONException e4) {
                    Y.a.J("ReactNative", "Could not parse DebugServerException from: " + str2, e4);
                }
            }
            return null;
        }

        private a() {
        }
    }

    public /* synthetic */ c(String str, String str2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i3, i4);
    }

    public static final c b(String str, String str2, String str3, Throwable th) {
        return f9350c.a(str, str2, str3, th);
    }

    public static final c c(String str, String str2, Throwable th) {
        return f9350c.b(str, str2, th);
    }

    public static final c d(String str, String str2) {
        return f9350c.c(str, str2);
    }

    private c(String str, String str2, int i3, int i4) {
        super(str + "\n  at " + str2 + ":" + i3 + ":" + i4);
        this.f9352b = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String str) {
        super(str);
        h.f(str, "description");
        this.f9352b = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String str, Throwable th) {
        super(str, th);
        h.f(str, "detailMessage");
        this.f9352b = str;
    }
}
