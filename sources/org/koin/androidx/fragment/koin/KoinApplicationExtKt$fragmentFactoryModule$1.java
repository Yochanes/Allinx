package org.koin.androidx.fragment.koin;

import androidx.fragment.app.FragmentFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.androidx.fragment.android.KoinFragmentFactory;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.module.Module;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.registry.ScopeRegistry;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m18302d2 = {"<anonymous>", "", "Lorg/koin/core/module/Module;", "invoke"}, m18303k = 3, m18304mv = {1, 5, 1}, m18306xi = 48)
@SourceDebugExtension
public final class KoinApplicationExtKt$fragmentFactoryModule$1 extends Lambda implements Function1<Module, Unit> {

    /* JADX INFO: renamed from: a */
    public static final KoinApplicationExtKt$fragmentFactoryModule$1 f58179a = new KoinApplicationExtKt$fragmentFactoryModule$1(1);

    /* JADX INFO: renamed from: org.koin.androidx.fragment.koin.KoinApplicationExtKt$fragmentFactoryModule$1$1 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m18302d2 = {"<anonymous>", "Landroidx/fragment/app/FragmentFactory;", "Lorg/koin/core/scope/Scope;", "it", "Lorg/koin/core/parameter/ParametersHolder;", "invoke"}, m18303k = 3, m18304mv = {1, 5, 1}, m18306xi = 48)
    final class C63991 extends Lambda implements Function2<Scope, ParametersHolder, FragmentFactory> {

        /* JADX INFO: renamed from: a */
        public static final C63991 f58180a = new C63991(2);

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            Scope single = (Scope) obj;
            ParametersHolder it = (ParametersHolder) obj2;
            Intrinsics.m18599g(single, "$this$single");
            Intrinsics.m18599g(it, "it");
            return new KoinFragmentFactory();
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Module module = (Module) obj;
        Intrinsics.m18599g(module, "$this$module");
        C63991 c63991 = C63991.f58180a;
        Kind kind = Kind.f58207a;
        SingleInstanceFactory singleInstanceFactory = new SingleInstanceFactory(new BeanDefinition(ScopeRegistry.f58241e, Reflection.f51660a.mo18612b(FragmentFactory.class), c63991, kind));
        module.m21809a(singleInstanceFactory);
        new KoinDefinition(module, singleInstanceFactory);
        return Unit.f51459a;
    }
}
