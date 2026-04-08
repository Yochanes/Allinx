package androidx.media3.extractor.text.webvtt;

import androidx.media3.extractor.text.webvtt.WebvttCueParser;
import java.util.Comparator;

/* JADX INFO: renamed from: androidx.media3.extractor.text.webvtt.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1975a implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f29370a;

    public /* synthetic */ C1975a(int i) {
        this.f29370a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f29370a) {
            case 0:
                return Integer.compare(((WebvttCueParser.Element) obj).f29346a.f29349b, ((WebvttCueParser.Element) obj2).f29346a.f29349b);
            default:
                return Long.compare(((WebvttCueInfo) obj).f29339b, ((WebvttCueInfo) obj2).f29339b);
        }
    }
}
