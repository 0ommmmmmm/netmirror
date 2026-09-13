package androidx.fragment.app;

import android.util.Log;
import java.io.PrintWriter;
import java.util.ArrayList;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: renamed from: androidx.fragment.app.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0272a extends F implements x.l {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final x f5056t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    boolean f5057u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    int f5058v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    boolean f5059w;

    C0272a(x xVar) {
        super(xVar.r0(), xVar.t0() != null ? xVar.t0().k().getClassLoader() : null);
        this.f5058v = -1;
        this.f5059w = false;
        this.f5056t = xVar;
    }

    @Override // androidx.fragment.app.x.l
    public boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (x.G0(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f4890i) {
            return true;
        }
        this.f5056t.i(this);
        return true;
    }

    @Override // androidx.fragment.app.F
    public int f() {
        return o(false);
    }

    @Override // androidx.fragment.app.F
    public int g() {
        return o(true);
    }

    @Override // androidx.fragment.app.F
    public void h() {
        j();
        this.f5056t.b0(this, false);
    }

    @Override // androidx.fragment.app.F
    public void i() {
        j();
        this.f5056t.b0(this, true);
    }

    @Override // androidx.fragment.app.F
    void k(int i3, Fragment fragment, String str, int i4) {
        super.k(i3, fragment, str, i4);
        fragment.f4958u = this.f5056t;
    }

    @Override // androidx.fragment.app.F
    public F l(Fragment fragment) {
        x xVar = fragment.f4958u;
        if (xVar == null || xVar == this.f5056t) {
            return super.l(fragment);
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    void n(int i3) {
        if (this.f4890i) {
            if (x.G0(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i3);
            }
            int size = this.f4884c.size();
            for (int i4 = 0; i4 < size; i4++) {
                F.a aVar = (F.a) this.f4884c.get(i4);
                Fragment fragment = aVar.f4902b;
                if (fragment != null) {
                    fragment.f4957t += i3;
                    if (x.G0(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f4902b + " to " + aVar.f4902b.f4957t);
                    }
                }
            }
        }
    }

    int o(boolean z3) {
        if (this.f5057u) {
            throw new IllegalStateException("commit already called");
        }
        if (x.G0(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new K("FragmentManager"));
            p("  ", printWriter);
            printWriter.close();
        }
        this.f5057u = true;
        if (this.f4890i) {
            this.f5058v = this.f5056t.l();
        } else {
            this.f5058v = -1;
        }
        this.f5056t.Y(this, z3);
        return this.f5058v;
    }

    public void p(String str, PrintWriter printWriter) {
        q(str, printWriter, true);
    }

    public void q(String str, PrintWriter printWriter, boolean z3) {
        String str2;
        if (z3) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f4892k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f5058v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f5057u);
            if (this.f4889h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f4889h));
            }
            if (this.f4885d != 0 || this.f4886e != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f4885d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f4886e));
            }
            if (this.f4887f != 0 || this.f4888g != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f4887f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f4888g));
            }
            if (this.f4893l != 0 || this.f4894m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f4893l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f4894m);
            }
            if (this.f4895n != 0 || this.f4896o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f4895n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f4896o);
            }
        }
        if (this.f4884c.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f4884c.size();
        for (int i3 = 0; i3 < size; i3++) {
            F.a aVar = (F.a) this.f4884c.get(i3);
            switch (aVar.f4901a) {
                case WebSettingsBoundaryInterface.ForceDarkBehavior.FORCE_DARK_ONLY /* 0 */:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + aVar.f4901a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i3);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.f4902b);
            if (z3) {
                if (aVar.f4904d != 0 || aVar.f4905e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f4904d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f4905e));
                }
                if (aVar.f4906f != 0 || aVar.f4907g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f4906f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f4907g));
                }
            }
        }
    }

    void r() {
        int size = this.f4884c.size();
        for (int i3 = 0; i3 < size; i3++) {
            F.a aVar = (F.a) this.f4884c.get(i3);
            Fragment fragment = aVar.f4902b;
            if (fragment != null) {
                fragment.f4952o = this.f5059w;
                fragment.v1(false);
                fragment.u1(this.f4889h);
                fragment.x1(this.f4897p, this.f4898q);
            }
            switch (aVar.f4901a) {
                case 1:
                    fragment.r1(aVar.f4904d, aVar.f4905e, aVar.f4906f, aVar.f4907g);
                    this.f5056t.j1(fragment, false);
                    this.f5056t.j(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f4901a);
                case 3:
                    fragment.r1(aVar.f4904d, aVar.f4905e, aVar.f4906f, aVar.f4907g);
                    this.f5056t.c1(fragment);
                    break;
                case 4:
                    fragment.r1(aVar.f4904d, aVar.f4905e, aVar.f4906f, aVar.f4907g);
                    this.f5056t.D0(fragment);
                    break;
                case 5:
                    fragment.r1(aVar.f4904d, aVar.f4905e, aVar.f4906f, aVar.f4907g);
                    this.f5056t.j1(fragment, false);
                    this.f5056t.n1(fragment);
                    break;
                case 6:
                    fragment.r1(aVar.f4904d, aVar.f4905e, aVar.f4906f, aVar.f4907g);
                    this.f5056t.w(fragment);
                    break;
                case 7:
                    fragment.r1(aVar.f4904d, aVar.f4905e, aVar.f4906f, aVar.f4907g);
                    this.f5056t.j1(fragment, false);
                    this.f5056t.n(fragment);
                    break;
                case 8:
                    this.f5056t.l1(fragment);
                    break;
                case 9:
                    this.f5056t.l1(null);
                    break;
                case 10:
                    this.f5056t.k1(fragment, aVar.f4909i);
                    break;
            }
        }
    }

    void s() {
        for (int size = this.f4884c.size() - 1; size >= 0; size--) {
            F.a aVar = (F.a) this.f4884c.get(size);
            Fragment fragment = aVar.f4902b;
            if (fragment != null) {
                fragment.f4952o = this.f5059w;
                fragment.v1(true);
                fragment.u1(x.g1(this.f4889h));
                fragment.x1(this.f4898q, this.f4897p);
            }
            switch (aVar.f4901a) {
                case 1:
                    fragment.r1(aVar.f4904d, aVar.f4905e, aVar.f4906f, aVar.f4907g);
                    this.f5056t.j1(fragment, true);
                    this.f5056t.c1(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f4901a);
                case 3:
                    fragment.r1(aVar.f4904d, aVar.f4905e, aVar.f4906f, aVar.f4907g);
                    this.f5056t.j(fragment);
                    break;
                case 4:
                    fragment.r1(aVar.f4904d, aVar.f4905e, aVar.f4906f, aVar.f4907g);
                    this.f5056t.n1(fragment);
                    break;
                case 5:
                    fragment.r1(aVar.f4904d, aVar.f4905e, aVar.f4906f, aVar.f4907g);
                    this.f5056t.j1(fragment, true);
                    this.f5056t.D0(fragment);
                    break;
                case 6:
                    fragment.r1(aVar.f4904d, aVar.f4905e, aVar.f4906f, aVar.f4907g);
                    this.f5056t.n(fragment);
                    break;
                case 7:
                    fragment.r1(aVar.f4904d, aVar.f4905e, aVar.f4906f, aVar.f4907g);
                    this.f5056t.j1(fragment, true);
                    this.f5056t.w(fragment);
                    break;
                case 8:
                    this.f5056t.l1(null);
                    break;
                case 9:
                    this.f5056t.l1(fragment);
                    break;
                case 10:
                    this.f5056t.k1(fragment, aVar.f4908h);
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00b6  */
    Fragment t(ArrayList arrayList, Fragment fragment) {
        Fragment fragment2 = fragment;
        int i3 = 0;
        while (i3 < this.f4884c.size()) {
            F.a aVar = (F.a) this.f4884c.get(i3);
            int i4 = aVar.f4901a;
            if (i4 == 1) {
                arrayList.add(aVar.f4902b);
            } else if (i4 == 2) {
                Fragment fragment3 = aVar.f4902b;
                int i5 = fragment3.f4963z;
                boolean z3 = false;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    Fragment fragment4 = (Fragment) arrayList.get(size);
                    if (fragment4.f4963z == i5) {
                        if (fragment4 == fragment3) {
                            z3 = true;
                        } else {
                            if (fragment4 == fragment2) {
                                this.f4884c.add(i3, new F.a(9, fragment4, true));
                                i3++;
                                fragment2 = null;
                            }
                            F.a aVar2 = new F.a(3, fragment4, true);
                            aVar2.f4904d = aVar.f4904d;
                            aVar2.f4906f = aVar.f4906f;
                            aVar2.f4905e = aVar.f4905e;
                            aVar2.f4907g = aVar.f4907g;
                            this.f4884c.add(i3, aVar2);
                            arrayList.remove(fragment4);
                            i3++;
                        }
                    }
                }
                if (z3) {
                    this.f4884c.remove(i3);
                    i3--;
                } else {
                    aVar.f4901a = 1;
                    aVar.f4903c = true;
                    arrayList.add(fragment3);
                }
            } else if (i4 == 3 || i4 == 6) {
                arrayList.remove(aVar.f4902b);
                Fragment fragment5 = aVar.f4902b;
                if (fragment5 == fragment2) {
                    this.f4884c.add(i3, new F.a(9, fragment5));
                    i3++;
                    fragment2 = null;
                }
            } else if (i4 == 7) {
                arrayList.add(aVar.f4902b);
            } else if (i4 == 8) {
                this.f4884c.add(i3, new F.a(9, fragment2, true));
                aVar.f4903c = true;
                i3++;
                fragment2 = aVar.f4902b;
            }
            i3++;
        }
        return fragment2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f5058v >= 0) {
            sb.append(" #");
            sb.append(this.f5058v);
        }
        if (this.f4892k != null) {
            sb.append(" ");
            sb.append(this.f4892k);
        }
        sb.append("}");
        return sb.toString();
    }

    public String u() {
        return this.f4892k;
    }

    public void v() {
        if (this.f4900s != null) {
            for (int i3 = 0; i3 < this.f4900s.size(); i3++) {
                ((Runnable) this.f4900s.get(i3)).run();
            }
            this.f4900s = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0027  */
    /* JADX WARN: Code duplicated, block: B:14:0x002d  */
    Fragment w(ArrayList arrayList, Fragment fragment) {
        for (int size = this.f4884c.size() - 1; size >= 0; size--) {
            F.a aVar = (F.a) this.f4884c.get(size);
            int i3 = aVar.f4901a;
            if (i3 == 1) {
                arrayList.remove(aVar.f4902b);
            } else if (i3 != 3) {
                switch (i3) {
                    case 6:
                        arrayList.add(aVar.f4902b);
                        break;
                    case 7:
                        arrayList.remove(aVar.f4902b);
                        break;
                    case 8:
                        fragment = null;
                        break;
                    case 9:
                        fragment = aVar.f4902b;
                        break;
                    case 10:
                        aVar.f4909i = aVar.f4908h;
                        break;
                }
            } else {
                arrayList.add(aVar.f4902b);
            }
        }
        return fragment;
    }
}
