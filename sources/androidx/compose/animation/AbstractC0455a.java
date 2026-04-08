package androidx.compose.animation;

import androidx.compose.p013ui.focus.FocusRequester;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.drawscope.CanvasDrawScope$drawContext$1;
import androidx.compose.p013ui.input.key.Key_androidKt;
import androidx.compose.p013ui.internal.InlineClassHelperKt;
import androidx.compose.p013ui.layout.Measurable;
import androidx.compose.p013ui.text.TextStyle;
import androidx.compose.p013ui.unit.C1338Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RememberedCoroutineScope;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KMutableProperty1;

/* JADX INFO: renamed from: androidx.compose.animation.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0455a {
    /* JADX INFO: renamed from: A */
    public static void m2222A(int i, HashMap map, String str, int i2, String str2) {
        map.put(str, Integer.valueOf(i));
        map.put(str2, Integer.valueOf(i2));
    }

    /* JADX INFO: renamed from: B */
    public static void m2223B(long j, String str, StringBuilder sb) {
        sb.append((Object) Color.m5187i(j));
        sb.append(str);
    }

    /* JADX INFO: renamed from: C */
    public static void m2224C(CanvasDrawScope$drawContext$1 canvasDrawScope$drawContext$1, long j) {
        canvasDrawScope$drawContext$1.m5355a().mo5106r();
        canvasDrawScope$drawContext$1.m5362h(j);
    }

    /* JADX INFO: renamed from: D */
    public static int m2225D(List list, int i, int i2) {
        return (list.size() * i) + i2;
    }

    /* JADX INFO: renamed from: a */
    public static int m2226a(int i, float f, int i2) {
        return (Float.hashCode(f) + i) * i2;
    }

    /* JADX INFO: renamed from: b */
    public static int m2227b(int i, int i2, double d) {
        return (Double.hashCode(d) + i) * i2;
    }

    /* JADX INFO: renamed from: c */
    public static int m2228c(int i, int i2, int i3) {
        return (Integer.hashCode(i) + i2) * i3;
    }

    /* JADX INFO: renamed from: d */
    public static int m2229d(int i, int i2, TextStyle textStyle) {
        return (textStyle.hashCode() + i) * i2;
    }

    /* JADX INFO: renamed from: e */
    public static int m2230e(int i, int i2, boolean z2) {
        return (Boolean.hashCode(z2) + i) * i2;
    }

    /* JADX INFO: renamed from: f */
    public static int m2231f(long j, int i, int i2) {
        return (Long.hashCode(j) + i) * i2;
    }

    /* JADX INFO: renamed from: g */
    public static int m2232g(Measurable measurable, long j, ArrayList arrayList, int i, int i2) {
        arrayList.add(measurable.mo5611P(j));
        return i + i2;
    }

    /* JADX INFO: renamed from: h */
    public static int m2233h(List list, int i, int i2) {
        return (list.hashCode() + i) * i2;
    }

    /* JADX INFO: renamed from: i */
    public static ProvidedValue m2234i(long j, DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal) {
        return dynamicProvidableCompositionLocal.mo4359b(new Color(j));
    }

    /* JADX INFO: renamed from: j */
    public static RememberedCoroutineScope m2235j(CoroutineContext coroutineContext, ComposerImpl composerImpl) {
        RememberedCoroutineScope rememberedCoroutineScope = new RememberedCoroutineScope(coroutineContext);
        composerImpl.mo4214G(rememberedCoroutineScope);
        return rememberedCoroutineScope;
    }

    /* JADX INFO: renamed from: k */
    public static FocusRequester m2236k(ComposerImpl composerImpl) {
        FocusRequester focusRequester = new FocusRequester();
        composerImpl.mo4214G(focusRequester);
        return focusRequester;
    }

    /* JADX INFO: renamed from: l */
    public static String m2237l(int i, int i2, String str, String str2) {
        return str + i + str2 + i2;
    }

    /* JADX INFO: renamed from: m */
    public static String m2238m(long j, String str) {
        return str + j;
    }

    /* JADX INFO: renamed from: n */
    public static String m2239n(StringBuilder sb, double d, char c2) {
        sb.append(d);
        sb.append(c2);
        return sb.toString();
    }

    /* JADX INFO: renamed from: o */
    public static String m2240o(StringBuilder sb, long j, char c2) {
        sb.append(j);
        sb.append(c2);
        return sb.toString();
    }

    /* JADX INFO: renamed from: p */
    public static String m2241p(StringBuilder sb, String str, char c2) {
        sb.append(str);
        sb.append(c2);
        return sb.toString();
    }

    /* JADX INFO: renamed from: q */
    public static String m2242q(StringBuilder sb, List list, char c2) {
        sb.append(list);
        sb.append(c2);
        return sb.toString();
    }

    /* JADX INFO: renamed from: r */
    public static String m2243r(StringBuilder sb, boolean z2, char c2) {
        sb.append(z2);
        sb.append(c2);
        return sb.toString();
    }

    /* JADX INFO: renamed from: s */
    public static StringBuilder m2244s(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    /* JADX INFO: renamed from: t */
    public static KotlinNothingValueException m2245t(Object obj) {
        ResultKt.m18313b(obj);
        return new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: u */
    public static KotlinNothingValueException m2246u(String str) {
        InlineClassHelperKt.m5598c(str);
        return new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: v */
    public static KMutableProperty1 m2247v(Class cls, String str, String str2, int i, ReflectionFactory reflectionFactory) {
        return reflectionFactory.mo18615e(new MutablePropertyReference1Impl(cls, str, str2, i));
    }

    /* JADX INFO: renamed from: w */
    public static void m2248w(float f, String str, StringBuilder sb) {
        sb.append((Object) C1338Dp.m6642b(f));
        sb.append(str);
    }

    /* JADX INFO: renamed from: x */
    public static void m2249x(int i, int i2, int i3, int i4, int i5) {
        Key_androidKt.m5520a(i);
        Key_androidKt.m5520a(i2);
        Key_androidKt.m5520a(i3);
        Key_androidKt.m5520a(i4);
        Key_androidKt.m5520a(i5);
    }

    /* JADX INFO: renamed from: y */
    public static void m2250y(int i, Composer composer, int i2, Function2 function2) {
        composer.mo4214G(Integer.valueOf(i));
        composer.mo4223a(Integer.valueOf(i2), function2);
    }

    /* JADX INFO: renamed from: z */
    public static void m2251z(int i, ComposableLambdaImpl composableLambdaImpl, ComposerImpl composerImpl, boolean z2) {
        composableLambdaImpl.invoke(composerImpl, Integer.valueOf(i));
        composerImpl.m4265W(z2);
    }
}
