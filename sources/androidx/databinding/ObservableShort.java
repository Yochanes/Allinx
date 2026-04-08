package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class ObservableShort extends BaseObservableField implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableShort> CREATOR = new C14981();

    /* JADX INFO: renamed from: a */
    public short f23667a;

    /* JADX INFO: renamed from: androidx.databinding.ObservableShort$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C14981 implements Parcelable.Creator<ObservableShort> {
        @Override // android.os.Parcelable.Creator
        public final ObservableShort createFromParcel(Parcel parcel) {
            short s = (short) parcel.readInt();
            ObservableShort observableShort = new ObservableShort();
            observableShort.f23667a = s;
            return observableShort;
        }

        @Override // android.os.Parcelable.Creator
        public final ObservableShort[] newArray(int i) {
            return new ObservableShort[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f23667a);
    }
}
