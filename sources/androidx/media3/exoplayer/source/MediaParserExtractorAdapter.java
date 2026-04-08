package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.annotation.RequiresApi;
import androidx.media3.common.AbstractC1740a;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.DataSource;
import androidx.media3.exoplayer.source.ProgressiveMediaExtractor;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.PositionHolder;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
@UnstableApi
public final class MediaParserExtractorAdapter implements ProgressiveMediaExtractor {

    /* JADX INFO: renamed from: a */
    public String f27228a;

    /* JADX INFO: compiled from: Proguard */
    public static final class Factory implements ProgressiveMediaExtractor.Factory {
        static {
            new HashMap();
        }
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    /* JADX INFO: renamed from: a */
    public final void mo10458a(long j, long j2) {
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    /* JADX INFO: renamed from: b */
    public final long mo10459b() {
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    /* JADX INFO: renamed from: c */
    public final void mo10460c() {
        if ("android.media.mediaparser.Mp3Parser".equals(this.f27228a)) {
            throw null;
        }
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    /* JADX INFO: renamed from: d */
    public final int mo10461d(PositionHolder positionHolder) {
        AbstractC1740a.m9401B(null, null);
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    /* JADX INFO: renamed from: e */
    public final void mo10462e(DataSource dataSource, Uri uri, Map map, long j, long j2, ExtractorOutput extractorOutput) {
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    public final void release() {
        AbstractC1740a.m9426w(null);
    }
}
