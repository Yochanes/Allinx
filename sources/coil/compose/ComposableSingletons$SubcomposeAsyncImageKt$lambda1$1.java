package coil.compose;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: coil.compose.ComposableSingletons$SubcomposeAsyncImageKt$lambda-1$1, reason: invalid class name */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class ComposableSingletons$SubcomposeAsyncImageKt$lambda1$1 implements Function3<SubcomposeAsyncImageScope, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: a */
    public static final ComposableSingletons$SubcomposeAsyncImageKt$lambda1$1 f33362a = new ComposableSingletons$SubcomposeAsyncImageKt$lambda1$1();

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        SubcomposeAsyncImageScope subcomposeAsyncImageScope = (SubcomposeAsyncImageScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 14) == 0) {
            iIntValue |= composer.mo4220M(subcomposeAsyncImageScope) ? 4 : 2;
        }
        if ((iIntValue & 91) == 18 && composer.mo4242t()) {
            composer.mo4246x();
        } else {
            SubcomposeAsyncImageKt.m12412c(subcomposeAsyncImageScope, null, null, null, null, null, 0.0f, null, false, composer, iIntValue & 14);
        }
        return Unit.f51459a;
    }
}
