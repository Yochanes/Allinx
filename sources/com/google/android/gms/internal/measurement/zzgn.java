package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzlc;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgn {

    /* JADX INFO: compiled from: Proguard */
    public static final class zza extends zzlc<zza, C6450zza> implements zzmn {
        private static final zza zzc;
        private static volatile zzmu<zza> zzd;
        private int zze;
        private long zzi;
        private long zzm;
        private String zzf = "";
        private String zzg = "";
        private String zzh = "";
        private String zzj = "";
        private String zzk = "";
        private String zzl = "";

        /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.zzgn$zza$zza, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Proguard */
        public static final class C6450zza extends zzlc.zzb<zza, C6450zza> implements zzmn {
            public /* synthetic */ C6450zza(zzgq zzgqVar) {
                this();
            }

            public final long zza() {
                return ((zza) this.zza).zza();
            }

            public final long zzb() {
                return ((zza) this.zza).zzb();
            }

            public final C6450zza zzc() {
                zzak();
                zza.zza((zza) this.zza);
                return this;
            }

            public final C6450zza zzd() {
                zzak();
                zza.zzb((zza) this.zza);
                return this;
            }

            public final C6450zza zze() {
                zzak();
                zza.zzc((zza) this.zza);
                return this;
            }

            public final C6450zza zzf() {
                zzak();
                zza.zzd((zza) this.zza);
                return this;
            }

            public final C6450zza zzg() {
                zzak();
                zza.zze((zza) this.zza);
                return this;
            }

            public final C6450zza zzh() {
                zzak();
                zza.zzf((zza) this.zza);
                return this;
            }

            private C6450zza() {
                super(zza.zzd());
            }

            public final C6450zza zza(String str) {
                zzak();
                zza.zza((zza) this.zza, str);
                return this;
            }

            public final C6450zza zzb(String str) {
                zzak();
                zza.zzb((zza) this.zza, str);
                return this;
            }

            public final C6450zza zzc(String str) {
                zzak();
                zza.zzc((zza) this.zza, str);
                return this;
            }

            public final C6450zza zzd(String str) {
                zzak();
                zza.zzd((zza) this.zza, str);
                return this;
            }

            public final C6450zza zze(String str) {
                zzak();
                zza.zze((zza) this.zza, str);
                return this;
            }

            public final C6450zza zzf(String str) {
                zzak();
                zza.zzf((zza) this.zza, str);
                return this;
            }

            public final C6450zza zza(long j) {
                zzak();
                zza.zza((zza) this.zza, j);
                return this;
            }

            public final C6450zza zzb(long j) {
                zzak();
                zza.zzb((zza) this.zza, j);
                return this;
            }
        }

        static {
            zza zzaVar = new zza();
            zzc = zzaVar;
            zzlc.zza((Class<zza>) zza.class, zzaVar);
        }

        private zza() {
        }

        public static C6450zza zzc() {
            return zzc.zzcc();
        }

        public static /* bridge */ /* synthetic */ zza zzd() {
            return zzc;
        }

        public static zza zze() {
            return zzc;
        }

        public final long zza() {
            return this.zzi;
        }

        public final long zzb() {
            return this.zzm;
        }

        public final String zzf() {
            return this.zzh;
        }

        public final String zzg() {
            return this.zzg;
        }

        public final String zzh() {
            return this.zzf;
        }

        public final String zzi() {
            return this.zzl;
        }

        public final String zzj() {
            return this.zzk;
        }

        public final String zzk() {
            return this.zzj;
        }

        public final boolean zzl() {
            return (this.zze & 4) != 0;
        }

        public final boolean zzm() {
            return (this.zze & 2) != 0;
        }

        public final boolean zzn() {
            return (this.zze & 1) != 0;
        }

        public final boolean zzo() {
            return (this.zze & 8) != 0;
        }

        public final boolean zzp() {
            return (this.zze & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0;
        }

        public final boolean zzq() {
            return (this.zze & 64) != 0;
        }

        public final boolean zzr() {
            return (this.zze & 32) != 0;
        }

        public final boolean zzs() {
            return (this.zze & 16) != 0;
        }

        public static /* synthetic */ void zzb(zza zzaVar) {
            zzaVar.zze &= -3;
            zzaVar.zzg = zzc.zzg;
        }

        public static /* synthetic */ void zzc(zza zzaVar) {
            zzaVar.zze &= -2;
            zzaVar.zzf = zzc.zzf;
        }

        public static /* synthetic */ void zzd(zza zzaVar) {
            zzaVar.zze &= -65;
            zzaVar.zzl = zzc.zzl;
        }

        public static /* synthetic */ void zze(zza zzaVar) {
            zzaVar.zze &= -33;
            zzaVar.zzk = zzc.zzk;
        }

        public static /* synthetic */ void zzf(zza zzaVar) {
            zzaVar.zze &= -17;
            zzaVar.zzj = zzc.zzj;
        }

        @Override // com.google.android.gms.internal.measurement.zzlc
        public final Object zza(int i, Object obj, Object obj2) {
            zzmu zzaVar;
            switch (zzgm.zza[i - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C6450zza(null);
                case 3:
                    return zzlc.zza(zzc, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဂ\u0007", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
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

        public static /* synthetic */ void zzb(zza zzaVar, String str) {
            str.getClass();
            zzaVar.zze |= 2;
            zzaVar.zzg = str;
        }

        public static /* synthetic */ void zzc(zza zzaVar, String str) {
            str.getClass();
            zzaVar.zze |= 1;
            zzaVar.zzf = str;
        }

        public static /* synthetic */ void zzd(zza zzaVar, String str) {
            str.getClass();
            zzaVar.zze |= 64;
            zzaVar.zzl = str;
        }

        public static /* synthetic */ void zze(zza zzaVar, String str) {
            str.getClass();
            zzaVar.zze |= 32;
            zzaVar.zzk = str;
        }

        public static /* synthetic */ void zzf(zza zzaVar, String str) {
            str.getClass();
            zzaVar.zze |= 16;
            zzaVar.zzj = str;
        }

        public static /* synthetic */ void zzb(zza zzaVar, long j) {
            zzaVar.zze |= UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            zzaVar.zzm = j;
        }

        public static /* synthetic */ void zza(zza zzaVar) {
            zzaVar.zze &= -5;
            zzaVar.zzh = zzc.zzh;
        }

        public static /* synthetic */ void zza(zza zzaVar, String str) {
            str.getClass();
            zzaVar.zze |= 4;
            zzaVar.zzh = str;
        }

        public static /* synthetic */ void zza(zza zzaVar, long j) {
            zzaVar.zze |= 8;
            zzaVar.zzi = j;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class zzb extends zzlc<zzb, zza> implements zzmn {
        private static final zzb zzc;
        private static volatile zzmu<zzb> zzd;
        private int zze;
        private String zzf = "";
        private String zzg = "";
        private String zzh = "";
        private String zzi = "";
        private String zzj = "";
        private String zzk = "";
        private String zzl = "";

        /* JADX INFO: compiled from: Proguard */
        public static final class zza extends zzlc.zzb<zzb, zza> implements zzmn {
            public /* synthetic */ zza(zzgr zzgrVar) {
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

        @Override // com.google.android.gms.internal.measurement.zzlc
        public final Object zza(int i, Object obj, Object obj2) {
            zzmu zzaVar;
            switch (zzgm.zza[i - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza(null);
                case 3:
                    return zzlc.zza(zzc, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
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
        private boolean zzf;
        private boolean zzg;
        private boolean zzh;
        private boolean zzi;
        private boolean zzj;
        private boolean zzk;
        private boolean zzl;

        /* JADX INFO: compiled from: Proguard */
        public static final class zza extends zzlc.zzb<zzc, zza> implements zzmn {
            public /* synthetic */ zza(zzgs zzgsVar) {
                this();
            }

            public final zza zza(boolean z2) {
                zzak();
                zzc.zza((zzc) this.zza, z2);
                return this;
            }

            public final zza zzb(boolean z2) {
                zzak();
                zzc.zzb((zzc) this.zza, z2);
                return this;
            }

            public final zza zzc(boolean z2) {
                zzak();
                zzc.zzc((zzc) this.zza, z2);
                return this;
            }

            public final zza zzd(boolean z2) {
                zzak();
                zzc.zzd((zzc) this.zza, z2);
                return this;
            }

            public final zza zze(boolean z2) {
                zzak();
                zzc.zze((zzc) this.zza, z2);
                return this;
            }

            public final zza zzf(boolean z2) {
                zzak();
                zzc.zzf((zzc) this.zza, z2);
                return this;
            }

            public final zza zzg(boolean z2) {
                zzak();
                zzc.zzg((zzc) this.zza, z2);
                return this;
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

        public static zza zza() {
            return zzc.zzcc();
        }

        public static /* bridge */ /* synthetic */ zzc zzb() {
            return zzc;
        }

        public static zzc zzc() {
            return zzc;
        }

        public static /* synthetic */ void zzd(zzc zzcVar, boolean z2) {
            zzcVar.zze |= 64;
            zzcVar.zzl = z2;
        }

        public static /* synthetic */ void zze(zzc zzcVar, boolean z2) {
            zzcVar.zze |= 2;
            zzcVar.zzg = z2;
        }

        public static /* synthetic */ void zzf(zzc zzcVar, boolean z2) {
            zzcVar.zze |= 4;
            zzcVar.zzh = z2;
        }

        public static /* synthetic */ void zzg(zzc zzcVar, boolean z2) {
            zzcVar.zze |= 8;
            zzcVar.zzi = z2;
        }

        public final boolean zzh() {
            return this.zzg;
        }

        public final boolean zzi() {
            return this.zzh;
        }

        public final boolean zzj() {
            return this.zzi;
        }

        public static /* synthetic */ void zzb(zzc zzcVar, boolean z2) {
            zzcVar.zze |= 16;
            zzcVar.zzj = z2;
        }

        public static /* synthetic */ void zzc(zzc zzcVar, boolean z2) {
            zzcVar.zze |= 1;
            zzcVar.zzf = z2;
        }

        @Override // com.google.android.gms.internal.measurement.zzlc
        public final Object zza(int i, Object obj, Object obj2) {
            zzmu zzaVar;
            switch (zzgm.zza[i - 1]) {
                case 1:
                    return new zzc();
                case 2:
                    return new zza(null);
                case 3:
                    return zzlc.zza(zzc, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
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

        public final boolean zzd() {
            return this.zzk;
        }

        public final boolean zze() {
            return this.zzj;
        }

        public final boolean zzf() {
            return this.zzf;
        }

        public final boolean zzg() {
            return this.zzl;
        }

        public static /* synthetic */ void zza(zzc zzcVar, boolean z2) {
            zzcVar.zze |= 32;
            zzcVar.zzk = z2;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class zzd extends zzlc<zzd, zza> implements zzmn {
        private static final zzd zzc;
        private static volatile zzmu<zzd> zzd;
        private int zze;
        private int zzf;
        private zzm zzg;
        private zzm zzh;
        private boolean zzi;

        /* JADX INFO: compiled from: Proguard */
        public static final class zza extends zzlc.zzb<zzd, zza> implements zzmn {
            public /* synthetic */ zza(zzgt zzgtVar) {
                this();
            }

            public final zza zza(int i) {
                zzak();
                zzd.zza((zzd) this.zza, i);
                return this;
            }

            private zza() {
                super(zzd.zzc());
            }

            public final zza zza(zzm.zza zzaVar) {
                zzak();
                zzd.zza((zzd) this.zza, (zzm) ((zzlc) zzaVar.zzai()));
                return this;
            }

            public final zza zza(boolean z2) {
                zzak();
                zzd.zza((zzd) this.zza, z2);
                return this;
            }

            public final zza zza(zzm zzmVar) {
                zzak();
                zzd.zzb((zzd) this.zza, zzmVar);
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

        public static zza zzb() {
            return zzc.zzcc();
        }

        public static /* bridge */ /* synthetic */ zzd zzc() {
            return zzc;
        }

        public final int zza() {
            return this.zzf;
        }

        public final zzm zzd() {
            zzm zzmVar = this.zzg;
            return zzmVar == null ? zzm.zzg() : zzmVar;
        }

        public final zzm zze() {
            zzm zzmVar = this.zzh;
            return zzmVar == null ? zzm.zzg() : zzmVar;
        }

        public final boolean zzf() {
            return this.zzi;
        }

        public final boolean zzg() {
            return (this.zze & 1) != 0;
        }

        public final boolean zzh() {
            return (this.zze & 8) != 0;
        }

        public final boolean zzi() {
            return (this.zze & 4) != 0;
        }

        public static /* synthetic */ void zzb(zzd zzdVar, zzm zzmVar) {
            zzmVar.getClass();
            zzdVar.zzh = zzmVar;
            zzdVar.zze |= 4;
        }

        @Override // com.google.android.gms.internal.measurement.zzlc
        public final Object zza(int i, Object obj, Object obj2) {
            zzmu zzaVar;
            switch (zzgm.zza[i - 1]) {
                case 1:
                    return new zzd();
                case 2:
                    return new zza(null);
                case 3:
                    return zzlc.zza(zzc, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
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

        public static /* synthetic */ void zza(zzd zzdVar, int i) {
            zzdVar.zze |= 1;
            zzdVar.zzf = i;
        }

        public static /* synthetic */ void zza(zzd zzdVar, zzm zzmVar) {
            zzmVar.getClass();
            zzdVar.zzg = zzmVar;
            zzdVar.zze |= 2;
        }

        public static /* synthetic */ void zza(zzd zzdVar, boolean z2) {
            zzdVar.zze |= 8;
            zzdVar.zzi = z2;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class zze extends zzlc<zze, zza> implements zzmn {
        private static final zze zzc;
        private static volatile zzmu<zze> zzd;
        private int zze;
        private int zzf;
        private long zzg;

        /* JADX INFO: compiled from: Proguard */
        public static final class zza extends zzlc.zzb<zze, zza> implements zzmn {
            public /* synthetic */ zza(zzgu zzguVar) {
                this();
            }

            public final zza zza(long j) {
                zzak();
                zze.zza((zze) this.zza, j);
                return this;
            }

            private zza() {
                super(zze.zzd());
            }

            public final zza zza(int i) {
                zzak();
                zze.zza((zze) this.zza, i);
                return this;
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

        public final long zzb() {
            return this.zzg;
        }

        public final boolean zze() {
            return (this.zze & 2) != 0;
        }

        public final boolean zzf() {
            return (this.zze & 1) != 0;
        }

        @Override // com.google.android.gms.internal.measurement.zzlc
        public final Object zza(int i, Object obj, Object obj2) {
            zzmu zzaVar;
            switch (zzgm.zza[i - 1]) {
                case 1:
                    return new zze();
                case 2:
                    return new zza(null);
                case 3:
                    return zzlc.zza(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
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

        public static /* synthetic */ void zza(zze zzeVar, long j) {
            zzeVar.zze |= 2;
            zzeVar.zzg = j;
        }

        public static /* synthetic */ void zza(zze zzeVar, int i) {
            zzeVar.zze |= 1;
            zzeVar.zzf = i;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class zzf extends zzlc<zzf, zza> implements zzmn {
        private static final zzf zzc;
        private static volatile zzmu<zzf> zzd;
        private int zze;
        private zzll<zzh> zzf = zzlc.zzch();
        private String zzg = "";
        private long zzh;
        private long zzi;
        private int zzj;

        /* JADX INFO: compiled from: Proguard */
        public static final class zza extends zzlc.zzb<zzf, zza> implements zzmn {
            public /* synthetic */ zza(zzgv zzgvVar) {
                this();
            }

            public final int zza() {
                return ((zzf) this.zza).zzb();
            }

            public final long zzb() {
                return ((zzf) this.zza).zzc();
            }

            public final long zzc() {
                return ((zzf) this.zza).zzd();
            }

            public final zza zzd() {
                zzak();
                zzf.zza((zzf) this.zza);
                return this;
            }

            public final String zze() {
                return ((zzf) this.zza).zzg();
            }

            public final List<zzh> zzf() {
                return Collections.unmodifiableList(((zzf) this.zza).zzh());
            }

            public final boolean zzg() {
                return ((zzf) this.zza).zzk();
            }

            private zza() {
                super(zzf.zzf());
            }

            public final zza zza(Iterable<? extends zzh> iterable) {
                zzak();
                zzf.zza((zzf) this.zza, iterable);
                return this;
            }

            public final zza zzb(long j) {
                zzak();
                zzf.zzb((zzf) this.zza, j);
                return this;
            }

            public final zza zza(zzh.zza zzaVar) {
                zzak();
                zzf.zza((zzf) this.zza, (zzh) ((zzlc) zzaVar.zzai()));
                return this;
            }

            public final zzh zzb(int i) {
                return ((zzf) this.zza).zza(i);
            }

            public final zza zza(zzh zzhVar) {
                zzak();
                zzf.zza((zzf) this.zza, zzhVar);
                return this;
            }

            public final zza zza(int i) {
                zzak();
                zzf.zza((zzf) this.zza, i);
                return this;
            }

            public final zza zza(String str) {
                zzak();
                zzf.zza((zzf) this.zza, str);
                return this;
            }

            public final zza zza(int i, zzh.zza zzaVar) {
                zzak();
                zzf.zza((zzf) this.zza, i, (zzh) ((zzlc) zzaVar.zzai()));
                return this;
            }

            public final zza zza(int i, zzh zzhVar) {
                zzak();
                zzf.zza((zzf) this.zza, i, zzhVar);
                return this;
            }

            public final zza zza(long j) {
                zzak();
                zzf.zza((zzf) this.zza, j);
                return this;
            }
        }

        static {
            zzf zzfVar = new zzf();
            zzc = zzfVar;
            zzlc.zza((Class<zzf>) zzf.class, zzfVar);
        }

        private zzf() {
        }

        public static zza zze() {
            return zzc.zzcc();
        }

        public static /* bridge */ /* synthetic */ zzf zzf() {
            return zzc;
        }

        private final void zzl() {
            zzll<zzh> zzllVar = this.zzf;
            if (zzllVar.zzc()) {
                return;
            }
            this.zzf = zzlc.zza(zzllVar);
        }

        public final int zza() {
            return this.zzj;
        }

        public final int zzb() {
            return this.zzf.size();
        }

        public final long zzc() {
            return this.zzi;
        }

        public final long zzd() {
            return this.zzh;
        }

        public final String zzg() {
            return this.zzg;
        }

        public final List<zzh> zzh() {
            return this.zzf;
        }

        public final boolean zzi() {
            return (this.zze & 8) != 0;
        }

        public final boolean zzj() {
            return (this.zze & 4) != 0;
        }

        public final boolean zzk() {
            return (this.zze & 2) != 0;
        }

        public static /* synthetic */ void zzb(zzf zzfVar, long j) {
            zzfVar.zze |= 2;
            zzfVar.zzh = j;
        }

        public final zzh zza(int i) {
            return this.zzf.get(i);
        }

        @Override // com.google.android.gms.internal.measurement.zzlc
        public final Object zza(int i, Object obj, Object obj2) {
            zzmu zzaVar;
            switch (zzgm.zza[i - 1]) {
                case 1:
                    return new zzf();
                case 2:
                    return new zza(null);
                case 3:
                    return zzlc.zza(zzc, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zze", "zzf", zzh.class, "zzg", "zzh", "zzi", "zzj"});
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

        public static /* synthetic */ void zza(zzf zzfVar, Iterable iterable) {
            zzfVar.zzl();
            zzji.zza(iterable, zzfVar.zzf);
        }

        public static /* synthetic */ void zza(zzf zzfVar, zzh zzhVar) {
            zzhVar.getClass();
            zzfVar.zzl();
            zzfVar.zzf.add(zzhVar);
        }

        public static /* synthetic */ void zza(zzf zzfVar) {
            zzfVar.zzf = zzlc.zzch();
        }

        public static /* synthetic */ void zza(zzf zzfVar, int i) {
            zzfVar.zzl();
            zzfVar.zzf.remove(i);
        }

        public static /* synthetic */ void zza(zzf zzfVar, String str) {
            str.getClass();
            zzfVar.zze |= 1;
            zzfVar.zzg = str;
        }

        public static /* synthetic */ void zza(zzf zzfVar, int i, zzh zzhVar) {
            zzhVar.getClass();
            zzfVar.zzl();
            zzfVar.zzf.set(i, zzhVar);
        }

        public static /* synthetic */ void zza(zzf zzfVar, long j) {
            zzfVar.zze |= 4;
            zzfVar.zzi = j;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class zzg extends zzlc<zzg, zza> implements zzmn {
        private static final zzg zzc;
        private static volatile zzmu<zzg> zzd;
        private int zze;
        private String zzf = "";
        private long zzg;

        /* JADX INFO: compiled from: Proguard */
        public static final class zza extends zzlc.zzb<zzg, zza> implements zzmn {
            public /* synthetic */ zza(zzgw zzgwVar) {
                this();
            }

            public final zza zza(long j) {
                zzak();
                zzg.zza((zzg) this.zza, j);
                return this;
            }

            private zza() {
                super(zzg.zzb());
            }

            public final zza zza(String str) {
                zzak();
                zzg.zza((zzg) this.zza, str);
                return this;
            }
        }

        static {
            zzg zzgVar = new zzg();
            zzc = zzgVar;
            zzlc.zza((Class<zzg>) zzg.class, zzgVar);
        }

        private zzg() {
        }

        public static zza zza() {
            return zzc.zzcc();
        }

        public static /* bridge */ /* synthetic */ zzg zzb() {
            return zzc;
        }

        @Override // com.google.android.gms.internal.measurement.zzlc
        public final Object zza(int i, Object obj, Object obj2) {
            zzmu zzaVar;
            switch (zzgm.zza[i - 1]) {
                case 1:
                    return new zzg();
                case 2:
                    return new zza(null);
                case 3:
                    return zzlc.zza(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
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

        public static /* synthetic */ void zza(zzg zzgVar, long j) {
            zzgVar.zze |= 2;
            zzgVar.zzg = j;
        }

        public static /* synthetic */ void zza(zzg zzgVar, String str) {
            str.getClass();
            zzgVar.zze |= 1;
            zzgVar.zzf = str;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class zzh extends zzlc<zzh, zza> implements zzmn {
        private static final zzh zzc;
        private static volatile zzmu<zzh> zzd;
        private int zze;
        private long zzh;
        private float zzi;
        private double zzj;
        private String zzf = "";
        private String zzg = "";
        private zzll<zzh> zzk = zzlc.zzch();

        /* JADX INFO: compiled from: Proguard */
        public static final class zza extends zzlc.zzb<zzh, zza> implements zzmn {
            public /* synthetic */ zza(zzgx zzgxVar) {
                this();
            }

            public final int zza() {
                return ((zzh) this.zza).zzc();
            }

            public final zza zzb() {
                zzak();
                zzh.zza((zzh) this.zza);
                return this;
            }

            public final zza zzc() {
                zzak();
                zzh.zzb((zzh) this.zza);
                return this;
            }

            public final zza zzd() {
                zzak();
                zzh.zzc((zzh) this.zza);
                return this;
            }

            public final zza zze() {
                zzak();
                zzh.zzd((zzh) this.zza);
                return this;
            }

            public final String zzf() {
                return ((zzh) this.zza).zzg();
            }

            public final String zzg() {
                return ((zzh) this.zza).zzh();
            }

            private zza() {
                super(zzh.zzf());
            }

            public final zza zza(Iterable<? extends zzh> iterable) {
                zzak();
                zzh.zza((zzh) this.zza, iterable);
                return this;
            }

            public final zza zzb(String str) {
                zzak();
                zzh.zzb((zzh) this.zza, str);
                return this;
            }

            public final zza zza(zza zzaVar) {
                zzak();
                zzh.zza((zzh) this.zza, (zzh) ((zzlc) zzaVar.zzai()));
                return this;
            }

            public final zza zza(double d) {
                zzak();
                zzh.zza((zzh) this.zza, d);
                return this;
            }

            public final zza zza(long j) {
                zzak();
                zzh.zza((zzh) this.zza, j);
                return this;
            }

            public final zza zza(String str) {
                zzak();
                zzh.zza((zzh) this.zza, str);
                return this;
            }
        }

        static {
            zzh zzhVar = new zzh();
            zzc = zzhVar;
            zzlc.zza((Class<zzh>) zzh.class, zzhVar);
        }

        private zzh() {
        }

        public static zza zze() {
            return zzc.zzcc();
        }

        public static /* bridge */ /* synthetic */ zzh zzf() {
            return zzc;
        }

        private final void zzo() {
            zzll<zzh> zzllVar = this.zzk;
            if (zzllVar.zzc()) {
                return;
            }
            this.zzk = zzlc.zza(zzllVar);
        }

        public final double zza() {
            return this.zzj;
        }

        public final float zzb() {
            return this.zzi;
        }

        public final int zzc() {
            return this.zzk.size();
        }

        public final long zzd() {
            return this.zzh;
        }

        public final String zzg() {
            return this.zzf;
        }

        public final String zzh() {
            return this.zzg;
        }

        public final List<zzh> zzi() {
            return this.zzk;
        }

        public final boolean zzj() {
            return (this.zze & 16) != 0;
        }

        public final boolean zzk() {
            return (this.zze & 8) != 0;
        }

        public final boolean zzl() {
            return (this.zze & 4) != 0;
        }

        public final boolean zzm() {
            return (this.zze & 1) != 0;
        }

        public final boolean zzn() {
            return (this.zze & 2) != 0;
        }

        public static /* synthetic */ void zzb(zzh zzhVar) {
            zzhVar.zze &= -5;
            zzhVar.zzh = 0L;
        }

        public static /* synthetic */ void zzc(zzh zzhVar) {
            zzhVar.zzk = zzlc.zzch();
        }

        public static /* synthetic */ void zzd(zzh zzhVar) {
            zzhVar.zze &= -3;
            zzhVar.zzg = zzc.zzg;
        }

        @Override // com.google.android.gms.internal.measurement.zzlc
        public final Object zza(int i, Object obj, Object obj2) {
            zzmu zzaVar;
            switch (zzgm.zza[i - 1]) {
                case 1:
                    return new zzh();
                case 2:
                    return new zza(null);
                case 3:
                    return zzlc.zza(zzc, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", zzh.class});
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

        public static /* synthetic */ void zzb(zzh zzhVar, String str) {
            str.getClass();
            zzhVar.zze |= 2;
            zzhVar.zzg = str;
        }

        public static /* synthetic */ void zza(zzh zzhVar, Iterable iterable) {
            zzhVar.zzo();
            zzji.zza(iterable, zzhVar.zzk);
        }

        public static /* synthetic */ void zza(zzh zzhVar, zzh zzhVar2) {
            zzhVar2.getClass();
            zzhVar.zzo();
            zzhVar.zzk.add(zzhVar2);
        }

        public static /* synthetic */ void zza(zzh zzhVar) {
            zzhVar.zze &= -17;
            zzhVar.zzj = 0.0d;
        }

        public static /* synthetic */ void zza(zzh zzhVar, double d) {
            zzhVar.zze |= 16;
            zzhVar.zzj = d;
        }

        public static /* synthetic */ void zza(zzh zzhVar, long j) {
            zzhVar.zze |= 4;
            zzhVar.zzh = j;
        }

        public static /* synthetic */ void zza(zzh zzhVar, String str) {
            str.getClass();
            zzhVar.zze |= 1;
            zzhVar.zzf = str;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class zzi extends zzlc<zzi, zza> implements zzmn {
        private static final zzi zzc;
        private static volatile zzmu<zzi> zzd;
        private int zze;
        private String zzf = "";
        private String zzg = "";
        private zzb zzh;

        /* JADX INFO: compiled from: Proguard */
        public static final class zza extends zzlc.zzb<zzi, zza> implements zzmn {
            public /* synthetic */ zza(zzgy zzgyVar) {
                this();
            }

            private zza() {
                super(zzi.zza());
            }
        }

        static {
            zzi zziVar = new zzi();
            zzc = zziVar;
            zzlc.zza((Class<zzi>) zzi.class, zziVar);
        }

        private zzi() {
        }

        public static /* bridge */ /* synthetic */ zzi zza() {
            return zzc;
        }

        @Override // com.google.android.gms.internal.measurement.zzlc
        public final Object zza(int i, Object obj, Object obj2) {
            zzmu zzaVar;
            switch (zzgm.zza[i - 1]) {
                case 1:
                    return new zzi();
                case 2:
                    return new zza(null);
                case 3:
                    return zzlc.zza(zzc, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
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

    /* JADX INFO: compiled from: Proguard */
    public static final class zzj extends zzlc<zzj, zza> implements zzmn {
        private static final zzj zzc;
        private static volatile zzmu<zzj> zzd;
        private int zze;
        private zzll<zzk> zzf = zzlc.zzch();
        private String zzg = "";
        private String zzh = "";
        private int zzi;

        /* JADX INFO: compiled from: Proguard */
        public static final class zza extends zzlc.zzb<zzj, zza> implements zzmn {
            public /* synthetic */ zza(zzgz zzgzVar) {
                this();
            }

            public final int zza() {
                return ((zzj) this.zza).zza();
            }

            public final zza zzb() {
                zzak();
                zzj.zzb((zzj) this.zza);
                return this;
            }

            public final String zzc() {
                return ((zzj) this.zza).zzd();
            }

            public final List<zzk> zzd() {
                return Collections.unmodifiableList(((zzj) this.zza).zzf());
            }

            private zza() {
                super(zzj.zzc());
            }

            public final zza zza(Iterable<? extends zzk> iterable) {
                zzak();
                zzj.zza((zzj) this.zza, iterable);
                return this;
            }

            public final zza zzb(String str) {
                zzak();
                zzj.zzb((zzj) this.zza, str);
                return this;
            }

            public final zza zza(zzk.zza zzaVar) {
                zzak();
                zzj.zza((zzj) this.zza, (zzk) ((zzlc) zzaVar.zzai()));
                return this;
            }

            public final zza zza(String str) {
                zzak();
                zzj.zza((zzj) this.zza, str);
                return this;
            }

            public final zzk zza(int i) {
                return ((zzj) this.zza).zza(0);
            }
        }

        /* JADX INFO: compiled from: Proguard */
        public enum zzb implements zzlh {
            SDK(0),
            SGTM(1);

            private final int zzd;

            zzb(int i) {
                this.zzd = i;
            }

            public static zzlg zzb() {
                return zzha.zza;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + zzb.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzd + " name=" + name() + '>';
            }

            @Override // com.google.android.gms.internal.measurement.zzlh
            public final int zza() {
                return this.zzd;
            }

            public static zzb zza(int i) {
                if (i == 0) {
                    return SDK;
                }
                if (i != 1) {
                    return null;
                }
                return SGTM;
            }
        }

        static {
            zzj zzjVar = new zzj();
            zzc = zzjVar;
            zzlc.zza((Class<zzj>) zzj.class, zzjVar);
        }

        private zzj() {
        }

        public static zza zzb() {
            return zzc.zzcc();
        }

        public static /* bridge */ /* synthetic */ zzj zzc() {
            return zzc;
        }

        private final void zzi() {
            zzll<zzk> zzllVar = this.zzf;
            if (zzllVar.zzc()) {
                return;
            }
            this.zzf = zzlc.zza(zzllVar);
        }

        public final int zza() {
            return this.zzf.size();
        }

        public final String zzd() {
            return this.zzg;
        }

        public final String zze() {
            return this.zzh;
        }

        public final List<zzk> zzf() {
            return this.zzf;
        }

        public final boolean zzg() {
            return (this.zze & 1) != 0;
        }

        public final boolean zzh() {
            return (this.zze & 2) != 0;
        }

        public static zza zza(zzj zzjVar) {
            return zzc.zza(zzjVar);
        }

        public static /* synthetic */ void zzb(zzj zzjVar) {
            zzjVar.zzf = zzlc.zzch();
        }

        public static /* synthetic */ void zzb(zzj zzjVar, String str) {
            str.getClass();
            zzjVar.zze |= 2;
            zzjVar.zzh = str;
        }

        public final zzk zza(int i) {
            return this.zzf.get(0);
        }

        @Override // com.google.android.gms.internal.measurement.zzlc
        public final Object zza(int i, Object obj, Object obj2) {
            zzmu zzaVar;
            switch (zzgm.zza[i - 1]) {
                case 1:
                    return new zzj();
                case 2:
                    return new zza(null);
                case 3:
                    return zzlc.zza(zzc, "\u0004\u0004\u0000\u0001\u0001\t\u0004\u0000\u0001\u0000\u0001\u001b\u0007ဈ\u0000\bဈ\u0001\t᠌\u0002", new Object[]{"zze", "zzf", zzk.class, "zzg", "zzh", "zzi", zzb.zzb()});
                case 4:
                    return zzc;
                case 5:
                    zzmu<zzj> zzmuVar = zzd;
                    if (zzmuVar != null) {
                        return zzmuVar;
                    }
                    synchronized (zzj.class) {
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

        public static /* synthetic */ void zza(zzj zzjVar, Iterable iterable) {
            zzjVar.zzi();
            zzji.zza(iterable, zzjVar.zzf);
        }

        public static /* synthetic */ void zza(zzj zzjVar, zzk zzkVar) {
            zzkVar.getClass();
            zzjVar.zzi();
            zzjVar.zzf.add(zzkVar);
        }

        public static /* synthetic */ void zza(zzj zzjVar, String str) {
            str.getClass();
            zzjVar.zze |= 1;
            zzjVar.zzg = str;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class zzk extends zzlc<zzk, zza> implements zzmn {
        private static final zzk zzc;
        private static volatile zzmu<zzk> zzd;
        private long zzab;
        private int zzac;
        private boolean zzaf;
        private int zzai;
        private int zzaj;
        private int zzak;
        private long zzam;
        private long zzan;
        private int zzaq;
        private zzl zzas;
        private long zzau;
        private long zzav;
        private int zzay;
        private boolean zzaz;
        private boolean zzbb;
        private zzi zzbc;
        private long zzbg;
        private boolean zzbh;
        private boolean zzbj;
        private int zzbl;
        private zzc zzbn;
        private int zzbo;
        private zza zzbp;
        private int zze;
        private int zzf;
        private int zzg;
        private long zzj;
        private long zzk;
        private long zzl;
        private long zzm;
        private long zzn;
        private int zzs;
        private long zzw;
        private long zzx;
        private boolean zzz;
        private zzll<zzf> zzh = zzlc.zzch();
        private zzll<zzo> zzi = zzlc.zzch();
        private String zzo = "";
        private String zzp = "";
        private String zzq = "";
        private String zzr = "";
        private String zzt = "";
        private String zzu = "";
        private String zzv = "";
        private String zzy = "";
        private String zzaa = "";
        private String zzad = "";
        private String zzae = "";
        private zzll<zzd> zzag = zzlc.zzch();
        private String zzah = "";
        private String zzal = "";
        private String zzao = "";
        private String zzap = "";
        private String zzar = "";
        private zzlj zzat = zzlc.zzcf();
        private String zzaw = "";
        private String zzax = "";
        private String zzba = "";
        private String zzbd = "";
        private zzll<String> zzbe = zzlc.zzch();
        private String zzbf = "";
        private String zzbi = "";
        private String zzbk = "";
        private String zzbm = "";

        /* JADX INFO: compiled from: Proguard */
        public static final class zza extends zzlc.zzb<zzk, zza> implements zzmn {
            public /* synthetic */ zza(zzhb zzhbVar) {
                this();
            }

            public final int zza() {
                return ((zzk) this.zza).zza();
            }

            public final List<zzf> zzaa() {
                return Collections.unmodifiableList(((zzk) this.zza).zzar());
            }

            public final List<zzo> zzab() {
                return Collections.unmodifiableList(((zzk) this.zza).zzas());
            }

            public final boolean zzac() {
                return ((zzk) this.zza).zzau();
            }

            public final boolean zzad() {
                return ((zzk) this.zza).zzav();
            }

            public final boolean zzae() {
                return ((zzk) this.zza).zzax();
            }

            public final int zzb() {
                return ((zzk) this.zza).zzb();
            }

            public final int zzc() {
                return ((zzk) this.zza).zze();
            }

            public final int zzd() {
                return ((zzk) this.zza).zzi();
            }

            public final long zze() {
                return ((zzk) this.zza).zzm();
            }

            public final long zzf() {
                return ((zzk) this.zza).zzq();
            }

            public final zza zzg() {
                return ((zzk) this.zza).zzu();
            }

            public final zza zzh() {
                zzak();
                zzk.zzb((zzk) this.zza);
                return this;
            }

            public final zza zzi() {
                zzak();
                zzk.zzc((zzk) this.zza);
                return this;
            }

            public final zza zzj() {
                zzak();
                zzk.zzd((zzk) this.zza);
                return this;
            }

            public final zza zzk() {
                zzak();
                zzk.zze((zzk) this.zza);
                return this;
            }

            public final zza zzl() {
                zzak();
                zzk.zzf((zzk) this.zza);
                return this;
            }

            public final zza zzm() {
                zzak();
                zzk.zzg((zzk) this.zza);
                return this;
            }

            public final zza zzn() {
                zzak();
                zzk.zzh((zzk) this.zza);
                return this;
            }

            public final zza zzo() {
                zzak();
                zzk.zzi((zzk) this.zza);
                return this;
            }

            public final zza zzp() {
                zzak();
                zzk.zzj((zzk) this.zza);
                return this;
            }

            public final zza zzq() {
                zzak();
                zzk.zzk((zzk) this.zza);
                return this;
            }

            public final zza zzr() {
                zzak();
                zzk.zzl((zzk) this.zza);
                return this;
            }

            public final zza zzs() {
                zzak();
                zzk.zzm((zzk) this.zza);
                return this;
            }

            public final String zzt() {
                return ((zzk) this.zza).zzz();
            }

            public final String zzu() {
                return ((zzk) this.zza).zzaa();
            }

            public final String zzv() {
                return ((zzk) this.zza).zzad();
            }

            public final String zzw() {
                return ((zzk) this.zza).zzaf();
            }

            public final String zzx() {
                return ((zzk) this.zza).zzaj();
            }

            public final String zzy() {
                return ((zzk) this.zza).zzal();
            }

            public final String zzz() {
                return ((zzk) this.zza).zzan();
            }

            private zza() {
                super(zzk.zzx());
            }

            public final zzf zza(int i) {
                return ((zzk) this.zza).zza(i);
            }

            public final zza zzb(Iterable<? extends zzf> iterable) {
                zzak();
                zzk.zzb((zzk) this.zza, iterable);
                return this;
            }

            public final zza zzc(Iterable<? extends Integer> iterable) {
                zzak();
                zzk.zzc((zzk) this.zza, iterable);
                return this;
            }

            public final zza zzd(Iterable<String> iterable) {
                zzak();
                zzk.zzd((zzk) this.zza, iterable);
                return this;
            }

            public final zza zze(Iterable<? extends zzo> iterable) {
                zzak();
                zzk.zze((zzk) this.zza, iterable);
                return this;
            }

            public final zza zzf(int i) {
                zzak();
                zzk.zze((zzk) this.zza, i);
                return this;
            }

            public final zza zzg(String str) {
                zzak();
                zzk.zzg((zzk) this.zza, str);
                return this;
            }

            public final zza zza(Iterable<? extends zzd> iterable) {
                zzak();
                zzk.zza((zzk) this.zza, iterable);
                return this;
            }

            public final zza zzh(String str) {
                zzak();
                zzk.zzh((zzk) this.zza, str);
                return this;
            }

            public final zza zzi(String str) {
                zzak();
                zzk.zzi((zzk) this.zza, str);
                return this;
            }

            public final zza zzj(String str) {
                zzak();
                zzk.zzj((zzk) this.zza, str);
                return this;
            }

            public final zza zzk(String str) {
                zzak();
                zzk.zzk((zzk) this.zza, str);
                return this;
            }

            public final zza zzl(String str) {
                zzak();
                zzk.zzl((zzk) this.zza, str);
                return this;
            }

            public final zza zzm(String str) {
                zzak();
                zzk.zzm((zzk) this.zza, str);
                return this;
            }

            public final zza zzn(String str) {
                zzak();
                zzk.zzn((zzk) this.zza, str);
                return this;
            }

            public final zza zzo(String str) {
                zzak();
                zzk.zzo((zzk) this.zza, str);
                return this;
            }

            public final zza zzp(String str) {
                zzak();
                zzk.zzp((zzk) this.zza, str);
                return this;
            }

            public final zza zzq(String str) {
                zzak();
                zzk.zzq((zzk) this.zza, str);
                return this;
            }

            public final zza zzr(String str) {
                zzak();
                zzk.zzr((zzk) this.zza, str);
                return this;
            }

            public final zza zzs(String str) {
                zzak();
                zzk.zzs((zzk) this.zza, str);
                return this;
            }

            public final zza zzb(int i) {
                zzak();
                zzk.zza((zzk) this.zza, i);
                return this;
            }

            public final zza zzc(int i) {
                zzak();
                zzk.zzb((zzk) this.zza, i);
                return this;
            }

            public final zza zzd(int i) {
                zzak();
                zzk.zzc((zzk) this.zza, i);
                return this;
            }

            public final zza zze(String str) {
                zzak();
                zzk.zze((zzk) this.zza, str);
                return this;
            }

            public final zza zzf(String str) {
                zzak();
                zzk.zzf((zzk) this.zza, str);
                return this;
            }

            public final zza zzg(int i) {
                zzak();
                zzk.zzf((zzk) this.zza, i);
                return this;
            }

            public final zza zza(zzf.zza zzaVar) {
                zzak();
                zzk.zza((zzk) this.zza, (zzf) ((zzlc) zzaVar.zzai()));
                return this;
            }

            public final zza zzh(long j) {
                zzak();
                zzk.zzh((zzk) this.zza, j);
                return this;
            }

            public final zza zzi(int i) {
                zzak();
                zzk.zzh((zzk) this.zza, i);
                return this;
            }

            public final zza zzj(long j) {
                zzak();
                zzk.zzj((zzk) this.zza, j);
                return this;
            }

            public final zza zzk(long j) {
                zzak();
                zzk.zzk((zzk) this.zza, j);
                return this;
            }

            public final zza zzl(long j) {
                zzak();
                zzk.zzl((zzk) this.zza, j);
                return this;
            }

            public final zza zzb(String str) {
                zzak();
                zzk.zzb((zzk) this.zza, str);
                return this;
            }

            public final zza zzc(String str) {
                zzak();
                zzk.zzc((zzk) this.zza, str);
                return this;
            }

            public final zza zzd(String str) {
                zzak();
                zzk.zzd((zzk) this.zza, str);
                return this;
            }

            public final zza zze(int i) {
                zzak();
                zzk.zzd((zzk) this.zza, i);
                return this;
            }

            public final zza zzf(long j) {
                zzak();
                zzk.zzf((zzk) this.zza, j);
                return this;
            }

            public final zza zzg(long j) {
                zzak();
                zzk.zzg((zzk) this.zza, j);
                return this;
            }

            public final zza zza(zzo.zza zzaVar) {
                zzak();
                zzk.zza((zzk) this.zza, (zzo) ((zzlc) zzaVar.zzai()));
                return this;
            }

            public final zza zzh(int i) {
                zzak();
                zzk.zzg((zzk) this.zza, 1);
                return this;
            }

            public final zza zzi(long j) {
                zzak();
                zzk.zzi((zzk) this.zza, j);
                return this;
            }

            public final zza zzj(int i) {
                zzak();
                zzk.zzi((zzk) this.zza, i);
                return this;
            }

            public final zzo zzk(int i) {
                return ((zzk) this.zza).zzb(i);
            }

            public final zza zzb(long j) {
                zzak();
                zzk.zzb((zzk) this.zza, j);
                return this;
            }

            public final zza zzc(long j) {
                zzak();
                zzk.zzc((zzk) this.zza, j);
                return this;
            }

            public final zza zzd(long j) {
                zzak();
                zzk.zzd((zzk) this.zza, j);
                return this;
            }

            public final zza zze(long j) {
                zzak();
                zzk.zze((zzk) this.zza, j);
                return this;
            }

            public final zza zza(zzo zzoVar) {
                zzak();
                zzk.zza((zzk) this.zza, zzoVar);
                return this;
            }

            public final zza zzb(boolean z2) {
                zzak();
                zzk.zzb((zzk) this.zza, z2);
                return this;
            }

            public final zza zzc(boolean z2) {
                zzak();
                zzk.zzc((zzk) this.zza, z2);
                return this;
            }

            public final zza zzd(boolean z2) {
                zzak();
                zzk.zzd((zzk) this.zza, z2);
                return this;
            }

            public final zza zza(zza zzaVar) {
                zzak();
                zzk.zza((zzk) this.zza, zzaVar);
                return this;
            }

            public final zza zza(String str) {
                zzak();
                zzk.zza((zzk) this.zza, str);
                return this;
            }

            public final zza zza(zzc zzcVar) {
                zzak();
                zzk.zza((zzk) this.zza, zzcVar);
                return this;
            }

            public final zza zza(long j) {
                zzak();
                zzk.zza((zzk) this.zza, j);
                return this;
            }

            public final zza zza(boolean z2) {
                zzak();
                zzk.zza((zzk) this.zza, z2);
                return this;
            }

            public final zza zza(int i, zzf.zza zzaVar) {
                zzak();
                zzk.zza((zzk) this.zza, i, (zzf) ((zzlc) zzaVar.zzai()));
                return this;
            }

            public final zza zza(int i, zzf zzfVar) {
                zzak();
                zzk.zza((zzk) this.zza, i, zzfVar);
                return this;
            }

            public final zza zza(zzl.zza zzaVar) {
                zzak();
                zzk.zza((zzk) this.zza, (zzl) ((zzlc) zzaVar.zzai()));
                return this;
            }

            public final zza zza(int i, zzo zzoVar) {
                zzak();
                zzk.zza((zzk) this.zza, i, zzoVar);
                return this;
            }
        }

        static {
            zzk zzkVar = new zzk();
            zzc = zzkVar;
            zzlc.zza((Class<zzk>) zzk.class, zzkVar);
        }

        private zzk() {
        }

        private final void zzcp() {
            zzll<zzf> zzllVar = this.zzh;
            if (zzllVar.zzc()) {
                return;
            }
            this.zzh = zzlc.zza(zzllVar);
        }

        private final void zzcq() {
            zzll<zzo> zzllVar = this.zzi;
            if (zzllVar.zzc()) {
                return;
            }
            this.zzi = zzlc.zza(zzllVar);
        }

        public static zza zzw() {
            return zzc.zzcc();
        }

        public static /* bridge */ /* synthetic */ zzk zzx() {
            return zzc;
        }

        public final int zza() {
            return this.zzbl;
        }

        public final String zzaa() {
            return this.zzaa;
        }

        public final String zzab() {
            return this.zzt;
        }

        public final String zzac() {
            return this.zzv;
        }

        public final String zzad() {
            return this.zzbi;
        }

        public final String zzae() {
            return this.zzax;
        }

        public final String zzaf() {
            return this.zzbk;
        }

        public final String zzag() {
            return this.zzq;
        }

        public final String zzah() {
            return this.zzao;
        }

        public final String zzai() {
            return this.zzah;
        }

        public final String zzaj() {
            return this.zzae;
        }

        public final String zzak() {
            return this.zzad;
        }

        public final String zzal() {
            return this.zzp;
        }

        public final String zzam() {
            return this.zzo;
        }

        public final String zzan() {
            return this.zzy;
        }

        public final String zzao() {
            return this.zzbd;
        }

        public final String zzap() {
            return this.zzr;
        }

        public final List<zzd> zzaq() {
            return this.zzag;
        }

        public final List<zzf> zzar() {
            return this.zzh;
        }

        public final List<zzo> zzas() {
            return this.zzi;
        }

        public final boolean zzat() {
            return this.zzbh;
        }

        public final boolean zzau() {
            return this.zzbj;
        }

        public final boolean zzav() {
            return this.zzz;
        }

        public final boolean zzaw() {
            return this.zzaf;
        }

        public final boolean zzax() {
            return (this.zzf & 16777216) != 0;
        }

        public final boolean zzay() {
            return (this.zze & 33554432) != 0;
        }

        public final boolean zzaz() {
            return (this.zzf & 4194304) != 0;
        }

        public final int zzb() {
            return this.zzai;
        }

        public final boolean zzba() {
            return (this.zze & 1048576) != 0;
        }

        public final boolean zzbb() {
            return (this.zze & 536870912) != 0;
        }

        public final boolean zzbc() {
            return (this.zzf & 131072) != 0;
        }

        public final boolean zzbd() {
            return (this.zzf & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0;
        }

        public final boolean zzbe() {
            return (this.zzf & 524288) != 0;
        }

        public final boolean zzbf() {
            return (this.zzf & 8388608) != 0;
        }

        public final boolean zzbg() {
            return (this.zze & 524288) != 0;
        }

        public final boolean zzbh() {
            return (this.zze & Integer.MIN_VALUE) != 0;
        }

        public final boolean zzbi() {
            return (this.zzf & 16) != 0;
        }

        public final boolean zzbj() {
            return (this.zze & 8) != 0;
        }

        public final boolean zzbk() {
            return (this.zze & 16384) != 0;
        }

        public final boolean zzbl() {
            return (this.zzf & 262144) != 0;
        }

        public final boolean zzbm() {
            return (this.zze & 131072) != 0;
        }

        public final boolean zzbn() {
            return (this.zze & 32) != 0;
        }

        public final boolean zzbo() {
            return (this.zze & 16) != 0;
        }

        public final boolean zzbp() {
            return (this.zze & 1) != 0;
        }

        public final boolean zzbq() {
            return (this.zzf & 2) != 0;
        }

        public final boolean zzbr() {
            return (this.zze & 8388608) != 0;
        }

        public final boolean zzbs() {
            return (this.zzf & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0;
        }

        public final boolean zzbt() {
            return (this.zze & 4) != 0;
        }

        public final boolean zzbu() {
            return (this.zzf & 32768) != 0;
        }

        public final boolean zzbv() {
            return (this.zze & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0;
        }

        public final boolean zzbw() {
            return (this.zze & 2) != 0;
        }

        public final boolean zzbx() {
            return (this.zze & 32768) != 0;
        }

        public final int zzc() {
            return this.zzac;
        }

        public final int zzd() {
            return this.zzbo;
        }

        public final int zze() {
            return this.zzh.size();
        }

        public final int zzf() {
            return this.zzg;
        }

        public final int zzg() {
            return this.zzaq;
        }

        public final int zzh() {
            return this.zzs;
        }

        public final int zzi() {
            return this.zzi.size();
        }

        public final long zzj() {
            return this.zzam;
        }

        public final long zzk() {
            return this.zzab;
        }

        public final long zzl() {
            return this.zzau;
        }

        public final long zzm() {
            return this.zzl;
        }

        public final long zzn() {
            return this.zzw;
        }

        public final long zzo() {
            return this.zzn;
        }

        public final long zzp() {
            return this.zzm;
        }

        public final long zzq() {
            return this.zzk;
        }

        public final long zzr() {
            return this.zzbg;
        }

        public final long zzs() {
            return this.zzj;
        }

        public final long zzt() {
            return this.zzx;
        }

        public final zza zzu() {
            zza zzaVar = this.zzbp;
            return zzaVar == null ? zza.zze() : zzaVar;
        }

        public final zzc zzv() {
            zzc zzcVar = this.zzbn;
            return zzcVar == null ? zzc.zzc() : zzcVar;
        }

        public final String zzy() {
            return this.zzar;
        }

        public final String zzz() {
            return this.zzu;
        }

        public static /* synthetic */ void zzc(zzk zzkVar, Iterable iterable) {
            zzlj zzljVar = zzkVar.zzat;
            if (!zzljVar.zzc()) {
                int size = zzljVar.size();
                zzkVar.zzat = zzljVar.zzc(size == 0 ? 10 : size << 1);
            }
            zzji.zza(iterable, zzkVar.zzat);
        }

        public static /* synthetic */ void zzd(zzk zzkVar, Iterable iterable) {
            zzll<String> zzllVar = zzkVar.zzbe;
            if (!zzllVar.zzc()) {
                zzkVar.zzbe = zzlc.zza(zzllVar);
            }
            zzji.zza(iterable, zzkVar.zzbe);
        }

        public static /* synthetic */ void zze(zzk zzkVar, Iterable iterable) {
            zzkVar.zzcq();
            zzji.zza(iterable, zzkVar.zzi);
        }

        public static /* synthetic */ void zzf(zzk zzkVar) {
            zzkVar.zzh = zzlc.zzch();
        }

        public static /* synthetic */ void zzg(zzk zzkVar) {
            zzkVar.zze &= -2097153;
            zzkVar.zzad = zzc.zzad;
        }

        public static /* synthetic */ void zzh(zzk zzkVar) {
            zzkVar.zze &= -131073;
            zzkVar.zzz = false;
        }

        public static /* synthetic */ void zzi(zzk zzkVar) {
            zzkVar.zze &= -33;
            zzkVar.zzn = 0L;
        }

        public static /* synthetic */ void zzj(zzk zzkVar) {
            zzkVar.zze &= -17;
            zzkVar.zzm = 0L;
        }

        public static /* synthetic */ void zzk(zzk zzkVar) {
            zzkVar.zze &= -65537;
            zzkVar.zzy = zzc.zzy;
        }

        public static /* synthetic */ void zzl(zzk zzkVar) {
            zzkVar.zzf &= -8193;
            zzkVar.zzbd = zzc.zzbd;
        }

        public static /* synthetic */ void zzm(zzk zzkVar) {
            zzkVar.zze &= -268435457;
            zzkVar.zzal = zzc.zzal;
        }

        public static /* synthetic */ void zzn(zzk zzkVar, String str) {
            str.getClass();
            zzkVar.zze |= 2097152;
            zzkVar.zzad = str;
        }

        public static /* synthetic */ void zzo(zzk zzkVar, String str) {
            str.getClass();
            zzkVar.zze |= UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            zzkVar.zzp = str;
        }

        public static /* synthetic */ void zzp(zzk zzkVar, String str) {
            str.getClass();
            zzkVar.zze |= 64;
            zzkVar.zzo = str;
        }

        public static /* synthetic */ void zzq(zzk zzkVar, String str) {
            str.getClass();
            zzkVar.zze |= 65536;
            zzkVar.zzy = str;
        }

        public static /* synthetic */ void zzr(zzk zzkVar, String str) {
            str.getClass();
            zzkVar.zzf |= UserMetadata.MAX_INTERNAL_KEY_SIZE;
            zzkVar.zzbd = str;
        }

        public static /* synthetic */ void zzs(zzk zzkVar, String str) {
            str.getClass();
            zzkVar.zze |= 512;
            zzkVar.zzr = str;
        }

        public final zzf zza(int i) {
            return this.zzh.get(i);
        }

        public final zzo zzb(int i) {
            return this.zzi.get(i);
        }

        public static zza zza(zzk zzkVar) {
            return zzc.zza(zzkVar);
        }

        public static /* synthetic */ void zzb(zzk zzkVar, Iterable iterable) {
            zzkVar.zzcp();
            zzji.zza(iterable, zzkVar.zzh);
        }

        public static /* synthetic */ void zzf(zzk zzkVar, String str) {
            str.getClass();
            zzkVar.zzf |= 131072;
            zzkVar.zzbi = str;
        }

        public static /* synthetic */ void zze(zzk zzkVar) {
            zzkVar.zze &= Integer.MAX_VALUE;
            zzkVar.zzao = zzc.zzao;
        }

        public static /* synthetic */ void zzh(zzk zzkVar, String str) {
            str.getClass();
            zzkVar.zzf |= 524288;
            zzkVar.zzbk = str;
        }

        public static /* synthetic */ void zzi(zzk zzkVar, String str) {
            str.getClass();
            zzkVar.zze |= 256;
            zzkVar.zzq = str;
        }

        public static /* synthetic */ void zzj(zzk zzkVar, String str) {
            str.getClass();
            zzkVar.zze |= Integer.MIN_VALUE;
            zzkVar.zzao = str;
        }

        @Override // com.google.android.gms.internal.measurement.zzlc
        public final Object zza(int i, Object obj, Object obj2) {
            zzmu zzaVar;
            switch (zzgm.zza[i - 1]) {
                case 1:
                    return new zzk();
                case 2:
                    return new zza(null);
                case 3:
                    return zzlc.zza(zzc, "\u0004>\u0000\u0002\u0001O>\u0000\u0005\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fင\n\rဈ\u000b\u000eဈ\f\u0010ဈ\r\u0011ဂ\u000e\u0012ဂ\u000f\u0013ဈ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ဂ\u0013\u0017င\u0014\u0018ဈ\u0015\u0019ဈ\u0016\u001aဂ\u0004\u001cဇ\u0017\u001d\u001b\u001eဈ\u0018\u001fင\u0019 င\u001a!င\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဈ\u001f&ဈ 'င!)ဈ\",ဉ#-\u001d.ဂ$/ဂ%2ဈ&4ဈ'5᠌(7ဇ)9ဈ*:ဇ+;ဉ,?ဈ-@\u001aAဈ.Cဂ/Dဇ0Gဈ1Hဇ2Iဈ3Jင4Kဈ5Lဉ6Mင7Oဉ8", new Object[]{"zze", "zzf", "zzg", "zzh", zzf.class, "zzi", zzo.class, "zzj", "zzk", "zzl", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzaa", "zzab", "zzac", "zzad", "zzae", "zzm", "zzaf", "zzag", zzd.class, "zzah", "zzai", "zzaj", "zzak", "zzal", "zzam", "zzan", "zzao", "zzap", "zzaq", "zzar", "zzas", "zzat", "zzau", "zzav", "zzaw", "zzax", "zzay", zzgp.zzb(), "zzaz", "zzba", "zzbb", "zzbc", "zzbd", "zzbe", "zzbf", "zzbg", "zzbh", "zzbi", "zzbj", "zzbk", "zzbl", "zzbm", "zzbn", "zzbo", "zzbp"});
                case 4:
                    return zzc;
                case 5:
                    zzmu<zzk> zzmuVar = zzd;
                    if (zzmuVar != null) {
                        return zzmuVar;
                    }
                    synchronized (zzk.class) {
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

        public static /* synthetic */ void zzb(zzk zzkVar) {
            zzkVar.zze &= -262145;
            zzkVar.zzaa = zzc.zzaa;
        }

        public static /* synthetic */ void zzd(zzk zzkVar) {
            zzkVar.zze &= -257;
            zzkVar.zzq = zzc.zzq;
        }

        public static /* synthetic */ void zzf(zzk zzkVar, int i) {
            zzkVar.zzf |= 8388608;
            zzkVar.zzbo = i;
        }

        public static /* synthetic */ void zzg(zzk zzkVar, String str) {
            str.getClass();
            zzkVar.zzf |= UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            zzkVar.zzax = str;
        }

        public static /* synthetic */ void zzk(zzk zzkVar, String str) {
            str.getClass();
            zzkVar.zzf |= 16384;
            zzkVar.zzbf = str;
        }

        public static /* synthetic */ void zzl(zzk zzkVar, String str) {
            str.getClass();
            zzkVar.zze |= 16777216;
            zzkVar.zzah = str;
        }

        public static /* synthetic */ void zzm(zzk zzkVar, String str) {
            str.getClass();
            zzkVar.zze |= 4194304;
            zzkVar.zzae = str;
        }

        public static /* synthetic */ void zzh(zzk zzkVar, long j) {
            zzkVar.zze |= 16;
            zzkVar.zzm = j;
        }

        public static /* synthetic */ void zzi(zzk zzkVar, long j) {
            zzkVar.zze |= 4;
            zzkVar.zzk = j;
        }

        public static /* synthetic */ void zzj(zzk zzkVar, long j) {
            zzkVar.zzf |= 32768;
            zzkVar.zzbg = j;
        }

        public static /* synthetic */ void zzc(zzk zzkVar) {
            zzkVar.zzag = zzlc.zzch();
        }

        public static /* synthetic */ void zze(zzk zzkVar, String str) {
            str.getClass();
            zzkVar.zze |= UserMetadata.MAX_INTERNAL_KEY_SIZE;
            zzkVar.zzv = str;
        }

        public static /* synthetic */ void zzf(zzk zzkVar, long j) {
            zzkVar.zze |= 16384;
            zzkVar.zzw = j;
        }

        public static /* synthetic */ void zzb(zzk zzkVar, int i) {
            zzkVar.zzcq();
            zzkVar.zzi.remove(i);
        }

        public static /* synthetic */ void zzc(zzk zzkVar, int i) {
            zzkVar.zzf |= 1048576;
            zzkVar.zzbl = i;
        }

        public static /* synthetic */ void zzg(zzk zzkVar, long j) {
            zzkVar.zze |= 32;
            zzkVar.zzn = j;
        }

        public static /* synthetic */ void zzh(zzk zzkVar, int i) {
            zzkVar.zzf |= 2;
            zzkVar.zzaq = i;
        }

        public static /* synthetic */ void zzi(zzk zzkVar, int i) {
            zzkVar.zze |= UserMetadata.MAX_ATTRIBUTE_SIZE;
            zzkVar.zzs = i;
        }

        public static /* synthetic */ void zzk(zzk zzkVar, long j) {
            zzkVar.zze |= 2;
            zzkVar.zzj = j;
        }

        public static /* synthetic */ void zzl(zzk zzkVar, long j) {
            zzkVar.zze |= 32768;
            zzkVar.zzx = j;
        }

        public static /* synthetic */ void zzd(zzk zzkVar, String str) {
            str.getClass();
            zzkVar.zze |= 2048;
            zzkVar.zzt = str;
        }

        public static /* synthetic */ void zzb(zzk zzkVar, String str) {
            str.getClass();
            zzkVar.zze |= 4096;
            zzkVar.zzu = str;
        }

        public static /* synthetic */ void zzc(zzk zzkVar, String str) {
            str.getClass();
            zzkVar.zze |= 262144;
            zzkVar.zzaa = str;
        }

        public static /* synthetic */ void zze(zzk zzkVar, int i) {
            zzkVar.zze |= 1048576;
            zzkVar.zzac = i;
        }

        public static /* synthetic */ void zzg(zzk zzkVar, int i) {
            zzkVar.zze |= 1;
            zzkVar.zzg = 1;
        }

        public static /* synthetic */ void zzd(zzk zzkVar, int i) {
            zzkVar.zze |= 33554432;
            zzkVar.zzai = i;
        }

        public static /* synthetic */ void zze(zzk zzkVar, long j) {
            zzkVar.zze |= 8;
            zzkVar.zzl = j;
        }

        public static /* synthetic */ void zzb(zzk zzkVar, long j) {
            zzkVar.zze |= 536870912;
            zzkVar.zzam = j;
        }

        public static /* synthetic */ void zzc(zzk zzkVar, long j) {
            zzkVar.zze |= 524288;
            zzkVar.zzab = j;
        }

        public static /* synthetic */ void zzd(zzk zzkVar, long j) {
            zzkVar.zzf |= 16;
            zzkVar.zzau = j;
        }

        public static /* synthetic */ void zzb(zzk zzkVar, boolean z2) {
            zzkVar.zzf |= 262144;
            zzkVar.zzbj = z2;
        }

        public static /* synthetic */ void zzc(zzk zzkVar, boolean z2) {
            zzkVar.zze |= 131072;
            zzkVar.zzz = z2;
        }

        public static /* synthetic */ void zzd(zzk zzkVar, boolean z2) {
            zzkVar.zze |= 8388608;
            zzkVar.zzaf = z2;
        }

        public static /* synthetic */ void zza(zzk zzkVar, Iterable iterable) {
            zzll<zzd> zzllVar = zzkVar.zzag;
            if (!zzllVar.zzc()) {
                zzkVar.zzag = zzlc.zza(zzllVar);
            }
            zzji.zza(iterable, zzkVar.zzag);
        }

        public static /* synthetic */ void zza(zzk zzkVar, zzf zzfVar) {
            zzfVar.getClass();
            zzkVar.zzcp();
            zzkVar.zzh.add(zzfVar);
        }

        public static /* synthetic */ void zza(zzk zzkVar, zzo zzoVar) {
            zzoVar.getClass();
            zzkVar.zzcq();
            zzkVar.zzi.add(zzoVar);
        }

        public static /* synthetic */ void zza(zzk zzkVar, int i) {
            zzkVar.zzcp();
            zzkVar.zzh.remove(i);
        }

        public static /* synthetic */ void zza(zzk zzkVar, zza zzaVar) {
            zzaVar.getClass();
            zzkVar.zzbp = zzaVar;
            zzkVar.zzf |= 16777216;
        }

        public static /* synthetic */ void zza(zzk zzkVar, String str) {
            str.getClass();
            zzkVar.zzf |= 4;
            zzkVar.zzar = str;
        }

        public static /* synthetic */ void zza(zzk zzkVar, zzc zzcVar) {
            zzcVar.getClass();
            zzkVar.zzbn = zzcVar;
            zzkVar.zzf |= 4194304;
        }

        public static /* synthetic */ void zza(zzk zzkVar, long j) {
            zzkVar.zzf |= 32;
            zzkVar.zzav = j;
        }

        public static /* synthetic */ void zza(zzk zzkVar, boolean z2) {
            zzkVar.zzf |= 65536;
            zzkVar.zzbh = z2;
        }

        public static /* synthetic */ void zza(zzk zzkVar, int i, zzf zzfVar) {
            zzfVar.getClass();
            zzkVar.zzcp();
            zzkVar.zzh.set(i, zzfVar);
        }

        public static /* synthetic */ void zza(zzk zzkVar, zzl zzlVar) {
            zzlVar.getClass();
            zzkVar.zzas = zzlVar;
            zzkVar.zzf |= 8;
        }

        public static /* synthetic */ void zza(zzk zzkVar, int i, zzo zzoVar) {
            zzoVar.getClass();
            zzkVar.zzcq();
            zzkVar.zzi.set(i, zzoVar);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class zzl extends zzlc<zzl, zza> implements zzmn {
        private static final zzl zzc;
        private static volatile zzmu<zzl> zzd;
        private int zze;
        private int zzf = 1;
        private zzll<zzg> zzg = zzlc.zzch();

        /* JADX INFO: compiled from: Proguard */
        public static final class zza extends zzlc.zzb<zzl, zza> implements zzmn {
            public /* synthetic */ zza(zzhc zzhcVar) {
                this();
            }

            public final zza zza(zzg.zza zzaVar) {
                zzak();
                zzl.zza((zzl) this.zza, (zzg) ((zzlc) zzaVar.zzai()));
                return this;
            }

            private zza() {
                super(zzl.zzb());
            }
        }

        /* JADX INFO: compiled from: Proguard */
        public enum zzb implements zzlh {
            RADS(1),
            PROVISIONING(2);

            private final int zzd;

            zzb(int i) {
                this.zzd = i;
            }

            public static zzlg zzb() {
                return zzhd.zza;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + zzb.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzd + " name=" + name() + '>';
            }

            @Override // com.google.android.gms.internal.measurement.zzlh
            public final int zza() {
                return this.zzd;
            }

            public static zzb zza(int i) {
                if (i == 1) {
                    return RADS;
                }
                if (i != 2) {
                    return null;
                }
                return PROVISIONING;
            }
        }

        static {
            zzl zzlVar = new zzl();
            zzc = zzlVar;
            zzlc.zza((Class<zzl>) zzl.class, zzlVar);
        }

        private zzl() {
        }

        public static zza zza() {
            return zzc.zzcc();
        }

        public static /* bridge */ /* synthetic */ zzl zzb() {
            return zzc;
        }

        @Override // com.google.android.gms.internal.measurement.zzlc
        public final Object zza(int i, Object obj, Object obj2) {
            zzmu zzaVar;
            switch (zzgm.zza[i - 1]) {
                case 1:
                    return new zzl();
                case 2:
                    return new zza(null);
                case 3:
                    return zzlc.zza(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b", new Object[]{"zze", "zzf", zzb.zzb(), "zzg", zzg.class});
                case 4:
                    return zzc;
                case 5:
                    zzmu<zzl> zzmuVar = zzd;
                    if (zzmuVar != null) {
                        return zzmuVar;
                    }
                    synchronized (zzl.class) {
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

        public static /* synthetic */ void zza(zzl zzlVar, zzg zzgVar) {
            zzgVar.getClass();
            zzll<zzg> zzllVar = zzlVar.zzg;
            if (!zzllVar.zzc()) {
                zzlVar.zzg = zzlc.zza(zzllVar);
            }
            zzlVar.zzg.add(zzgVar);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class zzm extends zzlc<zzm, zza> implements zzmn {
        private static final zzm zzc;
        private static volatile zzmu<zzm> zzd;
        private zzli zze = zzlc.zzcg();
        private zzli zzf = zzlc.zzcg();
        private zzll<zze> zzg = zzlc.zzch();
        private zzll<zzn> zzh = zzlc.zzch();

        /* JADX INFO: compiled from: Proguard */
        public static final class zza extends zzlc.zzb<zzm, zza> implements zzmn {
            public /* synthetic */ zza(zzhe zzheVar) {
                this();
            }

            public final zza zza(Iterable<? extends zze> iterable) {
                zzak();
                zzm.zza((zzm) this.zza, iterable);
                return this;
            }

            public final zza zzb(Iterable<? extends Long> iterable) {
                zzak();
                zzm.zzb((zzm) this.zza, iterable);
                return this;
            }

            public final zza zzc(Iterable<? extends zzn> iterable) {
                zzak();
                zzm.zzc((zzm) this.zza, iterable);
                return this;
            }

            public final zza zzd(Iterable<? extends Long> iterable) {
                zzak();
                zzm.zzd((zzm) this.zza, iterable);
                return this;
            }

            private zza() {
                super(zzm.zzf());
            }

            public final zza zza() {
                zzak();
                zzm.zza((zzm) this.zza);
                return this;
            }

            public final zza zzb() {
                zzak();
                zzm.zzb((zzm) this.zza);
                return this;
            }

            public final zza zzc() {
                zzak();
                zzm.zzc((zzm) this.zza);
                return this;
            }

            public final zza zzd() {
                zzak();
                zzm.zzd((zzm) this.zza);
                return this;
            }
        }

        static {
            zzm zzmVar = new zzm();
            zzc = zzmVar;
            zzlc.zza((Class<zzm>) zzm.class, zzmVar);
        }

        private zzm() {
        }

        public static zza zze() {
            return zzc.zzcc();
        }

        public static /* bridge */ /* synthetic */ zzm zzf() {
            return zzc;
        }

        public static zzm zzg() {
            return zzc;
        }

        public final int zza() {
            return this.zzg.size();
        }

        public final int zzb() {
            return this.zzf.size();
        }

        public final int zzc() {
            return this.zzh.size();
        }

        public final int zzd() {
            return this.zze.size();
        }

        public final List<zze> zzh() {
            return this.zzg;
        }

        public final List<Long> zzi() {
            return this.zzf;
        }

        public final List<zzn> zzj() {
            return this.zzh;
        }

        public final List<Long> zzk() {
            return this.zze;
        }

        public static /* synthetic */ void zzb(zzm zzmVar, Iterable iterable) {
            zzli zzliVar = zzmVar.zzf;
            if (!zzliVar.zzc()) {
                zzmVar.zzf = zzlc.zza(zzliVar);
            }
            zzji.zza(iterable, zzmVar.zzf);
        }

        public static /* synthetic */ void zzc(zzm zzmVar, Iterable iterable) {
            zzll<zzn> zzllVar = zzmVar.zzh;
            if (!zzllVar.zzc()) {
                zzmVar.zzh = zzlc.zza(zzllVar);
            }
            zzji.zza(iterable, zzmVar.zzh);
        }

        public static /* synthetic */ void zzd(zzm zzmVar, Iterable iterable) {
            zzli zzliVar = zzmVar.zze;
            if (!zzliVar.zzc()) {
                zzmVar.zze = zzlc.zza(zzliVar);
            }
            zzji.zza(iterable, zzmVar.zze);
        }

        @Override // com.google.android.gms.internal.measurement.zzlc
        public final Object zza(int i, Object obj, Object obj2) {
            zzmu zzaVar;
            switch (zzgm.zza[i - 1]) {
                case 1:
                    return new zzm();
                case 2:
                    return new zza(null);
                case 3:
                    return zzlc.zza(zzc, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zze", "zzf", "zzg", zze.class, "zzh", zzn.class});
                case 4:
                    return zzc;
                case 5:
                    zzmu<zzm> zzmuVar = zzd;
                    if (zzmuVar != null) {
                        return zzmuVar;
                    }
                    synchronized (zzm.class) {
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

        public static /* synthetic */ void zzb(zzm zzmVar) {
            zzmVar.zzf = zzlc.zzcg();
        }

        public static /* synthetic */ void zzc(zzm zzmVar) {
            zzmVar.zzh = zzlc.zzch();
        }

        public static /* synthetic */ void zzd(zzm zzmVar) {
            zzmVar.zze = zzlc.zzcg();
        }

        public static /* synthetic */ void zza(zzm zzmVar, Iterable iterable) {
            zzll<zze> zzllVar = zzmVar.zzg;
            if (!zzllVar.zzc()) {
                zzmVar.zzg = zzlc.zza(zzllVar);
            }
            zzji.zza(iterable, zzmVar.zzg);
        }

        public static /* synthetic */ void zza(zzm zzmVar) {
            zzmVar.zzg = zzlc.zzch();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class zzn extends zzlc<zzn, zza> implements zzmn {
        private static final zzn zzc;
        private static volatile zzmu<zzn> zzd;
        private int zze;
        private int zzf;
        private zzli zzg = zzlc.zzcg();

        /* JADX INFO: compiled from: Proguard */
        public static final class zza extends zzlc.zzb<zzn, zza> implements zzmn {
            public /* synthetic */ zza(zzhf zzhfVar) {
                this();
            }

            public final zza zza(Iterable<? extends Long> iterable) {
                zzak();
                zzn.zza((zzn) this.zza, iterable);
                return this;
            }

            private zza() {
                super(zzn.zzd());
            }

            public final zza zza(int i) {
                zzak();
                zzn.zza((zzn) this.zza, i);
                return this;
            }
        }

        static {
            zzn zznVar = new zzn();
            zzc = zznVar;
            zzlc.zza((Class<zzn>) zzn.class, zznVar);
        }

        private zzn() {
        }

        public static zza zzc() {
            return zzc.zzcc();
        }

        public static /* bridge */ /* synthetic */ zzn zzd() {
            return zzc;
        }

        public final int zza() {
            return this.zzg.size();
        }

        public final int zzb() {
            return this.zzf;
        }

        public final List<Long> zze() {
            return this.zzg;
        }

        public final boolean zzf() {
            return (this.zze & 1) != 0;
        }

        public final long zza(int i) {
            return this.zzg.zzb(i);
        }

        @Override // com.google.android.gms.internal.measurement.zzlc
        public final Object zza(int i, Object obj, Object obj2) {
            zzmu zzaVar;
            switch (zzgm.zza[i - 1]) {
                case 1:
                    return new zzn();
                case 2:
                    return new zza(null);
                case 3:
                    return zzlc.zza(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zze", "zzf", "zzg"});
                case 4:
                    return zzc;
                case 5:
                    zzmu<zzn> zzmuVar = zzd;
                    if (zzmuVar != null) {
                        return zzmuVar;
                    }
                    synchronized (zzn.class) {
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

        public static /* synthetic */ void zza(zzn zznVar, Iterable iterable) {
            zzli zzliVar = zznVar.zzg;
            if (!zzliVar.zzc()) {
                zznVar.zzg = zzlc.zza(zzliVar);
            }
            zzji.zza(iterable, zznVar.zzg);
        }

        public static /* synthetic */ void zza(zzn zznVar, int i) {
            zznVar.zze |= 1;
            zznVar.zzf = i;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class zzo extends zzlc<zzo, zza> implements zzmn {
        private static final zzo zzc;
        private static volatile zzmu<zzo> zzd;
        private int zze;
        private long zzf;
        private String zzg = "";
        private String zzh = "";
        private long zzi;
        private float zzj;
        private double zzk;

        /* JADX INFO: compiled from: Proguard */
        public static final class zza extends zzlc.zzb<zzo, zza> implements zzmn {
            public /* synthetic */ zza(zzhh zzhhVar) {
                this();
            }

            public final zza zza() {
                zzak();
                zzo.zza((zzo) this.zza);
                return this;
            }

            public final zza zzb() {
                zzak();
                zzo.zzb((zzo) this.zza);
                return this;
            }

            public final zza zzc() {
                zzak();
                zzo.zzc((zzo) this.zza);
                return this;
            }

            private zza() {
                super(zzo.zzf());
            }

            public final zza zza(double d) {
                zzak();
                zzo.zza((zzo) this.zza, d);
                return this;
            }

            public final zza zzb(long j) {
                zzak();
                zzo.zzb((zzo) this.zza, j);
                return this;
            }

            public final zza zza(long j) {
                zzak();
                zzo.zza((zzo) this.zza, j);
                return this;
            }

            public final zza zzb(String str) {
                zzak();
                zzo.zzb((zzo) this.zza, str);
                return this;
            }

            public final zza zza(String str) {
                zzak();
                zzo.zza((zzo) this.zza, str);
                return this;
            }
        }

        static {
            zzo zzoVar = new zzo();
            zzc = zzoVar;
            zzlc.zza((Class<zzo>) zzo.class, zzoVar);
        }

        private zzo() {
        }

        public static zza zze() {
            return zzc.zzcc();
        }

        public static /* bridge */ /* synthetic */ zzo zzf() {
            return zzc;
        }

        public final double zza() {
            return this.zzk;
        }

        public final float zzb() {
            return this.zzj;
        }

        public final long zzc() {
            return this.zzi;
        }

        public final long zzd() {
            return this.zzf;
        }

        public final String zzg() {
            return this.zzg;
        }

        public final String zzh() {
            return this.zzh;
        }

        public final boolean zzi() {
            return (this.zze & 32) != 0;
        }

        public final boolean zzj() {
            return (this.zze & 16) != 0;
        }

        public final boolean zzk() {
            return (this.zze & 8) != 0;
        }

        public final boolean zzl() {
            return (this.zze & 1) != 0;
        }

        public final boolean zzm() {
            return (this.zze & 4) != 0;
        }

        public static /* synthetic */ void zzb(zzo zzoVar) {
            zzoVar.zze &= -9;
            zzoVar.zzi = 0L;
        }

        public static /* synthetic */ void zzc(zzo zzoVar) {
            zzoVar.zze &= -5;
            zzoVar.zzh = zzc.zzh;
        }

        @Override // com.google.android.gms.internal.measurement.zzlc
        public final Object zza(int i, Object obj, Object obj2) {
            zzmu zzaVar;
            switch (zzgm.zza[i - 1]) {
                case 1:
                    return new zzo();
                case 2:
                    return new zza(null);
                case 3:
                    return zzlc.zza(zzc, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
                case 4:
                    return zzc;
                case 5:
                    zzmu<zzo> zzmuVar = zzd;
                    if (zzmuVar != null) {
                        return zzmuVar;
                    }
                    synchronized (zzo.class) {
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

        public static /* synthetic */ void zzb(zzo zzoVar, long j) {
            zzoVar.zze |= 1;
            zzoVar.zzf = j;
        }

        public static /* synthetic */ void zzb(zzo zzoVar, String str) {
            str.getClass();
            zzoVar.zze |= 4;
            zzoVar.zzh = str;
        }

        public static /* synthetic */ void zza(zzo zzoVar) {
            zzoVar.zze &= -33;
            zzoVar.zzk = 0.0d;
        }

        public static /* synthetic */ void zza(zzo zzoVar, double d) {
            zzoVar.zze |= 32;
            zzoVar.zzk = d;
        }

        public static /* synthetic */ void zza(zzo zzoVar, long j) {
            zzoVar.zze |= 8;
            zzoVar.zzi = j;
        }

        public static /* synthetic */ void zza(zzo zzoVar, String str) {
            str.getClass();
            zzoVar.zze |= 2;
            zzoVar.zzg = str;
        }
    }
}
