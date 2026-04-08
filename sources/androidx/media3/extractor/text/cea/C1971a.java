package androidx.media3.extractor.text.cea;

import androidx.media3.extractor.text.cea.Cea708Decoder;
import java.util.Comparator;

/* JADX INFO: renamed from: androidx.media3.extractor.text.cea.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1971a implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return Integer.compare(((Cea708Decoder.Cea708CueInfo) obj2).f29071b, ((Cea708Decoder.Cea708CueInfo) obj).f29071b);
    }
}
