package kotlinx.serialization.internal;

import com.google.android.material.color.AbstractC3808a;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, m18302d2 = {"Lkotlinx/serialization/internal/ClassValueCache;", "T", "Lkotlinx/serialization/internal/SerializerCache;", "kotlinx-serialization-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
final class ClassValueCache<T> implements SerializerCache<T> {

    /* JADX INFO: renamed from: a */
    public final Function1 f56664a;

    /* JADX INFO: renamed from: b */
    public final ClassValueReferences f56665b = new ClassValueReferences();

    public ClassValueCache(Function1 function1) {
        this.f56664a = function1;
    }

    @Override // kotlinx.serialization.internal.SerializerCache
    /* JADX INFO: renamed from: a */
    public final KSerializer mo20999a(KClass kClass) {
        Object objM14508a = AbstractC3808a.m14508a(this.f56665b, JvmClassMappingKt.m18572b(kClass));
        Intrinsics.m18598f(objM14508a, "get(...)");
        MutableSoftReference mutableSoftReference = (MutableSoftReference) objM14508a;
        Object objM21005a = mutableSoftReference.f56724a.get();
        if (objM21005a == null) {
            objM21005a = mutableSoftReference.m21005a(new ClassValueCache$get$$inlined$getOrSet$1(this, kClass));
        }
        return ((CacheEntry) objM21005a).f56657a;
    }
}
