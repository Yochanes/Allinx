package androidx.compose.runtime;

import androidx.compose.runtime.collection.ScatterSetWrapper;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, m18302d2 = {"Landroidx/compose/runtime/ControlledComposition;", "Landroidx/compose/runtime/Composition;", "Landroidx/compose/runtime/CompositionImpl;", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public interface ControlledComposition extends Composition {
    /* JADX INFO: renamed from: b */
    void mo4324b(Object obj);

    /* JADX INFO: renamed from: c */
    void mo4332c(ScatterSetWrapper scatterSetWrapper);

    /* JADX INFO: renamed from: e */
    boolean mo4333e(Set set);

    /* JADX INFO: renamed from: f */
    void mo4334f(ArrayList arrayList);

    /* JADX INFO: renamed from: h */
    void mo4335h();

    void invalidateAll();

    /* JADX INFO: renamed from: k */
    void mo4338k(Function0 function0);

    /* JADX INFO: renamed from: l */
    void mo4339l();

    /* JADX INFO: renamed from: o */
    boolean mo4341o();

    /* JADX INFO: renamed from: p */
    void mo4342p(Object obj);

    /* JADX INFO: renamed from: r */
    void mo4343r();

    /* JADX INFO: renamed from: s */
    void mo4344s();

    /* JADX INFO: renamed from: u */
    boolean mo4346u();
}
