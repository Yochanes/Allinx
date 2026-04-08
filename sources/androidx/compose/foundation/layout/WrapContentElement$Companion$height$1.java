package androidx.compose.foundation.layout;

import androidx.compose.p013ui.BiasAlignment;
import androidx.compose.p013ui.unit.IntOffset;
import androidx.compose.p013ui.unit.IntSize;
import androidx.compose.p013ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m18302d2 = {"<anonymous>", "Landroidx/compose/ui/unit/IntOffset;", "size", "Landroidx/compose/ui/unit/IntSize;", "<anonymous parameter 1>", "Landroidx/compose/ui/unit/LayoutDirection;", "invoke-5SAbXVA", "(JLandroidx/compose/ui/unit/LayoutDirection;)J"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
final class WrapContentElement$Companion$height$1 extends Lambda implements Function2<IntSize, LayoutDirection, IntOffset> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ BiasAlignment.Vertical f6705a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WrapContentElement$Companion$height$1(BiasAlignment.Vertical vertical) {
        super(2);
        this.f6705a = vertical;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new IntOffset((4294967295L & ((long) this.f6705a.mo4859a(0, (int) (((IntSize) obj).f20568a & 4294967295L)))) | (((long) 0) << 32));
    }
}
