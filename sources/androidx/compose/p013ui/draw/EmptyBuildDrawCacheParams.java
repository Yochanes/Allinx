package androidx.compose.p013ui.draw;

import androidx.compose.p013ui.unit.Density;
import androidx.compose.p013ui.unit.DensityKt;
import androidx.compose.p013ui.unit.LayoutDirection;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/draw/EmptyBuildDrawCacheParams;", "Landroidx/compose/ui/draw/BuildDrawCacheParams;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final class EmptyBuildDrawCacheParams implements BuildDrawCacheParams {

    /* JADX INFO: renamed from: a */
    public static final EmptyBuildDrawCacheParams f17404a = new EmptyBuildDrawCacheParams();

    /* JADX INFO: renamed from: b */
    public static final LayoutDirection f17405b = LayoutDirection.f20569a;

    /* JADX INFO: renamed from: c */
    public static final Density f17406c = DensityKt.m6639a(1.0f, 1.0f);

    @Override // androidx.compose.p013ui.draw.BuildDrawCacheParams
    public final Density getDensity() {
        return f17406c;
    }

    @Override // androidx.compose.p013ui.draw.BuildDrawCacheParams
    public final LayoutDirection getLayoutDirection() {
        return f17405b;
    }

    @Override // androidx.compose.p013ui.draw.BuildDrawCacheParams
    /* JADX INFO: renamed from: h */
    public final long mo4938h() {
        return 9205357640488583168L;
    }
}
