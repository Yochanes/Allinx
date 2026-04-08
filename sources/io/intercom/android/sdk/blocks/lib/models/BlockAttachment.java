package io.intercom.android.sdk.blocks.lib.models;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class BlockAttachment implements Parcelable {
    public static final Parcelable.Creator<BlockAttachment> CREATOR = new C51801();
    private final String contentType;
    private final String humanFileSize;

    /* JADX INFO: renamed from: id */
    private final int f43580id;
    private final String name;
    private final long size;
    private final String url;

    /* JADX INFO: renamed from: io.intercom.android.sdk.blocks.lib.models.BlockAttachment$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C51801 implements Parcelable.Creator<BlockAttachment> {
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ BlockAttachment createFromParcel(Parcel parcel) {
            return createFromParcel(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ BlockAttachment[] newArray(int i) {
            return newArray(i);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BlockAttachment createFromParcel(Parcel parcel) {
            return new BlockAttachment(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BlockAttachment[] newArray(int i) {
            return new BlockAttachment[i];
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Builder {
        String contentType;
        String humanFileSize;

        /* JADX INFO: renamed from: id */
        int f43581id;
        String name;
        long size;
        String url;

        public BlockAttachment build() {
            return new BlockAttachment(this);
        }

        public Builder withContentType(String str) {
            this.contentType = str;
            return this;
        }

        public Builder withHumanFileSize(String str) {
            this.humanFileSize = str;
            return this;
        }

        public Builder withId(int i) {
            this.f43581id = i;
            return this;
        }

        public Builder withName(String str) {
            this.name = str;
            return this;
        }

        public Builder withSize(long j) {
            this.size = j;
            return this;
        }

        public Builder withUrl(String str) {
            this.url = str;
            return this;
        }
    }

    public BlockAttachment() {
        this(new Builder());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            BlockAttachment blockAttachment = (BlockAttachment) obj;
            if (this.size != blockAttachment.size || this.f43580id != blockAttachment.f43580id) {
                return false;
            }
            String str = this.name;
            if (str == null ? blockAttachment.name != null : !str.equals(blockAttachment.name)) {
                return false;
            }
            String str2 = this.url;
            if (str2 == null ? blockAttachment.url != null : !str2.equals(blockAttachment.url)) {
                return false;
            }
            String str3 = this.humanFileSize;
            if (str3 == null ? blockAttachment.humanFileSize == null : !str3.equals(blockAttachment.humanFileSize)) {
                return false;
            }
            String str4 = this.contentType;
            String str5 = blockAttachment.contentType;
            if (str4 != null) {
                return str4.equals(str5);
            }
            if (str5 == null) {
                return true;
            }
        }
        return false;
    }

    public String getContentType() {
        return this.contentType;
    }

    public String getHumanFileSize() {
        return this.humanFileSize;
    }

    public int getId() {
        return this.f43580id;
    }

    public String getName() {
        return this.name;
    }

    public long getSize() {
        return this.size;
    }

    public String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.url;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.contentType;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.humanFileSize;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        long j = this.size;
        return ((iHashCode4 + ((int) (j ^ (j >>> 32)))) * 31) + this.f43580id;
    }

    public Builder toBuilder() {
        return new Builder().withName(this.name).withUrl(this.url).withContentType(this.contentType).withHumanFileSize(this.humanFileSize).withId(this.f43580id).withSize(this.size);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeString(this.url);
        parcel.writeString(this.contentType);
        parcel.writeString(this.humanFileSize);
        parcel.writeInt(this.f43580id);
        parcel.writeLong(this.size);
    }

    public BlockAttachment(Builder builder) {
        String str = builder.name;
        this.name = str == null ? "" : str;
        String str2 = builder.url;
        this.url = str2 == null ? "" : str2;
        String str3 = builder.contentType;
        this.contentType = str3 == null ? "" : str3;
        String str4 = builder.humanFileSize;
        this.humanFileSize = str4 != null ? str4 : "";
        this.f43580id = builder.f43581id;
        this.size = builder.size;
    }

    public BlockAttachment(Parcel parcel) {
        this.name = parcel.readString();
        this.url = parcel.readString();
        this.contentType = parcel.readString();
        this.humanFileSize = parcel.readString();
        this.f43580id = parcel.readInt();
        this.size = parcel.readLong();
    }
}
