package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.DataSpec;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class LoadEventInfo {

    /* JADX INFO: renamed from: b */
    public static final AtomicLong f27196b = new AtomicLong();

    /* JADX INFO: renamed from: a */
    public final Map f27197a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LoadEventInfo(long j, DataSpec dataSpec) {
        this(j, Collections.EMPTY_MAP);
        Uri uri = dataSpec.f25819a;
    }

    public LoadEventInfo(long j, Map map) {
        this.f27197a = map;
    }
}
