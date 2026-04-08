package androidx.media3.exoplayer.text;

import androidx.media3.extractor.text.CuesWithTiming;
import com.google.common.collect.ImmutableList;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
interface CuesResolver {
    /* JADX INFO: renamed from: a */
    long mo10623a(long j);

    /* JADX INFO: renamed from: b */
    ImmutableList mo10624b(long j);

    /* JADX INFO: renamed from: c */
    boolean mo10625c(CuesWithTiming cuesWithTiming, long j);

    void clear();

    /* JADX INFO: renamed from: d */
    long mo10626d(long j);

    /* JADX INFO: renamed from: e */
    void mo10627e(long j);
}
