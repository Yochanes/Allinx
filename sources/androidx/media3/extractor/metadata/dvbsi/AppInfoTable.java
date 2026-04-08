package androidx.media3.extractor.metadata.dvbsi;

import androidx.media3.common.Metadata;
import androidx.media3.common.util.UnstableApi;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class AppInfoTable implements Metadata.Entry {

    /* JADX INFO: renamed from: a */
    public final int f28448a;

    /* JADX INFO: renamed from: b */
    public final String f28449b;

    public AppInfoTable(int i, String str) {
        this.f28448a = i;
        this.f28449b = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Ait(controlCode=");
        sb.append(this.f28448a);
        sb.append(",url=");
        return AbstractC0000a.m19p(sb, this.f28449b, ")");
    }
}
