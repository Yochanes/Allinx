package okhttp3;

import androidx.compose.animation.AbstractC0455a;
import com.google.common.base.Ascii;
import com.google.common.net.HttpHeaders;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.Buffer;
import okio.BufferedSink;
import okio.ByteString;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, m18302d2 = {"Lokhttp3/MultipartBody;", "Lokhttp3/RequestBody;", "Builder", "Companion", "Part", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class MultipartBody extends RequestBody {

    /* JADX INFO: renamed from: e */
    public static final MediaType f57132e;

    /* JADX INFO: renamed from: f */
    public static final MediaType f57133f;

    /* JADX INFO: renamed from: g */
    public static final byte[] f57134g;

    /* JADX INFO: renamed from: h */
    public static final byte[] f57135h;

    /* JADX INFO: renamed from: i */
    public static final byte[] f57136i;

    /* JADX INFO: renamed from: a */
    public final ByteString f57137a;

    /* JADX INFO: renamed from: b */
    public final List f57138b;

    /* JADX INFO: renamed from: c */
    public final MediaType f57139c;

    /* JADX INFO: renamed from: d */
    public long f57140d;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lokhttp3/MultipartBody$Builder;", "", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static final class Builder {

        /* JADX INFO: renamed from: a */
        public final ByteString f57141a;

        /* JADX INFO: renamed from: b */
        public MediaType f57142b;

        /* JADX INFO: renamed from: c */
        public final ArrayList f57143c;

        public Builder() {
            String string = UUID.randomUUID().toString();
            Intrinsics.m18598f(string, "randomUUID().toString()");
            ByteString.Companion companion = ByteString.f57840d;
            this.f57141a = ByteString.Companion.m21633c(string);
            this.f57142b = MultipartBody.f57132e;
            this.f57143c = new ArrayList();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0004¨\u0006\u000e"}, m18302d2 = {"Lokhttp3/MultipartBody$Companion;", "", "Lokhttp3/MediaType;", "ALTERNATIVE", "Lokhttp3/MediaType;", "", "COLONSPACE", "[B", "CRLF", "DASHDASH", "DIGEST", "FORM", "MIXED", "PARALLEL", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Companion {
        /* JADX INFO: renamed from: a */
        public static void m21286a(String key, StringBuilder sb) {
            Intrinsics.m18599g(key, "key");
            sb.append('\"');
            int length = key.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = key.charAt(i);
                if (cCharAt == '\n') {
                    sb.append("%0A");
                } else if (cCharAt == '\r') {
                    sb.append("%0D");
                } else if (cCharAt == '\"') {
                    sb.append("%22");
                } else {
                    sb.append(cCharAt);
                }
            }
            sb.append('\"');
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lokhttp3/MultipartBody$Part;", "", "Companion", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Part {

        /* JADX INFO: renamed from: a */
        public final Headers f57144a;

        /* JADX INFO: renamed from: b */
        public final RequestBody f57145b;

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lokhttp3/MultipartBody$Part$Companion;", "", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
        @SourceDebugExtension
        public static final class Companion {
            /* JADX INFO: renamed from: a */
            public static Part m21287a(Headers headers, RequestBody body) {
                Intrinsics.m18599g(body, "body");
                if (headers.m21240c(HttpHeaders.CONTENT_TYPE) != null) {
                    throw new IllegalArgumentException("Unexpected header: Content-Type");
                }
                if (headers.m21240c(HttpHeaders.CONTENT_LENGTH) == null) {
                    return new Part(headers, body);
                }
                throw new IllegalArgumentException("Unexpected header: Content-Length");
            }

            /* JADX INFO: renamed from: b */
            public static Part m21288b(String str, String value) {
                Intrinsics.m18599g(value, "value");
                RequestBody.INSTANCE.getClass();
                return m21289c(str, null, RequestBody.Companion.m21303a(value, null));
            }

            /* JADX INFO: renamed from: c */
            public static Part m21289c(String str, String str2, RequestBody requestBody) {
                StringBuilder sbM2244s = AbstractC0455a.m2244s("form-data; name=");
                MediaType mediaType = MultipartBody.f57132e;
                Companion.m21286a(str, sbM2244s);
                if (str2 != null) {
                    sbM2244s.append("; filename=");
                    Companion.m21286a(str2, sbM2244s);
                }
                String string = sbM2244s.toString();
                Intrinsics.m18598f(string, "StringBuilder().apply(builderAction).toString()");
                Headers.Builder builder = new Headers.Builder();
                builder.m21248d(HttpHeaders.CONTENT_DISPOSITION, string);
                return m21287a(builder.m21249e(), requestBody);
            }
        }

        public Part(Headers headers, RequestBody requestBody) {
            this.f57144a = headers;
            this.f57145b = requestBody;
        }
    }

    static {
        Pattern pattern = MediaType.f57127d;
        f57132e = MediaType.Companion.m21283a("multipart/mixed");
        MediaType.Companion.m21283a("multipart/alternative");
        MediaType.Companion.m21283a("multipart/digest");
        MediaType.Companion.m21283a("multipart/parallel");
        f57133f = MediaType.Companion.m21283a("multipart/form-data");
        f57134g = new byte[]{58, 32};
        f57135h = new byte[]{Ascii.f42534CR, 10};
        f57136i = new byte[]{45, 45};
    }

    public MultipartBody(ByteString boundaryByteString, MediaType type, List list) {
        Intrinsics.m18599g(boundaryByteString, "boundaryByteString");
        Intrinsics.m18599g(type, "type");
        this.f57137a = boundaryByteString;
        this.f57138b = list;
        Pattern pattern = MediaType.f57127d;
        this.f57139c = MediaType.Companion.m21283a(type + "; boundary=" + boundaryByteString.m21629t());
        this.f57140d = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final long m21285a(BufferedSink bufferedSink, boolean z2) throws EOFException {
        Buffer buffer;
        BufferedSink buffer2;
        if (z2) {
            buffer2 = new Buffer();
            buffer = buffer2;
        } else {
            buffer = 0;
            buffer2 = bufferedSink;
        }
        List list = this.f57138b;
        int size = list.size();
        long j = 0;
        int i = 0;
        while (true) {
            ByteString byteString = this.f57137a;
            byte[] bArr = f57136i;
            byte[] bArr2 = f57135h;
            if (i >= size) {
                Intrinsics.m18596d(buffer2);
                buffer2.write(bArr);
                buffer2.mo21565G0(byteString);
                buffer2.write(bArr);
                buffer2.write(bArr2);
                if (!z2) {
                    return j;
                }
                Intrinsics.m18596d(buffer);
                long j2 = j + buffer.f57830b;
                buffer.m21586a();
                return j2;
            }
            Part part = (Part) list.get(i);
            Headers headers = part.f57144a;
            Intrinsics.m18596d(buffer2);
            buffer2.write(bArr);
            buffer2.mo21565G0(byteString);
            buffer2.write(bArr2);
            int size2 = headers.size();
            for (int i2 = 0; i2 < size2; i2++) {
                buffer2.mo21585Z(headers.m21241e(i2)).write(f57134g).mo21585Z(headers.m21243g(i2)).write(bArr2);
            }
            RequestBody requestBody = part.f57145b;
            MediaType f57139c = requestBody.getF57139c();
            if (f57139c != null) {
                buffer2.mo21585Z("Content-Type: ").mo21585Z(f57139c.f57129a).write(bArr2);
            }
            long jContentLength = requestBody.contentLength();
            if (jContentLength != -1) {
                buffer2.mo21585Z("Content-Length: ").mo21579U0(jContentLength).write(bArr2);
            } else if (z2) {
                Intrinsics.m18596d(buffer);
                buffer.m21586a();
                return -1L;
            }
            buffer2.write(bArr2);
            if (z2) {
                j += jContentLength;
            } else {
                requestBody.writeTo(buffer2);
            }
            buffer2.write(bArr2);
            i++;
        }
    }

    @Override // okhttp3.RequestBody
    public final long contentLength() throws EOFException {
        long j = this.f57140d;
        if (j != -1) {
            return j;
        }
        long jM21285a = m21285a(null, true);
        this.f57140d = jM21285a;
        return jM21285a;
    }

    @Override // okhttp3.RequestBody
    /* JADX INFO: renamed from: contentType, reason: from getter */
    public final MediaType getF57139c() {
        return this.f57139c;
    }

    @Override // okhttp3.RequestBody
    public final void writeTo(BufferedSink bufferedSink) throws EOFException {
        m21285a(bufferedSink, false);
    }
}
