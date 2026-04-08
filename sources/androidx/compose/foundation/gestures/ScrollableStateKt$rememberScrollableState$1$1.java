package androidx.compose.foundation.gestures;

import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18302d2 = {"<anonymous>", "", "it", "invoke", "(F)Ljava/lang/Float;"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class ScrollableStateKt$rememberScrollableState$1$1 extends Lambda implements Function1<Float, Float> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ MutableState f5932a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableStateKt$rememberScrollableState$1$1(MutableState mutableState) {
        super(1);
        this.f5932a = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return (Float) ((Function1) this.f5932a.getF20325a()).invoke(Float.valueOf(((Number) obj).floatValue()));
    }
}
