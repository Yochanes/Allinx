package androidx.media3.exoplayer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import androidx.media3.common.util.HandlerWrapper;
import androidx.media3.common.util.SystemClock;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class AudioBecomingNoisyManager {

    /* JADX INFO: renamed from: a */
    public final Context f25962a;

    /* JADX INFO: renamed from: b */
    public final AudioBecomingNoisyReceiver f25963b;

    /* JADX INFO: renamed from: c */
    public final HandlerWrapper f25964c;

    /* JADX INFO: renamed from: d */
    public boolean f25965d;

    /* JADX INFO: compiled from: Proguard */
    public final class AudioBecomingNoisyReceiver extends BroadcastReceiver {

        /* JADX INFO: renamed from: a */
        public final EventListener f25966a;

        /* JADX INFO: renamed from: b */
        public final HandlerWrapper f25967b;

        public AudioBecomingNoisyReceiver(HandlerWrapper handlerWrapper, EventListener eventListener) {
            this.f25967b = handlerWrapper;
            this.f25966a = eventListener;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.f25967b.mo9489e(new RunnableC1782a(this, 1));
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface EventListener {
        /* JADX INFO: renamed from: A */
        void mo9764A();
    }

    public AudioBecomingNoisyManager(Context context, Looper looper, Looper looper2, EventListener eventListener, SystemClock systemClock) {
        this.f25962a = context.getApplicationContext();
        this.f25964c = systemClock.mo9469a(looper, null);
        this.f25963b = new AudioBecomingNoisyReceiver(systemClock.mo9469a(looper2, null), eventListener);
    }

    /* JADX INFO: renamed from: a */
    public final void m9763a() {
        if (this.f25965d) {
            this.f25964c.mo9489e(new RunnableC1782a(this, 0));
            this.f25965d = false;
        }
    }
}
