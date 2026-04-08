package androidx.media3.exoplayer.text;

import androidx.media3.extractor.text.CuesWithTiming;
import com.google.common.base.Function;
import com.google.common.collect.Ordering;

/* JADX INFO: renamed from: androidx.media3.exoplayer.text.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1901a implements Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f27551a;

    public /* synthetic */ C1901a(int i) {
        this.f27551a = i;
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        CuesWithTiming cuesWithTiming = (CuesWithTiming) obj;
        switch (this.f27551a) {
            case 0:
                Ordering ordering = MergingCuesResolver.f27526b;
                return Long.valueOf(cuesWithTiming.f28976b);
            default:
                Ordering ordering2 = MergingCuesResolver.f27526b;
                return Long.valueOf(cuesWithTiming.f28977c);
        }
    }
}
