package androidx.compose.runtime;

import androidx.compose.runtime.internal.ComposableLambdaImpl;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, m18302d2 = {"Landroidx/compose/runtime/ReusableComposition;", "Landroidx/compose/runtime/Composition;", "Landroidx/compose/runtime/CompositionImpl;", "Landroidx/compose/runtime/PausableComposition;", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public interface ReusableComposition extends Composition {
    void deactivate();

    /* JADX INFO: renamed from: t */
    void mo4345t(ComposableLambdaImpl composableLambdaImpl);
}
