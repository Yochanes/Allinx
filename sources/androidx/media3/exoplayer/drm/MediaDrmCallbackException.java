package androidx.media3.exoplayer.drm;

import android.net.Uri;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.DataSpec;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class MediaDrmCallbackException extends IOException {

    /* JADX INFO: renamed from: a */
    public final Map f26842a;

    public MediaDrmCallbackException(DataSpec dataSpec, Uri uri, Map map, long j, Exception exc) {
        super(exc);
        this.f26842a = map;
    }
}
