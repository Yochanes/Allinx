package io.ktor.http.content;

import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/http/content/LastModifiedVersion;", "Lio/ktor/http/content/Version;", "ktor-http"}, m18303k = 1, m18304mv = {1, 4, 2})
public final /* data */ class LastModifiedVersion implements Version {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LastModifiedVersion)) {
            return false;
        }
        ((LastModifiedVersion) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return "LastModifiedVersion(lastModified=null)";
    }
}
