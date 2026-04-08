package androidx.media3.extractor.text.cea;

import androidx.media3.common.util.Assertions;
import androidx.media3.extractor.text.Subtitle;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class CeaSubtitle implements Subtitle {

    /* JADX INFO: renamed from: a */
    public final List f29116a;

    public CeaSubtitle(List list) {
        this.f29116a = list;
    }

    @Override // androidx.media3.extractor.text.Subtitle
    /* JADX INFO: renamed from: a */
    public final int mo10949a(long j) {
        return j < 0 ? 0 : -1;
    }

    @Override // androidx.media3.extractor.text.Subtitle
    /* JADX INFO: renamed from: b */
    public final long mo10950b(int i) {
        Assertions.m9460a(i == 0);
        return 0L;
    }

    @Override // androidx.media3.extractor.text.Subtitle
    /* JADX INFO: renamed from: c */
    public final List mo10951c(long j) {
        return j >= 0 ? this.f29116a : Collections.EMPTY_LIST;
    }

    @Override // androidx.media3.extractor.text.Subtitle
    /* JADX INFO: renamed from: d */
    public final int mo10952d() {
        return 1;
    }
}
