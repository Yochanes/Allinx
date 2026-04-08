package androidx.compose.animation;

import androidx.compose.p013ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18302d2 = {"<anonymous>", "Landroidx/compose/ui/unit/IntSize;", "it", "invoke-mzRDjE0", "(J)J"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
final class EnterExitTransitionKt$expandIn$1 extends Lambda implements Function1<IntSize, IntSize> {

    /* JADX INFO: renamed from: a */
    public static final EnterExitTransitionKt$expandIn$1 f4156a = new EnterExitTransitionKt$expandIn$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long j = ((IntSize) obj).f20568a;
        long j2 = 0;
        return new IntSize((j2 & 4294967295L) | (j2 << 32));
    }
}
