package kotlin.contracts;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.internal.ContractsDsl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@SinceKotlin
@ContractsDsl
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlin/contracts/InvocationKind;", "", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
@ExperimentalContracts
public final class InvocationKind {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ InvocationKind[] f51573a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ EnumEntries f51574b;

    static {
        InvocationKind[] invocationKindArr = {new InvocationKind("AT_MOST_ONCE", 0), new InvocationKind("AT_LEAST_ONCE", 1), new InvocationKind("EXACTLY_ONCE", 2), new InvocationKind("UNKNOWN", 3)};
        f51573a = invocationKindArr;
        f51574b = EnumEntriesKt.m18563a(invocationKindArr);
    }

    public static InvocationKind valueOf(String str) {
        return (InvocationKind) Enum.valueOf(InvocationKind.class, str);
    }

    public static InvocationKind[] values() {
        return (InvocationKind[]) f51573a.clone();
    }
}
