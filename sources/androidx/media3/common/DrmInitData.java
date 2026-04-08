package androidx.media3.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.UUID;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class DrmInitData implements Comparator<SchemeData>, Parcelable {
    public static final Parcelable.Creator<DrmInitData> CREATOR = new C17271();

    /* JADX INFO: renamed from: a */
    public final SchemeData[] f25121a;

    /* JADX INFO: renamed from: b */
    public int f25122b;

    /* JADX INFO: renamed from: c */
    public final String f25123c;

    /* JADX INFO: renamed from: d */
    public final int f25124d;

    /* JADX INFO: renamed from: androidx.media3.common.DrmInitData$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C17271 implements Parcelable.Creator<DrmInitData> {
        @Override // android.os.Parcelable.Creator
        public final DrmInitData createFromParcel(Parcel parcel) {
            return new DrmInitData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final DrmInitData[] newArray(int i) {
            return new DrmInitData[i];
        }
    }

    public DrmInitData(SchemeData... schemeDataArr) {
        this(null, true, schemeDataArr);
    }

    /* JADX INFO: renamed from: a */
    public final DrmInitData m9240a(String str) {
        return Objects.equals(this.f25123c, str) ? this : new DrmInitData(str, false, this.f25121a);
    }

    @Override // java.util.Comparator
    public final int compare(SchemeData schemeData, SchemeData schemeData2) {
        SchemeData schemeData3 = schemeData;
        SchemeData schemeData4 = schemeData2;
        UUID uuid = C1724C.f25099a;
        return uuid.equals(schemeData3.f25126b) ? uuid.equals(schemeData4.f25126b) ? 0 : 1 : schemeData3.f25126b.compareTo(schemeData4.f25126b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && DrmInitData.class == obj.getClass()) {
            DrmInitData drmInitData = (DrmInitData) obj;
            if (Objects.equals(this.f25123c, drmInitData.f25123c) && Arrays.equals(this.f25121a, drmInitData.f25121a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f25122b == 0) {
            String str = this.f25123c;
            this.f25122b = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f25121a);
        }
        return this.f25122b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f25123c);
        parcel.writeTypedArray(this.f25121a, 0);
    }

    public DrmInitData(String str, boolean z2, SchemeData... schemeDataArr) {
        this.f25123c = str;
        schemeDataArr = z2 ? (SchemeData[]) schemeDataArr.clone() : schemeDataArr;
        this.f25121a = schemeDataArr;
        this.f25124d = schemeDataArr.length;
        Arrays.sort(schemeDataArr, this);
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class SchemeData implements Parcelable {
        public static final Parcelable.Creator<SchemeData> CREATOR = new C17281();

        /* JADX INFO: renamed from: a */
        public int f25125a;

        /* JADX INFO: renamed from: b */
        public final UUID f25126b;

        /* JADX INFO: renamed from: c */
        public final String f25127c;

        /* JADX INFO: renamed from: d */
        public final String f25128d;

        /* JADX INFO: renamed from: f */
        public final byte[] f25129f;

        /* JADX INFO: renamed from: androidx.media3.common.DrmInitData$SchemeData$1 */
        /* JADX INFO: compiled from: Proguard */
        public class C17281 implements Parcelable.Creator<SchemeData> {
            @Override // android.os.Parcelable.Creator
            public final SchemeData createFromParcel(Parcel parcel) {
                return new SchemeData(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final SchemeData[] newArray(int i) {
                return new SchemeData[i];
            }
        }

        public SchemeData(UUID uuid, String str, String str2, byte[] bArr) {
            uuid.getClass();
            this.f25126b = uuid;
            this.f25127c = str;
            str2.getClass();
            this.f25128d = MimeTypes.m9342m(str2);
            this.f25129f = bArr;
        }

        /* JADX INFO: renamed from: a */
        public final boolean m9241a(UUID uuid) {
            UUID uuid2 = C1724C.f25099a;
            UUID uuid3 = this.f25126b;
            return uuid2.equals(uuid3) || uuid.equals(uuid3);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof SchemeData)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            SchemeData schemeData = (SchemeData) obj;
            return Objects.equals(this.f25127c, schemeData.f25127c) && Objects.equals(this.f25128d, schemeData.f25128d) && Objects.equals(this.f25126b, schemeData.f25126b) && Arrays.equals(this.f25129f, schemeData.f25129f);
        }

        public final int hashCode() {
            if (this.f25125a == 0) {
                int iHashCode = this.f25126b.hashCode() * 31;
                String str = this.f25127c;
                this.f25125a = Arrays.hashCode(this.f25129f) + AbstractC0000a.m5b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f25128d);
            }
            return this.f25125a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            UUID uuid = this.f25126b;
            parcel.writeLong(uuid.getMostSignificantBits());
            parcel.writeLong(uuid.getLeastSignificantBits());
            parcel.writeString(this.f25127c);
            parcel.writeString(this.f25128d);
            parcel.writeByteArray(this.f25129f);
        }

        public SchemeData(Parcel parcel) {
            this.f25126b = new UUID(parcel.readLong(), parcel.readLong());
            this.f25127c = parcel.readString();
            String string = parcel.readString();
            int i = Util.f25665a;
            this.f25128d = string;
            this.f25129f = parcel.createByteArray();
        }
    }

    public DrmInitData(Parcel parcel) {
        this.f25123c = parcel.readString();
        SchemeData[] schemeDataArr = (SchemeData[]) parcel.createTypedArray(SchemeData.CREATOR);
        int i = Util.f25665a;
        this.f25121a = schemeDataArr;
        this.f25124d = schemeDataArr.length;
    }
}
