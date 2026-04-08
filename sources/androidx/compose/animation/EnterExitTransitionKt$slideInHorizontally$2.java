package androidx.compose.animation;

import androidx.compose.p013ui.unit.IntOffset;
import androidx.compose.p013ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m18302d2 = {"<anonymous>", "Landroidx/compose/ui/unit/IntOffset;", "it", "Landroidx/compose/ui/unit/IntSize;", "invoke-mHKZG7I", "(J)J"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
final class EnterExitTransitionKt$slideInHorizontally$2 extends Lambda implements Function1<IntSize, IntOffset> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Function1 f4164a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnterExitTransitionKt$slideInHorizontally$2(Function1 function1) {
        super(1);
        this.f4164a = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new IntOffset((((long) ((Number) this.f4164a.invoke(Integer.valueOf((int) (((IntSize) obj).f20568a >> 32)))).intValue()) << 32) | (((long) 0) & 4294967295L));
    }
}
