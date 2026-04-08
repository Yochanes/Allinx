package io.ktor.http.content;

import kotlin.Metadata;
import org.slf4j.Marker;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lio/ktor/http/content/EntityTagVersion;", "Lio/ktor/http/content/Version;", "Companion", "ktor-http"}, m18303k = 1, m18304mv = {1, 4, 2})
public final /* data */ class EntityTagVersion implements Version {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/http/content/EntityTagVersion$Companion;", "", "ktor-http"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class Companion {
    }

    static {
        Marker.ANY_MARKER.charAt(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EntityTagVersion)) {
            return false;
        }
        ((EntityTagVersion) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return 42 * 31;
    }

    public final String toString() {
        return "EntityTagVersion(etag=*, weak=false)";
    }
}
