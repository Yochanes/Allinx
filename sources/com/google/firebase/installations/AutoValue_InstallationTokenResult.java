package com.google.firebase.installations;

import androidx.annotation.NonNull;
import com.google.firebase.installations.InstallationTokenResult;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
final class AutoValue_InstallationTokenResult extends InstallationTokenResult {
    private final String token;
    private final long tokenCreationTimestamp;
    private final long tokenExpirationTimestamp;

    /* JADX INFO: compiled from: Proguard */
    public static final class Builder extends InstallationTokenResult.Builder {
        private String token;
        private Long tokenCreationTimestamp;
        private Long tokenExpirationTimestamp;

        public /* synthetic */ Builder(InstallationTokenResult installationTokenResult, C47171 c47171) {
            this(installationTokenResult);
        }

        @Override // com.google.firebase.installations.InstallationTokenResult.Builder
        public InstallationTokenResult build() {
            String strM2C = this.token == null ? " token" : "";
            if (this.tokenExpirationTimestamp == null) {
                strM2C = AbstractC0000a.m2C(strM2C, " tokenExpirationTimestamp");
            }
            if (this.tokenCreationTimestamp == null) {
                strM2C = AbstractC0000a.m2C(strM2C, " tokenCreationTimestamp");
            }
            if (strM2C.isEmpty()) {
                return new AutoValue_InstallationTokenResult(this.token, this.tokenExpirationTimestamp.longValue(), this.tokenCreationTimestamp.longValue(), null);
            }
            throw new IllegalStateException("Missing required properties:".concat(strM2C));
        }

        @Override // com.google.firebase.installations.InstallationTokenResult.Builder
        public InstallationTokenResult.Builder setToken(String str) {
            if (str == null) {
                throw new NullPointerException("Null token");
            }
            this.token = str;
            return this;
        }

        @Override // com.google.firebase.installations.InstallationTokenResult.Builder
        public InstallationTokenResult.Builder setTokenCreationTimestamp(long j) {
            this.tokenCreationTimestamp = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.installations.InstallationTokenResult.Builder
        public InstallationTokenResult.Builder setTokenExpirationTimestamp(long j) {
            this.tokenExpirationTimestamp = Long.valueOf(j);
            return this;
        }

        public Builder() {
        }

        private Builder(InstallationTokenResult installationTokenResult) {
            this.token = installationTokenResult.getToken();
            this.tokenExpirationTimestamp = Long.valueOf(installationTokenResult.getTokenExpirationTimestamp());
            this.tokenCreationTimestamp = Long.valueOf(installationTokenResult.getTokenCreationTimestamp());
        }
    }

    public /* synthetic */ AutoValue_InstallationTokenResult(String str, long j, long j2, C47171 c47171) {
        this(str, j, j2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InstallationTokenResult) {
            InstallationTokenResult installationTokenResult = (InstallationTokenResult) obj;
            if (this.token.equals(installationTokenResult.getToken()) && this.tokenExpirationTimestamp == installationTokenResult.getTokenExpirationTimestamp() && this.tokenCreationTimestamp == installationTokenResult.getTokenCreationTimestamp()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.installations.InstallationTokenResult
    @NonNull
    public String getToken() {
        return this.token;
    }

    @Override // com.google.firebase.installations.InstallationTokenResult
    @NonNull
    public long getTokenCreationTimestamp() {
        return this.tokenCreationTimestamp;
    }

    @Override // com.google.firebase.installations.InstallationTokenResult
    @NonNull
    public long getTokenExpirationTimestamp() {
        return this.tokenExpirationTimestamp;
    }

    public int hashCode() {
        int iHashCode = (this.token.hashCode() ^ 1000003) * 1000003;
        long j = this.tokenExpirationTimestamp;
        long j2 = this.tokenCreationTimestamp;
        return ((iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    @Override // com.google.firebase.installations.InstallationTokenResult
    public InstallationTokenResult.Builder toBuilder() {
        return new Builder(this, null);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("InstallationTokenResult{token=");
        sb.append(this.token);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.tokenExpirationTimestamp);
        sb.append(", tokenCreationTimestamp=");
        return AbstractC0000a.m12i(this.tokenCreationTimestamp, "}", sb);
    }

    private AutoValue_InstallationTokenResult(String str, long j, long j2) {
        this.token = str;
        this.tokenExpirationTimestamp = j;
        this.tokenCreationTimestamp = j2;
    }
}
