package androidx.lifecycle;

import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"androidx/lifecycle/SavedStateHandleSupport$savedStateHandlesVM$1", "Landroidx/lifecycle/ViewModelProvider$Factory;", "lifecycle-viewmodel-savedstate_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class SavedStateHandleSupport$savedStateHandlesVM$1 implements ViewModelProvider.Factory {
    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final ViewModel create(KClass modelClass, CreationExtras creationExtras) {
        Intrinsics.m18599g(modelClass, "modelClass");
        return new SavedStateHandlesVM();
    }
}
