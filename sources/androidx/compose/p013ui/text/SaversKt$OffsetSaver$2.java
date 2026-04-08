package androidx.compose.p013ui.text;

import androidx.compose.p013ui.geometry.Offset;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m18302d2 = {"<anonymous>", "Landroidx/compose/ui/geometry/Offset;", "it", "", "invoke-x-9fifI"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class SaversKt$OffsetSaver$2 extends Lambda implements Function1<Object, Offset> {

    /* JADX INFO: renamed from: a */
    public static final SaversKt$OffsetSaver$2 f20032a = new SaversKt$OffsetSaver$2(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        if (Intrinsics.m18594b(obj, Boolean.FALSE)) {
            return new Offset(9205357640488583168L);
        }
        Intrinsics.m18597e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        Float f = obj2 != null ? (Float) obj2 : null;
        Intrinsics.m18596d(f);
        float fFloatValue = f.floatValue();
        Object obj3 = list.get(1);
        Float f2 = obj3 != null ? (Float) obj3 : null;
        Intrinsics.m18596d(f2);
        return new Offset((((long) Float.floatToRawIntBits(fFloatValue)) << 32) | (((long) Float.floatToRawIntBits(f2.floatValue())) & 4294967295L));
    }
}
