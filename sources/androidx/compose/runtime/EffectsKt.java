package androidx.compose.runtime;

import androidx.compose.runtime.Composer;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"runtime_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class EffectsKt {

    /* JADX INFO: renamed from: a */
    public static final DisposableEffectScope f16359a = new DisposableEffectScope();

    /* JADX INFO: renamed from: a */
    public static final void m4368a(Object obj, Object obj2, Object obj3, Function1 function1, Composer composer) {
        boolean zMo4220M = composer.mo4220M(obj) | composer.mo4220M(obj2) | composer.mo4220M(obj3);
        Object objMo4229g = composer.mo4229g();
        if (zMo4220M || objMo4229g == Composer.Companion.f16228a) {
            objMo4229g = new DisposableEffectImpl(function1);
            composer.mo4214G(objMo4229g);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m4369b(Object obj, Object obj2, Function1 function1, Composer composer) {
        boolean zMo4220M = composer.mo4220M(obj) | composer.mo4220M(obj2);
        Object objMo4229g = composer.mo4229g();
        if (zMo4220M || objMo4229g == Composer.Companion.f16228a) {
            objMo4229g = new DisposableEffectImpl(function1);
            composer.mo4214G(objMo4229g);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m4370c(Object obj, Function1 function1, Composer composer) {
        boolean zMo4220M = composer.mo4220M(obj);
        Object objMo4229g = composer.mo4229g();
        if (zMo4220M || objMo4229g == Composer.Companion.f16228a) {
            objMo4229g = new DisposableEffectImpl(function1);
            composer.mo4214G(objMo4229g);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m4371d(Object[] objArr, Function1 function1, Composer composer) {
        boolean zMo4220M = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            zMo4220M |= composer.mo4220M(obj);
        }
        Object objMo4229g = composer.mo4229g();
        if (zMo4220M || objMo4229g == Composer.Companion.f16228a) {
            composer.mo4214G(new DisposableEffectImpl(function1));
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m4372e(Composer composer, Object obj, Function2 function2) {
        CoroutineContext coroutineContextMo4208A = composer.mo4208A();
        boolean zMo4220M = composer.mo4220M(obj);
        Object objMo4229g = composer.mo4229g();
        if (zMo4220M || objMo4229g == Composer.Companion.f16228a) {
            objMo4229g = new LaunchedEffectImpl(coroutineContextMo4208A, function2);
            composer.mo4214G(objMo4229g);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m4373f(Object obj, Boolean bool, Object obj2, Function2 function2, Composer composer) {
        CoroutineContext coroutineContextMo4208A = composer.mo4208A();
        boolean zMo4220M = composer.mo4220M(obj) | composer.mo4220M(bool) | composer.mo4220M(obj2);
        Object objMo4229g = composer.mo4229g();
        if (zMo4220M || objMo4229g == Composer.Companion.f16228a) {
            objMo4229g = new LaunchedEffectImpl(coroutineContextMo4208A, function2);
            composer.mo4214G(objMo4229g);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m4374g(Object obj, Object obj2, Function2 function2, Composer composer) {
        CoroutineContext coroutineContextMo4208A = composer.mo4208A();
        boolean zMo4220M = composer.mo4220M(obj) | composer.mo4220M(obj2);
        Object objMo4229g = composer.mo4229g();
        if (zMo4220M || objMo4229g == Composer.Companion.f16228a) {
            objMo4229g = new LaunchedEffectImpl(coroutineContextMo4208A, function2);
            composer.mo4214G(objMo4229g);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m4375h(Object[] objArr, Function2 function2, Composer composer) {
        CoroutineContext coroutineContextMo4208A = composer.mo4208A();
        boolean zMo4220M = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            zMo4220M |= composer.mo4220M(obj);
        }
        Object objMo4229g = composer.mo4229g();
        if (zMo4220M || objMo4229g == Composer.Companion.f16228a) {
            composer.mo4214G(new LaunchedEffectImpl(coroutineContextMo4208A, function2));
        }
    }
}
