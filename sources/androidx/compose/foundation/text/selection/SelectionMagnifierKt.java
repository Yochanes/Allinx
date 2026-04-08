package androidx.compose.foundation.text.selection;

import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.p013ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003¨\u0006\u0003²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\f\u0010\u0002\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, m18302d2 = {"Landroidx/compose/ui/geometry/Offset;", "animatedCenter", "targetValue", "foundation_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class SelectionMagnifierKt {

    /* JADX INFO: renamed from: a */
    public static final AnimationVector2D f9792a = new AnimationVector2D(Float.NaN, Float.NaN);

    /* JADX INFO: renamed from: b */
    public static final TwoWayConverter f9793b = VectorConvertersKt.m2378a(SelectionMagnifierKt$UnspecifiedSafeOffsetVectorConverter$1.f9796a, SelectionMagnifierKt$UnspecifiedSafeOffsetVectorConverter$2.f9797a);

    /* JADX INFO: renamed from: c */
    public static final long f9794c;

    /* JADX INFO: renamed from: d */
    public static final SpringSpec f9795d;

    static {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.01f)) << 32) | (((long) Float.floatToRawIntBits(0.01f)) & 4294967295L);
        f9794c = jFloatToRawIntBits;
        f9795d = new SpringSpec(new Offset(jFloatToRawIntBits), 3);
    }
}
