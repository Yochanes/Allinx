package androidx.media3.common;

import androidx.media3.common.Player;
import androidx.media3.common.util.UnstableApi;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public class ForwardingSimpleBasePlayer extends SimpleBasePlayer {

    /* JADX INFO: renamed from: androidx.media3.common.ForwardingSimpleBasePlayer$1 */
    /* JADX INFO: compiled from: Proguard */
    class C17311 implements Player.Listener {
        @Override // androidx.media3.common.Player.Listener
        /* JADX INFO: renamed from: D */
        public final void mo9292D(int i, Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2) {
            throw null;
        }

        @Override // androidx.media3.common.Player.Listener
        /* JADX INFO: renamed from: E */
        public final void mo9293E(Player.Events events) {
            throw null;
        }

        @Override // androidx.media3.common.Player.Listener
        /* JADX INFO: renamed from: H */
        public final void mo9295H(int i, boolean z2) {
            throw null;
        }

        @Override // androidx.media3.common.Player.Listener
        /* JADX INFO: renamed from: W */
        public final void mo9304W() {
            throw null;
        }

        @Override // androidx.media3.common.Player.Listener
        /* JADX INFO: renamed from: n */
        public final void mo9315n(Metadata metadata) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class LivePositionSuppliers {
    }
}
