package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/compose/runtime/CompositionLocal;", "T", "", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public abstract class CompositionLocal<T> {

    /* JADX INFO: renamed from: a */
    public final LazyValueHolder f16321a;

    public CompositionLocal(Function0 function0) {
        this.f16321a = new LazyValueHolder(function0);
    }

    /* JADX INFO: renamed from: a */
    public ValueHolder mo4352a() {
        return this.f16321a;
    }
}
