package androidx.compose.foundation.interaction;

import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/interaction/MutableInteractionSourceImpl;", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final class MutableInteractionSourceImpl implements MutableInteractionSource {

    /* JADX INFO: renamed from: a */
    public final SharedFlowImpl f6217a = SharedFlowKt.m20794b(16, 1, BufferOverflow.f55394b);

    @Override // androidx.compose.foundation.interaction.MutableInteractionSource
    /* JADX INFO: renamed from: a */
    public final Object mo2697a(Interaction interaction, Continuation continuation) throws Throwable {
        Object objEmit = this.f6217a.emit(interaction, continuation);
        return objEmit == CoroutineSingletons.f51584a ? objEmit : Unit.f51459a;
    }

    @Override // androidx.compose.foundation.interaction.MutableInteractionSource
    /* JADX INFO: renamed from: b */
    public final boolean mo2698b(Interaction interaction) {
        return this.f6217a.mo20773g(interaction);
    }

    @Override // androidx.compose.foundation.interaction.InteractionSource
    /* JADX INFO: renamed from: c */
    public final Flow mo2695c() {
        return this.f6217a;
    }
}
