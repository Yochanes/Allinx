package io.intercom.android.sdk.models.carousel;

import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
final class AutoValue_Appearance extends Appearance {
    private final String alignment;
    private final String textColor;
    private final String type;

    public AutoValue_Appearance(String str, String str2, String str3) {
        if (str == null) {
            throw new NullPointerException("Null type");
        }
        this.type = str;
        if (str2 == null) {
            throw new NullPointerException("Null alignment");
        }
        this.alignment = str2;
        if (str3 == null) {
            throw new NullPointerException("Null textColor");
        }
        this.textColor = str3;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Appearance) {
            Appearance appearance = (Appearance) obj;
            if (this.type.equals(appearance.getType()) && this.alignment.equals(appearance.getAlignment()) && this.textColor.equals(appearance.getTextColor())) {
                return true;
            }
        }
        return false;
    }

    @Override // io.intercom.android.sdk.models.carousel.Appearance
    public String getAlignment() {
        return this.alignment;
    }

    @Override // io.intercom.android.sdk.models.carousel.Appearance
    public String getTextColor() {
        return this.textColor;
    }

    @Override // io.intercom.android.sdk.models.carousel.Appearance
    public String getType() {
        return this.type;
    }

    public int hashCode() {
        return ((((this.type.hashCode() ^ 1000003) * 1000003) ^ this.alignment.hashCode()) * 1000003) ^ this.textColor.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Appearance{type=");
        sb.append(this.type);
        sb.append(", alignment=");
        sb.append(this.alignment);
        sb.append(", textColor=");
        return AbstractC0000a.m19p(sb, this.textColor, "}");
    }
}
