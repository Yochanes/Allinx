package androidx.constraintlayout.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.parser.CLObject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@ExperimentalMotionApi
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/constraintlayout/compose/TransitionImpl;", "Landroidx/constraintlayout/compose/Transition;", "Companion", "constraintlayout-compose_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class TransitionImpl implements Transition {

    /* JADX INFO: renamed from: b */
    public static final TransitionImpl f21045b = new TransitionImpl(new CLObject(new char[0]));

    /* JADX INFO: renamed from: a */
    public final CLObject f21046a;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/constraintlayout/compose/TransitionImpl$Companion;", "", "constraintlayout-compose_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Companion {
    }

    public TransitionImpl(CLObject cLObject) {
        this.f21046a = cLObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!TransitionImpl.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.m18597e(obj, "null cannot be cast to non-null type androidx.constraintlayout.compose.TransitionImpl");
        return Intrinsics.m18594b(this.f21046a, ((TransitionImpl) obj).f21046a);
    }

    public final int hashCode() {
        return this.f21046a.hashCode();
    }
}
