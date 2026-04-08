package androidx.compose.p013ui.layout;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.math.MathKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
public /* synthetic */ class AlignmentLineKt$FirstBaseline$1 extends FunctionReferenceImpl implements Function2<Integer, Integer, Integer> {

    /* JADX INFO: renamed from: a */
    public static final AlignmentLineKt$FirstBaseline$1 f18423a = new AlignmentLineKt$FirstBaseline$1(2, MathKt.class, "min", "min(II)I", 1);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return Integer.valueOf(Math.min(((Number) obj).intValue(), ((Number) obj2).intValue()));
    }
}
