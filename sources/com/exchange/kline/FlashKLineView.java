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
import com.exchange.kline.data.FlashOrder;
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
@Metadata(m18301d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0003'()J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\r\u0010\fJ\u0015\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0011J\u0015\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b\u0018\u0010\u0011J\u0015\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u000e¢\u0006\u0004\b\u001a\u0010\u0011J\u0015\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0014¢\u0006\u0004\b\u001c\u0010\u0017J\u0015\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 R$\u0010&\u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u00148\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006*"}, m18302d2 = {"Lcom/exchange/kline/FlashKLineView;", "Landroid/view/View;", "Landroid/view/View$OnTouchListener;", "Landroid/os/Handler$Callback;", "Lcom/exchange/kline/FlashKLineView$OnRequestDataListListener;", "requestListener", "", "setOnRequestDataListListener", "(Lcom/exchange/kline/FlashKLineView$OnRequestDataListListener;)V", "", "Lcom/exchange/kline/KData;", "getTotalDataList", "()Ljava/util/List;", "getViewDataList", "", "num", "setFixed", "(I)V", "type", "setMainImgType", "", "showState", "setDeputyPicShow", "(Z)V", "setDeputyImgType", "moveMode", "setCrossHairMoveMode", "state", "setShowInstant", "Landroid/graphics/Bitmap;", "bitmap", "setFlashBitmap", "(Landroid/graphics/Bitmap;)V", "value", "f", "Z", "getVicePicShow", "()Z", "vicePicShow", "OnRequestDataListListener", "CustomGestureListener", "Companion", "kline_release"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
@SourceDebugExtension
public final class FlashKLineView extends View implements View.OnTouchListener, Handler.Callback {

    /* JADX INFO: renamed from: s1 */
    public static final /* synthetic */ int f41688s1 = 0;

    /* JADX INFO: renamed from: A */
    public final Paint f41689A;

    /* JADX INFO: renamed from: A0 */
    public final int f41690A0;

    /* JADX INFO: renamed from: B */
    public final Path f41691B;

    /* JADX INFO: renamed from: B0 */
    public float f41692B0;

    /* JADX INFO: renamed from: C */
    public final Path f41693C;

    /* JADX INFO: renamed from: C0 */
    public float f41694C0;

    /* JADX INFO: renamed from: D */
    public final Rect f41695D;

    /* JADX INFO: renamed from: D0 */
    public float f41696D0;

    /* JADX INFO: renamed from: E */
    public final String[] f41697E;

    /* JADX INFO: renamed from: E0 */
    public float f41698E0;

    /* JADX INFO: renamed from: F */
    public final ArrayList f41699F;

    /* JADX INFO: renamed from: F0 */
    public float f41700F0;

    /* JADX INFO: renamed from: G */
    public final ArrayList f41701G;

    /* JADX INFO: renamed from: G0 */
    public float f41702G0;

    /* JADX INFO: renamed from: H */
    public final ArrayList f41703H;

    /* JADX INFO: renamed from: H0 */
    public float f41704H0;

    /* JADX INFO: renamed from: I */
    public final ArrayList f41705I;

    /* JADX INFO: renamed from: I0 */
    public float f41706I0;

    /* JADX INFO: renamed from: J */
    public final ArrayList f41707J;

    /* JADX INFO: renamed from: J0 */
    public float f41708J0;

    /* JADX INFO: renamed from: K */
    public final ArrayList f41709K;

    /* JADX INFO: renamed from: K0 */
    public final float f41710K0;

    /* JADX INFO: renamed from: L */
    public KData f41711L;

    /* JADX INFO: renamed from: L0 */
    public float f41712L0;

    /* JADX INFO: renamed from: M */
    public OnRequestDataListListener f41713M;

    /* JADX INFO: renamed from: M0 */
    public float f41714M0;

    /* JADX INFO: renamed from: N */
    public final QuotaThread f41715N;

    /* JADX INFO: renamed from: N0 */
    public float f41716N0;

    /* JADX INFO: renamed from: O */
    public final FlashKLineView$initStopDelay$1 f41717O;

    /* JADX INFO: renamed from: O0 */
    public float f41718O0;

    /* JADX INFO: renamed from: P */
    public final RunnableC0015a f41719P;

    /* JADX INFO: renamed from: P0 */
    public float f41720P0;

    /* JADX INFO: renamed from: Q */
    public final GestureDetector f41721Q;

    /* JADX INFO: renamed from: Q0 */
    public float f41722Q0;

    /* JADX INFO: renamed from: R */
    public final int f41723R;

    /* JADX INFO: renamed from: R0 */
    public float f41724R0;

    /* JADX INFO: renamed from: S */
    public final int f41725S;

    /* JADX INFO: renamed from: S0 */
    public float f41726S0;

    /* JADX INFO: renamed from: T */
    public final int f41727T;

    /* JADX INFO: renamed from: T0 */
    public float f41728T0;

    /* JADX INFO: renamed from: U */
    public final int f41729U;

    /* JADX INFO: renamed from: U0 */
    public float f41730U0;

    /* JADX INFO: renamed from: V */
    public final int f41731V;

    /* JADX INFO: renamed from: V0 */
    public float f41732V0;

    /* JADX INFO: renamed from: W */
    public final int f41733W;

    /* JADX INFO: renamed from: W0 */
    public float f41734W0;

    /* JADX INFO: renamed from: X0 */
    public float f41735X0;

    /* JADX INFO: renamed from: Y0 */
    public double f41736Y0;

    /* JADX INFO: renamed from: Z0 */
    public double f41737Z0;

    /* JADX INFO: renamed from: a */
    public int f41738a;

    /* JADX INFO: renamed from: a0 */
    public final int f41739a0;

    /* JADX INFO: renamed from: a1 */
    public double f41740a1;

    /* JADX INFO: renamed from: b */
    public final int f41741b;

    /* JADX INFO: renamed from: b0 */
    public final int f41742b0;

    /* JADX INFO: renamed from: b1 */
    public double f41743b1;

    /* JADX INFO: renamed from: c */
    public final int f41744c;

    /* JADX INFO: renamed from: c0 */
    public final int f41745c0;

    /* JADX INFO: renamed from: c1 */
    public double f41746c1;

    /* JADX INFO: renamed from: d */
    public int f41747d;

    /* JADX INFO: renamed from: d0 */
    public final int f41748d0;

    /* JADX INFO: renamed from: d1 */
    public double f41749d1;

    /* JADX INFO: renamed from: e0 */
    public final int f41750e0;

    /* JADX INFO: renamed from: e1 */
    public double f41751e1;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public boolean vicePicShow;

    /* JADX INFO: renamed from: f0 */
    public final int f41753f0;

    /* JADX INFO: renamed from: f1 */
    public double f41754f1;

    /* JADX INFO: renamed from: g */
    public boolean f41755g;

    /* JADX INFO: renamed from: g0 */
    public final int f41756g0;

    /* JADX INFO: renamed from: g1 */
    public double f41757g1;

    /* JADX INFO: renamed from: h0 */
    public final int f41758h0;

    /* JADX INFO: renamed from: h1 */
    public double f41759h1;

    /* JADX INFO: renamed from: i */
    public boolean f41760i;

    /* JADX INFO: renamed from: i0 */
    public final int f41761i0;

    /* JADX INFO: renamed from: i1 */
    public double f41762i1;

    /* JADX INFO: renamed from: j */
    public final int f41763j;

    /* JADX INFO: renamed from: j0 */
    public final int f41764j0;

    /* JADX INFO: renamed from: j1 */
    public double f41765j1;

    /* JADX INFO: renamed from: k0 */
    public final int f41766k0;

    /* JADX INFO: renamed from: k1 */
    public double f41767k1;

    /* JADX INFO: renamed from: l0 */
    public final int f41768l0;

    /* JADX INFO: renamed from: l1 */
    public double f41769l1;

    /* JADX INFO: renamed from: m0 */
    public final int f41770m0;

    /* JADX INFO: renamed from: m1 */
    public double f41771m1;

    /* JADX INFO: renamed from: n */
    public boolean f41772n;

    /* JADX INFO: renamed from: n0 */
    public final int f41773n0;

    /* JADX INFO: renamed from: n1 */
    public double f41774n1;

    /* JADX INFO: renamed from: o */
    public boolean f41775o;

    /* JADX INFO: renamed from: o0 */
    public final int f41776o0;

    /* JADX INFO: renamed from: o1 */
    public int f41777o1;

    /* JADX INFO: renamed from: p */
    public boolean f41778p;

    /* JADX INFO: renamed from: p0 */
    public final int f41779p0;

    /* JADX INFO: renamed from: p1 */
    public final ArrayList f41780p1;

    /* JADX INFO: renamed from: q */
    public boolean f41781q;

    /* JADX INFO: renamed from: q0 */
    public final int f41782q0;

    /* JADX INFO: renamed from: q1 */
    public final ArrayList f41783q1;

    /* JADX INFO: renamed from: r */
    public int f41784r;

    /* JADX INFO: renamed from: r0 */
    public final int f41785r0;

    /* JADX INFO: renamed from: r1 */
    public Bitmap f41786r1;

    /* JADX INFO: renamed from: s */
    public int f41787s;

    /* JADX INFO: renamed from: s0 */
    public final int f41788s0;

    /* JADX INFO: renamed from: t */
    public int f41789t;

    /* JADX INFO: renamed from: t0 */
    public final int f41790t0;

    /* JADX INFO: renamed from: u */
    public final Paint f41791u;

    /* JADX INFO: renamed from: u0 */
    public final int f41792u0;

    /* JADX INFO: renamed from: v */
    public final Paint f41793v;

    /* JADX INFO: renamed from: v0 */
    public final int f41794v0;

    /* JADX INFO: renamed from: w */
    public final Paint f41795w;

    /* JADX INFO: renamed from: w0 */
    public final int f41796w0;

    /* JADX INFO: renamed from: x */
    public final Paint f41797x;

    /* JADX INFO: renamed from: x0 */
    public final int f41798x0;

    /* JADX INFO: renamed from: y */
    public final Paint f41799y;

    /* JADX INFO: renamed from: y0 */
    public final int f41800y0;

    /* JADX INFO: renamed from: z */
    public final Paint f41801z;

    /* JADX INFO: renamed from: z0 */
    public final int f41802z0;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0004¨\u0006\u000e"}, m18302d2 = {"Lcom/exchange/kline/FlashKLineView$Companion;", "", "", "MAIN_IMG_MA", "I", "MAIN_IMG_EMA", "MAIN_IMG_BOLL", "DEPUTY_IMG_VOLUME", "DEPUTY_IMG_MACD", "DEPUTY_IMG_KDJ", "DEPUTY_IMG_RSI", "CROSS_HAIR_MOVE_CLOSE", "CROSS_HAIR_MOVE_OPEN", "CROSS_HAIR_MOVE_FREE", "kline_release"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/kline/FlashKLineView$CustomGestureListener;", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "kline_release"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
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
            FlashKLineView flashKLineView = FlashKLineView.this;
            int i = flashKLineView.f41738a;
            if (i > 0 && i < (flashKLineView.f41699F.size() - 1) - flashKLineView.f41747d) {
                float f3 = 8000.0f;
                if (f > 8000.0f) {
                    f = f3;
                    flashKLineView.f41720P0 = f;
                    flashKLineView.post(flashKLineView.f41717O);
                } else {
                    f3 = -8000.0f;
                    if (f < -8000.0f) {
                    }
                    flashKLineView.f41720P0 = f;
                    flashKLineView.post(flashKLineView.f41717O);
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
            FlashKLineView flashKLineView = FlashKLineView.this;
            int i = flashKLineView.f41738a;
            ArrayList arrayList = flashKLineView.f41701G;
            if (i != 0 || f >= 0.0f) {
                ArrayList arrayList2 = flashKLineView.f41699F;
                if ((i != arrayList2.size() - flashKLineView.f41747d || f <= 0.0f) && flashKLineView.f41738a >= 0 && arrayList.size() >= flashKLineView.f41747d) {
                    flashKLineView.f41755g = false;
                    if (Math.abs(f) > 1.0f) {
                        if (flashKLineView.f41747d < 60) {
                            flashKLineView.m14252p(10.0d, f);
                        } else {
                            flashKLineView.m14252p(3.5d, f);
                        }
                        if (flashKLineView.f41738a < 0) {
                            flashKLineView.f41738a = 0;
                        }
                        int size = arrayList2.size();
                        int i2 = flashKLineView.f41738a;
                        int i3 = size - flashKLineView.f41747d;
                        if (i2 > i3) {
                            flashKLineView.f41738a = i3;
                        }
                        flashKLineView.m14248l();
                        flashKLineView.m14251o();
                        flashKLineView.invalidate();
                        return true;
                    }
                } else if (flashKLineView.f41755g) {
                    flashKLineView.f41755g = false;
                    if (!arrayList.isEmpty()) {
                        flashKLineView.f41711L = (KData) AbstractC0000a.m8e(1, arrayList);
                    }
                    flashKLineView.invalidate();
                }
            }
            return true;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/kline/FlashKLineView$OnRequestDataListListener;", "", "kline_release"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public interface OnRequestDataListListener {
        /* JADX INFO: renamed from: a */
        void m14254a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlashKLineView(Context context) {
        super(context, null, 0);
        Intrinsics.m18599g(context, "context");
        this.f41741b = 18;
        this.f41744c = 140;
        this.f41747d = 34;
        this.f41763j = 300;
        this.f41775o = true;
        this.f41787s = 1;
        new Rect();
        new Rect();
        new Rect();
        this.f41695D = new Rect();
        this.f41697E = new String[0];
        this.f41699F = new ArrayList();
        this.f41701G = new ArrayList();
        this.f41703H = new ArrayList();
        this.f41705I = new ArrayList();
        this.f41707J = new ArrayList();
        this.f41709K = new ArrayList();
        new CopyOnWriteArrayList();
        new CopyOnWriteArrayList();
        new CopyOnWriteArrayList();
        new CopyOnWriteArrayList();
        new CopyOnWriteArrayList();
        new CopyOnWriteArrayList();
        new CopyOnWriteArrayList();
        new CopyOnWriteArrayList();
        this.f41780p1 = new ArrayList();
        this.f41783q1 = new ArrayList();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, R.styleable.f42114a);
        Intrinsics.m18598f(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f41770m0 = typedArrayObtainStyledAttributes.getColor(34, -1184275);
        this.f41750e0 = typedArrayObtainStyledAttributes.getColor(0, -6574915);
        this.f41779p0 = typedArrayObtainStyledAttributes.getInt(1, 8);
        this.f41753f0 = typedArrayObtainStyledAttributes.getColor(21, this.f41750e0);
        this.f41798x0 = typedArrayObtainStyledAttributes.getInt(22, this.f41779p0);
        typedArrayObtainStyledAttributes.getInt(35, 10);
        this.f41723R = typedArrayObtainStyledAttributes.getColor(24, -12204175);
        this.f41725S = typedArrayObtainStyledAttributes.getColor(23, -1090725);
        this.f41727T = typedArrayObtainStyledAttributes.getColor(27, -1001205);
        this.f41729U = typedArrayObtainStyledAttributes.getColor(25, -1556299);
        this.f41731V = typedArrayObtainStyledAttributes.getColor(26, -7640892);
        this.f41733W = typedArrayObtainStyledAttributes.getColor(28, -16777216);
        this.f41785r0 = typedArrayObtainStyledAttributes.getColor(29, -1);
        this.f41790t0 = typedArrayObtainStyledAttributes.getInt(30, 8);
        this.f41739a0 = typedArrayObtainStyledAttributes.getColor(31, this.f41733W);
        this.f41788s0 = typedArrayObtainStyledAttributes.getColor(32, this.f41785r0);
        this.f41792u0 = typedArrayObtainStyledAttributes.getInt(33, 8);
        this.f41742b0 = typedArrayObtainStyledAttributes.getColor(38, -6574915);
        typedArrayObtainStyledAttributes.getInt(39, 10);
        typedArrayObtainStyledAttributes.getColor(37, this.f41727T);
        typedArrayObtainStyledAttributes.getColor(36, this.f41729U);
        typedArrayObtainStyledAttributes.getColor(20, this.f41742b0);
        this.f41745c0 = typedArrayObtainStyledAttributes.getColor(19, this.f41723R);
        this.f41748d0 = typedArrayObtainStyledAttributes.getColor(18, this.f41725S);
        typedArrayObtainStyledAttributes.getColor(15, this.f41729U);
        typedArrayObtainStyledAttributes.getColor(10, this.f41731V);
        typedArrayObtainStyledAttributes.getColor(17, this.f41727T);
        typedArrayObtainStyledAttributes.getColor(9, this.f41729U);
        typedArrayObtainStyledAttributes.getColor(16, this.f41731V);
        typedArrayObtainStyledAttributes.getColor(5, -8221022);
        this.f41756g0 = typedArrayObtainStyledAttributes.getColor(6, -16777216);
        this.f41761i0 = typedArrayObtainStyledAttributes.getColor(7, -1);
        this.f41764j0 = typedArrayObtainStyledAttributes.getColor(7, -16777216);
        this.f41794v0 = typedArrayObtainStyledAttributes.getInt(8, 8);
        this.f41758h0 = typedArrayObtainStyledAttributes.getColor(2, this.f41733W);
        this.f41782q0 = typedArrayObtainStyledAttributes.getColor(3, -1);
        this.f41796w0 = typedArrayObtainStyledAttributes.getInt(4, 8);
        this.f41766k0 = typedArrayObtainStyledAttributes.getColor(12, -4865840);
        this.f41768l0 = typedArrayObtainStyledAttributes.getColor(13, -8351842);
        this.f41800y0 = typedArrayObtainStyledAttributes.getInt(14, 10);
        this.f41773n0 = typedArrayObtainStyledAttributes.getColor(11, -419430401);
        typedArrayObtainStyledAttributes.recycle();
        setOnTouchListener(this);
        setClickable(true);
        setFocusable(true);
        this.f41721Q = new GestureDetector(getContext(), new CustomGestureListener());
        this.f41690A0 = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f41776o0 = m14240b(103.0f);
        this.f41802z0 = m14240b(130.0f);
        this.f41710K0 = (r1 - m14240b(4.0f)) / 9;
        this.f41697E = new String[]{"Time", "Open", "High", "Low", "Close", "Chg", "%Chg", "Volume", "Turnover"};
        Handler handler = new Handler(this);
        QuotaThread quotaThread = new QuotaThread("quotaThread", 10);
        this.f41715N = quotaThread;
        quotaThread.f42111a = handler;
        quotaThread.start();
        this.f41717O = new FlashKLineView$initStopDelay$1(this);
        Paint paint = new Paint();
        this.f41791u = paint;
        paint.setAntiAlias(true);
        Paint paint2 = this.f41791u;
        Intrinsics.m18596d(paint2);
        paint2.setTextSize(m14253q(this.f41779p0));
        Paint paint3 = this.f41791u;
        Intrinsics.m18596d(paint3);
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        Paint paint4 = new Paint();
        this.f41793v = paint4;
        paint4.setAntiAlias(true);
        Paint paint5 = this.f41793v;
        Intrinsics.m18596d(paint5);
        Paint.Style style2 = Paint.Style.FILL;
        paint5.setStyle(style2);
        Paint paint6 = new Paint();
        this.f41795w = paint6;
        paint6.setAntiAlias(true);
        Paint paint7 = this.f41795w;
        Intrinsics.m18596d(paint7);
        paint7.setStyle(style2);
        Paint paint8 = new Paint();
        this.f41797x = paint8;
        paint8.setAntiAlias(true);
        Paint paint9 = this.f41797x;
        Intrinsics.m18596d(paint9);
        paint9.setTextSize(m14253q(this.f41779p0));
        Paint paint10 = this.f41797x;
        Intrinsics.m18596d(paint10);
        paint10.setStyle(style2);
        Paint paint11 = new Paint();
        this.f41799y = paint11;
        paint11.setAntiAlias(true);
        Paint paint12 = this.f41799y;
        Intrinsics.m18596d(paint12);
        paint12.setTextSize(m14253q(this.f41779p0));
        Paint paint13 = this.f41799y;
        Intrinsics.m18596d(paint13);
        paint13.setStyle(style);
        Paint paint14 = this.f41799y;
        Intrinsics.m18596d(paint14);
        paint14.setColor(-16777216);
        Paint paint15 = this.f41799y;
        Intrinsics.m18596d(paint15);
        paint15.setStrokeWidth(m14240b(1.0f));
        Paint paint16 = this.f41799y;
        Intrinsics.m18596d(paint16);
        paint16.setPathEffect(new DashPathEffect(new float[]{10.0f, 10.0f}, 0.0f));
        Paint paint17 = new Paint();
        this.f41801z = paint17;
        paint17.setAntiAlias(true);
        Paint paint18 = this.f41801z;
        Intrinsics.m18596d(paint18);
        paint18.setTextSize(m14253q(this.f41779p0));
        Paint paint19 = this.f41801z;
        Intrinsics.m18596d(paint19);
        paint19.setStyle(style);
        Paint paint20 = this.f41801z;
        Intrinsics.m18596d(paint20);
        paint20.setColor(Color.parseColor("#45C771"));
        Paint paint21 = this.f41801z;
        Intrinsics.m18596d(paint21);
        paint21.setStrokeWidth(m14240b(1.0f));
        Paint paint22 = this.f41801z;
        Intrinsics.m18596d(paint22);
        paint22.setPathEffect(new DashPathEffect(new float[]{10.0f, 10.0f}, 0.0f));
        Paint paint23 = new Paint();
        this.f41689A = paint23;
        paint23.setAntiAlias(true);
        Paint paint24 = this.f41689A;
        Intrinsics.m18596d(paint24);
        paint24.setTextSize(m14253q(this.f41779p0));
        Paint paint25 = this.f41689A;
        Intrinsics.m18596d(paint25);
        paint25.setStyle(style);
        Paint paint26 = this.f41689A;
        Intrinsics.m18596d(paint26);
        paint26.setColor(Color.parseColor("#EF5B5B"));
        Paint paint27 = this.f41689A;
        Intrinsics.m18596d(paint27);
        paint27.setStrokeWidth(m14240b(1.0f));
        Paint paint28 = this.f41689A;
        Intrinsics.m18596d(paint28);
        paint28.setPathEffect(new DashPathEffect(new float[]{10.0f, 10.0f}, 0.0f));
        this.f41691B = new Path();
        this.f41693C = new Path();
        this.f41719P = new RunnableC0015a(this, 16);
    }

    /* JADX INFO: renamed from: g */
    public static String m14237g(long j) {
        if (j <= 0) {
            return "";
        }
        String str = new SimpleDateFormat("yyyy-MM-dd HH:mm").format(new Date(j));
        Intrinsics.m18598f(str, "format(...)");
        return str;
    }

    /* JADX INFO: renamed from: i */
    public static String m14238i(FlashKLineView flashKLineView, double d, int i, int i2) {
        RoundingMode roundingMode = RoundingMode.DOWN;
        flashKLineView.getClass();
        Intrinsics.m18599g(roundingMode, "roundingMode");
        if (i < 0 || i > i2) {
            throw new IllegalArgumentException();
        }
        DecimalFormat decimalFormat = new DecimalFormat(AbstractC0000a.m13j(",", "##0." + CollectionsKt.m18409J(RangesKt.m18664k(0, i), "", null, null, new C3499s(18), 30) + CollectionsKt.m18409J(RangesKt.m18664k(i, i2), "", null, null, new C3499s(19), 30)));
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
    public final void m14239a(ArrayList arrayList) {
        Object obj;
        Object next;
        ArrayList arrayList2 = this.f41783q1;
        arrayList2.clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            FlashOrder flashOrder = (FlashOrder) it.next();
            Iterator it2 = arrayList2.iterator();
            while (true) {
                obj = null;
                if (!it2.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it2.next();
                    if (((FlashOrder) next).f42115a == flashOrder.f42115a) {
                        break;
                    }
                }
            }
            if (next == null) {
                arrayList2.add(flashOrder);
            } else {
                Iterator it3 = arrayList2.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    Object next2 = it3.next();
                    if (((FlashOrder) next2).f42115a == flashOrder.f42115a) {
                        obj = next2;
                        break;
                    }
                }
                FlashOrder flashOrder2 = (FlashOrder) obj;
                if (flashOrder2 != null) {
                    Iterator it4 = arrayList2.iterator();
                    int i = 0;
                    while (true) {
                        if (!it4.hasNext()) {
                            i = -1;
                            break;
                        } else if (((FlashOrder) it4.next()).f42115a == flashOrder.f42115a) {
                            break;
                        } else {
                            i++;
                        }
                    }
                    arrayList2.remove(flashOrder2);
                    String str = flashOrder.f42117c;
                    Intrinsics.m18599g(str, "<set-?>");
                    flashOrder2.f42117c = str;
                    arrayList2.add(i, flashOrder2);
                }
            }
        }
        invalidate();
    }

    /* JADX INFO: renamed from: b */
    public final int m14240b(float f) {
        return (int) ((f * getContext().getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* JADX INFO: renamed from: c */
    public final void m14241c(Canvas canvas) {
        double dFloatValue;
        int i;
        double dFloatValue2;
        KData kData = this.f41711L;
        if (kData == null || !this.f41755g) {
            return;
        }
        double d = 2;
        float f = (float) ((this.f41757g1 / d) + kData.f41806B);
        Intrinsics.m18596d(kData);
        float f2 = (float) ((this.f41757g1 / d) + kData.f41806B);
        ArrayList arrayList = this.f41707J;
        float fFloatValue = ((Number) arrayList.get(0)).floatValue();
        KData kData2 = this.f41711L;
        Intrinsics.m18596d(kData2);
        float f3 = (float) ((this.f41757g1 / d) + kData2.f41806B);
        float fFloatValue2 = ((Number) AbstractC0000a.m8e(1, arrayList)).floatValue();
        Paint paint = this.f41799y;
        Intrinsics.m18596d(paint);
        canvas.drawLine(f2, fFloatValue, f3, fFloatValue2, paint);
        int i2 = this.f41789t;
        if (i2 == 0) {
            KData kData3 = this.f41711L;
            Intrinsics.m18596d(kData3);
            dFloatValue = kData3.f41809E;
        } else if (i2 == 1) {
            KData kData4 = this.f41711L;
            Intrinsics.m18596d(kData4);
            dFloatValue = kData4.f41810F;
        } else if (i2 != 2) {
            KData kData5 = this.f41711L;
            Intrinsics.m18596d(kData5);
            dFloatValue = kData5.f41809E;
        } else {
            dFloatValue = this.f41712L0;
        }
        if (dFloatValue < ((Number) arrayList.get(0)).floatValue()) {
            dFloatValue = ((Number) arrayList.get(0)).floatValue();
        } else {
            double d2 = this.f41722Q0;
            if (dFloatValue > d2) {
                dFloatValue = d2;
            }
        }
        ArrayList arrayList2 = this.f41709K;
        float fFloatValue3 = ((Number) arrayList2.get(0)).floatValue();
        float f4 = (float) dFloatValue;
        float fFloatValue4 = ((Number) AbstractC0000a.m8e(1, arrayList2)).floatValue();
        Paint paint2 = this.f41799y;
        Intrinsics.m18596d(paint2);
        canvas.drawLine(fFloatValue3, f4, fFloatValue4, f4, paint2);
        int iM14240b = m14240b(6.0f) / 2;
        int iM14240b2 = iM14240b - m14240b(1.0f);
        Paint paint3 = new Paint();
        paint3.setColor(-16777216);
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(m14240b(1.0f));
        canvas.drawCircle(f, f4, iM14240b, paint3);
        Paint paint4 = new Paint();
        paint4.setColor(-16777216);
        paint4.setStyle(Paint.Style.FILL);
        canvas.drawCircle(f, f4, iM14240b2, paint4);
        KData kData6 = this.f41711L;
        Intrinsics.m18596d(kData6);
        float fM14240b = (float) (((this.f41757g1 / d) + kData6.f41806B) - ((double) m14240b(35.0f)));
        float fM14240b2 = this.f41698E0 - m14240b(16.0f);
        KData kData7 = this.f41711L;
        Intrinsics.m18596d(kData7);
        RectF rectF = new RectF(fM14240b, fM14240b2, (float) ((this.f41757g1 / d) + kData7.f41806B + ((double) m14240b(35.0f))), this.f41698E0);
        Paint paint5 = this.f41793v;
        Intrinsics.m18596d(paint5);
        paint5.setColor(this.f41758h0);
        float fM14240b3 = m14240b(4.0f);
        float fM14240b4 = m14240b(4.0f);
        Paint paint6 = this.f41793v;
        Intrinsics.m18596d(paint6);
        canvas.drawRoundRect(rectF, fM14240b3, fM14240b4, paint6);
        KData kData8 = this.f41711L;
        Intrinsics.m18596d(kData8);
        String strM14237g = m14237g(kData8.f41812a);
        m14250n(this.f41782q0, this.f41796w0);
        KData kData9 = this.f41711L;
        Intrinsics.m18596d(kData9);
        double d3 = (this.f41757g1 / d) + kData9.f41806B;
        Paint paint7 = this.f41797x;
        Intrinsics.m18596d(paint7);
        float f5 = 2;
        float fMeasureText = (float) (d3 - ((double) (paint7.measureText(strM14237g) / f5)));
        float fM14240b5 = this.f41698E0 - m14240b(5.0f);
        Paint paint8 = this.f41797x;
        Intrinsics.m18596d(paint8);
        canvas.drawText(strM14237g, fMeasureText, fM14240b5, paint8);
        RectF rectF2 = new RectF(this.f41696D0 - m14240b(38.0f), f4 - m14240b(7.0f), this.f41696D0 - m14240b(1.0f), m14240b(7.0f) + f4);
        Paint paint9 = this.f41793v;
        Intrinsics.m18596d(paint9);
        paint9.setColor(this.f41756g0);
        float fM14240b6 = m14240b(4.0f);
        float fM14240b7 = m14240b(4.0f);
        Paint paint10 = this.f41793v;
        Intrinsics.m18596d(paint10);
        canvas.drawRoundRect(rectF2, fM14240b6, fM14240b7, paint10);
        if (this.vicePicShow) {
            i = 0;
            dFloatValue2 = (this.f41737Z0 - this.f41746c1) / ((double) (((Number) arrayList.get(3)).floatValue() - ((Number) arrayList.get(0)).floatValue()));
        } else {
            dFloatValue2 = (this.f41737Z0 - this.f41746c1) / ((double) (((Number) arrayList.get(4)).floatValue() - ((Number) arrayList.get(0)).floatValue()));
            i = 0;
        }
        double dFloatValue3 = this.f41737Z0 - (dFloatValue2 * ((double) (f4 - ((Number) arrayList.get(i)).floatValue())));
        int i3 = this.f41777o1;
        String strM14238i = m14238i(this, dFloatValue3, i3, i3);
        Rect rect = new Rect();
        m14250n(this.f41761i0, this.f41794v0);
        Paint paint11 = this.f41797x;
        Intrinsics.m18596d(paint11);
        paint11.getTextBounds(strM14238i, 0, strM14238i.length(), rect);
        float fM1B = AbstractC0000a.m1B(rectF2.width(), rect.width(), f5, this.f41696D0 - m14240b(38.0f));
        float fM14240b8 = (f4 + m14240b(7.0f)) - ((rectF2.height() - rect.height()) / f5);
        Paint paint12 = this.f41797x;
        Intrinsics.m18596d(paint12);
        canvas.drawText(strM14238i, fM1B, fM14240b8, paint12);
    }

    /* JADX INFO: renamed from: d */
    public final void m14242d(Canvas canvas) {
        if (this.f41711L == null || !this.f41755g) {
            return;
        }
        m14250n(this.f41768l0, this.f41800y0);
        Paint paint = this.f41791u;
        Intrinsics.m18596d(paint);
        int i = 0;
        String str = this.f41697E[0];
        paint.getTextBounds(str, 0, str.length(), this.f41695D);
        KData kData = this.f41711L;
        Intrinsics.m18596d(kData);
        double d = (this.f41757g1 / ((double) 2)) + kData.f41806B;
        double measuredWidth = getMeasuredWidth() / 2.0f;
        ArrayList arrayList = this.f41705I;
        ArrayList arrayList2 = this.f41707J;
        ArrayList arrayList3 = this.f41709K;
        if (d <= measuredWidth) {
            Paint paint2 = this.f41793v;
            Intrinsics.m18596d(paint2);
            paint2.setColor(this.f41773n0);
            float fFloatValue = ((Number) arrayList3.get(arrayList3.size() - 1)).floatValue() - this.f41776o0;
            float fFloatValue2 = ((Number) arrayList2.get(0)).floatValue();
            float fFloatValue3 = ((Number) AbstractC0000a.m8e(1, arrayList3)).floatValue();
            float fFloatValue4 = ((Number) arrayList2.get(0)).floatValue() + this.f41802z0;
            Paint paint3 = this.f41793v;
            Intrinsics.m18596d(paint3);
            float f = 4.0f;
            canvas.drawRect(fFloatValue, fFloatValue2, fFloatValue3, fFloatValue4, paint3);
            m14250n(this.f41766k0, 0);
            float fFloatValue5 = ((Number) arrayList3.get(arrayList3.size() - 1)).floatValue() - this.f41776o0;
            float fFloatValue6 = ((Number) arrayList2.get(0)).floatValue();
            float fFloatValue7 = ((Number) AbstractC0000a.m8e(1, arrayList3)).floatValue() - this.f41776o0;
            float fFloatValue8 = this.f41802z0 + ((Number) arrayList2.get(0)).floatValue();
            Paint paint4 = this.f41791u;
            Intrinsics.m18596d(paint4);
            canvas.drawLine(fFloatValue5, fFloatValue6, fFloatValue7, fFloatValue8, paint4);
            float fFloatValue9 = ((Number) AbstractC0000a.m8e(1, arrayList3)).floatValue() - this.f41776o0;
            float fFloatValue10 = ((Number) arrayList2.get(0)).floatValue();
            float fFloatValue11 = ((Number) AbstractC0000a.m8e(1, arrayList3)).floatValue();
            float fFloatValue12 = ((Number) arrayList2.get(0)).floatValue();
            Paint paint5 = this.f41791u;
            Intrinsics.m18596d(paint5);
            canvas.drawLine(fFloatValue9, fFloatValue10, fFloatValue11, fFloatValue12, paint5);
            float fFloatValue13 = ((Number) AbstractC0000a.m8e(1, arrayList3)).floatValue();
            float fFloatValue14 = ((Number) arrayList2.get(0)).floatValue();
            float fFloatValue15 = ((Number) AbstractC0000a.m8e(1, arrayList3)).floatValue();
            float fFloatValue16 = this.f41802z0 + ((Number) arrayList2.get(0)).floatValue();
            Paint paint6 = this.f41791u;
            Intrinsics.m18596d(paint6);
            canvas.drawLine(fFloatValue13, fFloatValue14, fFloatValue15, fFloatValue16, paint6);
            float fFloatValue17 = ((Number) AbstractC0000a.m8e(1, arrayList3)).floatValue() - this.f41776o0;
            float fFloatValue18 = this.f41802z0 + ((Number) arrayList2.get(0)).floatValue();
            float fFloatValue19 = ((Number) AbstractC0000a.m8e(1, arrayList3)).floatValue();
            float fFloatValue20 = this.f41802z0 + ((Number) arrayList2.get(0)).floatValue();
            Paint paint7 = this.f41791u;
            Intrinsics.m18596d(paint7);
            canvas.drawLine(fFloatValue17, fFloatValue18, fFloatValue19, fFloatValue20, paint7);
            m14250n(this.f41768l0, this.f41800y0);
            int length = this.f41697E.length;
            int i2 = 0;
            while (i2 < length) {
                String str2 = this.f41697E[i2];
                float fFloatValue21 = (((Number) AbstractC0000a.m8e(1, arrayList3)).floatValue() - this.f41776o0) + m14240b(f);
                float fHeight = ((this.f41710K0 - r8.height()) / 2) + (this.f41710K0 * i2) + ((Number) arrayList2.get(i)).floatValue() + r8.height();
                Paint paint8 = this.f41797x;
                Intrinsics.m18596d(paint8);
                canvas.drawText(str2, fFloatValue21, fHeight, paint8);
                i2++;
                i = 0;
                f = 4.0f;
            }
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                if (i3 == 5 || i3 == 6) {
                    KData kData2 = this.f41711L;
                    Intrinsics.m18596d(kData2);
                    if (kData2.m14255a() > 0.0d) {
                        m14250n(this.f41723R, this.f41800y0);
                    } else {
                        m14250n(this.f41725S, this.f41800y0);
                    }
                } else {
                    m14250n(this.f41768l0, this.f41800y0);
                }
                String str3 = (String) arrayList.get(i3);
                float fFloatValue22 = ((Number) AbstractC0000a.m8e(1, arrayList3)).floatValue() - m14240b(4.0f);
                Paint paint9 = this.f41791u;
                Intrinsics.m18596d(paint9);
                float fMeasureText = fFloatValue22 - paint9.measureText((String) arrayList.get(i3));
                float fHeight2 = ((this.f41710K0 - r8.height()) / 2) + (this.f41710K0 * i3) + ((Number) arrayList2.get(0)).floatValue() + r8.height();
                Paint paint10 = this.f41797x;
                Intrinsics.m18596d(paint10);
                canvas.drawText(str3, fMeasureText, fHeight2, paint10);
            }
            return;
        }
        Paint paint11 = this.f41793v;
        Intrinsics.m18596d(paint11);
        paint11.setColor(this.f41773n0);
        float fFloatValue23 = ((Number) arrayList3.get(0)).floatValue();
        float fFloatValue24 = ((Number) arrayList2.get(0)).floatValue();
        float fFloatValue25 = ((Number) arrayList3.get(0)).floatValue() + this.f41776o0;
        float fFloatValue26 = ((Number) arrayList2.get(0)).floatValue() + this.f41802z0;
        Paint paint12 = this.f41793v;
        Intrinsics.m18596d(paint12);
        canvas.drawRect(fFloatValue23, fFloatValue24, fFloatValue25, fFloatValue26, paint12);
        m14250n(this.f41766k0, 0);
        float fFloatValue27 = ((Number) arrayList3.get(0)).floatValue();
        float fFloatValue28 = ((Number) arrayList2.get(0)).floatValue();
        float fFloatValue29 = ((Number) arrayList3.get(0)).floatValue();
        float fFloatValue30 = this.f41802z0 + ((Number) arrayList2.get(0)).floatValue();
        Paint paint13 = this.f41791u;
        Intrinsics.m18596d(paint13);
        canvas.drawLine(fFloatValue27, fFloatValue28, fFloatValue29, fFloatValue30, paint13);
        float fFloatValue31 = ((Number) arrayList3.get(0)).floatValue();
        float fFloatValue32 = ((Number) arrayList2.get(0)).floatValue();
        float fFloatValue33 = this.f41776o0 + ((Number) arrayList3.get(0)).floatValue();
        float fFloatValue34 = ((Number) arrayList2.get(0)).floatValue();
        Paint paint14 = this.f41791u;
        Intrinsics.m18596d(paint14);
        canvas.drawLine(fFloatValue31, fFloatValue32, fFloatValue33, fFloatValue34, paint14);
        float fFloatValue35 = this.f41776o0 + ((Number) arrayList3.get(0)).floatValue();
        float fFloatValue36 = ((Number) arrayList2.get(0)).floatValue();
        float fFloatValue37 = this.f41776o0 + ((Number) arrayList3.get(0)).floatValue();
        float fFloatValue38 = this.f41802z0 + ((Number) arrayList2.get(0)).floatValue();
        Paint paint15 = this.f41791u;
        Intrinsics.m18596d(paint15);
        canvas.drawLine(fFloatValue35, fFloatValue36, fFloatValue37, fFloatValue38, paint15);
        float fFloatValue39 = ((Number) arrayList3.get(0)).floatValue();
        float fFloatValue40 = this.f41802z0 + ((Number) arrayList2.get(0)).floatValue();
        float fFloatValue41 = this.f41776o0 + ((Number) arrayList3.get(0)).floatValue();
        float fFloatValue42 = this.f41802z0 + ((Number) arrayList2.get(0)).floatValue();
        Paint paint16 = this.f41791u;
        Intrinsics.m18596d(paint16);
        canvas.drawLine(fFloatValue39, fFloatValue40, fFloatValue41, fFloatValue42, paint16);
        m14250n(this.f41768l0, this.f41800y0);
        int length2 = this.f41697E.length;
        for (int i4 = 0; i4 < length2; i4++) {
            String str4 = this.f41697E[i4];
            float fFloatValue43 = ((Number) arrayList3.get(0)).floatValue() + m14240b(4.0f);
            float fHeight3 = ((this.f41710K0 - r8.height()) / 2) + (this.f41710K0 * i4) + ((Number) arrayList2.get(0)).floatValue() + r8.height();
            Paint paint17 = this.f41797x;
            Intrinsics.m18596d(paint17);
            canvas.drawText(str4, fFloatValue43, fHeight3, paint17);
        }
        int size2 = arrayList.size();
        for (int i5 = 0; i5 < size2; i5++) {
            if (i5 == 5 || i5 == 6) {
                KData kData3 = this.f41711L;
                Intrinsics.m18596d(kData3);
                if (kData3.m14255a() > 0.0d) {
                    m14250n(this.f41723R, this.f41800y0);
                } else {
                    m14250n(this.f41725S, this.f41800y0);
                }
            } else {
                m14250n(this.f41768l0, this.f41800y0);
            }
            String str5 = (String) arrayList.get(i5);
            float fFloatValue44 = (((Number) arrayList3.get(0)).floatValue() + this.f41776o0) - m14240b(4.0f);
            Paint paint18 = this.f41791u;
            Intrinsics.m18596d(paint18);
            float fMeasureText2 = fFloatValue44 - paint18.measureText((String) arrayList.get(i5));
            float fHeight4 = ((this.f41710K0 - r8.height()) / 2) + (this.f41710K0 * i5) + ((Number) arrayList2.get(0)).floatValue() + r8.height();
            Paint paint19 = this.f41797x;
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
            this.f41732V0 = event.getX();
            this.f41734W0 = event.getY();
            this.f41735X0 = event.getX();
            this.f41714M0 = event.getY();
            this.f41760i = false;
            postDelayed(this.f41719P, this.f41763j);
        } else {
            if (event.getAction() == 2) {
                float fAbs = Math.abs(event.getX() - this.f41732V0);
                float fAbs2 = Math.abs(event.getY() - this.f41734W0);
                float fAbs3 = Math.abs(event.getX() - this.f41735X0);
                float fAbs4 = Math.abs(event.getY() - this.f41714M0);
                this.f41712L0 = event.getY();
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                if (this.f41772n || ((fAbs > m14240b(5.0f) + fAbs2 && fAbs > this.f41690A0) || ((z2 = this.f41760i) && fAbs2 > this.f41690A0))) {
                    this.f41772n = true;
                    removeCallbacks(this.f41719P);
                    if (this.f41760i && (fAbs3 > 1.0f || fAbs4 > 1.0f)) {
                        m14247k(event.getX());
                        if (this.f41711L != null) {
                            invalidate();
                        }
                    }
                    this.f41735X0 = event.getX();
                    this.f41714M0 = event.getY();
                    if (this.f41760i || super.dispatchTouchEvent(event)) {
                        return true;
                    }
                } else if (!z2 && !this.f41772n && !this.f41778p && fAbs2 > fAbs + m14240b(5.0f) && fAbs2 > this.f41690A0) {
                    removeCallbacks(this.f41719P);
                    if (getParent() != null) {
                        getParent().requestDisallowInterceptTouchEvent(false);
                        return false;
                    }
                }
                return false;
            }
            if (event.getAction() == 1) {
                this.f41772n = false;
                removeCallbacks(this.f41719P);
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                }
            }
        }
        if (!this.f41760i && !super.dispatchTouchEvent(event)) {
            return false;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m14243e(Canvas canvas) {
        ArrayList arrayList;
        RectF rectF;
        float fM14240b;
        RectF rectF2;
        float fM14240b2;
        Rect rect = new Rect();
        double d = this.f41736Y0;
        int i = this.f41777o1;
        String strM14238i = m14238i(this, d, i, i);
        m14250n(this.f41785r0, this.f41790t0);
        Paint paint = this.f41791u;
        Intrinsics.m18596d(paint);
        paint.getTextBounds(strM14238i, 0, strM14238i.length(), rect);
        double dWidth = this.f41740a1 + ((double) rect.width()) + ((double) m14240b(8.0f));
        ArrayList arrayList2 = this.f41709K;
        if (dWidth < ((Number) AbstractC0000a.m8e(1, arrayList2)).floatValue()) {
            arrayList = arrayList2;
            rectF = new RectF((float) (this.f41740a1 + ((double) m14240b(3.0f))), ((float) this.f41765j1) - m14240b(7.0f), (float) (this.f41740a1 + ((double) rect.width()) + ((double) m14240b(8.0f))), ((float) this.f41765j1) + m14240b(7.0f));
            Path path = this.f41691B;
            Intrinsics.m18596d(path);
            path.reset();
            Path path2 = this.f41691B;
            Intrinsics.m18596d(path2);
            path2.moveTo((float) this.f41740a1, (float) this.f41765j1);
            Path path3 = this.f41691B;
            Intrinsics.m18596d(path3);
            path3.lineTo((float) (this.f41740a1 + ((double) m14240b(4.0f))), ((float) this.f41765j1) - m14240b(3.0f));
            Path path4 = this.f41691B;
            Intrinsics.m18596d(path4);
            path4.lineTo((float) (this.f41740a1 + ((double) m14240b(4.0f))), ((float) this.f41765j1) + m14240b(3.0f));
            Path path5 = this.f41691B;
            Intrinsics.m18596d(path5);
            path5.close();
            fM14240b = (float) (this.f41740a1 + ((double) m14240b(5.0f)));
        } else {
            arrayList = arrayList2;
            rectF = new RectF((float) (this.f41740a1 - ((double) m14240b(3.0f))), ((float) this.f41765j1) - m14240b(7.0f), (float) ((this.f41740a1 - ((double) rect.width())) - ((double) m14240b(8.0f))), ((float) this.f41765j1) + m14240b(7.0f));
            Path path6 = this.f41691B;
            Intrinsics.m18596d(path6);
            path6.reset();
            Path path7 = this.f41691B;
            Intrinsics.m18596d(path7);
            path7.moveTo((float) this.f41740a1, (float) this.f41765j1);
            Path path8 = this.f41691B;
            Intrinsics.m18596d(path8);
            path8.lineTo((float) (this.f41740a1 - ((double) m14240b(4.0f))), ((float) this.f41765j1) - m14240b(3.0f));
            Path path9 = this.f41691B;
            Intrinsics.m18596d(path9);
            path9.lineTo((float) (this.f41740a1 - ((double) m14240b(4.0f))), ((float) this.f41765j1) + m14240b(3.0f));
            Path path10 = this.f41691B;
            Intrinsics.m18596d(path10);
            path10.close();
            fM14240b = ((float) (this.f41740a1 - ((double) m14240b(5.0f)))) - rect.width();
        }
        Paint paint2 = this.f41793v;
        Intrinsics.m18596d(paint2);
        paint2.setColor(this.f41733W);
        Paint paint3 = this.f41793v;
        Intrinsics.m18596d(paint3);
        canvas.drawRoundRect(rectF, 4.0f, 4.0f, paint3);
        Path path11 = this.f41691B;
        Intrinsics.m18596d(path11);
        Paint paint4 = this.f41793v;
        Intrinsics.m18596d(paint4);
        canvas.drawPath(path11, paint4);
        m14250n(this.f41785r0, this.f41790t0);
        float fHeight = (rect.height() / 2.0f) + ((float) this.f41765j1);
        Paint paint5 = this.f41797x;
        Intrinsics.m18596d(paint5);
        canvas.drawText(strM14238i, fM14240b, fHeight, paint5);
        Rect rect2 = new Rect();
        double d2 = this.f41743b1;
        int i2 = this.f41777o1;
        String strM14238i2 = m14238i(this, d2, i2, i2);
        m14250n(this.f41788s0, this.f41792u0);
        Paint paint6 = this.f41797x;
        Intrinsics.m18596d(paint6);
        paint6.getTextBounds(strM14238i2, 0, strM14238i2.length(), rect2);
        if (this.f41749d1 + ((double) rect2.width()) + ((double) m14240b(8.0f)) < ((Number) AbstractC0000a.m8e(1, arrayList)).floatValue()) {
            rectF2 = new RectF((float) (this.f41749d1 + ((double) m14240b(3.0f))), ((float) this.f41767k1) - m14240b(7.0f), (float) (this.f41749d1 + ((double) rect2.width()) + ((double) m14240b(8.0f))), ((float) this.f41767k1) + m14240b(7.0f));
            Path path12 = this.f41691B;
            Intrinsics.m18596d(path12);
            path12.reset();
            Path path13 = this.f41691B;
            Intrinsics.m18596d(path13);
            path13.moveTo((float) this.f41749d1, (float) this.f41767k1);
            Path path14 = this.f41691B;
            Intrinsics.m18596d(path14);
            path14.lineTo((float) (this.f41749d1 + ((double) m14240b(4.0f))), ((float) this.f41767k1) - m14240b(3.0f));
            Path path15 = this.f41691B;
            Intrinsics.m18596d(path15);
            path15.lineTo((float) (this.f41749d1 + ((double) m14240b(4.0f))), ((float) this.f41767k1) + m14240b(3.0f));
            Path path16 = this.f41691B;
            Intrinsics.m18596d(path16);
            path16.close();
            fM14240b2 = (float) (this.f41749d1 + ((double) m14240b(5.0f)));
        } else {
            rectF2 = new RectF((float) (this.f41749d1 - ((double) m14240b(3.0f))), ((float) this.f41767k1) - m14240b(7.0f), (float) ((this.f41749d1 - ((double) rect2.width())) - ((double) m14240b(8.0f))), ((float) this.f41767k1) + m14240b(7.0f));
            Path path17 = this.f41691B;
            Intrinsics.m18596d(path17);
            path17.reset();
            Path path18 = this.f41691B;
            Intrinsics.m18596d(path18);
            path18.moveTo((float) this.f41749d1, (float) this.f41767k1);
            Path path19 = this.f41691B;
            Intrinsics.m18596d(path19);
            path19.lineTo((float) (this.f41749d1 - ((double) m14240b(4.0f))), ((float) this.f41767k1) - m14240b(3.0f));
            Path path20 = this.f41691B;
            Intrinsics.m18596d(path20);
            path20.lineTo((float) (this.f41749d1 - ((double) m14240b(4.0f))), ((float) this.f41767k1) + m14240b(3.0f));
            Path path21 = this.f41691B;
            Intrinsics.m18596d(path21);
            path21.close();
            fM14240b2 = ((float) (this.f41749d1 - ((double) m14240b(5.0f)))) - rect2.width();
        }
        Paint paint7 = this.f41793v;
        Intrinsics.m18596d(paint7);
        paint7.setColor(this.f41739a0);
        Paint paint8 = this.f41793v;
        Intrinsics.m18596d(paint8);
        canvas.drawRoundRect(rectF2, 4.0f, 4.0f, paint8);
        Path path22 = this.f41691B;
        Intrinsics.m18596d(path22);
        Paint paint9 = this.f41793v;
        Intrinsics.m18596d(paint9);
        canvas.drawPath(path22, paint9);
        m14250n(this.f41788s0, this.f41792u0);
        float fHeight2 = (rect2.height() / 2.0f) + ((float) this.f41767k1);
        Paint paint10 = this.f41797x;
        Intrinsics.m18596d(paint10);
        canvas.drawText(strM14238i2, fM14240b2, fHeight2, paint10);
    }

    /* JADX INFO: renamed from: f */
    public final void m14244f(Canvas canvas) {
        double dFloatValue;
        Paint paint = this.f41793v;
        int i = 0;
        Paint paint2 = this.f41797x;
        for (FlashOrder flashOrder : this.f41783q1) {
            ArrayList arrayList = this.f41707J;
            double dDoubleValue = ((this.f41737Z0 - flashOrder.f42115a) * this.f41754f1) + ((Number) arrayList.get(i)).doubleValue();
            ArrayList arrayList2 = this.f41701G;
            ArrayList arrayList3 = new ArrayList(CollectionsKt.m18452r(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(Double.valueOf(((KData) it.next()).f41814c));
            }
            double dM18420U = CollectionsKt.m18420U(arrayList3);
            double dM18418S = CollectionsKt.m18418S(arrayList3);
            double d = flashOrder.f42115a;
            if (dM18420U > d || d > dM18418S) {
                return;
            }
            float f = (float) dDoubleValue;
            RectF rectF = new RectF(this.f41696D0 - m14240b(38.0f), f - m14240b(7.0f), this.f41696D0 - m14240b(1.0f), f + m14240b(7.0f));
            RectF rectF2 = new RectF(rectF.left, rectF.top, rectF.right, rectF.bottom);
            Paint paint3 = new Paint();
            boolean z2 = flashOrder.f42118d;
            paint3.setColor(Color.parseColor(z2 ? "#45C771" : "#EF5B5B"));
            paint3.setStyle(Paint.Style.FILL);
            canvas.drawRoundRect(rectF2, m14240b(4.0f), m14240b(4.0f), paint3);
            KData kData = this.f41711L;
            Intrinsics.m18596d(kData);
            if (kData.m14255a() > 0.0d) {
                Intrinsics.m18596d(paint);
                paint.setColor(this.f41723R);
            } else {
                Intrinsics.m18596d(paint);
                paint.setColor(this.f41725S);
            }
            String strValueOf = String.valueOf(d);
            Rect rect = new Rect();
            m14250n(this.f41764j0, this.f41794v0);
            Intrinsics.m18596d(paint2);
            paint2.getTextBounds(strValueOf, 0, strValueOf.length(), rect);
            float f2 = 2;
            float fWidth = ((rectF2.width() - rect.width()) / f2) + rectF2.left;
            float fM14240b = (f + m14240b(7.0f)) - ((rectF2.height() - rect.height()) / f2);
            Intrinsics.m18596d(paint2);
            canvas.drawText(strValueOf, fWidth, fM14240b, paint2);
            float width = getWidth() / 2;
            if (dDoubleValue < ((Number) arrayList.get(0)).floatValue()) {
                dFloatValue = ((Number) arrayList.get(0)).floatValue();
            } else {
                double d2 = this.f41722Q0;
                dFloatValue = dDoubleValue > d2 ? d2 : dDoubleValue;
            }
            ArrayList arrayList4 = this.f41709K;
            float fFloatValue = ((Number) arrayList4.get(0)).floatValue();
            float f3 = (float) dFloatValue;
            float fFloatValue2 = ((Number) AbstractC0000a.m8e(1, arrayList4)).floatValue();
            Paint paint4 = z2 ? this.f41801z : this.f41689A;
            Intrinsics.m18596d(paint4);
            canvas.drawLine(fFloatValue, f3, fFloatValue2, f3, paint4);
            String strValueOf2 = String.valueOf(flashOrder.f42116b);
            Rect rect2 = new Rect();
            Rect rect3 = new Rect();
            Intrinsics.m18596d(paint2);
            paint2.getTextBounds(strValueOf2, 0, strValueOf2.length(), rect2);
            float fWidth2 = rect2.width();
            float fHeight = rect2.height();
            String str = flashOrder.f42117c;
            Intrinsics.m18596d(paint2);
            paint2.getTextBounds(str, 0, str.length(), rect3);
            float fWidth3 = rect3.width();
            rect3.height();
            float f4 = fWidth2 / f2;
            float f5 = fHeight / f2;
            RectF rectF3 = new RectF((width - f4) - m14240b(4.0f), (f3 - f5) - m14240b(4.0f), width + f4 + m14240b(4.0f) + m14240b(12.0f) + m14240b(5.0f) + fWidth3, f3 + f5 + m14240b(4.0f));
            canvas.drawRoundRect(rectF3, m14240b(4.0f), m14240b(4.0f), paint3);
            Paint paint5 = paint;
            RectF rectF4 = new RectF(((rectF3.right - m14240b(12.0f)) - fWidth3) - m14240b(5.0f), rectF3.top + m14240b(1.0f), rectF3.right - m14240b(1.0f), rectF3.bottom - m14240b(1.0f));
            Path path = new Path();
            path.addRoundRect(rectF4, new float[]{0.0f, 0.0f, m14240b(4.0f), m14240b(4.0f), m14240b(4.0f), m14240b(4.0f), 0.0f, 0.0f}, Path.Direction.CW);
            paint3.setColor(-1);
            canvas.drawPath(path, paint3);
            Intrinsics.m18596d(paint2);
            canvas.drawText(strValueOf2, rectF3.left + m14240b(4.0f), (fHeight / 2.0f) + f3, paint2);
            int iM14240b = m14240b(8.0f);
            float fM14240b2 = rectF4.left + m14240b(2.0f);
            float f6 = iM14240b;
            float fM1B = AbstractC0000a.m1B(rectF4.height(), f6, f2, rectF4.top);
            Bitmap bitmap = this.f41786r1;
            if (bitmap != null && !bitmap.isRecycled()) {
                Bitmap bitmap2 = this.f41786r1;
                Intrinsics.m18596d(bitmap2);
                canvas.drawBitmap(bitmap2, (Rect) null, new RectF(fM14240b2, fM1B, fM14240b2 + f6, fM1B + f6), (Paint) null);
            }
            Intrinsics.m18596d(paint2);
            paint2.getTextBounds(str, 0, str.length(), rect);
            Intrinsics.m18596d(paint2);
            paint2.setColor(Color.parseColor("#8C939D"));
            float fHeight2 = ((rectF4.height() + rect.height()) / 2.0f) + rectF4.top;
            Intrinsics.m18596d(paint2);
            canvas.drawText(str, fM14240b2 + f6 + m14240b(2.0f), fHeight2, paint2);
            i = 0;
            paint = paint5;
        }
    }

    @NotNull
    public final List<KData> getTotalDataList() {
        return this.f41699F;
    }

    public final boolean getVicePicShow() {
        return this.vicePicShow;
    }

    @NotNull
    public final List<KData> getViewDataList() {
        return this.f41701G;
    }

    /* JADX INFO: renamed from: h */
    public final String m14245h(double d) {
        if (d < 1.0d) {
            int i = this.f41777o1;
            return m14238i(this, d, i, i);
        }
        if (d < 10.0d) {
            int i2 = this.f41777o1;
            return m14238i(this, d, i2, i2);
        }
        if (d < 100.0d) {
            int i3 = this.f41777o1;
            return m14238i(this, d, i3, i3);
        }
        if (d < 1000.0d) {
            int i4 = this.f41777o1;
            return m14238i(this, d, i4, i4);
        }
        if (d < 1000000.0d) {
            double d2 = d / ((double) 1000);
            int i5 = this.f41777o1;
            return m14238i(this, d2, i5, i5).concat("K");
        }
        if (d < 1.0E9d) {
            double d3 = d / ((double) 1000000);
            int i6 = this.f41777o1;
            return m14238i(this, d3, i6, i6).concat("M");
        }
        if (d < 1.0E12d) {
            double d4 = d / ((double) 1000000000);
            int i7 = this.f41777o1;
            return m14238i(this, d4, i7, i7).concat("B");
        }
        double d5 = d / 1000000000000L;
        int i8 = this.f41777o1;
        return m14238i(this, d5, i8, i8).concat("T");
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
        KData kData = (KData) AbstractC0000a.m8e(1, this.f41703H);
        ArrayList arrayList = this.f41699F;
        int size = arrayList.size();
        int i3 = size - 1;
        if (kData.f41812a == ((KData) arrayList.get(i3)).f41812a) {
            arrayList.remove(i3);
        }
        arrayList.add(kData);
        int i4 = this.f41747d;
        if (size < i4 || (i = this.f41738a) != (size - i4) - 1) {
            m14251o();
            return false;
        }
        this.f41738a = i + 1;
        m14251o();
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final String m14246j(double d) {
        if (d < 1000.0d) {
            int i = this.f41777o1;
            return m14238i(this, d, i, i);
        }
        if (d < 1000000.0d) {
            double d2 = d / ((double) 1000);
            int i2 = this.f41777o1;
            return m14238i(this, d2, i2, i2).concat("K");
        }
        if (d < 1.0E9d) {
            double d3 = d / ((double) 1000000);
            int i3 = this.f41777o1;
            return m14238i(this, d3, i3, i3).concat("M");
        }
        if (d < 1.0E12d) {
            double d4 = d / ((double) 1000000000);
            int i4 = this.f41777o1;
            return m14238i(this, d4, i4, i4).concat("B");
        }
        double d5 = d / 1000000000000L;
        int i5 = this.f41777o1;
        return m14238i(this, d5, i5, i5).concat("T");
    }

    /* JADX INFO: renamed from: k */
    public final void m14247k(float f) {
        String str;
        boolean z2 = this.f41755g;
        ArrayList arrayList = this.f41701G;
        if (!z2) {
            this.f41711L = (KData) AbstractC0000a.m8e(1, arrayList);
            return;
        }
        ArrayList arrayList2 = this.f41705I;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            double d = f;
            if (((KData) arrayList.get(i)).f41806B <= d && ((KData) arrayList.get(i)).f41807C >= d) {
                KData kData = (KData) arrayList.get(i);
                this.f41711L = kData;
                Intrinsics.m18596d(kData);
                long j = kData.f41812a;
                if (j <= 0) {
                    str = "";
                } else {
                    str = new SimpleDateFormat("yyyy-MM-dd").format(new Date(j));
                    Intrinsics.m18598f(str, "format(...)");
                }
                arrayList2.add(str);
                KData kData2 = this.f41711L;
                Intrinsics.m18596d(kData2);
                int i2 = this.f41777o1;
                arrayList2.add(m14238i(this, kData2.f41813b, i2, i2));
                KData kData3 = this.f41711L;
                Intrinsics.m18596d(kData3);
                int i3 = this.f41777o1;
                arrayList2.add(m14238i(this, kData3.f41815d, i3, i3));
                KData kData4 = this.f41711L;
                Intrinsics.m18596d(kData4);
                int i4 = this.f41777o1;
                arrayList2.add(m14238i(this, kData4.f41816e, i4, i4));
                KData kData5 = this.f41711L;
                Intrinsics.m18596d(kData5);
                int i5 = this.f41777o1;
                arrayList2.add(m14238i(this, kData5.f41814c, i5, i5));
                KData kData6 = this.f41711L;
                Intrinsics.m18596d(kData6);
                double dM14255a = kData6.m14255a();
                if (dM14255a > 0.0d) {
                    int i6 = this.f41777o1;
                    arrayList2.add(Marker.ANY_NON_NULL_MARKER.concat(m14238i(this, dM14255a, i6, i6)));
                    KData kData7 = this.f41711L;
                    Intrinsics.m18596d(kData7);
                    double dM14256b = kData7.m14256b() * ((double) 100);
                    int i7 = this.f41777o1;
                    arrayList2.add(m14238i(this, dM14256b, i7, i7).concat("%"));
                } else {
                    int i8 = this.f41777o1;
                    arrayList2.add(m14238i(this, dM14255a, i8, i8));
                    KData kData8 = this.f41711L;
                    Intrinsics.m18596d(kData8);
                    double dM14256b2 = kData8.m14256b() * ((double) 100);
                    int i9 = this.f41777o1;
                    arrayList2.add(m14238i(this, dM14256b2, i9, i9).concat("%"));
                }
                KData kData9 = this.f41711L;
                Intrinsics.m18596d(kData9);
                arrayList2.add(m14245h(kData9.f41817f));
                KData kData10 = this.f41711L;
                Intrinsics.m18596d(kData10);
                arrayList2.add(m14245h(kData10.f41818g));
                return;
            }
            this.f41711L = null;
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m14248l() {
        ArrayList arrayList = this.f41699F;
        if (arrayList == null || this.f41738a > arrayList.size() / 3 || !this.f41775o) {
            return;
        }
        this.f41775o = false;
        OnRequestDataListListener onRequestDataListListener = this.f41713M;
        if (onRequestDataListListener != null) {
            onRequestDataListListener.m14254a();
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m14249m(ArrayList arrayList, boolean z2) {
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = this.f41701G;
        long j = arrayList2.size() > 0 ? ((KData) arrayList2.get(0)).f41812a : 0L;
        this.f41755g = false;
        ArrayList arrayList3 = this.f41699F;
        arrayList3.clear();
        arrayList3.addAll(arrayList);
        QuotaUtil.m14302g(arrayList3, false);
        int i = this.f41784r;
        if (i == 1) {
            QuotaUtil.m14299d(arrayList3, false);
        } else if (i == 2) {
            QuotaUtil.m14298c(arrayList3, false);
        }
        int i2 = this.f41787s;
        if (i2 == 1) {
            QuotaUtil.m14301f(arrayList3, false);
        } else if (i2 == 2) {
            QuotaUtil.m14300e(arrayList3, false);
        } else if (i2 == 3) {
            QuotaUtil.m14303h(arrayList3, false);
        }
        if (z2) {
            int size = arrayList3.size() / 2;
            this.f41738a = -1;
            if (((KData) arrayList3.get(0)).f41812a <= j && ((KData) arrayList3.get(size)).f41812a > j) {
                int i3 = 0;
                while (true) {
                    if (i3 < size) {
                        int i4 = i3 + 1;
                        if (i4 < arrayList3.size() && ((KData) arrayList3.get(i3)).f41812a <= j && ((KData) arrayList3.get(i4)).f41812a > j) {
                            this.f41738a = i3;
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
                            this.f41738a = size;
                            break;
                        }
                        size = i5;
                    } else {
                        break;
                    }
                }
            }
            if (arrayList3.size() < this.f41747d) {
                this.f41738a = 0;
            } else {
                int size3 = arrayList3.size();
                int i6 = this.f41738a;
                if (size3 - i6 < this.f41747d || i6 == -1) {
                    this.f41738a = arrayList3.size() - this.f41747d;
                }
            }
        } else {
            this.f41738a = arrayList3.size() >= this.f41747d ? arrayList3.size() - this.f41747d : 0;
        }
        m14251o();
    }

    /* JADX INFO: renamed from: n */
    public final void m14250n(int i, int i2) {
        Paint paint = this.f41791u;
        Intrinsics.m18596d(paint);
        paint.setColor(i);
        Paint paint2 = this.f41791u;
        Intrinsics.m18596d(paint2);
        float f = i2;
        paint2.setTextSize(m14253q(f));
        Paint paint3 = this.f41797x;
        Intrinsics.m18596d(paint3);
        paint3.setColor(i);
        Paint paint4 = this.f41797x;
        Intrinsics.m18596d(paint4);
        paint4.setTextSize(m14253q(f));
    }

    /* JADX INFO: renamed from: o */
    public final void m14251o() {
        ArrayList arrayList = this.f41701G;
        arrayList.clear();
        int i = this.f41747d;
        ArrayList arrayList2 = this.f41699F;
        int iMin = Math.min(i, arrayList2.size());
        int i2 = 0;
        if (this.f41738a >= 0) {
            while (i2 < iMin) {
                if (this.f41738a + i2 < arrayList2.size()) {
                    arrayList.add(arrayList2.get(this.f41738a + i2));
                }
                i2++;
            }
        } else {
            while (i2 < iMin) {
                arrayList.add(arrayList2.get(i2));
                i2++;
            }
        }
        if (arrayList.size() > 0 && !this.f41755g) {
            this.f41711L = (KData) AbstractC0000a.m8e(1, arrayList);
        } else if (arrayList.isEmpty()) {
            this.f41711L = null;
        }
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0035  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        int i;
        int i2;
        Canvas canvas2;
        String str;
        String strM14238i;
        String strM14238i2;
        String str2;
        String strM14238i3;
        String str3;
        int i3;
        String strM14238i4;
        ArrayList arrayList;
        double d;
        Iterator it;
        Intrinsics.m18599g(canvas, "canvas");
        super.onDraw(canvas);
        if (this.f41699F.isEmpty()) {
            return;
        }
        ArrayList<KData> arrayList2 = this.f41701G;
        if (arrayList2.isEmpty()) {
            return;
        }
        float f = this.f41696D0;
        ArrayList arrayList3 = this.f41707J;
        ArrayList arrayList4 = this.f41709K;
        if (f == 0.0f) {
            i = 3;
        } else {
            float fM14240b = ((f - this.f41692B0) - m14240b(46.0f)) / 4;
            arrayList4.clear();
            for (int i4 = 0; i4 < 5; i4++) {
                arrayList4.add(Float.valueOf((i4 * fM14240b) + this.f41692B0 + m14240b(6.0f)));
            }
            this.f41718O0 = ((this.f41698E0 - this.f41694C0) - m14240b(38.0f)) / 5;
            arrayList3.clear();
            for (int i5 = 0; i5 < 6; i5++) {
                arrayList3.add(Float.valueOf((this.f41718O0 * i5) + this.f41694C0 + m14240b(18.0f)));
            }
            this.f41724R0 = ((Number) arrayList3.get(4)).floatValue() + m14240b(12.0f);
            this.f41757g1 = (((Number) AbstractC0000a.m8e(1, arrayList4)).floatValue() - ((Number) arrayList4.get(0)).floatValue()) / this.f41747d;
            this.f41736Y0 = ((KData) arrayList2.get(0)).f41815d;
            this.f41743b1 = ((KData) arrayList2.get(0)).f41816e;
            this.f41751e1 = ((KData) arrayList2.get(0)).f41817f;
            this.f41769l1 = ((KData) arrayList2.get(0)).f41830s;
            this.f41771m1 = ((KData) arrayList2.get(0)).f41830s;
            double d2 = ((KData) arrayList2.get(0)).f41831t;
            double d3 = ((KData) arrayList2.get(0)).f41831t;
            double d4 = ((KData) arrayList2.get(0)).f41832u;
            double d5 = ((KData) arrayList2.get(0)).f41832u;
            double d6 = d2;
            this.f41774n1 = ((KData) arrayList2.get(0)).f41833v;
            double d7 = ((KData) arrayList2.get(0)).f41834w;
            double d8 = ((KData) arrayList2.get(0)).f41835x;
            int size = arrayList2.size();
            for (int i6 = 0; i6 < size; i6++) {
                double d9 = d8;
                KData kData = (KData) arrayList2.get(i6);
                double d10 = d3;
                double d11 = this.f41757g1;
                double dDoubleValue = ((Number) AbstractC0000a.m8e(1, arrayList4)).doubleValue() - (((arrayList2.size() - i6) - 1) * d11);
                double d12 = d5;
                double d13 = dDoubleValue - d11;
                double d14 = d7;
                double d15 = d11 / ((double) 2);
                kData.f41806B = d13;
                kData.f41807C = dDoubleValue;
                kData.f41808D = dDoubleValue - d15;
                double d16 = this.f41736Y0;
                double d17 = kData.f41815d;
                if (d17 >= d16) {
                    this.f41736Y0 = d17;
                    this.f41740a1 = d15 + d13;
                }
                double d18 = this.f41743b1;
                double d19 = kData.f41816e;
                if (d19 <= d18) {
                    this.f41743b1 = d19;
                    this.f41749d1 = d15 + d13;
                }
                double d20 = this.f41751e1;
                double d21 = kData.f41817f;
                if (d21 >= d20) {
                    this.f41751e1 = d21;
                }
                if (!this.vicePicShow || this.f41781q) {
                    d8 = d9;
                    d5 = d12;
                    d3 = d10;
                    d7 = d14;
                } else {
                    int i7 = this.f41787s;
                    if (i7 == 1) {
                        double d22 = kData.f41830s;
                        if (d22 >= this.f41769l1) {
                            this.f41769l1 = d22;
                        }
                        if (d22 <= this.f41771m1) {
                            this.f41771m1 = d22;
                        }
                        double d23 = kData.f41831t;
                        if (d23 >= d6) {
                            d6 = d23;
                        }
                        d3 = d23 <= d10 ? d23 : d10;
                        double d24 = kData.f41832u;
                        if (d24 >= d4) {
                            d4 = d24;
                        }
                        if (d24 <= d12) {
                            d5 = d24;
                            d8 = d9;
                        } else {
                            d8 = d9;
                            d5 = d12;
                        }
                        d7 = d14;
                    } else {
                        if (i7 == 2) {
                            double d25 = kData.f41833v;
                            if (d25 >= this.f41774n1) {
                                this.f41774n1 = d25;
                            }
                            double d26 = kData.f41834w;
                            d7 = d26 >= d14 ? d26 : d14;
                            d8 = kData.f41835x;
                            if (d8 < d9) {
                                d8 = d9;
                            }
                            d5 = d12;
                            d3 = d10;
                        }
                        d8 = d9;
                        d5 = d12;
                        d3 = d10;
                        d7 = d14;
                    }
                }
            }
            double d27 = d3;
            double d28 = d5;
            double d29 = this.f41736Y0;
            double d30 = this.f41743b1;
            double d31 = (d29 - d30) * 0.1d;
            this.f41737Z0 = d29 + d31;
            this.f41746c1 = d30 - d31;
            if (this.vicePicShow) {
                this.f41722Q0 = ((Number) arrayList3.get(3)).floatValue();
                this.f41716N0 = ((Number) arrayList3.get(4)).floatValue();
            } else {
                this.f41722Q0 = ((Number) arrayList3.get(4)).floatValue();
                this.f41716N0 = ((Number) arrayList3.get(5)).floatValue();
            }
            this.f41754f1 = ((double) (this.f41722Q0 - ((Number) arrayList3.get(0)).floatValue())) / (this.f41737Z0 - this.f41746c1);
            this.f41765j1 = ((this.f41737Z0 - this.f41736Y0) * this.f41754f1) + ((Number) arrayList3.get(0)).doubleValue();
            this.f41767k1 = ((this.f41737Z0 - this.f41743b1) * this.f41754f1) + ((Number) arrayList3.get(0)).doubleValue();
            this.f41759h1 = ((double) (((Number) AbstractC0000a.m8e(1, arrayList3)).floatValue() - this.f41724R0)) / this.f41751e1;
            for (KData kData2 : arrayList2) {
                double d32 = kData2.f41813b;
                kData2.f41809E = ((this.f41737Z0 - kData2.f41814c) * this.f41754f1) + ((Number) arrayList3.get(0)).doubleValue();
                kData2.f41810F = ((this.f41737Z0 - d32) * this.f41754f1) + ((Number) arrayList3.get(0)).doubleValue();
            }
            if (this.vicePicShow) {
                int i8 = this.f41787s;
                if (i8 == 1) {
                    i = 3;
                    double d33 = this.f41769l1;
                    if (d33 > 0.0d && this.f41771m1 < 0.0d) {
                        double dFloatValue = ((double) (((Number) AbstractC0000a.m8e(1, arrayList3)).floatValue() - this.f41724R0)) / Math.abs(this.f41769l1 - this.f41771m1);
                        this.f41762i1 = dFloatValue;
                        this.f41726S0 = (float) ((this.f41769l1 * dFloatValue) + ((double) this.f41724R0));
                    } else if (d33 <= 0.0d) {
                        this.f41762i1 = ((double) (((Number) AbstractC0000a.m8e(1, arrayList3)).floatValue() - this.f41724R0)) / Math.abs(this.f41771m1);
                        this.f41726S0 = this.f41724R0;
                    } else {
                        i2 = 1;
                        if (this.f41771m1 >= 0.0d) {
                            this.f41762i1 = ((double) (((Number) AbstractC0000a.m8e(1, arrayList3)).floatValue() - this.f41724R0)) / Math.abs(this.f41769l1);
                            this.f41726S0 = ((Number) AbstractC0000a.m8e(1, arrayList3)).floatValue();
                        }
                        if (d6 <= 0.0d && d27 < 0.0d) {
                            ((Number) AbstractC0000a.m8e(i2, arrayList3)).floatValue();
                            m14240b(24.0f);
                        } else if (d6 > 0.0d) {
                            ((Number) AbstractC0000a.m8e(i2, arrayList3)).floatValue();
                            m14240b(24.0f);
                            Math.abs(d27);
                        } else if (d27 >= 0.0d) {
                            ((Number) AbstractC0000a.m8e(i2, arrayList3)).floatValue();
                            m14240b(24.0f);
                            Math.abs(d6);
                        }
                        if (d4 <= 0.0d && d28 < 0.0d) {
                            ((Number) AbstractC0000a.m8e(i2, arrayList3)).floatValue();
                            m14240b(24.0f);
                        } else if (d4 > 0.0d) {
                            ((Number) AbstractC0000a.m8e(i2, arrayList3)).floatValue();
                            m14240b(24.0f);
                            Math.abs(d28);
                        } else if (d28 >= 0.0d) {
                            ((Number) AbstractC0000a.m8e(i2, arrayList3)).floatValue();
                            m14240b(24.0f);
                            Math.abs(d4);
                        }
                    }
                    i2 = 1;
                    if (d6 <= 0.0d) {
                        if (d6 > 0.0d) {
                        }
                        if (d4 <= 0.0d) {
                            if (d4 > 0.0d) {
                            }
                        }
                    }
                } else if (i8 != 2) {
                    i = 3;
                    if (i8 == 3) {
                        ((Number) AbstractC0000a.m8e(1, arrayList3)).floatValue();
                    }
                } else {
                    i = 3;
                    ((Number) AbstractC0000a.m8e(1, arrayList3)).floatValue();
                    m14240b(12.0f);
                    ((Number) arrayList3.get(arrayList3.size() - 1)).floatValue();
                    m14240b(12.0f);
                    ((Number) arrayList3.get(arrayList3.size() - 1)).floatValue();
                    m14240b(12.0f);
                }
            }
        }
        m14250n(this.f41770m0, 0);
        Iterator it2 = arrayList4.iterator();
        while (it2.hasNext()) {
            float fFloatValue = ((Number) it2.next()).floatValue();
            float fM14240b2 = this.f41694C0 + m14240b(18.0f);
            float fM14240b3 = this.f41698E0 - m14240b(20.0f);
            Paint paint = this.f41791u;
            Intrinsics.m18596d(paint);
            canvas.drawLine(fFloatValue, fM14240b2, fFloatValue, fM14240b3, paint);
            i = i;
        }
        int i9 = i;
        int size2 = arrayList3.size();
        int i10 = 0;
        while (i10 < size2) {
            float fFloatValue2 = (i10 == 0 || i10 == 5 || i10 == 4 || (this.vicePicShow && i10 == i9)) ? this.f41696D0 : ((Number) AbstractC0000a.m8e(1, arrayList4)).floatValue();
            float fM14240b4 = m14240b(6.0f) + this.f41692B0;
            float fFloatValue3 = ((Number) arrayList3.get(i10)).floatValue();
            float fFloatValue4 = ((Number) arrayList3.get(i10)).floatValue();
            Paint paint2 = this.f41791u;
            Intrinsics.m18596d(paint2);
            canvas.drawLine(fM14240b4, fFloatValue3, fFloatValue2, fFloatValue4, paint2);
            i10++;
        }
        float fM14240b5 = m14240b(6.0f) + this.f41692B0;
        float f2 = 2;
        float fFloatValue5 = (this.f41718O0 / f2) + ((Number) arrayList3.get(4)).floatValue();
        float fFloatValue6 = ((Number) AbstractC0000a.m8e(1, arrayList4)).floatValue();
        float fFloatValue7 = (this.f41718O0 / f2) + ((Number) arrayList3.get(4)).floatValue();
        Paint paint3 = this.f41791u;
        Intrinsics.m18596d(paint3);
        canvas.drawLine(fM14240b5, fFloatValue5, fFloatValue6, fFloatValue7, paint3);
        if (this.vicePicShow) {
            float fM14240b6 = m14240b(6.0f) + this.f41692B0;
            float fFloatValue8 = (this.f41718O0 / f2) + ((Number) arrayList3.get(i9)).floatValue();
            float fFloatValue9 = ((Number) AbstractC0000a.m8e(1, arrayList4)).floatValue();
            float fFloatValue10 = (this.f41718O0 / f2) + ((Number) arrayList3.get(i9)).floatValue();
            Paint paint4 = this.f41791u;
            Intrinsics.m18596d(paint4);
            canvas2 = canvas;
            canvas2.drawLine(fM14240b6, fFloatValue8, fFloatValue9, fFloatValue10, paint4);
        } else {
            canvas2 = canvas;
        }
        Rect rect = new Rect();
        m14250n(this.f41753f0, this.f41798x0);
        Paint paint5 = this.f41797x;
        Intrinsics.m18596d(paint5);
        double d34 = this.f41737Z0;
        int i11 = this.f41777o1;
        String strM14238i5 = m14238i(this, d34, i11, i11);
        double d35 = this.f41737Z0;
        int i12 = this.f41777o1;
        paint5.getTextBounds(strM14238i5, 0, m14238i(this, d35, i12, i12).length(), rect);
        double d36 = this.f41737Z0;
        int i13 = this.f41777o1;
        String strM14238i6 = m14238i(this, d36, i13, i13);
        float fFloatValue11 = ((Number) AbstractC0000a.m8e(1, arrayList4)).floatValue() + m14240b(4.0f);
        float fFloatValue12 = ((Number) arrayList3.get(0)).floatValue() + rect.height() + m14240b(2.0f);
        Paint paint6 = this.f41797x;
        Intrinsics.m18596d(paint6);
        canvas2.drawText(strM14238i6, fFloatValue11, fFloatValue12, paint6);
        Paint paint7 = this.f41797x;
        Intrinsics.m18596d(paint7);
        double d37 = this.f41746c1;
        int i14 = this.f41777o1;
        String strM14238i7 = m14238i(this, d37, i14, i14);
        double d38 = this.f41746c1;
        int i15 = this.f41777o1;
        paint7.getTextBounds(strM14238i7, 0, m14238i(this, d38, i15, i15).length(), rect);
        double d39 = this.f41746c1;
        int i16 = this.f41777o1;
        String strM14238i8 = m14238i(this, d39, i16, i16);
        float fFloatValue13 = ((Number) AbstractC0000a.m8e(1, arrayList4)).floatValue() + m14240b(4.0f);
        float fM14240b7 = this.f41722Q0 - m14240b(2.0f);
        Paint paint8 = this.f41797x;
        Intrinsics.m18596d(paint8);
        canvas2.drawText(strM14238i8, fFloatValue13, fM14240b7, paint8);
        String str4 = "0";
        if (this.vicePicShow) {
            str = "0";
            double d40 = (this.f41737Z0 - this.f41746c1) / ((double) 3);
            int i17 = 0;
            while (i17 < 2) {
                i17++;
                double d41 = this.f41737Z0 - (((double) i17) * d40);
                int i18 = this.f41777o1;
                String strM14238i9 = m14238i(this, d41, i18, i18);
                float fFloatValue14 = ((Number) AbstractC0000a.m8e(1, arrayList4)).floatValue() + m14240b(4.0f);
                float fHeight = (rect.height() / 2.0f) + ((Number) arrayList3.get(i17)).floatValue();
                Paint paint9 = this.f41797x;
                Intrinsics.m18596d(paint9);
                canvas2.drawText(strM14238i9, fFloatValue14, fHeight, paint9);
            }
            int i19 = this.f41787s;
            if (i19 == 1) {
                double d42 = this.f41769l1;
                if (d42 > 0.0d && this.f41771m1 < 0.0d) {
                    int i20 = this.f41777o1;
                    strM14238i4 = m14238i(this, d42, i20, i20);
                    double d43 = this.f41771m1;
                    int i21 = this.f41777o1;
                    String strM14238i10 = m14238i(this, d43, i21, i21);
                    double d44 = (this.f41769l1 - this.f41771m1) / ((double) 2);
                    int i22 = this.f41777o1;
                    strM14238i3 = m14238i(this, d44, i22, i22);
                    str3 = strM14238i10;
                } else if (d42 <= 0.0d) {
                    double d45 = this.f41771m1;
                    int i23 = this.f41777o1;
                    String strM14238i11 = m14238i(this, d45, i23, i23);
                    double d46 = (this.f41771m1 - this.f41769l1) / ((double) 2);
                    int i24 = this.f41777o1;
                    strM14238i3 = m14238i(this, d46, i24, i24);
                    i3 = 1;
                    str3 = strM14238i11;
                    str2 = str;
                    float fM14240b8 = m14240b(4.0f) + ((Number) AbstractC0000a.m8e(i3, arrayList4)).floatValue();
                    float fHeight2 = rect.height() + ((Number) AbstractC0000a.m8e(2, arrayList3)).floatValue() + m14240b(2.0f);
                    Paint paint10 = this.f41797x;
                    Intrinsics.m18596d(paint10);
                    canvas2.drawText(str2, fM14240b8, fHeight2, paint10);
                    float fFloatValue15 = ((Number) AbstractC0000a.m8e(1, arrayList4)).floatValue() + m14240b(4.0f);
                    float fHeight3 = (rect.height() / 2.0f) + (((Number) AbstractC0000a.m8e(1, arrayList3)).floatValue() - (this.f41718O0 / f2));
                    Paint paint11 = this.f41797x;
                    Intrinsics.m18596d(paint11);
                    canvas2.drawText(strM14238i3, fFloatValue15, fHeight3, paint11);
                    float fFloatValue16 = ((Number) AbstractC0000a.m8e(1, arrayList4)).floatValue() + m14240b(4.0f);
                    float fFloatValue17 = ((Number) AbstractC0000a.m8e(1, arrayList3)).floatValue() - m14240b(2.0f);
                    Paint paint12 = this.f41797x;
                    Intrinsics.m18596d(paint12);
                    canvas2.drawText(str3, fFloatValue16, fFloatValue17, paint12);
                } else {
                    if (this.f41771m1 >= 0.0d) {
                        int i25 = this.f41777o1;
                        strM14238i4 = m14238i(this, d42, i25, i25);
                        double d47 = (this.f41769l1 - this.f41771m1) / ((double) 2);
                        int i26 = this.f41777o1;
                        strM14238i3 = m14238i(this, d47, i26, i26);
                        str3 = str;
                    }
                    str2 = "";
                    str3 = str2;
                    strM14238i3 = str3;
                    i3 = 1;
                    float fM14240b82 = m14240b(4.0f) + ((Number) AbstractC0000a.m8e(i3, arrayList4)).floatValue();
                    float fHeight22 = rect.height() + ((Number) AbstractC0000a.m8e(2, arrayList3)).floatValue() + m14240b(2.0f);
                    Paint paint102 = this.f41797x;
                    Intrinsics.m18596d(paint102);
                    canvas2.drawText(str2, fM14240b82, fHeight22, paint102);
                    float fFloatValue152 = ((Number) AbstractC0000a.m8e(1, arrayList4)).floatValue() + m14240b(4.0f);
                    float fHeight32 = (rect.height() / 2.0f) + (((Number) AbstractC0000a.m8e(1, arrayList3)).floatValue() - (this.f41718O0 / f2));
                    Paint paint112 = this.f41797x;
                    Intrinsics.m18596d(paint112);
                    canvas2.drawText(strM14238i3, fFloatValue152, fHeight32, paint112);
                    float fFloatValue162 = ((Number) AbstractC0000a.m8e(1, arrayList4)).floatValue() + m14240b(4.0f);
                    float fFloatValue172 = ((Number) AbstractC0000a.m8e(1, arrayList3)).floatValue() - m14240b(2.0f);
                    Paint paint122 = this.f41797x;
                    Intrinsics.m18596d(paint122);
                    canvas2.drawText(str3, fFloatValue162, fFloatValue172, paint122);
                }
                str2 = strM14238i4;
                i3 = 1;
                float fM14240b822 = m14240b(4.0f) + ((Number) AbstractC0000a.m8e(i3, arrayList4)).floatValue();
                float fHeight222 = rect.height() + ((Number) AbstractC0000a.m8e(2, arrayList3)).floatValue() + m14240b(2.0f);
                Paint paint1022 = this.f41797x;
                Intrinsics.m18596d(paint1022);
                canvas2.drawText(str2, fM14240b822, fHeight222, paint1022);
                float fFloatValue1522 = ((Number) AbstractC0000a.m8e(1, arrayList4)).floatValue() + m14240b(4.0f);
                float fHeight322 = (rect.height() / 2.0f) + (((Number) AbstractC0000a.m8e(1, arrayList3)).floatValue() - (this.f41718O0 / f2));
                Paint paint1122 = this.f41797x;
                Intrinsics.m18596d(paint1122);
                canvas2.drawText(strM14238i3, fFloatValue1522, fHeight322, paint1122);
                float fFloatValue1622 = ((Number) AbstractC0000a.m8e(1, arrayList4)).floatValue() + m14240b(4.0f);
                float fFloatValue1722 = ((Number) AbstractC0000a.m8e(1, arrayList3)).floatValue() - m14240b(2.0f);
                Paint paint1222 = this.f41797x;
                Intrinsics.m18596d(paint1222);
                canvas2.drawText(str3, fFloatValue1622, fFloatValue1722, paint1222);
            } else {
                if (i19 == 2) {
                    double d48 = this.f41774n1;
                    int i27 = this.f41777o1;
                    strM14238i = m14238i(this, d48, i27, i27);
                    double d49 = this.f41774n1 / ((double) 2);
                    int i28 = this.f41777o1;
                    strM14238i2 = m14238i(this, d49, i28, i28);
                } else {
                    if (i19 == 3) {
                        strM14238i = "100";
                        strM14238i2 = "50";
                    }
                    str2 = "";
                    str3 = str2;
                    strM14238i3 = str3;
                    i3 = 1;
                    float fM14240b8222 = m14240b(4.0f) + ((Number) AbstractC0000a.m8e(i3, arrayList4)).floatValue();
                    float fHeight2222 = rect.height() + ((Number) AbstractC0000a.m8e(2, arrayList3)).floatValue() + m14240b(2.0f);
                    Paint paint10222 = this.f41797x;
                    Intrinsics.m18596d(paint10222);
                    canvas2.drawText(str2, fM14240b8222, fHeight2222, paint10222);
                    float fFloatValue15222 = ((Number) AbstractC0000a.m8e(1, arrayList4)).floatValue() + m14240b(4.0f);
                    float fHeight3222 = (rect.height() / 2.0f) + (((Number) AbstractC0000a.m8e(1, arrayList3)).floatValue() - (this.f41718O0 / f2));
                    Paint paint11222 = this.f41797x;
                    Intrinsics.m18596d(paint11222);
                    canvas2.drawText(strM14238i3, fFloatValue15222, fHeight3222, paint11222);
                    float fFloatValue16222 = ((Number) AbstractC0000a.m8e(1, arrayList4)).floatValue() + m14240b(4.0f);
                    float fFloatValue17222 = ((Number) AbstractC0000a.m8e(1, arrayList3)).floatValue() - m14240b(2.0f);
                    Paint paint12222 = this.f41797x;
                    Intrinsics.m18596d(paint12222);
                    canvas2.drawText(str3, fFloatValue16222, fFloatValue17222, paint12222);
                }
                str2 = strM14238i;
                strM14238i3 = strM14238i2;
                str3 = str;
                i3 = 1;
                float fM14240b82222 = m14240b(4.0f) + ((Number) AbstractC0000a.m8e(i3, arrayList4)).floatValue();
                float fHeight22222 = rect.height() + ((Number) AbstractC0000a.m8e(2, arrayList3)).floatValue() + m14240b(2.0f);
                Paint paint102222 = this.f41797x;
                Intrinsics.m18596d(paint102222);
                canvas2.drawText(str2, fM14240b82222, fHeight22222, paint102222);
                float fFloatValue152222 = ((Number) AbstractC0000a.m8e(1, arrayList4)).floatValue() + m14240b(4.0f);
                float fHeight32222 = (rect.height() / 2.0f) + (((Number) AbstractC0000a.m8e(1, arrayList3)).floatValue() - (this.f41718O0 / f2));
                Paint paint112222 = this.f41797x;
                Intrinsics.m18596d(paint112222);
                canvas2.drawText(strM14238i3, fFloatValue152222, fHeight32222, paint112222);
                float fFloatValue162222 = ((Number) AbstractC0000a.m8e(1, arrayList4)).floatValue() + m14240b(4.0f);
                float fFloatValue172222 = ((Number) AbstractC0000a.m8e(1, arrayList3)).floatValue() - m14240b(2.0f);
                Paint paint122222 = this.f41797x;
                Intrinsics.m18596d(paint122222);
                canvas2.drawText(str3, fFloatValue162222, fFloatValue172222, paint122222);
            }
        } else {
            float f3 = 2.0f;
            double d50 = (this.f41737Z0 - this.f41746c1) / ((double) 4);
            int i29 = 0;
            while (i29 < 3) {
                i29++;
                float f4 = f3;
                String str5 = str4;
                double d51 = this.f41737Z0 - (((double) i29) * d50);
                int i30 = this.f41777o1;
                String strM14238i12 = m14238i(this, d51, i30, i30);
                float fFloatValue18 = ((Number) AbstractC0000a.m8e(1, arrayList4)).floatValue() + m14240b(4.0f);
                float fHeight4 = (rect.height() / f4) + ((Number) arrayList3.get(i29)).floatValue();
                Paint paint13 = this.f41797x;
                Intrinsics.m18596d(paint13);
                canvas2.drawText(strM14238i12, fFloatValue18, fHeight4, paint13);
                str4 = str5;
                f3 = f4;
            }
            str = str4;
        }
        Paint paint14 = this.f41797x;
        Intrinsics.m18596d(paint14);
        paint14.getTextBounds(m14246j(this.f41751e1), 0, m14246j(this.f41751e1).length(), rect);
        String strM14246j = m14246j(this.f41751e1);
        float fFloatValue19 = ((Number) AbstractC0000a.m8e(1, arrayList4)).floatValue() + m14240b(4.0f);
        float fHeight5 = this.f41722Q0 + rect.height() + m14240b(2.0f);
        Paint paint15 = this.f41797x;
        Intrinsics.m18596d(paint15);
        canvas2.drawText(strM14246j, fFloatValue19, fHeight5, paint15);
        double d52 = 2;
        String strM14246j2 = m14246j(this.f41751e1 / d52);
        float fFloatValue20 = ((Number) AbstractC0000a.m8e(1, arrayList4)).floatValue() + m14240b(4.0f);
        float fHeight6 = (rect.height() / 2.0f) + (this.f41716N0 - (this.f41718O0 / f2));
        Paint paint16 = this.f41797x;
        Intrinsics.m18596d(paint16);
        canvas2.drawText(strM14246j2, fFloatValue20, fHeight6, paint16);
        float fFloatValue21 = ((Number) AbstractC0000a.m8e(1, arrayList4)).floatValue() + m14240b(4.0f);
        float fM14240b9 = this.f41716N0 - m14240b(2.0f);
        Paint paint17 = this.f41797x;
        Intrinsics.m18596d(paint17);
        canvas2.drawText(str, fFloatValue21, fM14240b9, paint17);
        ArrayList arrayList5 = this.f41780p1;
        arrayList5.clear();
        m14250n(this.f41750e0, this.f41779p0);
        int size3 = arrayList4.size();
        int i31 = 0;
        while (i31 < size3) {
            if (i31 == 0) {
                d = d52;
                if (((KData) arrayList2.get(0)).f41806B <= (this.f41757g1 / d) + ((Number) arrayList4.get(0)).doubleValue() && ((KData) arrayList2.get(0)).f41807C > ((Number) arrayList4.get(0)).floatValue()) {
                    String strM14237g = m14237g(((KData) arrayList2.get(0)).f41812a);
                    float fM14240b10 = this.f41692B0 + m14240b(6.0f);
                    float fM14240b11 = this.f41698E0 - m14240b(7.0f);
                    Paint paint18 = this.f41797x;
                    Intrinsics.m18596d(paint18);
                    canvas2.drawText(strM14237g, fM14240b10, fM14240b11, paint18);
                }
                i31++;
                arrayList2 = arrayList2;
                d52 = d;
            } else {
                d = d52;
            }
            if (i31 == arrayList4.size() - 1) {
                String strM14237g2 = m14237g(((KData) AbstractC0000a.m8e(1, arrayList2)).f41812a);
                float fM14240b12 = this.f41696D0 - m14240b(41.0f);
                Paint paint19 = this.f41797x;
                Intrinsics.m18596d(paint19);
                float fMeasureText = fM14240b12 - paint19.measureText(strM14237g2);
                float fM14240b13 = this.f41698E0 - m14240b(7.0f);
                Paint paint20 = this.f41797x;
                Intrinsics.m18596d(paint20);
                canvas2.drawText(strM14237g2, fMeasureText, fM14240b13, paint20);
            } else {
                Iterator it3 = arrayList2.iterator();
                int i32 = 0;
                while (it3.hasNext()) {
                    Object next = it3.next();
                    int i33 = i32 + 1;
                    if (i32 < 0) {
                        CollectionsKt.m18455s0();
                        throw null;
                    }
                    KData kData3 = (KData) next;
                    ArrayList arrayList6 = arrayList2;
                    if (kData3.f41806B <= ((Number) arrayList4.get(i31)).floatValue()) {
                        it = it3;
                        if (kData3.f41807C >= ((Number) arrayList4.get(i31)).floatValue()) {
                            String strM14237g3 = m14237g(kData3.f41812a);
                            arrayList5.add(strM14237g3);
                            if (arrayList5.size() == 2) {
                                float fFloatValue22 = ((Number) arrayList4.get(i31)).floatValue();
                                Paint paint21 = this.f41797x;
                                Intrinsics.m18596d(paint21);
                                float fMeasureText2 = fFloatValue22 - (paint21.measureText(strM14237g3) / f2);
                                float fM14240b14 = this.f41698E0 - m14240b(7.0f);
                                Paint paint22 = this.f41797x;
                                Intrinsics.m18596d(paint22);
                                canvas2.drawText(strM14237g3, fMeasureText2, fM14240b14, paint22);
                            }
                        }
                        arrayList2 = arrayList6;
                        it3 = it;
                        i32 = i33;
                    } else {
                        it = it3;
                    }
                    arrayList2 = arrayList6;
                    it3 = it;
                    i32 = i33;
                }
            }
            i31++;
            arrayList2 = arrayList2;
            d52 = d;
        }
        ArrayList<KData> arrayList7 = arrayList2;
        KData kData4 = this.f41711L;
        if (kData4 != null) {
            float f5 = (float) kData4.f41809E;
            RectF rectF = new RectF(this.f41696D0 - m14240b(38.0f), f5 - m14240b(7.0f), this.f41696D0 - m14240b(1.0f), m14240b(7.0f) + f5);
            RectF rectF2 = new RectF(rectF.left, rectF.top, rectF.right, rectF.bottom);
            Paint paint23 = new Paint();
            paint23.setColor(-1);
            paint23.setStyle(Paint.Style.FILL);
            canvas2.drawRoundRect(rectF2, m14240b(4.0f), m14240b(4.0f), paint23);
            Paint paint24 = new Paint();
            paint24.setColor(-16777216);
            paint24.setStyle(Paint.Style.STROKE);
            paint24.setStrokeWidth(1.0f);
            canvas2.drawRoundRect(rectF, m14240b(4.0f), m14240b(4.0f), paint24);
            KData kData5 = this.f41711L;
            Intrinsics.m18596d(kData5);
            if (kData5.m14255a() > 0.0d) {
                Paint paint25 = this.f41793v;
                Intrinsics.m18596d(paint25);
                paint25.setColor(this.f41723R);
            } else {
                Paint paint26 = this.f41793v;
                Intrinsics.m18596d(paint26);
                paint26.setColor(this.f41725S);
            }
            KData kData6 = this.f41711L;
            Intrinsics.m18596d(kData6);
            int i34 = this.f41777o1;
            String strM14238i13 = m14238i(this, kData6.f41814c, i34, i34);
            Rect rect2 = new Rect();
            m14250n(this.f41764j0, this.f41794v0);
            Paint paint27 = this.f41797x;
            Intrinsics.m18596d(paint27);
            paint27.getTextBounds(strM14238i13, 0, strM14238i13.length(), rect2);
            float fM1B = AbstractC0000a.m1B(rectF2.width(), rect2.width(), f2, rectF2.left);
            float fM14240b15 = (f5 + m14240b(7.0f)) - ((rectF2.height() - rect2.height()) / f2);
            Paint paint28 = this.f41797x;
            Intrinsics.m18596d(paint28);
            canvas2.drawText(strM14238i13, fM1B, fM14240b15, paint28);
        }
        for (KData kData7 : arrayList7) {
            if (kData7.f41813b >= kData7.f41814c) {
                Paint paint29 = this.f41793v;
                Intrinsics.m18596d(paint29);
                paint29.setColor(this.f41725S);
            } else {
                Paint paint30 = this.f41793v;
                Intrinsics.m18596d(paint30);
                paint30.setColor(this.f41723R);
            }
            float fM14240b16 = (float) (kData7.f41806B + ((double) m14240b(0.5f)));
            float f6 = (float) (((double) this.f41716N0) - (kData7.f41817f * this.f41759h1));
            float fM14240b17 = ((float) kData7.f41807C) - m14240b(0.5f);
            float f7 = this.f41716N0;
            Paint paint31 = this.f41793v;
            Intrinsics.m18596d(paint31);
            canvas2.drawRect(fM14240b16, f6, fM14240b17, f7, paint31);
        }
        if (this.f41781q) {
            this.f41789t = 0;
            if (this.f41691B != null) {
                ArrayList arrayList8 = this.f41701G;
                if (!arrayList8.isEmpty() && this.f41791u != null) {
                    Path path = this.f41691B;
                    Intrinsics.m18596d(path);
                    path.reset();
                    Path path2 = this.f41693C;
                    Intrinsics.m18596d(path2);
                    path2.reset();
                    float f8 = (float) ((KData) arrayList8.get(0)).f41808D;
                    float f9 = (float) ((KData) arrayList8.get(0)).f41809E;
                    Path path3 = this.f41691B;
                    Intrinsics.m18596d(path3);
                    path3.moveTo(f8, f9);
                    Path path4 = this.f41693C;
                    Intrinsics.m18596d(path4);
                    path4.moveTo(f8, f9);
                    int size4 = arrayList8.size();
                    int i35 = 1;
                    while (true) {
                        arrayList = this.f41709K;
                        if (i35 >= size4) {
                            break;
                        }
                        KData kData8 = (KData) arrayList8.get(i35);
                        Path path5 = this.f41691B;
                        Intrinsics.m18596d(path5);
                        path5.lineTo((float) kData8.f41808D, (float) kData8.f41809E);
                        Path path6 = this.f41693C;
                        Intrinsics.m18596d(path6);
                        path6.lineTo((float) kData8.f41808D, (float) kData8.f41809E);
                        if (i35 == size4 - 1) {
                            Path path7 = this.f41693C;
                            Intrinsics.m18596d(path7);
                            path7.lineTo(((Number) arrayList.get(arrayList.size() - 1)).floatValue(), (float) kData8.f41809E);
                        }
                        i35++;
                    }
                    m14250n(-12204175, 0);
                    Path path8 = this.f41691B;
                    Intrinsics.m18596d(path8);
                    Paint paint32 = this.f41791u;
                    Intrinsics.m18596d(paint32);
                    canvas2.drawPath(path8, paint32);
                    Path path9 = this.f41693C;
                    Intrinsics.m18596d(path9);
                    float fFloatValue23 = ((Number) arrayList.get(arrayList.size() - 1)).floatValue();
                    ArrayList arrayList9 = this.f41707J;
                    path9.lineTo(fFloatValue23, ((Number) AbstractC0000a.m8e(2, arrayList9)).floatValue());
                    Path path10 = this.f41693C;
                    Intrinsics.m18596d(path10);
                    path10.lineTo(f8, ((Number) arrayList9.get(arrayList9.size() - 2)).floatValue());
                    Path path11 = this.f41693C;
                    Intrinsics.m18596d(path11);
                    path11.close();
                    LinearGradient linearGradient = new LinearGradient(0.0f, (int) this.f41765j1, 0.0f, ((Number) AbstractC0000a.m8e(2, arrayList9)).floatValue(), 230162176, 1974566, Shader.TileMode.CLAMP);
                    Paint paint33 = this.f41795w;
                    Intrinsics.m18596d(paint33);
                    paint33.setShader(linearGradient);
                    Path path12 = this.f41693C;
                    Intrinsics.m18596d(path12);
                    Paint paint34 = this.f41795w;
                    Intrinsics.m18596d(paint34);
                    canvas2.drawPath(path12, paint34);
                }
            }
        } else {
            ArrayList<KData> arrayList10 = this.f41701G;
            arrayList10.size();
            for (KData kData9 : arrayList10) {
                double d53 = kData9.f41813b;
                double d54 = kData9.f41814c;
                if (d53 >= d54) {
                    Paint paint35 = this.f41793v;
                    Intrinsics.m18596d(paint35);
                    paint35.setColor(this.f41725S);
                    m14250n(this.f41725S, 0);
                } else {
                    Paint paint36 = this.f41793v;
                    Intrinsics.m18596d(paint36);
                    paint36.setColor(this.f41723R);
                    m14250n(this.f41723R, 0);
                    d54 = d53;
                    d53 = d54;
                }
                double d55 = this.f41765j1;
                double d56 = this.f41736Y0;
                double d57 = this.f41754f1;
                float f10 = (float) (((d56 - d53) * d57) + d55);
                float f11 = (float) (((d56 - d54) * d57) + d55);
                if (f10 == f11) {
                    f11 = 1 + f10;
                }
                float f12 = f11;
                float fM14240b18 = ((float) kData9.f41806B) + m14240b(0.5f);
                float fM14240b19 = ((float) kData9.f41807C) - m14240b(0.5f);
                Paint paint37 = this.f41793v;
                Intrinsics.m18596d(paint37);
                canvas2.drawRect(fM14240b18, f10, fM14240b19, f12, paint37);
                float f13 = (float) kData9.f41808D;
                double d58 = this.f41765j1;
                double d59 = this.f41736Y0;
                double d60 = d59 - kData9.f41815d;
                double d61 = this.f41754f1;
                float f14 = (float) (((d59 - kData9.f41816e) * d61) + d58);
                Paint paint38 = this.f41791u;
                Intrinsics.m18596d(paint38);
                canvas.drawLine(f13, (float) ((d60 * d61) + d58), f13, f14, paint38);
                if (this.vicePicShow && this.f41787s == 1) {
                    double d62 = kData9.f41830s;
                    if (d62 > 0.0d) {
                        Paint paint39 = this.f41793v;
                        Intrinsics.m18596d(paint39);
                        paint39.setColor(this.f41745c0);
                        float fM14240b20 = (float) (kData9.f41806B + ((double) m14240b(0.5f)));
                        float f15 = (float) (((double) this.f41726S0) - (d62 * this.f41762i1));
                        float fM14240b21 = ((float) kData9.f41807C) - m14240b(0.5f);
                        float f16 = this.f41726S0;
                        Paint paint40 = this.f41793v;
                        Intrinsics.m18596d(paint40);
                        canvas2 = canvas;
                        canvas2.drawRect(fM14240b20, f15, fM14240b21, f16, paint40);
                    } else {
                        Paint paint41 = this.f41793v;
                        Intrinsics.m18596d(paint41);
                        paint41.setColor(this.f41748d0);
                        float fM14240b22 = (float) (kData9.f41806B + ((double) m14240b(0.5f)));
                        float f17 = this.f41726S0;
                        float fM14240b23 = ((float) kData9.f41807C) - m14240b(0.5f);
                        float fAbs = (float) ((Math.abs(d62) * this.f41762i1) + ((double) this.f41726S0));
                        Paint paint42 = this.f41793v;
                        Intrinsics.m18596d(paint42);
                        canvas2 = canvas;
                        canvas2.drawRect(fM14240b22, f17, fM14240b23, fAbs, paint42);
                    }
                } else {
                    canvas2 = canvas;
                }
            }
            m14243e(canvas);
        }
        m14241c(canvas);
        m14242d(canvas);
        m14244f(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f41692B0 = getPaddingLeft();
        this.f41694C0 = getPaddingTop();
        this.f41696D0 = getMeasuredWidth() - getPaddingRight();
        this.f41698E0 = getMeasuredHeight() - getPaddingBottom();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View v, MotionEvent event) {
        Intrinsics.m18599g(v, "v");
        Intrinsics.m18599g(event, "event");
        if (this.f41778p) {
            return false;
        }
        GestureDetector gestureDetector = this.f41721Q;
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
            this.f41708J0 = event.getX();
            this.f41728T0 = event.getY();
            this.f41720P0 = 0.0f;
            this.f41700F0 = event.getX(0);
            this.f41702G0 = event.getY(0);
            return true;
        }
        if (actionMasked == 1) {
            if (!this.f41778p) {
                float fAbs = Math.abs(event.getX() - this.f41708J0);
                float fAbs2 = Math.abs(event.getY() - this.f41728T0);
                float f = this.f41690A0;
                if (fAbs2 < f && fAbs < f) {
                    this.f41755g = true;
                    if (this.f41789t == 2) {
                        this.f41712L0 = event.getY();
                    }
                    m14247k(this.f41708J0);
                    if (this.f41711L != null) {
                        invalidate();
                    }
                }
            }
            this.f41778p = false;
            return true;
        }
        if (actionMasked != 2) {
            if (actionMasked == 3) {
                this.f41778p = false;
                return true;
            }
            if (actionMasked == 5) {
                this.f41755g = false;
                this.f41778p = true;
                removeCallbacks(this.f41719P);
                this.f41730U0 = event.getX(1);
                float y2 = event.getY(1);
                this.f41704H0 = Math.abs(this.f41730U0 - this.f41700F0);
                this.f41706I0 = Math.abs(y2 - this.f41702G0);
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
            ArrayList arrayList = this.f41699F;
            ArrayList arrayList2 = this.f41709K;
            if ((fAbs3 >= fAbs4 && fAbs3 - this.f41704H0 > 1.0f) || (fAbs4 >= fAbs3 && fAbs4 - this.f41706I0 > 1.0f)) {
                int i = this.f41747d;
                int i2 = this.f41741b;
                if (i <= i2) {
                    this.f41747d = i2;
                } else {
                    int size = this.f41701G.size();
                    int i3 = this.f41747d;
                    if (size < i3) {
                        this.f41747d = i3 - 2;
                        this.f41738a = arrayList.size() - this.f41747d;
                    } else if (this.f41700F0 >= ((Number) arrayList2.get(2)).floatValue() || this.f41730U0 > ((Number) arrayList2.get(2)).floatValue()) {
                        float f4 = this.f41700F0;
                        float f5 = this.f41730U0;
                        float fFloatValue = ((Number) arrayList2.get(2)).floatValue();
                        if (f4 > fFloatValue || fFloatValue > f5) {
                            float f6 = this.f41730U0;
                            float f7 = this.f41700F0;
                            float fFloatValue2 = ((Number) arrayList2.get(2)).floatValue();
                            if (f6 <= fFloatValue2 && fFloatValue2 <= f7) {
                                this.f41747d -= 2;
                                this.f41738a++;
                            } else if (this.f41700F0 >= ((Number) arrayList2.get(2)).floatValue() && this.f41730U0 > ((Number) arrayList2.get(2)).floatValue()) {
                                this.f41747d -= 2;
                                this.f41738a += 2;
                            }
                        }
                    } else {
                        this.f41747d -= 2;
                    }
                }
                m14251o();
            } else if ((fAbs3 >= fAbs4 && fAbs3 - this.f41704H0 < -1.0f) || (fAbs4 >= fAbs3 && fAbs4 - this.f41706I0 < -1.0f)) {
                int i4 = this.f41747d;
                int i5 = this.f41744c;
                if (i4 >= i5) {
                    this.f41747d = i5;
                } else if (this.f41738a + i4 >= arrayList.size()) {
                    this.f41747d += 2;
                    this.f41738a = arrayList.size() - this.f41747d;
                } else if (this.f41738a <= 0) {
                    this.f41738a = 0;
                    this.f41747d += 2;
                } else if (this.f41700F0 >= ((Number) arrayList2.get(2)).floatValue() || this.f41730U0 > ((Number) arrayList2.get(2)).floatValue()) {
                    float f8 = this.f41700F0;
                    float f9 = this.f41730U0;
                    float fFloatValue3 = ((Number) arrayList2.get(2)).floatValue();
                    if (f8 > fFloatValue3 || fFloatValue3 > f9) {
                        float f10 = this.f41730U0;
                        float f11 = this.f41700F0;
                        float fFloatValue4 = ((Number) arrayList2.get(2)).floatValue();
                        if (f10 <= fFloatValue4 && fFloatValue4 <= f11) {
                            this.f41747d += 2;
                            this.f41738a--;
                        } else if (this.f41700F0 >= ((Number) arrayList2.get(2)).floatValue() && this.f41730U0 > ((Number) arrayList2.get(2)).floatValue()) {
                            this.f41747d += 2;
                            this.f41738a -= 2;
                        }
                    }
                } else {
                    this.f41747d += 2;
                }
                m14251o();
            }
            this.f41704H0 = Math.abs(f2);
            this.f41706I0 = Math.abs(f3);
        }
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final void m14252p(double d, float f) {
        this.f41738a += (Math.abs(f) <= 1.0f || Math.abs(f) >= 2.0f) ? Math.abs(f) < 10.0f ? ((int) f) % 2 : (int) (((double) ((int) f)) / d) : ((int) (f * 10)) % 2;
    }

    /* JADX INFO: renamed from: q */
    public final int m14253q(float f) {
        return (int) ((f * getContext().getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    public final void setCrossHairMoveMode(int moveMode) {
        this.f41789t = moveMode;
    }

    public final void setDeputyImgType(int type) {
        this.f41787s = type;
        ArrayList arrayList = this.f41699F;
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
            setDeputyImgType(this.f41787s);
        }
        invalidate();
    }

    public final void setFixed(int num) {
        this.f41777o1 = num;
    }

    public final void setFlashBitmap(@NotNull Bitmap bitmap) {
        Intrinsics.m18599g(bitmap, "bitmap");
        this.f41786r1 = bitmap;
    }

    public final void setMainImgType(int type) {
        ArrayList arrayList = this.f41699F;
        if (type == 0) {
            QuotaUtil.m14302g(arrayList, false);
        } else if (type == 1) {
            QuotaUtil.m14299d(arrayList, false);
        } else if (type == 2) {
            QuotaUtil.m14298c(arrayList, false);
        }
        this.f41784r = type;
        invalidate();
    }

    public final void setOnRequestDataListListener(@Nullable OnRequestDataListListener requestListener) {
        this.f41713M = requestListener;
    }

    public final void setShowInstant(boolean state) {
        this.f41781q = state;
        invalidate();
    }
}
