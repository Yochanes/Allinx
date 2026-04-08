package kotlinx.coroutines.internal;

import java.lang.Comparable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.EventLoopImplBase;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.internal.ThreadSafeHeapNode;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@InternalCoroutinesApi
@Metadata(m18301d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u0000*\u0012\b\u0000\u0010\u0003*\u00020\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0004j\u0002`\u0005R\u000b\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¨\u0006\b"}, m18302d2 = {"Lkotlinx/coroutines/internal/ThreadSafeHeap;", "Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "", "T", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "Lkotlinx/atomicfu/AtomicInt;", "_size", "kotlinx-coroutines-core"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public class ThreadSafeHeap<T extends ThreadSafeHeapNode & Comparable<? super T>> {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f56363b = AtomicIntegerFieldUpdater.newUpdater(ThreadSafeHeap.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* JADX INFO: renamed from: a */
    public ThreadSafeHeapNode[] f56364a;

    /* JADX INFO: renamed from: a */
    public final void m20860a(EventLoopImplBase.DelayedTask delayedTask) {
        delayedTask.mo20589a((EventLoopImplBase.DelayedTaskQueue) this);
        ThreadSafeHeapNode[] threadSafeHeapNodeArr = this.f56364a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f56363b;
        if (threadSafeHeapNodeArr == null) {
            threadSafeHeapNodeArr = new ThreadSafeHeapNode[4];
            this.f56364a = threadSafeHeapNodeArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= threadSafeHeapNodeArr.length) {
            Object[] objArrCopyOf = Arrays.copyOf(threadSafeHeapNodeArr, atomicIntegerFieldUpdater.get(this) * 2);
            Intrinsics.m18598f(objArrCopyOf, "copyOf(...)");
            threadSafeHeapNodeArr = (ThreadSafeHeapNode[]) objArrCopyOf;
            this.f56364a = threadSafeHeapNodeArr;
        }
        int i = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i + 1);
        threadSafeHeapNodeArr[i] = delayedTask;
        delayedTask.f55311b = i;
        m20862c(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ThreadSafeHeapNode m20861b(int i) {
        ThreadSafeHeapNode[] threadSafeHeapNodeArr = this.f56364a;
        Intrinsics.m18596d(threadSafeHeapNodeArr);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f56363b;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i < atomicIntegerFieldUpdater.get(this)) {
            m20863d(i, atomicIntegerFieldUpdater.get(this));
            int i2 = (i - 1) / 2;
            if (i > 0) {
                ThreadSafeHeapNode threadSafeHeapNode = threadSafeHeapNodeArr[i];
                Intrinsics.m18596d(threadSafeHeapNode);
                ThreadSafeHeapNode threadSafeHeapNode2 = threadSafeHeapNodeArr[i2];
                Intrinsics.m18596d(threadSafeHeapNode2);
                if (((Comparable) threadSafeHeapNode).compareTo(threadSafeHeapNode2) < 0) {
                    m20863d(i, i2);
                    m20862c(i2);
                } else {
                    while (true) {
                        int i3 = i * 2;
                        int i4 = i3 + 1;
                        if (i4 >= atomicIntegerFieldUpdater.get(this)) {
                            break;
                        }
                        ThreadSafeHeapNode[] threadSafeHeapNodeArr2 = this.f56364a;
                        Intrinsics.m18596d(threadSafeHeapNodeArr2);
                        int i5 = i3 + 2;
                        if (i5 < atomicIntegerFieldUpdater.get(this)) {
                            ThreadSafeHeapNode threadSafeHeapNode3 = threadSafeHeapNodeArr2[i5];
                            Intrinsics.m18596d(threadSafeHeapNode3);
                            ThreadSafeHeapNode threadSafeHeapNode4 = threadSafeHeapNodeArr2[i4];
                            Intrinsics.m18596d(threadSafeHeapNode4);
                            if (((Comparable) threadSafeHeapNode3).compareTo(threadSafeHeapNode4) >= 0) {
                                i5 = i4;
                            }
                            ThreadSafeHeapNode threadSafeHeapNode5 = threadSafeHeapNodeArr2[i];
                            Intrinsics.m18596d(threadSafeHeapNode5);
                            ThreadSafeHeapNode threadSafeHeapNode6 = threadSafeHeapNodeArr2[i5];
                            Intrinsics.m18596d(threadSafeHeapNode6);
                            if (((Comparable) threadSafeHeapNode5).compareTo(threadSafeHeapNode6) <= 0) {
                                break;
                            }
                            m20863d(i, i5);
                            i = i5;
                        }
                    }
                }
            }
        }
        ThreadSafeHeapNode threadSafeHeapNode7 = threadSafeHeapNodeArr[atomicIntegerFieldUpdater.get(this)];
        Intrinsics.m18596d(threadSafeHeapNode7);
        threadSafeHeapNode7.mo20589a(null);
        threadSafeHeapNode7.setIndex(-1);
        threadSafeHeapNodeArr[atomicIntegerFieldUpdater.get(this)] = null;
        return threadSafeHeapNode7;
    }

    /* JADX INFO: renamed from: c */
    public final void m20862c(int i) {
        while (i > 0) {
            ThreadSafeHeapNode[] threadSafeHeapNodeArr = this.f56364a;
            Intrinsics.m18596d(threadSafeHeapNodeArr);
            int i2 = (i - 1) / 2;
            ThreadSafeHeapNode threadSafeHeapNode = threadSafeHeapNodeArr[i2];
            Intrinsics.m18596d(threadSafeHeapNode);
            ThreadSafeHeapNode threadSafeHeapNode2 = threadSafeHeapNodeArr[i];
            Intrinsics.m18596d(threadSafeHeapNode2);
            if (((Comparable) threadSafeHeapNode).compareTo(threadSafeHeapNode2) <= 0) {
                return;
            }
            m20863d(i, i2);
            i = i2;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m20863d(int i, int i2) {
        ThreadSafeHeapNode[] threadSafeHeapNodeArr = this.f56364a;
        Intrinsics.m18596d(threadSafeHeapNodeArr);
        ThreadSafeHeapNode threadSafeHeapNode = threadSafeHeapNodeArr[i2];
        Intrinsics.m18596d(threadSafeHeapNode);
        ThreadSafeHeapNode threadSafeHeapNode2 = threadSafeHeapNodeArr[i];
        Intrinsics.m18596d(threadSafeHeapNode2);
        threadSafeHeapNodeArr[i] = threadSafeHeapNode;
        threadSafeHeapNodeArr[i2] = threadSafeHeapNode2;
        threadSafeHeapNode.setIndex(i);
        threadSafeHeapNode2.setIndex(i2);
    }
}
