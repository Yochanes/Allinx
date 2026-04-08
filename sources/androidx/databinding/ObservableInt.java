package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class ObservableInt extends BaseObservableField implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableInt> CREATOR = new C14951();

    /* JADX INFO: renamed from: a */
    public int f23665a;

    /* JADX INFO: renamed from: androidx.databinding.ObservableInt$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C14951 implements Parcelable.Creator<ObservableInt> {
        @Override // android.os.Parcelable.Creator
        public final ObservableInt createFromParcel(Parcel parcel) {
            int i = parcel.readInt();
            ObservableInt observableInt = new ObservableInt();
            observableInt.f23665a = i;
            return observableInt;
        }

        @Override // android.os.Parcelable.Creator
        public final ObservableInt[] newArray(int i) {
            return new ObservableInt[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f23665a);
    }
}
