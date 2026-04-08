package org.koin.core;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.error.DefinitionOverrideException;
import org.koin.core.instance.InstanceContext;
import org.koin.core.instance.InstanceFactory;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.logger.EmptyLogger;
import org.koin.core.logger.Level;
import org.koin.core.logger.Logger;
import org.koin.core.module.Module;
import org.koin.core.module.ModuleKt;
import org.koin.core.registry.InstanceRegistry;
import org.koin.core.registry.ScopeRegistry;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lorg/koin/core/Koin;", "", "koin-core"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class Koin {

    /* JADX INFO: renamed from: a */
    public final ScopeRegistry f58194a = new ScopeRegistry(this);

    /* JADX INFO: renamed from: b */
    public final InstanceRegistry f58195b = new InstanceRegistry(this);

    /* JADX INFO: renamed from: c */
    public Logger f58196c;

    public Koin() {
        Intrinsics.m18599g(this, "_koin");
        new ConcurrentHashMap();
        new HashMap();
        this.f58196c = new EmptyLogger(Level.f58225f);
    }

    /* JADX INFO: renamed from: a */
    public final void m21797a() {
        this.f58196c.m21806a("Create eager instances ...");
        long jNanoTime = System.nanoTime();
        InstanceRegistry instanceRegistry = this.f58195b;
        HashMap map = instanceRegistry.f58240c;
        Collection collectionValues = map.values();
        Intrinsics.m18598f(collectionValues, "<get-values>(...)");
        if (!collectionValues.isEmpty()) {
            Koin koin = instanceRegistry.f58238a;
            InstanceContext instanceContext = new InstanceContext(koin.f58196c, koin.f58194a.f58245d, null);
            Iterator it = collectionValues.iterator();
            while (it.hasNext()) {
                ((SingleInstanceFactory) it.next()).mo21804b(instanceContext);
            }
        }
        map.clear();
        double dDoubleValue = Double.valueOf((System.nanoTime() - jNanoTime) / 1000000.0d).doubleValue();
        this.f58196c.m21806a("Koin created eager instances in " + dDoubleValue + " ms");
    }

    /* JADX INFO: renamed from: b */
    public final void m21798b(List modules, boolean z2) throws DefinitionOverrideException {
        Intrinsics.m18599g(modules, "modules");
        LinkedHashSet<Module> linkedHashSet = new LinkedHashSet();
        ModuleKt.m21810a(modules, linkedHashSet);
        InstanceRegistry instanceRegistry = this.f58195b;
        instanceRegistry.getClass();
        for (Module module : linkedHashSet) {
            for (Map.Entry entry : module.f58231c.entrySet()) {
                String mapping = (String) entry.getKey();
                InstanceFactory factory = (InstanceFactory) entry.getValue();
                Intrinsics.m18599g(mapping, "mapping");
                Intrinsics.m18599g(factory, "factory");
                ConcurrentHashMap concurrentHashMap = instanceRegistry.f58239b;
                boolean zContainsKey = concurrentHashMap.containsKey(mapping);
                BeanDefinition beanDefinition = factory.f58216a;
                Koin koin = instanceRegistry.f58238a;
                if (zContainsKey) {
                    if (!z2) {
                        String msg = "Already existing definition for " + beanDefinition + " at " + mapping;
                        Intrinsics.m18599g(msg, "msg");
                        throw new DefinitionOverrideException(msg);
                    }
                    Logger logger = koin.f58196c;
                    String msg2 = "(+) override index '" + mapping + "' -> '" + beanDefinition + '\'';
                    logger.getClass();
                    Intrinsics.m18599g(msg2, "msg");
                    logger.m21808d(Level.f58223c, msg2);
                }
                koin.f58196c.m21806a("(+) index '" + mapping + "' -> '" + beanDefinition + '\'');
                concurrentHashMap.put(mapping, factory);
            }
            for (SingleInstanceFactory singleInstanceFactory : module.f58230b) {
                instanceRegistry.f58240c.put(Integer.valueOf(singleInstanceFactory.f58216a.hashCode()), singleInstanceFactory);
            }
        }
        ScopeRegistry scopeRegistry = this.f58194a;
        scopeRegistry.getClass();
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            scopeRegistry.f58243b.addAll(((Module) it.next()).f58232d);
        }
    }
}
