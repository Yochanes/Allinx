package androidx.compose.runtime;

import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0003"}, m18302d2 = {"Landroidx/compose/runtime/DoubleState;", "Landroidx/compose/runtime/State;", "", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public interface DoubleState extends State<Double> {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class DefaultImpls {
    }

    /* JADX INFO: renamed from: b */
    double mo4367b();

    @Override // androidx.compose.runtime.State
    /* bridge */ /* synthetic */ default Object getValue() {
        return getValue();
    }

    @Override // androidx.compose.runtime.State
    default Double getValue() {
        return Double.valueOf(mo4367b());
    }
}
