package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
final class SegmentedButtonDefaults$ActiveIcon$1 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SegmentedButtonDefaults f14363a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SegmentedButtonDefaults$ActiveIcon$1(SegmentedButtonDefaults segmentedButtonDefaults, int i) {
        super(2);
        this.f14363a = segmentedButtonDefaults;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iM4417a = RecomposeScopeImplKt.m4417a(7);
        this.f14363a.m4024a((Composer) obj, iM4417a);
        return Unit.f51459a;
    }
}
