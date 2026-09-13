package com.reactnativecommunity.blurview;

import com.facebook.react.bridge.ReactApplicationContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p014d1.O;

/* JADX INFO: loaded from: classes.dex */
public class b implements O {
    @Override // p014d1.O
    public List e(ReactApplicationContext reactApplicationContext) {
        return new ArrayList();
    }

    @Override // p014d1.O
    public List f(ReactApplicationContext reactApplicationContext) {
        return Collections.singletonList(new BlurViewManager(reactApplicationContext));
    }
}
