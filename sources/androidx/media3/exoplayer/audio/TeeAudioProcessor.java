package androidx.media3.exoplayer.audio;

import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class TeeAudioProcessor extends androidx.media3.common.audio.BaseAudioProcessor {

    /* JADX INFO: compiled from: Proguard */
    public interface AudioBufferSink {
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class WavFileAudioBufferSink implements AudioBufferSink {
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    /* JADX INFO: renamed from: d */
    public final void mo9439d(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() == 0) {
            return;
        }
        int i = Util.f25665a;
        byteBuffer.asReadOnlyBuffer().order(byteBuffer.order());
        throw null;
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    /* JADX INFO: renamed from: g */
    public final void mo9443g() {
        if (isActive()) {
            int i = this.f25451b.f25447a;
            throw null;
        }
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    /* JADX INFO: renamed from: h */
    public final void mo9444h() {
        if (isActive()) {
            int i = this.f25451b.f25447a;
            throw null;
        }
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    /* JADX INFO: renamed from: i */
    public final void mo9445i() {
        if (isActive()) {
            int i = this.f25451b.f25447a;
            throw null;
        }
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    /* JADX INFO: renamed from: a */
    public final AudioProcessor.AudioFormat mo9442a(AudioProcessor.AudioFormat audioFormat) {
        return audioFormat;
    }
}
