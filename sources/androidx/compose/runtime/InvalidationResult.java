package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/runtime/InvalidationResult;", "", "runtime_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class InvalidationResult {

    /* JADX INFO: renamed from: a */
    public static final InvalidationResult f16376a;

    /* JADX INFO: renamed from: b */
    public static final InvalidationResult f16377b;

    /* JADX INFO: renamed from: c */
    public static final InvalidationResult f16378c;

    /* JADX INFO: renamed from: d */
    public static final InvalidationResult f16379d;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ InvalidationResult[] f16380f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ EnumEntries f16381g;

    static {
        InvalidationResult invalidationResult = new InvalidationResult("IGNORED", 0);
        f16376a = invalidationResult;
        InvalidationResult invalidationResult2 = new InvalidationResult("SCHEDULED", 1);
        f16377b = invalidationResult2;
        InvalidationResult invalidationResult3 = new InvalidationResult("DEFERRED", 2);
        f16378c = invalidationResult3;
        InvalidationResult invalidationResult4 = new InvalidationResult("IMMINENT", 3);
        f16379d = invalidationResult4;
        InvalidationResult[] invalidationResultArr = {invalidationResult, invalidationResult2, invalidationResult3, invalidationResult4};
        f16380f = invalidationResultArr;
        f16381g = EnumEntriesKt.m18563a(invalidationResultArr);
    }

    public static InvalidationResult valueOf(String str) {
        return (InvalidationResult) Enum.valueOf(InvalidationResult.class, str);
    }

    public static InvalidationResult[] values() {
        return (InvalidationResult[]) f16380f.clone();
    }
}
