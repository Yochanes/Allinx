package androidx.media3.common.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
import androidx.annotation.RequiresApi;
import androidx.media3.common.AbstractC1740a;
import androidx.media3.exoplayer.upstream.C1917b;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class NetworkTypeObserver {

    /* JADX INFO: renamed from: f */
    public static NetworkTypeObserver f25626f;

    /* JADX INFO: renamed from: a */
    public final Executor f25627a;

    /* JADX INFO: renamed from: b */
    public final CopyOnWriteArrayList f25628b;

    /* JADX INFO: renamed from: c */
    public final Object f25629c;

    /* JADX INFO: renamed from: d */
    public int f25630d;

    /* JADX INFO: renamed from: e */
    public boolean f25631e;

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static final class Api31 {

        /* JADX INFO: compiled from: Proguard */
        public static final class DisplayInfoCallback extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {

            /* JADX INFO: renamed from: a */
            public final NetworkTypeObserver f25632a;

            public DisplayInfoCallback(NetworkTypeObserver networkTypeObserver) {
                this.f25632a = networkTypeObserver;
            }

            public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
                int iM9408e = AbstractC1740a.m9408e(telephonyDisplayInfo);
                this.f25632a.m9522d(iM9408e == 3 || iM9408e == 4 || iM9408e == 5 ? 10 : 5);
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface Listener {
        /* JADX INFO: renamed from: a */
        void mo9523a(int i);
    }

    /* JADX INFO: compiled from: Proguard */
    public final class ListenerHolder {

        /* JADX INFO: renamed from: a */
        public final WeakReference f25633a;

        /* JADX INFO: renamed from: b */
        public final Executor f25634b;

        public ListenerHolder(C1917b c1917b, Executor executor) {
            this.f25633a = new WeakReference(c1917b);
            this.f25634b = executor;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public final class Receiver extends BroadcastReceiver {
        public Receiver() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            NetworkTypeObserver.this.f25627a.execute(new RunnableC1750c(1, this, context));
        }
    }

    public NetworkTypeObserver(Context context) {
        Executor executorM9467a = BackgroundExecutor.m9467a();
        this.f25627a = executorM9467a;
        this.f25628b = new CopyOnWriteArrayList();
        this.f25629c = new Object();
        this.f25630d = 0;
        executorM9467a.execute(new RunnableC1750c(0, this, context));
    }

    /* JADX INFO: renamed from: a */
    public static synchronized NetworkTypeObserver m9519a(Context context) {
        try {
            if (f25626f == null) {
                f25626f = new NetworkTypeObserver(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f25626f;
    }

    /* JADX INFO: renamed from: b */
    public final int m9520b() {
        int i;
        synchronized (this.f25629c) {
            i = this.f25630d;
        }
        return i;
    }

    /* JADX INFO: renamed from: c */
    public final void m9521c(C1917b c1917b, Executor executor) {
        boolean z2;
        CopyOnWriteArrayList<ListenerHolder> copyOnWriteArrayList = this.f25628b;
        for (ListenerHolder listenerHolder : copyOnWriteArrayList) {
            if (listenerHolder.f25633a.get() == null) {
                copyOnWriteArrayList.remove(listenerHolder);
            }
        }
        ListenerHolder listenerHolder2 = new ListenerHolder(c1917b, executor);
        synchronized (this.f25629c) {
            this.f25628b.add(listenerHolder2);
            z2 = this.f25631e;
        }
        if (z2) {
            listenerHolder2.f25634b.execute(new RunnableC1751d(listenerHolder2));
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m9522d(int i) {
        CopyOnWriteArrayList<ListenerHolder> copyOnWriteArrayList = this.f25628b;
        for (ListenerHolder listenerHolder : copyOnWriteArrayList) {
            if (listenerHolder.f25633a.get() == null) {
                copyOnWriteArrayList.remove(listenerHolder);
            }
        }
        synchronized (this.f25629c) {
            try {
                if (this.f25631e && this.f25630d == i) {
                    return;
                }
                this.f25631e = true;
                this.f25630d = i;
                for (ListenerHolder listenerHolder2 : this.f25628b) {
                    listenerHolder2.getClass();
                    listenerHolder2.f25634b.execute(new RunnableC1751d(listenerHolder2));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
