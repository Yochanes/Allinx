package androidx.media3.datasource;

import android.net.Uri;
import android.util.Base64;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class DataSchemeDataSource extends BaseDataSource {

    /* JADX INFO: renamed from: e */
    public DataSpec f25807e;

    /* JADX INFO: renamed from: f */
    public byte[] f25808f;

    /* JADX INFO: renamed from: g */
    public int f25809g;

    /* JADX INFO: renamed from: h */
    public int f25810h;

    @Override // androidx.media3.datasource.DataSource
    public final void close() {
        if (this.f25808f != null) {
            this.f25808f = null;
            m9673l();
        }
        this.f25807e = null;
    }

    @Override // androidx.media3.datasource.DataSource
    public final Uri getUri() {
        DataSpec dataSpec = this.f25807e;
        if (dataSpec != null) {
            return dataSpec.f25819a;
        }
        return null;
    }

    @Override // androidx.media3.datasource.DataSource
    /* JADX INFO: renamed from: i */
    public final long mo9671i(DataSpec dataSpec) throws ParserException, DataSourceException {
        m9674m(dataSpec);
        this.f25807e = dataSpec;
        Uri uriNormalizeScheme = dataSpec.f25819a.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        Assertions.m9461b("data".equals(scheme), "Unsupported scheme: " + scheme);
        String schemeSpecificPart = uriNormalizeScheme.getSchemeSpecificPart();
        int i = Util.f25665a;
        String[] strArrSplit = schemeSpecificPart.split(",", -1);
        if (strArrSplit.length != 2) {
            throw new ParserException("Unexpected URI format: " + uriNormalizeScheme, null, true, 0);
        }
        String str = strArrSplit[1];
        if (strArrSplit[0].contains(";base64")) {
            try {
                this.f25808f = Base64.decode(str, 0);
            } catch (IllegalArgumentException e) {
                throw new ParserException(AbstractC0000a.m13j("Error while parsing Base64 encoded string: ", str), e, true, 0);
            }
        } else {
            this.f25808f = URLDecoder.decode(str, StandardCharsets.US_ASCII.name()).getBytes(StandardCharsets.UTF_8);
        }
        byte[] bArr = this.f25808f;
        long length = bArr.length;
        long j = dataSpec.f25823e;
        if (j > length) {
            this.f25808f = null;
            throw new DataSourceException(2008);
        }
        int i2 = (int) j;
        this.f25809g = i2;
        int length2 = bArr.length - i2;
        this.f25810h = length2;
        long j2 = dataSpec.f25824f;
        if (j2 != -1) {
            this.f25810h = (int) Math.min(length2, j2);
        }
        m9675n(dataSpec);
        return j2 != -1 ? j2 : this.f25810h;
    }

    @Override // androidx.media3.common.DataReader
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f25810h;
        if (i3 == 0) {
            return -1;
        }
        int iMin = Math.min(i2, i3);
        byte[] bArr2 = this.f25808f;
        int i4 = Util.f25665a;
        System.arraycopy(bArr2, this.f25809g, bArr, i, iMin);
        this.f25809g += iMin;
        this.f25810h -= iMin;
        m9672k(iMin);
        return iMin;
    }
}
