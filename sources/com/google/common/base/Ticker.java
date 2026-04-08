package com.google.common.base;

import com.google.common.annotations.GwtCompatible;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class Ticker {
    private static final Ticker SYSTEM_TICKER = new C41251();

    /* JADX INFO: renamed from: com.google.common.base.Ticker$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C41251 extends Ticker {
        @Override // com.google.common.base.Ticker
        public long read() {
            return System.nanoTime();
        }
    }

    public static Ticker systemTicker() {
        return SYSTEM_TICKER;
    }

    public abstract long read();
}
