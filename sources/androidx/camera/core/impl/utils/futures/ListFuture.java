package androidx.camera.core.impl.utils.futures;

import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
class ListFuture<V> implements ListenableFuture<List<V>> {

    /* JADX INFO: renamed from: a */
    public ArrayList f2946a;

    /* JADX INFO: renamed from: b */
    public ArrayList f2947b;

    /* JADX INFO: renamed from: c */
    public final boolean f2948c;

    /* JADX INFO: renamed from: d */
    public final AtomicInteger f2949d;

    /* JADX INFO: renamed from: f */
    public final ListenableFuture f2950f = CallbackToFutureAdapter.m6740a(new C03021());

    /* JADX INFO: renamed from: g */
    public CallbackToFutureAdapter.Completer f2951g;

    /* JADX INFO: renamed from: androidx.camera.core.impl.utils.futures.ListFuture$1 */
    /* JADX INFO: compiled from: Proguard */
    class C03021 implements CallbackToFutureAdapter.Resolver<List<Object>> {
        public C03021() {
        }

        @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
        /* JADX INFO: renamed from: d */
        public final Object mo188d(CallbackToFutureAdapter.Completer completer) {
            ListFuture listFuture = ListFuture.this;
            Preconditions.m7699f(listFuture.f2951g == null, "The result can only set once!");
            listFuture.f2951g = completer;
            return "ListFuture[" + this + "]";
        }
    }

    /* JADX INFO: renamed from: androidx.camera.core.impl.utils.futures.ListFuture$2 */
    /* JADX INFO: compiled from: Proguard */
    class RunnableC03032 implements Runnable {
        public RunnableC03032() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ListFuture listFuture = ListFuture.this;
            listFuture.f2947b = null;
            listFuture.f2946a = null;
        }
    }

    /* JADX INFO: renamed from: androidx.camera.core.impl.utils.futures.ListFuture$3 */
    /* JADX INFO: compiled from: Proguard */
    class RunnableC03043 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f2954a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ListenableFuture f2955b;

        public RunnableC03043(int i, ListenableFuture listenableFuture) {
            this.f2954a = i;
            this.f2955b = listenableFuture;
        }

        @Override // java.lang.Runnable
        public final void run() {
            CallbackToFutureAdapter.Completer completer;
            ArrayList arrayList;
            int i = this.f2954a;
            ListenableFuture listenableFuture = this.f2955b;
            ListFuture listFuture = ListFuture.this;
            AtomicInteger atomicInteger = listFuture.f2949d;
            ArrayList arrayList2 = listFuture.f2947b;
            ListenableFuture listenableFuture2 = listFuture.f2950f;
            boolean zIsDone = listenableFuture2.isDone();
            boolean z2 = listFuture.f2948c;
            if (zIsDone || arrayList2 == null) {
                Preconditions.m7699f(z2, "Future was done before all dependencies completed");
                return;
            }
            try {
                try {
                    try {
                        try {
                            Preconditions.m7699f(listenableFuture.isDone(), "Tried to set value from future which is not done");
                            arrayList2.set(i, Futures.m1627d(listenableFuture));
                            int iDecrementAndGet = atomicInteger.decrementAndGet();
                            Preconditions.m7699f(iDecrementAndGet >= 0, "Less than 0 remaining futures");
                            if (iDecrementAndGet == 0) {
                                ArrayList arrayList3 = listFuture.f2947b;
                                if (arrayList3 != null) {
                                    listFuture.f2951g.m6742b(new ArrayList(arrayList3));
                                } else {
                                    Preconditions.m7699f(listenableFuture2.isDone(), null);
                                }
                            }
                        } catch (CancellationException unused) {
                            if (z2) {
                                listFuture.cancel(false);
                            }
                            int iDecrementAndGet2 = atomicInteger.decrementAndGet();
                            Preconditions.m7699f(iDecrementAndGet2 >= 0, "Less than 0 remaining futures");
                            if (iDecrementAndGet2 == 0) {
                                ArrayList arrayList4 = listFuture.f2947b;
                                if (arrayList4 != null) {
                                    completer = listFuture.f2951g;
                                    arrayList = new ArrayList(arrayList4);
                                    completer.m6742b(arrayList);
                                    return;
                                }
                                Preconditions.m7699f(listenableFuture2.isDone(), null);
                            }
                        }
                    } catch (Error e) {
                        listFuture.f2951g.m6744d(e);
                        int iDecrementAndGet3 = atomicInteger.decrementAndGet();
                        Preconditions.m7699f(iDecrementAndGet3 >= 0, "Less than 0 remaining futures");
                        if (iDecrementAndGet3 == 0) {
                            ArrayList arrayList5 = listFuture.f2947b;
                            if (arrayList5 != null) {
                                completer = listFuture.f2951g;
                                arrayList = new ArrayList(arrayList5);
                                completer.m6742b(arrayList);
                                return;
                            }
                            Preconditions.m7699f(listenableFuture2.isDone(), null);
                        }
                    }
                } catch (RuntimeException e2) {
                    if (z2) {
                        listFuture.f2951g.m6744d(e2);
                    }
                    int iDecrementAndGet4 = atomicInteger.decrementAndGet();
                    Preconditions.m7699f(iDecrementAndGet4 >= 0, "Less than 0 remaining futures");
                    if (iDecrementAndGet4 == 0) {
                        ArrayList arrayList6 = listFuture.f2947b;
                        if (arrayList6 != null) {
                            completer = listFuture.f2951g;
                            arrayList = new ArrayList(arrayList6);
                            completer.m6742b(arrayList);
                            return;
                        }
                        Preconditions.m7699f(listenableFuture2.isDone(), null);
                    }
                } catch (ExecutionException e3) {
                    if (z2) {
                        listFuture.f2951g.m6744d(e3.getCause());
                    }
                    int iDecrementAndGet5 = atomicInteger.decrementAndGet();
                    Preconditions.m7699f(iDecrementAndGet5 >= 0, "Less than 0 remaining futures");
                    if (iDecrementAndGet5 == 0) {
                        ArrayList arrayList7 = listFuture.f2947b;
                        if (arrayList7 != null) {
                            completer = listFuture.f2951g;
                            arrayList = new ArrayList(arrayList7);
                            completer.m6742b(arrayList);
                            return;
                        }
                        Preconditions.m7699f(listenableFuture2.isDone(), null);
                    }
                }
            } catch (Throwable th) {
                int iDecrementAndGet6 = atomicInteger.decrementAndGet();
                Preconditions.m7699f(iDecrementAndGet6 >= 0, "Less than 0 remaining futures");
                if (iDecrementAndGet6 == 0) {
                    ArrayList arrayList8 = listFuture.f2947b;
                    if (arrayList8 != null) {
                        listFuture.f2951g.m6742b(new ArrayList(arrayList8));
                    } else {
                        Preconditions.m7699f(listenableFuture2.isDone(), null);
                    }
                }
                throw th;
            }
        }
    }

    public ListFuture(ArrayList arrayList, boolean z2, Executor executor) {
        this.f2946a = arrayList;
        this.f2947b = new ArrayList(arrayList.size());
        this.f2948c = z2;
        this.f2949d = new AtomicInteger(arrayList.size());
        addListener(new RunnableC03032(), CameraXExecutors.m1615a());
        if (this.f2946a.isEmpty()) {
            this.f2951g.m6742b(new ArrayList(this.f2947b));
            return;
        }
        for (int i = 0; i < this.f2946a.size(); i++) {
            this.f2947b.add(null);
        }
        ArrayList arrayList2 = this.f2946a;
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            ListenableFuture listenableFuture = (ListenableFuture) arrayList2.get(i2);
            listenableFuture.addListener(new RunnableC03043(i2, listenableFuture), executor);
        }
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        this.f2950f.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z2) {
        ArrayList arrayList = this.f2946a;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((ListenableFuture) it.next()).cancel(z2);
            }
        }
        return this.f2950f.cancel(z2);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return (List) this.f2950f.get(j, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f2950f.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f2950f.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        ArrayList<ListenableFuture> arrayList = this.f2946a;
        ListenableFuture listenableFuture = this.f2950f;
        if (arrayList != null && !listenableFuture.isDone()) {
            loop0: for (ListenableFuture listenableFuture2 : arrayList) {
                while (!listenableFuture2.isDone()) {
                    try {
                        listenableFuture2.get();
                    } catch (Error e) {
                        throw e;
                    } catch (InterruptedException e2) {
                        throw e2;
                    } catch (Throwable unused) {
                        if (this.f2948c) {
                            return (List) listenableFuture.get();
                        }
                    }
                }
            }
        }
        return (List) listenableFuture.get();
    }
}
