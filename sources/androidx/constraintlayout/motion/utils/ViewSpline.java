package androidx.constraintlayout.motion.utils;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.CurveFit;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import com.google.common.base.Ascii;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public abstract class ViewSpline extends SplineSet {

    /* JADX INFO: compiled from: Proguard */
    public static class AlphaSet extends ViewSpline {
        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        /* JADX INFO: renamed from: g */
        public final void mo7205g(float f, View view) {
            view.setAlpha(m6920a(f));
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class CustomSet extends ViewSpline {

        /* JADX INFO: renamed from: f */
        public SparseArray f22165f;

        /* JADX INFO: renamed from: g */
        public float[] f22166g;

        @Override // androidx.constraintlayout.core.motion.utils.SplineSet
        /* JADX INFO: renamed from: c */
        public final void mo6921c(float f, int i) {
            throw new RuntimeException("call of custom attribute setPoint");
        }

        @Override // androidx.constraintlayout.core.motion.utils.SplineSet
        /* JADX INFO: renamed from: e */
        public final void mo6923e(int i) {
            SparseArray sparseArray = this.f22165f;
            int size = sparseArray.size();
            int iM7320c = ((ConstraintAttribute) sparseArray.valueAt(0)).m7320c();
            double[] dArr = new double[size];
            this.f22166g = new float[iM7320c];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, iM7320c);
            for (int i2 = 0; i2 < size; i2++) {
                int iKeyAt = sparseArray.keyAt(i2);
                ConstraintAttribute constraintAttribute = (ConstraintAttribute) sparseArray.valueAt(i2);
                dArr[i2] = ((double) iKeyAt) * 0.01d;
                constraintAttribute.m7319b(this.f22166g);
                int i3 = 0;
                while (true) {
                    if (i3 < this.f22166g.length) {
                        dArr2[i2][i3] = r7[i3];
                        i3++;
                    }
                }
            }
            this.f21466a = CurveFit.m6898a(i, dArr, dArr2);
        }

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        /* JADX INFO: renamed from: g */
        public final void mo7205g(float f, View view) {
            this.f21466a.mo6887d(f, this.f22166g);
            CustomSupport.m7200b((ConstraintAttribute) this.f22165f.valueAt(0), view, this.f22166g);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class ElevationSet extends ViewSpline {
        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        /* JADX INFO: renamed from: g */
        public final void mo7205g(float f, View view) {
            view.setElevation(m6920a(f));
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class PivotXset extends ViewSpline {
        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        /* JADX INFO: renamed from: g */
        public final void mo7205g(float f, View view) {
            view.setPivotX(m6920a(f));
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class PivotYset extends ViewSpline {
        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        /* JADX INFO: renamed from: g */
        public final void mo7205g(float f, View view) {
            view.setPivotY(m6920a(f));
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class ProgressSet extends ViewSpline {

        /* JADX INFO: renamed from: f */
        public boolean f22167f;

        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        /* JADX INFO: renamed from: g */
        public final void mo7205g(float f, View view) {
            Method method;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(m6920a(f));
                return;
            }
            if (this.f22167f) {
                return;
            }
            try {
                method = view.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.f22167f = true;
                method = null;
            }
            if (method != null) {
                try {
                    method.invoke(view, Float.valueOf(m6920a(f)));
                } catch (IllegalAccessException e) {
                    Log.e("ViewSpline", "unable to setProgress", e);
                } catch (InvocationTargetException e2) {
                    Log.e("ViewSpline", "unable to setProgress", e2);
                }
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class RotationSet extends ViewSpline {
        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        /* JADX INFO: renamed from: g */
        public final void mo7205g(float f, View view) {
            view.setRotation(m6920a(f));
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class RotationXset extends ViewSpline {
        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        /* JADX INFO: renamed from: g */
        public final void mo7205g(float f, View view) {
            view.setRotationX(m6920a(f));
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class RotationYset extends ViewSpline {
        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        /* JADX INFO: renamed from: g */
        public final void mo7205g(float f, View view) {
            view.setRotationY(m6920a(f));
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class ScaleXset extends ViewSpline {
        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        /* JADX INFO: renamed from: g */
        public final void mo7205g(float f, View view) {
            view.setScaleX(m6920a(f));
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class ScaleYset extends ViewSpline {
        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        /* JADX INFO: renamed from: g */
        public final void mo7205g(float f, View view) {
            view.setScaleY(m6920a(f));
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class TranslationXset extends ViewSpline {
        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        /* JADX INFO: renamed from: g */
        public final void mo7205g(float f, View view) {
            view.setTranslationX(m6920a(f));
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class TranslationYset extends ViewSpline {
        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        /* JADX INFO: renamed from: g */
        public final void mo7205g(float f, View view) {
            view.setTranslationY(m6920a(f));
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class TranslationZset extends ViewSpline {
        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        /* JADX INFO: renamed from: g */
        public final void mo7205g(float f, View view) {
            view.setTranslationZ(m6920a(f));
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: f */
    public static ViewSpline m7204f(String str) {
        byte b2 = -1;
        switch (str.hashCode()) {
            case -1249320806:
                if (str.equals("rotationX")) {
                    b2 = 0;
                }
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    b2 = 1;
                }
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    b2 = 2;
                }
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    b2 = 3;
                }
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    b2 = 4;
                }
                break;
            case -1001078227:
                if (str.equals("progress")) {
                    b2 = 5;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    b2 = 6;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    b2 = 7;
                }
                break;
            case -797520672:
                if (str.equals("waveVariesBy")) {
                    b2 = 8;
                }
                break;
            case -760884510:
                if (str.equals("transformPivotX")) {
                    b2 = 9;
                }
                break;
            case -760884509:
                if (str.equals("transformPivotY")) {
                    b2 = 10;
                }
                break;
            case -40300674:
                if (str.equals("rotation")) {
                    b2 = Ascii.f42547VT;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    b2 = Ascii.f42536FF;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    b2 = Ascii.f42534CR;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    b2 = Ascii.f42544SO;
                }
                break;
            case 156108012:
                if (str.equals("waveOffset")) {
                    b2 = Ascii.f42543SI;
                }
                break;
        }
        switch (b2) {
            case 5:
                ProgressSet progressSet = new ProgressSet();
                progressSet.f22167f = false;
                break;
        }
        return new AlphaSet();
    }

    /* JADX INFO: renamed from: g */
    public abstract void mo7205g(float f, View view);

    /* JADX INFO: compiled from: Proguard */
    public static class PathRotate extends ViewSpline {
        @Override // androidx.constraintlayout.motion.utils.ViewSpline
        /* JADX INFO: renamed from: g */
        public final void mo7205g(float f, View view) {
        }
    }
}
