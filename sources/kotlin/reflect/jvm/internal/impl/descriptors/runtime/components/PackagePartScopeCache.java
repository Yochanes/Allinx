package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension
public final class PackagePartScopeCache {

    /* JADX INFO: renamed from: a */
    public final DeserializedDescriptorResolver f52617a;

    /* JADX INFO: renamed from: b */
    public final ReflectKotlinClassFinder f52618b;

    /* JADX INFO: renamed from: c */
    public final ConcurrentHashMap f52619c = new ConcurrentHashMap();

    public PackagePartScopeCache(ReflectKotlinClassFinder reflectKotlinClassFinder, DeserializedDescriptorResolver deserializedDescriptorResolver) {
        this.f52617a = deserializedDescriptorResolver;
        this.f52618b = reflectKotlinClassFinder;
    }
}
