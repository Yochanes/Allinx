package androidx.core.view;

import android.view.VelocityTracker;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final class VelocityTrackerCompat {

    /* JADX INFO: renamed from: a */
    public static final Map f23399a = Collections.synchronizedMap(new WeakHashMap());

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api34Impl {
        /* JADX INFO: renamed from: a */
        public static float m7764a(VelocityTracker velocityTracker, int i) {
            return velocityTracker.getAxisVelocity(i);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface VelocityTrackableMotionEventAxis {
    }
}
