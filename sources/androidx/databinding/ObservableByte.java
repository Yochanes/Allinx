package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class ObservableByte extends BaseObservableField implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableByte> CREATOR = new C14911();

    /* JADX INFO: renamed from: a */
    public byte f23660a;

    /* JADX INFO: renamed from: androidx.databinding.ObservableByte$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C14911 implements Parcelable.Creator<ObservableByte> {
        @Override // android.os.Parcelable.Creator
        public final ObservableByte createFromParcel(Parcel parcel) {
            byte b2 = parcel.readByte();
            ObservableByte observableByte = new ObservableByte();
            observableByte.f23660a = b2;
            return observableByte;
        }

        @Override // android.os.Parcelable.Creator
        public final ObservableByte[] newArray(int i) {
            return new ObservableByte[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.f23660a);
    }
}
