package com.exchange.allin.p024ui.widgets.depth;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.datastore.preferences.protobuf.AbstractC1610a;
import com.exchange.allin.R;
import com.exchange.allin.utils.NumberFormaterKt;
import com.exchange.allin.utils.ext.StringExtKt;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0014\u0015J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\u0006R\"\u0010\u0010\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, m18302d2 = {"Lcom/exchange/allin/ui/widgets/depth/DepthMapView;", "Landroid/view/View;", "", "priTradePost", "", "setPriTradePost", "(I)V", "H", "I", "getMPriceLimit", "()I", "setMPriceLimit", "mPriceLimit", "", "S", "Z", "isShowHighOrLowPrice", "()Z", "setShowHighOrLowPrice", "(Z)V", "comparePrice", "Companion", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class DepthMapView extends View {

    /* JADX INFO: renamed from: A */
    public final Paint f41395A;

    /* JADX INFO: renamed from: B */
    public final Path f41396B;

    /* JADX INFO: renamed from: C */
    public final Path f41397C;

    /* JADX INFO: renamed from: D */
    public final ArrayList f41398D;

    /* JADX INFO: renamed from: E */
    public final ArrayList f41399E;

    /* JADX INFO: renamed from: F */
    public final ArrayList f41400F;

    /* JADX INFO: renamed from: G */
    public final ArrayList f41401G;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public int mPriceLimit;

    /* JADX INFO: renamed from: I */
    public final HashMap f41403I;

    /* JADX INFO: renamed from: J */
    public final HashMap f41404J;

    /* JADX INFO: renamed from: K */
    public final HashMap f41405K;

    /* JADX INFO: renamed from: L */
    public final Float[] f41406L;

    /* JADX INFO: renamed from: M */
    public boolean f41407M;

    /* JADX INFO: renamed from: N */
    public boolean f41408N;

    /* JADX INFO: renamed from: O */
    public boolean f41409O;

    /* JADX INFO: renamed from: P */
    public String f41410P;

    /* JADX INFO: renamed from: Q */
    public String f41411Q;

    /* JADX INFO: renamed from: R */
    public int f41412R;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public boolean isShowHighOrLowPrice;

    /* JADX INFO: renamed from: T */
    public final GestureDetector f41414T;

    /* JADX INFO: renamed from: U */
    public final GestureMoveActionCompat f41415U;

    /* JADX INFO: renamed from: a */
    public int f41416a;

    /* JADX INFO: renamed from: b */
    public final int f41417b;

    /* JADX INFO: renamed from: c */
    public final int f41418c;

    /* JADX INFO: renamed from: d */
    public float f41419d;

    /* JADX INFO: renamed from: f */
    public final int f41420f;

    /* JADX INFO: renamed from: g */
    public final int f41421g;

    /* JADX INFO: renamed from: i */
    public final int f41422i;

    /* JADX INFO: renamed from: j */
    public boolean f41423j;

    /* JADX INFO: renamed from: n */
    public float f41424n;

    /* JADX INFO: renamed from: o */
    public float f41425o;

    /* JADX INFO: renamed from: p */
    public int f41426p;

    /* JADX INFO: renamed from: q */
    public int f41427q;

    /* JADX INFO: renamed from: r */
    public int f41428r;

    /* JADX INFO: renamed from: s */
    public final Paint f41429s;

    /* JADX INFO: renamed from: t */
    public final Paint f41430t;

    /* JADX INFO: renamed from: u */
    public final Paint f41431u;

    /* JADX INFO: renamed from: v */
    public final Paint f41432v;

    /* JADX INFO: renamed from: w */
    public final Paint f41433w;

    /* JADX INFO: renamed from: x */
    public final Paint f41434x;

    /* JADX INFO: renamed from: y */
    public final Paint f41435y;

    /* JADX INFO: renamed from: z */
    public final Paint f41436z;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/widgets/depth/DepthMapView$Companion;", "", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final class Companion {
        /* JADX INFO: renamed from: a */
        public static int m14173a(float f) {
            return (int) ((f * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003¨\u0006\u0004"}, m18302d2 = {"Lcom/exchange/allin/ui/widgets/depth/DepthMapView$comparePrice;", "Ljava/util/Comparator;", "Lcom/exchange/allin/ui/widgets/depth/DepthBuySellData;", "Lkotlin/Comparator;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public final class comparePrice implements Comparator<DepthBuySellData> {
        @Override // java.util.Comparator
        public final int compare(DepthBuySellData depthBuySellData, DepthBuySellData depthBuySellData2) {
            DepthBuySellData o1 = depthBuySellData;
            DepthBuySellData o2 = depthBuySellData2;
            Intrinsics.m18599g(o1, "o1");
            Intrinsics.m18599g(o2, "o2");
            Float fValueOf = Float.valueOf(o1.f41393a);
            Float fValueOf2 = Float.valueOf(o2.f41393a);
            Intrinsics.m18596d(fValueOf);
            float fFloatValue = fValueOf.floatValue();
            Intrinsics.m18596d(fValueOf2);
            return Float.compare(fFloatValue, fValueOf2.floatValue());
        }
    }

    public DepthMapView(Context context) {
        super(context, null, 0);
        this.f41417b = 2;
        this.f41418c = 8;
        this.f41396B = new Path();
        this.f41397C = new Path();
        this.mPriceLimit = 7;
        this.f41410P = "";
        this.f41411Q = "";
        this.isShowHighOrLowPrice = true;
        this.f41414T = new GestureDetector(getContext(), new DepthMapView$gestureDetector$1(this));
        GestureMoveActionCompat gestureMoveActionCompat = new GestureMoveActionCompat();
        gestureMoveActionCompat.f41440c = 0;
        gestureMoveActionCompat.f41441d = 20;
        gestureMoveActionCompat.f41442e = false;
        this.f41415U = gestureMoveActionCompat;
        Intrinsics.m18596d(context);
        gestureMoveActionCompat.f41441d = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f41420f = 40;
        this.f41403I = new HashMap();
        this.f41404J = new HashMap();
        this.f41405K = new HashMap();
        this.f41406L = new Float[4];
        this.f41398D = new ArrayList();
        this.f41399E = new ArrayList();
        this.f41400F = new ArrayList();
        this.f41401G = new ArrayList();
        Paint paint = new Paint(1);
        this.f41429s = paint;
        Paint.Align align = Paint.Align.RIGHT;
        paint.setTextAlign(align);
        Paint paint2 = new Paint(1);
        this.f41430t = paint2;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        Paint paint3 = this.f41430t;
        Intrinsics.m18596d(paint3);
        Paint.Align align2 = Paint.Align.CENTER;
        paint3.setTextAlign(align2);
        this.f41432v = new Paint(1);
        Paint paint4 = new Paint(1);
        this.f41431u = paint4;
        paint4.setStyle(style);
        Paint paint5 = this.f41431u;
        Intrinsics.m18596d(paint5);
        paint5.setTextAlign(align2);
        this.f41433w = new Paint(1);
        Paint paint6 = new Paint(1);
        this.f41434x = paint6;
        paint6.setTextAlign(align2);
        Paint paint7 = new Paint(1);
        this.f41435y = paint7;
        paint7.setTextAlign(align2);
        this.f41436z = new Paint(1);
        Paint paint8 = new Paint(1);
        this.f41395A = paint8;
        paint8.setTextAlign(align);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes((AttributeSet) null, R.styleable.f35234a);
        Intrinsics.m18598f(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            this.f41421g = typedArrayObtainStyledAttributes.getInt(5, 4);
            this.f41417b = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, Companion.m14173a(this.f41417b));
            this.f41418c = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, Companion.m14173a(this.f41418c));
            this.f41422i = typedArrayObtainStyledAttributes.getColor(0, getContext().getColor(android.R.color.transparent));
            Paint paint9 = this.f41430t;
            Intrinsics.m18596d(paint9);
            paint9.setStrokeWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(6, Companion.m14173a(1.0f)));
            Paint paint10 = this.f41431u;
            Intrinsics.m18596d(paint10);
            paint10.setStrokeWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(6, Companion.m14173a(1.0f)));
            Paint paint11 = this.f41429s;
            Intrinsics.m18596d(paint11);
            paint11.setColor(typedArrayObtainStyledAttributes.getColor(12, Color.parseColor("#848E9C")));
            Paint paint12 = this.f41429s;
            Intrinsics.m18596d(paint12);
            paint12.setTextSize(typedArrayObtainStyledAttributes.getDimension(13, Companion.m14173a(10.0f)));
            Paint paint13 = this.f41430t;
            Intrinsics.m18596d(paint13);
            paint13.setColor(typedArrayObtainStyledAttributes.getColor(1, Color.parseColor("#45C771")));
            Paint paint14 = this.f41431u;
            Intrinsics.m18596d(paint14);
            paint14.setColor(typedArrayObtainStyledAttributes.getColor(10, Color.parseColor("#EF5B5B")));
            int color = typedArrayObtainStyledAttributes.getColor(2, Color.parseColor("#1A79D152"));
            int color2 = typedArrayObtainStyledAttributes.getColor(11, Color.parseColor("#1AF44D4D"));
            Paint paint15 = this.f41436z;
            Intrinsics.m18596d(paint15);
            paint15.setColor(typedArrayObtainStyledAttributes.getColor(7, Color.parseColor("#252B3E")));
            Paint paint16 = this.f41395A;
            Intrinsics.m18596d(paint16);
            paint16.setColor(typedArrayObtainStyledAttributes.getColor(8, getContext().getColor(android.R.color.white)));
            Paint paint17 = this.f41395A;
            Intrinsics.m18596d(paint17);
            paint17.setTextSize(typedArrayObtainStyledAttributes.getDimension(9, Companion.m14173a(10.0f)));
            int color3 = Color.parseColor("#2012B36E");
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 800.0f, color, color3, tileMode);
            Paint paint18 = this.f41432v;
            Intrinsics.m18596d(paint18);
            paint18.setShader(linearGradient);
            LinearGradient linearGradient2 = new LinearGradient(getWidth(), 0.0f, getWidth(), 800.0f, color2, Color.parseColor("#20DB394B"), tileMode);
            Paint paint19 = this.f41433w;
            Intrinsics.m18596d(paint19);
            paint19.setShader(linearGradient2);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m14169a(Canvas canvas, int i) {
        HashMap map = this.f41404J;
        Intrinsics.m18596d(map);
        Float f = (Float) map.get(Integer.valueOf(i));
        if (f != null) {
            float fFloatValue = f.floatValue();
            if (i < this.f41426p) {
                Paint paint = this.f41435y;
                Intrinsics.m18596d(paint);
                paint.setColor(Color.parseColor("#454E6B"));
                Paint paint2 = this.f41434x;
                Intrinsics.m18596d(paint2);
                paint2.setColor(Color.parseColor("#7E9AEF"));
            } else {
                Paint paint3 = this.f41435y;
                Intrinsics.m18596d(paint3);
                paint3.setColor(Color.parseColor("#454E6B"));
                Paint paint4 = this.f41434x;
                Intrinsics.m18596d(paint4);
                paint4.setColor(Color.parseColor("#7E9AEF"));
            }
            float f2 = i;
            float f3 = this.f41418c;
            Paint paint5 = this.f41435y;
            Intrinsics.m18596d(paint5);
            canvas.drawCircle(f2, fFloatValue, f3, paint5);
            float f4 = this.f41417b;
            Paint paint6 = this.f41434x;
            Intrinsics.m18596d(paint6);
            canvas.drawCircle(f2, fFloatValue, f4, paint6);
            StringBuilder sb = new StringBuilder();
            sb.append(StringExtKt.m14217f("spot_text_amount"));
            sb.append(": ");
            HashMap map2 = this.f41403I;
            Intrinsics.m18596d(map2);
            Object obj = map2.get(Integer.valueOf(i));
            Intrinsics.m18596d(obj);
            Double dValueOf = Double.valueOf(((DepthBuySellData) obj).f41394b);
            Intrinsics.m18598f(dValueOf, "valueOf(...)");
            sb.append(NumberFormaterKt.m14183b(0, 31, dValueOf.doubleValue()));
            sb.append(' ');
            sb.append(this.f41411Q);
            String string = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(StringExtKt.m14217f("spot_text_price"));
            sb2.append(": ");
            HashMap map3 = this.f41403I;
            Intrinsics.m18596d(map3);
            Object obj2 = map3.get(Integer.valueOf(i));
            Intrinsics.m18596d(obj2);
            Float fValueOf = Float.valueOf(((DepthBuySellData) obj2).f41393a);
            Intrinsics.m18598f(fValueOf, "valueOf(...)");
            sb2.append(m14170b(fValueOf.floatValue()));
            sb2.append(' ');
            sb2.append(this.f41410P);
            String string2 = sb2.toString();
            HashMap map4 = this.f41405K;
            Intrinsics.m18596d(map4);
            Object obj3 = map4.get(Integer.valueOf(i));
            Intrinsics.m18596d(obj3);
            ((Number) obj3).floatValue();
            Paint paint7 = this.f41395A;
            Intrinsics.m18596d(paint7);
            float fMeasureText = paint7.measureText(string);
            Paint paint8 = this.f41395A;
            Intrinsics.m18596d(paint8);
            float fMax = Math.max(fMeasureText, paint8.measureText(string2));
            Paint paint9 = this.f41395A;
            Intrinsics.m18596d(paint9);
            Paint.FontMetrics fontMetrics = paint9.getFontMetrics();
            float f5 = fontMetrics.descent - fontMetrics.ascent;
            int iM14173a = Companion.m14173a(5.0f);
            float f6 = this.f41426p;
            float f7 = 2;
            float f8 = fMax / f7;
            float f9 = iM14173a;
            float f10 = iM14173a * 2;
            float f11 = f7 * f5;
            float f12 = 20;
            RectF rectF = new RectF((f6 - f8) - f9, 20.0f, f6 + f8 + f10, f10 + f11 + f12);
            Paint paint10 = this.f41436z;
            Intrinsics.m18596d(paint10);
            canvas.drawRoundRect(rectF, 10.0f, 10.0f, paint10);
            String strConcat = StringExtKt.m14217f("spot_text_price").concat(": ");
            Paint paint11 = this.f41395A;
            Intrinsics.m18596d(paint11);
            float fMeasureText2 = paint11.measureText(StringExtKt.m14217f("spot_text_price").concat(": ")) + (this.f41426p - f8) + f9;
            float f13 = f5 + 22;
            Paint paint12 = this.f41395A;
            Intrinsics.m18596d(paint12);
            canvas.drawText(strConcat, fMeasureText2, f13, paint12);
            StringBuilder sb3 = new StringBuilder();
            HashMap map5 = this.f41403I;
            Intrinsics.m18596d(map5);
            Object obj4 = map5.get(Integer.valueOf(i));
            Intrinsics.m18596d(obj4);
            Float fValueOf2 = Float.valueOf(((DepthBuySellData) obj4).f41393a);
            Intrinsics.m18598f(fValueOf2, "valueOf(...)");
            sb3.append(m14170b(fValueOf2.floatValue()));
            sb3.append(' ');
            sb3.append(this.f41410P);
            Paint paint13 = this.f41395A;
            Intrinsics.m18596d(paint13);
            canvas.drawText(sb3.toString(), this.f41426p + f8 + f9, f13, paint13);
            String strConcat2 = StringExtKt.m14217f("spot_text_amount").concat(": ");
            Paint paint14 = this.f41395A;
            Intrinsics.m18596d(paint14);
            float fMeasureText3 = paint14.measureText(StringExtKt.m14217f("spot_text_amount").concat(": ")) + (this.f41426p - f8) + f9;
            float f14 = f11 + f9 + f12;
            Paint paint15 = this.f41395A;
            Intrinsics.m18596d(paint15);
            canvas.drawText(strConcat2, fMeasureText3, f14, paint15);
            StringBuilder sb4 = new StringBuilder();
            HashMap map6 = this.f41403I;
            Intrinsics.m18596d(map6);
            Object obj5 = map6.get(Integer.valueOf(i));
            Intrinsics.m18596d(obj5);
            Double dValueOf2 = Double.valueOf(((DepthBuySellData) obj5).f41394b);
            Intrinsics.m18598f(dValueOf2, "valueOf(...)");
            sb4.append(NumberFormaterKt.m14183b(0, 31, dValueOf2.doubleValue()));
            sb4.append(' ');
            sb4.append(this.f41411Q);
            String string3 = sb4.toString();
            float f15 = this.f41426p + f8 + f9;
            Paint paint16 = this.f41395A;
            Intrinsics.m18596d(paint16);
            canvas.drawText(string3, f15, f14, paint16);
        }
    }

    /* JADX INFO: renamed from: b */
    public final String m14170b(float f) {
        String plainString = new BigDecimal(f).setScale(this.f41412R, 4).toPlainString();
        Intrinsics.m18598f(plainString, "toPlainString(...)");
        return plainString;
    }

    /* JADX INFO: renamed from: c */
    public final float m14171c(float f) {
        int i = this.f41427q;
        return i - ((i * f) / this.f41424n);
    }

    /* JADX INFO: renamed from: d */
    public final void m14172d(List list, List list2, String str, String str2, int i) throws Throwable {
        Throwable th;
        int size;
        int size2 = 0;
        float fFloatValue = 0.0f;
        if (list.size() > 0) {
            ArrayList arrayList = this.f41398D;
            Intrinsics.m18596d(arrayList);
            arrayList.clear();
            ArrayList arrayList2 = this.f41400F;
            Intrinsics.m18596d(arrayList2);
            arrayList2.clear();
            Collections.sort(list, new comparePrice());
            int size3 = list.size() - 1;
            if (size3 >= 0) {
                float fFloatValue2 = 0.0f;
                double dDoubleValue = 0.0d;
                while (true) {
                    int i2 = size3 - 1;
                    DepthBuySellData depthBuySellData = (DepthBuySellData) list.get(size3);
                    th = null;
                    Double dValueOf = Double.valueOf(depthBuySellData.f41394b);
                    Intrinsics.m18598f(dValueOf, "valueOf(...)");
                    dDoubleValue = dValueOf.doubleValue() + dDoubleValue;
                    float fFloatValue3 = Float.valueOf(depthBuySellData.f41394b).floatValue();
                    Float fValueOf = Float.valueOf(depthBuySellData.f41393a);
                    Intrinsics.m18598f(fValueOf, "valueOf(...)");
                    fFloatValue2 += fValueOf.floatValue() * fFloatValue3;
                    depthBuySellData.f41394b = "" + dDoubleValue;
                    ArrayList arrayList3 = this.f41398D;
                    Intrinsics.m18596d(arrayList3);
                    arrayList3.add(0, depthBuySellData);
                    ArrayList arrayList4 = this.f41400F;
                    Intrinsics.m18596d(arrayList4);
                    arrayList4.add(0, Float.valueOf(fFloatValue2));
                    if (i2 < 0) {
                        break;
                    } else {
                        size3 = i2;
                    }
                }
            } else {
                th = null;
            }
            Float[] fArr = this.f41406L;
            if (fArr == null) {
                Intrinsics.m18606n("mBottomPrice");
                throw th;
            }
            ArrayList arrayList5 = this.f41398D;
            Intrinsics.m18596d(arrayList5);
            fArr[0] = Float.valueOf(((DepthBuySellData) arrayList5.get(0)).f41393a);
            Float[] fArr2 = this.f41406L;
            if (fArr2 == null) {
                Intrinsics.m18606n("mBottomPrice");
                throw th;
            }
            ArrayList arrayList6 = this.f41398D;
            Intrinsics.m18596d(arrayList6);
            ArrayList arrayList7 = this.f41398D;
            Intrinsics.m18596d(arrayList7);
            if (arrayList7.size() > 1) {
                ArrayList arrayList8 = this.f41398D;
                Intrinsics.m18596d(arrayList8);
                size = arrayList8.size() - 1;
            } else {
                size = 0;
            }
            fArr2[1] = Float.valueOf(((DepthBuySellData) arrayList6.get(size)).f41393a);
            ArrayList arrayList9 = this.f41398D;
            Intrinsics.m18596d(arrayList9);
            this.f41424n = Float.valueOf(((DepthBuySellData) arrayList9.get(0)).f41394b).floatValue();
        } else {
            th = null;
        }
        if (list2.size() > 0) {
            ArrayList arrayList10 = this.f41399E;
            Intrinsics.m18596d(arrayList10);
            arrayList10.clear();
            ArrayList arrayList11 = this.f41401G;
            Intrinsics.m18596d(arrayList11);
            arrayList11.clear();
            Collections.sort(list2, new comparePrice());
            Iterator it = list2.iterator();
            double dDoubleValue2 = 0.0d;
            while (it.hasNext()) {
                DepthBuySellData depthBuySellData2 = (DepthBuySellData) it.next();
                Double dValueOf2 = Double.valueOf(depthBuySellData2.f41394b);
                Intrinsics.m18598f(dValueOf2, "valueOf(...)");
                dDoubleValue2 += dValueOf2.doubleValue();
                float fFloatValue4 = Float.valueOf(depthBuySellData2.f41394b).floatValue();
                Float fValueOf2 = Float.valueOf(depthBuySellData2.f41393a);
                Intrinsics.m18598f(fValueOf2, "valueOf(...)");
                fFloatValue += fValueOf2.floatValue() * fFloatValue4;
                depthBuySellData2.f41394b = "" + dDoubleValue2;
                ArrayList arrayList12 = this.f41399E;
                Intrinsics.m18596d(arrayList12);
                arrayList12.add(depthBuySellData2);
                ArrayList arrayList13 = this.f41401G;
                Intrinsics.m18596d(arrayList13);
                arrayList13.add(Float.valueOf(fFloatValue));
            }
            Float[] fArr3 = this.f41406L;
            if (fArr3 == null) {
                Intrinsics.m18606n("mBottomPrice");
                throw th;
            }
            ArrayList arrayList14 = this.f41399E;
            Intrinsics.m18596d(arrayList14);
            fArr3[2] = Float.valueOf(((DepthBuySellData) arrayList14.get(0)).f41393a);
            Float[] fArr4 = this.f41406L;
            if (fArr4 == null) {
                Intrinsics.m18606n("mBottomPrice");
                throw th;
            }
            ArrayList arrayList15 = this.f41399E;
            Intrinsics.m18596d(arrayList15);
            ArrayList arrayList16 = this.f41399E;
            Intrinsics.m18596d(arrayList16);
            if (arrayList16.size() > 1) {
                ArrayList arrayList17 = this.f41399E;
                Intrinsics.m18596d(arrayList17);
                size2 = arrayList17.size() - 1;
            }
            fArr4[3] = Float.valueOf(((DepthBuySellData) arrayList15.get(size2)).f41393a);
            float f = this.f41424n;
            ArrayList arrayList18 = this.f41399E;
            Intrinsics.m18596d(arrayList18);
            ArrayList arrayList19 = this.f41399E;
            Intrinsics.m18596d(arrayList19);
            Float fValueOf3 = Float.valueOf(((DepthBuySellData) arrayList18.get(arrayList19.size() - 1)).f41394b);
            Intrinsics.m18598f(fValueOf3, "valueOf(...)");
            this.f41424n = Math.max(f, fValueOf3.floatValue());
        }
        float f2 = this.f41424n * 1.05f;
        this.f41424n = f2;
        this.f41425o = f2 / this.f41421g;
        this.f41410P = str2;
        this.f41411Q = str;
        this.f41412R = i;
        invalidate();
    }

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent event) {
        Intrinsics.m18599g(event, "event");
        float x = event.getX();
        float y2 = event.getY();
        GestureMoveActionCompat gestureMoveActionCompat = this.f41415U;
        gestureMoveActionCompat.getClass();
        int action = event.getAction();
        if (action == 0) {
            gestureMoveActionCompat.f41439b = y2;
            gestureMoveActionCompat.f41438a = x;
            gestureMoveActionCompat.f41440c = 0;
            gestureMoveActionCompat.f41442e = false;
        } else if (action == 1) {
            gestureMoveActionCompat.f41440c = 0;
            gestureMoveActionCompat.f41442e = false;
        } else if (action == 2) {
            float fAbs = Math.abs(y2 - gestureMoveActionCompat.f41439b);
            float fAbs2 = Math.abs(x - gestureMoveActionCompat.f41438a);
            int i = gestureMoveActionCompat.f41440c;
            if (i != 1 && (gestureMoveActionCompat.f41442e || (fAbs2 > fAbs && fAbs2 > gestureMoveActionCompat.f41441d))) {
                gestureMoveActionCompat.f41440c = 2;
                gestureMoveActionCompat.f41442e = true;
            } else if (i != 2 && (gestureMoveActionCompat.f41442e || (fAbs2 < fAbs && fAbs > gestureMoveActionCompat.f41441d))) {
                gestureMoveActionCompat.f41440c = 1;
                gestureMoveActionCompat.f41442e = true;
            }
        }
        boolean z2 = gestureMoveActionCompat.f41440c == 2;
        int actionMasked = event.getActionMasked();
        this.f41409O = false;
        if (actionMasked == 2 && !z2 && !this.f41408N && gestureMoveActionCompat.f41442e) {
            this.f41407M = false;
            this.f41409O = true;
        }
        getParent().requestDisallowInterceptTouchEvent(!this.f41409O);
        return super.dispatchTouchEvent(event);
    }

    public final int getMPriceLimit() {
        return this.mPriceLimit;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int size;
        int size2;
        Float f;
        Intrinsics.m18599g(canvas, "canvas");
        super.onDraw(canvas);
        canvas.drawColor(this.f41422i);
        canvas.save();
        float f2 = this.f41426p * 1.0f;
        ArrayList arrayList = this.f41398D;
        Intrinsics.m18596d(arrayList);
        if (arrayList.size() - 1 == 0) {
            size = 1;
        } else {
            ArrayList arrayList2 = this.f41398D;
            Intrinsics.m18596d(arrayList2);
            size = arrayList2.size() - 1;
        }
        this.f41419d = f2 / size;
        Path path = this.f41396B;
        path.reset();
        HashMap map = this.f41403I;
        Intrinsics.m18596d(map);
        map.clear();
        HashMap map2 = this.f41404J;
        Intrinsics.m18596d(map2);
        map2.clear();
        HashMap map3 = this.f41405K;
        Intrinsics.m18596d(map3);
        map3.clear();
        ArrayList arrayList3 = this.f41398D;
        Intrinsics.m18596d(arrayList3);
        int size3 = arrayList3.size();
        int i = 0;
        for (int i2 = 0; i2 < size3; i2++) {
            if (i2 == 0) {
                ArrayList arrayList4 = this.f41398D;
                Intrinsics.m18596d(arrayList4);
                Float fValueOf = Float.valueOf(((DepthBuySellData) arrayList4.get(0)).f41394b);
                Intrinsics.m18598f(fValueOf, "valueOf(...)");
                path.moveTo(0.0f, m14171c(fValueOf.floatValue()));
            }
            ArrayList arrayList5 = this.f41398D;
            Intrinsics.m18596d(arrayList5);
            Float fValueOf2 = Float.valueOf(((DepthBuySellData) arrayList5.get(i2)).f41394b);
            Intrinsics.m18598f(fValueOf2, "valueOf(...)");
            float fM14171c = m14171c(fValueOf2.floatValue());
            if (i2 >= 1) {
                int i3 = i2 - 1;
                float f3 = this.f41419d * i3;
                ArrayList arrayList6 = this.f41398D;
                Intrinsics.m18596d(arrayList6);
                Float fValueOf3 = Float.valueOf(((DepthBuySellData) arrayList6.get(i3)).f41394b);
                Intrinsics.m18598f(fValueOf3, "valueOf(...)");
                float fM14171c2 = m14171c(fValueOf3.floatValue());
                float f4 = this.f41419d * i2;
                Paint paint = this.f41430t;
                Intrinsics.m18596d(paint);
                canvas.drawLine(f3, fM14171c2, f4, fM14171c, paint);
            }
            ArrayList arrayList7 = this.f41398D;
            Intrinsics.m18596d(arrayList7);
            if (i2 != arrayList7.size() - 1) {
                float f5 = this.f41419d;
                float f6 = i2 * f5;
                int i4 = i2 + 1;
                float f7 = f5 * i4;
                ArrayList arrayList8 = this.f41398D;
                Intrinsics.m18596d(arrayList8);
                Float fValueOf4 = Float.valueOf(((DepthBuySellData) arrayList8.get(i4)).f41394b);
                Intrinsics.m18598f(fValueOf4, "valueOf(...)");
                path.quadTo(f6, fM14171c, f7, m14171c(fValueOf4.floatValue()));
            }
            float f8 = i2;
            float f9 = this.f41419d * f8;
            HashMap map4 = this.f41403I;
            Intrinsics.m18596d(map4);
            int i5 = (int) f9;
            Integer numValueOf = Integer.valueOf(i5);
            ArrayList arrayList9 = this.f41398D;
            Intrinsics.m18596d(arrayList9);
            map4.put(numValueOf, arrayList9.get(i2));
            Float fValueOf5 = Float.valueOf(fM14171c);
            HashMap map5 = this.f41404J;
            Intrinsics.m18596d(map5);
            map5.put(Integer.valueOf(i5), fValueOf5);
            HashMap map6 = this.f41405K;
            Intrinsics.m18596d(map6);
            Integer numValueOf2 = Integer.valueOf(i5);
            ArrayList arrayList10 = this.f41400F;
            Intrinsics.m18596d(arrayList10);
            map6.put(numValueOf2, arrayList10.get(i2));
            ArrayList arrayList11 = this.f41398D;
            Intrinsics.m18596d(arrayList11);
            if (i2 == arrayList11.size() - 1) {
                float f10 = this.f41419d * f8;
                path.quadTo(f10, fM14171c, f10, this.f41427q);
                float f11 = this.f41419d * f8;
                float f12 = this.f41427q;
                path.quadTo(f11, f12, 0.0f, f12);
                path.close();
            }
        }
        ArrayList arrayList12 = this.f41398D;
        Intrinsics.m18596d(arrayList12);
        if (arrayList12.size() > 1) {
            Paint paint2 = this.f41432v;
            Intrinsics.m18596d(paint2);
            canvas.drawPath(path, paint2);
        }
        float f13 = this.f41426p * 1.0f;
        ArrayList arrayList13 = this.f41399E;
        Intrinsics.m18596d(arrayList13);
        if (arrayList13.size() - 1 == 0) {
            size2 = 1;
        } else {
            ArrayList arrayList14 = this.f41399E;
            Intrinsics.m18596d(arrayList14);
            size2 = arrayList14.size() - 1;
        }
        this.f41419d = f13 / size2;
        Path path2 = this.f41397C;
        path2.reset();
        ArrayList arrayList15 = this.f41399E;
        Intrinsics.m18596d(arrayList15);
        int size4 = arrayList15.size();
        for (int i6 = 0; i6 < size4; i6++) {
            if (i6 == 0) {
                float f14 = this.f41426p;
                ArrayList arrayList16 = this.f41399E;
                Intrinsics.m18596d(arrayList16);
                Float fValueOf6 = Float.valueOf(((DepthBuySellData) arrayList16.get(0)).f41394b);
                Intrinsics.m18598f(fValueOf6, "valueOf(...)");
                path2.moveTo(f14, m14171c(fValueOf6.floatValue()));
            }
            ArrayList arrayList17 = this.f41399E;
            Intrinsics.m18596d(arrayList17);
            Float fValueOf7 = Float.valueOf(((DepthBuySellData) arrayList17.get(i6)).f41394b);
            Intrinsics.m18598f(fValueOf7, "valueOf(...)");
            float fM14171c3 = m14171c(fValueOf7.floatValue());
            if (i6 >= 1) {
                int i7 = i6 - 1;
                float f15 = (this.f41419d * i7) + this.f41426p;
                ArrayList arrayList18 = this.f41399E;
                Intrinsics.m18596d(arrayList18);
                Float fValueOf8 = Float.valueOf(((DepthBuySellData) arrayList18.get(i7)).f41394b);
                Intrinsics.m18598f(fValueOf8, "valueOf(...)");
                float fM14171c4 = m14171c(fValueOf8.floatValue());
                float f16 = (this.f41419d * i6) + this.f41426p;
                Paint paint3 = this.f41431u;
                Intrinsics.m18596d(paint3);
                canvas.drawLine(f15, fM14171c4, f16, fM14171c3, paint3);
            }
            ArrayList arrayList19 = this.f41399E;
            Intrinsics.m18596d(arrayList19);
            if (i6 != arrayList19.size() - 1) {
                float f17 = this.f41419d;
                float f18 = this.f41426p;
                float f19 = (i6 * f17) + f18;
                int i8 = i6 + 1;
                float f20 = (f17 * i8) + f18;
                ArrayList arrayList20 = this.f41399E;
                Intrinsics.m18596d(arrayList20);
                Float fValueOf9 = Float.valueOf(((DepthBuySellData) arrayList20.get(i8)).f41394b);
                Intrinsics.m18598f(fValueOf9, "valueOf(...)");
                path2.quadTo(f19, fM14171c3, f20, m14171c(fValueOf9.floatValue()));
            }
            float f21 = i6;
            float f22 = (this.f41419d * f21) + this.f41426p;
            HashMap map7 = this.f41403I;
            Intrinsics.m18596d(map7);
            int i9 = (int) f22;
            Integer numValueOf3 = Integer.valueOf(i9);
            ArrayList arrayList21 = this.f41399E;
            Intrinsics.m18596d(arrayList21);
            map7.put(numValueOf3, arrayList21.get(i6));
            Float fValueOf10 = Float.valueOf(fM14171c3);
            HashMap map8 = this.f41404J;
            Intrinsics.m18596d(map8);
            map8.put(Integer.valueOf(i9), fValueOf10);
            HashMap map9 = this.f41405K;
            Intrinsics.m18596d(map9);
            Integer numValueOf4 = Integer.valueOf(i9);
            ArrayList arrayList22 = this.f41401G;
            Intrinsics.m18596d(arrayList22);
            map9.put(numValueOf4, arrayList22.get(i6));
            ArrayList arrayList23 = this.f41399E;
            Intrinsics.m18596d(arrayList23);
            if (i6 == arrayList23.size() - 1) {
                path2.quadTo(this.f41416a, fM14171c3, (this.f41419d * f21) + this.f41426p, this.f41427q);
                float f23 = this.f41419d * f21;
                float f24 = this.f41426p;
                float f25 = this.f41427q;
                path2.quadTo(f23 + f24, f25, f24, f25);
                path2.close();
            }
        }
        ArrayList arrayList24 = this.f41399E;
        Intrinsics.m18596d(arrayList24);
        if (arrayList24.size() > 1) {
            Paint paint4 = this.f41433w;
            Intrinsics.m18596d(paint4);
            canvas.drawPath(path2, paint4);
        }
        int i10 = this.f41421g;
        for (int i11 = 0; i11 < i10; i11++) {
            String strM14183b = NumberFormaterKt.m14183b(0, 31, ((double) this.f41424n) - ((double) (this.f41425o * i11)));
            float f26 = this.f41416a;
            float fM8746x = AbstractC1610a.m8746x(this.f41427q, this.f41421g, i11, 30);
            Paint paint5 = this.f41429s;
            Intrinsics.m18596d(paint5);
            canvas.drawText(strM14183b, f26, fM8746x, paint5);
        }
        Float[] fArr = this.f41406L;
        if (fArr == null) {
            Intrinsics.m18606n("mBottomPrice");
            throw null;
        }
        int length = fArr.length;
        int i12 = (this.f41420f / 2) + this.f41427q + 10;
        if (length > 0 && (f = fArr[0]) != null) {
            String strM14170b = m14170b(f.floatValue());
            Paint paint6 = this.f41429s;
            Intrinsics.m18596d(paint6);
            paint6.setColor(-15551634);
            if (this.isShowHighOrLowPrice) {
                Paint paint7 = this.f41429s;
                Intrinsics.m18596d(paint7);
                Paint paint8 = this.f41429s;
                Intrinsics.m18596d(paint8);
                canvas.drawText(strM14170b, paint7.measureText(strM14170b), i12, paint8);
            }
            Float[] fArr2 = this.f41406L;
            if (fArr2 == null) {
                Intrinsics.m18606n("mBottomPrice");
                throw null;
            }
            Float f27 = fArr2[1];
            Intrinsics.m18596d(f27);
            String strM14170b2 = m14170b(f27.floatValue());
            float f28 = this.f41426p - 10;
            float f29 = i12;
            Paint paint9 = this.f41429s;
            Intrinsics.m18596d(paint9);
            canvas.drawText(strM14170b2, f28, f29, paint9);
            Paint paint10 = this.f41429s;
            Intrinsics.m18596d(paint10);
            paint10.setColor(-2410165);
            Float[] fArr3 = this.f41406L;
            if (fArr3 == null) {
                Intrinsics.m18606n("mBottomPrice");
                throw null;
            }
            Float f30 = fArr3[2];
            Intrinsics.m18596d(f30);
            String strM14170b3 = m14170b(f30.floatValue());
            float f31 = this.f41426p;
            Paint paint11 = this.f41429s;
            Intrinsics.m18596d(paint11);
            float fMeasureText = paint11.measureText(strM14170b3) + f31 + 10;
            Paint paint12 = this.f41429s;
            Intrinsics.m18596d(paint12);
            canvas.drawText(strM14170b3, fMeasureText, f29, paint12);
            if (this.isShowHighOrLowPrice) {
                Float[] fArr4 = this.f41406L;
                if (fArr4 == null) {
                    Intrinsics.m18606n("mBottomPrice");
                    throw null;
                }
                Float f32 = fArr4[3];
                Intrinsics.m18596d(f32);
                String strM14170b4 = m14170b(f32.floatValue());
                float f33 = this.f41416a;
                Paint paint13 = this.f41429s;
                Intrinsics.m18596d(paint13);
                canvas.drawText(strM14170b4, f33, f29, paint13);
            }
        }
        Paint paint14 = this.f41429s;
        Intrinsics.m18596d(paint14);
        paint14.setColor(-8089956);
        if (this.f41423j) {
            HashMap map10 = this.f41403I;
            Intrinsics.m18596d(map10);
            Iterator it = map10.keySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    Object next = it.next();
                    Intrinsics.m18598f(next, "next(...)");
                    int iIntValue = ((Number) next).intValue();
                    int i13 = this.f41428r;
                    if (iIntValue == i13) {
                        m14169a(canvas, i13);
                        break;
                    }
                } else {
                    int i14 = this.f41428r;
                    HashMap map11 = this.f41403I;
                    Intrinsics.m18596d(map11);
                    int i15 = Integer.MAX_VALUE;
                    for (Object obj : map11.keySet()) {
                        Intrinsics.m18598f(obj, "next(...)");
                        int iIntValue2 = ((Number) obj).intValue();
                        int iAbs = Math.abs(iIntValue2 - i14);
                        if (iAbs < i15) {
                            i = iIntValue2;
                            i15 = iAbs;
                        }
                    }
                    m14169a(canvas, i);
                }
            }
        }
        canvas.restore();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f41416a = i;
        this.f41426p = (i / 2) - 1;
        this.f41427q = i2 - this.f41420f;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        Intrinsics.m18599g(event, "event");
        this.f41414T.onTouchEvent(event);
        this.f41428r = (int) event.getX();
        int action = event.getAction() & 255;
        if (action == 0) {
            this.f41407M = true;
            this.f41423j = true;
        } else if (action == 1) {
            this.f41407M = false;
            this.f41408N = false;
            this.f41423j = false;
            invalidate();
        } else if (action != 2) {
            if (action == 3) {
                this.f41407M = false;
                this.f41408N = false;
            }
        } else if (event.getPointerCount() == 1) {
            invalidate();
        }
        return true;
    }

    public final void setMPriceLimit(int i) {
        this.mPriceLimit = i;
    }

    public final void setShowHighOrLowPrice(boolean z2) {
        this.isShowHighOrLowPrice = z2;
    }

    public final void setPriTradePost(int priTradePost) {
    }
}
