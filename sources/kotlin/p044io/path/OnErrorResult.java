package kotlin.p044io.path;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@SinceKotlin
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlin/io/path/OnErrorResult;", "", "kotlin-stdlib-jdk7"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
@ExperimentalPathApi
public final class OnErrorResult {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ OnErrorResult[] f51628a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ EnumEntries f51629b;

    static {
        OnErrorResult[] onErrorResultArr = {new OnErrorResult("SKIP_SUBTREE", 0), new OnErrorResult("TERMINATE", 1)};
        f51628a = onErrorResultArr;
        f51629b = EnumEntriesKt.m18563a(onErrorResultArr);
    }

    public static OnErrorResult valueOf(String str) {
        return (OnErrorResult) Enum.valueOf(OnErrorResult.class, str);
    }

    public static OnErrorResult[] values() {
        return (OnErrorResult[]) f51628a.clone();
    }
}
