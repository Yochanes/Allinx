package androidx.compose.runtime;

import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.tooling.CompositionData;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, m18302d2 = {"Landroidx/compose/runtime/Composer;", "", "Companion", "Landroidx/compose/runtime/ComposerImpl;", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public interface Composer {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/runtime/Composer$Companion;", "", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final Composer$Companion$Empty$1 f16228a = new Composer$Companion$Empty$1();
    }

    /* JADX INFO: renamed from: A */
    CoroutineContext mo4208A();

    /* JADX INFO: renamed from: B */
    PersistentCompositionLocalMap mo4209B();

    /* JADX INFO: renamed from: C */
    void mo4210C();

    /* JADX INFO: renamed from: D */
    void mo4211D(RecomposeScope recomposeScope);

    /* JADX INFO: renamed from: E */
    boolean mo4212E(int i, boolean z2);

    /* JADX INFO: renamed from: F */
    void mo4213F();

    /* JADX INFO: renamed from: G */
    void mo4214G(Object obj);

    /* JADX INFO: renamed from: H */
    int getF16244P();

    /* JADX INFO: renamed from: I */
    ComposerImpl.CompositionContextImpl mo4216I();

    /* JADX INFO: renamed from: J */
    void mo4217J();

    /* JADX INFO: renamed from: K */
    void mo4218K();

    /* JADX INFO: renamed from: L */
    void mo4219L();

    /* JADX INFO: renamed from: M */
    boolean mo4220M(Object obj);

    /* JADX INFO: renamed from: N */
    void mo4221N(int i);

    /* JADX INFO: renamed from: O */
    void mo4222O(Function0 function0);

    /* JADX INFO: renamed from: a */
    void mo4223a(Object obj, Function2 function2);

    /* JADX INFO: renamed from: b */
    void mo4224b();

    /* JADX INFO: renamed from: c */
    RecomposeScopeImpl mo4225c();

    /* JADX INFO: renamed from: d */
    default boolean mo4226d(boolean z2) {
        return mo4226d(z2);
    }

    /* JADX INFO: renamed from: e */
    void mo4227e();

    /* JADX INFO: renamed from: f */
    void mo4228f(int i);

    /* JADX INFO: renamed from: g */
    Object mo4229g();

    /* JADX INFO: renamed from: h */
    default boolean mo4230h(float f) {
        return mo4230h(f);
    }

    /* JADX INFO: renamed from: i */
    void mo4231i();

    /* JADX INFO: renamed from: j */
    default boolean mo4232j(int i) {
        return mo4232j(i);
    }

    /* JADX INFO: renamed from: k */
    default boolean mo4233k(long j) {
        return mo4233k(j);
    }

    /* JADX INFO: renamed from: l */
    CompositionData mo4234l();

    /* JADX INFO: renamed from: m */
    default boolean mo4235m(Object obj) {
        return mo4220M(obj);
    }

    /* JADX INFO: renamed from: n */
    boolean getF16243O();

    /* JADX INFO: renamed from: o */
    void mo4237o(Object obj);

    /* JADX INFO: renamed from: p */
    void mo4238p(boolean z2);

    /* JADX INFO: renamed from: q */
    ComposerImpl mo4239q(int i);

    /* JADX INFO: renamed from: r */
    void mo4240r(int i, Object obj);

    /* JADX INFO: renamed from: s */
    void mo4241s();

    /* JADX INFO: renamed from: t */
    boolean mo4242t();

    /* JADX INFO: renamed from: u */
    void mo4243u();

    /* JADX INFO: renamed from: v */
    Applier mo4244v();

    /* JADX INFO: renamed from: w */
    void mo4245w(Function0 function0);

    /* JADX INFO: renamed from: x */
    void mo4246x();

    /* JADX INFO: renamed from: y */
    Object mo4247y(CompositionLocal compositionLocal);

    /* JADX INFO: renamed from: z */
    void mo4248z(Object obj);
}
