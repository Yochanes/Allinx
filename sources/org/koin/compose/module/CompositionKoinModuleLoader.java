package org.koin.compose.module;

import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.koin.core.annotation.KoinExperimentalAPI;
import org.koin.core.annotation.KoinInternalApi;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lorg/koin/compose/module/CompositionKoinModuleLoader;", "Landroidx/compose/runtime/RememberObserver;", "koin-compose"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@KoinExperimentalAPI
@KoinInternalApi
public final class CompositionKoinModuleLoader implements RememberObserver {
    @Override // androidx.compose.runtime.RememberObserver
    public final void onAbandoned() {
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onForgotten() {
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onRemembered() {
    }
}
