package io.intercom.android.sdk.identity;

import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
final class AutoValue_SoftUserIdentity extends SoftUserIdentity {
    private final String anonymousId;
    private final String email;
    private final String encryptedUserId;
    private final String fingerprint;
    private final String hmac;
    private final String intercomId;
    private final String jwt;
    private final String userId;

    public AutoValue_SoftUserIdentity(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        if (str == null) {
            throw new NullPointerException("Null anonymousId");
        }
        this.anonymousId = str;
        if (str2 == null) {
            throw new NullPointerException("Null email");
        }
        this.email = str2;
        if (str3 == null) {
            throw new NullPointerException("Null fingerprint");
        }
        this.fingerprint = str3;
        if (str4 == null) {
            throw new NullPointerException("Null hmac");
        }
        this.hmac = str4;
        if (str5 == null) {
            throw new NullPointerException("Null jwt");
        }
        this.jwt = str5;
        if (str6 == null) {
            throw new NullPointerException("Null intercomId");
        }
        this.intercomId = str6;
        if (str7 == null) {
            throw new NullPointerException("Null userId");
        }
        this.userId = str7;
        if (str8 == null) {
            throw new NullPointerException("Null encryptedUserId");
        }
        this.encryptedUserId = str8;
    }

    @Override // io.intercom.android.sdk.identity.SoftUserIdentity
    public String anonymousId() {
        return this.anonymousId;
    }

    @Override // io.intercom.android.sdk.identity.SoftUserIdentity
    public String email() {
        return this.email;
    }

    @Override // io.intercom.android.sdk.identity.SoftUserIdentity
    public String encryptedUserId() {
        return this.encryptedUserId;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SoftUserIdentity) {
            SoftUserIdentity softUserIdentity = (SoftUserIdentity) obj;
            if (this.anonymousId.equals(softUserIdentity.anonymousId()) && this.email.equals(softUserIdentity.email()) && this.fingerprint.equals(softUserIdentity.fingerprint()) && this.hmac.equals(softUserIdentity.hmac()) && this.jwt.equals(softUserIdentity.jwt()) && this.intercomId.equals(softUserIdentity.intercomId()) && this.userId.equals(softUserIdentity.userId()) && this.encryptedUserId.equals(softUserIdentity.encryptedUserId())) {
                return true;
            }
        }
        return false;
    }

    @Override // io.intercom.android.sdk.identity.SoftUserIdentity
    public String fingerprint() {
        return this.fingerprint;
    }

    public int hashCode() {
        return ((((((((((((((this.anonymousId.hashCode() ^ 1000003) * 1000003) ^ this.email.hashCode()) * 1000003) ^ this.fingerprint.hashCode()) * 1000003) ^ this.hmac.hashCode()) * 1000003) ^ this.jwt.hashCode()) * 1000003) ^ this.intercomId.hashCode()) * 1000003) ^ this.userId.hashCode()) * 1000003) ^ this.encryptedUserId.hashCode();
    }

    @Override // io.intercom.android.sdk.identity.SoftUserIdentity
    public String hmac() {
        return this.hmac;
    }

    @Override // io.intercom.android.sdk.identity.SoftUserIdentity
    public String intercomId() {
        return this.intercomId;
    }

    @Override // io.intercom.android.sdk.identity.SoftUserIdentity
    public String jwt() {
        return this.jwt;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SoftUserIdentity{anonymousId=");
        sb.append(this.anonymousId);
        sb.append(", email=");
        sb.append(this.email);
        sb.append(", fingerprint=");
        sb.append(this.fingerprint);
        sb.append(", hmac=");
        sb.append(this.hmac);
        sb.append(", jwt=");
        sb.append(this.jwt);
        sb.append(", intercomId=");
        sb.append(this.intercomId);
        sb.append(", userId=");
        sb.append(this.userId);
        sb.append(", encryptedUserId=");
        return AbstractC0000a.m19p(sb, this.encryptedUserId, "}");
    }

    @Override // io.intercom.android.sdk.identity.SoftUserIdentity
    public String userId() {
        return this.userId;
    }
}
