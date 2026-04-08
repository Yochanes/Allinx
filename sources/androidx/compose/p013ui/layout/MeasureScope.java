package androidx.compose.p013ui.layout;

import androidx.compose.p013ui.internal.InlineClassHelperKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@MeasureScopeMarker
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public interface MeasureScope extends IntrinsicMeasureScope {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class DefaultImpls {
    }

    /* JADX INFO: renamed from: V0 */
    static /* synthetic */ MeasureResult m5661V0(MeasureScope measureScope, int i, int i2, Function1 function1) {
        return measureScope.mo3065n1(i, i2, MapsKt.m18481d(), function1);
    }

    /* JADX INFO: renamed from: f0 */
    default MeasureResult mo3064f0(int i, int i2, Map map, Function1 function1) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            InlineClassHelperKt.m5597b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new MeasureScope$layout$1(i, i2, map, this, function1);
    }

    /* JADX INFO: renamed from: n1 */
    default MeasureResult mo3065n1(int i, int i2, Map map, Function1 function1) {
        return mo3064f0(i, i2, map, function1);
    }
}
