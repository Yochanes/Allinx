package androidx.media3.exoplayer.offline;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.StreamKey;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class DownloadRequest implements Parcelable {
    public static final Parcelable.Creator<DownloadRequest> CREATOR = new C18551();

    /* JADX INFO: renamed from: a */
    public final String f27074a;

    /* JADX INFO: renamed from: b */
    public final Uri f27075b;

    /* JADX INFO: renamed from: c */
    public final String f27076c;

    /* JADX INFO: renamed from: d */
    public final List f27077d;

    /* JADX INFO: renamed from: f */
    public final byte[] f27078f;

    /* JADX INFO: renamed from: g */
    public final String f27079g;

    /* JADX INFO: renamed from: i */
    public final byte[] f27080i;

    /* JADX INFO: renamed from: j */
    public final ByteRange f27081j;

    /* JADX INFO: renamed from: androidx.media3.exoplayer.offline.DownloadRequest$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C18551 implements Parcelable.Creator<DownloadRequest> {
        @Override // android.os.Parcelable.Creator
        public final DownloadRequest createFromParcel(Parcel parcel) {
            return new DownloadRequest(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final DownloadRequest[] newArray(int i) {
            return new DownloadRequest[i];
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class Builder {
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ByteRange implements Parcelable {
        public static final Parcelable.Creator<ByteRange> CREATOR = new C18561();

        /* JADX INFO: renamed from: a */
        public final long f27082a;

        /* JADX INFO: renamed from: b */
        public final long f27083b;

        /* JADX INFO: renamed from: androidx.media3.exoplayer.offline.DownloadRequest$ByteRange$1 */
        /* JADX INFO: compiled from: Proguard */
        public class C18561 implements Parcelable.Creator<ByteRange> {
            @Override // android.os.Parcelable.Creator
            public final ByteRange createFromParcel(Parcel parcel) {
                return new ByteRange(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final ByteRange[] newArray(int i) {
                return new ByteRange[i];
            }
        }

        public ByteRange(Parcel parcel) {
            long j = parcel.readLong();
            long j2 = parcel.readLong();
            Assertions.m9460a(j >= 0);
            Assertions.m9460a(j2 >= 0 || j2 == -1);
            this.f27082a = j;
            this.f27083b = j2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof ByteRange)) {
                return false;
            }
            ByteRange byteRange = (ByteRange) obj;
            return this.f27082a == byteRange.f27082a && this.f27083b == byteRange.f27083b;
        }

        public final int hashCode() {
            return (((int) this.f27082a) * 961) + ((int) this.f27083b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.f27082a);
            parcel.writeLong(this.f27083b);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class UnsupportedRequestException extends IOException {
    }

    public DownloadRequest(Parcel parcel) {
        String string = parcel.readString();
        int i = Util.f25665a;
        this.f27074a = string;
        this.f27075b = Uri.parse(parcel.readString());
        this.f27076c = parcel.readString();
        int i2 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add((StreamKey) parcel.readParcelable(StreamKey.class.getClassLoader()));
        }
        this.f27077d = Collections.unmodifiableList(arrayList);
        this.f27078f = parcel.createByteArray();
        this.f27079g = parcel.readString();
        this.f27080i = parcel.createByteArray();
        this.f27081j = (ByteRange) parcel.readParcelable(ByteRange.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof DownloadRequest)) {
            return false;
        }
        DownloadRequest downloadRequest = (DownloadRequest) obj;
        return this.f27074a.equals(downloadRequest.f27074a) && this.f27075b.equals(downloadRequest.f27075b) && Objects.equals(this.f27076c, downloadRequest.f27076c) && this.f27077d.equals(downloadRequest.f27077d) && Arrays.equals(this.f27078f, downloadRequest.f27078f) && Objects.equals(this.f27079g, downloadRequest.f27079g) && Arrays.equals(this.f27080i, downloadRequest.f27080i) && Objects.equals(this.f27081j, downloadRequest.f27081j);
    }

    public final int hashCode() {
        int iHashCode = (this.f27075b.hashCode() + (this.f27074a.hashCode() * 961)) * 31;
        String str = this.f27076c;
        int iHashCode2 = (Arrays.hashCode(this.f27078f) + ((this.f27077d.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31;
        String str2 = this.f27079g;
        int iHashCode3 = (Arrays.hashCode(this.f27080i) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31;
        ByteRange byteRange = this.f27081j;
        return iHashCode3 + (byteRange != null ? byteRange.hashCode() : 0);
    }

    public final String toString() {
        return this.f27076c + ":" + this.f27074a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f27074a);
        parcel.writeString(this.f27075b.toString());
        parcel.writeString(this.f27076c);
        List list = this.f27077d;
        parcel.writeInt(list.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            parcel.writeParcelable((Parcelable) list.get(i2), 0);
        }
        parcel.writeByteArray(this.f27078f);
        parcel.writeString(this.f27079g);
        parcel.writeByteArray(this.f27080i);
        parcel.writeParcelable(this.f27081j, 0);
    }
}
