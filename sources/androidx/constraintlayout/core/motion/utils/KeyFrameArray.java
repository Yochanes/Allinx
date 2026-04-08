package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.CustomVariable;
import com.engagelab.privates.common.observer.MTObservable;
import java.util.Arrays;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class KeyFrameArray {

    /* JADX INFO: compiled from: Proguard */
    public static class CustomArray {
    }

    /* JADX INFO: compiled from: Proguard */
    public static class CustomVar {

        /* JADX INFO: renamed from: a */
        public final int[] f21449a;

        /* JADX INFO: renamed from: b */
        public final CustomVariable[] f21450b;

        /* JADX INFO: renamed from: c */
        public int f21451c;

        public CustomVar() {
            int[] iArr = new int[MTObservable.WHAT_OBSERVER];
            this.f21449a = iArr;
            CustomVariable[] customVariableArr = new CustomVariable[MTObservable.WHAT_OBSERVER];
            this.f21450b = customVariableArr;
            Arrays.fill(iArr, 999);
            Arrays.fill(customVariableArr, (Object) null);
            this.f21451c = 0;
        }

        /* JADX INFO: renamed from: a */
        public final void m6913a(int i, CustomVariable customVariable) {
            int i2;
            CustomVariable[] customVariableArr = this.f21450b;
            CustomVariable customVariable2 = customVariableArr[i];
            int[] iArr = this.f21449a;
            if (customVariable2 != null) {
                customVariableArr[i] = null;
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    i2 = this.f21451c;
                    if (i3 >= i2) {
                        break;
                    }
                    if (i == iArr[i3]) {
                        iArr[i3] = 999;
                        i4++;
                    }
                    if (i3 != i4) {
                        iArr[i3] = iArr[i4];
                    }
                    i4++;
                    i3++;
                }
                this.f21451c = i2 - 1;
            }
            customVariableArr[i] = customVariable;
            int i5 = this.f21451c;
            this.f21451c = i5 + 1;
            iArr[i5] = i;
            Arrays.sort(iArr);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class FloatArray {
    }
}
