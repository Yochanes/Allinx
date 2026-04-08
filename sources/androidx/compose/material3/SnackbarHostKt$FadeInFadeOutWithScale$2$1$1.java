package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, m18302d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
final class SnackbarHostKt$FadeInFadeOutWithScale$2$1$1 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Function3 f14602a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SnackbarData f14603b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnackbarHostKt$FadeInFadeOutWithScale$2$1$1(Function3 function3, SnackbarData snackbarData) {
        super(2);
        this.f14602a = function3;
        this.f14603b = snackbarData;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.mo4242t()) {
            composer.mo4246x();
        } else {
            SnackbarData snackbarData = this.f14603b;
            Intrinsics.m18596d(snackbarData);
            this.f14602a.invoke(snackbarData, composer, 0);
        }
        return Unit.f51459a;
    }
}
