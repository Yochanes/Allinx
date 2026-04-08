package androidx.compose.runtime;

import android.view.Choreographer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0002\b\u0005"}, m18302d2 = {"<anonymous>", "", "R", "it", "", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class DefaultChoreographerFrameClock$withFrameNanos$2$1 extends Lambda implements Function1<Throwable, Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Choreographer.FrameCallback f16339a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultChoreographerFrameClock$withFrameNanos$2$1(Choreographer.FrameCallback frameCallback) {
        super(1);
        this.f16339a = frameCallback;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        DefaultChoreographerFrameClock.f16338b.removeFrameCallback(this.f16339a);
        return Unit.f51459a;
    }
}
