package androidx.media3.datasource.cache;

import android.net.Uri;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.TransferListener;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Map;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class CacheDataSource implements DataSource {

    /* JADX INFO: renamed from: a */
    public Uri f25917a;

    /* JADX INFO: renamed from: b */
    public DataSpec f25918b;

    /* JADX INFO: compiled from: Proguard */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface CacheIgnoredReason {
    }

    /* JADX INFO: compiled from: Proguard */
    public interface EventListener {
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Factory implements DataSource.Factory {
    }

    /* JADX INFO: compiled from: Proguard */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    @Override // androidx.media3.datasource.DataSource
    /* JADX INFO: renamed from: b */
    public final void mo9669b(TransferListener transferListener) {
        transferListener.getClass();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:?, code lost:
    
        throw null;
     */
    @Override // androidx.media3.datasource.DataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() {
        this.f25918b = null;
        this.f25917a = null;
        throw null;
    }

    @Override // androidx.media3.datasource.DataSource
    /* JADX INFO: renamed from: f */
    public final Map mo9670f() {
        throw null;
    }

    @Override // androidx.media3.datasource.DataSource
    public final Uri getUri() {
        return this.f25917a;
    }

    @Override // androidx.media3.datasource.DataSource
    /* JADX INFO: renamed from: i */
    public final long mo9671i(DataSpec dataSpec) {
        throw null;
    }

    @Override // androidx.media3.common.DataReader
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (0 == 0) {
            return -1;
        }
        this.f25918b.getClass();
        throw null;
    }
}
