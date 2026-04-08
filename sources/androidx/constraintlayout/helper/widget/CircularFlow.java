package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.VirtualLayout;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class CircularFlow extends VirtualLayout {

    /* JADX INFO: renamed from: v */
    public static int f22119v;

    /* JADX INFO: renamed from: w */
    public static float f22120w;

    /* JADX INFO: renamed from: q */
    public ConstraintLayout f22121q;

    /* JADX INFO: renamed from: r */
    public float[] f22122r;

    /* JADX INFO: renamed from: s */
    public int[] f22123s;

    /* JADX INFO: renamed from: t */
    public int f22124t;

    /* JADX INFO: renamed from: u */
    public int f22125u;

    private void setAngles(String str) {
        if (str == null) {
            return;
        }
        int i = 0;
        this.f22125u = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                m7178s(str.substring(i).trim());
                return;
            } else {
                m7178s(str.substring(i, iIndexOf).trim());
                i = iIndexOf + 1;
            }
        }
    }

    private void setRadius(String str) {
        if (str == null) {
            return;
        }
        int i = 0;
        this.f22124t = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                m7179t(str.substring(i).trim());
                return;
            } else {
                m7179t(str.substring(i, iIndexOf).trim());
                i = iIndexOf + 1;
            }
        }
    }

    public float[] getAngles() {
        return Arrays.copyOf(this.f22122r, this.f22125u);
    }

    public int[] getRadius() {
        return Arrays.copyOf(this.f22123s, this.f22124t);
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f22121q = (ConstraintLayout) getParent();
        for (int i = 0; i < this.f22616b; i++) {
            View viewById = this.f22121q.getViewById(this.f22615a[i]);
            if (viewById != null) {
                int i2 = f22119v;
                float f = f22120w;
                int[] iArr = this.f22123s;
                HashMap map = this.f22623n;
                if (iArr == null || i >= iArr.length) {
                    Log.e("CircularFlow", "Added radius to view with id: " + ((String) map.get(Integer.valueOf(viewById.getId()))));
                } else {
                    i2 = iArr[i];
                }
                float[] fArr = this.f22122r;
                if (fArr == null || i >= fArr.length) {
                    Log.e("CircularFlow", "Added angle to view with id: " + ((String) map.get(Integer.valueOf(viewById.getId()))));
                } else {
                    f = fArr[i];
                }
                ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) viewById.getLayoutParams();
                layoutParams.f22685r = f;
                layoutParams.f22681p = 0;
                layoutParams.f22683q = i2;
                viewById.setLayoutParams(layoutParams);
            }
        }
        m7325e();
    }

    /* JADX INFO: renamed from: s */
    public final void m7178s(String str) {
        float[] fArr;
        if (str == null || str.length() == 0 || this.f22617c == null || (fArr = this.f22122r) == null) {
            return;
        }
        if (this.f22125u + 1 > fArr.length) {
            this.f22122r = Arrays.copyOf(fArr, fArr.length + 1);
        }
        this.f22122r[this.f22125u] = Integer.parseInt(str);
        this.f22125u++;
    }

    public void setDefaultAngle(float f) {
        f22120w = f;
    }

    public void setDefaultRadius(int i) {
        f22119v = i;
    }

    /* JADX INFO: renamed from: t */
    public final void m7179t(String str) {
        Context context;
        int[] iArr;
        if (str == null || str.length() == 0 || (context = this.f22617c) == null || (iArr = this.f22123s) == null) {
            return;
        }
        if (this.f22124t + 1 > iArr.length) {
            this.f22123s = Arrays.copyOf(iArr, iArr.length + 1);
        }
        this.f22123s[this.f22124t] = (int) (Integer.parseInt(str) * context.getResources().getDisplayMetrics().density);
        this.f22124t++;
    }
}
