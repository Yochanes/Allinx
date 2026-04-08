package androidx.media3.common.audio;

import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.util.UnstableApi;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class ChannelMixingAudioProcessor extends BaseAudioProcessor {
    @Override // androidx.media3.common.audio.BaseAudioProcessor
    /* JADX INFO: renamed from: a */
    public final AudioProcessor.AudioFormat mo9442a(AudioProcessor.AudioFormat audioFormat) throws AudioProcessor.UnhandledAudioFormatException {
        if (audioFormat.f25449c != 2) {
            throw new AudioProcessor.UnhandledAudioFormatException(audioFormat);
        }
        throw null;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    /* JADX INFO: renamed from: d */
    public final void mo9439d(ByteBuffer byteBuffer) {
        int i = this.f25451b.f25448b;
        throw null;
    }
}
