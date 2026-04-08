package io.ktor.http.content;

import io.ktor.http.HttpStatusCode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/http/content/VersionCheckResult;", "", "ktor-http"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class VersionCheckResult {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ VersionCheckResult[] f45941a;

    /* JADX INFO: Fake field, exist only in values array */
    VersionCheckResult EF0;

    static {
        HttpStatusCode httpStatusCode = HttpStatusCode.f45671c;
        HttpStatusCode httpStatusCode2 = HttpStatusCode.f45671c;
        VersionCheckResult versionCheckResult = new VersionCheckResult("OK", 0);
        HttpStatusCode httpStatusCode3 = HttpStatusCode.f45671c;
        VersionCheckResult versionCheckResult2 = new VersionCheckResult("NOT_MODIFIED", 1);
        HttpStatusCode httpStatusCode4 = HttpStatusCode.f45671c;
        f45941a = new VersionCheckResult[]{versionCheckResult, versionCheckResult2, new VersionCheckResult("PRECONDITION_FAILED", 2)};
    }

    public static VersionCheckResult valueOf(String str) {
        return (VersionCheckResult) Enum.valueOf(VersionCheckResult.class, str);
    }

    public static VersionCheckResult[] values() {
        return (VersionCheckResult[]) f45941a.clone();
    }
}
