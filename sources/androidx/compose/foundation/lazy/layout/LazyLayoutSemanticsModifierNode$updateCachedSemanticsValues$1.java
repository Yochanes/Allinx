package androidx.compose.foundation.lazy.layout;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m18302d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Float;"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class LazyLayoutSemanticsModifierNode$updateCachedSemanticsValues$1 extends Lambda implements Function0<Float> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ LazyLayoutSemanticsModifierNode f7409a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutSemanticsModifierNode$updateCachedSemanticsValues$1(LazyLayoutSemanticsModifierNode lazyLayoutSemanticsModifierNode) {
        super(0);
        this.f7409a = lazyLayoutSemanticsModifierNode;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return Float.valueOf(this.f7409a.f7401u.mo2906b());
    }
}
