package defpackage;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: BottomModalDialogBuilderKt$BottomModalSearchSortListContent$1$3$1$5 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18303k = 3, m18304mv = {2, 1, 0}, m18306xi = 48)
@SourceDebugExtension
final class C0004x15b37657 implements Function3<LazyItemScope, Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LazyItemScope item = (LazyItemScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        Intrinsics.m18599g(item, "$this$item");
        if ((iIntValue & 17) != 16 || !composer.mo4242t()) {
            throw null;
        }
        composer.mo4246x();
        return Unit.f51459a;
    }
}
