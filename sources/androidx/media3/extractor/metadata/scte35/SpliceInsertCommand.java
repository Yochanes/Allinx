package androidx.media3.extractor.metadata.scte35;

import androidx.media3.common.util.UnstableApi;
import java.util.Collections;
import java.util.List;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class SpliceInsertCommand extends SpliceCommand {

    /* JADX INFO: renamed from: a */
    public final long f28542a;

    /* JADX INFO: renamed from: b */
    public final long f28543b;

    /* JADX INFO: renamed from: c */
    public final List f28544c;

    /* JADX INFO: compiled from: Proguard */
    public static final class ComponentSplice {
    }

    public SpliceInsertCommand(long j, long j2, List list) {
        this.f28542a = j;
        this.f28543b = j2;
        this.f28544c = Collections.unmodifiableList(list);
    }

    @Override // androidx.media3.extractor.metadata.scte35.SpliceCommand
    public final String toString() {
        StringBuilder sb = new StringBuilder("SCTE-35 SpliceInsertCommand { programSplicePts=");
        sb.append(this.f28542a);
        sb.append(", programSplicePlaybackPositionUs= ");
        return AbstractC0000a.m12i(this.f28543b, " }", sb);
    }
}
