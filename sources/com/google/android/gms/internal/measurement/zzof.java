package com.google.android.gms.internal.measurement;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzc' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public class zzof {
    public static final zzof zza;
    public static final zzof zzb;
    public static final zzof zzc;
    public static final zzof zzd;
    public static final zzof zze;
    public static final zzof zzf;
    public static final zzof zzg;
    public static final zzof zzh;
    public static final zzof zzi;
    public static final zzof zzj;
    public static final zzof zzk;
    public static final zzof zzl;
    public static final zzof zzm;
    public static final zzof zzn;
    public static final zzof zzo;
    public static final zzof zzp;
    public static final zzof zzq;
    public static final zzof zzr;
    private static final /* synthetic */ zzof[] zzs;
    private final zzop zzt;
    private final int zzu;

    static {
        zzof zzofVar = new zzof("DOUBLE", 0, zzop.DOUBLE, 1);
        zza = zzofVar;
        zzof zzofVar2 = new zzof("FLOAT", 1, zzop.FLOAT, 5);
        zzb = zzofVar2;
        zzop zzopVar = zzop.LONG;
        zzof zzofVar3 = new zzof("INT64", 2, zzopVar, 0);
        zzc = zzofVar3;
        zzof zzofVar4 = new zzof("UINT64", 3, zzopVar, 0);
        zzd = zzofVar4;
        zzop zzopVar2 = zzop.INT;
        zzof zzofVar5 = new zzof("INT32", 4, zzopVar2, 0);
        zze = zzofVar5;
        zzof zzofVar6 = new zzof("FIXED64", 5, zzopVar, 1);
        zzf = zzofVar6;
        zzof zzofVar7 = new zzof("FIXED32", 6, zzopVar2, 5);
        zzg = zzofVar7;
        zzof zzofVar8 = new zzof("BOOL", 7, zzop.BOOLEAN, 0);
        zzh = zzofVar8;
        zzoi zzoiVar = new zzoi("STRING", 8, zzop.STRING, 2, null);
        zzi = zzoiVar;
        zzop zzopVar3 = zzop.MESSAGE;
        zzok zzokVar = new zzok("GROUP", 9, zzopVar3, 3, null);
        zzj = zzokVar;
        zzom zzomVar = new zzom("MESSAGE", 10, zzopVar3, 2, null);
        zzk = zzomVar;
        zzoo zzooVar = new zzoo("BYTES", 11, zzop.BYTE_STRING, 2, null);
        zzl = zzooVar;
        zzof zzofVar9 = new zzof("UINT32", 12, zzopVar2, 0);
        zzm = zzofVar9;
        zzof zzofVar10 = new zzof("ENUM", 13, zzop.ENUM, 0);
        zzn = zzofVar10;
        zzof zzofVar11 = new zzof("SFIXED32", 14, zzopVar2, 5);
        zzo = zzofVar11;
        zzof zzofVar12 = new zzof("SFIXED64", 15, zzopVar, 1);
        zzp = zzofVar12;
        zzof zzofVar13 = new zzof("SINT32", 16, zzopVar2, 0);
        zzq = zzofVar13;
        zzof zzofVar14 = new zzof("SINT64", 17, zzopVar, 0);
        zzr = zzofVar14;
        zzs = new zzof[]{zzofVar, zzofVar2, zzofVar3, zzofVar4, zzofVar5, zzofVar6, zzofVar7, zzofVar8, zzoiVar, zzokVar, zzomVar, zzooVar, zzofVar9, zzofVar10, zzofVar11, zzofVar12, zzofVar13, zzofVar14};
    }

    public /* synthetic */ zzof(String str, int i, zzop zzopVar, int i2, zzoq zzoqVar) {
        this(str, i, zzopVar, i2);
    }

    public static zzof[] values() {
        return (zzof[]) zzs.clone();
    }

    public final int zza() {
        return this.zzu;
    }

    public final zzop zzb() {
        return this.zzt;
    }

    private zzof(String str, int i, zzop zzopVar, int i2) {
        this.zzt = zzopVar;
        this.zzu = i2;
    }
}
