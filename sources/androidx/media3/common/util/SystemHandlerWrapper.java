package androidx.media3.common.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.media3.common.util.HandlerWrapper;
import java.util.ArrayList;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class SystemHandlerWrapper implements HandlerWrapper {

    /* JADX INFO: renamed from: b */
    public static final ArrayList f25654b = new ArrayList(50);

    /* JADX INFO: renamed from: a */
    public final Handler f25655a;

    /* JADX INFO: compiled from: Proguard */
    public static final class SystemMessage implements HandlerWrapper.Message {

        /* JADX INFO: renamed from: a */
        public Message f25656a;

        @Override // androidx.media3.common.util.HandlerWrapper.Message
        /* JADX INFO: renamed from: a */
        public final void mo9497a() {
            Message message = this.f25656a;
            message.getClass();
            message.sendToTarget();
            m9577b();
        }

        /* JADX INFO: renamed from: b */
        public final void m9577b() {
            this.f25656a = null;
            ArrayList arrayList = SystemHandlerWrapper.f25654b;
            synchronized (arrayList) {
                if (arrayList.size() < 50) {
                    arrayList.add(this);
                }
            }
        }
    }

    public SystemHandlerWrapper(Handler handler) {
        this.f25655a = handler;
    }

    /* JADX INFO: renamed from: m */
    public static SystemMessage m9576m() {
        SystemMessage systemMessage;
        ArrayList arrayList = f25654b;
        synchronized (arrayList) {
            try {
                systemMessage = arrayList.isEmpty() ? new SystemMessage() : (SystemMessage) arrayList.remove(arrayList.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return systemMessage;
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    /* JADX INFO: renamed from: a */
    public final boolean mo9485a() {
        return this.f25655a.hasMessages(1);
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    /* JADX INFO: renamed from: b */
    public final HandlerWrapper.Message mo9486b(int i, int i2, int i3) {
        SystemMessage systemMessageM9576m = m9576m();
        systemMessageM9576m.f25656a = this.f25655a.obtainMessage(i, i2, i3);
        return systemMessageM9576m;
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    /* JADX INFO: renamed from: c */
    public final HandlerWrapper.Message mo9487c(int i, int i2, Object obj) {
        SystemMessage systemMessageM9576m = m9576m();
        systemMessageM9576m.f25656a = this.f25655a.obtainMessage(i, 0, i2, obj);
        return systemMessageM9576m;
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    /* JADX INFO: renamed from: d */
    public final boolean mo9488d(HandlerWrapper.Message message) {
        SystemMessage systemMessage = (SystemMessage) message;
        Message message2 = systemMessage.f25656a;
        message2.getClass();
        boolean zSendMessageAtFrontOfQueue = this.f25655a.sendMessageAtFrontOfQueue(message2);
        systemMessage.m9577b();
        return zSendMessageAtFrontOfQueue;
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    /* JADX INFO: renamed from: e */
    public final boolean mo9489e(Runnable runnable) {
        return this.f25655a.post(runnable);
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    /* JADX INFO: renamed from: f */
    public final HandlerWrapper.Message mo9490f(int i) {
        SystemMessage systemMessageM9576m = m9576m();
        systemMessageM9576m.f25656a = this.f25655a.obtainMessage(i);
        return systemMessageM9576m;
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    /* JADX INFO: renamed from: g */
    public final void mo9491g() {
        this.f25655a.removeCallbacksAndMessages(null);
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    /* JADX INFO: renamed from: h */
    public final boolean mo9492h(long j) {
        return this.f25655a.sendEmptyMessageAtTime(2, j);
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    /* JADX INFO: renamed from: i */
    public final boolean mo9493i(int i) {
        return this.f25655a.sendEmptyMessage(i);
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    /* JADX INFO: renamed from: j */
    public final void mo9494j(int i) {
        Assertions.m9460a(i != 0);
        this.f25655a.removeMessages(i);
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    /* JADX INFO: renamed from: k */
    public final HandlerWrapper.Message mo9495k(int i, Object obj) {
        SystemMessage systemMessageM9576m = m9576m();
        systemMessageM9576m.f25656a = this.f25655a.obtainMessage(i, obj);
        return systemMessageM9576m;
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    /* JADX INFO: renamed from: l */
    public final Looper mo9496l() {
        return this.f25655a.getLooper();
    }
}
