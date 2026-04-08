package androidx.media3.container;

import androidx.media3.common.Metadata;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.util.Arrays;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class XmpData implements Metadata.Entry {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || XmpData.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals((byte[]) null, (byte[]) null);
    }

    public final int hashCode() {
        return Arrays.hashCode((byte[]) null);
    }

    public final String toString() {
        Util.m9608R(null);
        throw null;
    }
}
