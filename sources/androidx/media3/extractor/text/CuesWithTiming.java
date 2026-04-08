package androidx.media3.extractor.text;

import androidx.media3.common.util.UnstableApi;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public class CuesWithTiming {

    /* JADX INFO: renamed from: a */
    public final ImmutableList f28975a;

    /* JADX INFO: renamed from: b */
    public final long f28976b;

    /* JADX INFO: renamed from: c */
    public final long f28977c;

    /* JADX INFO: renamed from: d */
    public final long f28978d;

    public CuesWithTiming(long j, long j2, List list) {
        this.f28975a = ImmutableList.copyOf((Collection) list);
        this.f28976b = j;
        this.f28977c = j2;
        long j3 = -9223372036854775807L;
        if (j != -9223372036854775807L && j2 != -9223372036854775807L) {
            j3 = j + j2;
        }
        this.f28978d = j3;
    }
}
