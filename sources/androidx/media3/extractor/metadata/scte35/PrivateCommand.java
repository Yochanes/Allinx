package androidx.media3.extractor.metadata.scte35;

import androidx.media3.common.util.UnstableApi;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class PrivateCommand extends SpliceCommand {

    /* JADX INFO: renamed from: a */
    public final long f28537a;

    /* JADX INFO: renamed from: b */
    public final long f28538b;

    public PrivateCommand(long j, long j2) {
        this.f28537a = j2;
        this.f28538b = j;
    }

    @Override // androidx.media3.extractor.metadata.scte35.SpliceCommand
    public final String toString() {
        StringBuilder sb = new StringBuilder("SCTE-35 PrivateCommand { ptsAdjustment=");
        sb.append(this.f28537a);
        sb.append(", identifier= ");
        return AbstractC0000a.m12i(this.f28538b, " }", sb);
    }
}
