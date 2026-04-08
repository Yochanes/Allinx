package kotlinx.coroutines.debug.internal;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.debug.internal.ConcurrentWeakMap;

/* JADX INFO: renamed from: kotlinx.coroutines.debug.internal.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C6257a implements Function2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f55661a;

    public /* synthetic */ C6257a(int i) {
        this.f55661a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f55661a) {
            case 0:
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = ConcurrentWeakMap.f55634b;
                return new ConcurrentWeakMap.Entry(obj, obj2);
            default:
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = ConcurrentWeakMap.f55634b;
                return obj;
        }
    }
}
