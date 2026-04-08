package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class RuntimeModuleData {

    /* JADX INFO: renamed from: a */
    public final DeserializationComponents f52627a;

    /* JADX INFO: renamed from: b */
    public final PackagePartScopeCache f52628b;

    /* JADX INFO: compiled from: Proguard */
    public static final class Companion {
    }

    public RuntimeModuleData(DeserializationComponents deserializationComponents, PackagePartScopeCache packagePartScopeCache) {
        this.f52627a = deserializationComponents;
        this.f52628b = packagePartScopeCache;
    }
}
