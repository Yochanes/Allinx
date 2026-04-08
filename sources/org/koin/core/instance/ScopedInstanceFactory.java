package org.koin.core.instance;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, m18302d2 = {"Lorg/koin/core/instance/ScopedInstanceFactory;", "T", "Lorg/koin/core/instance/InstanceFactory;", "koin-core"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class ScopedInstanceFactory<T> extends InstanceFactory<T> {
    @Override // org.koin.core.instance.InstanceFactory
    /* JADX INFO: renamed from: a */
    public final Object mo21805a(InstanceContext instanceContext) {
        String str = instanceContext.f58214b.f58247b;
        throw null;
    }

    @Override // org.koin.core.instance.InstanceFactory
    /* JADX INFO: renamed from: b */
    public final Object mo21804b(InstanceContext instanceContext) {
        Scope scope = instanceContext.f58214b;
        Qualifier qualifier = scope.f58246a;
        BeanDefinition beanDefinition = this.f58216a;
        if (Intrinsics.m18594b(qualifier, beanDefinition.f58201a)) {
            ScopedInstanceFactory$get$1 scopedInstanceFactory$get$1 = new ScopedInstanceFactory$get$1(this, instanceContext);
            synchronized (this) {
                scopedInstanceFactory$get$1.invoke();
            }
            throw null;
        }
        throw new IllegalStateException(("Wrong Scope: trying to open instance for " + scope.f58247b + " in " + beanDefinition).toString());
    }
}
