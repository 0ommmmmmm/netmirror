package p039j2;

import com.facebook.react.bridge.ReactApplicationContext;
import com.reactnativecommunity.netinfo.NetInfoModule;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p014d1.O;

/* JADX INFO: loaded from: classes.dex */
public class e implements O {
    @Override // p014d1.O
    public List e(ReactApplicationContext reactApplicationContext) {
        return Arrays.asList(new NetInfoModule(reactApplicationContext));
    }

    @Override // p014d1.O
    public List f(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }
}
