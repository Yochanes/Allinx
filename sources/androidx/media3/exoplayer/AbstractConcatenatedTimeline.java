package androidx.media3.exoplayer;

import android.util.Pair;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.source.ShuffleOrder;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public abstract class AbstractConcatenatedTimeline extends Timeline {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ int f25959d = 0;

    /* JADX INFO: renamed from: b */
    public final int f25960b;

    /* JADX INFO: renamed from: c */
    public final ShuffleOrder f25961c;

    public AbstractConcatenatedTimeline(ShuffleOrder shuffleOrder) {
        this.f25961c = shuffleOrder;
        this.f25960b = shuffleOrder.getLength();
    }

    @Override // androidx.media3.common.Timeline
    /* JADX INFO: renamed from: a */
    public final int mo9360a(boolean z2) {
        if (this.f25960b != 0) {
            int iMo10573a = z2 ? this.f25961c.mo10573a() : 0;
            while (mo9762x(iMo10573a).m9368p()) {
                iMo10573a = m9761w(iMo10573a, z2);
                if (iMo10573a == -1) {
                }
            }
            return mo9762x(iMo10573a).mo9360a(z2) + mo9760v(iMo10573a);
        }
        return -1;
    }

    @Override // androidx.media3.common.Timeline
    /* JADX INFO: renamed from: b */
    public final int mo9353b(Object obj) {
        int iMo9353b;
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            int iMo9755q = mo9755q(obj2);
            if (iMo9755q != -1 && (iMo9353b = mo9762x(iMo9755q).mo9353b(obj3)) != -1) {
                return mo9759u(iMo9755q) + iMo9353b;
            }
        }
        return -1;
    }

    @Override // androidx.media3.common.Timeline
    /* JADX INFO: renamed from: c */
    public final int mo9361c(boolean z2) {
        int i = this.f25960b;
        if (i != 0) {
            ShuffleOrder shuffleOrder = this.f25961c;
            int iMo10578f = z2 ? shuffleOrder.mo10578f() : i - 1;
            while (mo9762x(iMo10578f).m9368p()) {
                iMo10578f = z2 ? shuffleOrder.mo10575c(iMo10578f) : iMo10578f > 0 ? iMo10578f - 1 : -1;
                if (iMo10578f == -1) {
                }
            }
            return mo9762x(iMo10578f).mo9361c(z2) + mo9760v(iMo10578f);
        }
        return -1;
    }

    @Override // androidx.media3.common.Timeline
    /* JADX INFO: renamed from: e */
    public final int mo9363e(int i, int i2, boolean z2) {
        int iMo9757s = mo9757s(i);
        int iMo9760v = mo9760v(iMo9757s);
        int iMo9363e = mo9762x(iMo9757s).mo9363e(i - iMo9760v, i2 == 2 ? 0 : i2, z2);
        if (iMo9363e != -1) {
            return iMo9760v + iMo9363e;
        }
        int iM9761w = m9761w(iMo9757s, z2);
        while (iM9761w != -1 && mo9762x(iM9761w).m9368p()) {
            iM9761w = m9761w(iM9761w, z2);
        }
        if (iM9761w != -1) {
            return mo9762x(iM9761w).mo9360a(z2) + mo9760v(iM9761w);
        }
        if (i2 == 2) {
            return mo9360a(z2);
        }
        return -1;
    }

    @Override // androidx.media3.common.Timeline
    /* JADX INFO: renamed from: f */
    public final Timeline.Period mo9354f(int i, Timeline.Period period, boolean z2) {
        int iMo9756r = mo9756r(i);
        int iMo9760v = mo9760v(iMo9756r);
        mo9762x(iMo9756r).mo9354f(i - mo9759u(iMo9756r), period, z2);
        period.f25343c += iMo9760v;
        if (z2) {
            Object objMo9758t = mo9758t(iMo9756r);
            Object obj = period.f25342b;
            obj.getClass();
            period.f25342b = Pair.create(objMo9758t, obj);
        }
        return period;
    }

    @Override // androidx.media3.common.Timeline
    /* JADX INFO: renamed from: g */
    public final Timeline.Period mo9355g(Object obj, Timeline.Period period) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int iMo9755q = mo9755q(obj2);
        int iMo9760v = mo9760v(iMo9755q);
        mo9762x(iMo9755q).mo9355g(obj3, period);
        period.f25343c += iMo9760v;
        period.f25342b = obj;
        return period;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x002b, code lost:
    
        r0 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x002b, code lost:
    
        r0 = r0 - 1;
     */
    @Override // androidx.media3.common.Timeline
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int mo9366k(int i, int i2, boolean z2) {
        int iMo10575c;
        int iMo9757s = mo9757s(i);
        int iMo9760v = mo9760v(iMo9757s);
        int iMo9366k = mo9762x(iMo9757s).mo9366k(i - iMo9760v, i2 == 2 ? 0 : i2, z2);
        if (iMo9366k != -1) {
            return iMo9760v + iMo9366k;
        }
        ShuffleOrder shuffleOrder = this.f25961c;
        if (z2) {
            iMo10575c = shuffleOrder.mo10575c(iMo9757s);
        } else {
            iMo10575c = iMo9757s > 0 ? iMo10575c - 1 : -1;
        }
        while (iMo10575c != -1 && mo9762x(iMo10575c).m9368p()) {
            if (z2) {
                iMo10575c = shuffleOrder.mo10575c(iMo10575c);
            } else if (iMo10575c > 0) {
            }
        }
        if (iMo10575c != -1) {
            return mo9762x(iMo10575c).mo9361c(z2) + mo9760v(iMo10575c);
        }
        if (i2 == 2) {
            return mo9361c(z2);
        }
        return -1;
    }

    @Override // androidx.media3.common.Timeline
    /* JADX INFO: renamed from: l */
    public final Object mo9357l(int i) {
        int iMo9756r = mo9756r(i);
        return Pair.create(mo9758t(iMo9756r), mo9762x(iMo9756r).mo9357l(i - mo9759u(iMo9756r)));
    }

    @Override // androidx.media3.common.Timeline
    /* JADX INFO: renamed from: n */
    public final Timeline.Window mo9358n(int i, Timeline.Window window, long j) {
        int iMo9757s = mo9757s(i);
        int iMo9760v = mo9760v(iMo9757s);
        int iMo9759u = mo9759u(iMo9757s);
        mo9762x(iMo9757s).mo9358n(i - iMo9760v, window, j);
        Object objMo9758t = mo9758t(iMo9757s);
        if (!Timeline.Window.f25348p.equals(window.f25350a)) {
            objMo9758t = Pair.create(objMo9758t, window.f25350a);
        }
        window.f25350a = objMo9758t;
        window.f25362m += iMo9759u;
        window.f25363n += iMo9759u;
        return window;
    }

    /* JADX INFO: renamed from: q */
    public abstract int mo9755q(Object obj);

    /* JADX INFO: renamed from: r */
    public abstract int mo9756r(int i);

    /* JADX INFO: renamed from: s */
    public abstract int mo9757s(int i);

    /* JADX INFO: renamed from: t */
    public abstract Object mo9758t(int i);

    /* JADX INFO: renamed from: u */
    public abstract int mo9759u(int i);

    /* JADX INFO: renamed from: v */
    public abstract int mo9760v(int i);

    /* JADX INFO: renamed from: w */
    public final int m9761w(int i, boolean z2) {
        if (z2) {
            return this.f25961c.mo10576d(i);
        }
        if (i < this.f25960b - 1) {
            return i + 1;
        }
        return -1;
    }

    /* JADX INFO: renamed from: x */
    public abstract Timeline mo9762x(int i);
}
