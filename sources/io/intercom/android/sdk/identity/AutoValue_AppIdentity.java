package io.intercom.android.sdk.identity;

import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
final class AutoValue_AppIdentity extends AppIdentity {
    private final String apiKey;
    private final String appId;

    public AutoValue_AppIdentity(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null apiKey");
        }
        this.apiKey = str;
        if (str2 == null) {
            throw new NullPointerException("Null appId");
        }
        this.appId = str2;
    }

    @Override // io.intercom.android.sdk.identity.AppIdentity
    public String apiKey() {
        return this.apiKey;
    }

    @Override // io.intercom.android.sdk.identity.AppIdentity
    public String appId() {
        return this.appId;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AppIdentity) {
            AppIdentity appIdentity = (AppIdentity) obj;
            if (this.apiKey.equals(appIdentity.apiKey()) && this.appId.equals(appIdentity.appId())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.apiKey.hashCode() ^ 1000003) * 1000003) ^ this.appId.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AppIdentity{apiKey=");
        sb.append(this.apiKey);
        sb.append(", appId=");
        return AbstractC0000a.m19p(sb, this.appId, "}");
    }
}
