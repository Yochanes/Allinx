package androidx.compose.material;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/compose/material/DismissState;", "Landroidx/compose/material/SwipeableState;", "Landroidx/compose/material/DismissValue;", "Companion", "material_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@ExperimentalMaterialApi
public final class DismissState extends SwipeableState<DismissValue> {

    /* JADX INFO: renamed from: androidx.compose.material.DismissState$1 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m18302d2 = {"<anonymous>", "", "it", "Landroidx/compose/material/DismissValue;", "invoke", "(Landroidx/compose/material/DismissValue;)Ljava/lang/Boolean;"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
    final class C08621 extends Lambda implements Function1<DismissValue, Boolean> {
        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/material/DismissState$Companion;", "", "material_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
    }

    public DismissState(DismissValue dismissValue) {
        super(dismissValue, SwipeableDefaults.f11329a, null);
    }
}
