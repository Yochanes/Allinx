package androidx.media3.common.audio;

import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.util.UnstableApi;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class SpeedChangingAudioProcessor implements AudioProcessor {

    /* JADX INFO: renamed from: b */
    public boolean f25496b;

    @Override // androidx.media3.common.audio.AudioProcessor
    /* JADX INFO: renamed from: b */
    public final boolean mo9437b() {
        if (this.f25496b) {
            throw null;
        }
        return false;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    /* JADX INFO: renamed from: c */
    public final ByteBuffer mo9438c() {
        throw null;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    /* JADX INFO: renamed from: d */
    public final void mo9439d(ByteBuffer byteBuffer) {
        throw null;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    /* JADX INFO: renamed from: e */
    public final void mo9440e() {
        this.f25496b = true;
        throw null;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    /* JADX INFO: renamed from: f */
    public final AudioProcessor.AudioFormat mo9441f(AudioProcessor.AudioFormat audioFormat) {
        throw null;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void flush() {
        this.f25496b = false;
        throw null;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final boolean isActive() {
        throw null;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void reset() {
        this.f25496b = false;
        throw null;
    }
}
