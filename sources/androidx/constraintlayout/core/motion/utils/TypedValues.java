package androidx.constraintlayout.core.motion.utils;

import com.engagelab.privates.common.observer.MTObservable;
import com.google.common.base.Ascii;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public interface TypedValues {

    /* JADX INFO: compiled from: Proguard */
    public interface AttributesType {
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX INFO: renamed from: a */
        static int m6935a(String str) {
            byte b2;
            str.getClass();
            switch (str.hashCode()) {
                case -1310311125:
                    b2 = !str.equals("easing") ? (byte) -1 : (byte) 0;
                    break;
                case -1249320806:
                    b2 = !str.equals("rotationX") ? (byte) -1 : (byte) 1;
                    break;
                case -1249320805:
                    b2 = !str.equals("rotationY") ? (byte) -1 : (byte) 2;
                    break;
                case -1249320804:
                    b2 = !str.equals("rotationZ") ? (byte) -1 : (byte) 3;
                    break;
                case -1225497657:
                    b2 = !str.equals("translationX") ? (byte) -1 : (byte) 4;
                    break;
                case -1225497656:
                    b2 = !str.equals("translationY") ? (byte) -1 : (byte) 5;
                    break;
                case -1225497655:
                    b2 = !str.equals("translationZ") ? (byte) -1 : (byte) 6;
                    break;
                case -1001078227:
                    b2 = !str.equals("progress") ? (byte) -1 : (byte) 7;
                    break;
                case -987906986:
                    b2 = !str.equals("pivotX") ? (byte) -1 : (byte) 8;
                    break;
                case -987906985:
                    b2 = !str.equals("pivotY") ? (byte) -1 : (byte) 9;
                    break;
                case -908189618:
                    b2 = !str.equals("scaleX") ? (byte) -1 : (byte) 10;
                    break;
                case -908189617:
                    b2 = !str.equals("scaleY") ? (byte) -1 : Ascii.f42547VT;
                    break;
                case -880905839:
                    b2 = !str.equals("target") ? (byte) -1 : Ascii.f42536FF;
                    break;
                case -4379043:
                    b2 = !str.equals("elevation") ? (byte) -1 : Ascii.f42534CR;
                    break;
                case 92909918:
                    b2 = !str.equals("alpha") ? (byte) -1 : Ascii.f42544SO;
                    break;
                case 97692013:
                    b2 = !str.equals("frame") ? (byte) -1 : Ascii.f42543SI;
                    break;
                case 579057826:
                    b2 = !str.equals("curveFit") ? (byte) -1 : Ascii.DLE;
                    break;
                case 803192288:
                    b2 = !str.equals("pathRotate") ? (byte) -1 : (byte) 17;
                    break;
                case 1167159411:
                    b2 = !str.equals("pivotTarget") ? (byte) -1 : Ascii.DC2;
                    break;
                case 1941332754:
                    b2 = !str.equals("visibility") ? (byte) -1 : (byte) 19;
                    break;
                default:
                    b2 = -1;
                    break;
            }
            switch (b2) {
                case 0:
                    return 317;
                case 1:
                    return 308;
                case 2:
                    return 309;
                case 3:
                    return 310;
                case 4:
                    return 304;
                case 5:
                    return 305;
                case 6:
                    return 306;
                case 7:
                    return 315;
                case 8:
                    return 313;
                case 9:
                    return 314;
                case 10:
                    return 311;
                case 11:
                    return 312;
                case TYPE_BYTES_VALUE:
                    return MTObservable.WHAT_OBSERVER;
                case 13:
                    return 307;
                case 14:
                    return 303;
                case 15:
                    return 100;
                case 16:
                    return 301;
                case 17:
                    return 316;
                case 18:
                    return 318;
                case 19:
                    return 302;
                default:
                    return -1;
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface Custom {
    }

    /* JADX INFO: compiled from: Proguard */
    public interface CycleType {
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX INFO: renamed from: a */
        static int m6936a(String str) {
            byte b2;
            str.getClass();
            switch (str.hashCode()) {
                case -1310311125:
                    b2 = !str.equals("easing") ? (byte) -1 : (byte) 0;
                    break;
                case -1249320806:
                    b2 = !str.equals("rotationX") ? (byte) -1 : (byte) 1;
                    break;
                case -1249320805:
                    b2 = !str.equals("rotationY") ? (byte) -1 : (byte) 2;
                    break;
                case -1249320804:
                    b2 = !str.equals("rotationZ") ? (byte) -1 : (byte) 3;
                    break;
                case -1225497657:
                    b2 = !str.equals("translationX") ? (byte) -1 : (byte) 4;
                    break;
                case -1225497656:
                    b2 = !str.equals("translationY") ? (byte) -1 : (byte) 5;
                    break;
                case -1225497655:
                    b2 = !str.equals("translationZ") ? (byte) -1 : (byte) 6;
                    break;
                case -1001078227:
                    b2 = !str.equals("progress") ? (byte) -1 : (byte) 7;
                    break;
                case -987906986:
                    b2 = !str.equals("pivotX") ? (byte) -1 : (byte) 8;
                    break;
                case -987906985:
                    b2 = !str.equals("pivotY") ? (byte) -1 : (byte) 9;
                    break;
                case -908189618:
                    b2 = !str.equals("scaleX") ? (byte) -1 : (byte) 10;
                    break;
                case -908189617:
                    b2 = !str.equals("scaleY") ? (byte) -1 : Ascii.f42547VT;
                    break;
                case 92909918:
                    b2 = !str.equals("alpha") ? (byte) -1 : Ascii.f42536FF;
                    break;
                case 579057826:
                    b2 = !str.equals("curveFit") ? (byte) -1 : Ascii.f42534CR;
                    break;
                case 803192288:
                    b2 = !str.equals("pathRotate") ? (byte) -1 : Ascii.f42544SO;
                    break;
                case 1941332754:
                    b2 = !str.equals("visibility") ? (byte) -1 : Ascii.f42543SI;
                    break;
                default:
                    b2 = -1;
                    break;
            }
            switch (b2) {
                case 0:
                    return 420;
                case 1:
                    return 308;
                case 2:
                    return 309;
                case 3:
                    return 310;
                case 4:
                    return 304;
                case 5:
                    return 305;
                case 6:
                    return 306;
                case 7:
                    return 315;
                case 8:
                    return 313;
                case 9:
                    return 314;
                case 10:
                    return 311;
                case 11:
                    return 312;
                case TYPE_BYTES_VALUE:
                    return 403;
                case 13:
                    return 401;
                case 14:
                    return 416;
                case 15:
                    return 402;
                default:
                    return -1;
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface MotionScene {
    }

    /* JADX INFO: compiled from: Proguard */
    public interface MotionType {
    }

    /* JADX INFO: compiled from: Proguard */
    public interface OnSwipe {
    }

    /* JADX INFO: compiled from: Proguard */
    public interface PositionType {
    }

    /* JADX INFO: compiled from: Proguard */
    public interface TransitionType {
    }

    /* JADX INFO: compiled from: Proguard */
    public interface TriggerType {
    }

    /* JADX INFO: renamed from: a */
    boolean mo6857a(int i, int i2);

    /* JADX INFO: renamed from: b */
    boolean mo6858b(int i, String str);

    /* JADX INFO: renamed from: c */
    boolean mo6859c(int i, boolean z2);

    /* JADX INFO: renamed from: d */
    boolean mo6860d(float f, int i);
}
