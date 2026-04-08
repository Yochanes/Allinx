package io.intercom.android.sdk.blocks.lib.models;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class Image implements Parcelable {
    public static final Parcelable.Creator<Image> CREATOR = new C51831();
    private final String alt;
    private final String attribution;
    private final int height;
    private final String previewUrl;
    private final String url;
    private final int width;

    /* JADX INFO: renamed from: io.intercom.android.sdk.blocks.lib.models.Image$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C51831 implements Parcelable.Creator<Image> {
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Image createFromParcel(Parcel parcel) {
            return createFromParcel(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Image[] newArray(int i) {
            return newArray(i);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Image createFromParcel(Parcel parcel) {
            return new Image(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Image[] newArray(int i) {
            return new Image[i];
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Builder {
        String alt;
        String attribution;
        int height;
        String previewUrl;
        String url;
        int width;

        public Image build() {
            return new Image(this, null);
        }

        public Builder withAlt(String str) {
            this.alt = str;
            return this;
        }

        public Builder withAttribution(String str) {
            this.attribution = str;
            return this;
        }

        public Builder withHeight(int i) {
            this.height = i;
            return this;
        }

        public Builder withPreviewUrl(String str) {
            this.previewUrl = str;
            return this;
        }

        public Builder withUrl(String str) {
            this.url = str;
            return this;
        }

        public Builder withWidth(int i) {
            this.width = i;
            return this;
        }
    }

    public /* synthetic */ Image(Builder builder, C51831 c51831) {
        this(builder);
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
            Image image = (Image) obj;
            String str = this.alt;
            if (str == null ? image.alt != null : !str.equals(image.alt)) {
                return false;
            }
            String str2 = this.previewUrl;
            if (str2 == null ? image.previewUrl != null : !str2.equals(image.previewUrl)) {
                return false;
            }
            String str3 = this.attribution;
            if (str3 == null ? image.attribution != null : !str3.equals(image.attribution)) {
                return false;
            }
            if (this.width != image.width || this.height != image.height) {
                return false;
            }
            String str4 = this.url;
            String str5 = image.url;
            if (str4 == null ? str5 == null : str4.equals(str5)) {
                return true;
            }
        }
        return false;
    }

    public String getAlt() {
        return this.alt;
    }

    public String getAttribution() {
        return this.attribution;
    }

    public int getHeight() {
        return this.height;
    }

    public String getPreviewUrl() {
        return this.previewUrl;
    }

    public String getUrl() {
        return this.url;
    }

    public int getWidth() {
        return this.width;
    }

    public int hashCode() {
        String str = this.alt;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.url;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.previewUrl;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.attribution;
        return ((((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.width) * 31) + this.height;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.attribution);
        parcel.writeString(this.previewUrl);
        parcel.writeString(this.alt);
        parcel.writeString(this.url);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
    }

    public Image() {
        this(new Builder());
    }

    private Image(Builder builder) {
        String str = builder.alt;
        this.alt = str == null ? "" : str;
        String str2 = builder.url;
        this.url = str2 == null ? "" : str2;
        String str3 = builder.previewUrl;
        this.previewUrl = str3 == null ? "" : str3;
        String str4 = builder.attribution;
        this.attribution = str4 != null ? str4 : "";
        this.width = builder.width;
        this.height = builder.height;
    }

    public Image(Parcel parcel) {
        this.attribution = parcel.readString();
        this.previewUrl = parcel.readString();
        this.alt = parcel.readString();
        this.url = parcel.readString();
        this.width = parcel.readInt();
        this.height = parcel.readInt();
    }
}
