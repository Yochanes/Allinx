package okhttp3;

import kotlin.Metadata;
import okio.Buffer;
import okio.BufferedSource;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"okhttp3/ResponseBody$Companion$asResponseBody$1", "Lokhttp3/ResponseBody;", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class ResponseBody$Companion$asResponseBody$1 extends ResponseBody {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MediaType f57261b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f57262c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Buffer f57263d;

    public ResponseBody$Companion$asResponseBody$1(MediaType mediaType, long j, Buffer buffer) {
        this.f57261b = mediaType;
        this.f57262c = j;
        this.f57263d = buffer;
    }

    @Override // okhttp3.ResponseBody
    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getF57484c() {
        return this.f57262c;
    }

    @Override // okhttp3.ResponseBody
    /* JADX INFO: renamed from: b, reason: from getter */
    public final MediaType getF57261b() {
        return this.f57261b;
    }

    @Override // okhttp3.ResponseBody
    /* JADX INFO: renamed from: d */
    public final BufferedSource mo21177d() {
        return this.f57263d;
    }
}
