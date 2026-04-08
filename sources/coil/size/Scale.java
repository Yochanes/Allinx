package coil.size;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Lcoil/size/Scale;", "", "coil-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class Scale {

    /* JADX INFO: renamed from: a */
    public static final Scale f33951a;

    /* JADX INFO: renamed from: b */
    public static final Scale f33952b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ Scale[] f33953c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ EnumEntries f33954d;

    static {
        Scale scale = new Scale("FILL", 0);
        f33951a = scale;
        Scale scale2 = new Scale("FIT", 1);
        f33952b = scale2;
        Scale[] scaleArr = {scale, scale2};
        f33953c = scaleArr;
        f33954d = EnumEntriesKt.m18563a(scaleArr);
    }

    public static Scale valueOf(String str) {
        return (Scale) Enum.valueOf(Scale.class, str);
    }

    public static Scale[] values() {
        return (Scale[]) f33953c.clone();
    }
}
