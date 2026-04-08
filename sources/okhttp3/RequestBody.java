package okhttp3;

import java.io.File;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import okhttp3.MediaType;
import okhttp3.internal.Util;
import okio.BufferedSink;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b&\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0007"}, m18302d2 = {"Lokhttp3/RequestBody;", "", "", "isDuplex", "()Z", "isOneShot", "Companion", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public abstract class RequestBody {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lokhttp3/RequestBody$Companion;", "", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Companion {
        /* JADX INFO: renamed from: a */
        public static RequestBody$Companion$toRequestBody$2 m21303a(String str, MediaType mediaType) {
            Intrinsics.m18599g(str, "<this>");
            Charset charset = Charsets.f55167a;
            if (mediaType != null) {
                Pattern pattern = MediaType.f57127d;
                Charset charsetM21282a = mediaType.m21282a(null);
                if (charsetM21282a == null) {
                    mediaType = MediaType.Companion.m21284b(mediaType + "; charset=utf-8");
                } else {
                    charset = charsetM21282a;
                }
            }
            byte[] bytes = str.getBytes(charset);
            Intrinsics.m18598f(bytes, "this as java.lang.String).getBytes(charset)");
            return m21304b(mediaType, bytes, 0, bytes.length);
        }

        /* JADX INFO: renamed from: b */
        public static RequestBody$Companion$toRequestBody$2 m21304b(MediaType mediaType, byte[] bArr, int i, int i2) {
            Intrinsics.m18599g(bArr, "<this>");
            long length = bArr.length;
            long j = i;
            long j2 = i2;
            byte[] bArr2 = Util.f57274a;
            if ((j | j2) < 0 || j > length || length - j < j2) {
                throw new ArrayIndexOutOfBoundsException();
            }
            return new RequestBody$Companion$toRequestBody$2(mediaType, bArr, i2, i);
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ RequestBody$Companion$toRequestBody$2 m21305c(Companion companion, byte[] bArr, MediaType mediaType, int i, int i2) {
            if ((i2 & 1) != 0) {
                mediaType = null;
            }
            if ((i2 & 2) != 0) {
                i = 0;
            }
            int length = bArr.length;
            companion.getClass();
            return m21304b(mediaType, bArr, i, length);
        }
    }

    @JvmStatic
    @JvmName
    @NotNull
    public static final RequestBody create(@NotNull String str, @Nullable MediaType mediaType) {
        INSTANCE.getClass();
        return Companion.m21303a(str, mediaType);
    }

    public long contentLength() {
        return -1L;
    }

    /* JADX INFO: renamed from: contentType */
    public abstract MediaType getF57223a();

    public boolean isDuplex() {
        return false;
    }

    public boolean isOneShot() {
        return false;
    }

    public abstract void writeTo(BufferedSink bufferedSink);

    @Deprecated
    @JvmStatic
    @NotNull
    public static final RequestBody create(@Nullable MediaType mediaType, @NotNull File file) {
        INSTANCE.getClass();
        Intrinsics.m18599g(file, "file");
        return new RequestBody$Companion$asRequestBody$1(mediaType, file);
    }

    @Deprecated
    @JvmStatic
    @NotNull
    public static final RequestBody create(@Nullable MediaType mediaType, @NotNull String content) {
        INSTANCE.getClass();
        Intrinsics.m18599g(content, "content");
        return Companion.m21303a(content, mediaType);
    }

    @Deprecated
    @JvmStatic
    @NotNull
    public static final RequestBody create(@Nullable MediaType mediaType, @NotNull ByteString content) {
        INSTANCE.getClass();
        Intrinsics.m18599g(content, "content");
        return new RequestBody$Companion$toRequestBody$1(mediaType, content);
    }

    @JvmStatic
    @NotNull
    @Deprecated
    @JvmOverloads
    public static final RequestBody create(@Nullable MediaType mediaType, @NotNull byte[] content) {
        INSTANCE.getClass();
        Intrinsics.m18599g(content, "content");
        return Companion.m21304b(mediaType, content, 0, content.length);
    }

    @JvmStatic
    @NotNull
    @Deprecated
    @JvmOverloads
    public static final RequestBody create(@Nullable MediaType mediaType, @NotNull byte[] content, int i) {
        INSTANCE.getClass();
        Intrinsics.m18599g(content, "content");
        return Companion.m21304b(mediaType, content, i, content.length);
    }

    @JvmStatic
    @JvmName
    @NotNull
    @JvmOverloads
    public static final RequestBody create(@NotNull byte[] bArr) {
        Companion companion = INSTANCE;
        companion.getClass();
        Intrinsics.m18599g(bArr, "<this>");
        return Companion.m21305c(companion, bArr, null, 0, 7);
    }

    @JvmStatic
    @JvmName
    @NotNull
    @JvmOverloads
    public static final RequestBody create(@NotNull byte[] bArr, @Nullable MediaType mediaType) {
        Companion companion = INSTANCE;
        companion.getClass();
        Intrinsics.m18599g(bArr, "<this>");
        return Companion.m21305c(companion, bArr, mediaType, 0, 6);
    }

    @JvmStatic
    @JvmName
    @NotNull
    @JvmOverloads
    public static final RequestBody create(@NotNull byte[] bArr, @Nullable MediaType mediaType, int i) {
        Companion companion = INSTANCE;
        companion.getClass();
        Intrinsics.m18599g(bArr, "<this>");
        return Companion.m21305c(companion, bArr, mediaType, i, 4);
    }

    @JvmStatic
    @JvmName
    @NotNull
    @JvmOverloads
    public static final RequestBody create(@NotNull byte[] bArr, @Nullable MediaType mediaType, int i, int i2) {
        INSTANCE.getClass();
        return Companion.m21304b(mediaType, bArr, i, i2);
    }

    @JvmStatic
    @JvmName
    @NotNull
    public static final RequestBody create(@NotNull ByteString byteString, @Nullable MediaType mediaType) {
        INSTANCE.getClass();
        Intrinsics.m18599g(byteString, "<this>");
        return new RequestBody$Companion$toRequestBody$1(mediaType, byteString);
    }

    @JvmStatic
    @JvmName
    @NotNull
    public static final RequestBody create(@NotNull File file, @Nullable MediaType mediaType) {
        INSTANCE.getClass();
        Intrinsics.m18599g(file, "<this>");
        return new RequestBody$Companion$asRequestBody$1(mediaType, file);
    }

    @JvmStatic
    @NotNull
    @Deprecated
    @JvmOverloads
    public static final RequestBody create(@Nullable MediaType mediaType, @NotNull byte[] content, int i, int i2) {
        INSTANCE.getClass();
        Intrinsics.m18599g(content, "content");
        return Companion.m21304b(mediaType, content, i, i2);
    }
}
