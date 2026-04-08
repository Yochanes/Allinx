package coil.decode;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Lcoil/decode/ExifOrientationPolicy;", "", "coil-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class ExifOrientationPolicy {

    /* JADX INFO: renamed from: a */
    public static final ExifOrientationPolicy f33481a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ ExifOrientationPolicy[] f33482b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ EnumEntries f33483c;

    static {
        ExifOrientationPolicy exifOrientationPolicy = new ExifOrientationPolicy("IGNORE", 0);
        ExifOrientationPolicy exifOrientationPolicy2 = new ExifOrientationPolicy("RESPECT_PERFORMANCE", 1);
        f33481a = exifOrientationPolicy2;
        ExifOrientationPolicy[] exifOrientationPolicyArr = {exifOrientationPolicy, exifOrientationPolicy2, new ExifOrientationPolicy("RESPECT_ALL", 2)};
        f33482b = exifOrientationPolicyArr;
        f33483c = EnumEntriesKt.m18563a(exifOrientationPolicyArr);
    }

    public static ExifOrientationPolicy valueOf(String str) {
        return (ExifOrientationPolicy) Enum.valueOf(ExifOrientationPolicy.class, str);
    }

    public static ExifOrientationPolicy[] values() {
        return (ExifOrientationPolicy[]) f33482b.clone();
    }
}
