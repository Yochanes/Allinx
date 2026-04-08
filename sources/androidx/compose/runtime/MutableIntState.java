package androidx.compose.runtime;

import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\bg\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0003"}, m18302d2 = {"Landroidx/compose/runtime/MutableIntState;", "Landroidx/compose/runtime/IntState;", "Landroidx/compose/runtime/MutableState;", "", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public interface MutableIntState extends IntState, MutableState<Integer> {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class DefaultImpls {
    }

    @Override // androidx.compose.runtime.IntState
    /* JADX INFO: renamed from: f */
    int mo4383f();

    @Override // androidx.compose.runtime.IntState, androidx.compose.runtime.State
    /* JADX INFO: renamed from: getValue */
    /* bridge */ /* synthetic */ default Object getF20325a() {
        return getF20325a();
    }

    /* JADX INFO: renamed from: q */
    void mo4393q(int i);

    @Override // androidx.compose.runtime.MutableState
    /* bridge */ /* synthetic */ default void setValue(Object obj) {
        m4394w(((Number) obj).intValue());
    }

    /* JADX INFO: renamed from: w */
    default void m4394w(int i) {
        mo4393q(i);
    }

    @Override // androidx.compose.runtime.IntState, androidx.compose.runtime.State
    /* JADX INFO: renamed from: getValue */
    default Integer getF20325a() {
        return Integer.valueOf(mo4383f());
    }
}
