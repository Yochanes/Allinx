package androidx.navigation.serialization;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/navigation/serialization/InternalType;", "", "navigation-common_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
final class InternalType {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ InternalType[] f30519a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ EnumEntries f30520b;

    static {
        InternalType[] internalTypeArr = {new InternalType("INT", 0), new InternalType("INT_NULLABLE", 1), new InternalType("BOOL", 2), new InternalType("BOOL_NULLABLE", 3), new InternalType("DOUBLE", 4), new InternalType("DOUBLE_NULLABLE", 5), new InternalType("FLOAT", 6), new InternalType("FLOAT_NULLABLE", 7), new InternalType("LONG", 8), new InternalType("LONG_NULLABLE", 9), new InternalType("STRING", 10), new InternalType("STRING_NULLABLE", 11), new InternalType("INT_ARRAY", 12), new InternalType("BOOL_ARRAY", 13), new InternalType("DOUBLE_ARRAY", 14), new InternalType("FLOAT_ARRAY", 15), new InternalType("LONG_ARRAY", 16), new InternalType("ARRAY", 17), new InternalType("LIST", 18), new InternalType("ENUM", 19), new InternalType("ENUM_NULLABLE", 20), new InternalType("UNKNOWN", 21)};
        f30519a = internalTypeArr;
        f30520b = EnumEntriesKt.m18563a(internalTypeArr);
    }

    public static InternalType valueOf(String str) {
        return (InternalType) Enum.valueOf(InternalType.class, str);
    }

    public static InternalType[] values() {
        return (InternalType[]) f30519a.clone();
    }
}
