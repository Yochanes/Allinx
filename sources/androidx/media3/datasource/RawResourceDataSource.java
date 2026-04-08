package androidx.media3.datasource;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.engagelab.privates.common.constants.MTCommonConstants;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.List;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class RawResourceDataSource extends BaseDataSource {

    /* JADX INFO: renamed from: e */
    public final Context f25895e;

    /* JADX INFO: renamed from: f */
    public DataSpec f25896f;

    /* JADX INFO: renamed from: g */
    public AssetFileDescriptor f25897g;

    /* JADX INFO: renamed from: h */
    public FileInputStream f25898h;

    /* JADX INFO: renamed from: i */
    public long f25899i;

    /* JADX INFO: renamed from: j */
    public boolean f25900j;

    /* JADX INFO: compiled from: Proguard */
    public static class RawResourceDataSourceException extends DataSourceException {
    }

    public RawResourceDataSource(Context context) {
        super(false);
        this.f25895e = context.getApplicationContext();
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i) {
        return Uri.parse("rawresource:///" + i);
    }

    @Override // androidx.media3.datasource.DataSource
    public final void close() {
        this.f25896f = null;
        try {
            try {
                FileInputStream fileInputStream = this.f25898h;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f25898h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f25897g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e) {
                        throw new RawResourceDataSourceException(null, e, 2000);
                    }
                } finally {
                    this.f25897g = null;
                    if (this.f25900j) {
                        this.f25900j = false;
                        m9673l();
                    }
                }
            } catch (IOException e2) {
                throw new RawResourceDataSourceException(null, e2, 2000);
            }
        } catch (Throwable th) {
            this.f25898h = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f25897g;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f25897g = null;
                    if (this.f25900j) {
                        this.f25900j = false;
                        m9673l();
                    }
                    throw th;
                } catch (IOException e3) {
                    throw new RawResourceDataSourceException(null, e3, 2000);
                }
            } finally {
                this.f25897g = null;
                if (this.f25900j) {
                    this.f25900j = false;
                    m9673l();
                }
            }
        }
    }

    @Override // androidx.media3.datasource.DataSource
    public final Uri getUri() {
        DataSpec dataSpec = this.f25896f;
        if (dataSpec != null) {
            return dataSpec.f25819a;
        }
        return null;
    }

    @Override // androidx.media3.datasource.DataSource
    /* JADX INFO: renamed from: i */
    public final long mo9671i(DataSpec dataSpec) throws RawResourceDataSourceException {
        Resources resourcesForApplication;
        int identifier;
        int i;
        Resources resources;
        this.f25896f = dataSpec;
        m9674m(dataSpec);
        Uri uriNormalizeScheme = dataSpec.f25819a.normalizeScheme();
        boolean zEquals = TextUtils.equals("rawresource", uriNormalizeScheme.getScheme());
        Context context = this.f25895e;
        if (zEquals) {
            resources = context.getResources();
            List<String> pathSegments = uriNormalizeScheme.getPathSegments();
            if (pathSegments.size() != 1) {
                throw new RawResourceDataSourceException("rawresource:// URI must have exactly one path element, found " + pathSegments.size(), null, 2000);
            }
            try {
                i = Integer.parseInt(pathSegments.get(0));
            } catch (NumberFormatException unused) {
                throw new RawResourceDataSourceException("Resource identifier must be an integer.", null, MTCommonConstants.MainWhat.ON_NETWORK_DISCONNECTED);
            }
        } else {
            if (!TextUtils.equals("android.resource", uriNormalizeScheme.getScheme())) {
                throw new RawResourceDataSourceException("Unsupported URI scheme (" + uriNormalizeScheme.getScheme() + "). Only android.resource is supported.", null, MTCommonConstants.MainWhat.ON_NETWORK_DISCONNECTED);
            }
            String path = uriNormalizeScheme.getPath();
            path.getClass();
            if (path.startsWith(RemoteSettings.FORWARD_SLASH_STRING)) {
                path = path.substring(1);
            }
            String packageName = TextUtils.isEmpty(uriNormalizeScheme.getHost()) ? context.getPackageName() : uriNormalizeScheme.getHost();
            if (packageName.equals(context.getPackageName())) {
                resourcesForApplication = context.getResources();
            } else {
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication(packageName);
                } catch (PackageManager.NameNotFoundException e) {
                    throw new RawResourceDataSourceException("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e, 2005);
                }
            }
            if (path.matches("\\d+")) {
                try {
                    identifier = Integer.parseInt(path);
                } catch (NumberFormatException unused2) {
                    throw new RawResourceDataSourceException("Resource identifier must be an integer.", null, MTCommonConstants.MainWhat.ON_NETWORK_DISCONNECTED);
                }
            } else {
                identifier = resourcesForApplication.getIdentifier(AbstractC0000a.m14k(packageName, ":", path), "raw", null);
                if (identifier == 0) {
                    throw new RawResourceDataSourceException("Resource not found.", null, 2005);
                }
            }
            i = identifier;
            resources = resourcesForApplication;
        }
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = resources.openRawResourceFd(i);
            if (assetFileDescriptorOpenRawResourceFd == null) {
                throw new RawResourceDataSourceException("Resource is compressed: " + uriNormalizeScheme, null, 2000);
            }
            this.f25897g = assetFileDescriptorOpenRawResourceFd;
            long length = assetFileDescriptorOpenRawResourceFd.getLength();
            FileInputStream fileInputStream = new FileInputStream(this.f25897g.getFileDescriptor());
            this.f25898h = fileInputStream;
            long j = dataSpec.f25823e;
            try {
                if (length != -1 && j > length) {
                    throw new RawResourceDataSourceException(null, null, 2008);
                }
                long startOffset = this.f25897g.getStartOffset();
                long jSkip = fileInputStream.skip(startOffset + j) - startOffset;
                if (jSkip != j) {
                    throw new RawResourceDataSourceException(null, null, 2008);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    if (channel.size() == 0) {
                        this.f25899i = -1L;
                    } else {
                        long size = channel.size() - channel.position();
                        this.f25899i = size;
                        if (size < 0) {
                            throw new RawResourceDataSourceException(null, null, 2008);
                        }
                    }
                } else {
                    long j2 = length - jSkip;
                    this.f25899i = j2;
                    if (j2 < 0) {
                        throw new DataSourceException(2008);
                    }
                }
                long j3 = dataSpec.f25824f;
                if (j3 != -1) {
                    long j4 = this.f25899i;
                    this.f25899i = j4 == -1 ? j3 : Math.min(j4, j3);
                }
                this.f25900j = true;
                m9675n(dataSpec);
                return j3 != -1 ? j3 : this.f25899i;
            } catch (RawResourceDataSourceException e2) {
                throw e2;
            } catch (IOException e3) {
                throw new RawResourceDataSourceException(null, e3, 2000);
            }
        } catch (Resources.NotFoundException e4) {
            throw new RawResourceDataSourceException(null, e4, 2005);
        }
    }

    @Override // androidx.media3.common.DataReader
    public final int read(byte[] bArr, int i, int i2) throws RawResourceDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f25899i;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new RawResourceDataSourceException(null, e, 2000);
                }
            }
            FileInputStream fileInputStream = this.f25898h;
            int i3 = Util.f25665a;
            int i4 = fileInputStream.read(bArr, i, i2);
            if (i4 != -1) {
                long j2 = this.f25899i;
                if (j2 != -1) {
                    this.f25899i = j2 - ((long) i4);
                }
                m9672k(i4);
                return i4;
            }
            if (this.f25899i != -1) {
                throw new RawResourceDataSourceException("End of stream reached having not read sufficient data.", new EOFException(), 2000);
            }
        }
        return -1;
    }
}
