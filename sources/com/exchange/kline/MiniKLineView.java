package com.exchange.kline;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
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
import com.exchange.kline.data.FuturesKlinePosition;
import io.intercom.android.sdk.models.AttributeType;
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
@Metadata(m18301d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000f\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0003/01J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\r\u0010\fJ\u0015\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0011J\u0015\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b\u0018\u0010\u0011J\u0015\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u000e¢\u0006\u0004\b\u001a\u0010\u0011J\u0015\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0014¢\u0006\u0004\b\u001c\u0010\u0017J\u0015\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010!\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b!\u0010 J\u0015\u0010\"\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\"\u0010 J\u0015\u0010%\u001a\u00020\u00062\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u0015\u0010'\u001a\u00020\u00062\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b'\u0010&J\u0015\u0010(\u001a\u00020\u00062\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b(\u0010&R$\u0010.\u001a\u00020\u00142\u0006\u0010)\u001a\u00020\u00148\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u00062"}, m18302d2 = {"Lcom/exchange/kline/MiniKLineView;", "Landroid/view/View;", "Landroid/view/View$OnTouchListener;", "Landroid/os/Handler$Callback;", "Lcom/exchange/kline/MiniKLineView$OnRequestDataListListener;", "requestListener", "", "setOnRequestDataListListener", "(Lcom/exchange/kline/MiniKLineView$OnRequestDataListListener;)V", "", "Lcom/exchange/kline/KData;", "getTotalDataList", "()Ljava/util/List;", "getViewDataList", "", "num", "setFixed", "(I)V", "type", "setMainImgType", "", "showState", "setDeputyPicShow", "(Z)V", "setDeputyImgType", "moveMode", "setCrossHairMoveMode", "state", "setShowInstant", "Landroid/graphics/Bitmap;", "bitmap", "setCloseBitmap", "(Landroid/graphics/Bitmap;)V", "setSideBuyBitmap", "setSideSellBitmap", "", AttributeType.TEXT, "setLiqPriceText", "(Ljava/lang/String;)V", "setMarginText", "setPnlText", "value", "f", "Z", "getVicePicShow", "()Z", "vicePicShow", "OnRequestDataListListener", "CustomGestureListener", "Companion", "kline_release"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
@SourceDebugExtension
public final class MiniKLineView extends View implements View.OnTouchListener, Handler.Callback {

    /* JADX INFO: renamed from: x1 */
    public static final /* synthetic */ int f41987x1 = 0;

    /* JADX INFO: renamed from: A */
    public final Paint f41988A;

    /* JADX INFO: renamed from: A0 */
    public final int f41989A0;

    /* JADX INFO: renamed from: B */
    public final Path f41990B;

    /* JADX INFO: renamed from: B0 */
    public float f41991B0;

    /* JADX INFO: renamed from: C */
    public final Path f41992C;

    /* JADX INFO: renamed from: C0 */
    public float f41993C0;

    /* JADX INFO: renamed from: D */
    public final Rect f41994D;

    /* JADX INFO: renamed from: D0 */
    public float f41995D0;

    /* JADX INFO: renamed from: E */
    public final String[] f41996E;

    /* JADX INFO: renamed from: E0 */
    public float f41997E0;

    /* JADX INFO: renamed from: F */
    public final ArrayList f41998F;

    /* JADX INFO: renamed from: F0 */
    public float f41999F0;

    /* JADX INFO: renamed from: G */
    public final ArrayList f42000G;

    /* JADX INFO: renamed from: G0 */
    public float f42001G0;

    /* JADX INFO: renamed from: H */
    public final ArrayList f42002H;

    /* JADX INFO: renamed from: H0 */
    public float f42003H0;

    /* JADX INFO: renamed from: I */
    public final ArrayList f42004I;

    /* JADX INFO: renamed from: I0 */
    public float f42005I0;

    /* JADX INFO: renamed from: J */
    public final ArrayList f42006J;

    /* JADX INFO: renamed from: J0 */
    public float f42007J0;

    /* JADX INFO: renamed from: K */
    public final ArrayList f42008K;

    /* JADX INFO: renamed from: K0 */
    public final float f42009K0;

    /* JADX INFO: renamed from: L */
    public KData f42010L;

    /* JADX INFO: renamed from: L0 */
    public float f42011L0;

    /* JADX INFO: renamed from: M */
    public OnRequestDataListListener f42012M;

    /* JADX INFO: renamed from: M0 */
    public float f42013M0;

    /* JADX INFO: renamed from: N */
    public final QuotaThread f42014N;

    /* JADX INFO: renamed from: N0 */
    public float f42015N0;

    /* JADX INFO: renamed from: O */
    public final MiniKLineView$initStopDelay$1 f42016O;

    /* JADX INFO: renamed from: O0 */
    public float f42017O0;

    /* JADX INFO: renamed from: P */
    public final RunnableC0015a f42018P;

    /* JADX INFO: renamed from: P0 */
    public float f42019P0;

    /* JADX INFO: renamed from: Q */
    public final GestureDetector f42020Q;

    /* JADX INFO: renamed from: Q0 */
    public float f42021Q0;

    /* JADX INFO: renamed from: R */
    public final int f42022R;

    /* JADX INFO: renamed from: R0 */
    public float f42023R0;

    /* JADX INFO: renamed from: S */
    public final int f42024S;

    /* JADX INFO: renamed from: S0 */
    public float f42025S0;

    /* JADX INFO: renamed from: T */
    public final int f42026T;

    /* JADX INFO: renamed from: T0 */
    public float f42027T0;

    /* JADX INFO: renamed from: U */
    public final int f42028U;

    /* JADX INFO: renamed from: U0 */
    public float f42029U0;

    /* JADX INFO: renamed from: V */
    public final int f42030V;

    /* JADX INFO: renamed from: V0 */
    public float f42031V0;

    /* JADX INFO: renamed from: W */
    public final int f42032W;

    /* JADX INFO: renamed from: W0 */
    public float f42033W0;

    /* JADX INFO: renamed from: X0 */
    public float f42034X0;

    /* JADX INFO: renamed from: Y0 */
    public double f42035Y0;

    /* JADX INFO: renamed from: Z0 */
    public double f42036Z0;

    /* JADX INFO: renamed from: a */
    public int f42037a;

    /* JADX INFO: renamed from: a0 */
    public final int f42038a0;

    /* JADX INFO: renamed from: a1 */
    public double f42039a1;

    /* JADX INFO: renamed from: b */
    public final int f42040b;

    /* JADX INFO: renamed from: b0 */
    public final int f42041b0;

    /* JADX INFO: renamed from: b1 */
    public double f42042b1;

    /* JADX INFO: renamed from: c */
    public final int f42043c;

    /* JADX INFO: renamed from: c0 */
    public final int f42044c0;

    /* JADX INFO: renamed from: c1 */
    public double f42045c1;

    /* JADX INFO: renamed from: d */
    public int f42046d;

    /* JADX INFO: renamed from: d0 */
    public final int f42047d0;

    /* JADX INFO: renamed from: d1 */
    public double f42048d1;

    /* JADX INFO: renamed from: e0 */
    public final int f42049e0;

    /* JADX INFO: renamed from: e1 */
    public double f42050e1;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public boolean vicePicShow;

    /* JADX INFO: renamed from: f0 */
    public final int f42052f0;

    /* JADX INFO: renamed from: f1 */
    public double f42053f1;

    /* JADX INFO: renamed from: g */
    public boolean f42054g;

    /* JADX INFO: renamed from: g0 */
    public final int f42055g0;

    /* JADX INFO: renamed from: g1 */
    public double f42056g1;

    /* JADX INFO: renamed from: h0 */
    public final int f42057h0;

    /* JADX INFO: renamed from: h1 */
    public double f42058h1;

    /* JADX INFO: renamed from: i */
    public boolean f42059i;

    /* JADX INFO: renamed from: i0 */
    public final int f42060i0;

    /* JADX INFO: renamed from: i1 */
    public double f42061i1;

    /* JADX INFO: renamed from: j */
    public final int f42062j;

    /* JADX INFO: renamed from: j0 */
    public final int f42063j0;

    /* JADX INFO: renamed from: j1 */
    public double f42064j1;

    /* JADX INFO: renamed from: k0 */
    public final int f42065k0;

    /* JADX INFO: renamed from: k1 */
    public double f42066k1;

    /* JADX INFO: renamed from: l0 */
    public final int f42067l0;

    /* JADX INFO: renamed from: l1 */
    public double f42068l1;

    /* JADX INFO: renamed from: m0 */
    public final int f42069m0;

    /* JADX INFO: renamed from: m1 */
    public double f42070m1;

    /* JADX INFO: renamed from: n */
    public boolean f42071n;

    /* JADX INFO: renamed from: n0 */
    public final int f42072n0;

    /* JADX INFO: renamed from: n1 */
    public double f42073n1;

    /* JADX INFO: renamed from: o */
    public boolean f42074o;

    /* JADX INFO: renamed from: o0 */
    public final int f42075o0;

    /* JADX INFO: renamed from: o1 */
    public int f42076o1;

    /* JADX INFO: renamed from: p */
    public boolean f42077p;

    /* JADX INFO: renamed from: p0 */
    public final int f42078p0;

    /* JADX INFO: renamed from: p1 */
    public final ArrayList f42079p1;

    /* JADX INFO: renamed from: q */
    public boolean f42080q;

    /* JADX INFO: renamed from: q0 */
    public final int f42081q0;

    /* JADX INFO: renamed from: q1 */
    public final ArrayList f42082q1;

    /* JADX INFO: renamed from: r */
    public int f42083r;

    /* JADX INFO: renamed from: r0 */
    public final int f42084r0;

    /* JADX INFO: renamed from: r1 */
    public Bitmap f42085r1;

    /* JADX INFO: renamed from: s */
    public int f42086s;

    /* JADX INFO: renamed from: s0 */
    public final int f42087s0;

    /* JADX INFO: renamed from: s1 */
    public Bitmap f42088s1;

    /* JADX INFO: renamed from: t */
    public int f42089t;

    /* JADX INFO: renamed from: t0 */
    public final int f42090t0;

    /* JADX INFO: renamed from: t1 */
    public Bitmap f42091t1;

    /* JADX INFO: renamed from: u */
    public final Paint f42092u;

    /* JADX INFO: renamed from: u0 */
    public final int f42093u0;

    /* JADX INFO: renamed from: u1 */
    public String f42094u1;

    /* JADX INFO: renamed from: v */
    public final Paint f42095v;

    /* JADX INFO: renamed from: v0 */
    public final int f42096v0;

    /* JADX INFO: renamed from: v1 */
    public String f42097v1;

    /* JADX INFO: renamed from: w */
    public final Paint f42098w;

    /* JADX INFO: renamed from: w0 */
    public final int f42099w0;

    /* JADX INFO: renamed from: w1 */
    public String f42100w1;

    /* JADX INFO: renamed from: x */
    public final Paint f42101x;

    /* JADX INFO: renamed from: x0 */
    public final int f42102x0;

    /* JADX INFO: renamed from: y */
    public final Paint f42103y;

    /* JADX INFO: renamed from: y0 */
    public final int f42104y0;

    /* JADX INFO: renamed from: z */
    public final Paint f42105z;

    /* JADX INFO: renamed from: z0 */
    public final int f42106z0;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0004¨\u0006\u000e"}, m18302d2 = {"Lcom/exchange/kline/MiniKLineView$Companion;", "", "", "MAIN_IMG_MA", "I", "MAIN_IMG_EMA", "MAIN_IMG_BOLL", "DEPUTY_IMG_VOLUME", "DEPUTY_IMG_MACD", "DEPUTY_IMG_KDJ", "DEPUTY_IMG_RSI", "CROSS_HAIR_MOVE_CLOSE", "CROSS_HAIR_MOVE_OPEN", "CROSS_HAIR_MOVE_FREE", "kline_release"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/kline/MiniKLineView$CustomGestureListener;", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "kline_release"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
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
            MiniKLineView miniKLineView = MiniKLineView.this;
            int i = miniKLineView.f42037a;
            if (i > 0 && i < (miniKLineView.f41998F.size() - 1) - miniKLineView.f42046d) {
                float f3 = 8000.0f;
                if (f > 8000.0f) {
                    f = f3;
                    miniKLineView.f42019P0 = f;
                    miniKLineView.post(miniKLineView.f42016O);
                } else {
                    f3 = -8000.0f;
                    if (f < -8000.0f) {
                    }
                    miniKLineView.f42019P0 = f;
                    miniKLineView.post(miniKLineView.f42016O);
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
            MiniKLineView miniKLineView = MiniKLineView.this;
            int i = miniKLineView.f42037a;
            ArrayList arrayList = miniKLineView.f42000G;
            if (i != 0 || f >= 0.0f) {
                ArrayList arrayList2 = miniKLineView.f41998F;
                if ((i != arrayList2.size() - miniKLineView.f42046d || f <= 0.0f) && miniKLineView.f42037a >= 0 && arrayList.size() >= miniKLineView.f42046d) {
                    miniKLineView.f42054g = false;
                    if (Math.abs(f) > 1.0f) {
                        if (miniKLineView.f42046d < 60) {
                            miniKLineView.m14292p(10.0d, f);
                        } else {
                            miniKLineView.m14292p(3.5d, f);
                        }
                        if (miniKLineView.f42037a < 0) {
                            miniKLineView.f42037a = 0;
                        }
                        int size = arrayList2.size();
                        int i2 = miniKLineView.f42037a;
                        int i3 = size - miniKLineView.f42046d;
                        if (i2 > i3) {
                            miniKLineView.f42037a = i3;
                        }
                        miniKLineView.m14288l();
                        miniKLineView.m14291o();
                        miniKLineView.invalidate();
                        return true;
                    }
                } else if (miniKLineView.f42054g) {
                    miniKLineView.f42054g = false;
                    if (!arrayList.isEmpty()) {
                        miniKLineView.f42010L = (KData) AbstractC0000a.m8e(1, arrayList);
                    }
                    miniKLineView.invalidate();
                }
            }
            return true;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/kline/MiniKLineView$OnRequestDataListListener;", "", "kline_release"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public interface OnRequestDataListListener {
        /* JADX INFO: renamed from: a */
        void mo13968a();

        /* JADX INFO: renamed from: b */
        void mo13969b(long j);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniKLineView(Context context) {
        super(context, null, 0);
        Intrinsics.m18599g(context, "context");
        this.f42040b = 18;
        this.f42043c = 140;
        this.f42046d = 34;
        this.f42062j = 300;
        this.f42074o = true;
        this.f42086s = 1;
        new Rect();
        new Rect();
        new Rect();
        this.f41994D = new Rect();
        this.f41996E = new String[0];
        this.f41998F = new ArrayList();
        this.f42000G = new ArrayList();
        this.f42002H = new ArrayList();
        this.f42004I = new ArrayList();
        this.f42006J = new ArrayList();
        this.f42008K = new ArrayList();
        new CopyOnWriteArrayList();
        new CopyOnWriteArrayList();
        new CopyOnWriteArrayList();
        new CopyOnWriteArrayList();
        new CopyOnWriteArrayList();
        new CopyOnWriteArrayList();
        new CopyOnWriteArrayList();
        new CopyOnWriteArrayList();
        this.f42079p1 = new ArrayList();
        this.f42082q1 = new ArrayList();
        this.f42094u1 = "Liq.Price";
        this.f42097v1 = "Margin";
        this.f42100w1 = "Pnl";
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, R.styleable.f42114a);
        Intrinsics.m18598f(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f42069m0 = typedArrayObtainStyledAttributes.getColor(34, -1184275);
        this.f42049e0 = typedArrayObtainStyledAttributes.getColor(0, -6574915);
        this.f42078p0 = typedArrayObtainStyledAttributes.getInt(1, 8);
        this.f42052f0 = typedArrayObtainStyledAttributes.getColor(21, this.f42049e0);
        this.f42102x0 = typedArrayObtainStyledAttributes.getInt(22, this.f42078p0);
        typedArrayObtainStyledAttributes.getInt(35, 10);
        this.f42022R = typedArrayObtainStyledAttributes.getColor(24, -12204175);
        this.f42024S = typedArrayObtainStyledAttributes.getColor(23, -1090725);
        this.f42026T = typedArrayObtainStyledAttributes.getColor(27, -1001205);
        this.f42028U = typedArrayObtainStyledAttributes.getColor(25, -1556299);
        this.f42030V = typedArrayObtainStyledAttributes.getColor(26, -7640892);
        this.f42032W = typedArrayObtainStyledAttributes.getColor(28, -16777216);
        this.f42084r0 = typedArrayObtainStyledAttributes.getColor(29, -1);
        this.f42090t0 = typedArrayObtainStyledAttributes.getInt(30, 8);
        this.f42038a0 = typedArrayObtainStyledAttributes.getColor(31, this.f42032W);
        this.f42087s0 = typedArrayObtainStyledAttributes.getColor(32, this.f42084r0);
        this.f42093u0 = typedArrayObtainStyledAttributes.getInt(33, 8);
        this.f42041b0 = typedArrayObtainStyledAttributes.getColor(38, -6574915);
        typedArrayObtainStyledAttributes.getInt(39, 10);
        typedArrayObtainStyledAttributes.getColor(37, this.f42026T);
        typedArrayObtainStyledAttributes.getColor(36, this.f42028U);
        typedArrayObtainStyledAttributes.getColor(20, this.f42041b0);
        this.f42044c0 = typedArrayObtainStyledAttributes.getColor(19, this.f42022R);
        this.f42047d0 = typedArrayObtainStyledAttributes.getColor(18, this.f42024S);
        typedArrayObtainStyledAttributes.getColor(15, this.f42028U);
        typedArrayObtainStyledAttributes.getColor(10, this.f42030V);
        typedArrayObtainStyledAttributes.getColor(17, this.f42026T);
        typedArrayObtainStyledAttributes.getColor(9, this.f42028U);
        typedArrayObtainStyledAttributes.getColor(16, this.f42030V);
        typedArrayObtainStyledAttributes.getColor(5, -8221022);
        this.f42055g0 = typedArrayObtainStyledAttributes.getColor(6, -16777216);
        this.f42060i0 = typedArrayObtainStyledAttributes.getColor(7, -1);
        this.f42063j0 = typedArrayObtainStyledAttributes.getColor(7, -16777216);
        this.f42096v0 = typedArrayObtainStyledAttributes.getInt(8, 8);
        this.f42057h0 = typedArrayObtainStyledAttributes.getColor(2, this.f42032W);
        this.f42081q0 = typedArrayObtainStyledAttributes.getColor(3, -1);
        this.f42099w0 = typedArrayObtainStyledAttributes.getInt(4, 8);
        this.f42065k0 = typedArrayObtainStyledAttributes.getColor(12, -4865840);
        this.f42067l0 = typedArrayObtainStyledAttributes.getColor(13, -8351842);
        this.f42104y0 = typedArrayObtainStyledAttributes.getInt(14, 10);
        this.f42072n0 = typedArrayObtainStyledAttributes.getColor(11, -419430401);
        typedArrayObtainStyledAttributes.recycle();
        setOnTouchListener(this);
        setClickable(true);
        setFocusable(true);
        this.f42020Q = new GestureDetector(getContext(), new CustomGestureListener());
        this.f41989A0 = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f42075o0 = m14280b(103.0f);
        this.f42106z0 = m14280b(130.0f);
        this.f42009K0 = (r1 - m14280b(4.0f)) / 9;
        this.f41996E = new String[]{"Time", "Open", "High", "Low", "Close", "Chg", "%Chg", "Volume", "Turnover"};
        Handler handler = new Handler(this);
        QuotaThread quotaThread = new QuotaThread("quotaThread", 10);
        this.f42014N = quotaThread;
        quotaThread.f42111a = handler;
        quotaThread.start();
        this.f42016O = new MiniKLineView$initStopDelay$1(this);
        Paint paint = new Paint();
        this.f42092u = paint;
        paint.setAntiAlias(true);
        Paint paint2 = this.f42092u;
        Intrinsics.m18596d(paint2);
        paint2.setTextSize(m14293q(this.f42078p0));
        Paint paint3 = this.f42092u;
        Intrinsics.m18596d(paint3);
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        Paint paint4 = new Paint();
        this.f42095v = paint4;
        paint4.setAntiAlias(true);
        Paint paint5 = this.f42095v;
        Intrinsics.m18596d(paint5);
        Paint.Style style2 = Paint.Style.FILL;
        paint5.setStyle(style2);
        Paint paint6 = new Paint();
        this.f42098w = paint6;
        paint6.setAntiAlias(true);
        Paint paint7 = this.f42098w;
        Intrinsics.m18596d(paint7);
        paint7.setStyle(style2);
        Paint paint8 = new Paint();
        this.f42101x = paint8;
        paint8.setAntiAlias(true);
        Paint paint9 = this.f42101x;
        Intrinsics.m18596d(paint9);
        paint9.setTextSize(m14293q(this.f42078p0));
        Paint paint10 = this.f42101x;
        Intrinsics.m18596d(paint10);
        paint10.setStyle(style2);
        Paint paint11 = new Paint();
        this.f42103y = paint11;
        paint11.setAntiAlias(true);
        Paint paint12 = this.f42103y;
        Intrinsics.m18596d(paint12);
        paint12.setTextSize(m14293q(this.f42078p0));
        Paint paint13 = this.f42103y;
        Intrinsics.m18596d(paint13);
        paint13.setStyle(style);
        Paint paint14 = this.f42103y;
        Intrinsics.m18596d(paint14);
        paint14.setColor(-16777216);
        Paint paint15 = this.f42103y;
        Intrinsics.m18596d(paint15);
        paint15.setStrokeWidth(m14280b(1.0f));
        Paint paint16 = this.f42103y;
        Intrinsics.m18596d(paint16);
        paint16.setPathEffect(new DashPathEffect(new float[]{10.0f, 10.0f}, 0.0f));
        Paint paint17 = new Paint();
        this.f42105z = paint17;
        paint17.setAntiAlias(true);
        Paint paint18 = this.f42105z;
        Intrinsics.m18596d(paint18);
        paint18.setTextSize(m14293q(this.f42078p0));
        Paint paint19 = this.f42105z;
        Intrinsics.m18596d(paint19);
        paint19.setStyle(style);
        Paint paint20 = this.f42105z;
        Intrinsics.m18596d(paint20);
        paint20.setColor(Color.parseColor("#45C771"));
        Paint paint21 = this.f42105z;
        Intrinsics.m18596d(paint21);
        paint21.setStrokeWidth(m14280b(1.0f));
        Paint paint22 = this.f42105z;
        Intrinsics.m18596d(paint22);
        paint22.setPathEffect(new DashPathEffect(new float[]{10.0f, 10.0f}, 0.0f));
        Paint paint23 = new Paint();
        this.f41988A = paint23;
        paint23.setAntiAlias(true);
        Paint paint24 = this.f41988A;
        Intrinsics.m18596d(paint24);
        paint24.setTextSize(m14293q(this.f42078p0));
        Paint paint25 = this.f41988A;
        Intrinsics.m18596d(paint25);
        paint25.setStyle(style);
        Paint paint26 = this.f41988A;
        Intrinsics.m18596d(paint26);
        paint26.setColor(Color.parseColor("#EF5B5B"));
        Paint paint27 = this.f41988A;
        Intrinsics.m18596d(paint27);
        paint27.setStrokeWidth(m14280b(1.0f));
        Paint paint28 = this.f41988A;
        Intrinsics.m18596d(paint28);
        paint28.setPathEffect(new DashPathEffect(new float[]{10.0f, 10.0f}, 0.0f));
        this.f41990B = new Path();
        this.f41992C = new Path();
        this.f42018P = new RunnableC0015a(this, 18);
    }

    /* JADX INFO: renamed from: g */
    public static String m14277g(long j) {
        if (j <= 0) {
            return "";
        }
        String str = new SimpleDateFormat("yyyy-MM-dd HH:mm").format(new Date(j));
        Intrinsics.m18598f(str, "format(...)");
        return str;
    }

    /* JADX INFO: renamed from: i */
    public static String m14278i(MiniKLineView miniKLineView, double d, int i, int i2, int i3) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        RoundingMode roundingMode = RoundingMode.DOWN;
        miniKLineView.getClass();
        Intrinsics.m18599g(roundingMode, "roundingMode");
        if (i < 0 || i > i2) {
            throw new IllegalArgumentException();
        }
        DecimalFormat decimalFormat = new DecimalFormat(AbstractC0000a.m13j(",", "##0." + CollectionsKt.m18409J(RangesKt.m18664k(0, i), "", null, null, new C3499s(22), 30) + CollectionsKt.m18409J(RangesKt.m18664k(i, i2), "", null, null, new C3499s(23), 30)));
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
    public final void m14279a(ArrayList arrayList) {
        Object obj;
        Object next;
        ArrayList arrayList2 = this.f42082q1;
        arrayList2.clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            FuturesKlinePosition futuresKlinePosition = (FuturesKlinePosition) it.next();
            Iterator it2 = arrayList2.iterator();
            while (true) {
                obj = null;
                if (!it2.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it2.next();
                    if (((FuturesKlinePosition) next).f42120b == futuresKlinePosition.f42120b) {
                        break;
                    }
                }
            }
            if (next == null) {
                arrayList2.add(futuresKlinePosition);
            } else {
                Iterator it3 = arrayList2.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    Object next2 = it3.next();
                    if (((FuturesKlinePosition) next2).f42120b == futuresKlinePosition.f42120b) {
                        obj = next2;
                        break;
                    }
                }
                FuturesKlinePosition futuresKlinePosition2 = (FuturesKlinePosition) obj;
                if (futuresKlinePosition2 != null) {
                    Iterator it4 = arrayList2.iterator();
                    int i = 0;
                    while (true) {
                        if (!it4.hasNext()) {
                            i = -1;
                            break;
                        } else if (((FuturesKlinePosition) it4.next()).f42120b == futuresKlinePosition.f42120b) {
                            break;
                        } else {
                            i++;
                        }
                    }
                    arrayList2.remove(futuresKlinePosition2);
                    futuresKlinePosition2.f42122d = futuresKlinePosition.f42122d;
                    arrayList2.add(i, futuresKlinePosition2);
                }
            }
        }
        invalidate();
    }

    /* JADX INFO: renamed from: b */
    public final int m14280b(float f) {
        return (int) ((f * getContext().getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* JADX INFO: renamed from: c */
    public final void m14281c(Canvas canvas) {
        double dFloatValue;
        int i;
        double dFloatValue2;
        KData kData = this.f42010L;
        if (kData == null || !this.f42054g) {
            return;
        }
        double d = 2;
        float f = (float) ((this.f42056g1 / d) + kData.f41806B);
        Intrinsics.m18596d(kData);
        float f2 = (float) ((this.f42056g1 / d) + kData.f41806B);
        ArrayList arrayList = this.f42006J;
        float fFloatValue = ((Number) arrayList.get(0)).floatValue();
        KData kData2 = this.f42010L;
        Intrinsics.m18596d(kData2);
        float f3 = (float) ((this.f42056g1 / d) + kData2.f41806B);
        float fFloatValue2 = ((Number) AbstractC0000a.m8e(1, arrayList)).floatValue();
        Paint paint = this.f42103y;
        Intrinsics.m18596d(paint);
        canvas.drawLine(f2, fFloatValue, f3, fFloatValue2, paint);
        int i2 = this.f42089t;
        if (i2 == 0) {
            KData kData3 = this.f42010L;
            Intrinsics.m18596d(kData3);
            dFloatValue = kData3.f41809E;
        } else if (i2 == 1) {
            KData kData4 = this.f42010L;
            Intrinsics.m18596d(kData4);
            dFloatValue = kData4.f41810F;
        } else if (i2 != 2) {
            KData kData5 = this.f42010L;
            Intrinsics.m18596d(kData5);
            dFloatValue = kData5.f41809E;
        } else {
            dFloatValue = this.f42011L0;
        }
        if (dFloatValue < ((Number) arrayList.get(0)).floatValue()) {
            dFloatValue = ((Number) arrayList.get(0)).floatValue();
        } else {
            double d2 = this.f42021Q0;
            if (dFloatValue > d2) {
                dFloatValue = d2;
            }
        }
        ArrayList arrayList2 = this.f42008K;
        float fFloatValue3 = ((Number) arrayList2.get(0)).floatValue();
        float f4 = (float) dFloatValue;
        float fFloatValue4 = ((Number) AbstractC0000a.m8e(1, arrayList2)).floatValue();
        Paint paint2 = this.f42103y;
        Intrinsics.m18596d(paint2);
        canvas.drawLine(fFloatValue3, f4, fFloatValue4, f4, paint2);
        int iM14280b = m14280b(6.0f) / 2;
        int iM14280b2 = iM14280b - m14280b(1.0f);
        Paint paint3 = new Paint();
        paint3.setColor(-16777216);
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(m14280b(1.0f));
        canvas.drawCircle(f, f4, iM14280b, paint3);
        Paint paint4 = new Paint();
        paint4.setColor(-16777216);
        paint4.setStyle(Paint.Style.FILL);
        canvas.drawCircle(f, f4, iM14280b2, paint4);
        KData kData6 = this.f42010L;
        Intrinsics.m18596d(kData6);
        float fM14280b = (float) (((this.f42056g1 / d) + kData6.f41806B) - ((double) m14280b(35.0f)));
        float fM14280b2 = this.f41997E0 - m14280b(16.0f);
        KData kData7 = this.f42010L;
        Intrinsics.m18596d(kData7);
        RectF rectF = new RectF(fM14280b, fM14280b2, (float) ((this.f42056g1 / d) + kData7.f41806B + ((double) m14280b(35.0f))), this.f41997E0);
        Paint paint5 = this.f42095v;
        Intrinsics.m18596d(paint5);
        paint5.setColor(this.f42057h0);
        float fM14280b3 = m14280b(4.0f);
        float fM14280b4 = m14280b(4.0f);
        Paint paint6 = this.f42095v;
        Intrinsics.m18596d(paint6);
        canvas.drawRoundRect(rectF, fM14280b3, fM14280b4, paint6);
        KData kData8 = this.f42010L;
        Intrinsics.m18596d(kData8);
        String strM14277g = m14277g(kData8.f41812a);
        m14290n(this.f42081q0, this.f42099w0);
        KData kData9 = this.f42010L;
        Intrinsics.m18596d(kData9);
        double d3 = (this.f42056g1 / d) + kData9.f41806B;
        Paint paint7 = this.f42101x;
        Intrinsics.m18596d(paint7);
        float f5 = 2;
        float fMeasureText = (float) (d3 - ((double) (paint7.measureText(strM14277g) / f5)));
        float fM14280b5 = this.f41997E0 - m14280b(5.0f);
        Paint paint8 = this.f42101x;
        Intrinsics.m18596d(paint8);
        canvas.drawText(strM14277g, fMeasureText, fM14280b5, paint8);
        RectF rectF2 = new RectF(this.f41995D0 - m14280b(38.0f), f4 - m14280b(7.0f), this.f41995D0 - m14280b(1.0f), f4 + m14280b(7.0f));
        Paint paint9 = this.f42095v;
        Intrinsics.m18596d(paint9);
        paint9.setColor(this.f42055g0);
        float fM14280b6 = m14280b(4.0f);
        float fM14280b7 = m14280b(4.0f);
        Paint paint10 = this.f42095v;
        Intrinsics.m18596d(paint10);
        canvas.drawRoundRect(rectF2, fM14280b6, fM14280b7, paint10);
        if (this.vicePicShow) {
            i = 0;
            dFloatValue2 = (this.f42036Z0 - this.f42045c1) / ((double) (((Number) arrayList.get(3)).floatValue() - ((Number) arrayList.get(0)).floatValue()));
        } else {
            dFloatValue2 = (this.f42036Z0 - this.f42045c1) / ((double) (((Number) arrayList.get(4)).floatValue() - ((Number) arrayList.get(0)).floatValue()));
            i = 0;
        }
        double dFloatValue3 = this.f42036Z0 - (dFloatValue2 * ((double) (f4 - ((Number) arrayList.get(i)).floatValue())));
        int i3 = this.f42076o1;
        String strM14278i = m14278i(this, dFloatValue3, i3, i3, 60);
        Rect rect = new Rect();
        m14290n(this.f42060i0, this.f42096v0);
        Paint paint11 = this.f42101x;
        Intrinsics.m18596d(paint11);
        paint11.getTextBounds(strM14278i, 0, strM14278i.length(), rect);
        float fM1B = AbstractC0000a.m1B(rectF2.width(), rect.width(), f5, this.f41995D0 - m14280b(38.0f));
        float fM14280b8 = (f4 + m14280b(7.0f)) - ((rectF2.height() - rect.height()) / f5);
        Paint paint12 = this.f42101x;
        Intrinsics.m18596d(paint12);
        canvas.drawText(strM14278i, fM1B, fM14280b8, paint12);
    }

    /* JADX INFO: renamed from: d */
    public final void m14282d(Canvas canvas) {
        if (this.f42010L == null || !this.f42054g) {
            return;
        }
        m14290n(this.f42067l0, this.f42104y0);
        Paint paint = this.f42092u;
        Intrinsics.m18596d(paint);
        int i = 0;
        String str = this.f41996E[0];
        paint.getTextBounds(str, 0, str.length(), this.f41994D);
        KData kData = this.f42010L;
        Intrinsics.m18596d(kData);
        double d = (this.f42056g1 / ((double) 2)) + kData.f41806B;
        double measuredWidth = getMeasuredWidth() / 2.0f;
        ArrayList arrayList = this.f42004I;
        ArrayList arrayList2 = this.f42006J;
        ArrayList arrayList3 = this.f42008K;
        if (d <= measuredWidth) {
            Paint paint2 = this.f42095v;
            Intrinsics.m18596d(paint2);
            paint2.setColor(this.f42072n0);
            float fFloatValue = ((Number) arrayList3.get(arrayList3.size() - 1)).floatValue() - this.f42075o0;
            float fFloatValue2 = ((Number) arrayList2.get(0)).floatValue();
            float fFloatValue3 = ((Number) AbstractC0000a.m8e(1, arrayList3)).floatValue();
            float fFloatValue4 = ((Number) arrayList2.get(0)).floatValue() + this.f42106z0;
            Paint paint3 = this.f42095v;
            Intrinsics.m18596d(paint3);
            float f = 4.0f;
            canvas.drawRect(fFloatValue, fFloatValue2, fFloatValue3, fFloatValue4, paint3);
            m14290n(this.f42065k0, 0);
            float fFloatValue5 = ((Number) arrayList3.get(arrayList3.size() - 1)).floatValue() - this.f42075o0;
            float fFloatValue6 = ((Number) arrayList2.get(0)).floatValue();
            float fFloatValue7 = ((Number) AbstractC0000a.m8e(1, arrayList3)).floatValue() - this.f42075o0;
            float fFloatValue8 = this.f42106z0 + ((Number) arrayList2.get(0)).floatValue();
            Paint paint4 = this.f42092u;
            Intrinsics.m18596d(paint4);
            canvas.drawLine(fFloatValue5, fFloatValue6, fFloatValue7, fFloatValue8, paint4);
            float fFloatValue9 = ((Number) AbstractC0000a.m8e(1, arrayList3)).floatValue() - this.f42075o0;
            float fFloatValue10 = ((Number) arrayList2.get(0)).floatValue();
            float fFloatValue11 = ((Number) AbstractC0000a.m8e(1, arrayList3)).floatValue();
            float fFloatValue12 = ((Number) arrayList2.get(0)).floatValue();
            Paint paint5 = this.f42092u;
            Intrinsics.m18596d(paint5);
            canvas.drawLine(fFloatValue9, fFloatValue10, fFloatValue11, fFloatValue12, paint5);
            float fFloatValue13 = ((Number) AbstractC0000a.m8e(1, arrayList3)).floatValue();
            float fFloatValue14 = ((Number) arrayList2.get(0)).floatValue();
            float fFloatValue15 = ((Number) AbstractC0000a.m8e(1, arrayList3)).floatValue();
            float fFloatValue16 = this.f42106z0 + ((Number) arrayList2.get(0)).floatValue();
            Paint paint6 = this.f42092u;
            Intrinsics.m18596d(paint6);
            canvas.drawLine(fFloatValue13, fFloatValue14, fFloatValue15, fFloatValue16, paint6);
            float fFloatValue17 = ((Number) AbstractC0000a.m8e(1, arrayList3)).floatValue() - this.f42075o0;
            float fFloatValue18 = this.f42106z0 + ((Number) arrayList2.get(0)).floatValue();
            float fFloatValue19 = ((Number) AbstractC0000a.m8e(1, arrayList3)).floatValue();
            float fFloatValue20 = this.f42106z0 + ((Number) arrayList2.get(0)).floatValue();
            Paint paint7 = this.f42092u;
            Intrinsics.m18596d(paint7);
            canvas.drawLine(fFloatValue17, fFloatValue18, fFloatValue19, fFloatValue20, paint7);
            m14290n(this.f42067l0, this.f42104y0);
            int length = this.f41996E.length;
            int i2 = 0;
            while (i2 < length) {
                String str2 = this.f41996E[i2];
                float fFloatValue21 = (((Number) AbstractC0000a.m8e(1, arrayList3)).floatValue() - this.f42075o0) + m14280b(f);
                float fHeight = ((this.f42009K0 - r8.height()) / 2) + (this.f42009K0 * i2) + ((Number) arrayList2.get(i)).floatValue() + r8.height();
                Paint paint8 = this.f42101x;
                Intrinsics.m18596d(paint8);
                canvas.drawText(str2, fFloatValue21, fHeight, paint8);
                i2++;
                i = 0;
                f = 4.0f;
            }
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                if (i3 == 5 || i3 == 6) {
                    KData kData2 = this.f42010L;
                    Intrinsics.m18596d(kData2);
                    if (kData2.m14255a() > 0.0d) {
                        m14290n(this.f42022R, this.f42104y0);
                    } else {
                        m14290n(this.f42024S, this.f42104y0);
                    }
                } else {
                    m14290n(this.f42067l0, this.f42104y0);
                }
                String str3 = (String) arrayList.get(i3);
                float fFloatValue22 = ((Number) AbstractC0000a.m8e(1, arrayList3)).floatValue() - m14280b(4.0f);
                Paint paint9 = this.f42092u;
                Intrinsics.m18596d(paint9);
                float fMeasureText = fFloatValue22 - paint9.measureText((String) arrayList.get(i3));
                float fHeight2 = ((this.f42009K0 - r8.height()) / 2) + (this.f42009K0 * i3) + ((Number) arrayList2.get(0)).floatValue() + r8.height();
                Paint paint10 = this.f42101x;
                Intrinsics.m18596d(paint10);
                canvas.drawText(str3, fMeasureText, fHeight2, paint10);
            }
            return;
        }
        Paint paint11 = this.f42095v;
        Intrinsics.m18596d(paint11);
        paint11.setColor(this.f42072n0);
        float fFloatValue23 = ((Number) arrayList3.get(0)).floatValue();
        float fFloatValue24 = ((Number) arrayList2.get(0)).floatValue();
        float fFloatValue25 = ((Number) arrayList3.get(0)).floatValue() + this.f42075o0;
        float fFloatValue26 = ((Number) arrayList2.get(0)).floatValue() + this.f42106z0;
        Paint paint12 = this.f42095v;
        Intrinsics.m18596d(paint12);
        canvas.drawRect(fFloatValue23, fFloatValue24, fFloatValue25, fFloatValue26, paint12);
        m14290n(this.f42065k0, 0);
        float fFloatValue27 = ((Number) arrayList3.get(0)).floatValue();
        float fFloatValue28 = ((Number) arrayList2.get(0)).floatValue();
        float fFloatValue29 = ((Number) arrayList3.get(0)).floatValue();
        float fFloatValue30 = this.f42106z0 + ((Number) arrayList2.get(0)).floatValue();
        Paint paint13 = this.f42092u;
        Intrinsics.m18596d(paint13);
        canvas.drawLine(fFloatValue27, fFloatValue28, fFloatValue29, fFloatValue30, paint13);
        float fFloatValue31 = ((Number) arrayList3.get(0)).floatValue();
        float fFloatValue32 = ((Number) arrayList2.get(0)).floatValue();
        float fFloatValue33 = this.f42075o0 + ((Number) arrayList3.get(0)).floatValue();
        float fFloatValue34 = ((Number) arrayList2.get(0)).floatValue();
        Paint paint14 = this.f42092u;
        Intrinsics.m18596d(paint14);
        canvas.drawLine(fFloatValue31, fFloatValue32, fFloatValue33, fFloatValue34, paint14);
        float fFloatValue35 = this.f42075o0 + ((Number) arrayList3.get(0)).floatValue();
        float fFloatValue36 = ((Number) arrayList2.get(0)).floatValue();
        float fFloatValue37 = this.f42075o0 + ((Number) arrayList3.get(0)).floatValue();
        float fFloatValue38 = this.f42106z0 + ((Number) arrayList2.get(0)).floatValue();
        Paint paint15 = this.f42092u;
        Intrinsics.m18596d(paint15);
        canvas.drawLine(fFloatValue35, fFloatValue36, fFloatValue37, fFloatValue38, paint15);
        float fFloatValue39 = ((Number) arrayList3.get(0)).floatValue();
        float fFloatValue40 = this.f42106z0 + ((Number) arrayList2.get(0)).floatValue();
        float fFloatValue41 = this.f42075o0 + ((Number) arrayList3.get(0)).floatValue();
        float fFloatValue42 = this.f42106z0 + ((Number) arrayList2.get(0)).floatValue();
        Paint paint16 = this.f42092u;
        Intrinsics.m18596d(paint16);
        canvas.drawLine(fFloatValue39, fFloatValue40, fFloatValue41, fFloatValue42, paint16);
        m14290n(this.f42067l0, this.f42104y0);
        int length2 = this.f41996E.length;
        for (int i4 = 0; i4 < length2; i4++) {
            String str4 = this.f41996E[i4];
            float fFloatValue43 = ((Number) arrayList3.get(0)).floatValue() + m14280b(4.0f);
            float fHeight3 = ((this.f42009K0 - r8.height()) / 2) + (this.f42009K0 * i4) + ((Number) arrayList2.get(0)).floatValue() + r8.height();
            Paint paint17 = this.f42101x;
            Intrinsics.m18596d(paint17);
            canvas.drawText(str4, fFloatValue43, fHeight3, paint17);
        }
        int size2 = arrayList.size();
        for (int i5 = 0; i5 < size2; i5++) {
            if (i5 == 5 || i5 == 6) {
                KData kData3 = this.f42010L;
                Intrinsics.m18596d(kData3);
                if (kData3.m14255a() > 0.0d) {
                    m14290n(this.f42022R, this.f42104y0);
                } else {
                    m14290n(this.f42024S, this.f42104y0);
                }
            } else {
                m14290n(this.f42067l0, this.f42104y0);
            }
            String str5 = (String) arrayList.get(i5);
            float fFloatValue44 = (((Number) arrayList3.get(0)).floatValue() + this.f42075o0) - m14280b(4.0f);
            Paint paint18 = this.f42092u;
            Intrinsics.m18596d(paint18);
            float fMeasureText2 = fFloatValue44 - paint18.measureText((String) arrayList.get(i5));
            float fHeight4 = ((this.f42009K0 - r8.height()) / 2) + (this.f42009K0 * i5) + ((Number) arrayList2.get(0)).floatValue() + r8.height();
            Paint paint19 = this.f42101x;
            Intrinsics.m18596d(paint19);
            canvas.drawText(str5, fMeasureText2, fHeight4, paint19);
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
            this.f42031V0 = event.getX();
            this.f42033W0 = event.getY();
            this.f42034X0 = event.getX();
            this.f42013M0 = event.getY();
            this.f42059i = false;
            postDelayed(this.f42018P, this.f42062j);
        } else {
            if (event.getAction() == 2) {
                float fAbs = Math.abs(event.getX() - this.f42031V0);
                float fAbs2 = Math.abs(event.getY() - this.f42033W0);
                float fAbs3 = Math.abs(event.getX() - this.f42034X0);
                float fAbs4 = Math.abs(event.getY() - this.f42013M0);
                this.f42011L0 = event.getY();
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                if (this.f42071n || ((fAbs > m14280b(5.0f) + fAbs2 && fAbs > this.f41989A0) || ((z2 = this.f42059i) && fAbs2 > this.f41989A0))) {
                    this.f42071n = true;
                    removeCallbacks(this.f42018P);
                    if (this.f42059i && (fAbs3 > 1.0f || fAbs4 > 1.0f)) {
                        m14287k(event.getX());
                        if (this.f42010L != null) {
                            invalidate();
                        }
                    }
                    this.f42034X0 = event.getX();
                    this.f42013M0 = event.getY();
                    if (this.f42059i || super.dispatchTouchEvent(event)) {
                        return true;
                    }
                } else if (!z2 && !this.f42071n && !this.f42077p && fAbs2 > fAbs + m14280b(5.0f) && fAbs2 > this.f41989A0) {
                    removeCallbacks(this.f42018P);
                    if (getParent() != null) {
                        getParent().requestDisallowInterceptTouchEvent(false);
                        return false;
                    }
                }
                return false;
            }
            if (event.getAction() == 1) {
                this.f42071n = false;
                removeCallbacks(this.f42018P);
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                }
            }
        }
        if (!this.f42059i && !super.dispatchTouchEvent(event)) {
            return false;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m14283e(Canvas canvas) {
        RectF rectF;
        float fM14280b;
        float f;
        RectF rectF2;
        float fM14280b2;
        Rect rect = new Rect();
        double d = this.f42035Y0;
        int i = this.f42076o1;
        String strM14278i = m14278i(this, d, i, i, 60);
        m14290n(this.f42084r0, this.f42090t0);
        Paint paint = this.f42092u;
        Intrinsics.m18596d(paint);
        paint.getTextBounds(strM14278i, 0, strM14278i.length(), rect);
        double dWidth = this.f42039a1 + ((double) rect.width()) + ((double) m14280b(8.0f));
        ArrayList arrayList = this.f42008K;
        if (dWidth < ((Number) AbstractC0000a.m8e(1, arrayList)).floatValue()) {
            rectF = new RectF((float) (this.f42039a1 + ((double) m14280b(3.0f))), ((float) this.f42064j1) - m14280b(7.0f), (float) (this.f42039a1 + ((double) rect.width()) + ((double) m14280b(8.0f))), ((float) this.f42064j1) + m14280b(7.0f));
            Path path = this.f41990B;
            Intrinsics.m18596d(path);
            path.reset();
            Path path2 = this.f41990B;
            Intrinsics.m18596d(path2);
            path2.moveTo((float) this.f42039a1, (float) this.f42064j1);
            Path path3 = this.f41990B;
            Intrinsics.m18596d(path3);
            path3.lineTo((float) (this.f42039a1 + ((double) m14280b(4.0f))), ((float) this.f42064j1) - m14280b(3.0f));
            Path path4 = this.f41990B;
            Intrinsics.m18596d(path4);
            path4.lineTo((float) (this.f42039a1 + ((double) m14280b(4.0f))), ((float) this.f42064j1) + m14280b(3.0f));
            Path path5 = this.f41990B;
            Intrinsics.m18596d(path5);
            path5.close();
            fM14280b = (float) (this.f42039a1 + ((double) m14280b(5.0f)));
        } else {
            rectF = new RectF((float) (this.f42039a1 - ((double) m14280b(3.0f))), ((float) this.f42064j1) - m14280b(7.0f), (float) ((this.f42039a1 - ((double) rect.width())) - ((double) m14280b(8.0f))), ((float) this.f42064j1) + m14280b(7.0f));
            Path path6 = this.f41990B;
            Intrinsics.m18596d(path6);
            path6.reset();
            Path path7 = this.f41990B;
            Intrinsics.m18596d(path7);
            path7.moveTo((float) this.f42039a1, (float) this.f42064j1);
            Path path8 = this.f41990B;
            Intrinsics.m18596d(path8);
            path8.lineTo((float) (this.f42039a1 - ((double) m14280b(4.0f))), ((float) this.f42064j1) - m14280b(3.0f));
            Path path9 = this.f41990B;
            Intrinsics.m18596d(path9);
            path9.lineTo((float) (this.f42039a1 - ((double) m14280b(4.0f))), ((float) this.f42064j1) + m14280b(3.0f));
            Path path10 = this.f41990B;
            Intrinsics.m18596d(path10);
            path10.close();
            fM14280b = ((float) (this.f42039a1 - ((double) m14280b(5.0f)))) - rect.width();
        }
        Paint paint2 = this.f42095v;
        Intrinsics.m18596d(paint2);
        paint2.setColor(this.f42032W);
        Paint paint3 = this.f42095v;
        Intrinsics.m18596d(paint3);
        canvas.drawRoundRect(rectF, 4.0f, 4.0f, paint3);
        Path path11 = this.f41990B;
        Intrinsics.m18596d(path11);
        Paint paint4 = this.f42095v;
        Intrinsics.m18596d(paint4);
        canvas.drawPath(path11, paint4);
        m14290n(this.f42084r0, this.f42090t0);
        float fHeight = (rect.height() / 2.0f) + ((float) this.f42064j1);
        Paint paint5 = this.f42101x;
        Intrinsics.m18596d(paint5);
        canvas.drawText(strM14278i, fM14280b, fHeight, paint5);
        Rect rect2 = new Rect();
        double d2 = this.f42042b1;
        int i2 = this.f42076o1;
        String strM14278i2 = m14278i(this, d2, i2, i2, 60);
        m14290n(this.f42087s0, this.f42093u0);
        Paint paint6 = this.f42101x;
        Intrinsics.m18596d(paint6);
        paint6.getTextBounds(strM14278i2, 0, strM14278i2.length(), rect2);
        if (this.f42048d1 + ((double) rect2.width()) + ((double) m14280b(8.0f)) < ((Number) AbstractC0000a.m8e(1, arrayList)).floatValue()) {
            f = 2.0f;
            rectF2 = new RectF((float) (this.f42048d1 + ((double) m14280b(3.0f))), ((float) this.f42066k1) - m14280b(7.0f), (float) (this.f42048d1 + ((double) rect2.width()) + ((double) m14280b(8.0f))), ((float) this.f42066k1) + m14280b(7.0f));
            Path path12 = this.f41990B;
            Intrinsics.m18596d(path12);
            path12.reset();
            Path path13 = this.f41990B;
            Intrinsics.m18596d(path13);
            path13.moveTo((float) this.f42048d1, (float) this.f42066k1);
            Path path14 = this.f41990B;
            Intrinsics.m18596d(path14);
            path14.lineTo((float) (this.f42048d1 + ((double) m14280b(4.0f))), ((float) this.f42066k1) - m14280b(3.0f));
            Path path15 = this.f41990B;
            Intrinsics.m18596d(path15);
            path15.lineTo((float) (this.f42048d1 + ((double) m14280b(4.0f))), ((float) this.f42066k1) + m14280b(3.0f));
            Path path16 = this.f41990B;
            Intrinsics.m18596d(path16);
            path16.close();
            fM14280b2 = (float) (this.f42048d1 + ((double) m14280b(5.0f)));
        } else {
            f = 2.0f;
            rectF2 = new RectF((float) (this.f42048d1 - ((double) m14280b(3.0f))), ((float) this.f42066k1) - m14280b(7.0f), (float) ((this.f42048d1 - ((double) rect2.width())) - ((double) m14280b(8.0f))), ((float) this.f42066k1) + m14280b(7.0f));
            Path path17 = this.f41990B;
            Intrinsics.m18596d(path17);
            path17.reset();
            Path path18 = this.f41990B;
            Intrinsics.m18596d(path18);
            path18.moveTo((float) this.f42048d1, (float) this.f42066k1);
            Path path19 = this.f41990B;
            Intrinsics.m18596d(path19);
            path19.lineTo((float) (this.f42048d1 - ((double) m14280b(4.0f))), ((float) this.f42066k1) - m14280b(3.0f));
            Path path20 = this.f41990B;
            Intrinsics.m18596d(path20);
            path20.lineTo((float) (this.f42048d1 - ((double) m14280b(4.0f))), ((float) this.f42066k1) + m14280b(3.0f));
            Path path21 = this.f41990B;
            Intrinsics.m18596d(path21);
            path21.close();
            fM14280b2 = ((float) (this.f42048d1 - ((double) m14280b(5.0f)))) - rect2.width();
        }
        Paint paint7 = this.f42095v;
        Intrinsics.m18596d(paint7);
        paint7.setColor(this.f42038a0);
        Paint paint8 = this.f42095v;
        Intrinsics.m18596d(paint8);
        canvas.drawRoundRect(rectF2, 4.0f, 4.0f, paint8);
        Path path22 = this.f41990B;
        Intrinsics.m18596d(path22);
        Paint paint9 = this.f42095v;
        Intrinsics.m18596d(paint9);
        canvas.drawPath(path22, paint9);
        m14290n(this.f42087s0, this.f42093u0);
        float fHeight2 = (rect2.height() / f) + ((float) this.f42066k1);
        Paint paint10 = this.f42101x;
        Intrinsics.m18596d(paint10);
        canvas.drawText(strM14278i2, fM14280b2, fHeight2, paint10);
    }

    /* JADX INFO: renamed from: f */
    public final void m14284f(Canvas canvas) {
        double dFloatValue;
        Canvas canvas2 = canvas;
        ArrayList arrayList = this.f42082q1;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            FuturesKlinePosition futuresKlinePosition = (FuturesKlinePosition) it.next();
            ArrayList arrayList2 = this.f42006J;
            double dDoubleValue = ((this.f42036Z0 - futuresKlinePosition.f42120b) * this.f42053f1) + ((Number) arrayList2.get(0)).doubleValue();
            ArrayList arrayList3 = this.f42000G;
            ArrayList arrayList4 = new ArrayList(CollectionsKt.m18452r(arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                arrayList4.add(Double.valueOf(((KData) it2.next()).f41814c));
            }
            double dM18420U = CollectionsKt.m18420U(arrayList4);
            double dM18418S = CollectionsKt.m18418S(arrayList4);
            double d = futuresKlinePosition.f42120b;
            if (dM18420U > d || d > dM18418S) {
                return;
            }
            float f = (float) dDoubleValue;
            RectF rectF = new RectF(this.f41995D0 - m14280b(38.0f), f - m14280b(7.0f), this.f41995D0 - m14280b(1.0f), m14280b(7.0f) + f);
            RectF rectF2 = new RectF(rectF.left, rectF.top, rectF.right, rectF.bottom);
            Paint paint = new Paint();
            boolean z2 = futuresKlinePosition.f42123e;
            paint.setColor(z2 ? Color.parseColor("#45C771") : Color.parseColor("#EF5B5B"));
            paint.setStyle(Paint.Style.FILL);
            canvas2.drawRoundRect(rectF2, m14280b(4.0f), m14280b(4.0f), paint);
            KData kData = this.f42010L;
            Intrinsics.m18596d(kData);
            if (kData.m14255a() > 0.0d) {
                Paint paint2 = this.f42095v;
                Intrinsics.m18596d(paint2);
                paint2.setColor(this.f42022R);
            } else {
                Paint paint3 = this.f42095v;
                Intrinsics.m18596d(paint3);
                paint3.setColor(this.f42024S);
            }
            String strValueOf = String.valueOf(d);
            Rect rect = new Rect();
            m14290n(this.f42063j0, this.f42096v0);
            Paint paint4 = this.f42101x;
            Intrinsics.m18596d(paint4);
            paint4.getTextBounds(strValueOf, 0, strValueOf.length(), rect);
            ArrayList arrayList5 = arrayList;
            float f2 = 2;
            float fWidth = ((rectF2.width() - rect.width()) / f2) + rectF2.left;
            float fM14280b = (f + m14280b(7.0f)) - ((rectF2.height() - rect.height()) / f2);
            Paint paint5 = this.f42101x;
            Intrinsics.m18596d(paint5);
            canvas2.drawText(strValueOf, fWidth, fM14280b, paint5);
            float width = getWidth() / 2;
            if (dDoubleValue < ((Number) arrayList2.get(0)).floatValue()) {
                dFloatValue = ((Number) arrayList2.get(0)).floatValue();
            } else {
                double d2 = this.f42021Q0;
                dFloatValue = dDoubleValue > d2 ? d2 : dDoubleValue;
            }
            ArrayList arrayList6 = this.f42008K;
            float fFloatValue = ((Number) arrayList6.get(0)).floatValue();
            float f3 = (float) dFloatValue;
            float fFloatValue2 = ((Number) AbstractC0000a.m8e(1, arrayList6)).floatValue();
            Paint paint6 = z2 ? this.f42105z : this.f41988A;
            Intrinsics.m18596d(paint6);
            canvas2.drawLine(fFloatValue, f3, fFloatValue2, f3, paint6);
            Canvas canvas3 = canvas2;
            Rect rect2 = new Rect();
            Paint paint7 = this.f42101x;
            Intrinsics.m18596d(paint7);
            String str = this.f42094u1;
            paint7.getTextBounds(str, 0, str.length(), rect2);
            RectF rectF3 = new RectF(((this.f41995D0 - m14280b(38.0f)) - rect2.width()) - m14280b(10.0f), f3 - m14280b(7.0f), (this.f41995D0 - m14280b(38.0f)) - m14280b(4.0f), m14280b(8.0f) + f3);
            RectF rectF4 = new RectF(rectF3.left, rectF3.top, rectF3.right, rectF3.bottom);
            paint.setColor(-1);
            canvas3.drawRoundRect(rectF4, m14280b(4.0f), m14280b(4.0f), paint);
            Paint paint8 = new Paint();
            paint8.setColor(z2 ? Color.parseColor("#45C771") : Color.parseColor("#EF5B5B"));
            paint8.setStyle(Paint.Style.STROKE);
            paint8.setStrokeWidth(1.0f);
            canvas3.drawRoundRect(rectF3, m14280b(4.0f), m14280b(4.0f), paint8);
            m14290n(z2 ? Color.parseColor("#45C771") : Color.parseColor("#EF5B5B"), this.f42096v0);
            String str2 = this.f42094u1;
            float fM1B = AbstractC0000a.m1B(rectF4.width(), rect2.width(), f2, rectF4.left);
            float fM14280b2 = (f3 + m14280b(7.0f)) - ((rectF4.height() - rect2.height()) / f2);
            Paint paint9 = this.f42101x;
            Intrinsics.m18596d(paint9);
            canvas3.drawText(str2, fM1B, fM14280b2, paint9);
            String strM14278i = m14278i(this, futuresKlinePosition.f42121c, 0, this.f42076o1, 61);
            String str3 = m14278i(this, futuresKlinePosition.f42122d, 0, this.f42076o1, 61) + ' ' + futuresKlinePosition.f42124f;
            Rect rect3 = new Rect();
            Rect rect4 = new Rect();
            Paint paint10 = this.f42101x;
            Intrinsics.m18596d(paint10);
            String str4 = this.f42097v1;
            Iterator it3 = it;
            paint10.getTextBounds(str4, 0, str4.length(), rect3);
            float fWidth2 = rect3.width();
            rect3.height();
            Paint paint11 = this.f42101x;
            Intrinsics.m18596d(paint11);
            String str5 = this.f42100w1;
            paint11.getTextBounds(str5, 0, str5.length(), rect4);
            float fWidth3 = rect4.width();
            rect4.height();
            paint.setColor(-1);
            RectF rectF5 = new RectF((width - (m14280b(120.0f) / 2)) - m14280b(4.0f), (f3 - (m14280b(32.0f) / 2)) - m14280b(4.0f), width + (m14280b(80.0f) / 2) + m14280b(4.0f), (m14280b(32.0f) / 2) + f3 + m14280b(4.0f));
            canvas3.drawRoundRect(rectF5, m14280b(4.0f), m14280b(4.0f), paint);
            int iM14280b = m14280b(14.0f);
            float fM14280b3 = rectF5.left + m14280b(4.0f);
            float f4 = iM14280b;
            float fM1B2 = AbstractC0000a.m1B(rectF5.height(), f4, f2, rectF5.top);
            Object obj = null;
            if (z2) {
                Bitmap bitmap = this.f42088s1;
                if (bitmap != null && !bitmap.isRecycled()) {
                    Bitmap bitmap2 = this.f42088s1;
                    Intrinsics.m18596d(bitmap2);
                    canvas3.drawBitmap(bitmap2, (Rect) null, new RectF(fM14280b3, fM1B2, fM14280b3 + f4, f4 + fM1B2), (Paint) null);
                }
            } else {
                Bitmap bitmap3 = this.f42091t1;
                if (bitmap3 != null && !bitmap3.isRecycled()) {
                    Bitmap bitmap4 = this.f42091t1;
                    Intrinsics.m18596d(bitmap4);
                    canvas3.drawBitmap(bitmap4, (Rect) null, new RectF(fM14280b3, fM1B2, fM14280b3 + f4, f4 + fM1B2), (Paint) null);
                }
            }
            m14290n(this.f42049e0, this.f42096v0);
            String str6 = this.f42097v1;
            float fM14280b4 = rectF5.left + m14280b(22.0f);
            float fM14280b5 = rectF5.top + m14280b(14.0f);
            Paint paint12 = this.f42101x;
            Intrinsics.m18596d(paint12);
            canvas3.drawText(str6, fM14280b4, fM14280b5, paint12);
            String str7 = this.f42100w1;
            float fM14280b6 = rectF5.left + m14280b(22.0f);
            float fM14280b7 = rectF5.bottom - m14280b(10.0f);
            Paint paint13 = this.f42101x;
            Intrinsics.m18596d(paint13);
            canvas3.drawText(str7, fM14280b6, fM14280b7, paint13);
            m14290n(this.f42063j0, this.f42096v0);
            float fM14280b8 = rectF5.left + m14280b(22.0f) + fWidth2 + m14280b(4.0f);
            float fM14280b9 = rectF5.top + m14280b(14.0f);
            Paint paint14 = this.f42101x;
            Intrinsics.m18596d(paint14);
            canvas3.drawText(strM14278i, fM14280b8, fM14280b9, paint14);
            float fM14280b10 = rectF5.left + m14280b(22.0f) + fWidth3 + m14280b(4.0f);
            float fM14280b11 = rectF5.bottom - m14280b(10.0f);
            Paint paint15 = this.f42101x;
            Intrinsics.m18596d(paint15);
            canvas3.drawText(str3, fM14280b10, fM14280b11, paint15);
            int iM14280b2 = m14280b(14.0f);
            float fM14280b12 = rectF5.right - m14280b(18.0f);
            float f5 = iM14280b2;
            float fM1B3 = AbstractC0000a.m1B(rectF5.height(), f5, f2, rectF5.top);
            Bitmap bitmap5 = this.f42085r1;
            if (bitmap5 != null && !bitmap5.isRecycled()) {
                Bitmap bitmap6 = this.f42085r1;
                Intrinsics.m18596d(bitmap6);
                canvas3.drawBitmap(bitmap6, (Rect) null, new RectF(fM14280b12, fM1B3, fM14280b12 + f5, f5 + fM1B3), (Paint) null);
                Iterator it4 = arrayList5.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    Object next = it4.next();
                    if (Intrinsics.m18594b((FuturesKlinePosition) next, futuresKlinePosition)) {
                        obj = next;
                        break;
                    }
                }
                futuresKlinePosition.f42125g = fM14280b12;
                futuresKlinePosition.f42126h = fM1B3;
            }
            canvas2 = canvas3;
            it = it3;
            arrayList = arrayList5;
        }
    }

    @NotNull
    public final List<KData> getTotalDataList() {
        return this.f41998F;
    }

    public final boolean getVicePicShow() {
        return this.vicePicShow;
    }

    @NotNull
    public final List<KData> getViewDataList() {
        return this.f42000G;
    }

    /* JADX INFO: renamed from: h */
    public final String m14285h(double d) {
        if (d < 1.0d) {
            int i = this.f42076o1;
            return m14278i(this, d, i, i, 60);
        }
        if (d < 10.0d) {
            int i2 = this.f42076o1;
            return m14278i(this, d, i2, i2, 60);
        }
        if (d < 100.0d) {
            int i3 = this.f42076o1;
            return m14278i(this, d, i3, i3, 60);
        }
        if (d < 1000.0d) {
            int i4 = this.f42076o1;
            return m14278i(this, d, i4, i4, 60);
        }
        if (d < 1000000.0d) {
            int i5 = this.f42076o1;
            return m14278i(this, d / ((double) 1000), i5, i5, 60).concat("K");
        }
        if (d < 1.0E9d) {
            int i6 = this.f42076o1;
            return m14278i(this, d / ((double) 1000000), i6, i6, 60).concat("M");
        }
        if (d < 1.0E12d) {
            int i7 = this.f42076o1;
            return m14278i(this, d / ((double) 1000000000), i7, i7, 60).concat("B");
        }
        int i8 = this.f42076o1;
        return m14278i(this, d / 1000000000000L, i8, i8, 60).concat("T");
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
        KData kData = (KData) AbstractC0000a.m8e(1, this.f42002H);
        ArrayList arrayList = this.f41998F;
        int size = arrayList.size();
        int i3 = size - 1;
        if (kData.f41812a == ((KData) arrayList.get(i3)).f41812a) {
            arrayList.remove(i3);
        }
        arrayList.add(kData);
        int i4 = this.f42046d;
        if (size < i4 || (i = this.f42037a) != (size - i4) - 1) {
            m14291o();
            return false;
        }
        this.f42037a = i + 1;
        m14291o();
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final String m14286j(double d) {
        if (d < 1000.0d) {
            int i = this.f42076o1;
            return m14278i(this, d, i, i, 60);
        }
        if (d < 1000000.0d) {
            int i2 = this.f42076o1;
            return m14278i(this, d / ((double) 1000), i2, i2, 60).concat("K");
        }
        if (d < 1.0E9d) {
            int i3 = this.f42076o1;
            return m14278i(this, d / ((double) 1000000), i3, i3, 60).concat("M");
        }
        if (d < 1.0E12d) {
            int i4 = this.f42076o1;
            return m14278i(this, d / ((double) 1000000000), i4, i4, 60).concat("B");
        }
        int i5 = this.f42076o1;
        return m14278i(this, d / 1000000000000L, i5, i5, 60).concat("T");
    }

    /* JADX INFO: renamed from: k */
    public final void m14287k(float f) {
        String str;
        MiniKLineView miniKLineView;
        boolean z2 = this.f42054g;
        ArrayList arrayList = this.f42000G;
        if (!z2) {
            this.f42010L = (KData) AbstractC0000a.m8e(1, arrayList);
            return;
        }
        ArrayList arrayList2 = this.f42004I;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            double d = f;
            if (((KData) arrayList.get(i)).f41806B <= d && ((KData) arrayList.get(i)).f41807C >= d) {
                KData kData = (KData) arrayList.get(i);
                this.f42010L = kData;
                Intrinsics.m18596d(kData);
                long j = kData.f41812a;
                if (j <= 0) {
                    str = "";
                } else {
                    str = new SimpleDateFormat("yyyy-MM-dd").format(new Date(j));
                    Intrinsics.m18598f(str, "format(...)");
                }
                arrayList2.add(str);
                KData kData2 = this.f42010L;
                Intrinsics.m18596d(kData2);
                int i2 = this.f42076o1;
                arrayList2.add(m14278i(this, kData2.f41813b, i2, i2, 60));
                KData kData3 = this.f42010L;
                Intrinsics.m18596d(kData3);
                int i3 = this.f42076o1;
                arrayList2.add(m14278i(this, kData3.f41815d, i3, i3, 60));
                KData kData4 = this.f42010L;
                Intrinsics.m18596d(kData4);
                int i4 = this.f42076o1;
                arrayList2.add(m14278i(this, kData4.f41816e, i4, i4, 60));
                KData kData5 = this.f42010L;
                Intrinsics.m18596d(kData5);
                int i5 = this.f42076o1;
                arrayList2.add(m14278i(this, kData5.f41814c, i5, i5, 60));
                KData kData6 = this.f42010L;
                Intrinsics.m18596d(kData6);
                double dM14255a = kData6.m14255a();
                if (dM14255a > 0.0d) {
                    int i6 = this.f42076o1;
                    arrayList2.add(Marker.ANY_NON_NULL_MARKER.concat(m14278i(this, dM14255a, i6, i6, 60)));
                    KData kData7 = this.f42010L;
                    Intrinsics.m18596d(kData7);
                    double dM14256b = kData7.m14256b() * ((double) 100);
                    int i7 = this.f42076o1;
                    arrayList2.add(m14278i(this, dM14256b, i7, i7, 60).concat("%"));
                    miniKLineView = this;
                } else {
                    int i8 = this.f42076o1;
                    arrayList2.add(m14278i(this, dM14255a, i8, i8, 60));
                    KData kData8 = this.f42010L;
                    Intrinsics.m18596d(kData8);
                    double dM14256b2 = kData8.m14256b() * ((double) 100);
                    int i9 = this.f42076o1;
                    String strM14278i = m14278i(this, dM14256b2, i9, i9, 60);
                    miniKLineView = this;
                    arrayList2.add(strM14278i.concat("%"));
                }
                KData kData9 = miniKLineView.f42010L;
                Intrinsics.m18596d(kData9);
                arrayList2.add(m14285h(kData9.f41817f));
                KData kData10 = miniKLineView.f42010L;
                Intrinsics.m18596d(kData10);
                arrayList2.add(m14285h(kData10.f41818g));
                return;
            }
            this.f42010L = null;
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m14288l() {
        ArrayList arrayList = this.f41998F;
        if (arrayList == null || this.f42037a > arrayList.size() / 3 || !this.f42074o) {
            return;
        }
        this.f42074o = false;
        OnRequestDataListListener onRequestDataListListener = this.f42012M;
        if (onRequestDataListListener != null) {
            onRequestDataListListener.mo13968a();
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m14289m(ArrayList arrayList, boolean z2) {
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = this.f42000G;
        long j = arrayList2.size() > 0 ? ((KData) arrayList2.get(0)).f41812a : 0L;
        this.f42054g = false;
        ArrayList arrayList3 = this.f41998F;
        arrayList3.clear();
        arrayList3.addAll(arrayList);
        QuotaUtil.m14302g(arrayList3, false);
        int i = this.f42083r;
        if (i == 1) {
            QuotaUtil.m14299d(arrayList3, false);
        } else if (i == 2) {
            QuotaUtil.m14298c(arrayList3, false);
        }
        int i2 = this.f42086s;
        if (i2 == 1) {
            QuotaUtil.m14301f(arrayList3, false);
        } else if (i2 == 2) {
            QuotaUtil.m14300e(arrayList3, false);
        } else if (i2 == 3) {
            QuotaUtil.m14303h(arrayList3, false);
        }
        if (z2) {
            int size = arrayList3.size() / 2;
            this.f42037a = -1;
            if (((KData) arrayList3.get(0)).f41812a <= j && ((KData) arrayList3.get(size)).f41812a > j) {
                int i3 = 0;
                while (true) {
                    if (i3 < size) {
                        int i4 = i3 + 1;
                        if (i4 < arrayList3.size() && ((KData) arrayList3.get(i3)).f41812a <= j && ((KData) arrayList3.get(i4)).f41812a > j) {
                            this.f42037a = i3;
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
                            this.f42037a = size;
                            break;
                        }
                        size = i5;
                    } else {
                        break;
                    }
                }
            }
            if (arrayList3.size() < this.f42046d) {
                this.f42037a = 0;
            } else {
                int size3 = arrayList3.size();
                int i6 = this.f42037a;
                if (size3 - i6 < this.f42046d || i6 == -1) {
                    this.f42037a = arrayList3.size() - this.f42046d;
                }
            }
        } else {
            this.f42037a = arrayList3.size() >= this.f42046d ? arrayList3.size() - this.f42046d : 0;
        }
        m14291o();
    }

    /* JADX INFO: renamed from: n */
    public final void m14290n(int i, int i2) {
        Paint paint = this.f42092u;
        Intrinsics.m18596d(paint);
        paint.setColor(i);
        Paint paint2 = this.f42092u;
        Intrinsics.m18596d(paint2);
        float f = i2;
        paint2.setTextSize(m14293q(f));
        Paint paint3 = this.f42101x;
        Intrinsics.m18596d(paint3);
        paint3.setColor(i);
        Paint paint4 = this.f42101x;
        Intrinsics.m18596d(paint4);
        paint4.setTextSize(m14293q(f));
    }

    /* JADX INFO: renamed from: o */
    public final void m14291o() {
        ArrayList arrayList = this.f42000G;
        arrayList.clear();
        int i = this.f42046d;
        ArrayList arrayList2 = this.f41998F;
        int iMin = Math.min(i, arrayList2.size());
        int i2 = 0;
        if (this.f42037a >= 0) {
            while (i2 < iMin) {
                if (this.f42037a + i2 < arrayList2.size()) {
                    arrayList.add(arrayList2.get(this.f42037a + i2));
                }
                i2++;
            }
        } else {
            while (i2 < iMin) {
                arrayList.add(arrayList2.get(i2));
                i2++;
            }
        }
        if (arrayList.size() > 0 && !this.f42054g) {
            this.f42010L = (KData) AbstractC0000a.m8e(1, arrayList);
        } else if (arrayList.isEmpty()) {
            this.f42010L = null;
        }
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x08ff  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0036  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        int i;
        int i2;
        Canvas canvas2;
        String strM14278i;
        String strM14278i2;
        String str;
        String strM14278i3;
        MiniKLineView miniKLineView;
        ArrayList arrayList;
        ArrayList arrayList2;
        Intrinsics.m18599g(canvas, "canvas");
        super.onDraw(canvas);
        if (!this.f41998F.isEmpty()) {
            ArrayList<KData> arrayList3 = this.f42000G;
            if (!arrayList3.isEmpty()) {
                float f = this.f41995D0;
                ArrayList arrayList4 = this.f42006J;
                ArrayList arrayList5 = this.f42008K;
                if (f == 0.0f) {
                    i = 3;
                } else {
                    float fM14280b = ((f - this.f41991B0) - m14280b(46.0f)) / 4;
                    arrayList5.clear();
                    for (int i3 = 0; i3 < 5; i3++) {
                        arrayList5.add(Float.valueOf((i3 * fM14280b) + this.f41991B0 + m14280b(6.0f)));
                    }
                    this.f42017O0 = ((this.f41997E0 - this.f41993C0) - m14280b(38.0f)) / 5;
                    arrayList4.clear();
                    for (int i4 = 0; i4 < 6; i4++) {
                        arrayList4.add(Float.valueOf((this.f42017O0 * i4) + this.f41993C0 + m14280b(18.0f)));
                    }
                    this.f42023R0 = ((Number) arrayList4.get(4)).floatValue() + m14280b(12.0f);
                    this.f42056g1 = (((Number) AbstractC0000a.m8e(1, arrayList5)).floatValue() - ((Number) arrayList5.get(0)).floatValue()) / this.f42046d;
                    this.f42035Y0 = ((KData) arrayList3.get(0)).f41815d;
                    this.f42042b1 = ((KData) arrayList3.get(0)).f41816e;
                    this.f42050e1 = ((KData) arrayList3.get(0)).f41817f;
                    this.f42068l1 = ((KData) arrayList3.get(0)).f41830s;
                    this.f42070m1 = ((KData) arrayList3.get(0)).f41830s;
                    double d = ((KData) arrayList3.get(0)).f41831t;
                    double d2 = ((KData) arrayList3.get(0)).f41831t;
                    double d3 = ((KData) arrayList3.get(0)).f41832u;
                    double d4 = ((KData) arrayList3.get(0)).f41832u;
                    double d5 = d;
                    this.f42073n1 = ((KData) arrayList3.get(0)).f41833v;
                    double d6 = ((KData) arrayList3.get(0)).f41834w;
                    double d7 = ((KData) arrayList3.get(0)).f41835x;
                    int size = arrayList3.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        double d8 = d7;
                        KData kData = (KData) arrayList3.get(i5);
                        double d9 = d2;
                        double d10 = this.f42056g1;
                        double dDoubleValue = ((Number) AbstractC0000a.m8e(1, arrayList5)).doubleValue() - (((arrayList3.size() - i5) - 1) * d10);
                        double d11 = d4;
                        double d12 = dDoubleValue - d10;
                        double d13 = d6;
                        double d14 = d10 / ((double) 2);
                        kData.f41806B = d12;
                        kData.f41807C = dDoubleValue;
                        kData.f41808D = dDoubleValue - d14;
                        double d15 = this.f42035Y0;
                        double d16 = kData.f41815d;
                        if (d16 >= d15) {
                            this.f42035Y0 = d16;
                            this.f42039a1 = d14 + d12;
                        }
                        double d17 = this.f42042b1;
                        double d18 = kData.f41816e;
                        if (d18 <= d17) {
                            this.f42042b1 = d18;
                            this.f42048d1 = d14 + d12;
                        }
                        double d19 = this.f42050e1;
                        double d20 = kData.f41817f;
                        if (d20 >= d19) {
                            this.f42050e1 = d20;
                        }
                        if (!this.vicePicShow || this.f42080q) {
                            d7 = d8;
                            d4 = d11;
                            d2 = d9;
                            d6 = d13;
                        } else {
                            int i6 = this.f42086s;
                            if (i6 == 1) {
                                double d21 = kData.f41830s;
                                if (d21 >= this.f42068l1) {
                                    this.f42068l1 = d21;
                                }
                                if (d21 <= this.f42070m1) {
                                    this.f42070m1 = d21;
                                }
                                double d22 = kData.f41831t;
                                if (d22 >= d5) {
                                    d5 = d22;
                                }
                                d2 = d22 <= d9 ? d22 : d9;
                                double d23 = kData.f41832u;
                                if (d23 >= d3) {
                                    d3 = d23;
                                }
                                if (d23 <= d11) {
                                    d4 = d23;
                                    d7 = d8;
                                } else {
                                    d7 = d8;
                                    d4 = d11;
                                }
                                d6 = d13;
                            } else {
                                if (i6 == 2) {
                                    double d24 = kData.f41833v;
                                    if (d24 >= this.f42073n1) {
                                        this.f42073n1 = d24;
                                    }
                                    double d25 = kData.f41834w;
                                    d6 = d25 >= d13 ? d25 : d13;
                                    d7 = kData.f41835x;
                                    if (d7 < d8) {
                                        d7 = d8;
                                    }
                                    d4 = d11;
                                    d2 = d9;
                                }
                                d7 = d8;
                                d4 = d11;
                                d2 = d9;
                                d6 = d13;
                            }
                        }
                    }
                    double d26 = d2;
                    double d27 = d4;
                    double d28 = this.f42035Y0;
                    double d29 = this.f42042b1;
                    double d30 = (d28 - d29) * 0.1d;
                    this.f42036Z0 = d28 + d30;
                    this.f42045c1 = d29 - d30;
                    if (this.vicePicShow) {
                        this.f42021Q0 = ((Number) arrayList4.get(3)).floatValue();
                        this.f42015N0 = ((Number) arrayList4.get(4)).floatValue();
                    } else {
                        this.f42021Q0 = ((Number) arrayList4.get(4)).floatValue();
                        this.f42015N0 = ((Number) arrayList4.get(5)).floatValue();
                    }
                    this.f42053f1 = ((double) (this.f42021Q0 - ((Number) arrayList4.get(0)).floatValue())) / (this.f42036Z0 - this.f42045c1);
                    this.f42064j1 = ((this.f42036Z0 - this.f42035Y0) * this.f42053f1) + ((Number) arrayList4.get(0)).doubleValue();
                    this.f42066k1 = ((this.f42036Z0 - this.f42042b1) * this.f42053f1) + ((Number) arrayList4.get(0)).doubleValue();
                    this.f42058h1 = ((double) (((Number) AbstractC0000a.m8e(1, arrayList4)).floatValue() - this.f42023R0)) / this.f42050e1;
                    for (KData kData2 : arrayList3) {
                        double d31 = kData2.f41813b;
                        kData2.f41809E = ((this.f42036Z0 - kData2.f41814c) * this.f42053f1) + ((Number) arrayList4.get(0)).doubleValue();
                        kData2.f41810F = ((this.f42036Z0 - d31) * this.f42053f1) + ((Number) arrayList4.get(0)).doubleValue();
                    }
                    if (this.vicePicShow) {
                        int i7 = this.f42086s;
                        if (i7 == 1) {
                            i = 3;
                            double d32 = this.f42068l1;
                            if (d32 > 0.0d && this.f42070m1 < 0.0d) {
                                double dFloatValue = ((double) (((Number) AbstractC0000a.m8e(1, arrayList4)).floatValue() - this.f42023R0)) / Math.abs(this.f42068l1 - this.f42070m1);
                                this.f42061i1 = dFloatValue;
                                this.f42025S0 = (float) ((this.f42068l1 * dFloatValue) + ((double) this.f42023R0));
                            } else if (d32 <= 0.0d) {
                                this.f42061i1 = ((double) (((Number) AbstractC0000a.m8e(1, arrayList4)).floatValue() - this.f42023R0)) / Math.abs(this.f42070m1);
                                this.f42025S0 = this.f42023R0;
                            } else {
                                i2 = 1;
                                if (this.f42070m1 >= 0.0d) {
                                    this.f42061i1 = ((double) (((Number) AbstractC0000a.m8e(1, arrayList4)).floatValue() - this.f42023R0)) / Math.abs(this.f42068l1);
                                    this.f42025S0 = ((Number) AbstractC0000a.m8e(1, arrayList4)).floatValue();
                                }
                                if (d5 <= 0.0d && d26 < 0.0d) {
                                    ((Number) AbstractC0000a.m8e(i2, arrayList4)).floatValue();
                                    m14280b(24.0f);
                                } else if (d5 > 0.0d) {
                                    ((Number) AbstractC0000a.m8e(i2, arrayList4)).floatValue();
                                    m14280b(24.0f);
                                    Math.abs(d26);
                                } else if (d26 >= 0.0d) {
                                    ((Number) AbstractC0000a.m8e(i2, arrayList4)).floatValue();
                                    m14280b(24.0f);
                                    Math.abs(d5);
                                }
                                if (d3 <= 0.0d && d27 < 0.0d) {
                                    ((Number) AbstractC0000a.m8e(i2, arrayList4)).floatValue();
                                    m14280b(24.0f);
                                } else if (d3 > 0.0d) {
                                    ((Number) AbstractC0000a.m8e(i2, arrayList4)).floatValue();
                                    m14280b(24.0f);
                                    Math.abs(d27);
                                } else if (d27 >= 0.0d) {
                                    ((Number) AbstractC0000a.m8e(i2, arrayList4)).floatValue();
                                    m14280b(24.0f);
                                    Math.abs(d3);
                                }
                            }
                            i2 = 1;
                            if (d5 <= 0.0d) {
                                if (d5 > 0.0d) {
                                }
                                if (d3 <= 0.0d) {
                                    if (d3 > 0.0d) {
                                    }
                                }
                            }
                        } else if (i7 != 2) {
                            i = 3;
                            if (i7 == 3) {
                                ((Number) AbstractC0000a.m8e(1, arrayList4)).floatValue();
                            }
                        } else {
                            i = 3;
                            ((Number) AbstractC0000a.m8e(1, arrayList4)).floatValue();
                            m14280b(12.0f);
                            ((Number) arrayList4.get(arrayList4.size() - 1)).floatValue();
                            m14280b(12.0f);
                            ((Number) arrayList4.get(arrayList4.size() - 1)).floatValue();
                            m14280b(12.0f);
                        }
                    }
                }
                m14290n(this.f42069m0, 0);
                Iterator it = arrayList5.iterator();
                while (it.hasNext()) {
                    float fFloatValue = ((Number) it.next()).floatValue();
                    float fM14280b2 = this.f41993C0 + m14280b(18.0f);
                    float fM14280b3 = this.f41997E0 - m14280b(20.0f);
                    Paint paint = this.f42092u;
                    Intrinsics.m18596d(paint);
                    canvas.drawLine(fFloatValue, fM14280b2, fFloatValue, fM14280b3, paint);
                    i = i;
                }
                int i8 = i;
                int size2 = arrayList4.size();
                int i9 = 0;
                while (i9 < size2) {
                    float fFloatValue2 = (i9 == 0 || i9 == 5 || i9 == 4 || (this.vicePicShow && i9 == i8)) ? this.f41995D0 : ((Number) AbstractC0000a.m8e(1, arrayList5)).floatValue();
                    float fM14280b4 = m14280b(6.0f) + this.f41991B0;
                    float fFloatValue3 = ((Number) arrayList4.get(i9)).floatValue();
                    float fFloatValue4 = ((Number) arrayList4.get(i9)).floatValue();
                    Paint paint2 = this.f42092u;
                    Intrinsics.m18596d(paint2);
                    canvas.drawLine(fM14280b4, fFloatValue3, fFloatValue2, fFloatValue4, paint2);
                    i9++;
                }
                float fM14280b5 = m14280b(6.0f) + this.f41991B0;
                float f2 = 2;
                float fFloatValue5 = (this.f42017O0 / f2) + ((Number) arrayList4.get(4)).floatValue();
                float fFloatValue6 = ((Number) AbstractC0000a.m8e(1, arrayList5)).floatValue();
                float fFloatValue7 = (this.f42017O0 / f2) + ((Number) arrayList4.get(4)).floatValue();
                Paint paint3 = this.f42092u;
                Intrinsics.m18596d(paint3);
                canvas.drawLine(fM14280b5, fFloatValue5, fFloatValue6, fFloatValue7, paint3);
                if (this.vicePicShow) {
                    float fM14280b6 = m14280b(6.0f) + this.f41991B0;
                    float fFloatValue8 = (this.f42017O0 / f2) + ((Number) arrayList4.get(i8)).floatValue();
                    float fFloatValue9 = ((Number) AbstractC0000a.m8e(1, arrayList5)).floatValue();
                    float fFloatValue10 = (this.f42017O0 / f2) + ((Number) arrayList4.get(i8)).floatValue();
                    Paint paint4 = this.f42092u;
                    Intrinsics.m18596d(paint4);
                    canvas.drawLine(fM14280b6, fFloatValue8, fFloatValue9, fFloatValue10, paint4);
                    canvas2 = canvas;
                } else {
                    canvas2 = canvas;
                }
                Rect rect = new Rect();
                m14290n(this.f42052f0, this.f42102x0);
                Paint paint5 = this.f42101x;
                Intrinsics.m18596d(paint5);
                double d33 = this.f42036Z0;
                int i10 = this.f42076o1;
                String strM14278i4 = m14278i(this, d33, i10, i10, 60);
                double d34 = this.f42036Z0;
                int i11 = this.f42076o1;
                paint5.getTextBounds(strM14278i4, 0, m14278i(this, d34, i11, i11, 60).length(), rect);
                double d35 = this.f42036Z0;
                int i12 = this.f42076o1;
                String strM14278i5 = m14278i(this, d35, i12, i12, 60);
                float fFloatValue11 = ((Number) AbstractC0000a.m8e(1, arrayList5)).floatValue() + m14280b(4.0f);
                float fFloatValue12 = ((Number) arrayList4.get(0)).floatValue() + rect.height() + m14280b(2.0f);
                Paint paint6 = this.f42101x;
                Intrinsics.m18596d(paint6);
                canvas2.drawText(strM14278i5, fFloatValue11, fFloatValue12, paint6);
                Paint paint7 = this.f42101x;
                Intrinsics.m18596d(paint7);
                double d36 = this.f42045c1;
                int i13 = this.f42076o1;
                String strM14278i6 = m14278i(this, d36, i13, i13, 60);
                double d37 = this.f42045c1;
                int i14 = this.f42076o1;
                paint7.getTextBounds(strM14278i6, 0, m14278i(this, d37, i14, i14, 60).length(), rect);
                double d38 = this.f42045c1;
                int i15 = this.f42076o1;
                String strM14278i7 = m14278i(this, d38, i15, i15, 60);
                float fFloatValue13 = ((Number) AbstractC0000a.m8e(1, arrayList5)).floatValue() + m14280b(4.0f);
                float fM14280b7 = this.f42021Q0 - m14280b(2.0f);
                Paint paint8 = this.f42101x;
                Intrinsics.m18596d(paint8);
                canvas2.drawText(strM14278i7, fFloatValue13, fM14280b7, paint8);
                if (this.vicePicShow) {
                    double d39 = (this.f42036Z0 - this.f42045c1) / ((double) 3);
                    int i16 = 0;
                    while (i16 < 2) {
                        int i17 = i16 + 1;
                        double d40 = this.f42036Z0 - (((double) i17) * d39);
                        int i18 = this.f42076o1;
                        String strM14278i8 = m14278i(this, d40, i18, i18, 60);
                        float fFloatValue14 = ((Number) AbstractC0000a.m8e(1, arrayList5)).floatValue() + m14280b(4.0f);
                        float fHeight = (rect.height() / 2.0f) + ((Number) arrayList4.get(i17)).floatValue();
                        Paint paint9 = this.f42101x;
                        Intrinsics.m18596d(paint9);
                        canvas2.drawText(strM14278i8, fFloatValue14, fHeight, paint9);
                        i16 = i17;
                    }
                    int i19 = this.f42086s;
                    if (i19 == 1) {
                        double d41 = this.f42068l1;
                        if (d41 > 0.0d && this.f42070m1 < 0.0d) {
                            int i20 = this.f42076o1;
                            strM14278i = m14278i(this, d41, i20, i20, 60);
                            double d42 = this.f42070m1;
                            int i21 = this.f42076o1;
                            strM14278i3 = m14278i(this, d42, i21, i21, 60);
                            double d43 = (this.f42068l1 - this.f42070m1) / ((double) 2);
                            int i22 = this.f42076o1;
                            strM14278i2 = m14278i(this, d43, i22, i22, 60);
                        } else if (d41 <= 0.0d) {
                            double d44 = this.f42070m1;
                            int i23 = this.f42076o1;
                            strM14278i3 = m14278i(this, d44, i23, i23, 60);
                            double d45 = (this.f42070m1 - this.f42068l1) / ((double) 2);
                            int i24 = this.f42076o1;
                            strM14278i2 = m14278i(this, d45, i24, i24, 60);
                            strM14278i = "0";
                        } else {
                            if (this.f42070m1 >= 0.0d) {
                                int i25 = this.f42076o1;
                                strM14278i = m14278i(this, d41, i25, i25, 60);
                                double d46 = (this.f42068l1 - this.f42070m1) / ((double) 2);
                                int i26 = this.f42076o1;
                                strM14278i2 = m14278i(this, d46, i26, i26, 60);
                                str = "0";
                            }
                            strM14278i = "";
                            strM14278i2 = "";
                            str = strM14278i2;
                        }
                        str = strM14278i3;
                    } else {
                        if (i19 == 2) {
                            double d47 = this.f42073n1;
                            int i27 = this.f42076o1;
                            strM14278i = m14278i(this, d47, i27, i27, 60);
                            double d48 = this.f42073n1 / ((double) 2);
                            int i28 = this.f42076o1;
                            strM14278i2 = m14278i(this, d48, i28, i28, 60);
                        } else {
                            if (i19 == 3) {
                                strM14278i = "100";
                                strM14278i2 = "50";
                            }
                            strM14278i = "";
                            strM14278i2 = "";
                            str = strM14278i2;
                        }
                        str = "0";
                    }
                    float fFloatValue15 = ((Number) AbstractC0000a.m8e(1, arrayList5)).floatValue() + m14280b(4.0f);
                    float fFloatValue16 = ((Number) AbstractC0000a.m8e(2, arrayList4)).floatValue() + rect.height() + m14280b(2.0f);
                    Paint paint10 = this.f42101x;
                    Intrinsics.m18596d(paint10);
                    canvas2.drawText(strM14278i, fFloatValue15, fFloatValue16, paint10);
                    float fFloatValue17 = ((Number) AbstractC0000a.m8e(1, arrayList5)).floatValue() + m14280b(4.0f);
                    float fHeight2 = (rect.height() / 2.0f) + (((Number) AbstractC0000a.m8e(1, arrayList4)).floatValue() - (this.f42017O0 / f2));
                    Paint paint11 = this.f42101x;
                    Intrinsics.m18596d(paint11);
                    canvas2.drawText(strM14278i2, fFloatValue17, fHeight2, paint11);
                    float fFloatValue18 = ((Number) AbstractC0000a.m8e(1, arrayList5)).floatValue() + m14280b(4.0f);
                    float fFloatValue19 = ((Number) AbstractC0000a.m8e(1, arrayList4)).floatValue() - m14280b(2.0f);
                    Paint paint12 = this.f42101x;
                    Intrinsics.m18596d(paint12);
                    canvas2.drawText(str, fFloatValue18, fFloatValue19, paint12);
                } else {
                    double d49 = (this.f42036Z0 - this.f42045c1) / ((double) 4);
                    int i29 = 0;
                    while (i29 < 3) {
                        int i30 = i29 + 1;
                        double d50 = this.f42036Z0 - (((double) i30) * d49);
                        int i31 = this.f42076o1;
                        String strM14278i9 = m14278i(this, d50, i31, i31, 60);
                        float fFloatValue20 = ((Number) AbstractC0000a.m8e(1, arrayList5)).floatValue() + m14280b(4.0f);
                        float fHeight3 = (rect.height() / 2.0f) + ((Number) arrayList4.get(i30)).floatValue();
                        Paint paint13 = this.f42101x;
                        Intrinsics.m18596d(paint13);
                        canvas2.drawText(strM14278i9, fFloatValue20, fHeight3, paint13);
                        i29 = i30;
                    }
                }
                Paint paint14 = this.f42101x;
                Intrinsics.m18596d(paint14);
                paint14.getTextBounds(m14286j(this.f42050e1), 0, m14286j(this.f42050e1).length(), rect);
                String strM14286j = m14286j(this.f42050e1);
                float fFloatValue21 = ((Number) AbstractC0000a.m8e(1, arrayList5)).floatValue() + m14280b(4.0f);
                float fHeight4 = this.f42021Q0 + rect.height() + m14280b(2.0f);
                Paint paint15 = this.f42101x;
                Intrinsics.m18596d(paint15);
                canvas2.drawText(strM14286j, fFloatValue21, fHeight4, paint15);
                double d51 = 2;
                String strM14286j2 = m14286j(this.f42050e1 / d51);
                float fFloatValue22 = ((Number) AbstractC0000a.m8e(1, arrayList5)).floatValue() + m14280b(4.0f);
                float fHeight5 = (rect.height() / 2.0f) + (this.f42015N0 - (this.f42017O0 / f2));
                Paint paint16 = this.f42101x;
                Intrinsics.m18596d(paint16);
                canvas2.drawText(strM14286j2, fFloatValue22, fHeight5, paint16);
                float fFloatValue23 = ((Number) AbstractC0000a.m8e(1, arrayList5)).floatValue() + m14280b(4.0f);
                float fM14280b8 = this.f42015N0 - m14280b(2.0f);
                Paint paint17 = this.f42101x;
                Intrinsics.m18596d(paint17);
                canvas2.drawText("0", fFloatValue23, fM14280b8, paint17);
                ArrayList arrayList6 = this.f42079p1;
                arrayList6.clear();
                m14290n(this.f42049e0, this.f42078p0);
                int size3 = arrayList5.size();
                int i32 = 0;
                while (i32 < size3) {
                    if (i32 == 0) {
                        if (((KData) arrayList3.get(0)).f41806B <= (this.f42056g1 / d51) + ((Number) arrayList5.get(0)).doubleValue()) {
                            arrayList2 = arrayList5;
                            if (((KData) arrayList3.get(0)).f41807C > ((Number) arrayList5.get(0)).floatValue()) {
                                String strM14277g = m14277g(((KData) arrayList3.get(0)).f41812a);
                                float fM14280b9 = this.f41991B0 + m14280b(6.0f);
                                float fM14280b10 = this.f41997E0 - m14280b(7.0f);
                                Paint paint18 = this.f42101x;
                                Intrinsics.m18596d(paint18);
                                canvas2.drawText(strM14277g, fM14280b9, fM14280b10, paint18);
                            }
                        } else {
                            arrayList2 = arrayList5;
                        }
                        if (i32 == arrayList2.size() - 1) {
                            String strM14277g2 = m14277g(((KData) AbstractC0000a.m8e(1, arrayList3)).f41812a);
                            float fM14280b11 = this.f41995D0 - m14280b(41.0f);
                            Paint paint19 = this.f42101x;
                            Intrinsics.m18596d(paint19);
                            float fMeasureText = fM14280b11 - paint19.measureText(strM14277g2);
                            float fM14280b12 = this.f41997E0 - m14280b(7.0f);
                            Paint paint20 = this.f42101x;
                            Intrinsics.m18596d(paint20);
                            canvas2.drawText(strM14277g2, fMeasureText, fM14280b12, paint20);
                        } else {
                            int i33 = 0;
                            for (Object obj : arrayList3) {
                                int i34 = i33 + 1;
                                if (i33 < 0) {
                                    CollectionsKt.m18455s0();
                                    throw null;
                                }
                                KData kData3 = (KData) obj;
                                float f3 = f2;
                                ArrayList arrayList7 = arrayList2;
                                double d52 = d51;
                                if (kData3.f41806B <= ((Number) arrayList7.get(i32)).floatValue() && kData3.f41807C >= ((Number) arrayList7.get(i32)).floatValue()) {
                                    String strM14277g3 = m14277g(kData3.f41812a);
                                    arrayList6.add(strM14277g3);
                                    if (arrayList6.size() == 2) {
                                        float fFloatValue24 = ((Number) arrayList7.get(i32)).floatValue();
                                        Paint paint21 = this.f42101x;
                                        Intrinsics.m18596d(paint21);
                                        float fMeasureText2 = fFloatValue24 - (paint21.measureText(strM14277g3) / f3);
                                        float fM14280b13 = this.f41997E0 - m14280b(7.0f);
                                        Paint paint22 = this.f42101x;
                                        Intrinsics.m18596d(paint22);
                                        canvas2.drawText(strM14277g3, fMeasureText2, fM14280b13, paint22);
                                    }
                                }
                                f2 = f3;
                                arrayList2 = arrayList7;
                                i33 = i34;
                                d51 = d52;
                            }
                        }
                    }
                    i32++;
                    f2 = f2;
                    arrayList5 = arrayList2;
                    d51 = d51;
                }
                float f4 = f2;
                KData kData4 = this.f42010L;
                if (kData4 != null) {
                    float f5 = (float) kData4.f41809E;
                    RectF rectF = new RectF(this.f41995D0 - m14280b(38.0f), f5 - m14280b(7.0f), this.f41995D0 - m14280b(1.0f), m14280b(7.0f) + f5);
                    RectF rectF2 = new RectF(rectF.left, rectF.top, rectF.right, rectF.bottom);
                    Paint paint23 = new Paint();
                    paint23.setColor(-1);
                    paint23.setStyle(Paint.Style.FILL);
                    canvas2.drawRoundRect(rectF2, m14280b(4.0f), m14280b(4.0f), paint23);
                    Paint paint24 = new Paint();
                    paint24.setColor(-16777216);
                    paint24.setStyle(Paint.Style.STROKE);
                    paint24.setStrokeWidth(1.0f);
                    canvas2.drawRoundRect(rectF, m14280b(4.0f), m14280b(4.0f), paint24);
                    KData kData5 = this.f42010L;
                    Intrinsics.m18596d(kData5);
                    if (kData5.m14255a() > 0.0d) {
                        Paint paint25 = this.f42095v;
                        Intrinsics.m18596d(paint25);
                        paint25.setColor(this.f42022R);
                    } else {
                        Paint paint26 = this.f42095v;
                        Intrinsics.m18596d(paint26);
                        paint26.setColor(this.f42024S);
                    }
                    KData kData6 = this.f42010L;
                    Intrinsics.m18596d(kData6);
                    int i35 = this.f42076o1;
                    String strM14278i10 = m14278i(this, kData6.f41814c, i35, i35, 60);
                    miniKLineView = this;
                    Rect rect2 = new Rect();
                    miniKLineView.m14290n(miniKLineView.f42063j0, miniKLineView.f42096v0);
                    Paint paint27 = miniKLineView.f42101x;
                    Intrinsics.m18596d(paint27);
                    paint27.getTextBounds(strM14278i10, 0, strM14278i10.length(), rect2);
                    float fM1B = AbstractC0000a.m1B(rectF2.width(), rect2.width(), f4, rectF2.left);
                    float fM14280b14 = (f5 + miniKLineView.m14280b(7.0f)) - ((rectF2.height() - rect2.height()) / f4);
                    Paint paint28 = miniKLineView.f42101x;
                    Intrinsics.m18596d(paint28);
                    canvas2.drawText(strM14278i10, fM1B, fM14280b14, paint28);
                } else {
                    miniKLineView = this;
                }
                for (KData kData7 : arrayList3) {
                    if (kData7.f41813b >= kData7.f41814c) {
                        Paint paint29 = miniKLineView.f42095v;
                        Intrinsics.m18596d(paint29);
                        paint29.setColor(miniKLineView.f42024S);
                    } else {
                        Paint paint30 = miniKLineView.f42095v;
                        Intrinsics.m18596d(paint30);
                        paint30.setColor(miniKLineView.f42022R);
                    }
                    float fM14280b15 = (float) (kData7.f41806B + ((double) miniKLineView.m14280b(0.5f)));
                    float f6 = (float) (((double) miniKLineView.f42015N0) - (kData7.f41817f * miniKLineView.f42058h1));
                    float fM14280b16 = ((float) kData7.f41807C) - miniKLineView.m14280b(0.5f);
                    float f7 = miniKLineView.f42015N0;
                    Paint paint31 = miniKLineView.f42095v;
                    Intrinsics.m18596d(paint31);
                    canvas2.drawRect(fM14280b15, f6, fM14280b16, f7, paint31);
                }
                Canvas canvas3 = canvas2;
                if (miniKLineView.f42080q) {
                    miniKLineView.f42089t = 0;
                    if (miniKLineView.f41990B != null) {
                        ArrayList arrayList8 = miniKLineView.f42000G;
                        if (!arrayList8.isEmpty() && miniKLineView.f42092u != null) {
                            Path path = miniKLineView.f41990B;
                            Intrinsics.m18596d(path);
                            path.reset();
                            Path path2 = miniKLineView.f41992C;
                            Intrinsics.m18596d(path2);
                            path2.reset();
                            float f8 = (float) ((KData) arrayList8.get(0)).f41808D;
                            float f9 = (float) ((KData) arrayList8.get(0)).f41809E;
                            Path path3 = miniKLineView.f41990B;
                            Intrinsics.m18596d(path3);
                            path3.moveTo(f8, f9);
                            Path path4 = miniKLineView.f41992C;
                            Intrinsics.m18596d(path4);
                            path4.moveTo(f8, f9);
                            int size4 = arrayList8.size();
                            int i36 = 1;
                            while (true) {
                                arrayList = miniKLineView.f42008K;
                                if (i36 >= size4) {
                                    break;
                                }
                                KData kData8 = (KData) arrayList8.get(i36);
                                Path path5 = miniKLineView.f41990B;
                                Intrinsics.m18596d(path5);
                                path5.lineTo((float) kData8.f41808D, (float) kData8.f41809E);
                                Path path6 = miniKLineView.f41992C;
                                Intrinsics.m18596d(path6);
                                path6.lineTo((float) kData8.f41808D, (float) kData8.f41809E);
                                if (i36 == size4 - 1) {
                                    Path path7 = miniKLineView.f41992C;
                                    Intrinsics.m18596d(path7);
                                    path7.lineTo(((Number) arrayList.get(arrayList.size() - 1)).floatValue(), (float) kData8.f41809E);
                                }
                                i36++;
                            }
                            miniKLineView.m14290n(-12204175, 0);
                            Path path8 = miniKLineView.f41990B;
                            Intrinsics.m18596d(path8);
                            Paint paint32 = miniKLineView.f42092u;
                            Intrinsics.m18596d(paint32);
                            canvas3.drawPath(path8, paint32);
                            Path path9 = miniKLineView.f41992C;
                            Intrinsics.m18596d(path9);
                            float fFloatValue25 = ((Number) arrayList.get(arrayList.size() - 1)).floatValue();
                            ArrayList arrayList9 = miniKLineView.f42006J;
                            path9.lineTo(fFloatValue25, ((Number) AbstractC0000a.m8e(2, arrayList9)).floatValue());
                            Path path10 = miniKLineView.f41992C;
                            Intrinsics.m18596d(path10);
                            path10.lineTo(f8, ((Number) arrayList9.get(arrayList9.size() - 2)).floatValue());
                            Path path11 = miniKLineView.f41992C;
                            Intrinsics.m18596d(path11);
                            path11.close();
                            LinearGradient linearGradient = new LinearGradient(0.0f, (int) miniKLineView.f42064j1, 0.0f, ((Number) AbstractC0000a.m8e(2, arrayList9)).floatValue(), 230162176, 1974566, Shader.TileMode.CLAMP);
                            Paint paint33 = miniKLineView.f42098w;
                            Intrinsics.m18596d(paint33);
                            paint33.setShader(linearGradient);
                            Path path12 = miniKLineView.f41992C;
                            Intrinsics.m18596d(path12);
                            Paint paint34 = miniKLineView.f42098w;
                            Intrinsics.m18596d(paint34);
                            canvas3.drawPath(path12, paint34);
                        }
                    }
                } else {
                    ArrayList<KData> arrayList10 = miniKLineView.f42000G;
                    arrayList10.size();
                    for (KData kData9 : arrayList10) {
                        double d53 = kData9.f41813b;
                        double d54 = kData9.f41814c;
                        if (d53 >= d54) {
                            Paint paint35 = miniKLineView.f42095v;
                            Intrinsics.m18596d(paint35);
                            paint35.setColor(miniKLineView.f42024S);
                            miniKLineView.m14290n(miniKLineView.f42024S, 0);
                        } else {
                            Paint paint36 = miniKLineView.f42095v;
                            Intrinsics.m18596d(paint36);
                            paint36.setColor(miniKLineView.f42022R);
                            miniKLineView.m14290n(miniKLineView.f42022R, 0);
                            d54 = d53;
                            d53 = d54;
                        }
                        double d55 = miniKLineView.f42064j1;
                        double d56 = miniKLineView.f42035Y0;
                        double d57 = miniKLineView.f42053f1;
                        float f10 = (float) (((d56 - d53) * d57) + d55);
                        float f11 = (float) (((d56 - d54) * d57) + d55);
                        if (f10 == f11) {
                            f11 = 1 + f10;
                        }
                        float f12 = f11;
                        float fM14280b17 = ((float) kData9.f41806B) + miniKLineView.m14280b(0.5f);
                        float fM14280b18 = ((float) kData9.f41807C) - miniKLineView.m14280b(0.5f);
                        Paint paint37 = miniKLineView.f42095v;
                        Intrinsics.m18596d(paint37);
                        canvas3.drawRect(fM14280b17, f10, fM14280b18, f12, paint37);
                        float f13 = (float) kData9.f41808D;
                        double d58 = miniKLineView.f42064j1;
                        double d59 = miniKLineView.f42035Y0;
                        double d60 = d59 - kData9.f41815d;
                        double d61 = miniKLineView.f42053f1;
                        float f14 = (float) (((d59 - kData9.f41816e) * d61) + d58);
                        Paint paint38 = miniKLineView.f42092u;
                        Intrinsics.m18596d(paint38);
                        canvas.drawLine(f13, (float) ((d60 * d61) + d58), f13, f14, paint38);
                        if (miniKLineView.vicePicShow && miniKLineView.f42086s == 1) {
                            double d62 = kData9.f41830s;
                            if (d62 > 0.0d) {
                                Paint paint39 = miniKLineView.f42095v;
                                Intrinsics.m18596d(paint39);
                                paint39.setColor(miniKLineView.f42044c0);
                                float fM14280b19 = (float) (kData9.f41806B + ((double) miniKLineView.m14280b(0.5f)));
                                float f15 = (float) (((double) miniKLineView.f42025S0) - (d62 * miniKLineView.f42061i1));
                                float fM14280b20 = ((float) kData9.f41807C) - miniKLineView.m14280b(0.5f);
                                float f16 = miniKLineView.f42025S0;
                                Paint paint40 = miniKLineView.f42095v;
                                Intrinsics.m18596d(paint40);
                                canvas3 = canvas;
                                canvas3.drawRect(fM14280b19, f15, fM14280b20, f16, paint40);
                            } else {
                                Paint paint41 = miniKLineView.f42095v;
                                Intrinsics.m18596d(paint41);
                                paint41.setColor(miniKLineView.f42047d0);
                                float fM14280b21 = (float) (kData9.f41806B + ((double) miniKLineView.m14280b(0.5f)));
                                float f17 = miniKLineView.f42025S0;
                                float fM14280b22 = ((float) kData9.f41807C) - miniKLineView.m14280b(0.5f);
                                float fAbs = (float) ((Math.abs(d62) * miniKLineView.f42061i1) + ((double) miniKLineView.f42025S0));
                                Paint paint42 = miniKLineView.f42095v;
                                Intrinsics.m18596d(paint42);
                                canvas3 = canvas;
                                canvas3.drawRect(fM14280b21, f17, fM14280b22, fAbs, paint42);
                            }
                        } else {
                            canvas3 = canvas;
                        }
                    }
                    m14283e(canvas);
                }
                m14281c(canvas);
                m14282d(canvas);
                m14284f(canvas);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f41991B0 = getPaddingLeft();
        this.f41993C0 = getPaddingTop();
        this.f41995D0 = getMeasuredWidth() - getPaddingRight();
        this.f41997E0 = getMeasuredHeight() - getPaddingBottom();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View v, MotionEvent event) {
        Intrinsics.m18599g(v, "v");
        Intrinsics.m18599g(event, "event");
        if (this.f42077p) {
            return false;
        }
        GestureDetector gestureDetector = this.f42020Q;
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
        Object next;
        Intrinsics.m18599g(event, "event");
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            Iterator it = this.f42082q1.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                FuturesKlinePosition futuresKlinePosition = (FuturesKlinePosition) next;
                if (event.getX() >= futuresKlinePosition.f42125g && event.getX() <= futuresKlinePosition.f42125g + m14280b(14.0f) && event.getY() >= futuresKlinePosition.f42126h && event.getY() <= futuresKlinePosition.f42126h + m14280b(14.0f)) {
                    break;
                }
            }
            FuturesKlinePosition futuresKlinePosition2 = (FuturesKlinePosition) next;
            if (futuresKlinePosition2 == null) {
                this.f42007J0 = event.getX();
                this.f42027T0 = event.getY();
                this.f42019P0 = 0.0f;
                this.f41999F0 = event.getX(0);
                this.f42001G0 = event.getY(0);
                return true;
            }
            OnRequestDataListListener onRequestDataListListener = this.f42012M;
            if (onRequestDataListListener != null) {
                onRequestDataListListener.mo13969b(futuresKlinePosition2.f42119a);
            }
        } else {
            if (actionMasked == 1) {
                if (!this.f42077p) {
                    float fAbs = Math.abs(event.getX() - this.f42007J0);
                    float fAbs2 = Math.abs(event.getY() - this.f42027T0);
                    float f = this.f41989A0;
                    if (fAbs2 < f && fAbs < f) {
                        this.f42054g = true;
                        if (this.f42089t == 2) {
                            this.f42011L0 = event.getY();
                        }
                        m14287k(this.f42007J0);
                        if (this.f42010L != null) {
                            invalidate();
                        }
                    }
                }
                this.f42077p = false;
                return true;
            }
            if (actionMasked != 2) {
                if (actionMasked == 3) {
                    this.f42077p = false;
                    return true;
                }
                if (actionMasked == 5) {
                    this.f42054g = false;
                    this.f42077p = true;
                    removeCallbacks(this.f42018P);
                    this.f42029U0 = event.getX(1);
                    float y2 = event.getY(1);
                    this.f42003H0 = Math.abs(this.f42029U0 - this.f41999F0);
                    this.f42005I0 = Math.abs(y2 - this.f42001G0);
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
                ArrayList arrayList = this.f41998F;
                ArrayList arrayList2 = this.f42008K;
                if ((fAbs3 >= fAbs4 && fAbs3 - this.f42003H0 > 1.0f) || (fAbs4 >= fAbs3 && fAbs4 - this.f42005I0 > 1.0f)) {
                    int i = this.f42046d;
                    int i2 = this.f42040b;
                    if (i <= i2) {
                        this.f42046d = i2;
                    } else {
                        int size = this.f42000G.size();
                        int i3 = this.f42046d;
                        if (size < i3) {
                            this.f42046d = i3 - 2;
                            this.f42037a = arrayList.size() - this.f42046d;
                        } else if (this.f41999F0 >= ((Number) arrayList2.get(2)).floatValue() || this.f42029U0 > ((Number) arrayList2.get(2)).floatValue()) {
                            float f4 = this.f41999F0;
                            float f5 = this.f42029U0;
                            float fFloatValue = ((Number) arrayList2.get(2)).floatValue();
                            if (f4 > fFloatValue || fFloatValue > f5) {
                                float f6 = this.f42029U0;
                                float f7 = this.f41999F0;
                                float fFloatValue2 = ((Number) arrayList2.get(2)).floatValue();
                                if (f6 <= fFloatValue2 && fFloatValue2 <= f7) {
                                    this.f42046d -= 2;
                                    this.f42037a++;
                                } else if (this.f41999F0 >= ((Number) arrayList2.get(2)).floatValue() && this.f42029U0 > ((Number) arrayList2.get(2)).floatValue()) {
                                    this.f42046d -= 2;
                                    this.f42037a += 2;
                                }
                            }
                        } else {
                            this.f42046d -= 2;
                        }
                    }
                    m14291o();
                } else if ((fAbs3 >= fAbs4 && fAbs3 - this.f42003H0 < -1.0f) || (fAbs4 >= fAbs3 && fAbs4 - this.f42005I0 < -1.0f)) {
                    int i4 = this.f42046d;
                    int i5 = this.f42043c;
                    if (i4 >= i5) {
                        this.f42046d = i5;
                    } else if (this.f42037a + i4 >= arrayList.size()) {
                        this.f42046d += 2;
                        this.f42037a = arrayList.size() - this.f42046d;
                    } else if (this.f42037a <= 0) {
                        this.f42037a = 0;
                        this.f42046d += 2;
                    } else if (this.f41999F0 >= ((Number) arrayList2.get(2)).floatValue() || this.f42029U0 > ((Number) arrayList2.get(2)).floatValue()) {
                        float f8 = this.f41999F0;
                        float f9 = this.f42029U0;
                        float fFloatValue3 = ((Number) arrayList2.get(2)).floatValue();
                        if (f8 > fFloatValue3 || fFloatValue3 > f9) {
                            float f10 = this.f42029U0;
                            float f11 = this.f41999F0;
                            float fFloatValue4 = ((Number) arrayList2.get(2)).floatValue();
                            if (f10 <= fFloatValue4 && fFloatValue4 <= f11) {
                                this.f42046d += 2;
                                this.f42037a--;
                            } else if (this.f41999F0 >= ((Number) arrayList2.get(2)).floatValue() && this.f42029U0 > ((Number) arrayList2.get(2)).floatValue()) {
                                this.f42046d += 2;
                                this.f42037a -= 2;
                            }
                        }
                    } else {
                        this.f42046d += 2;
                    }
                    m14291o();
                }
                this.f42003H0 = Math.abs(f2);
                this.f42005I0 = Math.abs(f3);
                return true;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final void m14292p(double d, float f) {
        this.f42037a += (Math.abs(f) <= 1.0f || Math.abs(f) >= 2.0f) ? Math.abs(f) < 10.0f ? ((int) f) % 2 : (int) (((double) ((int) f)) / d) : ((int) (f * 10)) % 2;
    }

    /* JADX INFO: renamed from: q */
    public final int m14293q(float f) {
        return (int) ((f * getContext().getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    public final void setCloseBitmap(@NotNull Bitmap bitmap) {
        Intrinsics.m18599g(bitmap, "bitmap");
        this.f42085r1 = bitmap;
    }

    public final void setCrossHairMoveMode(int moveMode) {
        this.f42089t = moveMode;
    }

    public final void setDeputyImgType(int type) {
        this.f42086s = type;
        ArrayList arrayList = this.f41998F;
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
            setDeputyImgType(this.f42086s);
        }
        invalidate();
    }

    public final void setFixed(int num) {
        this.f42076o1 = num;
    }

    public final void setLiqPriceText(@NotNull String text) {
        Intrinsics.m18599g(text, "text");
        this.f42094u1 = text;
    }

    public final void setMainImgType(int type) {
        ArrayList arrayList = this.f41998F;
        if (type == 0) {
            QuotaUtil.m14302g(arrayList, false);
        } else if (type == 1) {
            QuotaUtil.m14299d(arrayList, false);
        } else if (type == 2) {
            QuotaUtil.m14298c(arrayList, false);
        }
        this.f42083r = type;
        invalidate();
    }

    public final void setMarginText(@NotNull String text) {
        Intrinsics.m18599g(text, "text");
        this.f42097v1 = text;
    }

    public final void setOnRequestDataListListener(@Nullable OnRequestDataListListener requestListener) {
        this.f42012M = requestListener;
    }

    public final void setPnlText(@NotNull String text) {
        Intrinsics.m18599g(text, "text");
        this.f42100w1 = text;
    }

    public final void setShowInstant(boolean state) {
        this.f42080q = state;
        invalidate();
    }

    public final void setSideBuyBitmap(@NotNull Bitmap bitmap) {
        Intrinsics.m18599g(bitmap, "bitmap");
        this.f42088s1 = bitmap;
    }

    public final void setSideSellBitmap(@NotNull Bitmap bitmap) {
        Intrinsics.m18599g(bitmap, "bitmap");
        this.f42091t1 = bitmap;
    }
}
