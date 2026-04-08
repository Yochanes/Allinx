package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class ObservableBoolean extends BaseObservableField implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableBoolean> CREATOR = new C14901();

    /* JADX INFO: renamed from: a */
    public boolean f23659a;

    /* JADX INFO: renamed from: androidx.databinding.ObservableBoolean$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C14901 implements Parcelable.Creator<ObservableBoolean> {
        @Override // android.os.Parcelable.Creator
        public final ObservableBoolean createFromParcel(Parcel parcel) {
            boolean z2 = parcel.readInt() == 1;
            ObservableBoolean observableBoolean = new ObservableBoolean();
            observableBoolean.f23659a = z2;
            return observableBoolean;
        }

        @Override // android.os.Parcelable.Creator
        public final ObservableBoolean[] newArray(int i) {
            return new ObservableBoolean[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f23659a ? 1 : 0);
    }
}
