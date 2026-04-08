package io.ktor.network.selector;

import io.ktor.util.InternalAPI;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.reflect.KMutableProperty1;
import kotlinx.coroutines.CancellableContinuation;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@InternalAPI
@Metadata(m18301d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000eR$\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u0012\u0004\b\u0006\u0010\u0007R$\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\b\u0010\u0005\u0012\u0004\b\t\u0010\u0007R$\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\n\u0010\u0005\u0012\u0004\b\u000b\u0010\u0007R$\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\f\u0010\u0005\u0012\u0004\b\r\u0010\u0007¨\u0006\u000f"}, m18302d2 = {"Lio/ktor/network/selector/InterestSuspensionsMap;", "", "Lkotlinx/coroutines/CancellableContinuation;", "", "readHandlerReference", "Lkotlinx/coroutines/CancellableContinuation;", "getReadHandlerReference$annotations", "()V", "writeHandlerReference", "getWriteHandlerReference$annotations", "connectHandlerReference", "getConnectHandlerReference$annotations", "acceptHandlerReference", "getAcceptHandlerReference$annotations", "Companion", "ktor-network"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class InterestSuspensionsMap {

    /* JADX INFO: renamed from: a */
    public static final AtomicReferenceFieldUpdater[] f45978a;
    private volatile CancellableContinuation<? super Unit> acceptHandlerReference;
    private volatile CancellableContinuation<? super Unit> connectHandlerReference;
    private volatile CancellableContinuation<? super Unit> readHandlerReference;
    private volatile CancellableContinuation<? super Unit> writeHandlerReference;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/network/selector/InterestSuspensionsMap$Companion;", "", "ktor-network"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class Companion {

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18300bv = {1, 0, 3}, m18303k = 3, m18304mv = {1, 4, 2})
        public final /* synthetic */ class WhenMappings {
            static {
                int[] iArr = new int[SelectInterest.values().length];
                iArr[0] = 1;
                iArr[1] = 2;
                iArr[2] = 3;
                iArr[3] = 4;
            }
        }
    }

    static {
        KMutableProperty1 kMutableProperty1;
        SelectInterest selectInterest = SelectInterest.READ;
        SelectInterest[] selectInterestArr = SelectInterest.f45995g;
        ArrayList arrayList = new ArrayList(selectInterestArr.length);
        for (SelectInterest selectInterest2 : selectInterestArr) {
            int iOrdinal = selectInterest2.ordinal();
            if (iOrdinal == 0) {
                kMutableProperty1 = InterestSuspensionsMap$Companion$updaters$1$property$1.f45979a;
            } else if (iOrdinal == 1) {
                kMutableProperty1 = InterestSuspensionsMap$Companion$updaters$1$property$2.f45980a;
            } else if (iOrdinal == 2) {
                kMutableProperty1 = InterestSuspensionsMap$Companion$updaters$1$property$3.f45981a;
            } else {
                if (iOrdinal != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                kMutableProperty1 = InterestSuspensionsMap$Companion$updaters$1$property$4.f45982a;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdaterNewUpdater = AtomicReferenceFieldUpdater.newUpdater(InterestSuspensionsMap.class, CancellableContinuation.class, kMutableProperty1.getF51911i());
            if (atomicReferenceFieldUpdaterNewUpdater == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.util.concurrent.atomic.AtomicReferenceFieldUpdater<io.ktor.network.selector.InterestSuspensionsMap, kotlinx.coroutines.CancellableContinuation<kotlin.Unit>?>");
            }
            arrayList.add(atomicReferenceFieldUpdaterNewUpdater);
        }
        Object[] array = arrayList.toArray(new AtomicReferenceFieldUpdater[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        f45978a = (AtomicReferenceFieldUpdater[]) array;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ CancellableContinuation m17072a(InterestSuspensionsMap interestSuspensionsMap) {
        return interestSuspensionsMap.acceptHandlerReference;
    }

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ CancellableContinuation m17073b(InterestSuspensionsMap interestSuspensionsMap) {
        return interestSuspensionsMap.connectHandlerReference;
    }

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ CancellableContinuation m17074c(InterestSuspensionsMap interestSuspensionsMap) {
        return interestSuspensionsMap.readHandlerReference;
    }

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ CancellableContinuation m17075d(InterestSuspensionsMap interestSuspensionsMap) {
        return interestSuspensionsMap.writeHandlerReference;
    }

    public final String toString() {
        return "R " + this.readHandlerReference + " W " + this.writeHandlerReference + " C " + this.connectHandlerReference + " A " + this.acceptHandlerReference;
    }
}
