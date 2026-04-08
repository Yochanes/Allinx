package androidx.constraintlayout.motion.utils;

import androidx.constraintlayout.core.motion.utils.SpringStopEngine;
import androidx.constraintlayout.core.motion.utils.StopEngine;
import androidx.constraintlayout.core.motion.utils.StopLogicEngine;
import androidx.constraintlayout.motion.widget.MotionInterpolator;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class StopLogic extends MotionInterpolator {

    /* JADX INFO: renamed from: a */
    public StopLogicEngine f22159a;

    /* JADX INFO: renamed from: b */
    public SpringStopEngine f22160b;

    /* JADX INFO: renamed from: c */
    public StopEngine f22161c;

    @Override // androidx.constraintlayout.motion.widget.MotionInterpolator
    /* JADX INFO: renamed from: a */
    public final float mo7201a() {
        return this.f22161c.mo6925b();
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return this.f22161c.getInterpolation(f);
    }
}
