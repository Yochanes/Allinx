package com.exchange.kline;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.exchange.allin.p024ui.page.spot.C3499s;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Marker;
import p001A.AbstractC0000a;
import p007I.RunnableC0015a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18301d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0012\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0003#$%J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\r\u0010\fJ\u0015\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0011J\u0015\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b\u0018\u0010\u0011J\u0015\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u000e¢\u0006\u0004\b\u001a\u0010\u0011J\u0015\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0014¢\u0006\u0004\b\u001c\u0010\u0017R$\u0010\"\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u00148\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006&"}, m18302d2 = {"Lcom/exchange/kline/KLineView;", "Landroid/view/View;", "Landroid/view/View$OnTouchListener;", "Landroid/os/Handler$Callback;", "Lcom/exchange/kline/KLineView$OnRequestDataListListener;", "requestListener", "", "setOnRequestDataListListener", "(Lcom/exchange/kline/KLineView$OnRequestDataListListener;)V", "", "Lcom/exchange/kline/KData;", "getTotalDataList", "()Ljava/util/List;", "getViewDataList", "", "num", "setFixed", "(I)V", "type", "setMainImgType", "", "showState", "setDeputyPicShow", "(Z)V", "setDeputyImgType", "moveMode", "setCrossHairMoveMode", "state", "setShowInstant", "value", "f", "Z", "getVicePicShow", "()Z", "vicePicShow", "OnRequestDataListListener", "CustomGestureListener", "Companion", "kline_release"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
@SourceDebugExtension
public final class KLineView extends View implements View.OnTouchListener, Handler.Callback {

    /* JADX INFO: renamed from: Y1 */
    public static final /* synthetic */ int f41838Y1 = 0;

    /* JADX INFO: renamed from: A */
    public final String f41839A;

    /* JADX INFO: renamed from: A0 */
    public final int f41840A0;

    /* JADX INFO: renamed from: A1 */
    public double f41841A1;

    /* JADX INFO: renamed from: B */
    public final String f41842B;

    /* JADX INFO: renamed from: B0 */
    public final int f41843B0;

    /* JADX INFO: renamed from: B1 */
    public double f41844B1;

    /* JADX INFO: renamed from: C */
    public final String f41845C;

    /* JADX INFO: renamed from: C0 */
    public final int f41846C0;

    /* JADX INFO: renamed from: C1 */
    public double f41847C1;

    /* JADX INFO: renamed from: D */
    public final String f41848D;

    /* JADX INFO: renamed from: D0 */
    public final int f41849D0;

    /* JADX INFO: renamed from: D1 */
    public double f41850D1;

    /* JADX INFO: renamed from: E */
    public final String f41851E;

    /* JADX INFO: renamed from: E0 */
    public final int f41852E0;

    /* JADX INFO: renamed from: E1 */
    public double f41853E1;

    /* JADX INFO: renamed from: F */
    public final String f41854F;

    /* JADX INFO: renamed from: F0 */
    public final int f41855F0;

    /* JADX INFO: renamed from: F1 */
    public double f41856F1;

    /* JADX INFO: renamed from: G */
    public final String f41857G;

    /* JADX INFO: renamed from: G0 */
    public final int f41858G0;

    /* JADX INFO: renamed from: G1 */
    public double f41859G1;

    /* JADX INFO: renamed from: H */
    public final String f41860H;

    /* JADX INFO: renamed from: H0 */
    public final int f41861H0;

    /* JADX INFO: renamed from: H1 */
    public double f41862H1;

    /* JADX INFO: renamed from: I */
    public final String f41863I;

    /* JADX INFO: renamed from: I0 */
    public final int f41864I0;

    /* JADX INFO: renamed from: I1 */
    public double f41865I1;

    /* JADX INFO: renamed from: J */
    public final String f41866J;

    /* JADX INFO: renamed from: J0 */
    public final int f41867J0;

    /* JADX INFO: renamed from: J1 */
    public double f41868J1;

    /* JADX INFO: renamed from: K */
    public final Paint f41869K;

    /* JADX INFO: renamed from: K0 */
    public final int f41870K0;

    /* JADX INFO: renamed from: K1 */
    public double f41871K1;

    /* JADX INFO: renamed from: L */
    public final Paint f41872L;

    /* JADX INFO: renamed from: L0 */
    public final int f41873L0;

    /* JADX INFO: renamed from: L1 */
    public double f41874L1;

    /* JADX INFO: renamed from: M */
    public final Paint f41875M;

    /* JADX INFO: renamed from: M0 */
    public final int f41876M0;

    /* JADX INFO: renamed from: M1 */
    public double f41877M1;

    /* JADX INFO: renamed from: N */
    public final Paint f41878N;

    /* JADX INFO: renamed from: N0 */
    public final int f41879N0;

    /* JADX INFO: renamed from: N1 */
    public double f41880N1;

    /* JADX INFO: renamed from: O */
    public final Paint f41881O;

    /* JADX INFO: renamed from: O0 */
    public final int f41882O0;

    /* JADX INFO: renamed from: O1 */
    public double f41883O1;

    /* JADX INFO: renamed from: P */
    public final Path f41884P;

    /* JADX INFO: renamed from: P0 */
    public final int f41885P0;

    /* JADX INFO: renamed from: P1 */
    public double f41886P1;

    /* JADX INFO: renamed from: Q */
    public final Path f41887Q;

    /* JADX INFO: renamed from: Q0 */
    public final int f41888Q0;

    /* JADX INFO: renamed from: Q1 */
    public double f41889Q1;

    /* JADX INFO: renamed from: R */
    public final Rect f41890R;

    /* JADX INFO: renamed from: R0 */
    public final int f41891R0;

    /* JADX INFO: renamed from: R1 */
    public double f41892R1;

    /* JADX INFO: renamed from: S */
    public final Rect f41893S;

    /* JADX INFO: renamed from: S0 */
    public final int f41894S0;

    /* JADX INFO: renamed from: S1 */
    public double f41895S1;

    /* JADX INFO: renamed from: T */
    public final Rect f41896T;

    /* JADX INFO: renamed from: T0 */
    public final int f41897T0;

    /* JADX INFO: renamed from: T1 */
    public double f41898T1;

    /* JADX INFO: renamed from: U */
    public final Rect f41899U;

    /* JADX INFO: renamed from: U0 */
    public final int f41900U0;

    /* JADX INFO: renamed from: U1 */
    public double f41901U1;

    /* JADX INFO: renamed from: V */
    public final String[] f41902V;

    /* JADX INFO: renamed from: V0 */
    public final int f41903V0;

    /* JADX INFO: renamed from: V1 */
    public int f41904V1;

    /* JADX INFO: renamed from: W */
    public final ArrayList f41905W;

    /* JADX INFO: renamed from: W0 */
    public final int f41906W0;

    /* JADX INFO: renamed from: W1 */
    public final ArrayList f41907W1;

    /* JADX INFO: renamed from: X0 */
    public final int f41908X0;

    /* JADX INFO: renamed from: X1 */
    public boolean f41909X1;

    /* JADX INFO: renamed from: Y0 */
    public final int f41910Y0;

    /* JADX INFO: renamed from: Z0 */
    public final int f41911Z0;

    /* JADX INFO: renamed from: a */
    public int f41912a;

    /* JADX INFO: renamed from: a0 */
    public final ArrayList f41913a0;

    /* JADX INFO: renamed from: a1 */
    public final int f41914a1;

    /* JADX INFO: renamed from: b */
    public final int f41915b;

    /* JADX INFO: renamed from: b0 */
    public final ArrayList f41916b0;

    /* JADX INFO: renamed from: b1 */
    public final int f41917b1;

    /* JADX INFO: renamed from: c */
    public final int f41918c;

    /* JADX INFO: renamed from: c0 */
    public final ArrayList f41919c0;

    /* JADX INFO: renamed from: c1 */
    public float f41920c1;

    /* JADX INFO: renamed from: d */
    public int f41921d;

    /* JADX INFO: renamed from: d0 */
    public final ArrayList f41922d0;

    /* JADX INFO: renamed from: d1 */
    public float f41923d1;

    /* JADX INFO: renamed from: e0 */
    public final ArrayList f41924e0;

    /* JADX INFO: renamed from: e1 */
    public float f41925e1;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public boolean vicePicShow;

    /* JADX INFO: renamed from: f0 */
    public final CopyOnWriteArrayList f41927f0;

    /* JADX INFO: renamed from: f1 */
    public float f41928f1;

    /* JADX INFO: renamed from: g */
    public boolean f41929g;

    /* JADX INFO: renamed from: g0 */
    public final CopyOnWriteArrayList f41930g0;

    /* JADX INFO: renamed from: g1 */
    public float f41931g1;

    /* JADX INFO: renamed from: h0 */
    public final CopyOnWriteArrayList f41932h0;

    /* JADX INFO: renamed from: h1 */
    public float f41933h1;

    /* JADX INFO: renamed from: i */
    public boolean f41934i;

    /* JADX INFO: renamed from: i0 */
    public final CopyOnWriteArrayList f41935i0;

    /* JADX INFO: renamed from: i1 */
    public float f41936i1;

    /* JADX INFO: renamed from: j */
    public final int f41937j;

    /* JADX INFO: renamed from: j0 */
    public final CopyOnWriteArrayList f41938j0;

    /* JADX INFO: renamed from: j1 */
    public float f41939j1;

    /* JADX INFO: renamed from: k0 */
    public final CopyOnWriteArrayList f41940k0;

    /* JADX INFO: renamed from: k1 */
    public float f41941k1;

    /* JADX INFO: renamed from: l0 */
    public final CopyOnWriteArrayList f41942l0;

    /* JADX INFO: renamed from: l1 */
    public final float f41943l1;

    /* JADX INFO: renamed from: m0 */
    public final CopyOnWriteArrayList f41944m0;

    /* JADX INFO: renamed from: m1 */
    public float f41945m1;

    /* JADX INFO: renamed from: n */
    public boolean f41946n;

    /* JADX INFO: renamed from: n0 */
    public KData f41947n0;

    /* JADX INFO: renamed from: n1 */
    public float f41948n1;

    /* JADX INFO: renamed from: o */
    public boolean f41949o;

    /* JADX INFO: renamed from: o0 */
    public OnRequestDataListListener f41950o0;

    /* JADX INFO: renamed from: o1 */
    public float f41951o1;

    /* JADX INFO: renamed from: p */
    public boolean f41952p;

    /* JADX INFO: renamed from: p0 */
    public final QuotaThread f41953p0;

    /* JADX INFO: renamed from: p1 */
    public float f41954p1;

    /* JADX INFO: renamed from: q */
    public boolean f41955q;

    /* JADX INFO: renamed from: q0 */
    public final KLineView$initStopDelay$1 f41956q0;

    /* JADX INFO: renamed from: q1 */
    public float f41957q1;

    /* JADX INFO: renamed from: r */
    public int f41958r;

    /* JADX INFO: renamed from: r0 */
    public final RunnableC0015a f41959r0;

    /* JADX INFO: renamed from: r1 */
    public float f41960r1;

    /* JADX INFO: renamed from: s */
    public int f41961s;

    /* JADX INFO: renamed from: s0 */
    public final GestureDetector f41962s0;

    /* JADX INFO: renamed from: s1 */
    public float f41963s1;

    /* JADX INFO: renamed from: t */
    public int f41964t;

    /* JADX INFO: renamed from: t0 */
    public final int f41965t0;

    /* JADX INFO: renamed from: t1 */
    public float f41966t1;

    /* JADX INFO: renamed from: u */
    public final String f41967u;

    /* JADX INFO: renamed from: u0 */
    public final int f41968u0;

    /* JADX INFO: renamed from: u1 */
    public float f41969u1;

    /* JADX INFO: renamed from: v */
    public final String f41970v;

    /* JADX INFO: renamed from: v0 */
    public final int f41971v0;

    /* JADX INFO: renamed from: v1 */
    public float f41972v1;

    /* JADX INFO: renamed from: w */
    public final String f41973w;

    /* JADX INFO: renamed from: w0 */
    public final int f41974w0;

    /* JADX INFO: renamed from: w1 */
    public float f41975w1;

    /* JADX INFO: renamed from: x */
    public final String f41976x;

    /* JADX INFO: renamed from: x0 */
    public final int f41977x0;

    /* JADX INFO: renamed from: x1 */
    public float f41978x1;

    /* JADX INFO: renamed from: y */
    public final String f41979y;

    /* JADX INFO: renamed from: y0 */
    public final int f41980y0;

    /* JADX INFO: renamed from: y1 */
    public float f41981y1;

    /* JADX INFO: renamed from: z */
    public final String f41982z;

    /* JADX INFO: renamed from: z0 */
    public final int f41983z0;

    /* JADX INFO: renamed from: z1 */
    public double f41984z1;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0004¨\u0006\u000e"}, m18302d2 = {"Lcom/exchange/kline/KLineView$Companion;", "", "", "MAIN_IMG_MA", "I", "MAIN_IMG_EMA", "MAIN_IMG_BOLL", "DEPUTY_IMG_VOLUME", "DEPUTY_IMG_MACD", "DEPUTY_IMG_KDJ", "DEPUTY_IMG_RSI", "CROSS_HAIR_MOVE_CLOSE", "CROSS_HAIR_MOVE_OPEN", "CROSS_HAIR_MOVE_FREE", "kline_release"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/kline/KLineView$CustomGestureListener;", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "kline_release"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public final class CustomGestureListener extends GestureDetector.SimpleOnGestureListener {
        public CustomGestureListener() {
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0023 A[PHI: r4
          0x0023: PHI (r4v5 float) = (r4v2 float), (r4v3 float) binds: [B:7:0x0021, B:10:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean onFling(MotionEvent e1, MotionEvent e2, float f, float f2) {
            Intrinsics.m18599g(e1, "e1");
            Intrinsics.m18599g(e2, "e2");
            KLineView kLineView = KLineView.this;
            int i = kLineView.f41912a;
            if (i > 0 && i < (kLineView.f41905W.size() - 1) - kLineView.f41921d) {
                float f3 = 8000.0f;
                if (f > 8000.0f) {
                    f = f3;
                    kLineView.f41957q1 = f;
                    kLineView.post(kLineView.f41956q0);
                } else {
                    f3 = -8000.0f;
                    if (f < -8000.0f) {
                    }
                    kLineView.f41957q1 = f;
                    kLineView.post(kLineView.f41956q0);
                }
            }
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x006f  */
        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean onScroll(MotionEvent e1, MotionEvent e2, float f, float f2) {
            Intrinsics.m18599g(e1, "e1");
            Intrinsics.m18599g(e2, "e2");
            KLineView kLineView = KLineView.this;
            int i = kLineView.f41912a;
            ArrayList arrayList = kLineView.f41913a0;
            if (i != 0 || f >= 0.0f) {
                ArrayList arrayList2 = kLineView.f41905W;
                if ((i != arrayList2.size() - kLineView.f41921d || f <= 0.0f) && kLineView.f41912a >= 0 && arrayList.size() >= kLineView.f41921d) {
                    kLineView.f41929g = false;
                    if (Math.abs(f) > 1.0f) {
                        if (kLineView.f41921d < 60) {
                            kLineView.m14275s(10.0d, f);
                        } else {
                            kLineView.m14275s(3.5d, f);
                        }
                        if (kLineView.f41912a < 0) {
                            kLineView.f41912a = 0;
                        }
                        int size = arrayList2.size();
                        int i2 = kLineView.f41912a;
                        int i3 = size - kLineView.f41921d;
                        if (i2 > i3) {
                            kLineView.f41912a = i3;
                        }
                        kLineView.m14271o();
                        kLineView.m14274r();
                        kLineView.invalidate();
                        return true;
                    }
                } else if (kLineView.f41929g) {
                    kLineView.f41929g = false;
                    if (!arrayList.isEmpty()) {
                        kLineView.f41947n0 = (KData) AbstractC0000a.m8e(1, arrayList);
                    }
                    kLineView.invalidate();
                }
            }
            return true;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/kline/KLineView$OnRequestDataListListener;", "", "kline_release"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public interface OnRequestDataListListener {
        /* JADX INFO: renamed from: a */
        void mo13851a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KLineView(Context context) {
        super(context, null, 0);
        Intrinsics.m18599g(context, "context");
        this.f41915b = 18;
        this.f41918c = 140;
        this.f41921d = 34;
        this.f41937j = 300;
        this.f41949o = true;
        this.f41961s = 1;
        this.f41967u = "MA(5):";
        this.f41970v = "MA(10):";
        this.f41973w = "MA(30):";
        this.f41976x = "Vol:";
        this.f41979y = "MACD(12,26,9)";
        this.f41982z = "MACD:";
        this.f41839A = "DIF:";
        this.f41842B = "DEA:";
        this.f41845C = "KDJ(9,3,3)";
        this.f41848D = "K:";
        this.f41851E = "D:";
        this.f41854F = "J:";
        this.f41857G = "RSI(6,12,24)";
        this.f41860H = "RS1:";
        this.f41863I = "RS2:";
        this.f41866J = "RS3:";
        this.f41890R = new Rect();
        this.f41893S = new Rect();
        this.f41896T = new Rect();
        this.f41899U = new Rect();
        this.f41902V = new String[0];
        this.f41905W = new ArrayList();
        this.f41913a0 = new ArrayList();
        this.f41916b0 = new ArrayList();
        this.f41919c0 = new ArrayList();
        this.f41922d0 = new ArrayList();
        this.f41924e0 = new ArrayList();
        this.f41927f0 = new CopyOnWriteArrayList();
        this.f41930g0 = new CopyOnWriteArrayList();
        this.f41932h0 = new CopyOnWriteArrayList();
        this.f41935i0 = new CopyOnWriteArrayList();
        this.f41938j0 = new CopyOnWriteArrayList();
        this.f41940k0 = new CopyOnWriteArrayList();
        this.f41942l0 = new CopyOnWriteArrayList();
        this.f41944m0 = new CopyOnWriteArrayList();
        this.f41907W1 = new ArrayList();
        this.f41909X1 = true;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, R.styleable.f42114a);
        Intrinsics.m18598f(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f41873L0 = typedArrayObtainStyledAttributes.getColor(34, -1184275);
        this.f41849D0 = typedArrayObtainStyledAttributes.getColor(0, -6574915);
        this.f41882O0 = typedArrayObtainStyledAttributes.getInt(1, 8);
        this.f41852E0 = typedArrayObtainStyledAttributes.getColor(21, this.f41849D0);
        this.f41908X0 = typedArrayObtainStyledAttributes.getInt(22, this.f41882O0);
        this.f41911Z0 = typedArrayObtainStyledAttributes.getInt(35, 10);
        this.f41965t0 = typedArrayObtainStyledAttributes.getColor(24, -10763393);
        this.f41968u0 = typedArrayObtainStyledAttributes.getColor(23, -1090725);
        this.f41971v0 = typedArrayObtainStyledAttributes.getColor(27, -1001205);
        this.f41974w0 = typedArrayObtainStyledAttributes.getColor(25, -1556299);
        this.f41977x0 = typedArrayObtainStyledAttributes.getColor(26, -7640892);
        this.f41980y0 = typedArrayObtainStyledAttributes.getColor(28, -16777216);
        this.f41891R0 = typedArrayObtainStyledAttributes.getColor(29, -1);
        this.f41897T0 = typedArrayObtainStyledAttributes.getInt(30, 8);
        this.f41983z0 = typedArrayObtainStyledAttributes.getColor(31, this.f41980y0);
        this.f41894S0 = typedArrayObtainStyledAttributes.getColor(32, this.f41891R0);
        this.f41900U0 = typedArrayObtainStyledAttributes.getInt(33, 8);
        this.f41840A0 = typedArrayObtainStyledAttributes.getColor(38, -6574915);
        this.f41885P0 = typedArrayObtainStyledAttributes.getInt(39, 10);
        typedArrayObtainStyledAttributes.getColor(37, this.f41971v0);
        typedArrayObtainStyledAttributes.getColor(36, this.f41974w0);
        typedArrayObtainStyledAttributes.getColor(20, this.f41840A0);
        this.f41843B0 = typedArrayObtainStyledAttributes.getColor(19, this.f41965t0);
        this.f41846C0 = typedArrayObtainStyledAttributes.getColor(18, this.f41968u0);
        typedArrayObtainStyledAttributes.getColor(15, this.f41974w0);
        typedArrayObtainStyledAttributes.getColor(10, this.f41977x0);
        typedArrayObtainStyledAttributes.getColor(17, this.f41971v0);
        typedArrayObtainStyledAttributes.getColor(9, this.f41974w0);
        typedArrayObtainStyledAttributes.getColor(16, this.f41977x0);
        typedArrayObtainStyledAttributes.getColor(5, -8221022);
        this.f41855F0 = typedArrayObtainStyledAttributes.getColor(6, -16777216);
        this.f41861H0 = typedArrayObtainStyledAttributes.getColor(7, -1);
        this.f41864I0 = typedArrayObtainStyledAttributes.getColor(7, -16777216);
        this.f41903V0 = typedArrayObtainStyledAttributes.getInt(8, 8);
        this.f41858G0 = typedArrayObtainStyledAttributes.getColor(2, this.f41980y0);
        this.f41888Q0 = typedArrayObtainStyledAttributes.getColor(3, -1);
        this.f41906W0 = typedArrayObtainStyledAttributes.getInt(4, 8);
        this.f41867J0 = typedArrayObtainStyledAttributes.getColor(12, -4865840);
        this.f41870K0 = typedArrayObtainStyledAttributes.getColor(13, -8351842);
        this.f41910Y0 = typedArrayObtainStyledAttributes.getInt(14, 10);
        this.f41876M0 = typedArrayObtainStyledAttributes.getColor(11, -419430401);
        typedArrayObtainStyledAttributes.recycle();
        setOnTouchListener(this);
        setClickable(true);
        setFocusable(true);
        this.f41962s0 = new GestureDetector(getContext(), new CustomGestureListener());
        this.f41917b1 = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f41879N0 = m14260b(103.0f);
        this.f41914a1 = m14260b(130.0f);
        this.f41943l1 = (r1 - m14260b(4.0f)) / 9;
        this.f41902V = new String[]{"Time", "Open", "High", "Low", "Close", "Chg", "%Chg", "Volume", "Turnover"};
        Handler handler = new Handler(this);
        QuotaThread quotaThread = new QuotaThread("quotaThread", 10);
        this.f41953p0 = quotaThread;
        quotaThread.f42111a = handler;
        quotaThread.start();
        this.f41956q0 = new KLineView$initStopDelay$1(this);
        Paint paint = new Paint();
        this.f41869K = paint;
        paint.setAntiAlias(true);
        Paint paint2 = this.f41869K;
        Intrinsics.m18596d(paint2);
        paint2.setTextSize(m14276t(this.f41882O0));
        Paint paint3 = this.f41869K;
        Intrinsics.m18596d(paint3);
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        Paint paint4 = new Paint();
        this.f41872L = paint4;
        paint4.setAntiAlias(true);
        Paint paint5 = this.f41872L;
        Intrinsics.m18596d(paint5);
        Paint.Style style2 = Paint.Style.FILL;
        paint5.setStyle(style2);
        Paint paint6 = new Paint();
        this.f41875M = paint6;
        paint6.setAntiAlias(true);
        Paint paint7 = this.f41875M;
        Intrinsics.m18596d(paint7);
        paint7.setStyle(style2);
        Paint paint8 = new Paint();
        this.f41878N = paint8;
        paint8.setAntiAlias(true);
        Paint paint9 = this.f41878N;
        Intrinsics.m18596d(paint9);
        paint9.setTextSize(m14276t(this.f41882O0));
        Paint paint10 = this.f41878N;
        Intrinsics.m18596d(paint10);
        paint10.setStyle(style2);
        Paint paint11 = new Paint();
        this.f41881O = paint11;
        paint11.setAntiAlias(true);
        Paint paint12 = this.f41881O;
        Intrinsics.m18596d(paint12);
        paint12.setTextSize(m14276t(this.f41882O0));
        Paint paint13 = this.f41881O;
        Intrinsics.m18596d(paint13);
        paint13.setStyle(style);
        Paint paint14 = this.f41881O;
        Intrinsics.m18596d(paint14);
        paint14.setColor(-16777216);
        Paint paint15 = this.f41881O;
        Intrinsics.m18596d(paint15);
        paint15.setStrokeWidth(m14260b(1.0f));
        Paint paint16 = this.f41881O;
        Intrinsics.m18596d(paint16);
        paint16.setPathEffect(new DashPathEffect(new float[]{10.0f, 10.0f}, 0.0f));
        this.f41884P = new Path();
        this.f41887Q = new Path();
        this.f41959r0 = new RunnableC0015a(this, 17);
    }

    /* JADX INFO: renamed from: i */
    public static String m14257i(long j) {
        if (j <= 0) {
            return "";
        }
        String str = new SimpleDateFormat("yyyy-MM-dd HH:mm").format(new Date(j));
        Intrinsics.m18598f(str, "format(...)");
        return str;
    }

    /* JADX INFO: renamed from: k */
    public static String m14258k(KLineView kLineView, double d, int i, int i2) {
        RoundingMode roundingMode = RoundingMode.DOWN;
        kLineView.getClass();
        Intrinsics.m18599g(roundingMode, "roundingMode");
        if (i < 0 || i > i2) {
            throw new IllegalArgumentException();
        }
        DecimalFormat decimalFormat = new DecimalFormat(AbstractC0000a.m13j(",", "##0." + CollectionsKt.m18409J(RangesKt.m18664k(0, i), "", null, null, new C3499s(20), 30) + CollectionsKt.m18409J(RangesKt.m18664k(i, i2), "", null, null, new C3499s(21), 30)));
        decimalFormat.setRoundingMode(roundingMode);
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
        decimalFormatSymbols.setDecimalSeparator('.');
        decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
        String str = decimalFormat.format(d * 1.0d);
        Intrinsics.m18596d(str);
        for (int iM20444t = StringsKt.m20444t(str); -1 < iM20444t; iM20444t--) {
            if (str.charAt(iM20444t) != '.') {
                String strSubstring = str.substring(0, iM20444t + 1);
                Intrinsics.m18598f(strSubstring, "substring(...)");
                return strSubstring;
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: a */
    public final void m14259a(KData data) {
        Intrinsics.m18599g(data, "data");
        ArrayList arrayList = this.f41916b0;
        arrayList.clear();
        ArrayList arrayList2 = this.f41905W;
        arrayList.addAll(arrayList2.subList(arrayList2.size() >= 30 ? arrayList2.size() - 30 : 0, arrayList2.size()));
        arrayList.add(data);
        QuotaThread quotaThread = this.f41953p0;
        if (quotaThread != null) {
            quotaThread.m14295b(arrayList);
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m14260b(float f) {
        return (int) ((f * getContext().getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* JADX INFO: renamed from: c */
    public final void m14261c(Canvas canvas) {
        int i;
        int i2;
        ArrayList arrayList = this.f41907W1;
        arrayList.clear();
        m14273q(this.f41849D0, this.f41882O0);
        ArrayList arrayList2 = this.f41924e0;
        int size = arrayList2.size();
        int i3 = 0;
        int i4 = 0;
        while (i4 < size) {
            ArrayList arrayList3 = this.f41913a0;
            if (i4 == 0) {
                i = i4;
                if (((KData) arrayList3.get(i3)).f41806B <= (this.f41862H1 / ((double) 2)) + ((Number) arrayList2.get(i3)).doubleValue() && ((KData) arrayList3.get(0)).f41807C > ((Number) arrayList2.get(0)).floatValue()) {
                    String strM14257i = m14257i(((KData) arrayList3.get(0)).f41812a);
                    float fM14260b = this.f41920c1 + m14260b(6.0f);
                    float fM14260b2 = this.f41928f1 - m14260b(7.0f);
                    Paint paint = this.f41878N;
                    Intrinsics.m18596d(paint);
                    canvas.drawText(strM14257i, fM14260b, fM14260b2, paint);
                    i2 = i;
                }
                i4 = i2 + 1;
                i3 = 0;
            } else {
                i = i4;
            }
            i2 = i;
            if (i2 == arrayList2.size() - 1) {
                String strM14257i2 = m14257i(((KData) AbstractC0000a.m8e(1, arrayList3)).f41812a);
                float fM14260b3 = this.f41925e1 - m14260b(41.0f);
                Paint paint2 = this.f41878N;
                Intrinsics.m18596d(paint2);
                float fMeasureText = fM14260b3 - paint2.measureText(strM14257i2);
                float fM14260b4 = this.f41928f1 - m14260b(7.0f);
                Paint paint3 = this.f41878N;
                Intrinsics.m18596d(paint3);
                canvas.drawText(strM14257i2, fMeasureText, fM14260b4, paint3);
            } else {
                int i5 = 0;
                for (Object obj : arrayList3) {
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        CollectionsKt.m18455s0();
                        throw null;
                    }
                    KData kData = (KData) obj;
                    if (kData.f41806B <= ((Number) arrayList2.get(i2)).floatValue() && kData.f41807C >= ((Number) arrayList2.get(i2)).floatValue()) {
                        String strM14257i3 = m14257i(kData.f41812a);
                        arrayList.add(strM14257i3);
                        if (arrayList.size() == 2) {
                            float fFloatValue = ((Number) arrayList2.get(i2)).floatValue();
                            Paint paint4 = this.f41878N;
                            Intrinsics.m18596d(paint4);
                            float fMeasureText2 = fFloatValue - (paint4.measureText(strM14257i3) / 2);
                            float fM14260b5 = this.f41928f1 - m14260b(7.0f);
                            Paint paint5 = this.f41878N;
                            Intrinsics.m18596d(paint5);
                            canvas.drawText(strM14257i3, fMeasureText2, fM14260b5, paint5);
                        }
                    }
                    i5 = i6;
                }
            }
            i4 = i2 + 1;
            i3 = 0;
        }
        KData kData2 = this.f41947n0;
        if (kData2 != null) {
            float f = (float) kData2.f41809E;
            RectF rectF = new RectF(this.f41925e1 - m14260b(38.0f), f - m14260b(7.0f), this.f41925e1 - m14260b(1.0f), m14260b(7.0f) + f);
            RectF rectF2 = new RectF(rectF.left, rectF.top, rectF.right, rectF.bottom);
            Paint paint6 = new Paint();
            paint6.setColor(-1);
            paint6.setStyle(Paint.Style.FILL);
            canvas.drawRoundRect(rectF2, m14260b(4.0f), m14260b(4.0f), paint6);
            Paint paint7 = new Paint();
            paint7.setColor(-16777216);
            paint7.setStyle(Paint.Style.STROKE);
            paint7.setStrokeWidth(1.0f);
            canvas.drawRoundRect(rectF, m14260b(4.0f), m14260b(4.0f), paint7);
            KData kData3 = this.f41947n0;
            Intrinsics.m18596d(kData3);
            if (kData3.m14255a() > 0.0d) {
                Paint paint8 = this.f41872L;
                Intrinsics.m18596d(paint8);
                paint8.setColor(this.f41965t0);
            } else {
                Paint paint9 = this.f41872L;
                Intrinsics.m18596d(paint9);
                paint9.setColor(this.f41968u0);
            }
            KData kData4 = this.f41947n0;
            Intrinsics.m18596d(kData4);
            int i7 = this.f41904V1;
            String strM14258k = m14258k(this, kData4.f41814c, i7, i7);
            Rect rect = new Rect();
            m14273q(this.f41864I0, this.f41903V0);
            Paint paint10 = this.f41878N;
            Intrinsics.m18596d(paint10);
            paint10.getTextBounds(strM14258k, 0, strM14258k.length(), rect);
            float f2 = 2;
            float fWidth = ((rectF2.width() - rect.width()) / f2) + rectF2.left;
            float fM14260b6 = (f + m14260b(7.0f)) - ((rectF2.height() - rect.height()) / f2);
            Paint paint11 = this.f41878N;
            Intrinsics.m18596d(paint11);
            canvas.drawText(strM14258k, fWidth, fM14260b6, paint11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00c8  */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m14262d(Canvas canvas) {
        int i;
        int i2;
        Paint paint;
        Path path;
        CopyOnWriteArrayList copyOnWriteArrayList;
        int i3 = this.f41977x0;
        int i4 = this.f41974w0;
        int i5 = this.f41971v0;
        Paint paint2 = this.f41869K;
        Path path2 = this.f41884P;
        CopyOnWriteArrayList copyOnWriteArrayList2 = this.f41927f0;
        copyOnWriteArrayList2.clear();
        CopyOnWriteArrayList copyOnWriteArrayList3 = this.f41930g0;
        copyOnWriteArrayList3.clear();
        CopyOnWriteArrayList copyOnWriteArrayList4 = this.f41932h0;
        copyOnWriteArrayList4.clear();
        CopyOnWriteArrayList copyOnWriteArrayList5 = this.f41942l0;
        copyOnWriteArrayList5.clear();
        CopyOnWriteArrayList copyOnWriteArrayList6 = this.f41944m0;
        copyOnWriteArrayList6.clear();
        CopyOnWriteArrayList copyOnWriteArrayList7 = this.f41935i0;
        copyOnWriteArrayList7.clear();
        CopyOnWriteArrayList copyOnWriteArrayList8 = this.f41938j0;
        copyOnWriteArrayList8.clear();
        CopyOnWriteArrayList copyOnWriteArrayList9 = this.f41940k0;
        copyOnWriteArrayList9.clear();
        Iterator it = this.f41913a0.iterator();
        while (true) {
            Iterator it2 = it;
            if (!it.hasNext()) {
                i = i3;
                break;
            }
            KData kData = (KData) it2.next();
            i = i3;
            if (!kData.f41811G) {
                break;
            }
            boolean z2 = this.f41909X1;
            ArrayList arrayList = this.f41922d0;
            int i6 = i4;
            if (z2) {
                Pointer pointer = new Pointer();
                i2 = i5;
                paint = paint2;
                double d = kData.f41825n;
                if (d > 0.0d) {
                    float f = (float) (((double) this.f41951o1) - (this.f41865I1 * d));
                    float fFloatValue = ((Number) arrayList.get(3)).floatValue() + m14260b(2.0f);
                    if (f > ((Number) arrayList.get(4)).floatValue() || fFloatValue > f) {
                        path = path2;
                    } else {
                        path = path2;
                        pointer.f42109a = (float) ((this.f41862H1 / ((double) 2)) + kData.f41806B);
                        pointer.f42110b = f;
                        copyOnWriteArrayList5.add(pointer);
                    }
                    Pointer pointer2 = new Pointer();
                    double d2 = kData.f41826o;
                    if (d2 > 0.0d) {
                        float f2 = (float) (((double) this.f41951o1) - (this.f41865I1 * d2));
                        float fFloatValue2 = ((Number) arrayList.get(3)).floatValue() + m14260b(2.0f);
                        if (f2 <= ((Number) arrayList.get(4)).floatValue() && fFloatValue2 <= f2) {
                            pointer2.f42109a = (float) ((this.f41862H1 / ((double) 2)) + kData.f41806B);
                            pointer2.f42110b = f2;
                            copyOnWriteArrayList6.add(pointer2);
                        }
                    }
                    int i7 = this.f41958r;
                    if (i7 == 0) {
                        Pointer pointer3 = new Pointer();
                        double d3 = kData.f41819h;
                        if (d3 > 0.0d) {
                            float f3 = (float) ((this.f41859G1 * (this.f41984z1 - d3)) + this.f41886P1);
                            float fFloatValue3 = ((Number) arrayList.get(0)).floatValue() + m14260b(2.0f);
                            if (f3 <= ((Number) arrayList.get(3)).floatValue() && fFloatValue3 <= f3) {
                                pointer3.f42109a = (float) ((this.f41862H1 / ((double) 2)) + kData.f41806B);
                                pointer3.f42110b = f3;
                                copyOnWriteArrayList2.add(pointer3);
                            }
                        }
                        Pointer pointer4 = new Pointer();
                        double d4 = kData.f41820i;
                        if (d4 > 0.0d) {
                            float f4 = (float) ((this.f41859G1 * (this.f41984z1 - d4)) + this.f41886P1);
                            float fFloatValue4 = ((Number) arrayList.get(0)).floatValue() + m14260b(2.0f);
                            if (f4 <= ((Number) arrayList.get(3)).floatValue() && fFloatValue4 <= f4) {
                                pointer4.f42109a = (float) ((this.f41862H1 / ((double) 2)) + kData.f41806B);
                                pointer4.f42110b = f4;
                                copyOnWriteArrayList3.add(pointer4);
                            }
                        }
                        Pointer pointer5 = new Pointer();
                        double d5 = kData.f41821j;
                        if (d5 > 0.0d) {
                            float f5 = (float) ((this.f41859G1 * (this.f41984z1 - d5)) + this.f41886P1);
                            float fFloatValue5 = ((Number) arrayList.get(0)).floatValue() + m14260b(2.0f);
                            if (f5 <= ((Number) arrayList.get(3)).floatValue() && fFloatValue5 <= f5) {
                                pointer5.f42109a = (float) ((this.f41862H1 / ((double) 2)) + kData.f41806B);
                                pointer5.f42110b = f5;
                                copyOnWriteArrayList4.add(pointer5);
                            }
                        }
                    } else if (i7 == 1) {
                        Pointer pointer6 = new Pointer();
                        double d6 = kData.f41822k;
                        if (d6 > 0.0d) {
                            float f6 = (float) ((this.f41859G1 * (this.f41984z1 - d6)) + this.f41886P1);
                            float fFloatValue6 = ((Number) arrayList.get(0)).floatValue() + m14260b(2.0f);
                            if (f6 <= ((Number) arrayList.get(3)).floatValue() && fFloatValue6 <= f6) {
                                pointer6.f42109a = (float) ((this.f41862H1 / ((double) 2)) + kData.f41806B);
                                pointer6.f42110b = f6;
                                copyOnWriteArrayList2.add(pointer6);
                            }
                        }
                        Pointer pointer7 = new Pointer();
                        double d7 = kData.f41823l;
                        if (d7 > 0.0d) {
                            float f7 = (float) ((this.f41859G1 * (this.f41984z1 - d7)) + this.f41886P1);
                            float fFloatValue7 = ((Number) arrayList.get(0)).floatValue() + m14260b(2.0f);
                            if (f7 <= ((Number) arrayList.get(3)).floatValue() && fFloatValue7 <= f7) {
                                pointer7.f42109a = (float) ((this.f41862H1 / ((double) 2)) + kData.f41806B);
                                pointer7.f42110b = f7;
                                copyOnWriteArrayList3.add(pointer7);
                            }
                        }
                        Pointer pointer8 = new Pointer();
                        double d8 = kData.f41824m;
                        if (d8 > 0.0d) {
                            float f8 = (float) ((this.f41859G1 * (this.f41984z1 - d8)) + this.f41886P1);
                            float fFloatValue8 = ((Number) arrayList.get(0)).floatValue() + m14260b(2.0f);
                            if (f8 <= ((Number) arrayList.get(3)).floatValue() && fFloatValue8 <= f8) {
                                pointer8.f42109a = (float) ((this.f41862H1 / ((double) 2)) + kData.f41806B);
                                pointer8.f42110b = f8;
                                copyOnWriteArrayList4.add(pointer8);
                            }
                        }
                    } else if (i7 == 2) {
                        Pointer pointer9 = new Pointer();
                        double d9 = kData.f41827p;
                        if (d9 > 0.0d) {
                            float f9 = (float) ((this.f41859G1 * (this.f41984z1 - d9)) + this.f41886P1);
                            float fFloatValue9 = ((Number) arrayList.get(0)).floatValue() + m14260b(2.0f);
                            if (f9 <= ((Number) arrayList.get(3)).floatValue() && fFloatValue9 <= f9) {
                                pointer9.f42109a = (float) ((this.f41862H1 / ((double) 2)) + kData.f41806B);
                                pointer9.f42110b = f9;
                                copyOnWriteArrayList2.add(pointer9);
                            }
                        }
                        Pointer pointer10 = new Pointer();
                        double d10 = kData.f41828q;
                        if (d10 > 0.0d) {
                            float f10 = (float) ((this.f41859G1 * (this.f41984z1 - d10)) + this.f41886P1);
                            float fFloatValue10 = ((Number) arrayList.get(0)).floatValue() + m14260b(2.0f);
                            if (f10 <= ((Number) arrayList.get(3)).floatValue() && fFloatValue10 <= f10) {
                                pointer10.f42109a = (float) ((this.f41862H1 / ((double) 2)) + kData.f41806B);
                                pointer10.f42110b = f10;
                                copyOnWriteArrayList3.add(pointer10);
                            }
                        }
                        Pointer pointer11 = new Pointer();
                        double d11 = kData.f41829r;
                        if (d11 > 0.0d) {
                            float f11 = (float) ((this.f41859G1 * (this.f41984z1 - d11)) + this.f41886P1);
                            float fFloatValue11 = ((Number) arrayList.get(0)).floatValue() + m14260b(2.0f);
                            if (f11 <= ((Number) arrayList.get(3)).floatValue() && fFloatValue11 <= f11) {
                                pointer11.f42109a = (float) ((this.f41862H1 / ((double) 2)) + kData.f41806B);
                                pointer11.f42110b = f11;
                                copyOnWriteArrayList4.add(pointer11);
                            }
                        }
                    }
                }
            } else {
                i2 = i5;
                paint = paint2;
                path = path2;
            }
            boolean z3 = this.vicePicShow;
            if (z3 && this.f41961s == 1) {
                Pointer pointer12 = new Pointer();
                double d12 = kData.f41832u;
                if (d12 > 0.0d) {
                    float f12 = (float) (((double) this.f41966t1) - (this.f41874L1 * d12));
                    float fFloatValue12 = ((Number) arrayList.get(4)).floatValue() + m14260b(2.0f);
                    if (f12 <= ((Number) CollectionsKt.m18411L(arrayList)).floatValue() && fFloatValue12 <= f12) {
                        pointer12.f42109a = (float) ((this.f41862H1 / ((double) 2)) + kData.f41806B);
                        pointer12.f42110b = f12;
                        copyOnWriteArrayList8.add(pointer12);
                    }
                } else {
                    float fAbs = (float) (Math.abs(this.f41874L1 * d12) + ((double) this.f41966t1));
                    float fFloatValue13 = ((Number) arrayList.get(4)).floatValue() + m14260b(2.0f);
                    if (fAbs <= ((Number) CollectionsKt.m18411L(arrayList)).floatValue() && fFloatValue13 <= fAbs) {
                        pointer12.f42109a = (float) ((this.f41862H1 / ((double) 2)) + kData.f41806B);
                        pointer12.f42110b = fAbs;
                        copyOnWriteArrayList8.add(pointer12);
                    }
                }
                Pointer pointer13 = new Pointer();
                double d13 = kData.f41831t;
                if (d13 > 0.0d) {
                    float f13 = (float) (((double) this.f41966t1) - (this.f41871K1 * d13));
                    float fFloatValue14 = ((Number) arrayList.get(4)).floatValue() + m14260b(2.0f);
                    if (f13 <= ((Number) CollectionsKt.m18411L(arrayList)).floatValue() && fFloatValue14 <= f13) {
                        pointer13.f42109a = (float) ((this.f41862H1 / ((double) 2)) + kData.f41806B);
                        pointer13.f42110b = f13;
                        copyOnWriteArrayList9.add(pointer13);
                    }
                } else {
                    float fAbs2 = (float) (Math.abs(this.f41871K1 * d13) + ((double) this.f41966t1));
                    float fFloatValue15 = ((Number) arrayList.get(4)).floatValue() + m14260b(2.0f);
                    if (fAbs2 <= ((Number) CollectionsKt.m18411L(arrayList)).floatValue() && fFloatValue15 <= fAbs2) {
                        pointer13.f42109a = (float) ((this.f41862H1 / ((double) 2)) + kData.f41806B);
                        pointer13.f42110b = fAbs2;
                        copyOnWriteArrayList9.add(pointer13);
                    }
                }
                i3 = i;
                it = it2;
                i4 = i6;
            } else {
                if (z3 && this.f41961s == 2) {
                    Pointer pointer14 = new Pointer();
                    if (kData.f41833v > 0.0d) {
                        copyOnWriteArrayList = copyOnWriteArrayList2;
                        pointer14.f42109a = (float) ((this.f41862H1 / ((double) 2)) + kData.f41806B);
                        pointer14.f42110b = (float) (((Number) arrayList.get(5)).doubleValue() - (kData.f41833v * this.f41877M1));
                        copyOnWriteArrayList7.add(pointer14);
                    } else {
                        copyOnWriteArrayList = copyOnWriteArrayList2;
                    }
                    Pointer pointer15 = new Pointer();
                    if (kData.f41834w > 0.0d) {
                        pointer15.f42109a = (float) ((this.f41862H1 / ((double) 2)) + kData.f41806B);
                        pointer15.f42110b = (float) (((Number) arrayList.get(5)).doubleValue() - (kData.f41834w * this.f41880N1));
                        copyOnWriteArrayList8.add(pointer15);
                    }
                    Pointer pointer16 = new Pointer();
                    if (kData.f41835x > 0.0d) {
                        pointer16.f42109a = (float) ((this.f41862H1 / ((double) 2)) + kData.f41806B);
                        pointer16.f42110b = (float) (((Number) arrayList.get(5)).doubleValue() - (kData.f41835x * this.f41883O1));
                        copyOnWriteArrayList9.add(pointer16);
                    }
                } else {
                    copyOnWriteArrayList = copyOnWriteArrayList2;
                    if (z3 && this.f41961s == 3) {
                        Pointer pointer17 = new Pointer();
                        if (kData.f41836y >= 0.0d) {
                            pointer17.f42109a = (float) ((this.f41862H1 / ((double) 2)) + kData.f41806B);
                            pointer17.f42110b = (float) (((Number) arrayList.get(5)).doubleValue() - (kData.f41836y * this.f41889Q1));
                            copyOnWriteArrayList7.add(pointer17);
                        }
                        Pointer pointer18 = new Pointer();
                        if (kData.f41837z >= 0.0d) {
                            pointer18.f42109a = (float) ((this.f41862H1 / ((double) 2)) + kData.f41806B);
                            pointer18.f42110b = (float) (((Number) arrayList.get(5)).doubleValue() - (kData.f41837z * this.f41889Q1));
                            copyOnWriteArrayList8.add(pointer18);
                        }
                        Pointer pointer19 = new Pointer();
                        if (kData.f41805A >= 0.0d) {
                            pointer19.f42109a = (float) ((this.f41862H1 / ((double) 2)) + kData.f41806B);
                            pointer19.f42110b = (float) (((Number) arrayList.get(5)).doubleValue() - (kData.f41805A * this.f41889Q1));
                            copyOnWriteArrayList9.add(pointer19);
                        }
                    }
                }
                i3 = i;
                it = it2;
                i4 = i6;
                copyOnWriteArrayList2 = copyOnWriteArrayList;
            }
            i5 = i2;
            paint2 = paint;
            path2 = path;
        }
        int i8 = i4;
        int i9 = i5;
        Paint paint3 = paint2;
        Path path3 = path2;
        CopyOnWriteArrayList copyOnWriteArrayList10 = copyOnWriteArrayList2;
        ArrayList arrayList2 = QuotaUtil.f42113a;
        QuotaUtil.m14304i(copyOnWriteArrayList5, path3);
        m14273q(i9, 0);
        Intrinsics.m18596d(path3);
        Intrinsics.m18596d(paint3);
        canvas.drawPath(path3, paint3);
        QuotaUtil.m14304i(copyOnWriteArrayList6, path3);
        m14273q(i8, 0);
        Intrinsics.m18596d(path3);
        Intrinsics.m18596d(paint3);
        canvas.drawPath(path3, paint3);
        QuotaUtil.m14304i(copyOnWriteArrayList10, path3);
        m14273q(i9, 0);
        Intrinsics.m18596d(path3);
        Intrinsics.m18596d(paint3);
        canvas.drawPath(path3, paint3);
        QuotaUtil.m14304i(copyOnWriteArrayList3, path3);
        m14273q(i8, 0);
        Intrinsics.m18596d(path3);
        Intrinsics.m18596d(paint3);
        canvas.drawPath(path3, paint3);
        QuotaUtil.m14304i(copyOnWriteArrayList4, path3);
        int i10 = i;
        m14273q(i10, 0);
        Intrinsics.m18596d(path3);
        Intrinsics.m18596d(paint3);
        canvas.drawPath(path3, paint3);
        if (this.vicePicShow) {
            canvas.save();
            QuotaUtil.m14305j(copyOnWriteArrayList7, path3);
            m14273q(i9, 0);
            Intrinsics.m18596d(path3);
            Intrinsics.m18596d(paint3);
            canvas.drawPath(path3, paint3);
            QuotaUtil.m14305j(copyOnWriteArrayList8, path3);
            m14273q(i8, 0);
            Intrinsics.m18596d(path3);
            Intrinsics.m18596d(paint3);
            canvas.drawPath(path3, paint3);
            QuotaUtil.m14305j(copyOnWriteArrayList9, path3);
            m14273q(i10, 0);
            Intrinsics.m18596d(path3);
            Intrinsics.m18596d(paint3);
            canvas.drawPath(path3, paint3);
            canvas.restore();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0128 A[RETURN] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchTouchEvent(MotionEvent event) {
        boolean z2;
        Intrinsics.m18599g(event, "event");
        if (event.getAction() == 0) {
            this.f41975w1 = event.getX();
            this.f41978x1 = event.getY();
            this.f41981y1 = event.getX();
            this.f41948n1 = event.getY();
            this.f41934i = false;
            postDelayed(this.f41959r0, this.f41937j);
        } else {
            if (event.getAction() == 2) {
                float fAbs = Math.abs(event.getX() - this.f41975w1);
                float fAbs2 = Math.abs(event.getY() - this.f41978x1);
                float fAbs3 = Math.abs(event.getX() - this.f41981y1);
                float fAbs4 = Math.abs(event.getY() - this.f41948n1);
                this.f41945m1 = event.getY();
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                if (this.f41946n || ((fAbs > m14260b(5.0f) + fAbs2 && fAbs > this.f41917b1) || ((z2 = this.f41934i) && fAbs2 > this.f41917b1))) {
                    this.f41946n = true;
                    removeCallbacks(this.f41959r0);
                    if (this.f41934i && (fAbs3 > 1.0f || fAbs4 > 1.0f)) {
                        m14269m(event.getX());
                        if (this.f41947n0 != null) {
                            invalidate();
                        }
                    }
                    this.f41981y1 = event.getX();
                    this.f41948n1 = event.getY();
                    if (this.f41934i || super.dispatchTouchEvent(event)) {
                        return true;
                    }
                } else if (!z2 && !this.f41946n && !this.f41952p && fAbs2 > fAbs + m14260b(5.0f) && fAbs2 > this.f41917b1) {
                    removeCallbacks(this.f41959r0);
                    if (getParent() != null) {
                        getParent().requestDisallowInterceptTouchEvent(false);
                        return false;
                    }
                }
                return false;
            }
            if (event.getAction() == 1) {
                this.f41946n = false;
                removeCallbacks(this.f41959r0);
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                }
            }
        }
        if (!this.f41934i && !super.dispatchTouchEvent(event)) {
            return false;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m14263e(Canvas canvas) {
        String string;
        String string2;
        String string3;
        String str;
        if (this.f41947n0 == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f41976x);
        KData kData = this.f41947n0;
        Intrinsics.m18596d(kData);
        int i = this.f41904V1;
        sb.append(m14258k(this, kData.f41817f, i, i));
        String string4 = sb.toString();
        Rect rect = new Rect();
        m14273q(this.f41840A0, this.f41885P0);
        Paint paint = this.f41878N;
        Intrinsics.m18596d(paint);
        paint.getTextBounds(string4, 0, string4.length(), rect);
        ArrayList arrayList = this.f41924e0;
        float fFloatValue = ((Number) arrayList.get(0)).floatValue() + m14260b(20.0f);
        float fHeight = this.f41960r1 + rect.height() + m14260b(2.0f);
        Paint paint2 = this.f41878N;
        Intrinsics.m18596d(paint2);
        canvas.drawText(string4, fFloatValue, fHeight, paint2);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f41967u);
        KData kData2 = this.f41947n0;
        Intrinsics.m18596d(kData2);
        double d = kData2.f41825n;
        int i2 = this.f41904V1;
        sb2.append(m14258k(this, d, i2, i2));
        String string5 = sb2.toString();
        Rect rect2 = new Rect();
        m14273q(this.f41971v0, this.f41885P0);
        Paint paint3 = this.f41878N;
        Intrinsics.m18596d(paint3);
        paint3.getTextBounds(string5, 0, string5.length(), rect2);
        float fFloatValue2 = ((Number) arrayList.get(0)).floatValue() + m14260b(20.0f) + rect.width() + m14260b(10.0f);
        float fHeight2 = this.f41960r1 + rect.height() + m14260b(2.0f);
        Paint paint4 = this.f41878N;
        Intrinsics.m18596d(paint4);
        canvas.drawText(string5, fFloatValue2, fHeight2, paint4);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f41970v);
        KData kData3 = this.f41947n0;
        Intrinsics.m18596d(kData3);
        double d2 = kData3.f41826o;
        int i3 = this.f41904V1;
        sb3.append(m14258k(this, d2, i3, i3));
        String string6 = sb3.toString();
        m14273q(this.f41974w0, this.f41885P0);
        float fFloatValue3 = ((Number) arrayList.get(0)).floatValue() + m14260b(20.0f) + rect2.width() + rect.width() + (m14260b(10.0f) * 2);
        float fHeight3 = this.f41960r1 + rect.height() + m14260b(2.0f);
        Paint paint5 = this.f41878N;
        Intrinsics.m18596d(paint5);
        canvas.drawText(string6, fFloatValue3, fHeight3, paint5);
        boolean z2 = this.vicePicShow;
        if (z2 && this.f41961s == 1) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(this.f41982z);
            KData kData4 = this.f41947n0;
            Intrinsics.m18596d(kData4);
            double d3 = kData4.f41830s;
            int i4 = this.f41904V1;
            sb4.append(m14258k(this, d3, i4, i4));
            string = sb4.toString();
            StringBuilder sb5 = new StringBuilder();
            sb5.append(this.f41839A);
            KData kData5 = this.f41947n0;
            Intrinsics.m18596d(kData5);
            double d4 = kData5.f41832u;
            int i5 = this.f41904V1;
            sb5.append(m14258k(this, d4, i5, i5));
            string2 = sb5.toString();
            StringBuilder sb6 = new StringBuilder();
            sb6.append(this.f41842B);
            KData kData6 = this.f41947n0;
            Intrinsics.m18596d(kData6);
            double d5 = kData6.f41831t;
            int i6 = this.f41904V1;
            sb6.append(m14258k(this, d5, i6, i6));
            string3 = sb6.toString();
            str = this.f41979y;
        } else if (z2 && this.f41961s == 2) {
            StringBuilder sb7 = new StringBuilder();
            sb7.append(this.f41848D);
            KData kData7 = this.f41947n0;
            Intrinsics.m18596d(kData7);
            double d6 = kData7.f41833v;
            int i7 = this.f41904V1;
            sb7.append(m14258k(this, d6, i7, i7));
            string = sb7.toString();
            StringBuilder sb8 = new StringBuilder();
            sb8.append(this.f41851E);
            KData kData8 = this.f41947n0;
            Intrinsics.m18596d(kData8);
            double d7 = kData8.f41834w;
            int i8 = this.f41904V1;
            sb8.append(m14258k(this, d7, i8, i8));
            string2 = sb8.toString();
            StringBuilder sb9 = new StringBuilder();
            sb9.append(this.f41854F);
            KData kData9 = this.f41947n0;
            Intrinsics.m18596d(kData9);
            double d8 = kData9.f41835x;
            int i9 = this.f41904V1;
            sb9.append(m14258k(this, d8, i9, i9));
            string3 = sb9.toString();
            str = this.f41845C;
        } else if (z2 && this.f41961s == 3) {
            StringBuilder sb10 = new StringBuilder();
            sb10.append(this.f41860H);
            KData kData10 = this.f41947n0;
            Intrinsics.m18596d(kData10);
            double d9 = kData10.f41836y;
            int i10 = this.f41904V1;
            sb10.append(m14258k(this, d9, i10, i10));
            string = sb10.toString();
            StringBuilder sb11 = new StringBuilder();
            sb11.append(this.f41863I);
            KData kData11 = this.f41947n0;
            Intrinsics.m18596d(kData11);
            double d10 = kData11.f41837z;
            int i11 = this.f41904V1;
            sb11.append(m14258k(this, d10, i11, i11));
            string2 = sb11.toString();
            StringBuilder sb12 = new StringBuilder();
            sb12.append(this.f41866J);
            KData kData12 = this.f41947n0;
            Intrinsics.m18596d(kData12);
            double d11 = kData12.f41805A;
            int i12 = this.f41904V1;
            sb12.append(m14258k(this, d11, i12, i12));
            string3 = sb12.toString();
            str = this.f41857G;
        } else {
            string = "";
            string2 = "";
            string3 = string2;
            str = string3;
        }
        Rect rect3 = new Rect();
        m14273q(this.f41840A0, this.f41885P0);
        Paint paint6 = this.f41878N;
        Intrinsics.m18596d(paint6);
        paint6.getTextBounds(str, 0, str.length(), rect3);
        float fFloatValue4 = ((Number) arrayList.get(0)).floatValue();
        ArrayList arrayList2 = this.f41922d0;
        float fFloatValue5 = ((Number) arrayList2.get(4)).floatValue() + rect3.height();
        Paint paint7 = this.f41878N;
        Intrinsics.m18596d(paint7);
        canvas.drawText(str, fFloatValue4, fFloatValue5, paint7);
        m14273q(this.f41971v0, this.f41885P0);
        float fFloatValue6 = ((Number) arrayList.get(0)).floatValue() + rect3.width() + m14260b(10.0f);
        float fFloatValue7 = ((Number) arrayList2.get(4)).floatValue() + rect3.height();
        Paint paint8 = this.f41878N;
        Intrinsics.m18596d(paint8);
        canvas.drawText(string, fFloatValue6, fFloatValue7, paint8);
        Paint paint9 = this.f41878N;
        Intrinsics.m18596d(paint9);
        float fMeasureText = paint9.measureText(string);
        m14273q(this.f41974w0, this.f41885P0);
        float fFloatValue8 = ((Number) arrayList.get(0)).floatValue() + rect3.width() + m14260b(20.0f) + fMeasureText;
        float fFloatValue9 = ((Number) arrayList2.get(4)).floatValue() + rect3.height();
        Paint paint10 = this.f41878N;
        Intrinsics.m18596d(paint10);
        canvas.drawText(string2, fFloatValue8, fFloatValue9, paint10);
        Paint paint11 = this.f41878N;
        Intrinsics.m18596d(paint11);
        float fMeasureText2 = paint11.measureText(string2);
        m14273q(this.f41977x0, this.f41885P0);
        float fFloatValue10 = ((Number) arrayList.get(0)).floatValue() + rect3.width() + m14260b(30.0f) + fMeasureText + fMeasureText2;
        float fFloatValue11 = ((Number) arrayList2.get(4)).floatValue() + rect3.height();
        Paint paint12 = this.f41878N;
        Intrinsics.m18596d(paint12);
        canvas.drawText(string3, fFloatValue10, fFloatValue11, paint12);
    }

    /* JADX INFO: renamed from: f */
    public final void m14264f(Canvas canvas) {
        double dFloatValue;
        int i;
        double dFloatValue2;
        KData kData = this.f41947n0;
        if (kData == null || !this.f41929g) {
            return;
        }
        double d = 2;
        float f = (float) ((this.f41862H1 / d) + kData.f41806B);
        Intrinsics.m18596d(kData);
        float f2 = (float) ((this.f41862H1 / d) + kData.f41806B);
        ArrayList arrayList = this.f41922d0;
        float fFloatValue = ((Number) arrayList.get(0)).floatValue();
        KData kData2 = this.f41947n0;
        Intrinsics.m18596d(kData2);
        float f3 = (float) ((this.f41862H1 / d) + kData2.f41806B);
        float fFloatValue2 = ((Number) AbstractC0000a.m8e(1, arrayList)).floatValue();
        Paint paint = this.f41881O;
        Intrinsics.m18596d(paint);
        canvas.drawLine(f2, fFloatValue, f3, fFloatValue2, paint);
        int i2 = this.f41964t;
        if (i2 == 0) {
            KData kData3 = this.f41947n0;
            Intrinsics.m18596d(kData3);
            dFloatValue = kData3.f41809E;
        } else if (i2 == 1) {
            KData kData4 = this.f41947n0;
            Intrinsics.m18596d(kData4);
            dFloatValue = kData4.f41810F;
        } else if (i2 != 2) {
            KData kData5 = this.f41947n0;
            Intrinsics.m18596d(kData5);
            dFloatValue = kData5.f41809E;
        } else {
            dFloatValue = this.f41945m1;
        }
        if (dFloatValue < ((Number) arrayList.get(0)).floatValue()) {
            dFloatValue = ((Number) arrayList.get(0)).floatValue();
        } else {
            double d2 = this.f41960r1;
            if (dFloatValue > d2) {
                dFloatValue = d2;
            }
        }
        ArrayList arrayList2 = this.f41924e0;
        float fFloatValue3 = ((Number) arrayList2.get(0)).floatValue();
        float f4 = (float) dFloatValue;
        float fFloatValue4 = ((Number) AbstractC0000a.m8e(1, arrayList2)).floatValue();
        Paint paint2 = this.f41881O;
        Intrinsics.m18596d(paint2);
        canvas.drawLine(fFloatValue3, f4, fFloatValue4, f4, paint2);
        int iM14260b = m14260b(6.0f) / 2;
        int iM14260b2 = iM14260b - m14260b(1.0f);
        Paint paint3 = new Paint();
        paint3.setColor(-16777216);
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(m14260b(1.0f));
        canvas.drawCircle(f, f4, iM14260b, paint3);
        Paint paint4 = new Paint();
        paint4.setColor(-16777216);
        paint4.setStyle(Paint.Style.FILL);
        canvas.drawCircle(f, f4, iM14260b2, paint4);
        KData kData6 = this.f41947n0;
        Intrinsics.m18596d(kData6);
        float fM14260b = (float) (((this.f41862H1 / d) + kData6.f41806B) - ((double) m14260b(35.0f)));
        float fM14260b2 = this.f41928f1 - m14260b(16.0f);
        KData kData7 = this.f41947n0;
        Intrinsics.m18596d(kData7);
        RectF rectF = new RectF(fM14260b, fM14260b2, (float) ((this.f41862H1 / d) + kData7.f41806B + ((double) m14260b(35.0f))), this.f41928f1);
        Paint paint5 = this.f41872L;
        Intrinsics.m18596d(paint5);
        paint5.setColor(this.f41858G0);
        float fM14260b3 = m14260b(4.0f);
        float fM14260b4 = m14260b(4.0f);
        Paint paint6 = this.f41872L;
        Intrinsics.m18596d(paint6);
        canvas.drawRoundRect(rectF, fM14260b3, fM14260b4, paint6);
        KData kData8 = this.f41947n0;
        Intrinsics.m18596d(kData8);
        String strM14257i = m14257i(kData8.f41812a);
        m14273q(this.f41888Q0, this.f41906W0);
        KData kData9 = this.f41947n0;
        Intrinsics.m18596d(kData9);
        double d3 = (this.f41862H1 / d) + kData9.f41806B;
        Paint paint7 = this.f41878N;
        Intrinsics.m18596d(paint7);
        float f5 = 2;
        float fMeasureText = (float) (d3 - ((double) (paint7.measureText(strM14257i) / f5)));
        float fM14260b5 = this.f41928f1 - m14260b(5.0f);
        Paint paint8 = this.f41878N;
        Intrinsics.m18596d(paint8);
        canvas.drawText(strM14257i, fMeasureText, fM14260b5, paint8);
        RectF rectF2 = new RectF(this.f41925e1 - m14260b(38.0f), f4 - m14260b(7.0f), this.f41925e1 - m14260b(1.0f), m14260b(7.0f) + f4);
        Paint paint9 = this.f41872L;
        Intrinsics.m18596d(paint9);
        paint9.setColor(this.f41855F0);
        float fM14260b6 = m14260b(4.0f);
        float fM14260b7 = m14260b(4.0f);
        Paint paint10 = this.f41872L;
        Intrinsics.m18596d(paint10);
        canvas.drawRoundRect(rectF2, fM14260b6, fM14260b7, paint10);
        if (this.vicePicShow) {
            i = 0;
            dFloatValue2 = (this.f41841A1 - this.f41850D1) / ((double) (((Number) arrayList.get(3)).floatValue() - ((Number) arrayList.get(0)).floatValue()));
        } else {
            dFloatValue2 = (this.f41841A1 - this.f41850D1) / ((double) (((Number) arrayList.get(4)).floatValue() - ((Number) arrayList.get(0)).floatValue()));
            i = 0;
        }
        double dFloatValue3 = this.f41841A1 - (dFloatValue2 * ((double) (f4 - ((Number) arrayList.get(i)).floatValue())));
        int i3 = this.f41904V1;
        String strM14258k = m14258k(this, dFloatValue3, i3, i3);
        Rect rect = new Rect();
        m14273q(this.f41861H0, this.f41903V0);
        Paint paint11 = this.f41878N;
        Intrinsics.m18596d(paint11);
        paint11.getTextBounds(strM14258k, 0, strM14258k.length(), rect);
        float fM1B = AbstractC0000a.m1B(rectF2.width(), rect.width(), f5, this.f41925e1 - m14260b(38.0f));
        float fM14260b8 = (f4 + m14260b(7.0f)) - ((rectF2.height() - rect.height()) / f5);
        Paint paint12 = this.f41878N;
        Intrinsics.m18596d(paint12);
        canvas.drawText(strM14258k, fM1B, fM14260b8, paint12);
    }

    /* JADX INFO: renamed from: g */
    public final void m14265g(Canvas canvas) {
        if (this.f41947n0 == null || !this.f41929g) {
            return;
        }
        m14273q(this.f41870K0, this.f41910Y0);
        Paint paint = this.f41869K;
        Intrinsics.m18596d(paint);
        int i = 0;
        String str = this.f41902V[0];
        paint.getTextBounds(str, 0, str.length(), this.f41899U);
        KData kData = this.f41947n0;
        Intrinsics.m18596d(kData);
        double d = (this.f41862H1 / ((double) 2)) + kData.f41806B;
        double measuredWidth = getMeasuredWidth() / 2.0f;
        ArrayList arrayList = this.f41919c0;
        ArrayList arrayList2 = this.f41922d0;
        ArrayList arrayList3 = this.f41924e0;
        if (d <= measuredWidth) {
            Paint paint2 = this.f41872L;
            Intrinsics.m18596d(paint2);
            paint2.setColor(this.f41876M0);
            float fFloatValue = ((Number) arrayList3.get(arrayList3.size() - 1)).floatValue() - this.f41879N0;
            float fFloatValue2 = ((Number) arrayList2.get(0)).floatValue();
            float fFloatValue3 = ((Number) AbstractC0000a.m8e(1, arrayList3)).floatValue();
            float fFloatValue4 = ((Number) arrayList2.get(0)).floatValue() + this.f41914a1;
            Paint paint3 = this.f41872L;
            Intrinsics.m18596d(paint3);
            float f = 4.0f;
            canvas.drawRect(fFloatValue, fFloatValue2, fFloatValue3, fFloatValue4, paint3);
            m14273q(this.f41867J0, 0);
            float fFloatValue5 = ((Number) arrayList3.get(arrayList3.size() - 1)).floatValue() - this.f41879N0;
            float fFloatValue6 = ((Number) arrayList2.get(0)).floatValue();
            float fFloatValue7 = ((Number) AbstractC0000a.m8e(1, arrayList3)).floatValue() - this.f41879N0;
            float fFloatValue8 = this.f41914a1 + ((Number) arrayList2.get(0)).floatValue();
            Paint paint4 = this.f41869K;
            Intrinsics.m18596d(paint4);
            canvas.drawLine(fFloatValue5, fFloatValue6, fFloatValue7, fFloatValue8, paint4);
            float fFloatValue9 = ((Number) AbstractC0000a.m8e(1, arrayList3)).floatValue() - this.f41879N0;
            float fFloatValue10 = ((Number) arrayList2.get(0)).floatValue();
            float fFloatValue11 = ((Number) AbstractC0000a.m8e(1, arrayList3)).floatValue();
            float fFloatValue12 = ((Number) arrayList2.get(0)).floatValue();
            Paint paint5 = this.f41869K;
            Intrinsics.m18596d(paint5);
            canvas.drawLine(fFloatValue9, fFloatValue10, fFloatValue11, fFloatValue12, paint5);
            float fFloatValue13 = ((Number) AbstractC0000a.m8e(1, arrayList3)).floatValue();
            float fFloatValue14 = ((Number) arrayList2.get(0)).floatValue();
            float fFloatValue15 = ((Number) AbstractC0000a.m8e(1, arrayList3)).floatValue();
            float fFloatValue16 = this.f41914a1 + ((Number) arrayList2.get(0)).floatValue();
            Paint paint6 = this.f41869K;
            Intrinsics.m18596d(paint6);
            canvas.drawLine(fFloatValue13, fFloatValue14, fFloatValue15, fFloatValue16, paint6);
            float fFloatValue17 = ((Number) AbstractC0000a.m8e(1, arrayList3)).floatValue() - this.f41879N0;
            float fFloatValue18 = this.f41914a1 + ((Number) arrayList2.get(0)).floatValue();
            float fFloatValue19 = ((Number) AbstractC0000a.m8e(1, arrayList3)).floatValue();
            float fFloatValue20 = this.f41914a1 + ((Number) arrayList2.get(0)).floatValue();
            Paint paint7 = this.f41869K;
            Intrinsics.m18596d(paint7);
            canvas.drawLine(fFloatValue17, fFloatValue18, fFloatValue19, fFloatValue20, paint7);
            m14273q(this.f41870K0, this.f41910Y0);
            int length = this.f41902V.length;
            int i2 = 0;
            while (i2 < length) {
                String str2 = this.f41902V[i2];
                float fFloatValue21 = (((Number) AbstractC0000a.m8e(1, arrayList3)).floatValue() - this.f41879N0) + m14260b(f);
                float fHeight = ((this.f41943l1 - r8.height()) / 2) + (this.f41943l1 * i2) + ((Number) arrayList2.get(i)).floatValue() + r8.height();
                Paint paint8 = this.f41878N;
                Intrinsics.m18596d(paint8);
                canvas.drawText(str2, fFloatValue21, fHeight, paint8);
                i2++;
                i = 0;
                f = 4.0f;
            }
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                if (i3 == 5 || i3 == 6) {
                    KData kData2 = this.f41947n0;
                    Intrinsics.m18596d(kData2);
                    if (kData2.m14255a() > 0.0d) {
                        m14273q(this.f41965t0, this.f41910Y0);
                    } else {
                        m14273q(this.f41968u0, this.f41910Y0);
                    }
                } else {
                    m14273q(this.f41870K0, this.f41910Y0);
                }
                String str3 = (String) arrayList.get(i3);
                float fFloatValue22 = ((Number) AbstractC0000a.m8e(1, arrayList3)).floatValue() - m14260b(4.0f);
                Paint paint9 = this.f41869K;
                Intrinsics.m18596d(paint9);
                float fMeasureText = fFloatValue22 - paint9.measureText((String) arrayList.get(i3));
                float fHeight2 = ((this.f41943l1 - r8.height()) / 2) + (this.f41943l1 * i3) + ((Number) arrayList2.get(0)).floatValue() + r8.height();
                Paint paint10 = this.f41878N;
                Intrinsics.m18596d(paint10);
                canvas.drawText(str3, fMeasureText, fHeight2, paint10);
            }
            return;
        }
        Paint paint11 = this.f41872L;
        Intrinsics.m18596d(paint11);
        paint11.setColor(this.f41876M0);
        float fFloatValue23 = ((Number) arrayList3.get(0)).floatValue();
        float fFloatValue24 = ((Number) arrayList2.get(0)).floatValue();
        float fFloatValue25 = ((Number) arrayList3.get(0)).floatValue() + this.f41879N0;
        float fFloatValue26 = ((Number) arrayList2.get(0)).floatValue() + this.f41914a1;
        Paint paint12 = this.f41872L;
        Intrinsics.m18596d(paint12);
        canvas.drawRect(fFloatValue23, fFloatValue24, fFloatValue25, fFloatValue26, paint12);
        m14273q(this.f41867J0, 0);
        float fFloatValue27 = ((Number) arrayList3.get(0)).floatValue();
        float fFloatValue28 = ((Number) arrayList2.get(0)).floatValue();
        float fFloatValue29 = ((Number) arrayList3.get(0)).floatValue();
        float fFloatValue30 = this.f41914a1 + ((Number) arrayList2.get(0)).floatValue();
        Paint paint13 = this.f41869K;
        Intrinsics.m18596d(paint13);
        canvas.drawLine(fFloatValue27, fFloatValue28, fFloatValue29, fFloatValue30, paint13);
        float fFloatValue31 = ((Number) arrayList3.get(0)).floatValue();
        float fFloatValue32 = ((Number) arrayList2.get(0)).floatValue();
        float fFloatValue33 = this.f41879N0 + ((Number) arrayList3.get(0)).floatValue();
        float fFloatValue34 = ((Number) arrayList2.get(0)).floatValue();
        Paint paint14 = this.f41869K;
        Intrinsics.m18596d(paint14);
        canvas.drawLine(fFloatValue31, fFloatValue32, fFloatValue33, fFloatValue34, paint14);
        float fFloatValue35 = this.f41879N0 + ((Number) arrayList3.get(0)).floatValue();
        float fFloatValue36 = ((Number) arrayList2.get(0)).floatValue();
        float fFloatValue37 = this.f41879N0 + ((Number) arrayList3.get(0)).floatValue();
        float fFloatValue38 = this.f41914a1 + ((Number) arrayList2.get(0)).floatValue();
        Paint paint15 = this.f41869K;
        Intrinsics.m18596d(paint15);
        canvas.drawLine(fFloatValue35, fFloatValue36, fFloatValue37, fFloatValue38, paint15);
        float fFloatValue39 = ((Number) arrayList3.get(0)).floatValue();
        float fFloatValue40 = this.f41914a1 + ((Number) arrayList2.get(0)).floatValue();
        float fFloatValue41 = this.f41879N0 + ((Number) arrayList3.get(0)).floatValue();
        float fFloatValue42 = this.f41914a1 + ((Number) arrayList2.get(0)).floatValue();
        Paint paint16 = this.f41869K;
        Intrinsics.m18596d(paint16);
        canvas.drawLine(fFloatValue39, fFloatValue40, fFloatValue41, fFloatValue42, paint16);
        m14273q(this.f41870K0, this.f41910Y0);
        int length2 = this.f41902V.length;
        for (int i4 = 0; i4 < length2; i4++) {
            String str4 = this.f41902V[i4];
            float fFloatValue43 = ((Number) arrayList3.get(0)).floatValue() + m14260b(4.0f);
            float fHeight3 = ((this.f41943l1 - r8.height()) / 2) + (this.f41943l1 * i4) + ((Number) arrayList2.get(0)).floatValue() + r8.height();
            Paint paint17 = this.f41878N;
            Intrinsics.m18596d(paint17);
            canvas.drawText(str4, fFloatValue43, fHeight3, paint17);
        }
        int size2 = arrayList.size();
        for (int i5 = 0; i5 < size2; i5++) {
            if (i5 == 5 || i5 == 6) {
                KData kData3 = this.f41947n0;
                Intrinsics.m18596d(kData3);
                if (kData3.m14255a() > 0.0d) {
                    m14273q(this.f41965t0, this.f41910Y0);
                } else {
                    m14273q(this.f41968u0, this.f41910Y0);
                }
            } else {
                m14273q(this.f41870K0, this.f41910Y0);
            }
            String str5 = (String) arrayList.get(i5);
            float fFloatValue44 = (((Number) arrayList3.get(0)).floatValue() + this.f41879N0) - m14260b(4.0f);
            Paint paint18 = this.f41869K;
            Intrinsics.m18596d(paint18);
            float fMeasureText2 = fFloatValue44 - paint18.measureText((String) arrayList.get(i5));
            float fHeight4 = ((this.f41943l1 - r8.height()) / 2) + (this.f41943l1 * i5) + ((Number) arrayList2.get(0)).floatValue() + r8.height();
            Paint paint19 = this.f41878N;
            Intrinsics.m18596d(paint19);
            canvas.drawText(str5, fMeasureText2, fHeight4, paint19);
        }
    }

    @NotNull
    public final List<KData> getTotalDataList() {
        return this.f41905W;
    }

    public final boolean getVicePicShow() {
        return this.vicePicShow;
    }

    @NotNull
    public final List<KData> getViewDataList() {
        return this.f41913a0;
    }

    /* JADX INFO: renamed from: h */
    public final void m14266h(Canvas canvas) {
        ArrayList arrayList;
        RectF rectF;
        float fM14260b;
        RectF rectF2;
        float fM14260b2;
        Rect rect = new Rect();
        double d = this.f41984z1;
        int i = this.f41904V1;
        String strM14258k = m14258k(this, d, i, i);
        m14273q(this.f41891R0, this.f41897T0);
        Paint paint = this.f41869K;
        Intrinsics.m18596d(paint);
        paint.getTextBounds(strM14258k, 0, strM14258k.length(), rect);
        double dWidth = this.f41844B1 + ((double) rect.width()) + ((double) m14260b(8.0f));
        ArrayList arrayList2 = this.f41924e0;
        if (dWidth < ((Number) AbstractC0000a.m8e(1, arrayList2)).floatValue()) {
            arrayList = arrayList2;
            rectF = new RectF((float) (this.f41844B1 + ((double) m14260b(3.0f))), ((float) this.f41886P1) - m14260b(7.0f), (float) (this.f41844B1 + ((double) rect.width()) + ((double) m14260b(8.0f))), ((float) this.f41886P1) + m14260b(7.0f));
            Path path = this.f41884P;
            Intrinsics.m18596d(path);
            path.reset();
            Path path2 = this.f41884P;
            Intrinsics.m18596d(path2);
            path2.moveTo((float) this.f41844B1, (float) this.f41886P1);
            Path path3 = this.f41884P;
            Intrinsics.m18596d(path3);
            path3.lineTo((float) (this.f41844B1 + ((double) m14260b(4.0f))), ((float) this.f41886P1) - m14260b(3.0f));
            Path path4 = this.f41884P;
            Intrinsics.m18596d(path4);
            path4.lineTo((float) (this.f41844B1 + ((double) m14260b(4.0f))), ((float) this.f41886P1) + m14260b(3.0f));
            Path path5 = this.f41884P;
            Intrinsics.m18596d(path5);
            path5.close();
            fM14260b = (float) (this.f41844B1 + ((double) m14260b(5.0f)));
        } else {
            arrayList = arrayList2;
            rectF = new RectF((float) (this.f41844B1 - ((double) m14260b(3.0f))), ((float) this.f41886P1) - m14260b(7.0f), (float) ((this.f41844B1 - ((double) rect.width())) - ((double) m14260b(8.0f))), ((float) this.f41886P1) + m14260b(7.0f));
            Path path6 = this.f41884P;
            Intrinsics.m18596d(path6);
            path6.reset();
            Path path7 = this.f41884P;
            Intrinsics.m18596d(path7);
            path7.moveTo((float) this.f41844B1, (float) this.f41886P1);
            Path path8 = this.f41884P;
            Intrinsics.m18596d(path8);
            path8.lineTo((float) (this.f41844B1 - ((double) m14260b(4.0f))), ((float) this.f41886P1) - m14260b(3.0f));
            Path path9 = this.f41884P;
            Intrinsics.m18596d(path9);
            path9.lineTo((float) (this.f41844B1 - ((double) m14260b(4.0f))), ((float) this.f41886P1) + m14260b(3.0f));
            Path path10 = this.f41884P;
            Intrinsics.m18596d(path10);
            path10.close();
            fM14260b = ((float) (this.f41844B1 - ((double) m14260b(5.0f)))) - rect.width();
        }
        Paint paint2 = this.f41872L;
        Intrinsics.m18596d(paint2);
        paint2.setColor(this.f41980y0);
        Paint paint3 = this.f41872L;
        Intrinsics.m18596d(paint3);
        canvas.drawRoundRect(rectF, 4.0f, 4.0f, paint3);
        Path path11 = this.f41884P;
        Intrinsics.m18596d(path11);
        Paint paint4 = this.f41872L;
        Intrinsics.m18596d(paint4);
        canvas.drawPath(path11, paint4);
        m14273q(this.f41891R0, this.f41897T0);
        float fHeight = (rect.height() / 2.0f) + ((float) this.f41886P1);
        Paint paint5 = this.f41878N;
        Intrinsics.m18596d(paint5);
        canvas.drawText(strM14258k, fM14260b, fHeight, paint5);
        Rect rect2 = new Rect();
        double d2 = this.f41847C1;
        int i2 = this.f41904V1;
        String strM14258k2 = m14258k(this, d2, i2, i2);
        m14273q(this.f41894S0, this.f41900U0);
        Paint paint6 = this.f41878N;
        Intrinsics.m18596d(paint6);
        paint6.getTextBounds(strM14258k2, 0, strM14258k2.length(), rect2);
        if (this.f41853E1 + ((double) rect2.width()) + ((double) m14260b(8.0f)) < ((Number) AbstractC0000a.m8e(1, arrayList)).floatValue()) {
            rectF2 = new RectF((float) (this.f41853E1 + ((double) m14260b(3.0f))), ((float) this.f41892R1) - m14260b(7.0f), (float) (this.f41853E1 + ((double) rect2.width()) + ((double) m14260b(8.0f))), ((float) this.f41892R1) + m14260b(7.0f));
            Path path12 = this.f41884P;
            Intrinsics.m18596d(path12);
            path12.reset();
            Path path13 = this.f41884P;
            Intrinsics.m18596d(path13);
            path13.moveTo((float) this.f41853E1, (float) this.f41892R1);
            Path path14 = this.f41884P;
            Intrinsics.m18596d(path14);
            path14.lineTo((float) (this.f41853E1 + ((double) m14260b(4.0f))), ((float) this.f41892R1) - m14260b(3.0f));
            Path path15 = this.f41884P;
            Intrinsics.m18596d(path15);
            path15.lineTo((float) (this.f41853E1 + ((double) m14260b(4.0f))), ((float) this.f41892R1) + m14260b(3.0f));
            Path path16 = this.f41884P;
            Intrinsics.m18596d(path16);
            path16.close();
            fM14260b2 = (float) (this.f41853E1 + ((double) m14260b(5.0f)));
        } else {
            rectF2 = new RectF((float) (this.f41853E1 - ((double) m14260b(3.0f))), ((float) this.f41892R1) - m14260b(7.0f), (float) ((this.f41853E1 - ((double) rect2.width())) - ((double) m14260b(8.0f))), ((float) this.f41892R1) + m14260b(7.0f));
            Path path17 = this.f41884P;
            Intrinsics.m18596d(path17);
            path17.reset();
            Path path18 = this.f41884P;
            Intrinsics.m18596d(path18);
            path18.moveTo((float) this.f41853E1, (float) this.f41892R1);
            Path path19 = this.f41884P;
            Intrinsics.m18596d(path19);
            path19.lineTo((float) (this.f41853E1 - ((double) m14260b(4.0f))), ((float) this.f41892R1) - m14260b(3.0f));
            Path path20 = this.f41884P;
            Intrinsics.m18596d(path20);
            path20.lineTo((float) (this.f41853E1 - ((double) m14260b(4.0f))), ((float) this.f41892R1) + m14260b(3.0f));
            Path path21 = this.f41884P;
            Intrinsics.m18596d(path21);
            path21.close();
            fM14260b2 = ((float) (this.f41853E1 - ((double) m14260b(5.0f)))) - rect2.width();
        }
        Paint paint7 = this.f41872L;
        Intrinsics.m18596d(paint7);
        paint7.setColor(this.f41983z0);
        Paint paint8 = this.f41872L;
        Intrinsics.m18596d(paint8);
        canvas.drawRoundRect(rectF2, 4.0f, 4.0f, paint8);
        Path path22 = this.f41884P;
        Intrinsics.m18596d(path22);
        Paint paint9 = this.f41872L;
        Intrinsics.m18596d(paint9);
        canvas.drawPath(path22, paint9);
        m14273q(this.f41894S0, this.f41900U0);
        float fHeight2 = (rect2.height() / 2.0f) + ((float) this.f41892R1);
        Paint paint10 = this.f41878N;
        Intrinsics.m18596d(paint10);
        canvas.drawText(strM14258k2, fM14260b2, fHeight2, paint10);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message msg) {
        int i;
        Intrinsics.m18599g(msg, "msg");
        int i2 = msg.what;
        if (i2 == 100) {
            invalidate();
            return false;
        }
        if (i2 != 101) {
            return false;
        }
        KData kData = (KData) AbstractC0000a.m8e(1, this.f41916b0);
        ArrayList arrayList = this.f41905W;
        int size = arrayList.size();
        int i3 = size - 1;
        if (kData.f41812a == ((KData) arrayList.get(i3)).f41812a) {
            arrayList.remove(i3);
        }
        arrayList.add(kData);
        int i4 = this.f41921d;
        if (size < i4 || (i = this.f41912a) != (size - i4) - 1) {
            m14274r();
            return false;
        }
        this.f41912a = i + 1;
        m14274r();
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final String m14267j(double d) {
        if (d < 1.0d) {
            int i = this.f41904V1;
            return m14258k(this, d, i, i);
        }
        if (d < 10.0d) {
            int i2 = this.f41904V1;
            return m14258k(this, d, i2, i2);
        }
        if (d < 100.0d) {
            int i3 = this.f41904V1;
            return m14258k(this, d, i3, i3);
        }
        if (d < 1000.0d) {
            int i4 = this.f41904V1;
            return m14258k(this, d, i4, i4);
        }
        if (d < 1000000.0d) {
            double d2 = d / ((double) 1000);
            int i5 = this.f41904V1;
            return m14258k(this, d2, i5, i5).concat("K");
        }
        if (d < 1.0E9d) {
            double d3 = d / ((double) 1000000);
            int i6 = this.f41904V1;
            return m14258k(this, d3, i6, i6).concat("M");
        }
        if (d < 1.0E12d) {
            double d4 = d / ((double) 1000000000);
            int i7 = this.f41904V1;
            return m14258k(this, d4, i7, i7).concat("B");
        }
        double d5 = d / 1000000000000L;
        int i8 = this.f41904V1;
        return m14258k(this, d5, i8, i8).concat("T");
    }

    /* JADX INFO: renamed from: l */
    public final String m14268l(double d) {
        if (d < 1000.0d) {
            int i = this.f41904V1;
            return m14258k(this, d, i, i);
        }
        if (d < 1000000.0d) {
            double d2 = d / ((double) 1000);
            int i2 = this.f41904V1;
            return m14258k(this, d2, i2, i2).concat("K");
        }
        if (d < 1.0E9d) {
            double d3 = d / ((double) 1000000);
            int i3 = this.f41904V1;
            return m14258k(this, d3, i3, i3).concat("M");
        }
        if (d < 1.0E12d) {
            double d4 = d / ((double) 1000000000);
            int i4 = this.f41904V1;
            return m14258k(this, d4, i4, i4).concat("B");
        }
        double d5 = d / 1000000000000L;
        int i5 = this.f41904V1;
        return m14258k(this, d5, i5, i5).concat("T");
    }

    /* JADX INFO: renamed from: m */
    public final void m14269m(float f) {
        String str;
        boolean z2 = this.f41929g;
        ArrayList arrayList = this.f41913a0;
        if (!z2) {
            this.f41947n0 = (KData) AbstractC0000a.m8e(1, arrayList);
            return;
        }
        ArrayList arrayList2 = this.f41919c0;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            double d = f;
            if (((KData) arrayList.get(i)).f41806B <= d && ((KData) arrayList.get(i)).f41807C >= d) {
                KData kData = (KData) arrayList.get(i);
                this.f41947n0 = kData;
                Intrinsics.m18596d(kData);
                long j = kData.f41812a;
                if (j <= 0) {
                    str = "";
                } else {
                    str = new SimpleDateFormat("yyyy-MM-dd").format(new Date(j));
                    Intrinsics.m18598f(str, "format(...)");
                }
                arrayList2.add(str);
                KData kData2 = this.f41947n0;
                Intrinsics.m18596d(kData2);
                int i2 = this.f41904V1;
                arrayList2.add(m14258k(this, kData2.f41813b, i2, i2));
                KData kData3 = this.f41947n0;
                Intrinsics.m18596d(kData3);
                int i3 = this.f41904V1;
                arrayList2.add(m14258k(this, kData3.f41815d, i3, i3));
                KData kData4 = this.f41947n0;
                Intrinsics.m18596d(kData4);
                int i4 = this.f41904V1;
                arrayList2.add(m14258k(this, kData4.f41816e, i4, i4));
                KData kData5 = this.f41947n0;
                Intrinsics.m18596d(kData5);
                int i5 = this.f41904V1;
                arrayList2.add(m14258k(this, kData5.f41814c, i5, i5));
                KData kData6 = this.f41947n0;
                Intrinsics.m18596d(kData6);
                double dM14255a = kData6.m14255a();
                if (dM14255a > 0.0d) {
                    int i6 = this.f41904V1;
                    arrayList2.add(Marker.ANY_NON_NULL_MARKER.concat(m14258k(this, dM14255a, i6, i6)));
                    KData kData7 = this.f41947n0;
                    Intrinsics.m18596d(kData7);
                    double dM14256b = kData7.m14256b() * ((double) 100);
                    int i7 = this.f41904V1;
                    arrayList2.add(m14258k(this, dM14256b, i7, i7).concat("%"));
                } else {
                    int i8 = this.f41904V1;
                    arrayList2.add(m14258k(this, dM14255a, i8, i8));
                    KData kData8 = this.f41947n0;
                    Intrinsics.m18596d(kData8);
                    double dM14256b2 = kData8.m14256b() * ((double) 100);
                    int i9 = this.f41904V1;
                    arrayList2.add(m14258k(this, dM14256b2, i9, i9).concat("%"));
                }
                KData kData9 = this.f41947n0;
                Intrinsics.m18596d(kData9);
                arrayList2.add(m14267j(kData9.f41817f));
                KData kData10 = this.f41947n0;
                Intrinsics.m18596d(kData10);
                arrayList2.add(m14267j(kData10.f41818g));
                return;
            }
            this.f41947n0 = null;
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m14270n(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = this.f41905W;
        if (arrayList2.size() > 0) {
            return;
        }
        arrayList2.addAll(arrayList);
        this.f41912a = arrayList2.size() - this.f41921d;
        QuotaUtil.m14302g(arrayList2, false);
        m14274r();
    }

    /* JADX INFO: renamed from: o */
    public final void m14271o() {
        ArrayList arrayList = this.f41905W;
        if (arrayList == null || this.f41912a > arrayList.size() / 3 || !this.f41949o) {
            return;
        }
        this.f41949o = false;
        OnRequestDataListListener onRequestDataListListener = this.f41950o0;
        if (onRequestDataListListener != null) {
            onRequestDataListListener.mo13851a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0033  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        int i;
        int i2;
        Canvas canvas2;
        String str;
        String strM14258k;
        String strM14258k2;
        String str2;
        String str3;
        String strM14258k3;
        int i3;
        Intrinsics.m18599g(canvas, "canvas");
        super.onDraw(canvas);
        if (this.f41905W.isEmpty()) {
            return;
        }
        ArrayList<KData> arrayList = this.f41913a0;
        if (arrayList.isEmpty()) {
            return;
        }
        float f = this.f41925e1;
        ArrayList arrayList2 = this.f41922d0;
        ArrayList arrayList3 = this.f41924e0;
        if (f == 0.0f) {
            i = 3;
        } else {
            float fM14260b = ((f - this.f41920c1) - m14260b(46.0f)) / 4;
            arrayList3.clear();
            for (int i4 = 0; i4 < 5; i4++) {
                arrayList3.add(Float.valueOf((i4 * fM14260b) + this.f41920c1 + m14260b(6.0f)));
            }
            this.f41954p1 = ((this.f41928f1 - this.f41923d1) - m14260b(38.0f)) / 5;
            arrayList2.clear();
            for (int i5 = 0; i5 < 6; i5++) {
                arrayList2.add(Float.valueOf((this.f41954p1 * i5) + this.f41923d1 + m14260b(18.0f)));
            }
            this.f41963s1 = ((Number) arrayList2.get(4)).floatValue() + m14260b(12.0f);
            this.f41862H1 = (((Number) AbstractC0000a.m8e(1, arrayList3)).floatValue() - ((Number) arrayList3.get(0)).floatValue()) / this.f41921d;
            this.f41984z1 = ((KData) arrayList.get(0)).f41815d;
            this.f41847C1 = ((KData) arrayList.get(0)).f41816e;
            this.f41856F1 = ((KData) arrayList.get(0)).f41817f;
            this.f41895S1 = ((KData) arrayList.get(0)).f41830s;
            this.f41898T1 = ((KData) arrayList.get(0)).f41830s;
            double d = ((KData) arrayList.get(0)).f41831t;
            double d2 = ((KData) arrayList.get(0)).f41831t;
            double d3 = ((KData) arrayList.get(0)).f41832u;
            double d4 = ((KData) arrayList.get(0)).f41832u;
            double d5 = d;
            this.f41901U1 = ((KData) arrayList.get(0)).f41833v;
            double d6 = ((KData) arrayList.get(0)).f41834w;
            double d7 = d4;
            double d8 = ((KData) arrayList.get(0)).f41835x;
            int size = arrayList.size();
            int i6 = 0;
            while (i6 < size) {
                KData kData = (KData) arrayList.get(i6);
                int i7 = size;
                double d9 = this.f41862H1;
                double dDoubleValue = ((Number) AbstractC0000a.m8e(1, arrayList3)).doubleValue() - (((arrayList.size() - i6) - 1) * d9);
                double d10 = d2;
                double d11 = dDoubleValue - d9;
                double d12 = d3;
                double d13 = d8;
                double d14 = d9 / ((double) 2);
                kData.f41806B = d11;
                kData.f41807C = dDoubleValue;
                kData.f41808D = dDoubleValue - d14;
                double d15 = this.f41984z1;
                double d16 = kData.f41815d;
                if (d16 >= d15) {
                    this.f41984z1 = d16;
                    this.f41844B1 = d14 + d11;
                }
                double d17 = this.f41847C1;
                double d18 = kData.f41816e;
                if (d18 <= d17) {
                    this.f41847C1 = d18;
                    this.f41853E1 = d14 + d11;
                }
                double d19 = this.f41856F1;
                double d20 = kData.f41817f;
                if (d20 >= d19) {
                    this.f41856F1 = d20;
                }
                if (!this.vicePicShow || this.f41955q) {
                    d2 = d10;
                    d3 = d12;
                    d8 = d13;
                } else {
                    int i8 = this.f41961s;
                    if (i8 == 1) {
                        double d21 = kData.f41830s;
                        if (d21 >= this.f41895S1) {
                            this.f41895S1 = d21;
                        }
                        if (d21 <= this.f41898T1) {
                            this.f41898T1 = d21;
                        }
                        double d22 = kData.f41831t;
                        if (d22 >= d5) {
                            d5 = d22;
                        }
                        d2 = d22 <= d10 ? d22 : d10;
                        double d23 = kData.f41832u;
                        d3 = d23 >= d12 ? d23 : d12;
                        if (d23 <= d7) {
                            d7 = d23;
                        }
                        d8 = d13;
                    } else {
                        if (i8 == 2) {
                            double d24 = kData.f41833v;
                            if (d24 >= this.f41901U1) {
                                this.f41901U1 = d24;
                            }
                            double d25 = kData.f41834w;
                            if (d25 >= d6) {
                                d6 = d25;
                            }
                            double d26 = kData.f41835x;
                            if (d26 >= d13) {
                                d8 = d26;
                                d2 = d10;
                                d3 = d12;
                            }
                        }
                        d2 = d10;
                        d3 = d12;
                        d8 = d13;
                    }
                }
                i6++;
                size = i7;
            }
            double d27 = d2;
            double d28 = d3;
            double d29 = d8;
            double d30 = this.f41984z1;
            double d31 = this.f41847C1;
            double d32 = (d30 - d31) * 0.1d;
            this.f41841A1 = d30 + d32;
            this.f41850D1 = d31 - d32;
            if (this.vicePicShow) {
                this.f41960r1 = ((Number) arrayList2.get(3)).floatValue();
                this.f41951o1 = ((Number) arrayList2.get(4)).floatValue();
            } else {
                this.f41960r1 = ((Number) arrayList2.get(4)).floatValue();
                this.f41951o1 = ((Number) arrayList2.get(5)).floatValue();
            }
            this.f41859G1 = ((double) (this.f41960r1 - ((Number) arrayList2.get(0)).floatValue())) / (this.f41841A1 - this.f41850D1);
            this.f41886P1 = ((this.f41841A1 - this.f41984z1) * this.f41859G1) + ((Number) arrayList2.get(0)).doubleValue();
            this.f41892R1 = ((this.f41841A1 - this.f41847C1) * this.f41859G1) + ((Number) arrayList2.get(0)).doubleValue();
            this.f41865I1 = ((double) (((Number) AbstractC0000a.m8e(1, arrayList2)).floatValue() - this.f41963s1)) / this.f41856F1;
            for (KData kData2 : arrayList) {
                double d33 = kData2.f41813b;
                kData2.f41809E = ((this.f41841A1 - kData2.f41814c) * this.f41859G1) + ((Number) arrayList2.get(0)).doubleValue();
                kData2.f41810F = ((this.f41841A1 - d33) * this.f41859G1) + ((Number) arrayList2.get(0)).doubleValue();
            }
            if (this.vicePicShow) {
                int i9 = this.f41961s;
                if (i9 == 1) {
                    i = 3;
                    double d34 = this.f41895S1;
                    if (d34 > 0.0d && this.f41898T1 < 0.0d) {
                        double dFloatValue = ((double) (((Number) AbstractC0000a.m8e(1, arrayList2)).floatValue() - this.f41963s1)) / Math.abs(this.f41895S1 - this.f41898T1);
                        this.f41868J1 = dFloatValue;
                        this.f41966t1 = (float) ((this.f41895S1 * dFloatValue) + ((double) this.f41963s1));
                    } else if (d34 <= 0.0d) {
                        this.f41868J1 = ((double) (((Number) AbstractC0000a.m8e(1, arrayList2)).floatValue() - this.f41963s1)) / Math.abs(this.f41898T1);
                        this.f41966t1 = this.f41963s1;
                    } else {
                        if (this.f41898T1 >= 0.0d) {
                            i2 = 1;
                            this.f41868J1 = ((double) (((Number) AbstractC0000a.m8e(1, arrayList2)).floatValue() - this.f41963s1)) / Math.abs(this.f41895S1);
                            this.f41966t1 = ((Number) AbstractC0000a.m8e(1, arrayList2)).floatValue();
                        }
                        if (d5 <= 0.0d && d27 < 0.0d) {
                            this.f41871K1 = ((double) ((((Number) AbstractC0000a.m8e(i2, arrayList2)).floatValue() - this.f41963s1) - m14260b(24.0f))) / (d5 - d27);
                        } else if (d5 > 0.0d) {
                            this.f41871K1 = ((double) ((((Number) AbstractC0000a.m8e(1, arrayList2)).floatValue() - this.f41963s1) - m14260b(24.0f))) / Math.abs(d27);
                        } else if (d27 >= 0.0d) {
                            this.f41871K1 = ((double) ((((Number) AbstractC0000a.m8e(1, arrayList2)).floatValue() - this.f41963s1) - m14260b(24.0f))) / Math.abs(d5);
                        }
                        if (d28 <= 0.0d && d7 < 0.0d) {
                            this.f41874L1 = ((double) ((((Number) AbstractC0000a.m8e(1, arrayList2)).floatValue() - this.f41963s1) - m14260b(24.0f))) / (d28 - d7);
                        } else if (d28 > 0.0d) {
                            this.f41874L1 = ((double) ((((Number) AbstractC0000a.m8e(1, arrayList2)).floatValue() - this.f41963s1) - m14260b(24.0f))) / Math.abs(d7);
                        } else if (d7 >= 0.0d) {
                            this.f41874L1 = ((double) ((((Number) AbstractC0000a.m8e(1, arrayList2)).floatValue() - this.f41963s1) - m14260b(24.0f))) / Math.abs(d28);
                        }
                    }
                    i2 = 1;
                    if (d5 <= 0.0d) {
                        if (d5 > 0.0d) {
                        }
                        if (d28 <= 0.0d) {
                            if (d28 > 0.0d) {
                            }
                        }
                    }
                } else if (i9 != 2) {
                    i = 3;
                    if (i9 == 3) {
                        this.f41889Q1 = (((Number) AbstractC0000a.m8e(1, arrayList2)).floatValue() - this.f41963s1) / 100;
                    }
                } else {
                    i = 3;
                    this.f41877M1 = ((double) ((((Number) AbstractC0000a.m8e(1, arrayList2)).floatValue() - this.f41963s1) - m14260b(12.0f))) / this.f41901U1;
                    this.f41880N1 = ((double) ((((Number) AbstractC0000a.m8e(1, arrayList2)).floatValue() - this.f41963s1) - m14260b(12.0f))) / d6;
                    this.f41883O1 = ((double) ((((Number) AbstractC0000a.m8e(1, arrayList2)).floatValue() - this.f41963s1) - m14260b(12.0f))) / d29;
                }
            }
        }
        m14273q(this.f41873L0, 0);
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            float fFloatValue = ((Number) it.next()).floatValue();
            float fM14260b2 = this.f41923d1 + m14260b(18.0f);
            float fM14260b3 = this.f41928f1 - m14260b(20.0f);
            Paint paint = this.f41869K;
            Intrinsics.m18596d(paint);
            canvas.drawLine(fFloatValue, fM14260b2, fFloatValue, fM14260b3, paint);
            i = i;
        }
        int i10 = i;
        int size2 = arrayList2.size();
        int i11 = 0;
        while (i11 < size2) {
            float fFloatValue2 = (i11 == 0 || i11 == 5 || i11 == 4 || (this.vicePicShow && i11 == i10)) ? this.f41925e1 : ((Number) AbstractC0000a.m8e(1, arrayList3)).floatValue();
            float fM14260b4 = m14260b(6.0f) + this.f41920c1;
            float fFloatValue3 = ((Number) arrayList2.get(i11)).floatValue();
            float fFloatValue4 = ((Number) arrayList2.get(i11)).floatValue();
            Paint paint2 = this.f41869K;
            Intrinsics.m18596d(paint2);
            canvas.drawLine(fM14260b4, fFloatValue3, fFloatValue2, fFloatValue4, paint2);
            i11++;
        }
        float fM14260b5 = m14260b(6.0f) + this.f41920c1;
        float f2 = 2;
        float fFloatValue5 = (this.f41954p1 / f2) + ((Number) arrayList2.get(4)).floatValue();
        float fFloatValue6 = ((Number) AbstractC0000a.m8e(1, arrayList3)).floatValue();
        float fFloatValue7 = (this.f41954p1 / f2) + ((Number) arrayList2.get(4)).floatValue();
        Paint paint3 = this.f41869K;
        Intrinsics.m18596d(paint3);
        canvas.drawLine(fM14260b5, fFloatValue5, fFloatValue6, fFloatValue7, paint3);
        if (this.vicePicShow) {
            float fM14260b6 = m14260b(6.0f) + this.f41920c1;
            float fFloatValue8 = (this.f41954p1 / f2) + ((Number) arrayList2.get(i10)).floatValue();
            float fFloatValue9 = ((Number) AbstractC0000a.m8e(1, arrayList3)).floatValue();
            float fFloatValue10 = (this.f41954p1 / f2) + ((Number) arrayList2.get(i10)).floatValue();
            Paint paint4 = this.f41869K;
            Intrinsics.m18596d(paint4);
            canvas2 = canvas;
            canvas2.drawLine(fM14260b6, fFloatValue8, fFloatValue9, fFloatValue10, paint4);
        } else {
            canvas2 = canvas;
        }
        Rect rect = new Rect();
        m14273q(this.f41852E0, this.f41908X0);
        Paint paint5 = this.f41878N;
        Intrinsics.m18596d(paint5);
        double d35 = this.f41841A1;
        int i12 = this.f41904V1;
        String strM14258k4 = m14258k(this, d35, i12, i12);
        double d36 = this.f41841A1;
        int i13 = this.f41904V1;
        paint5.getTextBounds(strM14258k4, 0, m14258k(this, d36, i13, i13).length(), rect);
        double d37 = this.f41841A1;
        int i14 = this.f41904V1;
        String strM14258k5 = m14258k(this, d37, i14, i14);
        float fFloatValue11 = ((Number) AbstractC0000a.m8e(1, arrayList3)).floatValue() + m14260b(4.0f);
        float fFloatValue12 = ((Number) arrayList2.get(0)).floatValue() + rect.height() + m14260b(2.0f);
        Paint paint6 = this.f41878N;
        Intrinsics.m18596d(paint6);
        canvas2.drawText(strM14258k5, fFloatValue11, fFloatValue12, paint6);
        Paint paint7 = this.f41878N;
        Intrinsics.m18596d(paint7);
        double d38 = this.f41850D1;
        int i15 = this.f41904V1;
        String strM14258k6 = m14258k(this, d38, i15, i15);
        double d39 = this.f41850D1;
        int i16 = this.f41904V1;
        paint7.getTextBounds(strM14258k6, 0, m14258k(this, d39, i16, i16).length(), rect);
        double d40 = this.f41850D1;
        int i17 = this.f41904V1;
        String strM14258k7 = m14258k(this, d40, i17, i17);
        float fFloatValue13 = ((Number) AbstractC0000a.m8e(1, arrayList3)).floatValue() + m14260b(4.0f);
        float fM14260b7 = this.f41960r1 - m14260b(2.0f);
        Paint paint8 = this.f41878N;
        Intrinsics.m18596d(paint8);
        canvas2.drawText(strM14258k7, fFloatValue13, fM14260b7, paint8);
        if (this.vicePicShow) {
            str = "0";
            float f3 = 2.0f;
            double d41 = (this.f41841A1 - this.f41850D1) / ((double) 3);
            int i18 = 0;
            while (i18 < 2) {
                i18++;
                float f4 = f3;
                double d42 = this.f41841A1 - (((double) i18) * d41);
                int i19 = this.f41904V1;
                String strM14258k8 = m14258k(this, d42, i19, i19);
                float fFloatValue14 = ((Number) AbstractC0000a.m8e(1, arrayList3)).floatValue() + m14260b(4.0f);
                float fHeight = (rect.height() / f4) + ((Number) arrayList2.get(i18)).floatValue();
                Paint paint9 = this.f41878N;
                Intrinsics.m18596d(paint9);
                canvas2.drawText(strM14258k8, fFloatValue14, fHeight, paint9);
                f3 = f4;
            }
            float f5 = f3;
            int i20 = this.f41961s;
            if (i20 == 1) {
                double d43 = this.f41895S1;
                if (d43 > 0.0d && this.f41898T1 < 0.0d) {
                    int i21 = this.f41904V1;
                    String strM14258k9 = m14258k(this, d43, i21, i21);
                    double d44 = this.f41898T1;
                    int i22 = this.f41904V1;
                    String strM14258k10 = m14258k(this, d44, i22, i22);
                    double d45 = (this.f41895S1 - this.f41898T1) / ((double) 2);
                    int i23 = this.f41904V1;
                    strM14258k3 = m14258k(this, d45, i23, i23);
                    i3 = 1;
                    str3 = strM14258k10;
                    str2 = strM14258k9;
                } else if (d43 <= 0.0d) {
                    double d46 = this.f41898T1;
                    int i24 = this.f41904V1;
                    String strM14258k11 = m14258k(this, d46, i24, i24);
                    double d47 = (this.f41898T1 - this.f41895S1) / ((double) 2);
                    int i25 = this.f41904V1;
                    strM14258k3 = m14258k(this, d47, i25, i25);
                    i3 = 1;
                    str3 = strM14258k11;
                    str2 = str;
                } else {
                    if (this.f41898T1 >= 0.0d) {
                        int i26 = this.f41904V1;
                        strM14258k = m14258k(this, d43, i26, i26);
                        double d48 = (this.f41895S1 - this.f41898T1) / ((double) 2);
                        int i27 = this.f41904V1;
                        strM14258k2 = m14258k(this, d48, i27, i27);
                        str2 = strM14258k;
                        strM14258k3 = strM14258k2;
                        str3 = str;
                    }
                    str2 = "";
                    str3 = str2;
                    strM14258k3 = str3;
                }
                float fM14260b8 = m14260b(4.0f) + ((Number) AbstractC0000a.m8e(i3, arrayList3)).floatValue();
                float fHeight2 = rect.height() + ((Number) AbstractC0000a.m8e(2, arrayList2)).floatValue() + m14260b(f5);
                Paint paint10 = this.f41878N;
                Intrinsics.m18596d(paint10);
                canvas2.drawText(str2, fM14260b8, fHeight2, paint10);
                float fFloatValue15 = ((Number) AbstractC0000a.m8e(1, arrayList3)).floatValue() + m14260b(4.0f);
                float fHeight3 = (rect.height() / 2.0f) + (((Number) AbstractC0000a.m8e(1, arrayList2)).floatValue() - (this.f41954p1 / f2));
                Paint paint11 = this.f41878N;
                Intrinsics.m18596d(paint11);
                canvas2.drawText(strM14258k3, fFloatValue15, fHeight3, paint11);
                float fFloatValue16 = ((Number) AbstractC0000a.m8e(1, arrayList3)).floatValue() + m14260b(4.0f);
                float fFloatValue17 = ((Number) AbstractC0000a.m8e(1, arrayList2)).floatValue() - m14260b(2.0f);
                Paint paint12 = this.f41878N;
                Intrinsics.m18596d(paint12);
                canvas2.drawText(str3, fFloatValue16, fFloatValue17, paint12);
            } else {
                if (i20 == 2) {
                    double d49 = this.f41901U1;
                    int i28 = this.f41904V1;
                    strM14258k = m14258k(this, d49, i28, i28);
                    double d50 = this.f41901U1 / ((double) 2);
                    int i29 = this.f41904V1;
                    strM14258k2 = m14258k(this, d50, i29, i29);
                } else {
                    if (i20 == 3) {
                        strM14258k = "100";
                        strM14258k2 = "50";
                    }
                    str2 = "";
                    str3 = str2;
                    strM14258k3 = str3;
                }
                str2 = strM14258k;
                strM14258k3 = strM14258k2;
                str3 = str;
            }
            i3 = 1;
            float fM14260b82 = m14260b(4.0f) + ((Number) AbstractC0000a.m8e(i3, arrayList3)).floatValue();
            float fHeight22 = rect.height() + ((Number) AbstractC0000a.m8e(2, arrayList2)).floatValue() + m14260b(f5);
            Paint paint102 = this.f41878N;
            Intrinsics.m18596d(paint102);
            canvas2.drawText(str2, fM14260b82, fHeight22, paint102);
            float fFloatValue152 = ((Number) AbstractC0000a.m8e(1, arrayList3)).floatValue() + m14260b(4.0f);
            float fHeight32 = (rect.height() / 2.0f) + (((Number) AbstractC0000a.m8e(1, arrayList2)).floatValue() - (this.f41954p1 / f2));
            Paint paint112 = this.f41878N;
            Intrinsics.m18596d(paint112);
            canvas2.drawText(strM14258k3, fFloatValue152, fHeight32, paint112);
            float fFloatValue162 = ((Number) AbstractC0000a.m8e(1, arrayList3)).floatValue() + m14260b(4.0f);
            float fFloatValue172 = ((Number) AbstractC0000a.m8e(1, arrayList2)).floatValue() - m14260b(2.0f);
            Paint paint122 = this.f41878N;
            Intrinsics.m18596d(paint122);
            canvas2.drawText(str3, fFloatValue162, fFloatValue172, paint122);
        } else {
            float f6 = 2.0f;
            str = "0";
            double d51 = (this.f41841A1 - this.f41850D1) / ((double) 4);
            int i30 = 0;
            while (i30 < 3) {
                float f7 = f6;
                double d52 = d51;
                i30++;
                double d53 = this.f41841A1 - (((double) i30) * d52);
                int i31 = this.f41904V1;
                String strM14258k12 = m14258k(this, d53, i31, i31);
                float fFloatValue18 = ((Number) AbstractC0000a.m8e(1, arrayList3)).floatValue() + m14260b(4.0f);
                float fHeight4 = (rect.height() / f7) + ((Number) arrayList2.get(i30)).floatValue();
                Paint paint13 = this.f41878N;
                Intrinsics.m18596d(paint13);
                canvas2.drawText(strM14258k12, fFloatValue18, fHeight4, paint13);
                f6 = f7;
                d51 = d52;
            }
        }
        Paint paint14 = this.f41878N;
        Intrinsics.m18596d(paint14);
        paint14.getTextBounds(m14268l(this.f41856F1), 0, m14268l(this.f41856F1).length(), rect);
        String strM14268l = m14268l(this.f41856F1);
        float fFloatValue19 = ((Number) AbstractC0000a.m8e(1, arrayList3)).floatValue() + m14260b(4.0f);
        float fHeight5 = this.f41960r1 + rect.height() + m14260b(2.0f);
        Paint paint15 = this.f41878N;
        Intrinsics.m18596d(paint15);
        canvas2.drawText(strM14268l, fFloatValue19, fHeight5, paint15);
        String strM14268l2 = m14268l(this.f41856F1 / ((double) 2));
        float fFloatValue20 = ((Number) AbstractC0000a.m8e(1, arrayList3)).floatValue() + m14260b(4.0f);
        float fHeight6 = (rect.height() / 2.0f) + (this.f41951o1 - (this.f41954p1 / f2));
        Paint paint16 = this.f41878N;
        Intrinsics.m18596d(paint16);
        canvas2.drawText(strM14268l2, fFloatValue20, fHeight6, paint16);
        float fFloatValue21 = ((Number) AbstractC0000a.m8e(1, arrayList3)).floatValue() + m14260b(4.0f);
        float fM14260b9 = this.f41951o1 - m14260b(2.0f);
        Paint paint17 = this.f41878N;
        Intrinsics.m18596d(paint17);
        canvas2.drawText(str, fFloatValue21, fM14260b9, paint17);
        m14261c(canvas);
        for (KData kData3 : arrayList) {
            if (kData3.f41813b >= kData3.f41814c) {
                Paint paint18 = this.f41872L;
                Intrinsics.m18596d(paint18);
                paint18.setColor(this.f41968u0);
            } else {
                Paint paint19 = this.f41872L;
                Intrinsics.m18596d(paint19);
                paint19.setColor(this.f41965t0);
            }
            float fM14260b10 = (float) (kData3.f41806B + ((double) m14260b(0.5f)));
            float f8 = (float) (((double) this.f41951o1) - (kData3.f41817f * this.f41865I1));
            float fM14260b11 = ((float) kData3.f41807C) - m14260b(0.5f);
            float f9 = this.f41951o1;
            Paint paint20 = this.f41872L;
            Intrinsics.m18596d(paint20);
            canvas2.drawRect(fM14260b10, f8, fM14260b11, f9, paint20);
        }
        if (this.f41955q) {
            this.f41964t = 0;
            if (this.f41884P != null && !arrayList.isEmpty() && this.f41869K != null) {
                Path path = this.f41884P;
                Intrinsics.m18596d(path);
                path.reset();
                Path path2 = this.f41887Q;
                Intrinsics.m18596d(path2);
                path2.reset();
                float f10 = (float) ((KData) arrayList.get(0)).f41808D;
                float f11 = (float) ((KData) arrayList.get(0)).f41809E;
                Path path3 = this.f41884P;
                Intrinsics.m18596d(path3);
                path3.moveTo(f10, f11);
                Path path4 = this.f41887Q;
                Intrinsics.m18596d(path4);
                path4.moveTo(f10, f11);
                int size3 = arrayList.size();
                for (int i32 = 1; i32 < size3; i32++) {
                    KData kData4 = (KData) arrayList.get(i32);
                    Path path5 = this.f41884P;
                    Intrinsics.m18596d(path5);
                    path5.lineTo((float) kData4.f41808D, (float) kData4.f41809E);
                    Path path6 = this.f41887Q;
                    Intrinsics.m18596d(path6);
                    path6.lineTo((float) kData4.f41808D, (float) kData4.f41809E);
                    if (i32 == size3 - 1) {
                        Path path7 = this.f41887Q;
                        Intrinsics.m18596d(path7);
                        path7.lineTo(((Number) arrayList3.get(arrayList3.size() - 1)).floatValue(), (float) kData4.f41809E);
                    }
                }
                m14273q(-12204175, 0);
                Path path8 = this.f41884P;
                Intrinsics.m18596d(path8);
                Paint paint21 = this.f41869K;
                Intrinsics.m18596d(paint21);
                canvas2.drawPath(path8, paint21);
                Path path9 = this.f41887Q;
                Intrinsics.m18596d(path9);
                path9.lineTo(((Number) arrayList3.get(arrayList3.size() - 1)).floatValue(), ((Number) AbstractC0000a.m8e(2, arrayList2)).floatValue());
                Path path10 = this.f41887Q;
                Intrinsics.m18596d(path10);
                path10.lineTo(f10, ((Number) arrayList2.get(arrayList2.size() - 2)).floatValue());
                Path path11 = this.f41887Q;
                Intrinsics.m18596d(path11);
                path11.close();
                LinearGradient linearGradient = new LinearGradient(0.0f, (int) this.f41886P1, 0.0f, ((Number) AbstractC0000a.m8e(2, arrayList2)).floatValue(), 230162176, 1974566, Shader.TileMode.CLAMP);
                Paint paint22 = this.f41875M;
                Intrinsics.m18596d(paint22);
                paint22.setShader(linearGradient);
                Path path12 = this.f41887Q;
                Intrinsics.m18596d(path12);
                Paint paint23 = this.f41875M;
                Intrinsics.m18596d(paint23);
                canvas2.drawPath(path12, paint23);
            }
        } else {
            arrayList.size();
            for (KData kData5 : arrayList) {
                double d54 = kData5.f41813b;
                double d55 = kData5.f41814c;
                if (d54 >= d55) {
                    Paint paint24 = this.f41872L;
                    Intrinsics.m18596d(paint24);
                    paint24.setColor(this.f41968u0);
                    m14273q(this.f41968u0, 0);
                } else {
                    Paint paint25 = this.f41872L;
                    Intrinsics.m18596d(paint25);
                    paint25.setColor(this.f41965t0);
                    m14273q(this.f41965t0, 0);
                    d55 = d54;
                    d54 = d55;
                }
                double d56 = this.f41886P1;
                double d57 = this.f41984z1;
                double d58 = this.f41859G1;
                float f12 = (float) (((d57 - d54) * d58) + d56);
                float f13 = (float) (((d57 - d55) * d58) + d56);
                if (f12 == f13) {
                    f13 = 1 + f12;
                }
                float f14 = f13;
                float fM14260b12 = ((float) kData5.f41806B) + m14260b(0.5f);
                float fM14260b13 = ((float) kData5.f41807C) - m14260b(0.5f);
                Paint paint26 = this.f41872L;
                Intrinsics.m18596d(paint26);
                canvas2.drawRect(fM14260b12, f12, fM14260b13, f14, paint26);
                float f15 = (float) kData5.f41808D;
                double d59 = this.f41886P1;
                double d60 = this.f41984z1;
                double d61 = d60 - kData5.f41815d;
                double d62 = this.f41859G1;
                float f16 = (float) (((d60 - kData5.f41816e) * d62) + d59);
                Paint paint27 = this.f41869K;
                Intrinsics.m18596d(paint27);
                canvas.drawLine(f15, (float) ((d61 * d62) + d59), f15, f16, paint27);
                if (this.vicePicShow && this.f41961s == 1) {
                    double d63 = kData5.f41830s;
                    if (d63 > 0.0d) {
                        Paint paint28 = this.f41872L;
                        Intrinsics.m18596d(paint28);
                        paint28.setColor(this.f41843B0);
                        float fM14260b14 = (float) (kData5.f41806B + ((double) m14260b(0.5f)));
                        float f17 = (float) (((double) this.f41966t1) - (d63 * this.f41868J1));
                        float fM14260b15 = ((float) kData5.f41807C) - m14260b(0.5f);
                        float f18 = this.f41966t1;
                        Paint paint29 = this.f41872L;
                        Intrinsics.m18596d(paint29);
                        canvas2 = canvas;
                        canvas2.drawRect(fM14260b14, f17, fM14260b15, f18, paint29);
                    } else {
                        Paint paint30 = this.f41872L;
                        Intrinsics.m18596d(paint30);
                        paint30.setColor(this.f41846C0);
                        float fM14260b16 = (float) (kData5.f41806B + ((double) m14260b(0.5f)));
                        float f19 = this.f41966t1;
                        float fM14260b17 = ((float) kData5.f41807C) - m14260b(0.5f);
                        float fAbs = (float) ((Math.abs(d63) * this.f41868J1) + ((double) this.f41966t1));
                        Paint paint31 = this.f41872L;
                        Intrinsics.m18596d(paint31);
                        canvas2 = canvas;
                        canvas2.drawRect(fM14260b16, f19, fM14260b17, fAbs, paint31);
                    }
                } else {
                    canvas2 = canvas;
                }
            }
            m14262d(canvas);
            if (this.f41909X1) {
                if (this.f41947n0 != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.f41967u);
                    KData kData6 = this.f41947n0;
                    Intrinsics.m18596d(kData6);
                    double d64 = kData6.f41819h;
                    int i33 = this.f41904V1;
                    sb.append(m14258k(this, d64, i33, i33));
                    String string = sb.toString();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this.f41970v);
                    KData kData7 = this.f41947n0;
                    Intrinsics.m18596d(kData7);
                    double d65 = kData7.f41820i;
                    int i34 = this.f41904V1;
                    sb2.append(m14258k(this, d65, i34, i34));
                    String string2 = sb2.toString();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(this.f41973w);
                    KData kData8 = this.f41947n0;
                    Intrinsics.m18596d(kData8);
                    double d66 = kData8.f41821j;
                    int i35 = this.f41904V1;
                    sb3.append(m14258k(this, d66, i35, i35));
                    String string3 = sb3.toString();
                    m14273q(this.f41971v0, this.f41911Z0);
                    Paint paint32 = this.f41878N;
                    Intrinsics.m18596d(paint32);
                    paint32.getTextBounds(string, 0, string.length(), this.f41890R);
                    float fM14260b18 = this.f41920c1 + m14260b(20.0f);
                    float fHeight7 = this.f41923d1 + r8.height() + m14260b(6.0f);
                    Paint paint33 = this.f41878N;
                    Intrinsics.m18596d(paint33);
                    canvas2.drawText(string, fM14260b18, fHeight7, paint33);
                    m14273q(this.f41974w0, this.f41911Z0);
                    Paint paint34 = this.f41878N;
                    Intrinsics.m18596d(paint34);
                    paint34.getTextBounds(string2, 0, string2.length(), this.f41893S);
                    float fM14260b19 = this.f41920c1 + m14260b(20.0f) + r8.width() + m14260b(10.0f);
                    float fHeight8 = this.f41923d1 + r8.height() + m14260b(6.0f);
                    Paint paint35 = this.f41878N;
                    Intrinsics.m18596d(paint35);
                    canvas2.drawText(string2, fM14260b19, fHeight8, paint35);
                    m14273q(this.f41977x0, this.f41911Z0);
                    Paint paint36 = this.f41878N;
                    Intrinsics.m18596d(paint36);
                    paint36.getTextBounds(string3, 0, string3.length(), this.f41896T);
                    float fM14260b20 = this.f41920c1 + m14260b(20.0f) + r8.width() + r9.width() + (m14260b(10.0f) * 2);
                    float fHeight9 = this.f41923d1 + r8.height() + m14260b(6.0f);
                    Paint paint37 = this.f41878N;
                    Intrinsics.m18596d(paint37);
                    canvas2.drawText(string3, fM14260b20, fHeight9, paint37);
                }
                m14263e(canvas);
            }
            m14266h(canvas);
        }
        m14264f(canvas);
        m14265g(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f41920c1 = getPaddingLeft();
        this.f41923d1 = getPaddingTop();
        this.f41925e1 = getMeasuredWidth() - getPaddingRight();
        this.f41928f1 = getMeasuredHeight() - getPaddingBottom();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View v, MotionEvent event) {
        Intrinsics.m18599g(v, "v");
        Intrinsics.m18599g(event, "event");
        if (this.f41952p) {
            return false;
        }
        GestureDetector gestureDetector = this.f41962s0;
        Intrinsics.m18596d(gestureDetector);
        return gestureDetector.onTouchEvent(event);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c9  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent event) {
        Intrinsics.m18599g(event, "event");
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            this.f41941k1 = event.getX();
            this.f41969u1 = event.getY();
            this.f41957q1 = 0.0f;
            this.f41931g1 = event.getX(0);
            this.f41933h1 = event.getY(0);
            return true;
        }
        if (actionMasked == 1) {
            if (!this.f41952p) {
                float fAbs = Math.abs(event.getX() - this.f41941k1);
                float fAbs2 = Math.abs(event.getY() - this.f41969u1);
                float f = this.f41917b1;
                if (fAbs2 < f && fAbs < f) {
                    this.f41929g = true;
                    if (this.f41964t == 2) {
                        this.f41945m1 = event.getY();
                    }
                    m14269m(this.f41941k1);
                    if (this.f41947n0 != null) {
                        invalidate();
                    }
                }
            }
            this.f41952p = false;
            return true;
        }
        if (actionMasked != 2) {
            if (actionMasked == 3) {
                this.f41952p = false;
                return true;
            }
            if (actionMasked == 5) {
                this.f41929g = false;
                this.f41952p = true;
                removeCallbacks(this.f41959r0);
                this.f41972v1 = event.getX(1);
                float y2 = event.getY(1);
                this.f41936i1 = Math.abs(this.f41972v1 - this.f41931g1);
                this.f41939j1 = Math.abs(y2 - this.f41933h1);
                return true;
            }
        } else if (event.getPointerCount() > 1) {
            float x = event.getX(0);
            float y3 = event.getY(0);
            float x2 = event.getX(1);
            float y4 = event.getY(1);
            float f2 = x2 - x;
            float fAbs3 = Math.abs(f2);
            float f3 = y4 - y3;
            float fAbs4 = Math.abs(f3);
            ArrayList arrayList = this.f41905W;
            ArrayList arrayList2 = this.f41924e0;
            if ((fAbs3 >= fAbs4 && fAbs3 - this.f41936i1 > 1.0f) || (fAbs4 >= fAbs3 && fAbs4 - this.f41939j1 > 1.0f)) {
                int i = this.f41921d;
                int i2 = this.f41915b;
                if (i <= i2) {
                    this.f41921d = i2;
                } else {
                    int size = this.f41913a0.size();
                    int i3 = this.f41921d;
                    if (size < i3) {
                        this.f41921d = i3 - 2;
                        this.f41912a = arrayList.size() - this.f41921d;
                    } else if (this.f41931g1 >= ((Number) arrayList2.get(2)).floatValue() || this.f41972v1 > ((Number) arrayList2.get(2)).floatValue()) {
                        float f4 = this.f41931g1;
                        float f5 = this.f41972v1;
                        float fFloatValue = ((Number) arrayList2.get(2)).floatValue();
                        if (f4 > fFloatValue || fFloatValue > f5) {
                            float f6 = this.f41972v1;
                            float f7 = this.f41931g1;
                            float fFloatValue2 = ((Number) arrayList2.get(2)).floatValue();
                            if (f6 <= fFloatValue2 && fFloatValue2 <= f7) {
                                this.f41921d -= 2;
                                this.f41912a++;
                            } else if (this.f41931g1 >= ((Number) arrayList2.get(2)).floatValue() && this.f41972v1 > ((Number) arrayList2.get(2)).floatValue()) {
                                this.f41921d -= 2;
                                this.f41912a += 2;
                            }
                        }
                    } else {
                        this.f41921d -= 2;
                    }
                }
                m14274r();
            } else if ((fAbs3 >= fAbs4 && fAbs3 - this.f41936i1 < -1.0f) || (fAbs4 >= fAbs3 && fAbs4 - this.f41939j1 < -1.0f)) {
                int i4 = this.f41921d;
                int i5 = this.f41918c;
                if (i4 >= i5) {
                    this.f41921d = i5;
                } else if (this.f41912a + i4 >= arrayList.size()) {
                    this.f41921d += 2;
                    this.f41912a = arrayList.size() - this.f41921d;
                } else if (this.f41912a <= 0) {
                    this.f41912a = 0;
                    this.f41921d += 2;
                } else if (this.f41931g1 >= ((Number) arrayList2.get(2)).floatValue() || this.f41972v1 > ((Number) arrayList2.get(2)).floatValue()) {
                    float f8 = this.f41931g1;
                    float f9 = this.f41972v1;
                    float fFloatValue3 = ((Number) arrayList2.get(2)).floatValue();
                    if (f8 > fFloatValue3 || fFloatValue3 > f9) {
                        float f10 = this.f41972v1;
                        float f11 = this.f41931g1;
                        float fFloatValue4 = ((Number) arrayList2.get(2)).floatValue();
                        if (f10 <= fFloatValue4 && fFloatValue4 <= f11) {
                            this.f41921d += 2;
                            this.f41912a--;
                        } else if (this.f41931g1 >= ((Number) arrayList2.get(2)).floatValue() && this.f41972v1 > ((Number) arrayList2.get(2)).floatValue()) {
                            this.f41921d += 2;
                            this.f41912a -= 2;
                        }
                    }
                } else {
                    this.f41921d += 2;
                }
                m14274r();
            }
            this.f41936i1 = Math.abs(f2);
            this.f41939j1 = Math.abs(f3);
        }
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final void m14272p(ArrayList arrayList, boolean z2) {
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = this.f41913a0;
        long j = arrayList2.size() > 0 ? ((KData) arrayList2.get(0)).f41812a : 0L;
        this.f41929g = false;
        ArrayList arrayList3 = this.f41905W;
        arrayList3.clear();
        arrayList3.addAll(arrayList);
        QuotaUtil.m14302g(arrayList3, false);
        int i = this.f41958r;
        if (i == 1) {
            QuotaUtil.m14299d(arrayList3, false);
        } else if (i == 2) {
            QuotaUtil.m14298c(arrayList3, false);
        }
        int i2 = this.f41961s;
        if (i2 == 1) {
            QuotaUtil.m14301f(arrayList3, false);
        } else if (i2 == 2) {
            QuotaUtil.m14300e(arrayList3, false);
        } else if (i2 == 3) {
            QuotaUtil.m14303h(arrayList3, false);
        }
        if (z2) {
            int size = arrayList3.size() / 2;
            this.f41912a = -1;
            if (((KData) arrayList3.get(0)).f41812a <= j && ((KData) arrayList3.get(size)).f41812a > j) {
                int i3 = 0;
                while (true) {
                    if (i3 < size) {
                        int i4 = i3 + 1;
                        if (i4 < arrayList3.size() && ((KData) arrayList3.get(i3)).f41812a <= j && ((KData) arrayList3.get(i4)).f41812a > j) {
                            this.f41912a = i3;
                            break;
                        }
                        i3 = i4;
                    } else {
                        break;
                    }
                }
            } else if (((KData) arrayList3.get(size)).f41812a <= j && ((KData) AbstractC0000a.m8e(1, arrayList3)).f41812a >= j) {
                int size2 = arrayList3.size();
                while (true) {
                    if (size < size2) {
                        int i5 = size + 1;
                        if (i5 < arrayList3.size() && ((KData) arrayList3.get(size)).f41812a <= j && ((KData) arrayList3.get(i5)).f41812a > j) {
                            this.f41912a = size;
                            break;
                        }
                        size = i5;
                    } else {
                        break;
                    }
                }
            }
            if (arrayList3.size() < this.f41921d) {
                this.f41912a = 0;
            } else {
                int size3 = arrayList3.size();
                int i6 = this.f41912a;
                if (size3 - i6 < this.f41921d || i6 == -1) {
                    this.f41912a = arrayList3.size() - this.f41921d;
                }
            }
        } else {
            this.f41912a = arrayList3.size() >= this.f41921d ? arrayList3.size() - this.f41921d : 0;
        }
        m14274r();
    }

    /* JADX INFO: renamed from: q */
    public final void m14273q(int i, int i2) {
        Paint paint = this.f41869K;
        Intrinsics.m18596d(paint);
        paint.setColor(i);
        Paint paint2 = this.f41869K;
        Intrinsics.m18596d(paint2);
        float f = i2;
        paint2.setTextSize(m14276t(f));
        Paint paint3 = this.f41878N;
        Intrinsics.m18596d(paint3);
        paint3.setColor(i);
        Paint paint4 = this.f41878N;
        Intrinsics.m18596d(paint4);
        paint4.setTextSize(m14276t(f));
    }

    /* JADX INFO: renamed from: r */
    public final void m14274r() {
        ArrayList arrayList = this.f41913a0;
        arrayList.clear();
        int i = this.f41921d;
        ArrayList arrayList2 = this.f41905W;
        int iMin = Math.min(i, arrayList2.size());
        int i2 = 0;
        if (this.f41912a >= 0) {
            while (i2 < iMin) {
                if (this.f41912a + i2 < arrayList2.size()) {
                    arrayList.add(arrayList2.get(this.f41912a + i2));
                }
                i2++;
            }
        } else {
            while (i2 < iMin) {
                arrayList.add(arrayList2.get(i2));
                i2++;
            }
        }
        if (arrayList.size() > 0 && !this.f41929g) {
            this.f41947n0 = (KData) AbstractC0000a.m8e(1, arrayList);
        } else if (arrayList.isEmpty()) {
            this.f41947n0 = null;
        }
        invalidate();
    }

    /* JADX INFO: renamed from: s */
    public final void m14275s(double d, float f) {
        this.f41912a += (Math.abs(f) <= 1.0f || Math.abs(f) >= 2.0f) ? Math.abs(f) < 10.0f ? ((int) f) % 2 : (int) (((double) ((int) f)) / d) : ((int) (f * 10)) % 2;
    }

    public final void setCrossHairMoveMode(int moveMode) {
        this.f41964t = moveMode;
    }

    public final void setDeputyImgType(int type) {
        this.f41961s = type;
        ArrayList arrayList = this.f41905W;
        if (type == 1) {
            QuotaUtil.m14301f(arrayList, false);
        } else if (type == 2) {
            QuotaUtil.m14300e(arrayList, false);
        } else if (type == 3) {
            QuotaUtil.m14303h(arrayList, false);
        }
        invalidate();
    }

    public final void setDeputyPicShow(boolean showState) {
        this.vicePicShow = showState;
        if (showState) {
            setDeputyImgType(this.f41961s);
        }
        invalidate();
    }

    public final void setFixed(int num) {
        this.f41904V1 = num;
    }

    public final void setMainImgType(int type) {
        ArrayList arrayList = this.f41905W;
        if (type == 0) {
            QuotaUtil.m14302g(arrayList, false);
        } else if (type == 1) {
            QuotaUtil.m14299d(arrayList, false);
        } else if (type == 2) {
            QuotaUtil.m14298c(arrayList, false);
        }
        this.f41958r = type;
        invalidate();
    }

    public final void setOnRequestDataListListener(@Nullable OnRequestDataListListener requestListener) {
        this.f41950o0 = requestListener;
    }

    public final void setShowInstant(boolean state) {
        this.f41955q = state;
        invalidate();
    }

    /* JADX INFO: renamed from: t */
    public final int m14276t(float f) {
        return (int) ((f * getContext().getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }
}
