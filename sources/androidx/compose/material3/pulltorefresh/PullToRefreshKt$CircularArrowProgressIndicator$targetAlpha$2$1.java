package androidx.compose.material3.pulltorefresh;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m18302d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Float;"}, m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
final class PullToRefreshKt$CircularArrowProgressIndicator$targetAlpha$2$1 extends Lambda implements Function0<Float> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Function0 f15740a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PullToRefreshKt$CircularArrowProgressIndicator$targetAlpha$2$1(Function0 function0) {
        super(0);
        this.f15740a = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return Float.valueOf(((Number) this.f15740a.invoke()).floatValue() < 1.0f ? 0.3f : 1.0f);
    }
}
