package org.koin.core.registry;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.Koin;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lorg/koin/core/registry/InstanceRegistry;", "", "koin-core"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class InstanceRegistry {

    /* JADX INFO: renamed from: a */
    public final Koin f58238a;

    /* JADX INFO: renamed from: b */
    public final ConcurrentHashMap f58239b;

    /* JADX INFO: renamed from: c */
    public final HashMap f58240c;

    public InstanceRegistry(Koin _koin) {
        Intrinsics.m18599g(_koin, "_koin");
        this.f58238a = _koin;
        this.f58239b = new ConcurrentHashMap();
        this.f58240c = new HashMap();
    }
}
