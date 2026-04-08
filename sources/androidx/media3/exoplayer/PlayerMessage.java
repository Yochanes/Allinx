package androidx.media3.exoplayer;

import android.os.Looper;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.SystemClock;
import androidx.media3.common.util.UnstableApi;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class PlayerMessage {

    /* JADX INFO: renamed from: a */
    public final Target f26326a;

    /* JADX INFO: renamed from: b */
    public final Sender f26327b;

    /* JADX INFO: renamed from: c */
    public int f26328c;

    /* JADX INFO: renamed from: d */
    public Object f26329d;

    /* JADX INFO: renamed from: e */
    public final Looper f26330e;

    /* JADX INFO: renamed from: f */
    public boolean f26331f;

    /* JADX INFO: compiled from: Proguard */
    public interface Sender {
        /* JADX INFO: renamed from: c */
        void mo9905c(PlayerMessage playerMessage);
    }

    /* JADX INFO: compiled from: Proguard */
    public interface Target {
        /* JADX INFO: renamed from: x */
        void mo9794x(int i, Object obj);
    }

    public PlayerMessage(Sender sender, Target target, Timeline timeline, int i, SystemClock systemClock, Looper looper) {
        this.f26327b = sender;
        this.f26326a = target;
        this.f26330e = looper;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m10030a(boolean z2) {
        notifyAll();
    }

    /* JADX INFO: renamed from: b */
    public final void m10031b() {
        Assertions.m9464e(!this.f26331f);
        this.f26331f = true;
        this.f26327b.mo9905c(this);
    }
}
