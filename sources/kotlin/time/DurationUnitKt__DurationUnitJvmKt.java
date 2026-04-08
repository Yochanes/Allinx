package kotlin.time;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"kotlin-stdlib"}, m18303k = 5, m18304mv = {2, 1, 0}, m18306xi = 49, m18307xs = "kotlin/time/DurationUnitKt")
class DurationUnitKt__DurationUnitJvmKt {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {2, 1, 0}, m18306xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[TimeUnit.values().length];
            try {
                iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TimeUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TimeUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TimeUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TimeUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[TimeUnit.DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static final double m20483a(double d, DurationUnit durationUnit, DurationUnit targetUnit) {
        Intrinsics.m18599g(targetUnit, "targetUnit");
        long jConvert = targetUnit.f55228a.convert(1L, durationUnit.f55228a);
        return jConvert > 0 ? d * jConvert : d / r8.convert(1L, r9);
    }

    /* JADX INFO: renamed from: b */
    public static final long m20484b(long j, DurationUnit sourceUnit, DurationUnit targetUnit) {
        Intrinsics.m18599g(sourceUnit, "sourceUnit");
        Intrinsics.m18599g(targetUnit, "targetUnit");
        return targetUnit.f55228a.convert(j, sourceUnit.f55228a);
    }

    /* JADX INFO: renamed from: c */
    public static final long m20485c(long j, DurationUnit sourceUnit, DurationUnit targetUnit) {
        Intrinsics.m18599g(sourceUnit, "sourceUnit");
        Intrinsics.m18599g(targetUnit, "targetUnit");
        return targetUnit.f55228a.convert(j, sourceUnit.f55228a);
    }
}
