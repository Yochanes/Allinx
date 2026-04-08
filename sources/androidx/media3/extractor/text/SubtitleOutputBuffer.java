package androidx.media3.extractor.text;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.decoder.DecoderOutputBuffer;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public abstract class SubtitleOutputBuffer extends DecoderOutputBuffer implements Subtitle {

    /* JADX INFO: renamed from: f */
    public Subtitle f28997f;

    /* JADX INFO: renamed from: g */
    public long f28998g;

    @Override // androidx.media3.extractor.text.Subtitle
    /* JADX INFO: renamed from: a */
    public final int mo10949a(long j) {
        Subtitle subtitle = this.f28997f;
        subtitle.getClass();
        return subtitle.mo10949a(j - this.f28998g);
    }

    @Override // androidx.media3.extractor.text.Subtitle
    /* JADX INFO: renamed from: b */
    public final long mo10950b(int i) {
        Subtitle subtitle = this.f28997f;
        subtitle.getClass();
        return subtitle.mo10950b(i) + this.f28998g;
    }

    @Override // androidx.media3.extractor.text.Subtitle
    /* JADX INFO: renamed from: c */
    public final List mo10951c(long j) {
        Subtitle subtitle = this.f28997f;
        subtitle.getClass();
        return subtitle.mo10951c(j - this.f28998g);
    }

    @Override // androidx.media3.extractor.text.Subtitle
    /* JADX INFO: renamed from: d */
    public final int mo10952d() {
        Subtitle subtitle = this.f28997f;
        subtitle.getClass();
        return subtitle.mo10952d();
    }

    @Override // androidx.media3.decoder.DecoderOutputBuffer
    /* JADX INFO: renamed from: h */
    public final void mo9745h() {
        super.mo9745h();
        this.f28997f = null;
    }
}
