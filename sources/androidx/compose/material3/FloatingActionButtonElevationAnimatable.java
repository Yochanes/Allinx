package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.material3.internal.ElevationKt;
import androidx.compose.p013ui.unit.C1338Dp;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/material3/FloatingActionButtonElevationAnimatable;", "", "material3_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
final class FloatingActionButtonElevationAnimatable {

    /* JADX INFO: renamed from: a */
    public float f13448a;

    /* JADX INFO: renamed from: b */
    public float f13449b;

    /* JADX INFO: renamed from: c */
    public float f13450c;

    /* JADX INFO: renamed from: d */
    public float f13451d;

    /* JADX INFO: renamed from: e */
    public final Animatable f13452e;

    /* JADX INFO: renamed from: f */
    public Interaction f13453f;

    /* JADX INFO: renamed from: g */
    public Interaction f13454g;

    public FloatingActionButtonElevationAnimatable(float f, float f2, float f3, float f4) {
        this.f13448a = f;
        this.f13449b = f2;
        this.f13450c = f3;
        this.f13451d = f4;
        this.f13452e = new Animatable(new C1338Dp(f), VectorConvertersKt.f4688c, null, 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m3954a(Interaction interaction, ContinuationImpl continuationImpl) throws Throwable {
        FloatingActionButtonElevationAnimatable$animateElevation$1 floatingActionButtonElevationAnimatable$animateElevation$1;
        FloatingActionButtonElevationAnimatable floatingActionButtonElevationAnimatable;
        Animatable animatable = this.f13452e;
        if (continuationImpl instanceof FloatingActionButtonElevationAnimatable$animateElevation$1) {
            floatingActionButtonElevationAnimatable$animateElevation$1 = (FloatingActionButtonElevationAnimatable$animateElevation$1) continuationImpl;
            int i = floatingActionButtonElevationAnimatable$animateElevation$1.f13459f;
            if ((i & Integer.MIN_VALUE) != 0) {
                floatingActionButtonElevationAnimatable$animateElevation$1.f13459f = i - Integer.MIN_VALUE;
            } else {
                floatingActionButtonElevationAnimatable$animateElevation$1 = new FloatingActionButtonElevationAnimatable$animateElevation$1(this, continuationImpl);
            }
        }
        Object obj = floatingActionButtonElevationAnimatable$animateElevation$1.f13457c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i2 = floatingActionButtonElevationAnimatable$animateElevation$1.f13459f;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interaction = floatingActionButtonElevationAnimatable$animateElevation$1.f13456b;
            floatingActionButtonElevationAnimatable = (FloatingActionButtonElevationAnimatable) floatingActionButtonElevationAnimatable$animateElevation$1.f13455a;
            try {
                ResultKt.m18313b(obj);
                floatingActionButtonElevationAnimatable.f13453f = interaction;
                return Unit.f51459a;
            } catch (Throwable th) {
                th = th;
                floatingActionButtonElevationAnimatable.f13453f = interaction;
                throw th;
            }
        }
        ResultKt.m18313b(obj);
        float f = interaction instanceof PressInteraction.Press ? this.f13449b : interaction instanceof HoverInteraction.Enter ? this.f13450c : interaction instanceof FocusInteraction.Focus ? this.f13451d : this.f13448a;
        this.f13454g = interaction;
        try {
            if (!C1338Dp.m6641a(((C1338Dp) ((SnapshotMutableStateImpl) animatable.f4289e).getF20325a()).f20559a, f)) {
                Interaction interaction2 = this.f13453f;
                floatingActionButtonElevationAnimatable$animateElevation$1.f13455a = this;
                floatingActionButtonElevationAnimatable$animateElevation$1.f13456b = interaction;
                floatingActionButtonElevationAnimatable$animateElevation$1.f13459f = 1;
                if (ElevationKt.m4168a(animatable, f, interaction2, interaction, floatingActionButtonElevationAnimatable$animateElevation$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            floatingActionButtonElevationAnimatable = this;
            floatingActionButtonElevationAnimatable.f13453f = interaction;
            return Unit.f51459a;
        } catch (Throwable th2) {
            th = th2;
            floatingActionButtonElevationAnimatable = this;
            floatingActionButtonElevationAnimatable.f13453f = interaction;
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m3955b(ContinuationImpl continuationImpl) throws Throwable {
        FloatingActionButtonElevationAnimatable$snapElevation$1 floatingActionButtonElevationAnimatable$snapElevation$1;
        FloatingActionButtonElevationAnimatable floatingActionButtonElevationAnimatable;
        if (continuationImpl instanceof FloatingActionButtonElevationAnimatable$snapElevation$1) {
            floatingActionButtonElevationAnimatable$snapElevation$1 = (FloatingActionButtonElevationAnimatable$snapElevation$1) continuationImpl;
            int i = floatingActionButtonElevationAnimatable$snapElevation$1.f13463d;
            if ((i & Integer.MIN_VALUE) != 0) {
                floatingActionButtonElevationAnimatable$snapElevation$1.f13463d = i - Integer.MIN_VALUE;
            } else {
                floatingActionButtonElevationAnimatable$snapElevation$1 = new FloatingActionButtonElevationAnimatable$snapElevation$1(this, continuationImpl);
            }
        }
        Object obj = floatingActionButtonElevationAnimatable$snapElevation$1.f13461b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i2 = floatingActionButtonElevationAnimatable$snapElevation$1.f13463d;
        if (i2 == 0) {
            ResultKt.m18313b(obj);
            Interaction interaction = this.f13454g;
            float f = interaction instanceof PressInteraction.Press ? this.f13449b : interaction instanceof HoverInteraction.Enter ? this.f13450c : interaction instanceof FocusInteraction.Focus ? this.f13451d : this.f13448a;
            Animatable animatable = this.f13452e;
            if (!C1338Dp.m6641a(((C1338Dp) ((SnapshotMutableStateImpl) animatable.f4289e).getF20325a()).f20559a, f)) {
                try {
                    C1338Dp c1338Dp = new C1338Dp(f);
                    floatingActionButtonElevationAnimatable$snapElevation$1.f13460a = this;
                    floatingActionButtonElevationAnimatable$snapElevation$1.f13463d = 1;
                    if (animatable.m2258g(c1338Dp, floatingActionButtonElevationAnimatable$snapElevation$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    floatingActionButtonElevationAnimatable = this;
                    floatingActionButtonElevationAnimatable.f13453f = floatingActionButtonElevationAnimatable.f13454g;
                } catch (Throwable th) {
                    th = th;
                    floatingActionButtonElevationAnimatable = this;
                    floatingActionButtonElevationAnimatable.f13453f = floatingActionButtonElevationAnimatable.f13454g;
                    throw th;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            floatingActionButtonElevationAnimatable = (FloatingActionButtonElevationAnimatable) floatingActionButtonElevationAnimatable$snapElevation$1.f13460a;
            try {
                ResultKt.m18313b(obj);
                floatingActionButtonElevationAnimatable.f13453f = floatingActionButtonElevationAnimatable.f13454g;
            } catch (Throwable th2) {
                th = th2;
                floatingActionButtonElevationAnimatable.f13453f = floatingActionButtonElevationAnimatable.f13454g;
                throw th;
            }
        }
        return Unit.f51459a;
    }
}
