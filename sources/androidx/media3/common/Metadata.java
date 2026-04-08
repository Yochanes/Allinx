package androidx.media3.common;

import androidx.media3.common.MediaMetadata;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.common.primitives.Longs;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class Metadata {

    /* JADX INFO: renamed from: a */
    public final Entry[] f25311a;

    /* JADX INFO: renamed from: b */
    public final long f25312b;

    public Metadata(Entry... entryArr) {
        this(-9223372036854775807L, entryArr);
    }

    /* JADX INFO: renamed from: a */
    public final Metadata m9325a(Entry... entryArr) {
        if (entryArr.length == 0) {
            return this;
        }
        int i = Util.f25665a;
        Entry[] entryArr2 = this.f25311a;
        Object[] objArrCopyOf = Arrays.copyOf(entryArr2, entryArr2.length + entryArr.length);
        System.arraycopy(entryArr, 0, objArrCopyOf, entryArr2.length, entryArr.length);
        return new Metadata(this.f25312b, (Entry[]) objArrCopyOf);
    }

    /* JADX INFO: renamed from: b */
    public final Metadata m9326b(Metadata metadata) {
        return metadata == null ? this : m9325a(metadata.f25311a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Metadata.class == obj.getClass()) {
            Metadata metadata = (Metadata) obj;
            if (Arrays.equals(this.f25311a, metadata.f25311a) && this.f25312b == metadata.f25312b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Longs.hashCode(this.f25312b) + (Arrays.hashCode(this.f25311a) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("entries=");
        sb.append(Arrays.toString(this.f25311a));
        long j = this.f25312b;
        if (j == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j;
        }
        sb.append(str);
        return sb.toString();
    }

    public Metadata(long j, Entry... entryArr) {
        this.f25312b = j;
        this.f25311a = entryArr;
    }

    public Metadata(List list) {
        this((Entry[]) list.toArray(new Entry[0]));
    }

    /* JADX INFO: compiled from: Proguard */
    public interface Entry {
        /* JADX INFO: renamed from: a */
        default Format mo9327a() {
            return null;
        }

        /* JADX INFO: renamed from: c */
        default byte[] mo9329c() {
            return null;
        }

        /* JADX INFO: renamed from: b */
        default void mo9328b(MediaMetadata.Builder builder) {
        }
    }
}
