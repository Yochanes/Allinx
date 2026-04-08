package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.channels.Channel;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\u0003*\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m18302d2 = {"<anonymous>", "", "T", "V", "Landroidx/compose/animation/core/AnimationVector;", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class AnimateAsStateKt$animateValueAsState$2$1 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Channel f4321a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f4322b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimateAsStateKt$animateValueAsState$2$1(Channel channel, Object obj) {
        super(0);
        this.f4321a = channel;
        this.f4322b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f4321a.mo11414v(this.f4322b);
        return Unit.f51459a;
    }
}
