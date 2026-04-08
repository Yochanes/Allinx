package androidx.media3.datasource.cache;

import androidx.media3.common.util.UnstableApi;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class DefaultContentMetadata implements ContentMetadata {

    /* JADX INFO: renamed from: a */
    public int f25919a;

    /* JADX INFO: renamed from: b */
    public final Map f25920b;

    static {
        new DefaultContentMetadata(Collections.EMPTY_MAP);
    }

    public DefaultContentMetadata(Map map) {
        this.f25920b = Collections.unmodifiableMap(map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DefaultContentMetadata.class != obj.getClass()) {
            return false;
        }
        Map map = ((DefaultContentMetadata) obj).f25920b;
        Map map2 = this.f25920b;
        if (map2.size() != map.size()) {
            return false;
        }
        for (Map.Entry entry : map2.entrySet()) {
            if (!Arrays.equals((byte[]) entry.getValue(), (byte[]) map.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        if (this.f25919a == 0) {
            int iHashCode = 0;
            for (Map.Entry entry : this.f25920b.entrySet()) {
                iHashCode += Arrays.hashCode((byte[]) entry.getValue()) ^ ((String) entry.getKey()).hashCode();
            }
            this.f25919a = iHashCode;
        }
        return this.f25919a;
    }
}
