package androidx.media3.datasource;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.DataSource;
import com.engagelab.privates.common.constants.MTCommonConstants;
import com.engagelab.privates.core.constants.MTCoreConstants;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.net.SocketTimeoutException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public interface HttpDataSource extends DataSource {

    /* JADX INFO: compiled from: Proguard */
    @UnstableApi
    public static abstract class BaseFactory implements Factory {
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class CleartextNotPermittedException extends HttpDataSourceException {
    }

    /* JADX INFO: compiled from: Proguard */
    public interface Factory extends DataSource.Factory {
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class InvalidContentTypeException extends HttpDataSourceException {
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class InvalidResponseCodeException extends HttpDataSourceException {

        /* JADX INFO: renamed from: d */
        public final int f25873d;

        /* JADX INFO: renamed from: f */
        public final Map f25874f;

        public InvalidResponseCodeException(int i, DataSourceException dataSourceException, Map map) {
            super(AbstractC0000a.m9f(i, "Response code: "), dataSourceException, 2004);
            this.f25873d = i;
            this.f25874f = map;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @UnstableApi
    public static final class RequestProperties {

        /* JADX INFO: renamed from: a */
        public final HashMap f25875a = new HashMap();

        /* JADX INFO: renamed from: b */
        public Map f25876b;

        /* JADX INFO: renamed from: a */
        public final synchronized Map m9689a() {
            try {
                if (this.f25876b == null) {
                    this.f25876b = Collections.unmodifiableMap(new HashMap(this.f25875a));
                }
            } catch (Throwable th) {
                throw th;
            }
            return this.f25876b;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class HttpDataSourceException extends DataSourceException {

        /* JADX INFO: renamed from: c */
        public final int f25872c;

        /* JADX INFO: compiled from: Proguard */
        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface Type {
        }

        public HttpDataSourceException() {
            super(2008);
            this.f25872c = 1;
        }

        /* JADX INFO: renamed from: a */
        public static HttpDataSourceException m9688a(IOException iOException, int i) {
            String message = iOException.getMessage();
            int i2 = iOException instanceof SocketTimeoutException ? MTCoreConstants.MainWhat.ON_TCP_DISCONNECTED : iOException instanceof InterruptedIOException ? MTCommonConstants.MainWhat.ON_NETWORK_DISCONNECTED : (message == null || !Ascii.toLowerCase(message).matches("cleartext.*not permitted.*")) ? MTCoreConstants.MainWhat.ON_TCP_CONNECTED : 2007;
            return i2 == 2007 ? new CleartextNotPermittedException("Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted", iOException, 2007) : new HttpDataSourceException(iOException, i2, i);
        }

        public HttpDataSourceException(String str, int i) {
            super(str, i == 2000 ? MTCoreConstants.MainWhat.ON_TCP_CONNECTED : i);
            this.f25872c = 1;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public HttpDataSourceException(IOException iOException, int i, int i2) {
            if (i == 2000 && i2 == 1) {
                i = MTCoreConstants.MainWhat.ON_TCP_CONNECTED;
            }
            super(iOException, i);
            this.f25872c = i2;
        }

        public HttpDataSourceException(String str, IOException iOException, int i) {
            super(str, iOException, i == 2000 ? MTCoreConstants.MainWhat.ON_TCP_CONNECTED : i);
            this.f25872c = 1;
        }
    }
}
