package p035i2;

/* JADX INFO: loaded from: classes.dex */
public enum a {
    UNKNOW("", 0),
    WIFI("android.settings.WIFI_SETTINGS", 1),
    LOCATION("android.settings.LOCATION_SOURCE_SETTINGS", 2),
    BLUETOOTH("android.settings.BLUETOOTH_SETTINGS", 3),
    WRITESETTINGS("android.settings.action.MANAGE_WRITE_SETTINGS", 4),
    AIRPLANE("android.settings.AIRPLANE_MODE_SETTINGS", 5);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f9533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9534c;

    a(String str, int i3) {
        this.f9533b = str;
        this.f9534c = i3;
    }

    public static a b(int i3) {
        for (a aVar : values()) {
            if (aVar.f9534c == i3) {
                return aVar;
            }
        }
        return UNKNOW;
    }
}
