package androidx.media3.extractor.mp4;

import androidx.media3.common.Format;
import androidx.media3.common.util.UnstableApi;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class Track {

    /* JADX INFO: renamed from: a */
    public final int f28868a;

    /* JADX INFO: renamed from: b */
    public final int f28869b;

    /* JADX INFO: renamed from: c */
    public final long f28870c;

    /* JADX INFO: renamed from: d */
    public final long f28871d;

    /* JADX INFO: renamed from: e */
    public final long f28872e;

    /* JADX INFO: renamed from: f */
    public final long f28873f;

    /* JADX INFO: renamed from: g */
    public final Format f28874g;

    /* JADX INFO: renamed from: h */
    public final int f28875h;

    /* JADX INFO: renamed from: i */
    public final long[] f28876i;

    /* JADX INFO: renamed from: j */
    public final long[] f28877j;

    /* JADX INFO: renamed from: k */
    public final int f28878k;

    /* JADX INFO: renamed from: l */
    public final TrackEncryptionBox[] f28879l;

    /* JADX INFO: compiled from: Proguard */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Transformation {
    }

    public Track(int i, int i2, long j, long j2, long j3, long j4, Format format, int i3, TrackEncryptionBox[] trackEncryptionBoxArr, int i4, long[] jArr, long[] jArr2) {
        this.f28868a = i;
        this.f28869b = i2;
        this.f28870c = j;
        this.f28871d = j2;
        this.f28872e = j3;
        this.f28873f = j4;
        this.f28874g = format;
        this.f28875h = i3;
        this.f28879l = trackEncryptionBoxArr;
        this.f28878k = i4;
        this.f28876i = jArr;
        this.f28877j = jArr2;
    }
}
