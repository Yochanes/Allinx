package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
class BackStackState implements Parcelable {
    public static final Parcelable.Creator<BackStackState> CREATOR = new C16461();

    /* JADX INFO: renamed from: a */
    public final ArrayList f24488a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f24489b;

    /* JADX INFO: renamed from: androidx.fragment.app.BackStackState$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C16461 implements Parcelable.Creator<BackStackState> {
        @Override // android.os.Parcelable.Creator
        public final BackStackState createFromParcel(Parcel parcel) {
            return new BackStackState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final BackStackState[] newArray(int i) {
            return new BackStackState[i];
        }
    }

    public BackStackState(Parcel parcel) {
        this.f24488a = parcel.createStringArrayList();
        this.f24489b = parcel.createTypedArrayList(BackStackRecordState.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f24488a);
        parcel.writeTypedList(this.f24489b);
    }
}
