package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class ObservableParcelable<T extends Parcelable> extends ObservableField<T> implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableParcelable> CREATOR = new C14971();

    /* JADX INFO: renamed from: androidx.databinding.ObservableParcelable$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C14971 implements Parcelable.Creator<ObservableParcelable> {
        @Override // android.os.Parcelable.Creator
        public final ObservableParcelable createFromParcel(Parcel parcel) {
            Parcelable parcelable = parcel.readParcelable(getClass().getClassLoader());
            ObservableParcelable observableParcelable = new ObservableParcelable();
            observableParcelable.f23663a = parcelable;
            return observableParcelable;
        }

        @Override // android.os.Parcelable.Creator
        public final ObservableParcelable[] newArray(int i) {
            return new ObservableParcelable[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f23663a, 0);
    }
}
