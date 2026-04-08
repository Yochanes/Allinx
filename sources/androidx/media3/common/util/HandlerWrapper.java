package androidx.media3.common.util;

import android.os.Looper;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public interface HandlerWrapper {

    /* JADX INFO: compiled from: Proguard */
    public interface Message {
        /* JADX INFO: renamed from: a */
        void mo9497a();
    }

    /* JADX INFO: renamed from: a */
    boolean mo9485a();

    /* JADX INFO: renamed from: b */
    Message mo9486b(int i, int i2, int i3);

    /* JADX INFO: renamed from: c */
    Message mo9487c(int i, int i2, Object obj);

    /* JADX INFO: renamed from: d */
    boolean mo9488d(Message message);

    /* JADX INFO: renamed from: e */
    boolean mo9489e(Runnable runnable);

    /* JADX INFO: renamed from: f */
    Message mo9490f(int i);

    /* JADX INFO: renamed from: g */
    void mo9491g();

    /* JADX INFO: renamed from: h */
    boolean mo9492h(long j);

    /* JADX INFO: renamed from: i */
    boolean mo9493i(int i);

    /* JADX INFO: renamed from: j */
    void mo9494j(int i);

    /* JADX INFO: renamed from: k */
    Message mo9495k(int i, Object obj);

    /* JADX INFO: renamed from: l */
    Looper mo9496l();
}
