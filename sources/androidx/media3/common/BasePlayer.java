package androidx.media3.common;

import androidx.media3.common.Timeline;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public abstract class BasePlayer implements Player {

    /* JADX INFO: renamed from: a */
    public final Timeline.Window f25098a = new Timeline.Window();

    @Override // androidx.media3.common.Player
    /* JADX INFO: renamed from: B */
    public final boolean mo9213B() {
        return mo9289z() == 3 && mo9278j() && mo9260M() == 0;
    }

    @Override // androidx.media3.common.Player
    /* JADX INFO: renamed from: E */
    public final void mo9214E() {
        mo9286w(true);
    }

    @Override // androidx.media3.common.Player
    /* JADX INFO: renamed from: H */
    public final boolean mo9215H(int i) {
        return mo9277i().f25325a.f25130a.get(i);
    }

    @Override // androidx.media3.common.Player
    /* JADX INFO: renamed from: T */
    public final void mo9216T() {
        int iMo9363e;
        if (mo9262O().m9368p() || mo9275f()) {
            m9221c0(9);
            return;
        }
        if (!m9219a0()) {
            if (m9223e0() && m9222d0()) {
                mo9225g0(mo9255G(), -9223372036854775807L, false);
                return;
            } else {
                m9221c0(9);
                return;
            }
        }
        Timeline timelineMo9262O = mo9262O();
        if (timelineMo9262O.m9368p()) {
            iMo9363e = -1;
        } else {
            int iMo9255G = mo9255G();
            int iMo9261N = mo9261N();
            if (iMo9261N == 1) {
                iMo9261N = 0;
            }
            iMo9363e = timelineMo9262O.mo9363e(iMo9255G, iMo9261N, mo9264Q());
        }
        if (iMo9363e == -1) {
            m9221c0(9);
        } else if (iMo9363e == mo9255G()) {
            mo9225g0(mo9255G(), -9223372036854775807L, true);
        } else {
            mo9225g0(iMo9363e, -9223372036854775807L, false);
        }
    }

    @Override // androidx.media3.common.Player
    /* JADX INFO: renamed from: U */
    public final void mo9217U() {
        long jMo9269Y = mo9269Y() + mo9287x();
        long jMo9346b = mo9346b();
        if (jMo9346b != -9223372036854775807L) {
            jMo9269Y = Math.min(jMo9269Y, jMo9346b);
        }
        mo9225g0(mo9255G(), Math.max(jMo9269Y, 0L), false);
    }

    @Override // androidx.media3.common.Player
    /* JADX INFO: renamed from: W */
    public final void mo9218W() {
        long jMo9269Y = mo9269Y() + (-mo9270Z());
        long jMo9346b = mo9346b();
        if (jMo9346b != -9223372036854775807L) {
            jMo9269Y = Math.min(jMo9269Y, jMo9346b);
        }
        mo9225g0(mo9255G(), Math.max(jMo9269Y, 0L), false);
    }

    /* JADX INFO: renamed from: a0 */
    public final boolean m9219a0() {
        int iMo9363e;
        Timeline timelineMo9262O = mo9262O();
        if (timelineMo9262O.m9368p()) {
            iMo9363e = -1;
        } else {
            int iMo9255G = mo9255G();
            int iMo9261N = mo9261N();
            if (iMo9261N == 1) {
                iMo9261N = 0;
            }
            iMo9363e = timelineMo9262O.mo9363e(iMo9255G, iMo9261N, mo9264Q());
        }
        return iMo9363e != -1;
    }

    /* JADX INFO: renamed from: b0 */
    public final boolean m9220b0() {
        int iMo9366k;
        Timeline timelineMo9262O = mo9262O();
        if (timelineMo9262O.m9368p()) {
            iMo9366k = -1;
        } else {
            int iMo9255G = mo9255G();
            int iMo9261N = mo9261N();
            if (iMo9261N == 1) {
                iMo9261N = 0;
            }
            iMo9366k = timelineMo9262O.mo9366k(iMo9255G, iMo9261N, mo9264Q());
        }
        return iMo9366k != -1;
    }

    /* JADX INFO: renamed from: c0 */
    public final void m9221c0(int i) {
        mo9225g0(-1, -9223372036854775807L, false);
    }

    /* JADX INFO: renamed from: d0 */
    public final boolean m9222d0() {
        Timeline timelineMo9262O = mo9262O();
        return !timelineMo9262O.m9368p() && timelineMo9262O.mo9358n(mo9255G(), this.f25098a, 0L).f25357h;
    }

    /* JADX INFO: renamed from: e0 */
    public final boolean m9223e0() {
        Timeline timelineMo9262O = mo9262O();
        return !timelineMo9262O.m9368p() && timelineMo9262O.mo9358n(mo9255G(), this.f25098a, 0L).m9377a();
    }

    /* JADX INFO: renamed from: f0 */
    public final boolean m9224f0() {
        Timeline timelineMo9262O = mo9262O();
        return !timelineMo9262O.m9368p() && timelineMo9262O.mo9358n(mo9255G(), this.f25098a, 0L).f25356g;
    }

    /* JADX INFO: renamed from: g0 */
    public abstract void mo9225g0(int i, long j, boolean z2);

    @Override // androidx.media3.common.Player
    /* JADX INFO: renamed from: h */
    public final void mo9226h(int i, long j) {
        mo9225g0(i, j, false);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m9227h0(int i) {
        int iMo9366k;
        Timeline timelineMo9262O = mo9262O();
        if (timelineMo9262O.m9368p()) {
            iMo9366k = -1;
        } else {
            int iMo9255G = mo9255G();
            int iMo9261N = mo9261N();
            if (iMo9261N == 1) {
                iMo9261N = 0;
            }
            iMo9366k = timelineMo9262O.mo9366k(iMo9255G, iMo9261N, mo9264Q());
        }
        if (iMo9366k == -1) {
            m9221c0(i);
        } else if (iMo9366k == mo9255G()) {
            mo9225g0(mo9255G(), -9223372036854775807L, true);
        } else {
            mo9225g0(iMo9366k, -9223372036854775807L, false);
        }
    }

    @Override // androidx.media3.common.Player
    /* JADX INFO: renamed from: m */
    public final long mo9228m() {
        Timeline timelineMo9262O = mo9262O();
        if (timelineMo9262O.m9368p()) {
            return -9223372036854775807L;
        }
        return Util.m9609S(timelineMo9262O.mo9358n(mo9255G(), this.f25098a, 0L).f25361l);
    }

    @Override // androidx.media3.common.Player
    public final void pause() {
        mo9286w(false);
    }

    @Override // androidx.media3.common.Player
    /* JADX INFO: renamed from: q */
    public final void mo9229q() {
        mo9225g0(mo9255G(), -9223372036854775807L, false);
    }

    @Override // androidx.media3.common.Player
    /* JADX INFO: renamed from: u */
    public final void mo9230u(long j) {
        mo9225g0(mo9255G(), j, false);
    }

    @Override // androidx.media3.common.Player
    /* JADX INFO: renamed from: v */
    public final void mo9231v() {
        if (mo9262O().m9368p() || mo9275f()) {
            m9221c0(7);
            return;
        }
        boolean zM9220b0 = m9220b0();
        if (m9223e0() && !m9224f0()) {
            if (zM9220b0) {
                m9227h0(7);
                return;
            } else {
                m9221c0(7);
                return;
            }
        }
        if (!zM9220b0 || mo9269Y() > mo9280l()) {
            mo9225g0(mo9255G(), 0L, false);
        } else {
            m9227h0(7);
        }
    }
}
