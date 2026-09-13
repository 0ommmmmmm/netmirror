package com.facebook.react.devsupport;

import android.os.Bundle;
import android.preference.PreferenceActivity;
import p014d1.AbstractC0465p;

/* JADX INFO: renamed from: com.facebook.react.devsupport.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0342l extends PreferenceActivity {
    @Override // android.preference.PreferenceActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(getApplication().getResources().getString(AbstractC0465p.f9293s));
        addPreferencesFromResource(p014d1.r.f9308a);
    }
}
