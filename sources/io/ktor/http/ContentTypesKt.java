package io.ktor.http;

import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"ktor-http"}, m18303k = 2, m18304mv = {1, 4, 2})
public final class ContentTypesKt {
    /* JADX INFO: renamed from: a */
    public static final Charset m16949a(ContentType charset) {
        Intrinsics.m18599g(charset, "$this$charset");
        String strM16963a = charset.m16963a("charset");
        if (strM16963a != null) {
            return Charset.forName(strM16963a);
        }
        return null;
    }
}
