package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public final class ClassValueCache$get$$inlined$getOrSet$1 implements Function0<Object> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ClassValueCache f56666a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ KClass f56667b;

    public ClassValueCache$get$$inlined$getOrSet$1(ClassValueCache classValueCache, KClass kClass) {
        this.f56666a = classValueCache;
        this.f56667b = kClass;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new CacheEntry((KSerializer) this.f56666a.f56664a.invoke(this.f56667b));
    }
}
