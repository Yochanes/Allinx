package androidx.media3.exoplayer.upstream.experimental;

import android.os.Handler;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.upstream.BandwidthMeter;
import com.engagelab.privates.core.constants.MTCoreConstants;
import com.google.common.collect.ImmutableList;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class ExperimentalBandwidthMeter implements BandwidthMeter, TransferListener {

    /* JADX INFO: compiled from: Proguard */
    public static final class Builder {
    }

    static {
        ImmutableList.m14829of(4300000L, 3200000L, 2400000L, 1700000L, 860000L);
        ImmutableList.m14829of((Long) 1500000L, (Long) 980000L, (Long) 750000L, (Long) 520000L, Long.valueOf(MTCoreConstants.Heartbeat.DEFAULT_VALUE_HEARTBEAT_INTERVAL));
        ImmutableList.m14829of(2000000L, 1300000L, 1000000L, 860000L, 610000L);
        ImmutableList.m14829of(2500000L, 1700000L, 1200000L, 970000L, 680000L);
        ImmutableList.m14829of(4700000L, 2800000L, 2100000L, 1700000L, 980000L);
        ImmutableList.m14829of(2700000L, 2000000L, 1600000L, 1300000L, 1000000L);
    }

    /* JADX INFO: renamed from: h */
    public static boolean m10675h(DataSpec dataSpec, boolean z2) {
        if (!z2) {
            return false;
        }
        int i = dataSpec.f25826h;
        return true;
    }

    @Override // androidx.media3.exoplayer.upstream.BandwidthMeter
    /* JADX INFO: renamed from: a */
    public final synchronized void mo10439a(BandwidthMeter.EventListener eventListener) {
        throw null;
    }

    @Override // androidx.media3.datasource.TransferListener
    /* JADX INFO: renamed from: b */
    public final synchronized void mo9700b(DataSpec dataSpec, boolean z2) {
        if (m10675h(dataSpec, z2)) {
            throw null;
        }
    }

    @Override // androidx.media3.datasource.TransferListener
    /* JADX INFO: renamed from: c */
    public final synchronized void mo9701c(DataSpec dataSpec, boolean z2, int i) {
        if (m10675h(dataSpec, z2)) {
            throw null;
        }
    }

    @Override // androidx.media3.datasource.TransferListener
    /* JADX INFO: renamed from: d */
    public final synchronized void mo9702d(DataSpec dataSpec, boolean z2) {
        if (m10675h(dataSpec, z2)) {
            throw null;
        }
    }

    @Override // androidx.media3.exoplayer.upstream.BandwidthMeter
    /* JADX INFO: renamed from: e */
    public final synchronized void mo10440e(Handler handler, BandwidthMeter.EventListener eventListener) {
        eventListener.getClass();
        throw null;
    }

    @Override // androidx.media3.datasource.TransferListener
    /* JADX INFO: renamed from: g */
    public final synchronized void mo9703g(DataSpec dataSpec, boolean z2) {
        if (m10675h(dataSpec, z2)) {
            throw null;
        }
    }

    @Override // androidx.media3.exoplayer.upstream.BandwidthMeter
    /* JADX INFO: renamed from: f */
    public final TransferListener mo10441f() {
        return this;
    }
}
