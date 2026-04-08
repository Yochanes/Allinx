package okhttp3;

import kotlin.Metadata;
import okio.BufferedSink;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"okhttp3/RequestBody$Companion$toRequestBody$2", "Lokhttp3/RequestBody;", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class RequestBody$Companion$toRequestBody$2 extends RequestBody {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ MediaType f57225a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f57226b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ byte[] f57227c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f57228d;

    public RequestBody$Companion$toRequestBody$2(MediaType mediaType, byte[] bArr, int i, int i2) {
        this.f57225a = mediaType;
        this.f57226b = i;
        this.f57227c = bArr;
        this.f57228d = i2;
    }

    @Override // okhttp3.RequestBody
    public final long contentLength() {
        return this.f57226b;
    }

    @Override // okhttp3.RequestBody
    /* JADX INFO: renamed from: contentType, reason: from getter */
    public final MediaType getF57223a() {
        return this.f57225a;
    }

    @Override // okhttp3.RequestBody
    public final void writeTo(BufferedSink bufferedSink) {
        bufferedSink.write(this.f57227c, this.f57228d, this.f57226b);
    }
}
