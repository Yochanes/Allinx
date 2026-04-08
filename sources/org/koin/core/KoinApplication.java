package org.koin.core;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.error.DefinitionOverrideException;
import org.koin.core.logger.Level;
import org.koin.core.logger.Logger;
import org.koin.core.module.KoinApplicationDslMarker;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lorg/koin/core/KoinApplication;", "", "Companion", "koin-core"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@KoinApplicationDslMarker
@SourceDebugExtension
public final class KoinApplication {

    /* JADX INFO: renamed from: a */
    public final Koin f58197a = new Koin();

    /* JADX INFO: renamed from: b */
    public final boolean f58198b = true;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lorg/koin/core/KoinApplication$Companion;", "", "koin-core"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: renamed from: a */
    public final void m21799a(List modules) throws DefinitionOverrideException {
        Intrinsics.m18599g(modules, "modules");
        Koin koin = this.f58197a;
        Logger logger = koin.f58196c;
        Level level = Level.f58222b;
        boolean zM21807c = logger.m21807c(level);
        boolean z2 = this.f58198b;
        if (!zM21807c) {
            koin.m21798b(modules, z2);
            return;
        }
        long jNanoTime = System.nanoTime();
        koin.m21798b(modules, z2);
        double dDoubleValue = Double.valueOf((System.nanoTime() - jNanoTime) / 1000000.0d).doubleValue();
        int size = koin.f58195b.f58239b.size();
        koin.f58196c.mo21787b(level, "Koin started with " + size + " definitions in " + dDoubleValue + " ms");
    }
}
