package androidx.media3.datasource;

import android.net.Uri;
import androidx.media3.common.DataReader;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public interface DataSource extends DataReader {

    /* JADX INFO: compiled from: Proguard */
    public interface Factory {
    }

    /* JADX INFO: renamed from: b */
    void mo9669b(TransferListener transferListener);

    void close();

    /* JADX INFO: renamed from: f */
    default Map mo9670f() {
        return Collections.EMPTY_MAP;
    }

    Uri getUri();

    /* JADX INFO: renamed from: i */
    long mo9671i(DataSpec dataSpec);
}
