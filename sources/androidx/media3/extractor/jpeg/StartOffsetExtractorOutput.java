package androidx.media3.extractor.jpeg;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.ForwardingSeekMap;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.SeekPoint;
import androidx.media3.extractor.TrackOutput;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class StartOffsetExtractorOutput implements ExtractorOutput {

    /* JADX INFO: renamed from: a */
    public final long f28440a;

    /* JADX INFO: renamed from: b */
    public final ExtractorOutput f28441b;

    /* JADX INFO: renamed from: androidx.media3.extractor.jpeg.StartOffsetExtractorOutput$1 */
    /* JADX INFO: compiled from: Proguard */
    class C19561 extends ForwardingSeekMap {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ SeekMap f28442b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19561(SeekMap seekMap, SeekMap seekMap2) {
            super(seekMap);
            this.f28442b = seekMap2;
        }

        @Override // androidx.media3.extractor.ForwardingSeekMap, androidx.media3.extractor.SeekMap
        /* JADX INFO: renamed from: j */
        public final SeekMap.SeekPoints mo10590j(long j) {
            SeekMap.SeekPoints seekPointsMo10590j = this.f28442b.mo10590j(j);
            SeekPoint seekPoint = seekPointsMo10590j.f28265a;
            long j2 = seekPoint.f28270a;
            long j3 = StartOffsetExtractorOutput.this.f28440a;
            SeekPoint seekPoint2 = new SeekPoint(j2, seekPoint.f28271b + j3);
            SeekPoint seekPoint3 = seekPointsMo10590j.f28266b;
            return new SeekMap.SeekPoints(seekPoint2, new SeekPoint(seekPoint3.f28270a, seekPoint3.f28271b + j3));
        }
    }

    public StartOffsetExtractorOutput(long j, ExtractorOutput extractorOutput) {
        this.f28440a = j;
        this.f28441b = extractorOutput;
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    /* JADX INFO: renamed from: a */
    public final void mo9958a(SeekMap seekMap) {
        this.f28441b.mo9958a(new C19561(seekMap, seekMap));
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    /* JADX INFO: renamed from: h */
    public final void mo9959h() {
        this.f28441b.mo9959h();
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    /* JADX INFO: renamed from: j */
    public final TrackOutput mo9960j(int i, int i2) {
        return this.f28441b.mo9960j(i, i2);
    }
}
