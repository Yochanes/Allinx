package io.ktor.util;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lio/ktor/util/CaseInsensitiveString;", "", "ktor-utils"}, m18303k = 1, m18304mv = {1, 4, 2})
public final class CaseInsensitiveString {

    /* JADX INFO: renamed from: a */
    public final int f46443a;

    /* JADX INFO: renamed from: b */
    public final String f46444b;

    public CaseInsensitiveString(String content) {
        Intrinsics.m18599g(content, "content");
        this.f46444b = content;
        String lowerCase = content.toLowerCase();
        Intrinsics.m18598f(lowerCase, "(this as java.lang.String).toLowerCase()");
        this.f46443a = lowerCase.hashCode();
    }

    public final boolean equals(Object obj) {
        String str;
        if (!(obj instanceof CaseInsensitiveString)) {
            obj = null;
        }
        CaseInsensitiveString caseInsensitiveString = (CaseInsensitiveString) obj;
        return (caseInsensitiveString == null || (str = caseInsensitiveString.f46444b) == null || !str.equalsIgnoreCase(this.f46444b)) ? false : true;
    }

    /* JADX INFO: renamed from: hashCode, reason: from getter */
    public final int getF46443a() {
        return this.f46443a;
    }

    /* JADX INFO: renamed from: toString, reason: from getter */
    public final String getF46444b() {
        return this.f46444b;
    }
}
