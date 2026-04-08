package androidx.media3.exoplayer.text;

import androidx.media3.extractor.text.SimpleSubtitleDecoder;
import androidx.media3.extractor.text.Subtitle;
import androidx.media3.extractor.text.SubtitleParser;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class DelegatingSubtitleDecoder extends SimpleSubtitleDecoder {

    /* JADX INFO: renamed from: p */
    public final SubtitleParser f27525p;

    public DelegatingSubtitleDecoder(String str, SubtitleParser subtitleParser) {
        super(str);
        this.f27525p = subtitleParser;
    }

    @Override // androidx.media3.extractor.text.SimpleSubtitleDecoder
    /* JADX INFO: renamed from: n */
    public final Subtitle mo10628n(byte[] bArr, int i, boolean z2) {
        SubtitleParser subtitleParser = this.f27525p;
        if (z2) {
            subtitleParser.reset();
        }
        return subtitleParser.mo10961b(bArr, 0, i);
    }
}
