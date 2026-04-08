package androidx.compose.material.ripple;

import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.geometry.OffsetKt;
import androidx.compose.p013ui.geometry.Size;
import androidx.compose.p013ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"material-ripple_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class RippleAnimationKt {

    /* JADX INFO: renamed from: a */
    public static final float f11886a = 10;

    /* JADX INFO: renamed from: a */
    public static final float m3834a(Density density, boolean z2, long j) {
        float fM5054d = Offset.m5054d(OffsetKt.m5061a(Size.m5083d(j), Size.m5081b(j))) / 2.0f;
        return z2 ? density.mo2551X0(f11886a) + fM5054d : fM5054d;
    }
}
