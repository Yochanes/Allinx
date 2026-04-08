package io.reactivex.observers;

import io.reactivex.disposables.Disposable;
import io.reactivex.observers.BaseTestConsumer;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseTestConsumer<T, U extends BaseTestConsumer<T, U>> implements Disposable {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    public static abstract class TestWaitStrategy implements Runnable {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ TestWaitStrategy[] f49288a = {new C59621(), new C59632(), new C59643(), new C59654(), new C59665(), new C59676()};

        /* JADX INFO: Fake field, exist only in values array */
        TestWaitStrategy EF2;

        /* JADX INFO: renamed from: io.reactivex.observers.BaseTestConsumer$TestWaitStrategy$2 */
        /* JADX INFO: compiled from: Proguard */
        public enum C59632 extends TestWaitStrategy {
            public C59632() {
                super("YIELD", 1);
            }

            @Override // java.lang.Runnable
            public final void run() {
                Thread.yield();
            }
        }

        /* JADX INFO: renamed from: io.reactivex.observers.BaseTestConsumer$TestWaitStrategy$3 */
        /* JADX INFO: compiled from: Proguard */
        public enum C59643 extends TestWaitStrategy {
            public C59643() {
                super("SLEEP_1MS", 2);
            }

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        /* JADX INFO: renamed from: io.reactivex.observers.BaseTestConsumer$TestWaitStrategy$4 */
        /* JADX INFO: compiled from: Proguard */
        public enum C59654 extends TestWaitStrategy {
            public C59654() {
                super("SLEEP_10MS", 3);
            }

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        /* JADX INFO: renamed from: io.reactivex.observers.BaseTestConsumer$TestWaitStrategy$5 */
        /* JADX INFO: compiled from: Proguard */
        public enum C59665 extends TestWaitStrategy {
            public C59665() {
                super("SLEEP_100MS", 4);
            }

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        /* JADX INFO: renamed from: io.reactivex.observers.BaseTestConsumer$TestWaitStrategy$6 */
        /* JADX INFO: compiled from: Proguard */
        public enum C59676 extends TestWaitStrategy {
            public C59676() {
                super("SLEEP_1000MS", 5);
            }

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        public static TestWaitStrategy valueOf(String str) {
            return (TestWaitStrategy) Enum.valueOf(TestWaitStrategy.class, str);
        }

        public static TestWaitStrategy[] values() {
            return (TestWaitStrategy[]) f49288a.clone();
        }

        /* JADX INFO: renamed from: io.reactivex.observers.BaseTestConsumer$TestWaitStrategy$1 */
        /* JADX INFO: compiled from: Proguard */
        public enum C59621 extends TestWaitStrategy {
            public C59621() {
                super("SPIN", 0);
            }

            @Override // java.lang.Runnable
            public final void run() {
            }
        }
    }
}
