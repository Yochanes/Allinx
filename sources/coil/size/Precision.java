package coil.size;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Lcoil/size/Precision;", "", "coil-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class Precision {

    /* JADX INFO: renamed from: a */
    public static final Precision f33944a;

    /* JADX INFO: renamed from: b */
    public static final Precision f33945b;

    /* JADX INFO: renamed from: c */
    public static final Precision f33946c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ Precision[] f33947d;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ EnumEntries f33948f;

    static {
        Precision precision = new Precision("EXACT", 0);
        f33944a = precision;
        Precision precision2 = new Precision("INEXACT", 1);
        f33945b = precision2;
        Precision precision3 = new Precision("AUTOMATIC", 2);
        f33946c = precision3;
        Precision[] precisionArr = {precision, precision2, precision3};
        f33947d = precisionArr;
        f33948f = EnumEntriesKt.m18563a(precisionArr);
    }

    public static Precision valueOf(String str) {
        return (Precision) Enum.valueOf(Precision.class, str);
    }

    public static Precision[] values() {
        return (Precision[]) f33947d.clone();
    }
}
