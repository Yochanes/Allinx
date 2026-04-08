package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m18302d2 = {"<anonymous>", "", "it", "", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class UpdatableAnimationState$animateToZero$5 extends Lambda implements Function1<Long, Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ UpdatableAnimationState f6141a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Function1 f6142b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdatableAnimationState$animateToZero$5(UpdatableAnimationState updatableAnimationState, Function1 function1) {
        super(1);
        this.f6141a = updatableAnimationState;
        this.f6142b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((Number) obj).longValue();
        UpdatableAnimationState updatableAnimationState = this.f6141a;
        float f = updatableAnimationState.f6130e;
        updatableAnimationState.f6130e = 0.0f;
        this.f6142b.invoke(Float.valueOf(f));
        return Unit.f51459a;
    }
}
