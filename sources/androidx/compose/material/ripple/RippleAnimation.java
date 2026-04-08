package androidx.compose.material.ripple;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/material/ripple/RippleAnimation;", "", "material-ripple_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class RippleAnimation {

    /* JADX INFO: renamed from: a */
    public Offset f11859a;

    /* JADX INFO: renamed from: b */
    public final float f11860b;

    /* JADX INFO: renamed from: c */
    public final boolean f11861c;

    /* JADX INFO: renamed from: d */
    public Float f11862d;

    /* JADX INFO: renamed from: e */
    public Offset f11863e;

    /* JADX INFO: renamed from: f */
    public final Animatable f11864f = AnimatableKt.m2260a(0.0f);

    /* JADX INFO: renamed from: g */
    public final Animatable f11865g = AnimatableKt.m2260a(0.0f);

    /* JADX INFO: renamed from: h */
    public final Animatable f11866h = AnimatableKt.m2260a(0.0f);

    /* JADX INFO: renamed from: i */
    public final CompletableDeferred f11867i = CompletableDeferredKt.m20548a();

    /* JADX INFO: renamed from: j */
    public final MutableState f11868j;

    /* JADX INFO: renamed from: k */
    public final MutableState f11869k;

    public RippleAnimation(Offset offset, float f, boolean z2) {
        this.f11859a = offset;
        this.f11860b = f;
        this.f11861c = z2;
        Boolean bool = Boolean.FALSE;
        this.f11868j = SnapshotStateKt.m4525g(bool);
        this.f11869k = SnapshotStateKt.m4525g(bool);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0089 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m3833a(ContinuationImpl continuationImpl) {
        RippleAnimation$animate$1 rippleAnimation$animate$1;
        RippleAnimation rippleAnimation;
        Object objM20563d;
        if (continuationImpl instanceof RippleAnimation$animate$1) {
            rippleAnimation$animate$1 = (RippleAnimation$animate$1) continuationImpl;
            int i = rippleAnimation$animate$1.f11873d;
            if ((i & Integer.MIN_VALUE) != 0) {
                rippleAnimation$animate$1.f11873d = i - Integer.MIN_VALUE;
            } else {
                rippleAnimation$animate$1 = new RippleAnimation$animate$1(this, continuationImpl);
            }
        }
        Object obj = rippleAnimation$animate$1.f11871b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i2 = rippleAnimation$animate$1.f11873d;
        Unit unit = Unit.f51459a;
        if (i2 == 0) {
            ResultKt.m18313b(obj);
            rippleAnimation$animate$1.f11870a = this;
            rippleAnimation$animate$1.f11873d = 1;
            Object objM20563d2 = CoroutineScopeKt.m20563d(new RippleAnimation$fadeIn$2(this, null), rippleAnimation$animate$1);
            if (objM20563d2 != coroutineSingletons) {
                objM20563d2 = unit;
            }
            if (objM20563d2 != coroutineSingletons) {
                rippleAnimation = this;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m18313b(obj);
                return unit;
            }
            rippleAnimation = rippleAnimation$animate$1.f11870a;
            ResultKt.m18313b(obj);
            rippleAnimation$animate$1.f11870a = null;
            rippleAnimation$animate$1.f11873d = 3;
            rippleAnimation.getClass();
            objM20563d = CoroutineScopeKt.m20563d(new RippleAnimation$fadeOut$2(rippleAnimation, null), rippleAnimation$animate$1);
            if (objM20563d != coroutineSingletons) {
                objM20563d = unit;
            }
            return objM20563d != coroutineSingletons ? coroutineSingletons : unit;
        }
        rippleAnimation = rippleAnimation$animate$1.f11870a;
        ResultKt.m18313b(obj);
        ((SnapshotMutableStateImpl) rippleAnimation.f11868j).setValue(Boolean.TRUE);
        CompletableDeferred completableDeferred = rippleAnimation.f11867i;
        rippleAnimation$animate$1.f11870a = rippleAnimation;
        rippleAnimation$animate$1.f11873d = 2;
        if (completableDeferred.mo20547V(rippleAnimation$animate$1) != coroutineSingletons) {
            rippleAnimation$animate$1.f11870a = null;
            rippleAnimation$animate$1.f11873d = 3;
            rippleAnimation.getClass();
            objM20563d = CoroutineScopeKt.m20563d(new RippleAnimation$fadeOut$2(rippleAnimation, null), rippleAnimation$animate$1);
            if (objM20563d != coroutineSingletons) {
            }
            if (objM20563d != coroutineSingletons) {
            }
        }
    }
}
