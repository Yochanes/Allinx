package androidx.media3.exoplayer.audio;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class AudioTimestampPoller {

    /* JADX INFO: renamed from: a */
    public final AudioTimestampWrapper f26536a;

    /* JADX INFO: renamed from: b */
    public int f26537b;

    /* JADX INFO: renamed from: c */
    public long f26538c;

    /* JADX INFO: renamed from: d */
    public long f26539d;

    /* JADX INFO: renamed from: e */
    public long f26540e;

    /* JADX INFO: renamed from: f */
    public long f26541f;

    /* JADX INFO: compiled from: Proguard */
    public static final class AudioTimestampWrapper {

        /* JADX INFO: renamed from: a */
        public final AudioTrack f26542a;

        /* JADX INFO: renamed from: b */
        public final AudioTimestamp f26543b = new AudioTimestamp();

        /* JADX INFO: renamed from: c */
        public long f26544c;

        /* JADX INFO: renamed from: d */
        public long f26545d;

        /* JADX INFO: renamed from: e */
        public long f26546e;

        /* JADX INFO: renamed from: f */
        public boolean f26547f;

        /* JADX INFO: renamed from: g */
        public long f26548g;

        public AudioTimestampWrapper(AudioTrack audioTrack) {
            this.f26542a = audioTrack;
        }
    }

    public AudioTimestampPoller(AudioTrack audioTrack) {
        this.f26536a = new AudioTimestampWrapper(audioTrack);
        m10215a();
    }

    /* JADX INFO: renamed from: a */
    public final void m10215a() {
        if (this.f26536a != null) {
            m10216b(0);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m10216b(int i) {
        this.f26537b = i;
        if (i == 0) {
            this.f26540e = 0L;
            this.f26541f = -1L;
            this.f26538c = System.nanoTime() / 1000;
            this.f26539d = 10000L;
            return;
        }
        if (i == 1) {
            this.f26539d = 10000L;
            return;
        }
        if (i == 2 || i == 3) {
            this.f26539d = 10000000L;
        } else {
            if (i != 4) {
                throw new IllegalStateException();
            }
            this.f26539d = 500000L;
        }
    }
}
