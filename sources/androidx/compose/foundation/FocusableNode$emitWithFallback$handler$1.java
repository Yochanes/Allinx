package androidx.compose.foundation;

import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m18302d2 = {"<anonymous>", "", "it", "", "invoke"}, m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
final class FocusableNode$emitWithFallback$handler$1 extends Lambda implements Function1<Throwable, Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ MutableInteractionSource f4991a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ FocusInteraction f4992b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusableNode$emitWithFallback$handler$1(MutableInteractionSource mutableInteractionSource, FocusInteraction focusInteraction) {
        super(1);
        this.f4991a = mutableInteractionSource;
        this.f4992b = focusInteraction;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.f4991a.mo2698b(this.f4992b);
        return Unit.f51459a;
    }
}
