package org.aspectj.runtime.internal.cflowstack;

import java.util.Stack;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class ThreadStackFactoryImpl implements ThreadStackFactory {

    /* JADX INFO: compiled from: Proguard */
    public static class ThreadCounterImpl extends ThreadLocal implements ThreadCounter {

        /* JADX INFO: compiled from: Proguard */
        public static class Counter {
        }

        @Override // java.lang.ThreadLocal
        public final Object initialValue() {
            return new Counter();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class ThreadStackImpl extends ThreadLocal implements ThreadStack {
        @Override // java.lang.ThreadLocal
        public final Object initialValue() {
            return new Stack();
        }
    }
}
