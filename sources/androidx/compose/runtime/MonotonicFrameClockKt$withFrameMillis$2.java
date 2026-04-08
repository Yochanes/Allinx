package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m18302d2 = {"<anonymous>", "R", "it", "", "invoke", "(J)Ljava/lang/Object;"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 176)
public final class MonotonicFrameClockKt$withFrameMillis$2 extends Lambda implements Function1<Long, Object> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Lambda f16399a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MonotonicFrameClockKt$withFrameMillis$2(Function1 function1) {
        super(1);
        this.f16399a = (Lambda) function1;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return this.f16399a.invoke(Long.valueOf(((Number) obj).longValue() / 1000000));
    }
}
