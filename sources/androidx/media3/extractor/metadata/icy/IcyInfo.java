package androidx.media3.extractor.metadata.icy;

import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.UnstableApi;
import java.util.Arrays;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class IcyInfo implements Metadata.Entry {

    /* JADX INFO: renamed from: a */
    public final byte[] f28479a;

    /* JADX INFO: renamed from: b */
    public final String f28480b;

    /* JADX INFO: renamed from: c */
    public final String f28481c;

    public IcyInfo(byte[] bArr, String str, String str2) {
        this.f28479a = bArr;
        this.f28480b = str;
        this.f28481c = str2;
    }

    @Override // androidx.media3.common.Metadata.Entry
    /* JADX INFO: renamed from: b */
    public final void mo9328b(MediaMetadata.Builder builder) {
        String str = this.f28480b;
        if (str != null) {
            builder.f25285a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || IcyInfo.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f28479a, ((IcyInfo) obj).f28479a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f28479a);
    }

    public final String toString() {
        return "ICY: title=\"" + this.f28480b + "\", url=\"" + this.f28481c + "\", rawMetadata.length=\"" + this.f28479a.length + "\"";
    }
}
