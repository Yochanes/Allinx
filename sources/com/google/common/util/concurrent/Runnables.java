package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible
public final class Runnables {
    private static final Runnable EMPTY_RUNNABLE = new RunnableC45621();

    private Runnables() {
    }

    public static Runnable doNothing() {
        return EMPTY_RUNNABLE;
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.Runnables$1 */
    /* JADX INFO: compiled from: Proguard */
    public class RunnableC45621 implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
        }
    }
}
