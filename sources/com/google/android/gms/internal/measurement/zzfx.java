package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzfn;
import com.google.android.gms.internal.measurement.zzhg;
import com.google.android.gms.internal.measurement.zzlc;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfx {

    /* JADX INFO: compiled from: Proguard */
    public static final class zza extends zzlc<zza, C6446zza> implements zzmn {
        private static final zza zzc;
        private static volatile zzmu<zza> zzd;
        private int zze;
        private boolean zzi;
        private zzll<zzb> zzf = zzlc.zzch();
        private zzll<zzc> zzg = zzlc.zzch();
        private zzll<zzf> zzh = zzlc.zzch();
        private zzll<zzb> zzj = zzlc.zzch();

        /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.zzfx$zza$zza, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Proguard */
        public static final class C6446zza extends zzlc.zzb<zza, C6446zza> implements zzmn {
            public /* synthetic */ C6446zza(zzfy zzfyVar) {
                this();
            }

            private C6446zza() {
                super(zza.zza());
            }
        }

        /* JADX INFO: compiled from: Proguard */
        public static final class zzb extends zzlc<zzb, C6447zza> implements zzmn {
            private static final zzb zzc;
            private static volatile zzmu<zzb> zzd;
            private int zze;
            private int zzf;
            private int zzg;

            /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.zzfx$zza$zzb$zza, reason: collision with other inner class name */
            /* JADX INFO: compiled from: Proguard */
            public static final class C6447zza extends zzlc.zzb<zzb, C6447zza> implements zzmn {
                public /* synthetic */ C6447zza(zzfz zzfzVar) {
                    this();
                }

                private C6447zza() {
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

            public final zzd zzb() {
                zzd zzdVarZza = zzd.zza(this.zzg);
                return zzdVarZza == null ? zzd.CONSENT_STATUS_UNSPECIFIED : zzdVarZza;
            }

            public final zze zzc() {
                zze zzeVarZza = zze.zza(this.zzf);
                return zzeVarZza == null ? zze.CONSENT_TYPE_UNSPECIFIED : zzeVarZza;
            }

            @Override // com.google.android.gms.internal.measurement.zzlc
            public final Object zza(int i, Object obj, Object obj2) {
                zzmu zzaVar;
                switch (zzfw.zza[i - 1]) {
                    case 1:
                        return new zzb();
                    case 2:
                        return new C6447zza(null);
                    case 3:
                        return zzlc.zza(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zze", "zzf", zze.zzb(), "zzg", zzd.zzb()});
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
        public static final class zzc extends zzlc<zzc, C6448zza> implements zzmn {
            private static final zzc zzc;
            private static volatile zzmu<zzc> zzd;
            private int zze;
            private int zzf;
            private int zzg;

            /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.zzfx$zza$zzc$zza, reason: collision with other inner class name */
            /* JADX INFO: compiled from: Proguard */
            public static final class C6448zza extends zzlc.zzb<zzc, C6448zza> implements zzmn {
                public /* synthetic */ C6448zza(zzga zzgaVar) {
                    this();
                }

                private C6448zza() {
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

            public final zze zzb() {
                zze zzeVarZza = zze.zza(this.zzg);
                return zzeVarZza == null ? zze.CONSENT_TYPE_UNSPECIFIED : zzeVarZza;
            }

            public final zze zzc() {
                zze zzeVarZza = zze.zza(this.zzf);
                return zzeVarZza == null ? zze.CONSENT_TYPE_UNSPECIFIED : zzeVarZza;
            }

            @Override // com.google.android.gms.internal.measurement.zzlc
            public final Object zza(int i, Object obj, Object obj2) {
                zzmu zzaVar;
                switch (zzfw.zza[i - 1]) {
                    case 1:
                        return new zzc();
                    case 2:
                        return new C6448zza(null);
                    case 3:
                        return zzlc.zza(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zze", "zzf", zze.zzb(), "zzg", zze.zzb()});
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
        public enum zzd implements zzlh {
            CONSENT_STATUS_UNSPECIFIED(0),
            GRANTED(1),
            DENIED(2);

            private final int zze;

            zzd(int i) {
                this.zze = i;
            }

            public static zzlg zzb() {
                return zzgb.zza;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + zzd.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zze + " name=" + name() + '>';
            }

            @Override // com.google.android.gms.internal.measurement.zzlh
            public final int zza() {
                return this.zze;
            }

            public static zzd zza(int i) {
                if (i == 0) {
                    return CONSENT_STATUS_UNSPECIFIED;
                }
                if (i == 1) {
                    return GRANTED;
                }
                if (i != 2) {
                    return null;
                }
                return DENIED;
            }
        }

        /* JADX INFO: compiled from: Proguard */
        public enum zze implements zzlh {
            CONSENT_TYPE_UNSPECIFIED(0),
            AD_STORAGE(1),
            ANALYTICS_STORAGE(2),
            AD_USER_DATA(3),
            AD_PERSONALIZATION(4);

            private final int zzg;

            zze(int i) {
                this.zzg = i;
            }

            public static zzlg zzb() {
                return zzgc.zza;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + zze.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzg + " name=" + name() + '>';
            }

            @Override // com.google.android.gms.internal.measurement.zzlh
            public final int zza() {
                return this.zzg;
            }

            public static zze zza(int i) {
                if (i == 0) {
                    return CONSENT_TYPE_UNSPECIFIED;
                }
                if (i == 1) {
                    return AD_STORAGE;
                }
                if (i == 2) {
                    return ANALYTICS_STORAGE;
                }
                if (i == 3) {
                    return AD_USER_DATA;
                }
                if (i != 4) {
                    return null;
                }
                return AD_PERSONALIZATION;
            }
        }

        /* JADX INFO: compiled from: Proguard */
        public static final class zzf extends zzlc<zzf, C6449zza> implements zzmn {
            private static final zzf zzc;
            private static volatile zzmu<zzf> zzd;
            private int zze;
            private String zzf = "";
            private String zzg = "";

            /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.zzfx$zza$zzf$zza, reason: collision with other inner class name */
            /* JADX INFO: compiled from: Proguard */
            public static final class C6449zza extends zzlc.zzb<zzf, C6449zza> implements zzmn {
                public /* synthetic */ C6449zza(zzgd zzgdVar) {
                    this();
                }

                private C6449zza() {
                    super(zzf.zza());
                }
            }

            static {
                zzf zzfVar = new zzf();
                zzc = zzfVar;
                zzlc.zza((Class<zzf>) zzf.class, zzfVar);
            }

            private zzf() {
            }

            public static /* bridge */ /* synthetic */ zzf zza() {
                return zzc;
            }

            public final String zzb() {
                return this.zzf;
            }

            @Override // com.google.android.gms.internal.measurement.zzlc
            public final Object zza(int i, Object obj, Object obj2) {
                zzmu zzaVar;
                switch (zzfw.zza[i - 1]) {
                    case 1:
                        return new zzf();
                    case 2:
                        return new C6449zza(null);
                    case 3:
                        return zzlc.zza(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
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

        static {
            zza zzaVar = new zza();
            zzc = zzaVar;
            zzlc.zza((Class<zza>) zza.class, zzaVar);
        }

        private zza() {
        }

        public static /* bridge */ /* synthetic */ zza zza() {
            return zzc;
        }

        public static zza zzb() {
            return zzc;
        }

        public final List<zzf> zzc() {
            return this.zzh;
        }

        public final List<zzb> zzd() {
            return this.zzf;
        }

        public final List<zzc> zze() {
            return this.zzg;
        }

        public final List<zzb> zzf() {
            return this.zzj;
        }

        public final boolean zzg() {
            return this.zzi;
        }

        public final boolean zzh() {
            return (this.zze & 1) != 0;
        }

        @Override // com.google.android.gms.internal.measurement.zzlc
        public final Object zza(int i, Object obj, Object obj2) {
            zzmu zzaVar;
            switch (zzfw.zza[i - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C6446zza(null);
                case 3:
                    return zzlc.zza(zzc, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004ဇ\u0000\u0005\u001b", new Object[]{"zze", "zzf", zzb.class, "zzg", zzc.class, "zzh", zzf.class, "zzi", "zzj", zzb.class});
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
        private zzll<zzg> zzg = zzlc.zzch();
        private boolean zzh;

        /* JADX INFO: compiled from: Proguard */
        public static final class zza extends zzlc.zzb<zzb, zza> implements zzmn {
            public /* synthetic */ zza(zzge zzgeVar) {
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

        @Override // com.google.android.gms.internal.measurement.zzlc
        public final Object zza(int i, Object obj, Object obj2) {
            zzmu zzaVar;
            switch (zzfw.zza[i - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza(null);
                case 3:
                    return zzlc.zza(zzc, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"zze", "zzf", "zzg", zzg.class, "zzh"});
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
        private String zzf = "";
        private boolean zzg;
        private boolean zzh;
        private int zzi;

        /* JADX INFO: compiled from: Proguard */
        public static final class zza extends zzlc.zzb<zzc, zza> implements zzmn {
            public /* synthetic */ zza(zzgf zzgfVar) {
                this();
            }

            public final int zza() {
                return ((zzc) this.zza).zza();
            }

            public final String zzb() {
                return ((zzc) this.zza).zzc();
            }

            public final boolean zzc() {
                return ((zzc) this.zza).zzd();
            }

            public final boolean zzd() {
                return ((zzc) this.zza).zze();
            }

            public final boolean zze() {
                return ((zzc) this.zza).zzf();
            }

            public final boolean zzf() {
                return ((zzc) this.zza).zzg();
            }

            public final boolean zzg() {
                return ((zzc) this.zza).zzh();
            }

            private zza() {
                super(zzc.zzb());
            }

            public final zza zza(String str) {
                zzak();
                zzc.zza((zzc) this.zza, str);
                return this;
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

        public final int zza() {
            return this.zzi;
        }

        public final String zzc() {
            return this.zzf;
        }

        public final boolean zzd() {
            return this.zzg;
        }

        public final boolean zze() {
            return this.zzh;
        }

        public final boolean zzf() {
            return (this.zze & 2) != 0;
        }

        public final boolean zzg() {
            return (this.zze & 4) != 0;
        }

        public final boolean zzh() {
            return (this.zze & 8) != 0;
        }

        @Override // com.google.android.gms.internal.measurement.zzlc
        public final Object zza(int i, Object obj, Object obj2) {
            zzmu zzaVar;
            switch (zzfw.zza[i - 1]) {
                case 1:
                    return new zzc();
                case 2:
                    return new zza(null);
                case 3:
                    return zzlc.zza(zzc, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
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
            zzcVar.zze |= 1;
            zzcVar.zzf = str;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class zzd extends zzlc<zzd, zza> implements zzmn {
        private static final zzd zzc;
        private static volatile zzmu<zzd> zzd;
        private int zze;
        private long zzf;
        private int zzh;
        private boolean zzm;
        private zza zzr;
        private zzf zzs;
        private zzi zzt;
        private zzg zzu;
        private zze zzv;
        private String zzg = "";
        private zzll<zzh> zzi = zzlc.zzch();
        private zzll<zzc> zzj = zzlc.zzch();
        private zzll<zzfn.zza> zzk = zzlc.zzch();
        private String zzl = "";
        private zzll<zzhg.zzc> zzn = zzlc.zzch();
        private zzll<zzb> zzo = zzlc.zzch();
        private String zzp = "";
        private String zzq = "";

        /* JADX INFO: compiled from: Proguard */
        public static final class zza extends zzlc.zzb<zzd, zza> implements zzmn {
            public /* synthetic */ zza(zzgg zzggVar) {
                this();
            }

            public final int zza() {
                return ((zzd) this.zza).zzb();
            }

            public final zza zzb() {
                zzak();
                zzd.zza((zzd) this.zza);
                return this;
            }

            public final String zzc() {
                return ((zzd) this.zza).zzj();
            }

            public final List<zzfn.zza> zzd() {
                return Collections.unmodifiableList(((zzd) this.zza).zzk());
            }

            public final List<zzb> zze() {
                return Collections.unmodifiableList(((zzd) this.zza).zzl());
            }

            private zza() {
                super(zzd.zzf());
            }

            public final zzc zza(int i) {
                return ((zzd) this.zza).zza(i);
            }

            public final zza zza(int i, zzc.zza zzaVar) {
                zzak();
                zzd.zza((zzd) this.zza, i, (zzc) ((zzlc) zzaVar.zzai()));
                return this;
            }
        }

        static {
            zzd zzdVar = new zzd();
            zzc = zzdVar;
            zzlc.zza((Class<zzd>) zzd.class, zzdVar);
        }

        private zzd() {
        }

        public static zza zze() {
            return zzc.zzcc();
        }

        public static /* bridge */ /* synthetic */ zzd zzf() {
            return zzc;
        }

        public static zzd zzg() {
            return zzc;
        }

        public final int zza() {
            return this.zzn.size();
        }

        public final int zzb() {
            return this.zzj.size();
        }

        public final long zzc() {
            return this.zzf;
        }

        public final zza zzd() {
            zza zzaVar = this.zzr;
            return zzaVar == null ? zza.zzb() : zzaVar;
        }

        public final zzi zzh() {
            zzi zziVar = this.zzt;
            return zziVar == null ? zzi.zzc() : zziVar;
        }

        public final String zzi() {
            return this.zzg;
        }

        public final String zzj() {
            return this.zzp;
        }

        public final List<zzfn.zza> zzk() {
            return this.zzk;
        }

        public final List<zzb> zzl() {
            return this.zzo;
        }

        public final List<zzhg.zzc> zzm() {
            return this.zzn;
        }

        public final List<zzh> zzn() {
            return this.zzi;
        }

        public final boolean zzo() {
            return this.zzm;
        }

        public final boolean zzp() {
            return (this.zze & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0;
        }

        public final boolean zzq() {
            return (this.zze & 2) != 0;
        }

        public final boolean zzr() {
            return (this.zze & 512) != 0;
        }

        public final boolean zzs() {
            return (this.zze & 1) != 0;
        }

        public final zzc zza(int i) {
            return this.zzj.get(i);
        }

        @Override // com.google.android.gms.internal.measurement.zzlc
        public final Object zza(int i, Object obj, Object obj2) {
            zzmu zzaVar;
            switch (zzfw.zza[i - 1]) {
                case 1:
                    return new zzd();
                case 2:
                    return new zza(null);
                case 3:
                    return zzlc.zza(zzc, "\u0004\u0011\u0000\u0001\u0001\u0013\u0011\u0000\u0005\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005\u000eဈ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011ဉ\t\u0012ဉ\n\u0013ဉ\u000b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", zzh.class, "zzj", zzc.class, "zzk", zzfn.zza.class, "zzl", "zzm", "zzn", zzhg.zzc.class, "zzo", zzb.class, "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv"});
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

        public static /* synthetic */ void zza(zzd zzdVar) {
            zzdVar.zzk = zzlc.zzch();
        }

        public static /* synthetic */ void zza(zzd zzdVar, int i, zzc zzcVar) {
            zzcVar.getClass();
            zzll<zzc> zzllVar = zzdVar.zzj;
            if (!zzllVar.zzc()) {
                zzdVar.zzj = zzlc.zza(zzllVar);
            }
            zzdVar.zzj.set(i, zzcVar);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class zze extends zzlc<zze, zza> implements zzmn {
        private static final zze zzc;
        private static volatile zzmu<zze> zzd;
        private zzll<String> zze = zzlc.zzch();

        /* JADX INFO: compiled from: Proguard */
        public static final class zza extends zzlc.zzb<zze, zza> implements zzmn {
            public /* synthetic */ zza(zzgh zzghVar) {
                this();
            }

            private zza() {
                super(zze.zza());
            }
        }

        static {
            zze zzeVar = new zze();
            zzc = zzeVar;
            zzlc.zza((Class<zze>) zze.class, zzeVar);
        }

        private zze() {
        }

        public static /* bridge */ /* synthetic */ zze zza() {
            return zzc;
        }

        @Override // com.google.android.gms.internal.measurement.zzlc
        public final Object zza(int i, Object obj, Object obj2) {
            zzmu zzaVar;
            switch (zzfw.zza[i - 1]) {
                case 1:
                    return new zze();
                case 2:
                    return new zza(null);
                case 3:
                    return zzlc.zza(zzc, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zze"});
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
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class zzf extends zzlc<zzf, zza> implements zzmn {
        private static final zzf zzc;
        private static volatile zzmu<zzf> zzd;
        private int zze;
        private int zzf = 14;
        private int zzg = 11;
        private int zzh = 60;

        /* JADX INFO: compiled from: Proguard */
        public static final class zza extends zzlc.zzb<zzf, zza> implements zzmn {
            public /* synthetic */ zza(zzgi zzgiVar) {
                this();
            }

            private zza() {
                super(zzf.zza());
            }
        }

        static {
            zzf zzfVar = new zzf();
            zzc = zzfVar;
            zzlc.zza((Class<zzf>) zzf.class, zzfVar);
        }

        private zzf() {
        }

        public static /* bridge */ /* synthetic */ zzf zza() {
            return zzc;
        }

        @Override // com.google.android.gms.internal.measurement.zzlc
        public final Object zza(int i, Object obj, Object obj2) {
            zzmu zzaVar;
            switch (zzfw.zza[i - 1]) {
                case 1:
                    return new zzf();
                case 2:
                    return new zza(null);
                case 3:
                    return zzlc.zza(zzc, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
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
    public static final class zzg extends zzlc<zzg, zza> implements zzmn {
        private static final zzg zzc;
        private static volatile zzmu<zzg> zzd;
        private int zze;
        private String zzf = "";
        private String zzg = "";

        /* JADX INFO: compiled from: Proguard */
        public static final class zza extends zzlc.zzb<zzg, zza> implements zzmn {
            public /* synthetic */ zza(zzgj zzgjVar) {
                this();
            }

            private zza() {
                super(zzg.zza());
            }
        }

        static {
            zzg zzgVar = new zzg();
            zzc = zzgVar;
            zzlc.zza((Class<zzg>) zzg.class, zzgVar);
        }

        private zzg() {
        }

        public static /* bridge */ /* synthetic */ zzg zza() {
            return zzc;
        }

        @Override // com.google.android.gms.internal.measurement.zzlc
        public final Object zza(int i, Object obj, Object obj2) {
            zzmu zzaVar;
            switch (zzfw.zza[i - 1]) {
                case 1:
                    return new zzg();
                case 2:
                    return new zza(null);
                case 3:
                    return zzlc.zza(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
                case 4:
                    return zzc;
                case 5:
                    zzmu<zzg> zzmuVar = zzd;
                    if (zzmuVar != null) {
                        return zzmuVar;
                    }
                    synchronized (zzg.class) {
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
    public static final class zzh extends zzlc<zzh, zza> implements zzmn {
        private static final zzh zzc;
        private static volatile zzmu<zzh> zzd;
        private int zze;
        private String zzf = "";
        private String zzg = "";

        /* JADX INFO: compiled from: Proguard */
        public static final class zza extends zzlc.zzb<zzh, zza> implements zzmn {
            public /* synthetic */ zza(zzgk zzgkVar) {
                this();
            }

            private zza() {
                super(zzh.zza());
            }
        }

        static {
            zzh zzhVar = new zzh();
            zzc = zzhVar;
            zzlc.zza((Class<zzh>) zzh.class, zzhVar);
        }

        private zzh() {
        }

        public static /* bridge */ /* synthetic */ zzh zza() {
            return zzc;
        }

        public final String zzb() {
            return this.zzf;
        }

        public final String zzc() {
            return this.zzg;
        }

        @Override // com.google.android.gms.internal.measurement.zzlc
        public final Object zza(int i, Object obj, Object obj2) {
            zzmu zzaVar;
            switch (zzfw.zza[i - 1]) {
                case 1:
                    return new zzh();
                case 2:
                    return new zza(null);
                case 3:
                    return zzlc.zza(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
                case 4:
                    return zzc;
                case 5:
                    zzmu<zzh> zzmuVar = zzd;
                    if (zzmuVar != null) {
                        return zzmuVar;
                    }
                    synchronized (zzh.class) {
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
    public static final class zzi extends zzlc<zzi, zza> implements zzmn {
        private static final zzi zzc;
        private static volatile zzmu<zzi> zzd;
        private int zze;
        private String zzf = "";
        private String zzg = "";
        private String zzh = "";
        private int zzi;

        /* JADX INFO: compiled from: Proguard */
        public static final class zza extends zzlc.zzb<zzi, zza> implements zzmn {
            public /* synthetic */ zza(zzgl zzglVar) {
                this();
            }

            private zza() {
                super(zzi.zzb());
            }
        }

        static {
            zzi zziVar = new zzi();
            zzc = zziVar;
            zzlc.zza((Class<zzi>) zzi.class, zziVar);
        }

        private zzi() {
        }

        public static /* bridge */ /* synthetic */ zzi zzb() {
            return zzc;
        }

        public static zzi zzc() {
            return zzc;
        }

        public final int zza() {
            return this.zzi;
        }

        public final String zzd() {
            return this.zzg;
        }

        public final String zze() {
            return this.zzf;
        }

        @Override // com.google.android.gms.internal.measurement.zzlc
        public final Object zza(int i, Object obj, Object obj2) {
            zzmu zzaVar;
            switch (zzfw.zza[i - 1]) {
                case 1:
                    return new zzi();
                case 2:
                    return new zza(null);
                case 3:
                    return zzlc.zza(zzc, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
                case 4:
                    return zzc;
                case 5:
                    zzmu<zzi> zzmuVar = zzd;
                    if (zzmuVar != null) {
                        return zzmuVar;
                    }
                    synchronized (zzi.class) {
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
