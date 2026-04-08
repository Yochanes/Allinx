package androidx.compose.material3;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: androidx.compose.material3.ComposableSingletons$AppBarKt$lambda-2$1, reason: invalid class name */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, m18302d2 = {"<anonymous>", "", "Landroidx/compose/foundation/layout/RowScope;", "invoke", "(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/runtime/Composer;I)V"}, m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class ComposableSingletons$AppBarKt$lambda2$1 extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: a */
    public static final ComposableSingletons$AppBarKt$lambda2$1 f12615a = new ComposableSingletons$AppBarKt$lambda2$1(3);

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        if ((((Number) obj3).intValue() & 17) == 16 && composer.mo4242t()) {
            composer.mo4246x();
        }
        return Unit.f51459a;
    }
}
