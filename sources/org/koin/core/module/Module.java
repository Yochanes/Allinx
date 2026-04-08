package org.koin.core.module;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.BeanDefinitionKt;
import org.koin.core.instance.InstanceFactory;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@KoinDslMarker
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lorg/koin/core/module/Module;", "", "koin-core"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class Module {

    /* JADX INFO: renamed from: a */
    public final String f58229a;

    /* JADX INFO: renamed from: b */
    public final HashSet f58230b;

    /* JADX INFO: renamed from: c */
    public final HashMap f58231c;

    /* JADX INFO: renamed from: d */
    public final HashSet f58232d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f58233e;

    public Module() {
        String string = UUID.randomUUID().toString();
        Intrinsics.m18598f(string, "toString(...)");
        this.f58229a = string;
        this.f58230b = new HashSet();
        this.f58231c = new HashMap();
        this.f58232d = new HashSet();
        this.f58233e = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    public final void m21809a(InstanceFactory instanceFactory) {
        BeanDefinition beanDefinition = instanceFactory.f58216a;
        String mapping = BeanDefinitionKt.m21803a(beanDefinition.f58202b, beanDefinition.f58201a);
        Intrinsics.m18599g(mapping, "mapping");
        this.f58231c.put(mapping, instanceFactory);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && Module.class == obj.getClass() && Intrinsics.m18594b(this.f58229a, ((Module) obj).f58229a);
    }

    public final int hashCode() {
        return this.f58229a.hashCode();
    }
}
