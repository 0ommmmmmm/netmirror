package com.facebook.react.devsupport;

import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;
import p014d1.AbstractC0462m;
import p014d1.AbstractC0464o;

/* JADX INFO: loaded from: classes.dex */
public final class g0 extends LinearLayout implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p042k1.e f6705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ListView f6706c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final k1.i.a f6707d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final View.OnClickListener f6708e;

    private static final class a extends AsyncTask {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C0102a f6709b = new C0102a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final M2.x f6710c = M2.x.f1251g.a("application/json; charset=utf-8");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final p042k1.e f6711a;

        /* JADX INFO: renamed from: com.facebook.react.devsupport.g0$a$a, reason: collision with other inner class name */
        public static final class C0102a {
            public /* synthetic */ C0102a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final JSONObject b(p042k1.j jVar) {
                return new JSONObject(p075s2.D.h(p071r2.n.a("file", jVar.getFile()), p071r2.n.a("methodName", jVar.d()), p071r2.n.a("lineNumber", Integer.valueOf(jVar.c())), p071r2.n.a("column", Integer.valueOf(jVar.getColumn()))));
            }

            private C0102a() {
            }
        }

        public a(p042k1.e eVar) {
            D2.h.f(eVar, "devSupportManager");
            this.f6711a = eVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(p042k1.j... jVarArr) {
            D2.h.f(jVarArr, "stackFrames");
            try {
                String string = Uri.parse(this.f6711a.E()).buildUpon().path("/open-stack-frame").query(null).build().toString();
                D2.h.e(string, "toString(...)");
                M2.z zVar = new M2.z();
                for (p042k1.j jVar : jVarArr) {
                    C0102a c0102a = f6709b;
                    if (jVar == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    String string2 = c0102a.b(jVar).toString();
                    D2.h.e(string2, "toString(...)");
                    zVar.b(new M2.B.a().m(string).h(M2.C.f908a.b(f6710c, string2)).b()).a();
                }
            } catch (Exception e4) {
                Y.a.n("ReactNative", "Could not open stack frame", e4);
            }
            return null;
        }
    }

    private static final class b extends BaseAdapter {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f6712d = new a(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f6713b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final p042k1.j[] f6714c;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        /* JADX INFO: renamed from: com.facebook.react.devsupport.g0$b$b, reason: collision with other inner class name */
        private static final class C0103b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final TextView f6715a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final TextView f6716b;

            public C0103b(View view) {
                D2.h.f(view, "v");
                View viewFindViewById = view.findViewById(AbstractC0462m.f9250v);
                D2.h.e(viewFindViewById, "findViewById(...)");
                this.f6715a = (TextView) viewFindViewById;
                View viewFindViewById2 = view.findViewById(AbstractC0462m.f9249u);
                D2.h.e(viewFindViewById2, "findViewById(...)");
                this.f6716b = (TextView) viewFindViewById2;
            }

            public final TextView a() {
                return this.f6716b;
            }

            public final TextView b() {
                return this.f6715a;
            }
        }

        public b(String str, p042k1.j[] jVarArr) {
            D2.h.f(str, "title");
            D2.h.f(jVarArr, "stack");
            this.f6713b = str;
            this.f6714c = jVarArr;
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            return false;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.f6714c.length + 1;
        }

        @Override // android.widget.Adapter
        public Object getItem(int i3) {
            return i3 == 0 ? this.f6713b : this.f6714c[i3 - 1];
        }

        @Override // android.widget.Adapter
        public long getItemId(int i3) {
            return i3;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getItemViewType(int i3) {
            return i3 == 0 ? 0 : 1;
        }

        @Override // android.widget.Adapter
        public View getView(int i3, View view, ViewGroup viewGroup) {
            TextView textView;
            D2.h.f(viewGroup, "parent");
            if (i3 == 0) {
                if (view != null) {
                    textView = (TextView) view;
                } else {
                    View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC0464o.f9261f, viewGroup, false);
                    D2.h.d(viewInflate, "null cannot be cast to non-null type android.widget.TextView");
                    textView = (TextView) viewInflate;
                }
                textView.setText(new K2.k("\\x1b\\[[0-9;]*m").c(this.f6713b, ""));
                return textView;
            }
            if (view == null) {
                view = LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC0464o.f9260e, viewGroup, false);
                D2.h.c(view);
                view.setTag(new C0103b(view));
            }
            p042k1.j jVar = this.f6714c[i3 - 1];
            Object tag = view.getTag();
            D2.h.d(tag, "null cannot be cast to non-null type com.facebook.react.devsupport.RedBoxContentView.StackAdapter.FrameViewHolder");
            C0103b c0103b = (C0103b) tag;
            c0103b.b().setText(jVar.d());
            c0103b.a().setText(l0.c(jVar));
            c0103b.b().setTextColor(jVar.b() ? -5592406 : -1);
            c0103b.a().setTextColor(jVar.b() ? -8355712 : -5000269);
            return view;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getViewTypeCount() {
            return 2;
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public boolean isEnabled(int i3) {
            return i3 > 0;
        }
    }

    public static final class c implements k1.i.a {
        c() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(Context context, p042k1.e eVar, p042k1.i iVar) {
        super(context);
        D2.h.f(eVar, "devSupportManager");
        this.f6705b = eVar;
        this.f6707d = new c();
        this.f6708e = new View.OnClickListener() { // from class: com.facebook.react.devsupport.d0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                g0.h(this.f6695b, view);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(g0 g0Var, View view) {
        g0Var.f6705b.s();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(g0 g0Var, View view) {
        g0Var.f6705b.q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(g0 g0Var, View view) {
        g0Var.getClass();
    }

    public final void d() {
        LayoutInflater.from(getContext()).inflate(AbstractC0464o.f9262g, this);
        ListView listView = (ListView) findViewById(AbstractC0462m.f9253y);
        listView.setOnItemClickListener(this);
        this.f6706c = listView;
        ((Button) findViewById(AbstractC0462m.f9252x)).setOnClickListener(new View.OnClickListener() { // from class: com.facebook.react.devsupport.e0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                g0.e(this.f6697b, view);
            }
        });
        ((Button) findViewById(AbstractC0462m.f9251w)).setOnClickListener(new View.OnClickListener() { // from class: com.facebook.react.devsupport.f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                g0.f(this.f6700b, view);
            }
        });
    }

    public final void g() {
        String strL = this.f6705b.l();
        p042k1.j[] jVarArrW = this.f6705b.w();
        if (jVarArrW == null) {
            jVarArrW = new p042k1.j[0];
        }
        if (this.f6705b.B() == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Pair pairY = this.f6705b.y(Pair.create(strL, jVarArrW));
        if (pairY == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Object obj = pairY.first;
        D2.h.e(obj, "first");
        Object obj2 = pairY.second;
        D2.h.e(obj2, "second");
        i((String) obj, (p042k1.j[]) obj2);
        this.f6705b.t();
    }

    public final void i(String str, p042k1.j[] jVarArr) {
        D2.h.f(str, "title");
        D2.h.f(jVarArr, "stack");
        ListView listView = this.f6706c;
        if (listView == null) {
            D2.h.s("stackView");
            listView = null;
        }
        listView.setAdapter((ListAdapter) new b(str, jVarArr));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i3, long j3) {
        D2.h.f(view, "view");
        a aVar = new a(this.f6705b);
        Executor executor = AsyncTask.THREAD_POOL_EXECUTOR;
        p042k1.j[] jVarArr = new p042k1.j[1];
        ListView listView = this.f6706c;
        if (listView == null) {
            D2.h.s("stackView");
            listView = null;
        }
        Object item = listView.getAdapter().getItem(i3);
        D2.h.d(item, "null cannot be cast to non-null type com.facebook.react.devsupport.interfaces.StackFrame");
        jVarArr[0] = item;
        aVar.executeOnExecutor(executor, jVarArr);
    }
}
