package androidx.media3.extractor.p016ts;

import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.p016ts.TsPayloadReader;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public interface ElementaryStreamReader {
    /* JADX INFO: renamed from: a */
    void mo11042a();

    /* JADX INFO: renamed from: b */
    void mo11043b(ParsableByteArray parsableByteArray);

    /* JADX INFO: renamed from: c */
    void mo11044c(boolean z2);

    /* JADX INFO: renamed from: d */
    void mo11045d(int i, long j);

    /* JADX INFO: renamed from: e */
    void mo11046e(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator);
}
