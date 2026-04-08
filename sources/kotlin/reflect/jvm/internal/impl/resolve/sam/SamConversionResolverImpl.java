package kotlin.reflect.jvm.internal.impl.resolve.sam;

import kotlin.reflect.jvm.internal.impl.storage.CacheWithNullableValues;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class SamConversionResolverImpl implements SamConversionResolver {

    /* JADX INFO: renamed from: a */
    public final CacheWithNullableValues f54417a;

    public SamConversionResolverImpl(LockBasedStorageManager lockBasedStorageManager) {
        this.f54417a = lockBasedStorageManager.m20081f();
    }
}
