package androidx.media3.exoplayer;

import androidx.media3.common.AdPlaybackState;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.source.ForwardingTimeline;
import androidx.media3.exoplayer.source.ShuffleOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class PlaylistTimeline extends AbstractConcatenatedTimeline {

    /* JADX INFO: renamed from: e */
    public final int f26332e;

    /* JADX INFO: renamed from: f */
    public final int f26333f;

    /* JADX INFO: renamed from: g */
    public final int[] f26334g;

    /* JADX INFO: renamed from: h */
    public final int[] f26335h;

    /* JADX INFO: renamed from: i */
    public final Timeline[] f26336i;

    /* JADX INFO: renamed from: j */
    public final Object[] f26337j;

    /* JADX INFO: renamed from: k */
    public final HashMap f26338k;

    /* JADX INFO: renamed from: androidx.media3.exoplayer.PlaylistTimeline$1 */
    /* JADX INFO: compiled from: Proguard */
    class C17801 extends ForwardingTimeline {

        /* JADX INFO: renamed from: c */
        public final Timeline.Window f26339c;

        public C17801(Timeline timeline) {
            super(timeline);
            this.f26339c = new Timeline.Window();
        }

        @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.Timeline
        /* JADX INFO: renamed from: f */
        public final Timeline.Period mo9354f(int i, Timeline.Period period, boolean z2) {
            Timeline.Period periodMo9354f = this.f27190b.mo9354f(i, period, z2);
            if (mo9358n(periodMo9354f.f25343c, this.f26339c, 0L).m9377a()) {
                periodMo9354f.m9376h(period.f25341a, period.f25342b, period.f25343c, period.f25344d, period.f25345e, AdPlaybackState.f25084c, true);
                return periodMo9354f;
            }
            periodMo9354f.f25346f = true;
            return periodMo9354f;
        }
    }

    public PlaylistTimeline(Timeline[] timelineArr, Object[] objArr, ShuffleOrder shuffleOrder) {
        super(shuffleOrder);
        int length = timelineArr.length;
        this.f26336i = timelineArr;
        this.f26334g = new int[length];
        this.f26335h = new int[length];
        this.f26337j = objArr;
        this.f26338k = new HashMap();
        int length2 = timelineArr.length;
        int i = 0;
        int iMo9359o = 0;
        int iMo9356h = 0;
        int i2 = 0;
        while (i < length2) {
            Timeline timeline = timelineArr[i];
            this.f26336i[i2] = timeline;
            this.f26335h[i2] = iMo9359o;
            this.f26334g[i2] = iMo9356h;
            iMo9359o += timeline.mo9359o();
            iMo9356h += this.f26336i[i2].mo9356h();
            this.f26338k.put(objArr[i2], Integer.valueOf(i2));
            i++;
            i2++;
        }
        this.f26332e = iMo9359o;
        this.f26333f = iMo9356h;
    }

    @Override // androidx.media3.common.Timeline
    /* JADX INFO: renamed from: h */
    public final int mo9356h() {
        return this.f26333f;
    }

    @Override // androidx.media3.common.Timeline
    /* JADX INFO: renamed from: o */
    public final int mo9359o() {
        return this.f26332e;
    }

    @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
    /* JADX INFO: renamed from: q */
    public final int mo9755q(Object obj) {
        Integer num = (Integer) this.f26338k.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
    /* JADX INFO: renamed from: r */
    public final int mo9756r(int i) {
        return Util.m9612c(this.f26334g, i + 1, false, false);
    }

    @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
    /* JADX INFO: renamed from: s */
    public final int mo9757s(int i) {
        return Util.m9612c(this.f26335h, i + 1, false, false);
    }

    @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
    /* JADX INFO: renamed from: t */
    public final Object mo9758t(int i) {
        return this.f26337j[i];
    }

    @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
    /* JADX INFO: renamed from: u */
    public final int mo9759u(int i) {
        return this.f26334g[i];
    }

    @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
    /* JADX INFO: renamed from: v */
    public final int mo9760v(int i) {
        return this.f26335h[i];
    }

    @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
    /* JADX INFO: renamed from: x */
    public final Timeline mo9762x(int i) {
        return this.f26336i[i];
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PlaylistTimeline(ArrayList arrayList, ShuffleOrder shuffleOrder) {
        Timeline[] timelineArr = new Timeline[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            timelineArr[i2] = ((MediaSourceInfoHolder) it.next()).mo9873b();
            i2++;
        }
        Object[] objArr = new Object[arrayList.size()];
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            objArr[i] = ((MediaSourceInfoHolder) it2.next()).mo9872a();
            i++;
        }
        this(timelineArr, objArr, shuffleOrder);
    }
}
