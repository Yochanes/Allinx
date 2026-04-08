package org.burnoutcrew.reorderable;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m18302d2 = {"<anonymous>", "", "T", "it", "invoke", "(F)Ljava/lang/Float;"}, m18303k = 3, m18304mv = {1, 7, 1}, m18306xi = 48)
public final class ReorderableState$Companion$EaseInQuintInterpolator$1 extends Lambda implements Function1<Float, Float> {

    /* JADX INFO: renamed from: a */
    public static final ReorderableState$Companion$EaseInQuintInterpolator$1 f58117a = new ReorderableState$Companion$EaseInQuintInterpolator$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        float fFloatValue = ((Number) obj).floatValue();
        return Float.valueOf(fFloatValue * fFloatValue * fFloatValue * fFloatValue * fFloatValue);
    }
}
