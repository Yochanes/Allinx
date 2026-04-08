package kotlin.time;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@SinceKotlin
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlin/time/DurationUnit;", "", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
@WasExperimental
public final class DurationUnit {

    /* JADX INFO: renamed from: b */
    public static final DurationUnit f55219b;

    /* JADX INFO: renamed from: c */
    public static final DurationUnit f55220c;

    /* JADX INFO: renamed from: d */
    public static final DurationUnit f55221d;

    /* JADX INFO: renamed from: f */
    public static final DurationUnit f55222f;

    /* JADX INFO: renamed from: g */
    public static final DurationUnit f55223g;

    /* JADX INFO: renamed from: i */
    public static final DurationUnit f55224i;

    /* JADX INFO: renamed from: j */
    public static final DurationUnit f55225j;

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ DurationUnit[] f55226n;

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ EnumEntries f55227o;

    /* JADX INFO: renamed from: a */
    public final TimeUnit f55228a;

    static {
        DurationUnit durationUnit = new DurationUnit("NANOSECONDS", 0, TimeUnit.NANOSECONDS);
        f55219b = durationUnit;
        DurationUnit durationUnit2 = new DurationUnit("MICROSECONDS", 1, TimeUnit.MICROSECONDS);
        f55220c = durationUnit2;
        DurationUnit durationUnit3 = new DurationUnit("MILLISECONDS", 2, TimeUnit.MILLISECONDS);
        f55221d = durationUnit3;
        DurationUnit durationUnit4 = new DurationUnit("SECONDS", 3, TimeUnit.SECONDS);
        f55222f = durationUnit4;
        DurationUnit durationUnit5 = new DurationUnit("MINUTES", 4, TimeUnit.MINUTES);
        f55223g = durationUnit5;
        DurationUnit durationUnit6 = new DurationUnit("HOURS", 5, TimeUnit.HOURS);
        f55224i = durationUnit6;
        DurationUnit durationUnit7 = new DurationUnit("DAYS", 6, TimeUnit.DAYS);
        f55225j = durationUnit7;
        DurationUnit[] durationUnitArr = {durationUnit, durationUnit2, durationUnit3, durationUnit4, durationUnit5, durationUnit6, durationUnit7};
        f55226n = durationUnitArr;
        f55227o = EnumEntriesKt.m18563a(durationUnitArr);
    }

    public DurationUnit(String str, int i, TimeUnit timeUnit) {
        this.f55228a = timeUnit;
    }

    public static DurationUnit valueOf(String str) {
        return (DurationUnit) Enum.valueOf(DurationUnit.class, str);
    }

    public static DurationUnit[] values() {
        return (DurationUnit[]) f55226n.clone();
    }
}
