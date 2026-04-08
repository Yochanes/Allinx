package io.intercom.android.sdk.models;

import io.intercom.android.sdk.p032m5.components.avatar.AvatarShape;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
final class AutoValue_Avatar extends Avatar {
    private final String imageDarkUrl;
    private final String imageUrl;
    private final String initials;
    private final String label;
    private final AvatarShape shape;

    public AutoValue_Avatar(String str, String str2, AvatarShape avatarShape, String str3, String str4) {
        if (str == null) {
            throw new NullPointerException("Null imageUrl");
        }
        this.imageUrl = str;
        if (str2 == null) {
            throw new NullPointerException("Null initials");
        }
        this.initials = str2;
        if (avatarShape == null) {
            throw new NullPointerException("Null shape");
        }
        this.shape = avatarShape;
        if (str3 == null) {
            throw new NullPointerException("Null label");
        }
        this.label = str3;
        if (str4 == null) {
            throw new NullPointerException("Null imageDarkUrl");
        }
        this.imageDarkUrl = str4;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Avatar) {
            Avatar avatar = (Avatar) obj;
            if (this.imageUrl.equals(avatar.getImageUrl()) && this.initials.equals(avatar.getInitials()) && this.shape.equals(avatar.getShape()) && this.label.equals(avatar.getLabel()) && this.imageDarkUrl.equals(avatar.getImageDarkUrl())) {
                return true;
            }
        }
        return false;
    }

    @Override // io.intercom.android.sdk.models.Avatar
    public String getImageDarkUrl() {
        return this.imageDarkUrl;
    }

    @Override // io.intercom.android.sdk.models.Avatar
    public String getImageUrl() {
        return this.imageUrl;
    }

    @Override // io.intercom.android.sdk.models.Avatar
    public String getInitials() {
        return this.initials;
    }

    @Override // io.intercom.android.sdk.models.Avatar
    public String getLabel() {
        return this.label;
    }

    @Override // io.intercom.android.sdk.models.Avatar
    public AvatarShape getShape() {
        return this.shape;
    }

    public int hashCode() {
        return ((((((((this.imageUrl.hashCode() ^ 1000003) * 1000003) ^ this.initials.hashCode()) * 1000003) ^ this.shape.hashCode()) * 1000003) ^ this.label.hashCode()) * 1000003) ^ this.imageDarkUrl.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Avatar{imageUrl=");
        sb.append(this.imageUrl);
        sb.append(", initials=");
        sb.append(this.initials);
        sb.append(", shape=");
        sb.append(this.shape);
        sb.append(", label=");
        sb.append(this.label);
        sb.append(", imageDarkUrl=");
        return AbstractC0000a.m19p(sb, this.imageDarkUrl, "}");
    }
}
