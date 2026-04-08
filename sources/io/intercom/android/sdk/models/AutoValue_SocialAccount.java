package io.intercom.android.sdk.models;

import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
final class AutoValue_SocialAccount extends SocialAccount {
    private final String profileUrl;
    private final String provider;

    public AutoValue_SocialAccount(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null provider");
        }
        this.provider = str;
        if (str2 == null) {
            throw new NullPointerException("Null profileUrl");
        }
        this.profileUrl = str2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SocialAccount) {
            SocialAccount socialAccount = (SocialAccount) obj;
            if (this.provider.equals(socialAccount.getProvider()) && this.profileUrl.equals(socialAccount.getProfileUrl())) {
                return true;
            }
        }
        return false;
    }

    @Override // io.intercom.android.sdk.models.SocialAccount
    public String getProfileUrl() {
        return this.profileUrl;
    }

    @Override // io.intercom.android.sdk.models.SocialAccount
    public String getProvider() {
        return this.provider;
    }

    public int hashCode() {
        return ((this.provider.hashCode() ^ 1000003) * 1000003) ^ this.profileUrl.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SocialAccount{provider=");
        sb.append(this.provider);
        sb.append(", profileUrl=");
        return AbstractC0000a.m19p(sb, this.profileUrl, "}");
    }
}
