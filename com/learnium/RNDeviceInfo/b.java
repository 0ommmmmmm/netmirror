package com.learnium.RNDeviceInfo;

import com.facebook.react.bridge.ReactApplicationContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p014d1.O;

/* JADX INFO: loaded from: classes.dex */
public class b implements O {
    @Override // p014d1.O
    public List e(ReactApplicationContext reactApplicationContext) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new RNDeviceModule(reactApplicationContext));
        return arrayList;
    }

    @Override // p014d1.O
    public List f(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }
}
