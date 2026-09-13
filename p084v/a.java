package p084v;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.FilterQueryProvider;
import android.widget.Filterable;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends BaseAdapter implements Filterable, v.b.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected boolean f10890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected boolean f10891c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected Cursor f10892d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected Context f10893e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected int f10894f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected C0148a f10895g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected DataSetObserver f10896h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected p084v.b f10897i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected FilterQueryProvider f10898j;

    /* JADX INFO: renamed from: v.a$a, reason: collision with other inner class name */
    private class C0148a extends ContentObserver {
        C0148a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z3) {
            a.this.i();
        }
    }

    private class b extends DataSetObserver {
        b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            a aVar = a.this;
            aVar.f10890b = true;
            aVar.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            a aVar = a.this;
            aVar.f10890b = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    @Deprecated
    public a(Context context, Cursor cursor) {
        f(context, cursor, 1);
    }

    public void a(Cursor cursor) {
        Cursor cursorJ = j(cursor);
        if (cursorJ != null) {
            cursorJ.close();
        }
    }

    @Override // v.b.a
    public Cursor b() {
        return this.f10892d;
    }

    public CharSequence c(Cursor cursor) {
        return cursor == null ? "" : cursor.toString();
    }

    public Cursor d(CharSequence charSequence) {
        FilterQueryProvider filterQueryProvider = this.f10898j;
        return filterQueryProvider != null ? filterQueryProvider.runQuery(charSequence) : this.f10892d;
    }

    public abstract void e(View view, Context context, Cursor cursor);

    void f(Context context, Cursor cursor, int i3) {
        if ((i3 & 1) == 1) {
            i3 |= 2;
            this.f10891c = true;
        } else {
            this.f10891c = false;
        }
        boolean z3 = cursor != null;
        this.f10892d = cursor;
        this.f10890b = z3;
        this.f10893e = context;
        this.f10894f = z3 ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i3 & 2) == 2) {
            this.f10895g = new C0148a();
            this.f10896h = new b();
        } else {
            this.f10895g = null;
            this.f10896h = null;
        }
        if (z3) {
            C0148a c0148a = this.f10895g;
            if (c0148a != null) {
                cursor.registerContentObserver(c0148a);
            }
            DataSetObserver dataSetObserver = this.f10896h;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    public View g(Context context, Cursor cursor, ViewGroup viewGroup) {
        return h(context, cursor, viewGroup);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f10890b || (cursor = this.f10892d) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i3, View view, ViewGroup viewGroup) {
        if (!this.f10890b) {
            return null;
        }
        this.f10892d.moveToPosition(i3);
        if (view == null) {
            view = g(this.f10893e, this.f10892d, viewGroup);
        }
        e(view, this.f10893e, this.f10892d);
        return view;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f10897i == null) {
            this.f10897i = new p084v.b(this);
        }
        return this.f10897i;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i3) {
        Cursor cursor;
        if (!this.f10890b || (cursor = this.f10892d) == null) {
            return null;
        }
        cursor.moveToPosition(i3);
        return this.f10892d;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i3) {
        Cursor cursor;
        if (this.f10890b && (cursor = this.f10892d) != null && cursor.moveToPosition(i3)) {
            return this.f10892d.getLong(this.f10894f);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i3, View view, ViewGroup viewGroup) {
        if (!this.f10890b) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (this.f10892d.moveToPosition(i3)) {
            if (view == null) {
                view = h(this.f10893e, this.f10892d, viewGroup);
            }
            e(view, this.f10893e, this.f10892d);
            return view;
        }
        throw new IllegalStateException("couldn't move cursor to position " + i3);
    }

    public abstract View h(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    protected void i() {
        Cursor cursor;
        if (!this.f10891c || (cursor = this.f10892d) == null || cursor.isClosed()) {
            return;
        }
        this.f10890b = this.f10892d.requery();
    }

    public Cursor j(Cursor cursor) {
        Cursor cursor2 = this.f10892d;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C0148a c0148a = this.f10895g;
            if (c0148a != null) {
                cursor2.unregisterContentObserver(c0148a);
            }
            DataSetObserver dataSetObserver = this.f10896h;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f10892d = cursor;
        if (cursor != null) {
            C0148a c0148a2 = this.f10895g;
            if (c0148a2 != null) {
                cursor.registerContentObserver(c0148a2);
            }
            DataSetObserver dataSetObserver2 = this.f10896h;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f10894f = cursor.getColumnIndexOrThrow("_id");
            this.f10890b = true;
            notifyDataSetChanged();
        } else {
            this.f10894f = -1;
            this.f10890b = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }

    public a(Context context, Cursor cursor, boolean z3) {
        f(context, cursor, z3 ? 1 : 2);
    }

    public a(Context context, Cursor cursor, int i3) {
        f(context, cursor, i3);
    }
}
