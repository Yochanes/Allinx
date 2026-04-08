package androidx.media3.datasource;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import com.engagelab.privates.common.constants.MTCommonConstants;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class FileDataSource extends BaseDataSource {

    /* JADX INFO: renamed from: e */
    public RandomAccessFile f25863e;

    /* JADX INFO: renamed from: f */
    public Uri f25864f;

    /* JADX INFO: renamed from: g */
    public long f25865g;

    /* JADX INFO: renamed from: h */
    public boolean f25866h;

    /* JADX INFO: compiled from: Proguard */
    public static final class Factory implements DataSource.Factory {
    }

    /* JADX INFO: compiled from: Proguard */
    public static class FileDataSourceException extends DataSourceException {
    }

    @Override // androidx.media3.datasource.DataSource
    public final void close() {
        this.f25864f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f25863e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e) {
                throw new FileDataSourceException(e, 2000);
            }
        } finally {
            this.f25863e = null;
            if (this.f25866h) {
                this.f25866h = false;
                m9673l();
            }
        }
    }

    @Override // androidx.media3.datasource.DataSource
    public final Uri getUri() {
        return this.f25864f;
    }

    @Override // androidx.media3.datasource.DataSource
    /* JADX INFO: renamed from: i */
    public final long mo9671i(DataSpec dataSpec) throws FileDataSourceException {
        Uri uri = dataSpec.f25819a;
        long j = dataSpec.f25823e;
        this.f25864f = uri;
        m9674m(dataSpec);
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.f25863e = randomAccessFile;
            try {
                randomAccessFile.seek(j);
                long length = dataSpec.f25824f;
                if (length == -1) {
                    length = this.f25863e.length() - j;
                }
                this.f25865g = length;
                if (length < 0) {
                    throw new FileDataSourceException(null, null, 2008);
                }
                this.f25866h = true;
                m9675n(dataSpec);
                return this.f25865g;
            } catch (IOException e) {
                throw new FileDataSourceException(e, 2000);
            }
        } catch (FileNotFoundException e2) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new FileDataSourceException(e2, ((e2.getCause() instanceof ErrnoException) && ((ErrnoException) e2.getCause()).errno == OsConstants.EACCES) ? 2006 : 2005);
            }
            String path2 = uri.getPath();
            String query = uri.getQuery();
            String fragment = uri.getFragment();
            StringBuilder sbM25v = AbstractC0000a.m25v("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=", path2, ",query=", query, ",fragment=");
            sbM25v.append(fragment);
            throw new FileDataSourceException(sbM25v.toString(), e2, MTCommonConstants.MainWhat.ON_NETWORK_DISCONNECTED);
        } catch (SecurityException e3) {
            throw new FileDataSourceException(e3, 2006);
        } catch (RuntimeException e4) {
            throw new FileDataSourceException(e4, 2000);
        }
    }

    @Override // androidx.media3.common.DataReader
    public final int read(byte[] bArr, int i, int i2) throws FileDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f25865g;
        if (j == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f25863e;
            int i3 = Util.f25665a;
            int i4 = randomAccessFile.read(bArr, i, (int) Math.min(j, i2));
            if (i4 > 0) {
                this.f25865g -= (long) i4;
                m9672k(i4);
            }
            return i4;
        } catch (IOException e) {
            throw new FileDataSourceException(e, 2000);
        }
    }
}
