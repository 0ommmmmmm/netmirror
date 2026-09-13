package p088w;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Parcelable f10913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f10912b = new C0151a();
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* JADX INFO: renamed from: w.a$a, reason: collision with other inner class name */
    static class C0151a extends a {
        C0151a() {
            super((C0151a) null);
        }
    }

    static class b implements Parcelable.ClassLoaderCreator {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return a.f10912b;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i3) {
            return new a[i3];
        }
    }

    /* synthetic */ a(C0151a c0151a) {
        this();
    }

    public final Parcelable a() {
        return this.f10913a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        parcel.writeParcelable(this.f10913a, i3);
    }

    private a() {
        this.f10913a = null;
    }

    protected a(Parcelable parcelable) {
        if (parcelable != null) {
            this.f10913a = parcelable == f10912b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    protected a(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.f10913a = parcelable == null ? f10912b : parcelable;
    }
}
