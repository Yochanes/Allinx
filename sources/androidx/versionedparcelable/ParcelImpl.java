package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
@RestrictTo
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new C22381();

    /* JADX INFO: renamed from: a */
    public final VersionedParcelable f32409a;

    /* JADX INFO: renamed from: androidx.versionedparcelable.ParcelImpl$1 */
    /* JADX INFO: compiled from: Proguard */
    public static class C22381 implements Parcelable.Creator<ParcelImpl> {
        @Override // android.os.Parcelable.Creator
        public final ParcelImpl createFromParcel(Parcel parcel) {
            return new ParcelImpl(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ParcelImpl[] newArray(int i) {
            return new ParcelImpl[i];
        }
    }

    public ParcelImpl(Parcel parcel) {
        this.f32409a = new VersionedParcelParcel(parcel).m12049n();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new VersionedParcelParcel(parcel).m12058w(this.f32409a);
    }
}
