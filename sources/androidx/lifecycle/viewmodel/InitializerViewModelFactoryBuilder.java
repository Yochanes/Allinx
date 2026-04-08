package androidx.lifecycle.viewmodel;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/lifecycle/viewmodel/InitializerViewModelFactoryBuilder;", "", "lifecycle-viewmodel_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@ViewModelFactoryDsl
public final class InitializerViewModelFactoryBuilder {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f25040a = new LinkedHashMap();

    /* JADX INFO: renamed from: a */
    public final void m9188a(KClass clazz, Function1 initializer) {
        Intrinsics.m18599g(clazz, "clazz");
        Intrinsics.m18599g(initializer, "initializer");
        LinkedHashMap linkedHashMap = this.f25040a;
        if (!linkedHashMap.containsKey(clazz)) {
            linkedHashMap.put(clazz, new ViewModelInitializer(clazz, initializer));
            return;
        }
        throw new IllegalArgumentException(("A `initializer` with the same `clazz` has already been added: " + clazz.mo18587c() + '.').toString());
    }

    /* JADX INFO: renamed from: b */
    public final InitializerViewModelFactory m9189b() {
        Collection initializers = this.f25040a.values();
        Intrinsics.m18599g(initializers, "initializers");
        ViewModelInitializer[] viewModelInitializerArr = (ViewModelInitializer[]) initializers.toArray(new ViewModelInitializer[0]);
        return new InitializerViewModelFactory((ViewModelInitializer[]) Arrays.copyOf(viewModelInitializerArr, viewModelInitializerArr.length));
    }
}
