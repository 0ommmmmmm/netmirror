package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: renamed from: androidx.fragment.app.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C0274c implements Parcelable {
    public static final Parcelable.Creator<C0274c> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final List f5074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final List f5075b;

    /* JADX INFO: renamed from: androidx.fragment.app.c$a */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0274c createFromParcel(Parcel parcel) {
            return new C0274c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C0274c[] newArray(int i3) {
            return new C0274c[i3];
        }
    }

    C0274c(Parcel parcel) {
        this.f5074a = parcel.createStringArrayList();
        this.f5075b = parcel.createTypedArrayList(C0273b.CREATOR);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        parcel.writeStringList(this.f5074a);
        parcel.writeTypedList(this.f5075b);
    }
}
