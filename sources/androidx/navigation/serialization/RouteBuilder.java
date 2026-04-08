package androidx.navigation.serialization;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/navigation/serialization/RouteBuilder;", "T", "", "ParamType", "navigation-common_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public final class RouteBuilder<T> {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/navigation/serialization/RouteBuilder$ParamType;", "", "navigation-common_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class ParamType {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ ParamType[] f30521a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ EnumEntries f30522b;

        static {
            ParamType[] paramTypeArr = {new ParamType("PATH", 0), new ParamType("QUERY", 1)};
            f30521a = paramTypeArr;
            f30522b = EnumEntriesKt.m18563a(paramTypeArr);
        }

        public static ParamType valueOf(String str) {
            return (ParamType) Enum.valueOf(ParamType.class, str);
        }

        public static ParamType[] values() {
            return (ParamType[]) f30521a.clone();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[ParamType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ParamType[] paramTypeArr = ParamType.f30521a;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }
}
