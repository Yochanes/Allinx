package com.airbnb.lottie.compose;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import com.airbnb.lottie.LottieComposition;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/airbnb/lottie/compose/LottieCompositionResultImpl;", "Lcom/airbnb/lottie/compose/LottieCompositionResult;", "lottie-compose_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@SourceDebugExtension
public final class LottieCompositionResultImpl implements LottieCompositionResult {

    /* JADX INFO: renamed from: a */
    public final CompletableDeferred f34411a = CompletableDeferredKt.m20548a();

    /* JADX INFO: renamed from: b */
    public final MutableState f34412b = SnapshotStateKt.m4525g(null);

    /* JADX INFO: renamed from: c */
    public final MutableState f34413c = SnapshotStateKt.m4525g(null);

    /* JADX INFO: renamed from: d */
    public final State f34414d = SnapshotStateKt.m4523e(new LottieCompositionResultImpl$isLoading$2(this));

    /* JADX INFO: renamed from: f */
    public final State f34415f = SnapshotStateKt.m4523e(new LottieCompositionResultImpl$isComplete$2(this));

    /* JADX INFO: renamed from: g */
    public final State f34416g = SnapshotStateKt.m4523e(new LottieCompositionResultImpl$isFailure$2(this));

    /* JADX INFO: renamed from: i */
    public final State f34417i = SnapshotStateKt.m4523e(new LottieCompositionResultImpl$isSuccess$2(this));

    @Override // androidx.compose.runtime.State
    /* JADX INFO: renamed from: getValue */
    public final Object getF20325a() {
        return (LottieComposition) ((SnapshotMutableStateImpl) this.f34412b).getF20325a();
    }
}
