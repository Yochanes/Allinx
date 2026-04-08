package androidx.compose.p013ui.input.pointer;

import androidx.compose.p013ui.platform.ViewConfiguration;
import androidx.compose.p013ui.unit.Density;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "Landroidx/compose/ui/unit/Density;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public interface PointerInputScope extends Density {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class DefaultImpls {
    }

    /* JADX INFO: renamed from: a */
    long mo2552a();

    ViewConfiguration getViewConfiguration();

    /* JADX INFO: renamed from: t0 */
    Object mo2560t0(Function2 function2, Continuation continuation);

    /* JADX INFO: renamed from: x0 */
    default void mo2564x0() {
    }
}
