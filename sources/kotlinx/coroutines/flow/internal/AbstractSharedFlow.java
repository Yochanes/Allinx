package kotlinx.coroutines.flow.internal;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\b \u0018\u0000*\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\u00060\u0003j\u0002`\u0004¨\u0006\u0005"}, m18302d2 = {"Lkotlinx/coroutines/flow/internal/AbstractSharedFlow;", "Lkotlinx/coroutines/flow/internal/AbstractSharedFlowSlot;", "S", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public abstract class AbstractSharedFlow<S extends AbstractSharedFlowSlot<?>> {

    /* JADX INFO: renamed from: a */
    public AbstractSharedFlowSlot[] f56198a;

    /* JADX INFO: renamed from: b */
    public int f56199b;

    /* JADX INFO: renamed from: c */
    public int f56200c;

    /* JADX INFO: renamed from: d */
    public SubscriptionCountStateFlow f56201d;

    /* JADX INFO: renamed from: d */
    public final AbstractSharedFlowSlot m20805d() {
        AbstractSharedFlowSlot abstractSharedFlowSlotMo20779f;
        SubscriptionCountStateFlow subscriptionCountStateFlow;
        synchronized (this) {
            try {
                AbstractSharedFlowSlot[] abstractSharedFlowSlotArrMo20780i = this.f56198a;
                if (abstractSharedFlowSlotArrMo20780i == null) {
                    abstractSharedFlowSlotArrMo20780i = mo20780i();
                    this.f56198a = abstractSharedFlowSlotArrMo20780i;
                } else if (this.f56199b >= abstractSharedFlowSlotArrMo20780i.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(abstractSharedFlowSlotArrMo20780i, abstractSharedFlowSlotArrMo20780i.length * 2);
                    Intrinsics.m18598f(objArrCopyOf, "copyOf(...)");
                    this.f56198a = (AbstractSharedFlowSlot[]) objArrCopyOf;
                    abstractSharedFlowSlotArrMo20780i = (AbstractSharedFlowSlot[]) objArrCopyOf;
                }
                int i = this.f56200c;
                do {
                    abstractSharedFlowSlotMo20779f = abstractSharedFlowSlotArrMo20780i[i];
                    if (abstractSharedFlowSlotMo20779f == null) {
                        abstractSharedFlowSlotMo20779f = mo20779f();
                        abstractSharedFlowSlotArrMo20780i[i] = abstractSharedFlowSlotMo20779f;
                    }
                    i++;
                    if (i >= abstractSharedFlowSlotArrMo20780i.length) {
                        i = 0;
                    }
                } while (!abstractSharedFlowSlotMo20779f.mo20797a(this));
                this.f56200c = i;
                this.f56199b++;
                subscriptionCountStateFlow = this.f56201d;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (subscriptionCountStateFlow != null) {
            subscriptionCountStateFlow.m20813x(1);
        }
        return abstractSharedFlowSlotMo20779f;
    }

    /* JADX INFO: renamed from: f */
    public abstract AbstractSharedFlowSlot mo20779f();

    /* JADX INFO: renamed from: h */
    public final StateFlow m20806h() {
        SubscriptionCountStateFlow subscriptionCountStateFlow;
        synchronized (this) {
            subscriptionCountStateFlow = this.f56201d;
            if (subscriptionCountStateFlow == null) {
                int i = this.f56199b;
                subscriptionCountStateFlow = new SubscriptionCountStateFlow(1, Integer.MAX_VALUE, BufferOverflow.f55394b);
                subscriptionCountStateFlow.mo20773g(Integer.valueOf(i));
                this.f56201d = subscriptionCountStateFlow;
            }
        }
        return subscriptionCountStateFlow;
    }

    /* JADX INFO: renamed from: i */
    public abstract AbstractSharedFlowSlot[] mo20780i();

    /* JADX INFO: renamed from: j */
    public final void m20807j(AbstractSharedFlowSlot abstractSharedFlowSlot) {
        SubscriptionCountStateFlow subscriptionCountStateFlow;
        int i;
        Continuation[] continuationArrMo20798b;
        synchronized (this) {
            try {
                int i2 = this.f56199b - 1;
                this.f56199b = i2;
                subscriptionCountStateFlow = this.f56201d;
                if (i2 == 0) {
                    this.f56200c = 0;
                }
                Intrinsics.m18597e(abstractSharedFlowSlot, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                continuationArrMo20798b = abstractSharedFlowSlot.mo20798b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (Continuation continuation : continuationArrMo20798b) {
            if (continuation != null) {
                continuation.resumeWith(Unit.f51459a);
            }
        }
        if (subscriptionCountStateFlow != null) {
            subscriptionCountStateFlow.m20813x(-1);
        }
    }
}
