package androidx.media3.exoplayer.upstream;

import androidx.media3.exoplayer.upstream.SlidingPercentile;
import java.util.Comparator;

/* JADX INFO: renamed from: androidx.media3.exoplayer.upstream.d */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1919d implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f27759a;

    public /* synthetic */ C1919d(int i) {
        this.f27759a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        SlidingPercentile.Sample sample = (SlidingPercentile.Sample) obj;
        SlidingPercentile.Sample sample2 = (SlidingPercentile.Sample) obj2;
        switch (this.f27759a) {
            case 0:
                return sample.f27751a - sample2.f27751a;
            default:
                return Float.compare(sample.f27753c, sample2.f27753c);
        }
    }
}
