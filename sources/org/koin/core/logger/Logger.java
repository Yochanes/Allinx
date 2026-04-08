package org.koin.core.logger;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lorg/koin/core/logger/Logger;", "", "koin-core"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public abstract class Logger {

    /* JADX INFO: renamed from: a */
    public final Level f58228a;

    public Logger(Level level) {
        Intrinsics.m18599g(level, "level");
        this.f58228a = level;
    }

    /* JADX INFO: renamed from: a */
    public final void m21806a(String msg) {
        Intrinsics.m18599g(msg, "msg");
        m21808d(Level.f58221a, msg);
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo21787b(Level level, String str);

    /* JADX INFO: renamed from: c */
    public final boolean m21807c(Level level) {
        return this.f58228a.compareTo(level) <= 0;
    }

    /* JADX INFO: renamed from: d */
    public final void m21808d(Level level, String msg) {
        Intrinsics.m18599g(msg, "msg");
        if (m21807c(level)) {
            mo21787b(level, msg);
        }
    }
}
