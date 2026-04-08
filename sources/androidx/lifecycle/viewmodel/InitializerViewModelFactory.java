package androidx.lifecycle.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/lifecycle/viewmodel/InitializerViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "lifecycle-viewmodel_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class InitializerViewModelFactory implements ViewModelProvider.Factory {

    /* JADX INFO: renamed from: a */
    public final ViewModelInitializer[] f25039a;

    public InitializerViewModelFactory(ViewModelInitializer... initializers) {
        Intrinsics.m18599g(initializers, "initializers");
        this.f25039a = initializers;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final ViewModel create(Class cls, CreationExtras extras) {
        ViewModel viewModel;
        ViewModelInitializer viewModelInitializer;
        Function1 function1;
        Intrinsics.m18599g(extras, "extras");
        KClass kClassM18575e = JvmClassMappingKt.m18575e(cls);
        ViewModelInitializer[] viewModelInitializerArr = this.f25039a;
        ViewModelInitializer[] initializers = (ViewModelInitializer[]) Arrays.copyOf(viewModelInitializerArr, viewModelInitializerArr.length);
        Intrinsics.m18599g(initializers, "initializers");
        int length = initializers.length;
        int i = 0;
        while (true) {
            viewModel = null;
            if (i >= length) {
                viewModelInitializer = null;
                break;
            }
            viewModelInitializer = initializers[i];
            if (Intrinsics.m18594b(viewModelInitializer.f25041a, kClassM18575e)) {
                break;
            }
            i++;
        }
        if (viewModelInitializer != null && (function1 = viewModelInitializer.f25042b) != null) {
            viewModel = (ViewModel) function1.invoke(extras);
        }
        if (viewModel != null) {
            return viewModel;
        }
        throw new IllegalArgumentException(("No initializer set for given class " + kClassM18575e.mo18587c()).toString());
    }
}
