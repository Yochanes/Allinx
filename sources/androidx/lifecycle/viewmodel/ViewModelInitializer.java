package androidx.lifecycle.viewmodel;

import androidx.lifecycle.ViewModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/lifecycle/viewmodel/ViewModelInitializer;", "Landroidx/lifecycle/ViewModel;", "T", "", "lifecycle-viewmodel_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class ViewModelInitializer<T extends ViewModel> {

    /* JADX INFO: renamed from: a */
    public final KClass f25041a;

    /* JADX INFO: renamed from: b */
    public final Function1 f25042b;

    public ViewModelInitializer(KClass clazz, Function1 initializer) {
        Intrinsics.m18599g(clazz, "clazz");
        Intrinsics.m18599g(initializer, "initializer");
        this.f25041a = clazz;
        this.f25042b = initializer;
    }
}
