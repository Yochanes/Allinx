package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class ObservableDouble extends BaseObservableField implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableDouble> CREATOR = new C14931();

    /* JADX INFO: renamed from: a */
    public double f23662a;

    /* JADX INFO: renamed from: androidx.databinding.ObservableDouble$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C14931 implements Parcelable.Creator<ObservableDouble> {
        @Override // android.os.Parcelable.Creator
        public final ObservableDouble createFromParcel(Parcel parcel) {
            double d = parcel.readDouble();
            ObservableDouble observableDouble = new ObservableDouble();
            observableDouble.f23662a = d;
            return observableDouble;
        }

        @Override // android.os.Parcelable.Creator
        public final ObservableDouble[] newArray(int i) {
            return new ObservableDouble[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.f23662a);
    }
}
