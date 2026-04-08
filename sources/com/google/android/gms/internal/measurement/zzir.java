package com.google.android.gms.internal.measurement;

import android.content.Context;
import com.google.android.gms.internal.measurement.zzin;
import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.base.Suppliers;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.Nullable;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzir<T> {
    private static final Object zza = new Object();

    @Nullable
    private static volatile zziy zzb = null;
    private static volatile boolean zzc = false;
    private static zzjc zzd;
    private static final AtomicInteger zze;
    private final zziz zzf;
    private final String zzg;
    private Object zzh;
    private volatile int zzi;
    private volatile T zzj;
    private final boolean zzk;
    private volatile boolean zzl;

    static {
        new AtomicReference();
        zzd = new zzjc(new zzis());
        zze = new AtomicInteger();
    }

    public /* synthetic */ zzir(zziz zzizVar, String str, Object obj, boolean z2, zzjb zzjbVar) {
        this(zzizVar, str, obj, true);
    }

    public static /* synthetic */ zzir zza(zziz zzizVar, String str, Boolean bool, boolean z2) {
        return new zziu(zzizVar, str, bool, true);
    }

    @Nullable
    private final T zzb(zziy zziyVar) {
        Object objZza;
        zzif zzifVarZza = this.zzf.zzb != null ? zzip.zza(zziyVar.zza(), this.zzf.zzb) ? this.zzf.zzg ? zzic.zza(zziyVar.zza().getContentResolver(), zzio.zza(zzio.zza(zziyVar.zza(), this.zzf.zzb.getLastPathSegment())), new zziq()) : zzic.zza(zziyVar.zza().getContentResolver(), this.zzf.zzb, new zziq()) : null : zzja.zza(zziyVar.zza(), this.zzf.zza, new zziq());
        if (zzifVarZza == null || (objZza = zzifVarZza.zza(zzb())) == null) {
            return null;
        }
        return zza(objZza);
    }

    public static void zzc() {
        zze.incrementAndGet();
    }

    public static /* synthetic */ boolean zzd() {
        return true;
    }

    private final T zze() {
        return (T) this.zzh;
    }

    public abstract T zza(Object obj);

    private zzir(zziz zzizVar, String str, T t, boolean z2) {
        this.zzi = -1;
        String str2 = zzizVar.zza;
        if (str2 == null && zzizVar.zzb == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        if (str2 != null && zzizVar.zzb != null) {
            throw new IllegalArgumentException("Must pass one of SharedPreferences file name or ContentProvider URI");
        }
        this.zzf = zzizVar;
        this.zzg = str;
        this.zzh = t;
        this.zzk = z2;
        this.zzl = false;
    }

    public static /* synthetic */ zzir zza(zziz zzizVar, String str, Double d, boolean z2) {
        return new zzix(zzizVar, str, d, true);
    }

    public static /* synthetic */ zzir zza(zziz zzizVar, String str, Long l, boolean z2) {
        return new zziv(zzizVar, str, l, true);
    }

    public static /* synthetic */ zzir zza(zziz zzizVar, String str, String str2, boolean z2) {
        return new zziw(zzizVar, str, str2, true);
    }

    public static /* synthetic */ Optional zza(Context context) {
        return zzin.zza.zza(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x007c A[Catch: all -> 0x004e, TryCatch #0 {all -> 0x004e, blocks: (B:8:0x001c, B:10:0x0020, B:12:0x0029, B:14:0x0039, B:20:0x0055, B:22:0x0060, B:35:0x0080, B:38:0x0088, B:39:0x008d, B:40:0x0091, B:25:0x0067, B:34:0x007c, B:28:0x006e, B:31:0x0075, B:41:0x0095), top: B:47:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final T zza() {
        T tZzb;
        if (!this.zzk) {
            Preconditions.checkState(zzd.zza(this.zzg), "Attempt to access PhenotypeFlag not via codegen. All new PhenotypeFlags must be accessed through codegen APIs. If you believe you are seeing this error by mistake, you can add your flag to the exemption list located at //java/com/google/android/libraries/phenotype/client/lockdown/flags.textproto. Send the addition CL to ph-reviews@. See go/phenotype-android-codegen for information about generated code. See go/ph-lockdown for more information about this error.");
        }
        int i = zze.get();
        if (this.zzi < i) {
            synchronized (this) {
                try {
                    if (this.zzi < i) {
                        zziy zziyVar = zzb;
                        Optional<zzil> optionalAbsent = Optional.absent();
                        String strZza = null;
                        if (zziyVar != null) {
                            optionalAbsent = zziyVar.zzb().get();
                            if (optionalAbsent.isPresent()) {
                                zzil zzilVar = optionalAbsent.get();
                                zziz zzizVar = this.zzf;
                                strZza = zzilVar.zza(zzizVar.zzb, zzizVar.zza, zzizVar.zzd, this.zzg);
                            }
                        }
                        Preconditions.checkState(zziyVar != null, "Must call PhenotypeFlagInitializer.maybeInit() first");
                        if (this.zzf.zzf) {
                            tZzb = zza(zziyVar);
                            if (tZzb == null && (tZzb = zzb(zziyVar)) == null) {
                                tZzb = zze();
                            }
                            if (optionalAbsent.isPresent()) {
                                tZzb = strZza == null ? zze() : zza((Object) strZza);
                            }
                            this.zzj = tZzb;
                            this.zzi = i;
                        } else {
                            tZzb = zzb(zziyVar);
                            if (tZzb == null && (tZzb = zza(zziyVar)) == null) {
                            }
                            if (optionalAbsent.isPresent()) {
                            }
                            this.zzj = tZzb;
                            this.zzi = i;
                        }
                    }
                } finally {
                }
            }
        }
        return this.zzj;
    }

    public final String zzb() {
        return zza(this.zzf.zzd);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0048, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x004d, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void zzb(Context context) {
        if (zzb != null || context == null) {
            return;
        }
        Object obj = zza;
        synchronized (obj) {
            try {
                if (zzb == null) {
                    synchronized (obj) {
                        zziy zziyVar = zzb;
                        Context applicationContext = context.getApplicationContext();
                        if (applicationContext != null) {
                            context = applicationContext;
                        }
                        if (zziyVar == null || zziyVar.zza() != context) {
                            if (zziyVar != null) {
                                zzic.zzc();
                                zzja.zza();
                                zzik.zza();
                            }
                            zzb = new zzhz(context, Suppliers.memoize(new zzit(context)));
                            zze.incrementAndGet();
                        }
                    }
                }
            } finally {
            }
        }
    }

    @Nullable
    private final T zza(zziy zziyVar) {
        Function<Context, Boolean> function;
        zziz zzizVar = this.zzf;
        if (!zzizVar.zze && ((function = zzizVar.zzh) == null || function.apply(zziyVar.zza()).booleanValue())) {
            zzik zzikVarZza = zzik.zza(zziyVar.zza());
            zziz zzizVar2 = this.zzf;
            Object objZza = zzikVarZza.zza(zzizVar2.zze ? null : zza(zzizVar2.zzc));
            if (objZza != null) {
                return zza(objZza);
            }
        }
        return null;
    }

    private final String zza(String str) {
        return (str == null || !str.isEmpty()) ? AbstractC0000a.m2C(str, this.zzg) : this.zzg;
    }
}
