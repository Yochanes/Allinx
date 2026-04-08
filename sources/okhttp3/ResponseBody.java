package okhttp3;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import okhttp3.internal.Util;
import okio.BufferedSource;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m18302d2 = {"Lokhttp3/ResponseBody;", "Ljava/io/Closeable;", "BomAwareReader", "Companion", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@SourceDebugExtension
public abstract class ResponseBody implements Closeable {

    /* JADX INFO: renamed from: a */
    public BomAwareReader f57256a;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lokhttp3/ResponseBody$BomAwareReader;", "Ljava/io/Reader;", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static final class BomAwareReader extends Reader {

        /* JADX INFO: renamed from: a */
        public final BufferedSource f57257a;

        /* JADX INFO: renamed from: b */
        public final Charset f57258b;

        /* JADX INFO: renamed from: c */
        public boolean f57259c;

        /* JADX INFO: renamed from: d */
        public InputStreamReader f57260d;

        public BomAwareReader(BufferedSource source, Charset charset) {
            Intrinsics.m18599g(source, "source");
            Intrinsics.m18599g(charset, "charset");
            this.f57257a = source;
            this.f57258b = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            Unit unit;
            this.f57259c = true;
            InputStreamReader inputStreamReader = this.f57260d;
            if (inputStreamReader != null) {
                inputStreamReader.close();
                unit = Unit.f51459a;
            } else {
                unit = null;
            }
            if (unit == null) {
                this.f57257a.close();
            }
        }

        @Override // java.io.Reader
        public final int read(char[] cbuf, int i, int i2) throws IOException {
            Intrinsics.m18599g(cbuf, "cbuf");
            if (this.f57259c) {
                throw new IOException("Stream closed");
            }
            InputStreamReader inputStreamReader = this.f57260d;
            if (inputStreamReader == null) {
                BufferedSource bufferedSource = this.f57257a;
                inputStreamReader = new InputStreamReader(bufferedSource.mo21583X0(), Util.m21336s(bufferedSource, this.f57258b));
                this.f57260d = inputStreamReader;
            }
            return inputStreamReader.read(cbuf, i, i2);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lokhttp3/ResponseBody$Companion;", "", "okhttp"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: renamed from: a */
    public abstract long getF57262c();

    /* JADX INFO: renamed from: b */
    public abstract MediaType getF57261b();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Util.m21320c(mo21177d());
    }

    /* JADX INFO: renamed from: d */
    public abstract BufferedSource mo21177d();

    /* JADX INFO: renamed from: g */
    public final String m21313g() throws IOException {
        Charset charsetM21282a;
        BufferedSource bufferedSourceMo21177d = mo21177d();
        try {
            MediaType f57261b = getF57261b();
            if (f57261b == null || (charsetM21282a = f57261b.m21282a(Charsets.f55167a)) == null) {
                charsetM21282a = Charsets.f55167a;
            }
            String strMo21596i0 = bufferedSourceMo21177d.mo21596i0(Util.m21336s(bufferedSourceMo21177d, charsetM21282a));
            bufferedSourceMo21177d.close();
            return strMo21596i0;
        } finally {
        }
    }
}
