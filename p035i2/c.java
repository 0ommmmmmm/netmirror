package p035i2;

import com.facebook.react.bridge.ReactApplicationContext;
import com.ninty.system.setting.SystemSetting;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p014d1.O;

/* JADX INFO: loaded from: classes.dex */
public class c implements O {
    @Override // p014d1.O
    public List e(ReactApplicationContext reactApplicationContext) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new SystemSetting(reactApplicationContext));
        return arrayList;
    }

    @Override // p014d1.O
    public List f(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }
}
