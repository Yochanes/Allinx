package com.google.android.gms.measurement.internal;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhp extends zzix {
    private static final AtomicLong zza = new AtomicLong(Long.MIN_VALUE);

    @Nullable
    private zzht zzb;

    @Nullable
    private zzht zzc;
    private final PriorityBlockingQueue<zzhu<?>> zzd;
    private final BlockingQueue<zzhu<?>> zze;
    private final Thread.UncaughtExceptionHandler zzf;
    private final Thread.UncaughtExceptionHandler zzg;
    private final Object zzh;
    private final Semaphore zzi;
    private volatile boolean zzj;

    public zzhp(zzhw zzhwVar) {
        super(zzhwVar);
        this.zzh = new Object();
        this.zzi = new Semaphore(2);
        this.zzd = new PriorityBlockingQueue<>();
        this.zze = new LinkedBlockingQueue();
        this.zzf = new zzhr(this, "Thread death: Uncaught exception on worker thread");
        this.zzg = new zzhr(this, "Thread death: Uncaught exception on network thread");
    }

    public static /* bridge */ /* synthetic */ zzht zza(zzhp zzhpVar) {
        return zzhpVar.zzc;
    }

    public static /* bridge */ /* synthetic */ zzht zzb(zzhp zzhpVar) {
        return zzhpVar.zzb;
    }

    public static /* bridge */ /* synthetic */ Object zzc(zzhp zzhpVar) {
        return zzhpVar.zzh;
    }

    public static /* bridge */ /* synthetic */ Semaphore zzd(zzhp zzhpVar) {
        return zzhpVar.zzi;
    }

    public static /* bridge */ /* synthetic */ boolean zze(zzhp zzhpVar) {
        return zzhpVar.zzj;
    }

    @Override // com.google.android.gms.measurement.internal.zziy
    @Pure
    public final /* bridge */ /* synthetic */ zzbb zzf() {
        return super.zzf();
    }

    public final boolean zzg() {
        return Thread.currentThread() == this.zzb;
    }

    @Override // com.google.android.gms.measurement.internal.zziy
    @Pure
    public final /* bridge */ /* synthetic */ zzgh zzi() {
        return super.zzi();
    }

    @Override // com.google.android.gms.measurement.internal.zziy, com.google.android.gms.measurement.internal.zzja
    @Pure
    public final /* bridge */ /* synthetic */ zzgi zzj() {
        return super.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.zziy
    @Pure
    public final /* bridge */ /* synthetic */ zzgu zzk() {
        return super.zzk();
    }

    @Override // com.google.android.gms.measurement.internal.zziy, com.google.android.gms.measurement.internal.zzja
    @Pure
    public final /* bridge */ /* synthetic */ zzhp zzl() {
        return super.zzl();
    }

    @Override // com.google.android.gms.measurement.internal.zzix
    public final boolean zzo() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zziy
    @Pure
    public final /* bridge */ /* synthetic */ zzop zzq() {
        return super.zzq();
    }

    @Override // com.google.android.gms.measurement.internal.zziy
    public final void zzr() {
        if (Thread.currentThread() != this.zzc) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    @Override // com.google.android.gms.measurement.internal.zziy
    public final /* bridge */ /* synthetic */ void zzs() {
        super.zzs();
    }

    @Override // com.google.android.gms.measurement.internal.zziy
    public final void zzt() {
        if (Thread.currentThread() != this.zzb) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    public static /* bridge */ /* synthetic */ void zza(zzhp zzhpVar, zzht zzhtVar) {
        zzhpVar.zzc = null;
    }

    public static /* bridge */ /* synthetic */ void zzb(zzhp zzhpVar, zzht zzhtVar) {
        zzhpVar.zzb = null;
    }

    public static /* bridge */ /* synthetic */ AtomicLong zzc() {
        return zza;
    }

    @Override // com.google.android.gms.measurement.internal.zziy, com.google.android.gms.measurement.internal.zzja
    @Pure
    public final /* bridge */ /* synthetic */ zzac zzd() {
        return super.zzd();
    }

    @Override // com.google.android.gms.measurement.internal.zziy
    @Pure
    public final /* bridge */ /* synthetic */ zzah zze() {
        return super.zze();
    }

    @Override // com.google.android.gms.measurement.internal.zziy, com.google.android.gms.measurement.internal.zzja
    @Pure
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    @Override // com.google.android.gms.measurement.internal.zziy, com.google.android.gms.measurement.internal.zzja
    @Pure
    public final /* bridge */ /* synthetic */ Clock zzb() {
        return super.zzb();
    }

    public final void zzc(Runnable runnable) {
        zzac();
        Preconditions.checkNotNull(runnable);
        zza(new zzhu<>(this, runnable, true, "Task exception on worker thread"));
    }

    @Nullable
    public final <T> T zza(AtomicReference<T> atomicReference, long j, String str, Runnable runnable) {
        synchronized (atomicReference) {
            zzl().zzb(runnable);
            try {
                atomicReference.wait(j);
            } catch (InterruptedException unused) {
                zzj().zzu().zza("Interrupted waiting for " + str);
                return null;
            }
        }
        T t = atomicReference.get();
        if (t == null) {
            zzj().zzu().zza("Timed out waiting for " + str);
        }
        return t;
    }

    public final <V> Future<V> zzb(Callable<V> callable) {
        zzac();
        Preconditions.checkNotNull(callable);
        zzhu<?> zzhuVar = new zzhu<>(this, (Callable<?>) callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.zzb) {
            zzhuVar.run();
            return zzhuVar;
        }
        zza(zzhuVar);
        return zzhuVar;
    }

    public final void zzb(Runnable runnable) {
        zzac();
        Preconditions.checkNotNull(runnable);
        zza(new zzhu<>(this, runnable, false, "Task exception on worker thread"));
    }

    public final <V> Future<V> zza(Callable<V> callable) {
        zzac();
        Preconditions.checkNotNull(callable);
        zzhu<?> zzhuVar = new zzhu<>(this, (Callable<?>) callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.zzb) {
            if (!this.zzd.isEmpty()) {
                zzj().zzu().zza("Callable skipped the worker queue.");
            }
            zzhuVar.run();
            return zzhuVar;
        }
        zza(zzhuVar);
        return zzhuVar;
    }

    private final void zza(zzhu<?> zzhuVar) {
        synchronized (this.zzh) {
            try {
                this.zzd.add(zzhuVar);
                zzht zzhtVar = this.zzb;
                if (zzhtVar == null) {
                    zzht zzhtVar2 = new zzht(this, "Measurement Worker", this.zzd);
                    this.zzb = zzhtVar2;
                    zzhtVar2.setUncaughtExceptionHandler(this.zzf);
                    this.zzb.start();
                } else {
                    zzhtVar.zza();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zza(Runnable runnable) {
        zzac();
        Preconditions.checkNotNull(runnable);
        zzhu<?> zzhuVar = new zzhu<>(this, runnable, false, "Task exception on network thread");
        synchronized (this.zzh) {
            try {
                this.zze.add(zzhuVar);
                zzht zzhtVar = this.zzc;
                if (zzhtVar == null) {
                    zzht zzhtVar2 = new zzht(this, "Measurement Network", this.zze);
                    this.zzc = zzhtVar2;
                    zzhtVar2.setUncaughtExceptionHandler(this.zzg);
                    this.zzc.start();
                } else {
                    zzhtVar.zza();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
