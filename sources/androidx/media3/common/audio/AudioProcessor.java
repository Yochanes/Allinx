package androidx.media3.common.audio;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Objects;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public interface AudioProcessor {

    /* JADX INFO: renamed from: a */
    public static final ByteBuffer f25445a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    /* JADX INFO: compiled from: Proguard */
    public static final class AudioFormat {

        /* JADX INFO: renamed from: e */
        public static final AudioFormat f25446e = new AudioFormat(-1, -1, -1);

        /* JADX INFO: renamed from: a */
        public final int f25447a;

        /* JADX INFO: renamed from: b */
        public final int f25448b;

        /* JADX INFO: renamed from: c */
        public final int f25449c;

        /* JADX INFO: renamed from: d */
        public final int f25450d;

        public AudioFormat(int i, int i2, int i3) {
            this.f25447a = i;
            this.f25448b = i2;
            this.f25449c = i3;
            this.f25450d = Util.m9595E(i3) ? Util.m9627r(i3) * i2 : -1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AudioFormat)) {
                return false;
            }
            AudioFormat audioFormat = (AudioFormat) obj;
            return this.f25447a == audioFormat.f25447a && this.f25448b == audioFormat.f25448b && this.f25449c == audioFormat.f25449c;
        }

        public final int hashCode() {
            return Objects.hash(Integer.valueOf(this.f25447a), Integer.valueOf(this.f25448b), Integer.valueOf(this.f25449c));
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AudioFormat[sampleRate=");
            sb.append(this.f25447a);
            sb.append(", channelCount=");
            sb.append(this.f25448b);
            sb.append(", encoding=");
            return AbstractC0000a.m17n(sb, this.f25449c, ']');
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class UnhandledAudioFormatException extends Exception {
        public UnhandledAudioFormatException(AudioFormat audioFormat) {
            this("Unhandled input format:", audioFormat);
        }

        public UnhandledAudioFormatException(String str, AudioFormat audioFormat) {
            super(str + " " + audioFormat);
        }
    }

    /* JADX INFO: renamed from: b */
    boolean mo9437b();

    /* JADX INFO: renamed from: c */
    ByteBuffer mo9438c();

    /* JADX INFO: renamed from: d */
    void mo9439d(ByteBuffer byteBuffer);

    /* JADX INFO: renamed from: e */
    void mo9440e();

    /* JADX INFO: renamed from: f */
    AudioFormat mo9441f(AudioFormat audioFormat);

    void flush();

    boolean isActive();

    void reset();
}
