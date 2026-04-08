package androidx.constraintlayout.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.compose.Dimension;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/constraintlayout/compose/DimensionDescription;", "Landroidx/constraintlayout/compose/Dimension$Coercible;", "Landroidx/constraintlayout/compose/Dimension$MinCoercible;", "Landroidx/constraintlayout/compose/Dimension$MaxCoercible;", "Landroidx/constraintlayout/compose/Dimension;", "constraintlayout-compose_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class DimensionDescription implements Dimension.Coercible, Dimension.MinCoercible, Dimension.MaxCoercible, Dimension {

    /* JADX INFO: renamed from: a */
    public final DimensionSymbol f20900a;

    /* JADX INFO: renamed from: b */
    public final DimensionSymbol f20901b = new DimensionSymbol(null, "min");

    /* JADX INFO: renamed from: c */
    public final DimensionSymbol f20902c = new DimensionSymbol(null, "max");

    public DimensionDescription(String str) {
        this.f20900a = new DimensionSymbol(str, "base");
    }
}
