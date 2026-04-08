package androidx.media3.common.audio;

import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.util.UnstableApi;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public abstract class BaseAudioProcessor implements AudioProcessor {

    /* JADX INFO: renamed from: b */
    public AudioProcessor.AudioFormat f25451b;

    /* JADX INFO: renamed from: c */
    public AudioProcessor.AudioFormat f25452c;

    /* JADX INFO: renamed from: d */
    public AudioProcessor.AudioFormat f25453d;

    /* JADX INFO: renamed from: e */
    public AudioProcessor.AudioFormat f25454e;

    /* JADX INFO: renamed from: f */
    public ByteBuffer f25455f;

    /* JADX INFO: renamed from: g */
    public ByteBuffer f25456g;

    /* JADX INFO: renamed from: h */
    public boolean f25457h;

    public BaseAudioProcessor() {
        ByteBuffer byteBuffer = AudioProcessor.f25445a;
        this.f25455f = byteBuffer;
        this.f25456g = byteBuffer;
        AudioProcessor.AudioFormat audioFormat = AudioProcessor.AudioFormat.f25446e;
        this.f25453d = audioFormat;
        this.f25454e = audioFormat;
        this.f25451b = audioFormat;
        this.f25452c = audioFormat;
    }

    /* JADX INFO: renamed from: a */
    public AudioProcessor.AudioFormat mo9442a(AudioProcessor.AudioFormat audioFormat) {
        return AudioProcessor.AudioFormat.f25446e;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    /* JADX INFO: renamed from: b */
    public boolean mo9437b() {
        return this.f25457h && this.f25456g == AudioProcessor.f25445a;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    /* JADX INFO: renamed from: c */
    public ByteBuffer mo9438c() {
        ByteBuffer byteBuffer = this.f25456g;
        this.f25456g = AudioProcessor.f25445a;
        return byteBuffer;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    /* JADX INFO: renamed from: e */
    public final void mo9440e() {
        this.f25457h = true;
        mo9444h();
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    /* JADX INFO: renamed from: f */
    public final AudioProcessor.AudioFormat mo9441f(AudioProcessor.AudioFormat audioFormat) {
        this.f25453d = audioFormat;
        this.f25454e = mo9442a(audioFormat);
        return isActive() ? this.f25454e : AudioProcessor.AudioFormat.f25446e;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void flush() {
        this.f25456g = AudioProcessor.f25445a;
        this.f25457h = false;
        this.f25451b = this.f25453d;
        this.f25452c = this.f25454e;
        mo9443g();
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public boolean isActive() {
        return this.f25454e != AudioProcessor.AudioFormat.f25446e;
    }

    /* JADX INFO: renamed from: j */
    public final ByteBuffer m9446j(int i) {
        if (this.f25455f.capacity() < i) {
            this.f25455f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f25455f.clear();
        }
        ByteBuffer byteBuffer = this.f25455f;
        this.f25456g = byteBuffer;
        return byteBuffer;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void reset() {
        flush();
        this.f25455f = AudioProcessor.f25445a;
        AudioProcessor.AudioFormat audioFormat = AudioProcessor.AudioFormat.f25446e;
        this.f25453d = audioFormat;
        this.f25454e = audioFormat;
        this.f25451b = audioFormat;
        this.f25452c = audioFormat;
        mo9445i();
    }

    /* JADX INFO: renamed from: g */
    public void mo9443g() {
    }

    /* JADX INFO: renamed from: h */
    public void mo9444h() {
    }

    /* JADX INFO: renamed from: i */
    public void mo9445i() {
    }
}
