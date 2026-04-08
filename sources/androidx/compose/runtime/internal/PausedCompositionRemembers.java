package androidx.compose.runtime.internal;

import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.RememberObserverHolder;
import androidx.compose.runtime.collection.MutableVector;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/runtime/internal/PausedCompositionRemembers;", "Landroidx/compose/runtime/RememberObserver;", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class PausedCompositionRemembers implements RememberObserver {

    /* JADX INFO: renamed from: a */
    public final Set f16930a;

    /* JADX INFO: renamed from: b */
    public final MutableVector f16931b = new MutableVector(new RememberObserverHolder[16], 0);

    public PausedCompositionRemembers(Set set) {
        this.f16930a = set;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onRemembered() {
        MutableVector mutableVector = this.f16931b;
        Object[] objArr = mutableVector.f16734a;
        int i = mutableVector.f16736c;
        for (int i2 = 0; i2 < i; i2++) {
            RememberObserver rememberObserver = ((RememberObserverHolder) objArr[i2]).f16547a;
            this.f16930a.remove(rememberObserver);
            rememberObserver.onRemembered();
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onAbandoned() {
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onForgotten() {
    }
}
