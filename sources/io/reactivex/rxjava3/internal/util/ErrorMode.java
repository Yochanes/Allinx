package io.reactivex.rxjava3.internal.util;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ErrorMode {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ ErrorMode[] f51224a = {new ErrorMode("IMMEDIATE", 0), new ErrorMode("BOUNDARY", 1), new ErrorMode("END", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    ErrorMode EF5;

    public static ErrorMode valueOf(String str) {
        return (ErrorMode) Enum.valueOf(ErrorMode.class, str);
    }

    public static ErrorMode[] values() {
        return (ErrorMode[]) f51224a.clone();
    }
}
