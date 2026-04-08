package androidx.media3.extractor.p016ts;

import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.p016ts.TsPayloadReader;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public interface SectionPayloadReader {
    /* JADX INFO: renamed from: b */
    void mo11068b(ParsableByteArray parsableByteArray);

    /* JADX INFO: renamed from: c */
    void mo11069c(TimestampAdjuster timestampAdjuster, ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator);
}
