package androidx.media3.datasource;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class AssetDataSource extends BaseDataSource {

    /* JADX INFO: renamed from: e */
    public final AssetManager f25787e;

    /* JADX INFO: renamed from: f */
    public Uri f25788f;

    /* JADX INFO: renamed from: g */
    public InputStream f25789g;

    /* JADX INFO: renamed from: h */
    public long f25790h;

    /* JADX INFO: renamed from: i */
    public boolean f25791i;

    /* JADX INFO: compiled from: Proguard */
    public static final class AssetDataSourceException extends DataSourceException {
    }

    public AssetDataSource(Context context) {
        super(false);
        this.f25787e = context.getAssets();
    }

    @Override // androidx.media3.datasource.DataSource
    public final void close() {
        this.f25788f = null;
        try {
            try {
                InputStream inputStream = this.f25789g;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                throw new AssetDataSourceException(e, 2000);
            }
        } finally {
            this.f25789g = null;
            if (this.f25791i) {
                this.f25791i = false;
                m9673l();
            }
        }
    }

    @Override // androidx.media3.datasource.DataSource
    public final Uri getUri() {
        return this.f25788f;
    }

    @Override // androidx.media3.datasource.DataSource
    /* JADX INFO: renamed from: i */
    public final long mo9671i(DataSpec dataSpec) throws AssetDataSourceException {
        try {
            Uri uri = dataSpec.f25819a;
            long j = dataSpec.f25823e;
            this.f25788f = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith(RemoteSettings.FORWARD_SLASH_STRING)) {
                path = path.substring(1);
            }
            m9674m(dataSpec);
            InputStream inputStreamOpen = this.f25787e.open(path, 1);
            this.f25789g = inputStreamOpen;
            if (inputStreamOpen.skip(j) < j) {
                throw new AssetDataSourceException(null, 2008);
            }
            long j2 = dataSpec.f25824f;
            if (j2 != -1) {
                this.f25790h = j2;
            } else {
                long jAvailable = this.f25789g.available();
                this.f25790h = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.f25790h = -1L;
                }
            }
            this.f25791i = true;
            m9675n(dataSpec);
            return this.f25790h;
        } catch (AssetDataSourceException e) {
            throw e;
        } catch (IOException e2) {
            throw new AssetDataSourceException(e2, e2 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // androidx.media3.common.DataReader
    public final int read(byte[] bArr, int i, int i2) throws AssetDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f25790h;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new AssetDataSourceException(e, 2000);
                }
            }
            InputStream inputStream = this.f25789g;
            int i3 = Util.f25665a;
            int i4 = inputStream.read(bArr, i, i2);
            if (i4 != -1) {
                long j2 = this.f25790h;
                if (j2 != -1) {
                    this.f25790h = j2 - ((long) i4);
                }
                m9672k(i4);
                return i4;
            }
        }
        return -1;
    }
}
