package androidx.compose.runtime;

import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\bg\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0003"}, m18302d2 = {"Landroidx/compose/runtime/MutableLongState;", "Landroidx/compose/runtime/LongState;", "Landroidx/compose/runtime/MutableState;", "", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public interface MutableLongState extends LongState, MutableState<Long> {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class DefaultImpls {
    }

    @Override // androidx.compose.runtime.LongState
    /* JADX INFO: renamed from: a */
    long mo4384a();

    @Override // androidx.compose.runtime.LongState, androidx.compose.runtime.State
    /* bridge */ /* synthetic */ default Object getValue() {
        return getValue();
    }

    @Override // androidx.compose.runtime.MutableState
    /* bridge */ /* synthetic */ default void setValue(Object obj) {
        m4396v(((Number) obj).longValue());
    }

    /* JADX INFO: renamed from: u */
    void mo4395u(long j);

    /* JADX INFO: renamed from: v */
    default void m4396v(long j) {
        mo4395u(j);
    }

    @Override // androidx.compose.runtime.LongState, androidx.compose.runtime.State
    default Long getValue() {
        return Long.valueOf(mo4384a());
    }
}
