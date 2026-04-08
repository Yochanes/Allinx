package androidx.compose.material3.carousel;

import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/material3/carousel/CarouselItemInfoImpl;", "Landroidx/compose/material3/carousel/CarouselItemInfo;", "material3_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@SourceDebugExtension
public final class CarouselItemInfoImpl implements CarouselItemInfo {

    /* JADX INFO: renamed from: a */
    public final MutableFloatState f15292a = PrimitiveSnapshotStateKt.m4404a(0.0f);

    /* JADX INFO: renamed from: b */
    public final MutableFloatState f15293b = PrimitiveSnapshotStateKt.m4404a(0.0f);

    /* JADX INFO: renamed from: c */
    public final MutableFloatState f15294c = PrimitiveSnapshotStateKt.m4404a(0.0f);

    /* JADX INFO: renamed from: d */
    public final MutableState f15295d = SnapshotStateKt.m4525g(Rect.f17525e);
}
