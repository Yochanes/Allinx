package org.koin.androidx.viewmodel.factory;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.koin.core.annotation.KoinInternalApi;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003¨\u0006\u0004"}, m18302d2 = {"Lorg/koin/androidx/viewmodel/factory/DefaultViewModelFactory;", "Landroidx/lifecycle/ViewModel;", "T", "Landroidx/lifecycle/ViewModelProvider$Factory;", "koin-android_release"}, m18303k = 1, m18304mv = {1, 5, 1}, m18306xi = 48)
@KoinInternalApi
public final class DefaultViewModelFactory<T extends ViewModel> implements ViewModelProvider.Factory {
    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final ViewModel create(Class modelClass) {
        Intrinsics.m18599g(modelClass, "modelClass");
        throw null;
    }
}
