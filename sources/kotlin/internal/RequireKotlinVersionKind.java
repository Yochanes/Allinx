package kotlin.internal;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@SinceKotlin
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0081\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlin/internal/RequireKotlinVersionKind;", "", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class RequireKotlinVersionKind {

    /* JADX INFO: renamed from: a */
    public static final RequireKotlinVersionKind f51611a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ RequireKotlinVersionKind[] f51612b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ EnumEntries f51613c;

    static {
        RequireKotlinVersionKind requireKotlinVersionKind = new RequireKotlinVersionKind("LANGUAGE_VERSION", 0);
        f51611a = requireKotlinVersionKind;
        RequireKotlinVersionKind[] requireKotlinVersionKindArr = {requireKotlinVersionKind, new RequireKotlinVersionKind("COMPILER_VERSION", 1), new RequireKotlinVersionKind("API_VERSION", 2)};
        f51612b = requireKotlinVersionKindArr;
        f51613c = EnumEntriesKt.m18563a(requireKotlinVersionKindArr);
    }

    public static RequireKotlinVersionKind valueOf(String str) {
        return (RequireKotlinVersionKind) Enum.valueOf(RequireKotlinVersionKind.class, str);
    }

    public static RequireKotlinVersionKind[] values() {
        return (RequireKotlinVersionKind[]) f51612b.clone();
    }
}
