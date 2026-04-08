package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"animation-core_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class VectorConvertersKt {

    /* JADX INFO: renamed from: a */
    public static final TwoWayConverter f4686a = new TwoWayConverterImpl(VectorConvertersKt$FloatToVector$1.f4699a, VectorConvertersKt$FloatToVector$2.f4700a);

    /* JADX INFO: renamed from: b */
    public static final TwoWayConverter f4687b = new TwoWayConverterImpl(VectorConvertersKt$IntToVector$1.f4705a, VectorConvertersKt$IntToVector$2.f4706a);

    /* JADX INFO: renamed from: c */
    public static final TwoWayConverter f4688c = new TwoWayConverterImpl(VectorConvertersKt$DpToVector$1.f4697a, VectorConvertersKt$DpToVector$2.f4698a);

    /* JADX INFO: renamed from: d */
    public static final TwoWayConverter f4689d = new TwoWayConverterImpl(VectorConvertersKt$DpOffsetToVector$1.f4695a, VectorConvertersKt$DpOffsetToVector$2.f4696a);

    /* JADX INFO: renamed from: e */
    public static final TwoWayConverter f4690e = new TwoWayConverterImpl(VectorConvertersKt$SizeToVector$1.f4711a, VectorConvertersKt$SizeToVector$2.f4712a);

    /* JADX INFO: renamed from: f */
    public static final TwoWayConverter f4691f = new TwoWayConverterImpl(VectorConvertersKt$OffsetToVector$1.f4707a, VectorConvertersKt$OffsetToVector$2.f4708a);

    /* JADX INFO: renamed from: g */
    public static final TwoWayConverter f4692g = new TwoWayConverterImpl(VectorConvertersKt$IntOffsetToVector$1.f4701a, VectorConvertersKt$IntOffsetToVector$2.f4702a);

    /* JADX INFO: renamed from: h */
    public static final TwoWayConverter f4693h = new TwoWayConverterImpl(VectorConvertersKt$IntSizeToVector$1.f4703a, VectorConvertersKt$IntSizeToVector$2.f4704a);

    /* JADX INFO: renamed from: i */
    public static final TwoWayConverter f4694i = new TwoWayConverterImpl(VectorConvertersKt$RectToVector$1.f4709a, VectorConvertersKt$RectToVector$2.f4710a);

    /* JADX INFO: renamed from: a */
    public static final TwoWayConverter m2378a(Function1 function1, Function1 function12) {
        return new TwoWayConverterImpl(function1, function12);
    }
}
