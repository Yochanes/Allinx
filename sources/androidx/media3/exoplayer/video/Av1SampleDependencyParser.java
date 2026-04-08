package androidx.media3.exoplayer.video;

import androidx.media3.container.ObuParser;
import java.util.ArrayList;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class Av1SampleDependencyParser {

    /* JADX INFO: renamed from: a */
    public ObuParser.SequenceHeader f27768a;

    /* JADX INFO: renamed from: a */
    public final void m10687a(ArrayList arrayList) {
        ObuParser.SequenceHeader sequenceHeader;
        for (int i = 0; i < arrayList.size(); i++) {
            if (((ObuParser.Obu) arrayList.get(i)).f25767a == 1) {
                try {
                    sequenceHeader = new ObuParser.SequenceHeader((ObuParser.Obu) arrayList.get(i));
                } catch (ObuParser.NotYetImplementedException unused) {
                    sequenceHeader = null;
                }
                this.f27768a = sequenceHeader;
            }
        }
    }
}
