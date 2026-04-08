package org.koin.compose.scope;

import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.koin.core.annotation.KoinExperimentalAPI;
import org.koin.core.annotation.KoinInternalApi;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lorg/koin/compose/scope/CompositionKoinScopeLoader;", "Landroidx/compose/runtime/RememberObserver;", "koin-compose"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@KoinExperimentalAPI
@KoinInternalApi
public final class CompositionKoinScopeLoader implements RememberObserver {
    /* JADX INFO: renamed from: a */
    public final void m21796a() {
        throw null;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onAbandoned() {
        m21796a();
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onForgotten() {
        m21796a();
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onRemembered() {
    }
}
