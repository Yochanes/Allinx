package kotlinx.coroutines.channels;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Waiter;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.Symbol;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00000\u0002R\u0013\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00038\u0002X\u0082\u0004¨\u0006\u0006"}, m18302d2 = {"Lkotlinx/coroutines/channels/ChannelSegment;", "E", "Lkotlinx/coroutines/internal/Segment;", "Lkotlinx/atomicfu/AtomicArray;", "", "data", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public final class ChannelSegment<E> extends Segment<ChannelSegment<E>> {

    /* JADX INFO: renamed from: f */
    public final BufferedChannel f55454f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ AtomicReferenceArray f55455g;

    public ChannelSegment(long j, ChannelSegment channelSegment, BufferedChannel bufferedChannel, int i) {
        super(j, channelSegment, i);
        this.f55454f = bufferedChannel;
        this.f55455g = new AtomicReferenceArray(BufferedChannelKt.f55426b * 2);
    }

    @Override // kotlinx.coroutines.internal.Segment
    /* JADX INFO: renamed from: g */
    public final int mo20713g() {
        return BufferedChannelKt.f55426b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0059, code lost:
    
        m20718n(r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x005c, code lost:
    
        if (r0 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x005e, code lost:
    
        kotlin.jvm.internal.Intrinsics.m18596d(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0061, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
    
        return;
     */
    @Override // kotlinx.coroutines.internal.Segment
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo20714h(int i, CoroutineContext coroutineContext) {
        int i2 = BufferedChannelKt.f55426b;
        boolean z2 = i >= i2;
        if (z2) {
            i -= i2;
        }
        this.f55455g.get(i * 2);
        while (true) {
            Object objM20716l = m20716l(i);
            boolean z3 = objM20716l instanceof Waiter;
            BufferedChannel bufferedChannel = this.f55454f;
            if (z3 || (objM20716l instanceof WaiterEB)) {
                if (m20715k(i, objM20716l, z2 ? BufferedChannelKt.f55434j : BufferedChannelKt.f55435k)) {
                    m20718n(i, null);
                    m20717m(i, !z2);
                    if (z2) {
                        Intrinsics.m18596d(bufferedChannel);
                        return;
                    }
                    return;
                }
            } else {
                if (objM20716l == BufferedChannelKt.f55434j || objM20716l == BufferedChannelKt.f55435k) {
                    break;
                }
                if (objM20716l != BufferedChannelKt.f55431g && objM20716l != BufferedChannelKt.f55430f) {
                    if (objM20716l == BufferedChannelKt.f55433i || objM20716l == BufferedChannelKt.f55428d || objM20716l == BufferedChannelKt.f55436l) {
                        return;
                    }
                    throw new IllegalStateException(("unexpected state: " + objM20716l).toString());
                }
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final boolean m20715k(int i, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray = this.f55455g;
        int i2 = (i * 2) + 1;
        while (!atomicReferenceArray.compareAndSet(i2, obj, obj2)) {
            if (atomicReferenceArray.get(i2) != obj) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: l */
    public final Object m20716l(int i) {
        return this.f55455g.get((i * 2) + 1);
    }

    /* JADX INFO: renamed from: m */
    public final void m20717m(int i, boolean z2) {
        if (z2) {
            BufferedChannel bufferedChannel = this.f55454f;
            Intrinsics.m18596d(bufferedChannel);
            bufferedChannel.m20692Y((this.f56355c * ((long) BufferedChannelKt.f55426b)) + ((long) i));
        }
        m20849i();
    }

    /* JADX INFO: renamed from: n */
    public final void m20718n(int i, Object obj) {
        this.f55455g.set(i * 2, obj);
    }

    /* JADX INFO: renamed from: o */
    public final void m20719o(int i, Symbol symbol) {
        this.f55455g.set((i * 2) + 1, symbol);
    }
}
