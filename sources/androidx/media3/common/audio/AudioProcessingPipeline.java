package androidx.media3.common.audio;

import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import com.google.common.collect.ImmutableList;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class AudioProcessingPipeline {

    /* JADX INFO: renamed from: a */
    public final ImmutableList f25441a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f25442b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public ByteBuffer[] f25443c = new ByteBuffer[0];

    /* JADX INFO: renamed from: d */
    public boolean f25444d;

    public AudioProcessingPipeline(ImmutableList immutableList) {
        this.f25441a = immutableList;
        AudioProcessor.AudioFormat audioFormat = AudioProcessor.AudioFormat.f25446e;
        this.f25444d = false;
    }

    /* JADX INFO: renamed from: a */
    public final AudioProcessor.AudioFormat m9431a(AudioProcessor.AudioFormat audioFormat) throws AudioProcessor.UnhandledAudioFormatException {
        if (audioFormat.equals(AudioProcessor.AudioFormat.f25446e)) {
            throw new AudioProcessor.UnhandledAudioFormatException(audioFormat);
        }
        int i = 0;
        while (true) {
            ImmutableList immutableList = this.f25441a;
            if (i >= immutableList.size()) {
                return audioFormat;
            }
            AudioProcessor audioProcessor = (AudioProcessor) immutableList.get(i);
            AudioProcessor.AudioFormat audioFormatMo9441f = audioProcessor.mo9441f(audioFormat);
            if (audioProcessor.isActive()) {
                Assertions.m9464e(!audioFormatMo9441f.equals(AudioProcessor.AudioFormat.f25446e));
                audioFormat = audioFormatMo9441f;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m9432b() {
        ArrayList arrayList = this.f25442b;
        arrayList.clear();
        this.f25444d = false;
        int i = 0;
        while (true) {
            ImmutableList immutableList = this.f25441a;
            if (i >= immutableList.size()) {
                break;
            }
            AudioProcessor audioProcessor = (AudioProcessor) immutableList.get(i);
            audioProcessor.flush();
            if (audioProcessor.isActive()) {
                arrayList.add(audioProcessor);
            }
            i++;
        }
        this.f25443c = new ByteBuffer[arrayList.size()];
        for (int i2 = 0; i2 <= m9433c(); i2++) {
            this.f25443c[i2] = ((AudioProcessor) arrayList.get(i2)).mo9438c();
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m9433c() {
        return this.f25443c.length - 1;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m9434d() {
        return this.f25444d && ((AudioProcessor) this.f25442b.get(m9433c())).mo9437b() && !this.f25443c[m9433c()].hasRemaining();
    }

    /* JADX INFO: renamed from: e */
    public final boolean m9435e() {
        return !this.f25442b.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioProcessingPipeline)) {
            return false;
        }
        AudioProcessingPipeline audioProcessingPipeline = (AudioProcessingPipeline) obj;
        ImmutableList immutableList = this.f25441a;
        if (immutableList.size() != audioProcessingPipeline.f25441a.size()) {
            return false;
        }
        for (int i = 0; i < immutableList.size(); i++) {
            if (immutableList.get(i) != audioProcessingPipeline.f25441a.get(i)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final void m9436f(ByteBuffer byteBuffer) {
        boolean z2;
        for (boolean z3 = true; z3; z3 = z2) {
            z2 = false;
            int i = 0;
            while (i <= m9433c()) {
                if (!this.f25443c[i].hasRemaining()) {
                    ArrayList arrayList = this.f25442b;
                    AudioProcessor audioProcessor = (AudioProcessor) arrayList.get(i);
                    if (!audioProcessor.mo9437b()) {
                        ByteBuffer byteBuffer2 = i > 0 ? this.f25443c[i - 1] : byteBuffer.hasRemaining() ? byteBuffer : AudioProcessor.f25445a;
                        long jRemaining = byteBuffer2.remaining();
                        audioProcessor.mo9439d(byteBuffer2);
                        this.f25443c[i] = audioProcessor.mo9438c();
                        z2 |= jRemaining - ((long) byteBuffer2.remaining()) > 0 || this.f25443c[i].hasRemaining();
                    } else if (!this.f25443c[i].hasRemaining() && i < m9433c()) {
                        ((AudioProcessor) arrayList.get(i + 1)).mo9440e();
                    }
                }
                i++;
            }
        }
    }

    public final int hashCode() {
        return this.f25441a.hashCode();
    }
}
