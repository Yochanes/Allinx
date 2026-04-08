package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import kotlinx.coroutines.internal.Symbol;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"kotlinx-coroutines-core"}, m18303k = 2, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public final class StateFlowKt {

    /* JADX INFO: renamed from: a */
    public static final Symbol f56181a = new Symbol("NONE");

    /* JADX INFO: renamed from: b */
    public static final Symbol f56182b = new Symbol("PENDING");

    /* JADX INFO: renamed from: a */
    public static final MutableStateFlow m20803a(Object obj) {
        if (obj == null) {
            obj = NullSurrogateKt.f56293a;
        }
        return new StateFlowImpl(obj);
    }
}
