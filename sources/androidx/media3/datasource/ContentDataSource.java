package androidx.media3.datasource;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class ContentDataSource extends BaseDataSource {

    /* JADX INFO: renamed from: e */
    public final ContentResolver f25801e;

    /* JADX INFO: renamed from: f */
    public Uri f25802f;

    /* JADX INFO: renamed from: g */
    public AssetFileDescriptor f25803g;

    /* JADX INFO: renamed from: h */
    public FileInputStream f25804h;

    /* JADX INFO: renamed from: i */
    public long f25805i;

    /* JADX INFO: renamed from: j */
    public boolean f25806j;

    /* JADX INFO: compiled from: Proguard */
    public static class ContentDataSourceException extends DataSourceException {
    }

    public ContentDataSource(Context context) {
        super(false);
        this.f25801e = context.getContentResolver();
    }

    @Override // androidx.media3.datasource.DataSource
    public final void close() {
        this.f25802f = null;
        try {
            try {
                FileInputStream fileInputStream = this.f25804h;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f25804h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f25803g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e) {
                        throw new ContentDataSourceException(e, 2000);
                    }
                } finally {
                    this.f25803g = null;
                    if (this.f25806j) {
                        this.f25806j = false;
                        m9673l();
                    }
                }
            } catch (IOException e2) {
                throw new ContentDataSourceException(e2, 2000);
            }
        } catch (Throwable th) {
            this.f25804h = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f25803g;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f25803g = null;
                    if (this.f25806j) {
                        this.f25806j = false;
                        m9673l();
                    }
                    throw th;
                } catch (IOException e3) {
                    throw new ContentDataSourceException(e3, 2000);
                }
            } finally {
                this.f25803g = null;
                if (this.f25806j) {
                    this.f25806j = false;
                    m9673l();
                }
            }
        }
    }

    @Override // androidx.media3.datasource.DataSource
    public final Uri getUri() {
        return this.f25802f;
    }

    @Override // androidx.media3.datasource.DataSource
    /* JADX INFO: renamed from: i */
    public final long mo9671i(DataSpec dataSpec) throws ContentDataSourceException {
        int i;
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        try {
            try {
                Uri uriNormalizeScheme = dataSpec.f25819a.normalizeScheme();
                this.f25802f = uriNormalizeScheme;
                m9674m(dataSpec);
                boolean zEquals = FirebaseAnalytics.Param.CONTENT.equals(uriNormalizeScheme.getScheme());
                ContentResolver contentResolver = this.f25801e;
                if (zEquals) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(uriNormalizeScheme, "*/*", bundle);
                } else {
                    assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uriNormalizeScheme, "r");
                }
                this.f25803g = assetFileDescriptorOpenAssetFileDescriptor;
                if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                    i = 2000;
                    try {
                        throw new ContentDataSourceException(new IOException("Could not open file descriptor for: " + uriNormalizeScheme), 2000);
                    } catch (IOException e) {
                        e = e;
                        if (e instanceof FileNotFoundException) {
                            i = 2005;
                        }
                        throw new ContentDataSourceException(e, i);
                    }
                }
                long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
                this.f25804h = fileInputStream;
                long j = dataSpec.f25823e;
                if (length != -1 && j > length) {
                    throw new ContentDataSourceException(null, 2008);
                }
                long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
                long jSkip = fileInputStream.skip(startOffset + j) - startOffset;
                if (jSkip != j) {
                    throw new ContentDataSourceException(null, 2008);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    long size = channel.size();
                    if (size == 0) {
                        this.f25805i = -1L;
                    } else {
                        long jPosition = size - channel.position();
                        this.f25805i = jPosition;
                        if (jPosition < 0) {
                            throw new ContentDataSourceException(null, 2008);
                        }
                    }
                } else {
                    long j2 = length - jSkip;
                    this.f25805i = j2;
                    if (j2 < 0) {
                        throw new ContentDataSourceException(null, 2008);
                    }
                }
                long j3 = dataSpec.f25824f;
                if (j3 != -1) {
                    long j4 = this.f25805i;
                    this.f25805i = j4 == -1 ? j3 : Math.min(j4, j3);
                }
                this.f25806j = true;
                m9675n(dataSpec);
                return j3 != -1 ? j3 : this.f25805i;
            } catch (ContentDataSourceException e2) {
                throw e2;
            }
        } catch (IOException e3) {
            e = e3;
            i = 2000;
        }
    }

    @Override // androidx.media3.common.DataReader
    public final int read(byte[] bArr, int i, int i2) throws ContentDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f25805i;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new ContentDataSourceException(e, 2000);
                }
            }
            FileInputStream fileInputStream = this.f25804h;
            int i3 = Util.f25665a;
            int i4 = fileInputStream.read(bArr, i, i2);
            if (i4 != -1) {
                long j2 = this.f25805i;
                if (j2 != -1) {
                    this.f25805i = j2 - ((long) i4);
                }
                m9672k(i4);
                return i4;
            }
        }
        return -1;
    }
}
