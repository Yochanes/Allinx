package androidx.compose.p013ui.layout;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.math.MathKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
public /* synthetic */ class AlignmentLineKt$LastBaseline$1 extends FunctionReferenceImpl implements Function2<Integer, Integer, Integer> {

    /* JADX INFO: renamed from: a */
    public static final AlignmentLineKt$LastBaseline$1 f18424a = new AlignmentLineKt$LastBaseline$1(2, MathKt.class, "max", "max(II)I", 1);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return Integer.valueOf(Math.max(((Number) obj).intValue(), ((Number) obj2).intValue()));
    }
}
