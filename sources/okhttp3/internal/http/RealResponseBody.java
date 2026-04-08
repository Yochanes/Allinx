package okhttp3.internal.http;

import java.util.regex.Pattern;
import kotlin.Metadata;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import okio.BufferedSource;
import okio.RealBufferedSource;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lokhttp3/internal/http/RealResponseBody;", "Lokhttp3/ResponseBody;", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class RealResponseBody extends ResponseBody {

    /* JADX INFO: renamed from: b */
    public final String f57483b;

    /* JADX INFO: renamed from: c */
    public final long f57484c;

    /* JADX INFO: renamed from: d */
    public final RealBufferedSource f57485d;

    public RealResponseBody(String str, long j, RealBufferedSource realBufferedSource) {
        this.f57483b = str;
        this.f57484c = j;
        this.f57485d = realBufferedSource;
    }

    @Override // okhttp3.ResponseBody
    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getF57484c() {
        return this.f57484c;
    }

    @Override // okhttp3.ResponseBody
    /* JADX INFO: renamed from: b */
    public final MediaType getF57261b() {
        String str = this.f57483b;
        if (str == null) {
            return null;
        }
        Pattern pattern = MediaType.f57127d;
        return MediaType.Companion.m21284b(str);
    }

    @Override // okhttp3.ResponseBody
    /* JADX INFO: renamed from: d */
    public final BufferedSource mo21177d() {
        return this.f57485d;
    }
}
