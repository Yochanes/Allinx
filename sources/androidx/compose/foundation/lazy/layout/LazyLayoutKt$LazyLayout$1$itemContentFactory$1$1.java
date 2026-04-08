package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m18302d2 = {"<anonymous>", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class LazyLayoutKt$LazyLayout$1$itemContentFactory$1$1 extends Lambda implements Function0<LazyLayoutItemProvider> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ MutableState f7321a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutKt$LazyLayout$1$itemContentFactory$1$1(MutableState mutableState) {
        super(0);
        this.f7321a = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return (LazyLayoutItemProvider) ((Function0) this.f7321a.getF20325a()).invoke();
    }
}
