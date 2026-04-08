package androidx.lifecycle;

import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/lifecycle/AbstractSavedStateViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$OnRequeryFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "lifecycle-viewmodel-savedstate_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public abstract class AbstractSavedStateViewModelFactory extends ViewModelProvider.OnRequeryFactory implements ViewModelProvider.Factory {
    /* JADX INFO: renamed from: b */
    public abstract ViewModel mo9110b(String str, Class cls, SavedStateHandle savedStateHandle);

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final ViewModel create(Class cls, CreationExtras extras) {
        Intrinsics.m18599g(extras, "extras");
        String str = (String) extras.mo9187a(ViewModelProvider.f25005b);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        mo9110b(str, cls, SavedStateHandleSupport.m9165a(extras));
        throw null;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final ViewModel create(Class modelClass) {
        Intrinsics.m18599g(modelClass, "modelClass");
        if (modelClass.getCanonicalName() != null) {
            throw new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.ViewModelProvider.OnRequeryFactory
    /* JADX INFO: renamed from: a */
    public final void mo9109a(ViewModel viewModel) {
    }
}
