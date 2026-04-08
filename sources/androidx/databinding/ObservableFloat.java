package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class ObservableFloat extends BaseObservableField implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableFloat> CREATOR = new C14941();

    /* JADX INFO: renamed from: a */
    public float f23664a;

    /* JADX INFO: renamed from: androidx.databinding.ObservableFloat$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C14941 implements Parcelable.Creator<ObservableFloat> {
        @Override // android.os.Parcelable.Creator
        public final ObservableFloat createFromParcel(Parcel parcel) {
            float f = parcel.readFloat();
            ObservableFloat observableFloat = new ObservableFloat();
            observableFloat.f23664a = f;
            return observableFloat;
        }

        @Override // android.os.Parcelable.Creator
        public final ObservableFloat[] newArray(int i) {
            return new ObservableFloat[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f23664a);
    }
}
