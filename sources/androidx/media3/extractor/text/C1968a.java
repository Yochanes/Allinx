package androidx.media3.extractor.text;

import androidx.media3.common.util.Consumer;
import androidx.media3.extractor.text.SubtitleExtractor;
import com.google.common.collect.ImmutableList;

/* JADX INFO: renamed from: androidx.media3.extractor.text.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1968a implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f29017a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f29018b;

    public /* synthetic */ C1968a(Object obj, int i) {
        this.f29017a = i;
        this.f29018b = obj;
    }

    @Override // androidx.media3.common.util.Consumer
    public final void accept(Object obj) {
        switch (this.f29017a) {
            case 0:
                CuesWithTiming cuesWithTiming = (CuesWithTiming) obj;
                SubtitleExtractor subtitleExtractor = (SubtitleExtractor) this.f29018b;
                subtitleExtractor.getClass();
                SubtitleExtractor.Sample sample = new SubtitleExtractor.Sample(CueEncoder.m10948a(cuesWithTiming.f28977c, cuesWithTiming.f28975a), cuesWithTiming.f28976b);
                subtitleExtractor.f28986c.add(sample);
                long j = subtitleExtractor.f28993j;
                if (j == -9223372036854775807L || cuesWithTiming.f28976b >= j) {
                    subtitleExtractor.m10959c(sample);
                }
                break;
            default:
                ((ImmutableList.Builder) this.f29018b).add((CuesWithTiming) obj);
                break;
        }
    }
}
