package androidx.media3.exoplayer;

import androidx.media3.common.audio.AudioManagerCompat;
import androidx.media3.common.util.BackgroundThreadStateHandler;
import androidx.media3.common.util.RunnableC1750c;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.AudioBecomingNoisyManager;

/* JADX INFO: renamed from: androidx.media3.exoplayer.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1782a implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f26361a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f26362b;

    public /* synthetic */ RunnableC1782a(Object obj, int i) {
        this.f26361a = i;
        this.f26362b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f26362b;
        switch (this.f26361a) {
            case 0:
                AudioBecomingNoisyManager audioBecomingNoisyManager = (AudioBecomingNoisyManager) obj;
                audioBecomingNoisyManager.f25962a.unregisterReceiver(audioBecomingNoisyManager.f25963b);
                break;
            case 1:
                AudioBecomingNoisyManager.AudioBecomingNoisyReceiver audioBecomingNoisyReceiver = (AudioBecomingNoisyManager.AudioBecomingNoisyReceiver) obj;
                if (AudioBecomingNoisyManager.this.f25965d) {
                    audioBecomingNoisyReceiver.f25966a.mo9764A();
                }
                break;
            default:
                int i = ExoPlayerImpl.f26076j0;
                ExoPlayerImpl exoPlayerImpl = (ExoPlayerImpl) obj;
                exoPlayerImpl.getClass();
                int i2 = Util.f25665a;
                Integer numValueOf = Integer.valueOf(AudioManagerCompat.m9430a(exoPlayerImpl.f26110e).generateAudioSessionId());
                BackgroundThreadStateHandler backgroundThreadStateHandler = exoPlayerImpl.f26082F;
                backgroundThreadStateHandler.getClass();
                backgroundThreadStateHandler.f25575b.mo9489e(new RunnableC1750c(2, backgroundThreadStateHandler, numValueOf));
                break;
        }
    }
}
