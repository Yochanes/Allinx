package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Map;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class NullabilityAnnotationStatesImpl<T> implements NullabilityAnnotationStates<T> {

    /* JADX INFO: renamed from: b */
    public final Object f52797b;

    /* JADX INFO: renamed from: c */
    public final MemoizedFunctionToNullable f52798c = new LockBasedStorageManager("Java nullability annotation states").m20083h(new NullabilityAnnotationStatesImpl$cache$1(this));

    public NullabilityAnnotationStatesImpl(Map map) {
        this.f52797b = map;
    }
}
