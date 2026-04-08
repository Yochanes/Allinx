package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class ObservableLong extends BaseObservableField implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableLong> CREATOR = new C14961();

    /* JADX INFO: renamed from: a */
    public long f23666a;

    /* JADX INFO: renamed from: androidx.databinding.ObservableLong$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C14961 implements Parcelable.Creator<ObservableLong> {
        @Override // android.os.Parcelable.Creator
        public final ObservableLong createFromParcel(Parcel parcel) {
            long j = parcel.readLong();
            ObservableLong observableLong = new ObservableLong();
            observableLong.f23666a = j;
            return observableLong;
        }

        @Override // android.os.Parcelable.Creator
        public final ObservableLong[] newArray(int i) {
            return new ObservableLong[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f23666a);
    }
}
