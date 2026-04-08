package org.koin.core.logger;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lorg/koin/core/logger/EmptyLogger;", "Lorg/koin/core/logger/Logger;", "koin-core"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class EmptyLogger extends Logger {
    @Override // org.koin.core.logger.Logger
    /* JADX INFO: renamed from: b */
    public final void mo21787b(Level level, String msg) {
        Intrinsics.m18599g(msg, "msg");
    }
}
