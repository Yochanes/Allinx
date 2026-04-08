package androidx.compose.p013ui.layout;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: androidx.compose.ui.layout.ComposableSingletons$SubcomposeLayoutKt$lambda-1$1, reason: invalid class name */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, m18302d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class ComposableSingletons$SubcomposeLayoutKt$lambda1$1 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: a */
    public static final ComposableSingletons$SubcomposeLayoutKt$lambda1$1 f18446a = new ComposableSingletons$SubcomposeLayoutKt$lambda1$1(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (!composer.mo4212E(iIntValue & 1, (iIntValue & 3) != 2)) {
            composer.mo4246x();
        }
        return Unit.f51459a;
    }
}
