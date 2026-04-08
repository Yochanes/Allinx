package io.intercom.android.sdk.blocks.lib.models;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class Author implements Parcelable {
    public static final Parcelable.Creator<Author> CREATOR = new C51771();
    private final String avatar;
    private final String firstName;
    private final String lastName;
    private final String name;

    /* JADX INFO: renamed from: io.intercom.android.sdk.blocks.lib.models.Author$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C51771 implements Parcelable.Creator<Author> {
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Author createFromParcel(Parcel parcel) {
            return createFromParcel(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Author[] newArray(int i) {
            return newArray(i);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Author createFromParcel(Parcel parcel) {
            return new Author(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Author[] newArray(int i) {
            return new Author[i];
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Builder {
        String avatar;
        String firstName;
        String lastName;
        String name;

        public Author build() {
            return new Author(this, null);
        }

        public Builder withAvatar(String str) {
            this.avatar = str;
            return this;
        }

        public Builder withFirstName(String str) {
            this.firstName = str;
            return this;
        }

        public Builder withLastName(String str) {
            this.lastName = str;
            return this;
        }

        public Builder withName(String str) {
            this.name = str;
            return this;
        }
    }

    public /* synthetic */ Author(Builder builder, C51771 c51771) {
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
            Author author = (Author) obj;
            String str = this.name;
            if (str == null ? author.name != null : !str.equals(author.name)) {
                return false;
            }
            String str2 = this.firstName;
            if (str2 == null ? author.firstName != null : !str2.equals(author.firstName)) {
                return false;
            }
            String str3 = this.lastName;
            if (str3 == null ? author.lastName != null : !str3.equals(author.lastName)) {
                return false;
            }
            String str4 = this.avatar;
            String str5 = author.avatar;
            if (str4 == null ? str5 == null : str4.equals(str5)) {
                return true;
            }
        }
        return false;
    }

    public String getAvatar() {
        return this.avatar;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getName() {
        return this.name;
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.firstName;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.lastName;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.avatar;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeString(this.avatar);
        parcel.writeString(this.firstName);
        parcel.writeString(this.lastName);
    }

    public Author() {
        this(new Builder());
    }

    private Author(Builder builder) {
        String str = builder.name;
        this.name = str == null ? "" : str;
        String str2 = builder.avatar;
        this.avatar = str2 == null ? "" : str2;
        String str3 = builder.firstName;
        this.firstName = str3 == null ? "" : str3;
        String str4 = builder.lastName;
        this.lastName = str4 != null ? str4 : "";
    }

    public Author(Parcel parcel) {
        this.name = parcel.readString();
        this.avatar = parcel.readString();
        this.firstName = parcel.readString();
        this.lastName = parcel.readString();
    }
}
