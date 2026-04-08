package okhttp3;

import kotlin.Metadata;
import okio.BufferedSink;
import okio.ByteString;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"okhttp3/RequestBody$Companion$toRequestBody$1", "Lokhttp3/RequestBody;", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class RequestBody$Companion$toRequestBody$1 extends RequestBody {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ MediaType f57223a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ByteString f57224b;

    public RequestBody$Companion$toRequestBody$1(MediaType mediaType, ByteString byteString) {
        this.f57223a = mediaType;
        this.f57224b = byteString;
    }

    @Override // okhttp3.RequestBody
    public final long contentLength() {
        return this.f57224b.mo21617d();
    }

    @Override // okhttp3.RequestBody
    /* JADX INFO: renamed from: contentType, reason: from getter */
    public final MediaType getF57139c() {
        return this.f57223a;
    }

    @Override // okhttp3.RequestBody
    public final void writeTo(BufferedSink bufferedSink) {
        bufferedSink.mo21565G0(this.f57224b);
    }
}
