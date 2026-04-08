package androidx.compose.material;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: androidx.compose.material.ComposableSingletons$SnackbarHostKt$lambda-1$1, reason: invalid class name */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, m18302d2 = {"<anonymous>", "", "it", "Landroidx/compose/material/SnackbarData;", "invoke", "(Landroidx/compose/material/SnackbarData;Landroidx/compose/runtime/Composer;I)V"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class ComposableSingletons$SnackbarHostKt$lambda1$1 extends Lambda implements Function3<SnackbarData, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: a */
    public static final ComposableSingletons$SnackbarHostKt$lambda1$1 f10406a = new ComposableSingletons$SnackbarHostKt$lambda1$1(3);

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        SnackbarData snackbarData = (SnackbarData) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= (iIntValue & 8) == 0 ? composer.mo4220M(snackbarData) : composer.mo4235m(snackbarData) ? 4 : 2;
        }
        if (composer.mo4212E(iIntValue & 1, (iIntValue & 19) != 18)) {
            SnackbarKt.m3786b(snackbarData, null, null, 0L, 0L, 0L, 0.0f, composer, iIntValue & 14);
        } else {
            composer.mo4246x();
        }
        return Unit.f51459a;
    }
}
