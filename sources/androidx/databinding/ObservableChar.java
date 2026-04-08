package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class ObservableChar extends BaseObservableField implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableChar> CREATOR = new C14921();

    /* JADX INFO: renamed from: a */
    public char f23661a;

    /* JADX INFO: renamed from: androidx.databinding.ObservableChar$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C14921 implements Parcelable.Creator<ObservableChar> {
        @Override // android.os.Parcelable.Creator
        public final ObservableChar createFromParcel(Parcel parcel) {
            char c2 = (char) parcel.readInt();
            ObservableChar observableChar = new ObservableChar();
            observableChar.f23661a = c2;
            return observableChar;
        }

        @Override // android.os.Parcelable.Creator
        public final ObservableChar[] newArray(int i) {
            return new ObservableChar[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f23661a);
    }
}
