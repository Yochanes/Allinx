package okhttp3.internal.http1;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.RealBufferedSource;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lokhttp3/internal/http1/HeadersReader;", "", "Companion", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class HeadersReader {

    /* JADX INFO: renamed from: a */
    public final RealBufferedSource f57490a;

    /* JADX INFO: renamed from: b */
    public long f57491b;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m18302d2 = {"Lokhttp3/internal/http1/HeadersReader$Companion;", "", "", "HEADER_LIMIT", "I", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Companion {
    }

    public HeadersReader(RealBufferedSource source) {
        Intrinsics.m18599g(source, "source");
        this.f57490a = source;
        this.f57491b = 262144L;
    }
}
