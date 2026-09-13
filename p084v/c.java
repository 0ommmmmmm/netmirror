package p084v;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f10902k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f10903l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private LayoutInflater f10904m;

    @Deprecated
    public c(Context context, int i3, Cursor cursor) {
        super(context, cursor);
        this.f10903l = i3;
        this.f10902k = i3;
        this.f10904m = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // p084v.a
    public View g(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f10904m.inflate(this.f10903l, viewGroup, false);
    }

    @Override // p084v.a
    public View h(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f10904m.inflate(this.f10902k, viewGroup, false);
    }

    @Deprecated
    public c(Context context, int i3, Cursor cursor, boolean z3) {
        super(context, cursor, z3);
        this.f10903l = i3;
        this.f10902k = i3;
        this.f10904m = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public c(Context context, int i3, Cursor cursor, int i4) {
        super(context, cursor, i4);
        this.f10903l = i3;
        this.f10902k = i3;
        this.f10904m = (LayoutInflater) context.getSystemService("layout_inflater");
    }
}
