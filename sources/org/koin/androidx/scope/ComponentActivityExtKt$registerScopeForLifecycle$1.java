package org.koin.androidx.scope;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"org/koin/androidx/scope/ComponentActivityExtKt$registerScopeForLifecycle$1", "Landroidx/lifecycle/DefaultLifecycleObserver;", "koin-android_release"}, m18303k = 1, m18304mv = {1, 5, 1}, m18306xi = 48)
public final class ComponentActivityExtKt$registerScopeForLifecycle$1 implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Scope f58181a;

    public ComponentActivityExtKt$registerScopeForLifecycle$1(Scope scope) {
        this.f58181a = scope;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        this.f58181a.m21811a();
    }
}
