package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzlc;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhg {

    /* JADX INFO: compiled from: Proguard */
    public static final class zza extends zzlc<zza, C6451zza> implements zzmn {
        private static final zza zzc;
        private static volatile zzmu<zza> zzd;
        private zzll<zzb> zze = zzlc.zzch();

        /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.zzhg$zza$zza, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Proguard */
        public static final class C6451zza extends zzlc.zzb<zza, C6451zza> implements zzmn {
            public /* synthetic */ C6451zza(zzhj zzhjVar) {
                this();
            }

            private C6451zza() {
                super(zza.zzb());
            }
        }

        static {
            zza zzaVar = new zza();
            zzc = zzaVar;
            zzlc.zza((Class<zza>) zza.class, zzaVar);
        }

        private zza() {
        }

        public static /* bridge */ /* synthetic */ zza zzb() {
            return zzc;
        }

        public static zza zzc() {
            return zzc;
        }

        public final int zza() {
            return this.zze.size();
        }

        public final List<zzb> zzd() {
            return this.zze;
        }

        @Override // com.google.android.gms.internal.measurement.zzlc
        public final Object zza(int i, Object obj, Object obj2) {
            zzmu zzaVar;
            switch (zzhi.zza[i - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C6451zza(null);
                case 3:
                    return zzlc.zza(zzc, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", zzb.class});
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
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class zzb extends zzlc<zzb, zza> implements zzmn {
        private static final zzb zzc;
        private static volatile zzmu<zzb> zzd;
        private int zze;
        private String zzf = "";
        private zzll<zzd> zzg = zzlc.zzch();

        /* JADX INFO: compiled from: Proguard */
        public static final class zza extends zzlc.zzb<zzb, zza> implements zzmn {
            public /* synthetic */ zza(zzhk zzhkVar) {
                this();
            }

            private zza() {
                super(zzb.zza());
            }
        }

        static {
            zzb zzbVar = new zzb();
            zzc = zzbVar;
            zzlc.zza((Class<zzb>) zzb.class, zzbVar);
        }

        private zzb() {
        }

        public static /* bridge */ /* synthetic */ zzb zza() {
            return zzc;
        }

        public final String zzb() {
            return this.zzf;
        }

        public final List<zzd> zzc() {
            return this.zzg;
        }

        @Override // com.google.android.gms.internal.measurement.zzlc
        public final Object zza(int i, Object obj, Object obj2) {
            zzmu zzaVar;
            switch (zzhi.zza[i - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza(null);
                case 3:
                    return zzlc.zza(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zze", "zzf", "zzg", zzd.class});
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
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class zzc extends zzlc<zzc, zza> implements zzmn {
        private static final zzc zzc;
        private static volatile zzmu<zzc> zzd;
        private int zze;
        private zzll<zzd> zzf = zzlc.zzch();
        private zza zzg;

        /* JADX INFO: compiled from: Proguard */
        public static final class zza extends zzlc.zzb<zzc, zza> implements zzmn {
            public /* synthetic */ zza(zzhl zzhlVar) {
                this();
            }

            private zza() {
                super(zzc.zzb());
            }
        }

        static {
            zzc zzcVar = new zzc();
            zzc = zzcVar;
            zzlc.zza((Class<zzc>) zzc.class, zzcVar);
        }

        private zzc() {
        }

        public static /* bridge */ /* synthetic */ zzc zzb() {
            return zzc;
        }

        public final zza zza() {
            zza zzaVar = this.zzg;
            return zzaVar == null ? zza.zzc() : zzaVar;
        }

        public final List<zzd> zzc() {
            return this.zzf;
        }

        @Override // com.google.android.gms.internal.measurement.zzlc
        public final Object zza(int i, Object obj, Object obj2) {
            zzmu zzaVar;
            switch (zzhi.zza[i - 1]) {
                case 1:
                    return new zzc();
                case 2:
                    return new zza(null);
                case 3:
                    return zzlc.zza(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zze", "zzf", zzd.class, "zzg"});
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
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class zzd extends zzlc<zzd, zza> implements zzmn {
        private static final zzd zzc;
        private static volatile zzmu<zzd> zzd;
        private int zze;
        private int zzf;
        private zzll<zzd> zzg = zzlc.zzch();
        private String zzh = "";
        private String zzi = "";
        private boolean zzj;
        private double zzk;

        /* JADX INFO: compiled from: Proguard */
        public static final class zza extends zzlc.zzb<zzd, zza> implements zzmn {
            public /* synthetic */ zza(zzhm zzhmVar) {
                this();
            }

            private zza() {
                super(zzd.zzc());
            }
        }

        /* JADX INFO: compiled from: Proguard */
        public enum zzb implements zzlh {
            UNKNOWN(0),
            STRING(1),
            NUMBER(2),
            BOOLEAN(3),
            STATEMENT(4);

            private final int zzg;

            zzb(int i) {
                this.zzg = i;
            }

            public static zzlg zzb() {
                return zzho.zza;
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
                    return UNKNOWN;
                }
                if (i == 1) {
                    return STRING;
                }
                if (i == 2) {
                    return NUMBER;
                }
                if (i == 3) {
                    return BOOLEAN;
                }
                if (i != 4) {
                    return null;
                }
                return STATEMENT;
            }
        }

        static {
            zzd zzdVar = new zzd();
            zzc = zzdVar;
            zzlc.zza((Class<zzd>) zzd.class, zzdVar);
        }

        private zzd() {
        }

        public static /* bridge */ /* synthetic */ zzd zzc() {
            return zzc;
        }

        public final double zza() {
            return this.zzk;
        }

        public final zzb zzb() {
            zzb zzbVarZza = zzb.zza(this.zzf);
            return zzbVarZza == null ? zzb.UNKNOWN : zzbVarZza;
        }

        public final String zzd() {
            return this.zzh;
        }

        public final String zze() {
            return this.zzi;
        }

        public final List<zzd> zzf() {
            return this.zzg;
        }

        public final boolean zzg() {
            return this.zzj;
        }

        public final boolean zzh() {
            return (this.zze & 8) != 0;
        }

        public final boolean zzi() {
            return (this.zze & 16) != 0;
        }

        public final boolean zzj() {
            return (this.zze & 4) != 0;
        }

        @Override // com.google.android.gms.internal.measurement.zzlc
        public final Object zza(int i, Object obj, Object obj2) {
            zzmu zzaVar;
            switch (zzhi.zza[i - 1]) {
                case 1:
                    return new zzd();
                case 2:
                    return new zza(null);
                case 3:
                    return zzlc.zza(zzc, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zze", "zzf", zzb.zzb(), "zzg", zzd.class, "zzh", "zzi", "zzj", "zzk"});
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
