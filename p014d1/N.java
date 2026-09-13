package p014d1;

import android.app.Application;
import com.facebook.react.bridge.JSExceptionHandler;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.UIManagerProvider;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.devsupport.H;
import java.util.Iterator;
import java.util.List;
import p018e1.j;
import p018e1.k;
import p042k1.c;
import p042k1.h;
import p042k1.i;
import p066q1.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Application f9150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private J f9151b;

    class a implements k {
        a() {
        }

        @Override // p018e1.k
        public j g(String str) {
            return null;
        }
    }

    protected N(Application application) {
        this.f9150a = application;
    }

    protected J a() {
        ReactMarker.logMarker(ReactMarkerConstants.BUILD_REACT_INSTANCE_MANAGER_START);
        M mB = b();
        ReactMarker.logMarker(ReactMarkerConstants.BUILD_REACT_INSTANCE_MANAGER_END);
        return mB.b();
    }

    protected M b() {
        M mP = J.u().d(this.f9150a).n(j()).w(u()).h(f()).g(e()).t(r()).u(s()).m(i()).p(l());
        q();
        M mQ = mP.s(null).o(k()).v(t()).i(LifecycleState.BEFORE_CREATE).r(p()).l(h()).f(d()).q(n());
        Iterator it = m().iterator();
        while (it.hasNext()) {
            mQ.a((O) it.next());
        }
        String strG = g();
        if (strG != null) {
            mQ.j(strG);
        } else {
            mQ.e((String) p002a1.a.c(c()));
        }
        return mQ;
    }

    protected String c() {
        return "index.android.bundle";
    }

    protected b d() {
        return null;
    }

    protected c e() {
        return null;
    }

    protected H f() {
        return null;
    }

    protected String g() {
        return null;
    }

    protected abstract EnumC0455f h();

    protected JSExceptionHandler i() {
        return null;
    }

    protected abstract String j();

    protected JavaScriptExecutorFactory k() {
        return null;
    }

    public boolean l() {
        return false;
    }

    protected abstract List m();

    protected h n() {
        return null;
    }

    public synchronized J o() {
        try {
            if (this.f9151b == null) {
                ReactMarker.logMarker(ReactMarkerConstants.INIT_REACT_RUNTIME_START);
                ReactMarker.logMarker(ReactMarkerConstants.GET_REACT_INSTANCE_MANAGER_START);
                this.f9151b = a();
                ReactMarker.logMarker(ReactMarkerConstants.GET_REACT_INSTANCE_MANAGER_END);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f9151b;
    }

    protected abstract V.a p();

    protected i q() {
        return null;
    }

    public boolean r() {
        return true;
    }

    public k s() {
        return new a();
    }

    protected abstract UIManagerProvider t();

    public abstract boolean u();

    public synchronized boolean v() {
        return this.f9151b != null;
    }
}
