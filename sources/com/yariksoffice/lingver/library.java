package com.yariksoffice.lingver;

import android.content.res.Configuration;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.yariksoffice.lingver.ExtensionsKt, reason: from Kotlin metadata */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"com.yariksoffice.lingver.library"}, m18303k = 2, m18304mv = {1, 4, 0})
public final class library {
    /* JADX INFO: renamed from: a */
    public static final Locale m15436a(Configuration getLocaleCompat) {
        Intrinsics.m18600h(getLocaleCompat, "$this$getLocaleCompat");
        Locale locale = getLocaleCompat.getLocales().get(0);
        Intrinsics.m18595c(locale, "locales.get(0)");
        return locale;
    }
}
