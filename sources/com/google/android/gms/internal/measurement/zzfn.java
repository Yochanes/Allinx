package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzlc;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfn {

    /* JADX INFO: compiled from: Proguard */
    public static final class zza extends zzlc<zza, C6445zza> implements zzmn {
        private static final zza zzc;
        private static volatile zzmu<zza> zzd;
        private int zze;
        private int zzf;
        private zzll<zze> zzg = zzlc.zzch();
        private zzll<zzb> zzh = zzlc.zzch();
        private boolean zzi;
        private boolean zzj;

        /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.zzfn$zza$zza, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Proguard */
        public static final class C6445zza extends zzlc.zzb<zza, C6445zza> implements zzmn {
            public /* synthetic */ C6445zza(zzfo zzfoVar) {
                this();
            }

            public final int zza() {
                return ((zza) this.zza).zzb();
            }

            public final int zzb() {
                return ((zza) this.zza).zzc();
            }

            private C6445zza() {
                super(zza.zzd());
            }

            public final C6445zza zza(int i, zzb.zza zzaVar) {
                zzak();
                zza.zza((zza) this.zza, i, (zzb) ((zzlc) zzaVar.zzai()));
                return this;
            }

            public final zze zzb(int i) {
                return ((zza) this.zza).zzb(i);
            }

            public final C6445zza zza(int i, zze.zza zzaVar) {
                zzak();
                zza.zza((zza) this.zza, i, (zze) ((zzlc) zzaVar.zzai()));
                return this;
            }

            public final zzb zza(int i) {
                return ((zza) this.zza).zza(i);
            }
        }

        static {
            zza zzaVar = new zza();
            zzc = zzaVar;
            zzlc.zza((Class<zza>) zza.class, zzaVar);
        }

        private zza() {
        }

        public static /* bridge */ /* synthetic */ zza zzd() {
            return zzc;
        }

        public final int zza() {
            return this.zzf;
        }

        public final int zzb() {
            return this.zzh.size();
        }

        public final int zzc() {
            return this.zzg.size();
        }

        public final List<zzb> zze() {
            return this.zzh;
        }

        public final List<zze> zzf() {
            return this.zzg;
        }

        public final boolean zzg() {
            return (this.zze & 1) != 0;
        }

        public final zzb zza(int i) {
            return this.zzh.get(i);
        }

        public final zze zzb(int i) {
            return this.zzg.get(i);
        }

        @Override // com.google.android.gms.internal.measurement.zzlc
        public final Object zza(int i, Object obj, Object obj2) {
            zzmu zzaVar;
            switch (zzfm.zza[i - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C6445zza(null);
                case 3:
                    return zzlc.zza(zzc, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zze", "zzf", "zzg", zze.class, "zzh", zzb.class, "zzi", "zzj"});
                case 4:
                    return zzc;
                case 5:
                    zzmu<zza> zzmuVar = zzd;
                    if (zzmuVar != null) {
                        return zzmuVar;
                    }
                    synchronized (zza.class) {
                        try {
                            zzaVar = zzd;
                            if (zzaVar == null) {
                                zzaVar = new zzlc.zza(zzc);
                                zzd = zzaVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return zzaVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public static /* synthetic */ void zza(zza zzaVar, int i, zzb zzbVar) {
            zzbVar.getClass();
            zzll<zzb> zzllVar = zzaVar.zzh;
            if (!zzllVar.zzc()) {
                zzaVar.zzh = zzlc.zza(zzllVar);
            }
            zzaVar.zzh.set(i, zzbVar);
        }

        public static /* synthetic */ void zza(zza zzaVar, int i, zze zzeVar) {
            zzeVar.getClass();
            zzll<zze> zzllVar = zzaVar.zzg;
            if (!zzllVar.zzc()) {
                zzaVar.zzg = zzlc.zza(zzllVar);
            }
            zzaVar.zzg.set(i, zzeVar);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class zzb extends zzlc<zzb, zza> implements zzmn {
        private static final zzb zzc;
        private static volatile zzmu<zzb> zzd;
        private int zze;
        private int zzf;
        private String zzg = "";
        private zzll<zzc> zzh = zzlc.zzch();
        private boolean zzi;
        private zzd zzj;
        private boolean zzk;
        private boolean zzl;
        private boolean zzm;

        /* JADX INFO: compiled from: Proguard */
        public static final class zza extends zzlc.zzb<zzb, zza> implements zzmn {
            public /* synthetic */ zza(zzfp zzfpVar) {
                this();
            }

            public final int zza() {
                return ((zzb) this.zza).zza();
            }

            public final String zzb() {
                return ((zzb) this.zza).zzf();
            }

            private zza() {
                super(zzb.zzd());
            }

            public final zza zza(String str) {
                zzak();
                zzb.zza((zzb) this.zza, str);
                return this;
            }

            public final zza zza(int i, zzc zzcVar) {
                zzak();
                zzb.zza((zzb) this.zza, i, zzcVar);
                return this;
            }

            public final zzc zza(int i) {
                return ((zzb) this.zza).zza(i);
            }
        }

        static {
            zzb zzbVar = new zzb();
            zzc = zzbVar;
            zzlc.zza((Class<zzb>) zzb.class, zzbVar);
        }

        private zzb() {
        }

        public static zza zzc() {
            return zzc.zzcc();
        }

        public static /* bridge */ /* synthetic */ zzb zzd() {
            return zzc;
        }

        public final int zza() {
            return this.zzh.size();
        }

        public final int zzb() {
            return this.zzf;
        }

        public final zzd zze() {
            zzd zzdVar = this.zzj;
            return zzdVar == null ? zzd.zzc() : zzdVar;
        }

        public final String zzf() {
            return this.zzg;
        }

        public final List<zzc> zzg() {
            return this.zzh;
        }

        public final boolean zzh() {
            return this.zzk;
        }

        public final boolean zzi() {
            return this.zzl;
        }

        public final boolean zzj() {
            return this.zzm;
        }

        public final boolean zzk() {
            return (this.zze & 8) != 0;
        }

        public final boolean zzl() {
            return (this.zze & 1) != 0;
        }

        public final boolean zzm() {
            return (this.zze & 64) != 0;
        }

        public final zzc zza(int i) {
            return this.zzh.get(i);
        }

        @Override // com.google.android.gms.internal.measurement.zzlc
        public final Object zza(int i, Object obj, Object obj2) {
            zzmu zzaVar;
            switch (zzfm.zza[i - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza(null);
                case 3:
                    return zzlc.zza(zzc, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", zzc.class, "zzi", "zzj", "zzk", "zzl", "zzm"});
                case 4:
                    return zzc;
                case 5:
                    zzmu<zzb> zzmuVar = zzd;
                    if (zzmuVar != null) {
                        return zzmuVar;
                    }
                    synchronized (zzb.class) {
                        try {
                            zzaVar = zzd;
                            if (zzaVar == null) {
                                zzaVar = new zzlc.zza(zzc);
                                zzd = zzaVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return zzaVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public static /* synthetic */ void zza(zzb zzbVar, String str) {
            str.getClass();
            zzbVar.zze |= 2;
            zzbVar.zzg = str;
        }

        public static /* synthetic */ void zza(zzb zzbVar, int i, zzc zzcVar) {
            zzcVar.getClass();
            zzll<zzc> zzllVar = zzbVar.zzh;
            if (!zzllVar.zzc()) {
                zzbVar.zzh = zzlc.zza(zzllVar);
            }
            zzbVar.zzh.set(i, zzcVar);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class zzc extends zzlc<zzc, zza> implements zzmn {
        private static final zzc zzc;
        private static volatile zzmu<zzc> zzd;
        private int zze;
        private zzf zzf;
        private zzd zzg;
        private boolean zzh;
        private String zzi = "";

        /* JADX INFO: compiled from: Proguard */
        public static final class zza extends zzlc.zzb<zzc, zza> implements zzmn {
            public /* synthetic */ zza(zzfq zzfqVar) {
                this();
            }

            public final zza zza(String str) {
                zzak();
                zzc.zza((zzc) this.zza, str);
                return this;
            }

            private zza() {
                super(zzc.zza());
            }
        }

        static {
            zzc zzcVar = new zzc();
            zzc = zzcVar;
            zzlc.zza((Class<zzc>) zzc.class, zzcVar);
        }

        private zzc() {
        }

        public static /* bridge */ /* synthetic */ zzc zza() {
            return zzc;
        }

        public static zzc zzb() {
            return zzc;
        }

        public final zzd zzc() {
            zzd zzdVar = this.zzg;
            return zzdVar == null ? zzd.zzc() : zzdVar;
        }

        public final zzf zzd() {
            zzf zzfVar = this.zzf;
            return zzfVar == null ? zzf.zzd() : zzfVar;
        }

        public final String zze() {
            return this.zzi;
        }

        public final boolean zzf() {
            return this.zzh;
        }

        public final boolean zzg() {
            return (this.zze & 4) != 0;
        }

        public final boolean zzh() {
            return (this.zze & 2) != 0;
        }

        public final boolean zzi() {
            return (this.zze & 8) != 0;
        }

        public final boolean zzj() {
            return (this.zze & 1) != 0;
        }

        @Override // com.google.android.gms.internal.measurement.zzlc
        public final Object zza(int i, Object obj, Object obj2) {
            zzmu zzaVar;
            switch (zzfm.zza[i - 1]) {
                case 1:
                    return new zzc();
                case 2:
                    return new zza(null);
                case 3:
                    return zzlc.zza(zzc, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
                case 4:
                    return zzc;
                case 5:
                    zzmu<zzc> zzmuVar = zzd;
                    if (zzmuVar != null) {
                        return zzmuVar;
                    }
                    synchronized (zzc.class) {
                        try {
                            zzaVar = zzd;
                            if (zzaVar == null) {
                                zzaVar = new zzlc.zza(zzc);
                                zzd = zzaVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return zzaVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public static /* synthetic */ void zza(zzc zzcVar, String str) {
            str.getClass();
            zzcVar.zze |= 8;
            zzcVar.zzi = str;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class zze extends zzlc<zze, zza> implements zzmn {
        private static final zze zzc;
        private static volatile zzmu<zze> zzd;
        private int zze;
        private int zzf;
        private String zzg = "";
        private zzc zzh;
        private boolean zzi;
        private boolean zzj;
        private boolean zzk;

        /* JADX INFO: compiled from: Proguard */
        public static final class zza extends zzlc.zzb<zze, zza> implements zzmn {
            public /* synthetic */ zza(zzft zzftVar) {
                this();
            }

            public final zza zza(String str) {
                zzak();
                zze.zza((zze) this.zza, str);
                return this;
            }

            private zza() {
                super(zze.zzd());
            }
        }

        static {
            zze zzeVar = new zze();
            zzc = zzeVar;
            zzlc.zza((Class<zze>) zze.class, zzeVar);
        }

        private zze() {
        }

        public static zza zzc() {
            return zzc.zzcc();
        }

        public static /* bridge */ /* synthetic */ zze zzd() {
            return zzc;
        }

        public final int zza() {
            return this.zzf;
        }

        public final zzc zzb() {
            zzc zzcVar = this.zzh;
            return zzcVar == null ? zzc.zzb() : zzcVar;
        }

        public final String zze() {
            return this.zzg;
        }

        public final boolean zzf() {
            return this.zzi;
        }

        public final boolean zzg() {
            return this.zzj;
        }

        public final boolean zzh() {
            return this.zzk;
        }

        public final boolean zzi() {
            return (this.zze & 1) != 0;
        }

        public final boolean zzj() {
            return (this.zze & 32) != 0;
        }

        @Override // com.google.android.gms.internal.measurement.zzlc
        public final Object zza(int i, Object obj, Object obj2) {
            zzmu zzaVar;
            switch (zzfm.zza[i - 1]) {
                case 1:
                    return new zze();
                case 2:
                    return new zza(null);
                case 3:
                    return zzlc.zza(zzc, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
                case 4:
                    return zzc;
                case 5:
                    zzmu<zze> zzmuVar = zzd;
                    if (zzmuVar != null) {
                        return zzmuVar;
                    }
                    synchronized (zze.class) {
                        try {
                            zzaVar = zzd;
                            if (zzaVar == null) {
                                zzaVar = new zzlc.zza(zzc);
                                zzd = zzaVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return zzaVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public static /* synthetic */ void zza(zze zzeVar, String str) {
            str.getClass();
            zzeVar.zze |= 2;
            zzeVar.zzg = str;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class zzf extends zzlc<zzf, zza> implements zzmn {
        private static final zzf zzc;
        private static volatile zzmu<zzf> zzd;
        private int zze;
        private int zzf;
        private boolean zzh;
        private String zzg = "";
        private zzll<String> zzi = zzlc.zzch();

        /* JADX INFO: compiled from: Proguard */
        public static final class zza extends zzlc.zzb<zzf, zza> implements zzmn {
            public /* synthetic */ zza(zzfu zzfuVar) {
                this();
            }

            private zza() {
                super(zzf.zzc());
            }
        }

        /* JADX INFO: compiled from: Proguard */
        public enum zzb implements zzlh {
            UNKNOWN_MATCH_TYPE(0),
            REGEXP(1),
            BEGINS_WITH(2),
            ENDS_WITH(3),
            PARTIAL(4),
            EXACT(5),
            IN_LIST(6);

            private final int zzi;

            zzb(int i) {
                this.zzi = i;
            }

            public static zzlg zzb() {
                return zzfv.zza;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + zzb.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzi + " name=" + name() + '>';
            }

            @Override // com.google.android.gms.internal.measurement.zzlh
            public final int zza() {
                return this.zzi;
            }

            public static zzb zza(int i) {
                switch (i) {
                    case 0:
                        return UNKNOWN_MATCH_TYPE;
                    case 1:
                        return REGEXP;
                    case 2:
                        return BEGINS_WITH;
                    case 3:
                        return ENDS_WITH;
                    case 4:
                        return PARTIAL;
                    case 5:
                        return EXACT;
                    case 6:
                        return IN_LIST;
                    default:
                        return null;
                }
            }
        }

        static {
            zzf zzfVar = new zzf();
            zzc = zzfVar;
            zzlc.zza((Class<zzf>) zzf.class, zzfVar);
        }

        private zzf() {
        }

        public static /* bridge */ /* synthetic */ zzf zzc() {
            return zzc;
        }

        public static zzf zzd() {
            return zzc;
        }

        public final int zza() {
            return this.zzi.size();
        }

        public final zzb zzb() {
            zzb zzbVarZza = zzb.zza(this.zzf);
            return zzbVarZza == null ? zzb.UNKNOWN_MATCH_TYPE : zzbVarZza;
        }

        public final String zze() {
            return this.zzg;
        }

        public final List<String> zzf() {
            return this.zzi;
        }

        public final boolean zzg() {
            return this.zzh;
        }

        public final boolean zzh() {
            return (this.zze & 4) != 0;
        }

        public final boolean zzi() {
            return (this.zze & 2) != 0;
        }

        public final boolean zzj() {
            return (this.zze & 1) != 0;
        }

        @Override // com.google.android.gms.internal.measurement.zzlc
        public final Object zza(int i, Object obj, Object obj2) {
            zzmu zzaVar;
            switch (zzfm.zza[i - 1]) {
                case 1:
                    return new zzf();
                case 2:
                    return new zza(null);
                case 3:
                    return zzlc.zza(zzc, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zze", "zzf", zzb.zzb(), "zzg", "zzh", "zzi"});
                case 4:
                    return zzc;
                case 5:
                    zzmu<zzf> zzmuVar = zzd;
                    if (zzmuVar != null) {
                        return zzmuVar;
                    }
                    synchronized (zzf.class) {
                        try {
                            zzaVar = zzd;
                            if (zzaVar == null) {
                                zzaVar = new zzlc.zza(zzc);
                                zzd = zzaVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return zzaVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class zzd extends zzlc<zzd, zza> implements zzmn {
        private static final zzd zzc;
        private static volatile zzmu<zzd> zzd;
        private int zze;
        private int zzf;
        private boolean zzg;
        private String zzh = "";
        private String zzi = "";
        private String zzj = "";

        /* JADX INFO: compiled from: Proguard */
        public static final class zza extends zzlc.zzb<zzd, zza> implements zzmn {
            public /* synthetic */ zza(zzfr zzfrVar) {
                this();
            }

            private zza() {
                super(zzd.zzb());
            }
        }

        /* JADX INFO: compiled from: Proguard */
        public enum zzb implements zzlh {
            UNKNOWN_COMPARISON_TYPE(0),
            LESS_THAN(1),
            GREATER_THAN(2),
            EQUAL(3),
            BETWEEN(4);

            private final int zzg;

            zzb(int i) {
                this.zzg = i;
            }

            public static zzlg zzb() {
                return zzfs.zza;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + zzb.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzg + " name=" + name() + '>';
            }

            @Override // com.google.android.gms.internal.measurement.zzlh
            public final int zza() {
                return this.zzg;
            }

            public static zzb zza(int i) {
                if (i == 0) {
                    return UNKNOWN_COMPARISON_TYPE;
                }
                if (i == 1) {
                    return LESS_THAN;
                }
                if (i == 2) {
                    return GREATER_THAN;
                }
                if (i == 3) {
                    return EQUAL;
                }
                if (i != 4) {
                    return null;
                }
                return BETWEEN;
            }
        }

        static {
            zzd zzdVar = new zzd();
            zzc = zzdVar;
            zzlc.zza((Class<zzd>) zzd.class, zzdVar);
        }

        private zzd() {
        }

        public static /* bridge */ /* synthetic */ zzd zzb() {
            return zzc;
        }

        public static zzd zzc() {
            return zzc;
        }

        public final zzb zza() {
            zzb zzbVarZza = zzb.zza(this.zzf);
            return zzbVarZza == null ? zzb.UNKNOWN_COMPARISON_TYPE : zzbVarZza;
        }

        public final String zzd() {
            return this.zzh;
        }

        public final String zze() {
            return this.zzj;
        }

        public final String zzf() {
            return this.zzi;
        }

        public final boolean zzg() {
            return this.zzg;
        }

        public final boolean zzh() {
            return (this.zze & 1) != 0;
        }

        public final boolean zzi() {
            return (this.zze & 4) != 0;
        }

        public final boolean zzj() {
            return (this.zze & 2) != 0;
        }

        public final boolean zzk() {
            return (this.zze & 16) != 0;
        }

        public final boolean zzl() {
            return (this.zze & 8) != 0;
        }

        @Override // com.google.android.gms.internal.measurement.zzlc
        public final Object zza(int i, Object obj, Object obj2) {
            zzmu zzaVar;
            switch (zzfm.zza[i - 1]) {
                case 1:
                    return new zzd();
                case 2:
                    return new zza(null);
                case 3:
                    return zzlc.zza(zzc, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zze", "zzf", zzb.zzb(), "zzg", "zzh", "zzi", "zzj"});
                case 4:
                    return zzc;
                case 5:
                    zzmu<zzd> zzmuVar = zzd;
                    if (zzmuVar != null) {
                        return zzmuVar;
                    }
                    synchronized (zzd.class) {
                        try {
                            zzaVar = zzd;
                            if (zzaVar == null) {
                                zzaVar = new zzlc.zza(zzc);
                                zzd = zzaVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return zzaVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }
}
