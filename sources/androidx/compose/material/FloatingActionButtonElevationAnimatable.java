package androidx.compose.material;

import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.PressInteraction;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/material/FloatingActionButtonElevationAnimatable;", "", "material_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final class FloatingActionButtonElevationAnimatable {

    /* JADX INFO: renamed from: a */
    public float f10625a;

    /* JADX INFO: renamed from: b */
    public float f10626b;

    /* JADX INFO: renamed from: c */
    public float f10627c;

    /* JADX INFO: renamed from: d */
    public float f10628d;

    /* JADX INFO: renamed from: e */
    public Interaction f10629e;

    /* JADX INFO: renamed from: f */
    public Interaction f10630f;

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m3750a(Interaction interaction, ContinuationImpl continuationImpl) throws Throwable {
        FloatingActionButtonElevationAnimatable$animateElevation$1 floatingActionButtonElevationAnimatable$animateElevation$1;
        FloatingActionButtonElevationAnimatable floatingActionButtonElevationAnimatable;
        if (continuationImpl instanceof FloatingActionButtonElevationAnimatable$animateElevation$1) {
            floatingActionButtonElevationAnimatable$animateElevation$1 = (FloatingActionButtonElevationAnimatable$animateElevation$1) continuationImpl;
            int i = floatingActionButtonElevationAnimatable$animateElevation$1.f10635f;
            if ((i & Integer.MIN_VALUE) != 0) {
                floatingActionButtonElevationAnimatable$animateElevation$1.f10635f = i - Integer.MIN_VALUE;
            } else {
                floatingActionButtonElevationAnimatable$animateElevation$1 = new FloatingActionButtonElevationAnimatable$animateElevation$1(this, continuationImpl);
            }
        }
        Object obj = floatingActionButtonElevationAnimatable$animateElevation$1.f10633c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i2 = floatingActionButtonElevationAnimatable$animateElevation$1.f10635f;
        if (i2 == 0) {
            ResultKt.m18313b(obj);
            if (!(interaction instanceof PressInteraction.Press) && !(interaction instanceof HoverInteraction.Enter)) {
                boolean z2 = interaction instanceof FocusInteraction.Focus;
            }
            this.f10630f = interaction;
            try {
                throw null;
            } catch (Throwable th) {
                th = th;
                floatingActionButtonElevationAnimatable = this;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interaction = floatingActionButtonElevationAnimatable$animateElevation$1.f10632b;
            floatingActionButtonElevationAnimatable = (FloatingActionButtonElevationAnimatable) floatingActionButtonElevationAnimatable$animateElevation$1.f10631a;
            try {
                ResultKt.m18313b(obj);
                floatingActionButtonElevationAnimatable.f10629e = interaction;
                return Unit.f51459a;
            } catch (Throwable th2) {
                th = th2;
            }
        }
        floatingActionButtonElevationAnimatable.f10629e = interaction;
        throw th;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m3751b(ContinuationImpl continuationImpl) {
        FloatingActionButtonElevationAnimatable$snapElevation$1 floatingActionButtonElevationAnimatable$snapElevation$1;
        if (continuationImpl instanceof FloatingActionButtonElevationAnimatable$snapElevation$1) {
            floatingActionButtonElevationAnimatable$snapElevation$1 = (FloatingActionButtonElevationAnimatable$snapElevation$1) continuationImpl;
            int i = floatingActionButtonElevationAnimatable$snapElevation$1.f10639d;
            if ((i & Integer.MIN_VALUE) != 0) {
                floatingActionButtonElevationAnimatable$snapElevation$1.f10639d = i - Integer.MIN_VALUE;
            } else {
                floatingActionButtonElevationAnimatable$snapElevation$1 = new FloatingActionButtonElevationAnimatable$snapElevation$1(this, continuationImpl);
            }
        }
        Object obj = floatingActionButtonElevationAnimatable$snapElevation$1.f10637b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i2 = floatingActionButtonElevationAnimatable$snapElevation$1.f10639d;
        if (i2 == 0) {
            ResultKt.m18313b(obj);
            Interaction interaction = this.f10630f;
            if (!(interaction instanceof PressInteraction.Press) && !(interaction instanceof HoverInteraction.Enter)) {
                boolean z2 = interaction instanceof FocusInteraction.Focus;
            }
            throw null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        FloatingActionButtonElevationAnimatable floatingActionButtonElevationAnimatable = (FloatingActionButtonElevationAnimatable) floatingActionButtonElevationAnimatable$snapElevation$1.f10636a;
        try {
            ResultKt.m18313b(obj);
            floatingActionButtonElevationAnimatable.f10629e = floatingActionButtonElevationAnimatable.f10630f;
            return Unit.f51459a;
        } catch (Throwable th) {
            floatingActionButtonElevationAnimatable.f10629e = floatingActionButtonElevationAnimatable.f10630f;
            throw th;
        }
    }
}
