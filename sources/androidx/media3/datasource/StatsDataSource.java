package androidx.media3.datasource;

import android.net.Uri;
import androidx.media3.common.util.UnstableApi;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class StatsDataSource implements DataSource {

    /* JADX INFO: renamed from: a */
    public final DataSource f25902a;

    /* JADX INFO: renamed from: b */
    public long f25903b;

    /* JADX INFO: renamed from: c */
    public Uri f25904c;

    /* JADX INFO: renamed from: d */
    public Map f25905d;

    public StatsDataSource(DataSource dataSource) {
        dataSource.getClass();
        this.f25902a = dataSource;
        this.f25904c = Uri.EMPTY;
        this.f25905d = Collections.EMPTY_MAP;
    }

    @Override // androidx.media3.datasource.DataSource
    /* JADX INFO: renamed from: b */
    public final void mo9669b(TransferListener transferListener) {
        transferListener.getClass();
        this.f25902a.mo9669b(transferListener);
    }

    @Override // androidx.media3.datasource.DataSource
    public final void close() {
        this.f25902a.close();
    }

    @Override // androidx.media3.datasource.DataSource
    /* JADX INFO: renamed from: f */
    public final Map mo9670f() {
        return this.f25902a.mo9670f();
    }

    @Override // androidx.media3.datasource.DataSource
    public final Uri getUri() {
        return this.f25902a.getUri();
    }

    @Override // androidx.media3.datasource.DataSource
    /* JADX INFO: renamed from: i */
    public final long mo9671i(DataSpec dataSpec) {
        DataSource dataSource = this.f25902a;
        this.f25904c = dataSpec.f25819a;
        this.f25905d = Collections.EMPTY_MAP;
        try {
            return dataSource.mo9671i(dataSpec);
        } finally {
            Uri uri = dataSource.getUri();
            if (uri != null) {
                this.f25904c = uri;
            }
            this.f25905d = dataSource.mo9670f();
        }
    }

    @Override // androidx.media3.common.DataReader
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.f25902a.read(bArr, i, i2);
        if (i3 != -1) {
            this.f25903b += (long) i3;
        }
        return i3;
    }
}
