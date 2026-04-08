package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.DataSource;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.PositionHolder;
import java.util.Map;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public interface ProgressiveMediaExtractor {

    /* JADX INFO: compiled from: Proguard */
    public interface Factory {
    }

    /* JADX INFO: renamed from: a */
    void mo10458a(long j, long j2);

    /* JADX INFO: renamed from: b */
    long mo10459b();

    /* JADX INFO: renamed from: c */
    void mo10460c();

    /* JADX INFO: renamed from: d */
    int mo10461d(PositionHolder positionHolder);

    /* JADX INFO: renamed from: e */
    void mo10462e(DataSource dataSource, Uri uri, Map map, long j, long j2, ExtractorOutput extractorOutput);

    void release();
}
