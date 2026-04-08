package org.koin.core.context;

import kotlin.Metadata;
import org.koin.core.Koin;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lorg/koin/core/context/GlobalContext;", "Lorg/koin/core/context/KoinContext;", "koin-core"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class GlobalContext implements KoinContext {

    /* JADX INFO: renamed from: a */
    public static final GlobalContext f58199a = new GlobalContext();

    /* JADX INFO: renamed from: b */
    public static Koin f58200b;

    /* JADX INFO: renamed from: a */
    public final Koin m21802a() {
        Koin koin = f58200b;
        if (koin != null) {
            return koin;
        }
        throw new IllegalStateException("KoinApplication has not been started");
    }
}
