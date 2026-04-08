package okio.internal;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.Path;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lokio/internal/ZipEntry;", "", "okio"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class ZipEntry {

    /* JADX INFO: renamed from: a */
    public final Path f57951a;

    /* JADX INFO: renamed from: b */
    public final boolean f57952b;

    /* JADX INFO: renamed from: c */
    public final String f57953c;

    /* JADX INFO: renamed from: d */
    public final long f57954d;

    /* JADX INFO: renamed from: e */
    public final long f57955e;

    /* JADX INFO: renamed from: f */
    public final long f57956f;

    /* JADX INFO: renamed from: g */
    public final int f57957g;

    /* JADX INFO: renamed from: h */
    public final long f57958h;

    /* JADX INFO: renamed from: i */
    public final int f57959i;

    /* JADX INFO: renamed from: j */
    public final int f57960j;

    /* JADX INFO: renamed from: k */
    public final Long f57961k;

    /* JADX INFO: renamed from: l */
    public final Long f57962l;

    /* JADX INFO: renamed from: m */
    public final Long f57963m;

    /* JADX INFO: renamed from: n */
    public final Integer f57964n;

    /* JADX INFO: renamed from: o */
    public final Integer f57965o;

    /* JADX INFO: renamed from: p */
    public final Integer f57966p;

    /* JADX INFO: renamed from: q */
    public final ArrayList f57967q;

    public ZipEntry(Path canonicalPath, boolean z2, String comment, long j, long j2, long j3, int i, long j4, int i2, int i3, Long l, Long l2, Long l3, Integer num, Integer num2, Integer num3) {
        Intrinsics.m18599g(canonicalPath, "canonicalPath");
        Intrinsics.m18599g(comment, "comment");
        this.f57951a = canonicalPath;
        this.f57952b = z2;
        this.f57953c = comment;
        this.f57954d = j;
        this.f57955e = j2;
        this.f57956f = j3;
        this.f57957g = i;
        this.f57958h = j4;
        this.f57959i = i2;
        this.f57960j = i3;
        this.f57961k = l;
        this.f57962l = l2;
        this.f57963m = l3;
        this.f57964n = num;
        this.f57965o = num2;
        this.f57966p = num3;
        this.f57967q = new ArrayList();
    }

    public /* synthetic */ ZipEntry(Path path, boolean z2, String str, long j, long j2, long j3, int i, long j4, int i2, int i3, Long l, Long l2, Long l3, int i4) {
        this(path, z2, (i4 & 4) != 0 ? "" : str, (i4 & 8) != 0 ? -1L : j, (i4 & 16) != 0 ? -1L : j2, (i4 & 32) != 0 ? -1L : j3, (i4 & 64) != 0 ? -1 : i, (i4 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? -1L : j4, (i4 & 256) != 0 ? -1 : i2, (i4 & 512) != 0 ? -1 : i3, (i4 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? null : l, (i4 & 2048) != 0 ? null : l2, (i4 & 4096) != 0 ? null : l3, null, null, null);
    }
}
