package androidx.compose.p013ui.graphics;

import android.graphics.BlendMode;
import android.graphics.PorterDuff;
import androidx.compose.foundation.layout.AbstractC0605a;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"ui-graphics_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class AndroidBlendMode_androidKt {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[AbstractC1220a.m5258b().length];
            try {
                AbstractC0605a.m2870a();
                iArr[AbstractC1220a.m5259c()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AbstractC0605a.m2883n();
                iArr[AbstractC1220a.m5263g()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AbstractC0605a.m2877h();
                iArr[AbstractC1220a.m5269m()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AbstractC0605a.m2876g();
                iArr[AbstractC1220a.m5271o()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AbstractC0605a.m2878i();
                iArr[AbstractC1220a.m5260d()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AbstractC0605a.m2879j();
                iArr[AbstractC1220a.m5272p()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AbstractC0605a.m2880k();
                iArr[AbstractC1220a.m5273q()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AbstractC0605a.m2881l();
                iArr[AbstractC1220a.m5274r()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                AbstractC0605a.m2882m();
                iArr[AbstractC1220a.m5275s()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                AbstractC0605a.m2884o();
                iArr[AbstractC1220a.m5276t()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                AbstractC0605a.m2874e();
                iArr[AbstractC1220a.m5277u()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                AbstractC0605a.m2885p();
                iArr[AbstractC1220a.m5278v()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                AbstractC0605a.m2886q();
                iArr[AbstractC1220a.m5279w()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                AbstractC0605a.m2887r();
                iArr[AbstractC1220a.m5257a()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                AbstractC0605a.m2888s();
                iArr[AbstractC1220a.m5270n()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                AbstractC0605a.m2889t();
                iArr[AbstractC1220a.m5280x()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                AbstractC0605a.m2890u();
                iArr[AbstractC1220a.m5281y()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                AbstractC0605a.m2891v();
                iArr[AbstractC1220a.m5282z()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                AbstractC0605a.m2892w();
                iArr[AbstractC1220a.m5253A()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                AbstractC0605a.m2872c();
                iArr[AbstractC1220a.m5254B()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                AbstractC0605a.m2893x();
                iArr[AbstractC1220a.m5255C()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                AbstractC0605a.m2894y();
                iArr[AbstractC1220a.m5256D()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                AbstractC0605a.m2895z();
                iArr[AbstractC1220a.m5261e()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                AbstractC0605a.m2866A();
                iArr[AbstractC1220a.m5262f()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                AbstractC0605a.m2867B();
                iArr[AbstractC1220a.m5264h()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                AbstractC0605a.m2868C();
                iArr[AbstractC1220a.m5265i()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                AbstractC0605a.m2869D();
                iArr[AbstractC1220a.m5266j()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                AbstractC0605a.m2873d();
                iArr[AbstractC1220a.m5267k()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                AbstractC0605a.m2875f();
                iArr[AbstractC1220a.m5268l()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static final BlendMode m5088a(int i) {
        return i == 0 ? AbstractC0605a.m2870a() : i == 1 ? AbstractC0605a.m2883n() : i == 2 ? AbstractC0605a.m2877h() : i == 3 ? AbstractC0605a.m2876g() : i == 4 ? AbstractC0605a.m2878i() : i == 5 ? AbstractC0605a.m2879j() : i == 6 ? AbstractC0605a.m2880k() : i == 7 ? AbstractC0605a.m2881l() : i == 8 ? AbstractC0605a.m2882m() : i == 9 ? AbstractC0605a.m2884o() : i == 10 ? AbstractC0605a.m2874e() : i == 11 ? AbstractC0605a.m2885p() : i == 12 ? AbstractC0605a.m2886q() : i == 13 ? AbstractC0605a.m2887r() : i == 14 ? AbstractC0605a.m2888s() : i == 15 ? AbstractC0605a.m2889t() : i == 16 ? AbstractC0605a.m2890u() : i == 17 ? AbstractC0605a.m2891v() : i == 18 ? AbstractC0605a.m2892w() : i == 19 ? AbstractC0605a.m2872c() : i == 20 ? AbstractC0605a.m2893x() : i == 21 ? AbstractC0605a.m2894y() : i == 22 ? AbstractC0605a.m2895z() : i == 23 ? AbstractC0605a.m2866A() : i == 24 ? AbstractC0605a.m2867B() : i == 25 ? AbstractC0605a.m2868C() : i == 26 ? AbstractC0605a.m2869D() : i == 27 ? AbstractC0605a.m2873d() : i == 28 ? AbstractC0605a.m2875f() : AbstractC0605a.m2876g();
    }

    /* JADX INFO: renamed from: b */
    public static final PorterDuff.Mode m5089b(int i) {
        return i == 0 ? PorterDuff.Mode.CLEAR : i == 1 ? PorterDuff.Mode.SRC : i == 2 ? PorterDuff.Mode.DST : i == 3 ? PorterDuff.Mode.SRC_OVER : i == 4 ? PorterDuff.Mode.DST_OVER : i == 5 ? PorterDuff.Mode.SRC_IN : i == 6 ? PorterDuff.Mode.DST_IN : i == 7 ? PorterDuff.Mode.SRC_OUT : i == 8 ? PorterDuff.Mode.DST_OUT : i == 9 ? PorterDuff.Mode.SRC_ATOP : i == 10 ? PorterDuff.Mode.DST_ATOP : i == 11 ? PorterDuff.Mode.XOR : i == 12 ? PorterDuff.Mode.ADD : i == 14 ? PorterDuff.Mode.SCREEN : i == 15 ? PorterDuff.Mode.OVERLAY : i == 16 ? PorterDuff.Mode.DARKEN : i == 17 ? PorterDuff.Mode.LIGHTEN : i == 13 ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }
}
