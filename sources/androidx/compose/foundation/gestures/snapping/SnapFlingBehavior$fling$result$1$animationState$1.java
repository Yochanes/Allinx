package androidx.compose.foundation.gestures.snapping;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m18302d2 = {"<anonymous>", "", "delta", "", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class SnapFlingBehavior$fling$result$1$animationState$1 extends Lambda implements Function1<Float, Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Ref.FloatRef f6167a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Lambda f6168b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SnapFlingBehavior$fling$result$1$animationState$1(Ref.FloatRef floatRef, Function1 function1) {
        super(1);
        this.f6167a = floatRef;
        this.f6168b = (Lambda) function1;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        float fFloatValue = ((Number) obj).floatValue();
        Ref.FloatRef floatRef = this.f6167a;
        float f = floatRef.f51656a - fFloatValue;
        floatRef.f51656a = f;
        this.f6168b.invoke(Float.valueOf(f));
        return Unit.f51459a;
    }
}
