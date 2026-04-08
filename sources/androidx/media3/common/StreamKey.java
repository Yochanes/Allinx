package androidx.media3.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class StreamKey implements Comparable<StreamKey>, Parcelable {
    public static final Parcelable.Creator<StreamKey> CREATOR = new C17361();

    /* JADX INFO: renamed from: a */
    public final int f25337a;

    /* JADX INFO: renamed from: b */
    public final int f25338b;

    /* JADX INFO: renamed from: c */
    public final int f25339c;

    /* JADX INFO: renamed from: androidx.media3.common.StreamKey$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C17361 implements Parcelable.Creator<StreamKey> {
        @Override // android.os.Parcelable.Creator
        public final StreamKey createFromParcel(Parcel parcel) {
            return new StreamKey(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final StreamKey[] newArray(int i) {
            return new StreamKey[i];
        }
    }

    static {
        Util.m9594D(0);
        Util.m9594D(1);
        Util.m9594D(2);
    }

    public StreamKey(Parcel parcel) {
        this.f25337a = parcel.readInt();
        this.f25338b = parcel.readInt();
        this.f25339c = parcel.readInt();
    }

    @Override // java.lang.Comparable
    public final int compareTo(StreamKey streamKey) {
        StreamKey streamKey2 = streamKey;
        int i = this.f25337a - streamKey2.f25337a;
        if (i != 0) {
            return i;
        }
        int i2 = this.f25338b - streamKey2.f25338b;
        return i2 == 0 ? this.f25339c - streamKey2.f25339c : i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && StreamKey.class == obj.getClass()) {
            StreamKey streamKey = (StreamKey) obj;
            if (this.f25337a == streamKey.f25337a && this.f25338b == streamKey.f25338b && this.f25339c == streamKey.f25339c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f25337a * 31) + this.f25338b) * 31) + this.f25339c;
    }

    public final String toString() {
        return this.f25337a + "." + this.f25338b + "." + this.f25339c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f25337a);
        parcel.writeInt(this.f25338b);
        parcel.writeInt(this.f25339c);
    }
}
