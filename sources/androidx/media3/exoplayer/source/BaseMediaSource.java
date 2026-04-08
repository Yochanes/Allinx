package androidx.media3.exoplayer.source;

import android.os.Handler;
import android.os.Looper;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.MediaSourceEventListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public abstract class BaseMediaSource implements MediaSource {

    /* JADX INFO: renamed from: a */
    public final ArrayList f27106a = new ArrayList(1);

    /* JADX INFO: renamed from: b */
    public final HashSet f27107b = new HashSet(1);

    /* JADX INFO: renamed from: c */
    public final MediaSourceEventListener.EventDispatcher f27108c = new MediaSourceEventListener.EventDispatcher(new CopyOnWriteArrayList(), 0, null);

    /* JADX INFO: renamed from: d */
    public final DrmSessionEventListener.EventDispatcher f27109d = new DrmSessionEventListener.EventDispatcher(new CopyOnWriteArrayList(), 0, null);

    /* JADX INFO: renamed from: f */
    public Looper f27110f;

    /* JADX INFO: renamed from: g */
    public Timeline f27111g;

    /* JADX INFO: renamed from: i */
    public PlayerId f27112i;

    @Override // androidx.media3.exoplayer.source.MediaSource
    /* JADX INFO: renamed from: B */
    public final void mo10444B(MediaSource.MediaSourceCaller mediaSourceCaller) {
        HashSet hashSet = this.f27107b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.remove(mediaSourceCaller);
        if (zIsEmpty || !hashSet.isEmpty()) {
            return;
        }
        mo10448Q();
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    /* JADX INFO: renamed from: I */
    public final void mo10445I(Handler handler, DrmSessionEventListener drmSessionEventListener) {
        handler.getClass();
        this.f27109d.m10311a(handler, drmSessionEventListener);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    /* JADX INFO: renamed from: J */
    public final void mo10446J(DrmSessionEventListener drmSessionEventListener) {
        this.f27109d.m10317g(drmSessionEventListener);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    /* JADX INFO: renamed from: P */
    public final void mo10447P(MediaSource.MediaSourceCaller mediaSourceCaller, TransferListener transferListener, PlayerId playerId) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f27110f;
        Assertions.m9460a(looper == null || looper == looperMyLooper);
        this.f27112i = playerId;
        Timeline timeline = this.f27111g;
        this.f27106a.add(mediaSourceCaller);
        if (this.f27110f == null) {
            this.f27110f = looperMyLooper;
            this.f27107b.add(mediaSourceCaller);
            mo10451V(transferListener);
        } else if (timeline != null) {
            mo10455n(mediaSourceCaller);
            mediaSourceCaller.mo10015a(this, timeline);
        }
    }

    /* JADX INFO: renamed from: U */
    public void mo10450U(Timeline timeline) {
        m10452W(timeline);
    }

    /* JADX INFO: renamed from: V */
    public abstract void mo10451V(TransferListener transferListener);

    /* JADX INFO: renamed from: W */
    public final void m10452W(Timeline timeline) {
        this.f27111g = timeline;
        Iterator it = this.f27106a.iterator();
        while (it.hasNext()) {
            ((MediaSource.MediaSourceCaller) it.next()).mo10015a(this, timeline);
        }
    }

    /* JADX INFO: renamed from: X */
    public abstract void mo10453X();

    @Override // androidx.media3.exoplayer.source.MediaSource
    /* JADX INFO: renamed from: m */
    public final void mo10454m(Handler handler, MediaSourceEventListener mediaSourceEventListener) {
        handler.getClass();
        MediaSourceEventListener.EventDispatcher eventDispatcher = this.f27108c;
        eventDispatcher.getClass();
        MediaSourceEventListener.EventDispatcher.ListenerAndHandler listenerAndHandler = new MediaSourceEventListener.EventDispatcher.ListenerAndHandler();
        listenerAndHandler.f27238a = handler;
        listenerAndHandler.f27239b = mediaSourceEventListener;
        eventDispatcher.f27237c.add(listenerAndHandler);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    /* JADX INFO: renamed from: n */
    public final void mo10455n(MediaSource.MediaSourceCaller mediaSourceCaller) {
        this.f27110f.getClass();
        HashSet hashSet = this.f27107b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.add(mediaSourceCaller);
        if (zIsEmpty) {
            mo10449S();
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    /* JADX INFO: renamed from: r */
    public final void mo10456r(MediaSourceEventListener mediaSourceEventListener) {
        CopyOnWriteArrayList<MediaSourceEventListener.EventDispatcher.ListenerAndHandler> copyOnWriteArrayList = this.f27108c.f27237c;
        for (MediaSourceEventListener.EventDispatcher.ListenerAndHandler listenerAndHandler : copyOnWriteArrayList) {
            if (listenerAndHandler.f27239b == mediaSourceEventListener) {
                copyOnWriteArrayList.remove(listenerAndHandler);
            }
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    /* JADX INFO: renamed from: z */
    public final void mo10457z(MediaSource.MediaSourceCaller mediaSourceCaller) {
        ArrayList arrayList = this.f27106a;
        arrayList.remove(mediaSourceCaller);
        if (!arrayList.isEmpty()) {
            mo10444B(mediaSourceCaller);
            return;
        }
        this.f27110f = null;
        this.f27111g = null;
        this.f27112i = null;
        this.f27107b.clear();
        mo10453X();
    }

    /* JADX INFO: renamed from: Q */
    public void mo10448Q() {
    }

    /* JADX INFO: renamed from: S */
    public void mo10449S() {
    }
}
