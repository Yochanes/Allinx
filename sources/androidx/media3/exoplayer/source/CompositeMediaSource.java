package androidx.media3.exoplayer.source;

import android.os.Handler;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.analytics.C1792j;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.MediaSourceEventListener;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public abstract class CompositeMediaSource<T> extends BaseMediaSource {

    /* JADX INFO: renamed from: j */
    public final HashMap f27142j = new HashMap();

    /* JADX INFO: renamed from: n */
    public Handler f27143n;

    /* JADX INFO: renamed from: o */
    public TransferListener f27144o;

    /* JADX INFO: compiled from: Proguard */
    public final class ForwardingEventListener implements MediaSourceEventListener, DrmSessionEventListener {

        /* JADX INFO: renamed from: a */
        public final Object f27145a;

        /* JADX INFO: renamed from: b */
        public MediaSourceEventListener.EventDispatcher f27146b;

        /* JADX INFO: renamed from: c */
        public DrmSessionEventListener.EventDispatcher f27147c;

        public ForwardingEventListener(Object obj) {
            this.f27146b = new MediaSourceEventListener.EventDispatcher(CompositeMediaSource.this.f27108c.f27237c, 0, null);
            this.f27147c = new DrmSessionEventListener.EventDispatcher(CompositeMediaSource.this.f27109d.f26822c, 0, null);
            this.f27145a = obj;
        }

        @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
        /* JADX INFO: renamed from: K */
        public final void mo10004K(int i, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            if (m10490a(i, mediaPeriodId)) {
                MediaSourceEventListener.EventDispatcher eventDispatcher = this.f27146b;
                MediaLoadData mediaLoadDataM10491m = m10491m(mediaLoadData, mediaPeriodId);
                eventDispatcher.getClass();
                eventDispatcher.m10519a(new C1888g(eventDispatcher, loadEventInfo, mediaLoadDataM10491m, 0));
            }
        }

        @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
        /* JADX INFO: renamed from: L */
        public final void mo10005L(int i, MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
            if (m10490a(i, mediaPeriodId)) {
                MediaSourceEventListener.EventDispatcher eventDispatcher = this.f27146b;
                MediaLoadData mediaLoadDataM10491m = m10491m(mediaLoadData, mediaPeriodId);
                eventDispatcher.getClass();
                eventDispatcher.m10519a(new C1885d(eventDispatcher, mediaLoadDataM10491m));
            }
        }

        @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
        /* JADX INFO: renamed from: M */
        public final void mo10006M(int i, MediaSource.MediaPeriodId mediaPeriodId) {
            if (m10490a(i, mediaPeriodId)) {
                this.f27147c.m10313c();
            }
        }

        @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
        /* JADX INFO: renamed from: T */
        public final void mo10007T(int i, MediaSource.MediaPeriodId mediaPeriodId) {
            if (m10490a(i, mediaPeriodId)) {
                this.f27147c.m10312b();
            }
        }

        /* JADX INFO: renamed from: a */
        public final boolean m10490a(int i, MediaSource.MediaPeriodId mediaPeriodId) {
            MediaSource.MediaPeriodId mediaPeriodIdMo10484Y;
            Object obj = this.f27145a;
            CompositeMediaSource compositeMediaSource = CompositeMediaSource.this;
            if (mediaPeriodId != null) {
                mediaPeriodIdMo10484Y = compositeMediaSource.mo10484Y(obj, mediaPeriodId);
                if (mediaPeriodIdMo10484Y == null) {
                    return false;
                }
            } else {
                mediaPeriodIdMo10484Y = null;
            }
            int iMo10486a0 = compositeMediaSource.mo10486a0(i, obj);
            MediaSourceEventListener.EventDispatcher eventDispatcher = this.f27146b;
            if (eventDispatcher.f27235a != iMo10486a0 || !Objects.equals(eventDispatcher.f27236b, mediaPeriodIdMo10484Y)) {
                this.f27146b = new MediaSourceEventListener.EventDispatcher(compositeMediaSource.f27108c.f27237c, iMo10486a0, mediaPeriodIdMo10484Y);
            }
            DrmSessionEventListener.EventDispatcher eventDispatcher2 = this.f27147c;
            if (eventDispatcher2.f26820a == iMo10486a0 && Objects.equals(eventDispatcher2.f26821b, mediaPeriodIdMo10484Y)) {
                return true;
            }
            this.f27147c = new DrmSessionEventListener.EventDispatcher(compositeMediaSource.f27109d.f26822c, iMo10486a0, mediaPeriodIdMo10484Y);
            return true;
        }

        @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
        /* JADX INFO: renamed from: b0 */
        public final void mo10009b0(int i, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, int i2) {
            if (m10490a(i, mediaPeriodId)) {
                MediaSourceEventListener.EventDispatcher eventDispatcher = this.f27146b;
                MediaLoadData mediaLoadDataM10491m = m10491m(mediaLoadData, mediaPeriodId);
                eventDispatcher.getClass();
                eventDispatcher.m10519a(new C1792j(eventDispatcher, loadEventInfo, mediaLoadDataM10491m, i2));
            }
        }

        @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
        /* JADX INFO: renamed from: d0 */
        public final void mo10010d0(int i, MediaSource.MediaPeriodId mediaPeriodId) {
            if (m10490a(i, mediaPeriodId)) {
                this.f27147c.m10316f();
            }
        }

        @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
        /* JADX INFO: renamed from: f0 */
        public final void mo10011f0(int i, MediaSource.MediaPeriodId mediaPeriodId, int i2) {
            if (m10490a(i, mediaPeriodId)) {
                this.f27147c.m10314d(i2);
            }
        }

        @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
        /* JADX INFO: renamed from: h0 */
        public final void mo10012h0(int i, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z2) {
            if (m10490a(i, mediaPeriodId)) {
                MediaSourceEventListener.EventDispatcher eventDispatcher = this.f27146b;
                MediaLoadData mediaLoadDataM10491m = m10491m(mediaLoadData, mediaPeriodId);
                eventDispatcher.getClass();
                eventDispatcher.m10519a(new C1889h(eventDispatcher, loadEventInfo, mediaLoadDataM10491m, iOException, z2));
            }
        }

        @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
        /* JADX INFO: renamed from: k0 */
        public final void mo10013k0(int i, MediaSource.MediaPeriodId mediaPeriodId, Exception exc) {
            if (m10490a(i, mediaPeriodId)) {
                this.f27147c.m10315e(exc);
            }
        }

        @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
        /* JADX INFO: renamed from: l0 */
        public final void mo10014l0(int i, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            if (m10490a(i, mediaPeriodId)) {
                MediaSourceEventListener.EventDispatcher eventDispatcher = this.f27146b;
                MediaLoadData mediaLoadDataM10491m = m10491m(mediaLoadData, mediaPeriodId);
                eventDispatcher.getClass();
                eventDispatcher.m10519a(new C1888g(eventDispatcher, loadEventInfo, mediaLoadDataM10491m, 1));
            }
        }

        /* JADX INFO: renamed from: m */
        public final MediaLoadData m10491m(MediaLoadData mediaLoadData, MediaSource.MediaPeriodId mediaPeriodId) {
            CompositeMediaSource compositeMediaSource = CompositeMediaSource.this;
            Object obj = this.f27145a;
            long j = mediaLoadData.f27226e;
            long jMo10485Z = compositeMediaSource.mo10485Z(obj, j, mediaPeriodId);
            long j2 = mediaLoadData.f27227f;
            long jMo10485Z2 = compositeMediaSource.mo10485Z(obj, j2, mediaPeriodId);
            if (jMo10485Z == j && jMo10485Z2 == j2) {
                return mediaLoadData;
            }
            return new MediaLoadData(mediaLoadData.f27222a, mediaLoadData.f27223b, mediaLoadData.f27224c, mediaLoadData.f27225d, jMo10485Z, jMo10485Z2);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class MediaSourceAndListener<T> {

        /* JADX INFO: renamed from: a */
        public final MediaSource f27149a;

        /* JADX INFO: renamed from: b */
        public final C1881b f27150b;

        /* JADX INFO: renamed from: c */
        public final ForwardingEventListener f27151c;

        public MediaSourceAndListener(MediaSource mediaSource, C1881b c1881b, ForwardingEventListener forwardingEventListener) {
            this.f27149a = mediaSource;
            this.f27150b = c1881b;
            this.f27151c = forwardingEventListener;
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    /* JADX INFO: renamed from: E */
    public void mo10481E() {
        Iterator it = this.f27142j.values().iterator();
        while (it.hasNext()) {
            ((MediaSourceAndListener) it.next()).f27149a.mo10481E();
        }
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    /* JADX INFO: renamed from: Q */
    public void mo10448Q() {
        for (MediaSourceAndListener mediaSourceAndListener : this.f27142j.values()) {
            mediaSourceAndListener.f27149a.mo10444B(mediaSourceAndListener.f27150b);
        }
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    /* JADX INFO: renamed from: S */
    public void mo10449S() {
        for (MediaSourceAndListener mediaSourceAndListener : this.f27142j.values()) {
            mediaSourceAndListener.f27149a.mo10455n(mediaSourceAndListener.f27150b);
        }
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    /* JADX INFO: renamed from: V */
    public void mo10451V(TransferListener transferListener) {
        this.f27144o = transferListener;
        this.f27143n = Util.m9622m(null);
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    /* JADX INFO: renamed from: X */
    public void mo10453X() {
        HashMap map = this.f27142j;
        for (MediaSourceAndListener mediaSourceAndListener : map.values()) {
            mediaSourceAndListener.f27149a.mo10457z(mediaSourceAndListener.f27150b);
            ForwardingEventListener forwardingEventListener = mediaSourceAndListener.f27151c;
            MediaSource mediaSource = mediaSourceAndListener.f27149a;
            mediaSource.mo10456r(forwardingEventListener);
            mediaSource.mo10446J(forwardingEventListener);
        }
        map.clear();
    }

    /* JADX INFO: renamed from: c0 */
    public abstract void mo10487c0(Object obj, BaseMediaSource baseMediaSource, Timeline timeline);

    /* JADX INFO: renamed from: g0 */
    public final void m10488g0(Object obj, MediaSource mediaSource) {
        HashMap map = this.f27142j;
        Assertions.m9460a(!map.containsKey(obj));
        C1881b c1881b = new C1881b(this, obj);
        ForwardingEventListener forwardingEventListener = new ForwardingEventListener(obj);
        map.put(obj, new MediaSourceAndListener(mediaSource, c1881b, forwardingEventListener));
        Handler handler = this.f27143n;
        handler.getClass();
        mediaSource.mo10454m(handler, forwardingEventListener);
        Handler handler2 = this.f27143n;
        handler2.getClass();
        mediaSource.mo10445I(handler2, forwardingEventListener);
        TransferListener transferListener = this.f27144o;
        PlayerId playerId = this.f27112i;
        Assertions.m9466g(playerId);
        mediaSource.mo10447P(c1881b, transferListener, playerId);
        if (this.f27107b.isEmpty()) {
            mediaSource.mo10444B(c1881b);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final void m10489i0(MediaSource.MediaPeriodId mediaPeriodId) {
        MediaSourceAndListener mediaSourceAndListener = (MediaSourceAndListener) this.f27142j.remove(mediaPeriodId);
        mediaSourceAndListener.getClass();
        C1881b c1881b = mediaSourceAndListener.f27150b;
        MediaSource mediaSource = mediaSourceAndListener.f27149a;
        mediaSource.mo10457z(c1881b);
        ForwardingEventListener forwardingEventListener = mediaSourceAndListener.f27151c;
        mediaSource.mo10456r(forwardingEventListener);
        mediaSource.mo10446J(forwardingEventListener);
    }

    /* JADX INFO: renamed from: Y */
    public MediaSource.MediaPeriodId mo10484Y(Object obj, MediaSource.MediaPeriodId mediaPeriodId) {
        return mediaPeriodId;
    }

    /* JADX INFO: renamed from: a0 */
    public int mo10486a0(int i, Object obj) {
        return i;
    }

    /* JADX INFO: renamed from: Z */
    public long mo10485Z(Object obj, long j, MediaSource.MediaPeriodId mediaPeriodId) {
        return j;
    }
}
