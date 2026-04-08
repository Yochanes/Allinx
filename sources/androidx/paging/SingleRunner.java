package androidx.paging;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexImpl;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/paging/SingleRunner;", "", "CancelIsolatedRunnerException", "Companion", "Holder", "paging-common_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class SingleRunner {

    /* JADX INFO: renamed from: a */
    public final Holder f31320a;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/paging/SingleRunner$CancelIsolatedRunnerException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "paging-common_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class CancelIsolatedRunnerException extends CancellationException {

        /* JADX INFO: renamed from: a */
        public final SingleRunner f31321a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CancelIsolatedRunnerException(SingleRunner runner) {
            super("Cancelled isolated runner");
            Intrinsics.m18599g(runner, "runner");
            this.f31321a = runner;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/paging/SingleRunner$Companion;", "", "", "DEFAULT_PRIORITY", "I", "paging-common_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/paging/SingleRunner$Holder;", "", "paging-common_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static final class Holder {

        /* JADX INFO: renamed from: a */
        public final SingleRunner f31322a;

        /* JADX INFO: renamed from: b */
        public final boolean f31323b;

        /* JADX INFO: renamed from: c */
        public final MutexImpl f31324c;

        /* JADX INFO: renamed from: d */
        public Job f31325d;

        /* JADX INFO: renamed from: e */
        public int f31326e;

        public Holder(SingleRunner singleRunner, boolean z2) {
            Intrinsics.m18599g(singleRunner, "singleRunner");
            this.f31322a = singleRunner;
            this.f31323b = z2;
            this.f31324c = MutexKt.m20913a();
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX INFO: renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object m11417a(Job job, ContinuationImpl continuationImpl) {
            SingleRunner$Holder$onFinish$1 singleRunner$Holder$onFinish$1;
            MutexImpl mutexImpl;
            Holder holder;
            if (continuationImpl instanceof SingleRunner$Holder$onFinish$1) {
                singleRunner$Holder$onFinish$1 = (SingleRunner$Holder$onFinish$1) continuationImpl;
                int i = singleRunner$Holder$onFinish$1.f31332g;
                if ((i & Integer.MIN_VALUE) != 0) {
                    singleRunner$Holder$onFinish$1.f31332g = i - Integer.MIN_VALUE;
                } else {
                    singleRunner$Holder$onFinish$1 = new SingleRunner$Holder$onFinish$1(this, continuationImpl);
                }
            }
            Object obj = singleRunner$Holder$onFinish$1.f31330d;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
            int i2 = singleRunner$Holder$onFinish$1.f31332g;
            if (i2 == 0) {
                ResultKt.m18313b(obj);
                mutexImpl = this.f31324c;
                singleRunner$Holder$onFinish$1.f31327a = this;
                singleRunner$Holder$onFinish$1.f31328b = job;
                singleRunner$Holder$onFinish$1.f31329c = mutexImpl;
                singleRunner$Holder$onFinish$1.f31332g = 1;
                if (mutexImpl.mo20909a(singleRunner$Holder$onFinish$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                holder = this;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                MutexImpl mutexImpl2 = singleRunner$Holder$onFinish$1.f31329c;
                Job job2 = singleRunner$Holder$onFinish$1.f31328b;
                holder = (Holder) singleRunner$Holder$onFinish$1.f31327a;
                ResultKt.m18313b(obj);
                mutexImpl = mutexImpl2;
                job = job2;
            }
            try {
                if (job == holder.f31325d) {
                    holder.f31325d = null;
                }
                mutexImpl.mo20911c(null);
                return Unit.f51459a;
            } catch (Throwable th) {
                mutexImpl.mo20911c(null);
                throw th;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Type inference failed for: r11v0, types: [kotlinx.coroutines.Job] */
        /* JADX WARN: Type inference failed for: r11v1, types: [kotlinx.coroutines.sync.Mutex] */
        /* JADX WARN: Type inference failed for: r11v12 */
        /* JADX WARN: Type inference failed for: r11v13 */
        /* JADX WARN: Type inference failed for: r11v4, types: [kotlinx.coroutines.sync.Mutex] */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v6 */
        /* JADX WARN: Type inference failed for: r2v2 */
        /* JADX WARN: Type inference failed for: r2v3, types: [kotlinx.coroutines.Job] */
        /* JADX WARN: Type inference failed for: r2v4, types: [kotlinx.coroutines.Job] */
        /* JADX WARN: Type inference failed for: r2v5 */
        /* JADX WARN: Type inference failed for: r2v7 */
        /* JADX INFO: renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object m11418b(int i, Job job, ContinuationImpl continuationImpl) {
            SingleRunner$Holder$tryEnqueue$1 singleRunner$Holder$tryEnqueue$1;
            Holder holder;
            ?? r2;
            Mutex mutex;
            ?? r1;
            Holder holder2;
            int i2;
            if (continuationImpl instanceof SingleRunner$Holder$tryEnqueue$1) {
                singleRunner$Holder$tryEnqueue$1 = (SingleRunner$Holder$tryEnqueue$1) continuationImpl;
                int i3 = singleRunner$Holder$tryEnqueue$1.f31339i;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    singleRunner$Holder$tryEnqueue$1.f31339i = i3 - Integer.MIN_VALUE;
                } else {
                    singleRunner$Holder$tryEnqueue$1 = new SingleRunner$Holder$tryEnqueue$1(this, continuationImpl);
                }
            }
            Object obj = singleRunner$Holder$tryEnqueue$1.f31337f;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
            int i4 = singleRunner$Holder$tryEnqueue$1.f31339i;
            boolean z2 = true;
            try {
                if (i4 == 0) {
                    ResultKt.m18313b(obj);
                    MutexImpl mutexImpl = this.f31324c;
                    singleRunner$Holder$tryEnqueue$1.f31333a = this;
                    singleRunner$Holder$tryEnqueue$1.f31334b = job;
                    singleRunner$Holder$tryEnqueue$1.f31335c = mutexImpl;
                    singleRunner$Holder$tryEnqueue$1.f31336d = i;
                    singleRunner$Holder$tryEnqueue$1.f31339i = 1;
                    if (mutexImpl.mo20909a(singleRunner$Holder$tryEnqueue$1) != coroutineSingletons) {
                        holder = this;
                        r2 = job;
                        mutex = mutexImpl;
                    }
                    return coroutineSingletons;
                }
                if (i4 != 1) {
                    if (i4 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i = singleRunner$Holder$tryEnqueue$1.f31336d;
                    Mutex mutex2 = singleRunner$Holder$tryEnqueue$1.f31335c;
                    Job job2 = singleRunner$Holder$tryEnqueue$1.f31334b;
                    holder2 = (Holder) singleRunner$Holder$tryEnqueue$1.f31333a;
                    ResultKt.m18313b(obj);
                    r1 = job2;
                    mutex = mutex2;
                    holder = holder2;
                    r2 = r1;
                    holder.f31325d = r2;
                    holder.f31326e = i;
                    job = mutex;
                    return Boolean.valueOf(z2);
                }
                i = singleRunner$Holder$tryEnqueue$1.f31336d;
                Mutex mutex3 = singleRunner$Holder$tryEnqueue$1.f31335c;
                Job job3 = singleRunner$Holder$tryEnqueue$1.f31334b;
                holder = (Holder) singleRunner$Holder$tryEnqueue$1.f31333a;
                ResultKt.m18313b(obj);
                r2 = job3;
                mutex = mutex3;
                Job job4 = holder.f31325d;
                if (job4 != null && job4.isActive() && (i2 = holder.f31326e) >= i && (i2 != i || !holder.f31323b)) {
                    z2 = false;
                    job = mutex;
                    return Boolean.valueOf(z2);
                }
                if (job4 != null) {
                    job4.mo17054i(new CancelIsolatedRunnerException(holder.f31322a));
                }
                if (job4 != null) {
                    singleRunner$Holder$tryEnqueue$1.f31333a = holder;
                    singleRunner$Holder$tryEnqueue$1.f31334b = r2;
                    singleRunner$Holder$tryEnqueue$1.f31335c = mutex;
                    singleRunner$Holder$tryEnqueue$1.f31336d = i;
                    singleRunner$Holder$tryEnqueue$1.f31339i = 2;
                    if (job4.mo17049H(singleRunner$Holder$tryEnqueue$1) != coroutineSingletons) {
                        r1 = r2;
                        holder2 = holder;
                        mutex = mutex;
                        holder = holder2;
                        r2 = r1;
                    }
                    return coroutineSingletons;
                }
                holder.f31325d = r2;
                holder.f31326e = i;
                job = mutex;
                return Boolean.valueOf(z2);
            } finally {
                job.mo20911c(null);
            }
        }
    }

    public SingleRunner(boolean z2) {
        this.f31320a = new Holder(this, z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m11416a(int i, Function1 function1, ContinuationImpl continuationImpl) {
        SingleRunner$runInIsolation$1 singleRunner$runInIsolation$1;
        SingleRunner singleRunner;
        if (continuationImpl instanceof SingleRunner$runInIsolation$1) {
            singleRunner$runInIsolation$1 = (SingleRunner$runInIsolation$1) continuationImpl;
            int i2 = singleRunner$runInIsolation$1.f31343d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                singleRunner$runInIsolation$1.f31343d = i2 - Integer.MIN_VALUE;
            } else {
                singleRunner$runInIsolation$1 = new SingleRunner$runInIsolation$1(this, continuationImpl);
            }
        }
        Object obj = singleRunner$runInIsolation$1.f31341b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i3 = singleRunner$runInIsolation$1.f31343d;
        if (i3 == 0) {
            ResultKt.m18313b(obj);
            try {
                SingleRunner$runInIsolation$2 singleRunner$runInIsolation$2 = new SingleRunner$runInIsolation$2(this, i, function1, null);
                singleRunner$runInIsolation$1.f31340a = this;
                singleRunner$runInIsolation$1.f31343d = 1;
                if (CoroutineScopeKt.m20563d(singleRunner$runInIsolation$2, singleRunner$runInIsolation$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } catch (CancelIsolatedRunnerException e) {
                e = e;
                singleRunner = this;
                if (e.f31321a != singleRunner) {
                    throw e;
                }
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            singleRunner = singleRunner$runInIsolation$1.f31340a;
            try {
                ResultKt.m18313b(obj);
            } catch (CancelIsolatedRunnerException e2) {
                e = e2;
                if (e.f31321a != singleRunner) {
                }
            }
        }
        return Unit.f51459a;
    }
}
