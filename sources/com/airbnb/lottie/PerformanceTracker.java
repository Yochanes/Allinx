package com.airbnb.lottie;

import androidx.core.util.Pair;
import java.util.Comparator;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class PerformanceTracker {

    /* JADX INFO: renamed from: com.airbnb.lottie.PerformanceTracker$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C23921 implements Comparator<Pair<String, Float>> {
        @Override // java.util.Comparator
        public final int compare(Pair<String, Float> pair, Pair<String, Float> pair2) {
            float fFloatValue = ((Float) pair.f23339b).floatValue();
            float fFloatValue2 = ((Float) pair2.f23339b).floatValue();
            if (fFloatValue2 > fFloatValue) {
                return 1;
            }
            return fFloatValue > fFloatValue2 ? -1 : 0;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface FrameListener {
    }
}
