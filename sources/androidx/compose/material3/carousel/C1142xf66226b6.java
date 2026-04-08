package androidx.compose.material3.carousel;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: androidx.compose.material3.carousel.StrategyKt$createShiftedKeylineListForContentPadding$newKeylines$1 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m18302d2 = {"<anonymous>", "", "Landroidx/compose/material3/carousel/KeylineListScope;", "invoke"}, m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
@SourceDebugExtension
final class C1142xf66226b6 extends Lambda implements Function1<KeylineListScope, Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ KeylineList f15336a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ float f15337b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1142xf66226b6(KeylineList keylineList, float f) {
        super(1);
        this.f15336a = keylineList;
        this.f15337b = f;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        KeylineListScope keylineListScope = (KeylineListScope) obj;
        KeylineList keylineList = this.f15336a;
        int size = keylineList.f15313a.size();
        for (int i = 0; i < size; i++) {
            Keyline keylineM4111c = keylineList.m4111c(i);
            keylineListScope.mo4113a(keylineM4111c.f15305a - Math.abs(this.f15337b), keylineM4111c.f15309e);
        }
        return Unit.f51459a;
    }
}
