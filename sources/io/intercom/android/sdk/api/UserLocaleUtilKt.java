package io.intercom.android.sdk.api;

import android.content.Context;
import android.os.LocaleList;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¨\u0006\u0004"}, m18302d2 = {"getUserLocaleString", "", "context", "Landroid/content/Context;", "intercom-sdk-base_release"}, m18303k = 2, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class UserLocaleUtilKt {
    @NotNull
    public static final String getUserLocaleString(@NotNull Context context) {
        Intrinsics.m18599g(context, "context");
        LocaleList locales = context.getResources().getConfiguration().getLocales();
        Intrinsics.m18598f(locales, "getLocales(...)");
        ArrayList arrayList = new ArrayList();
        int size = locales.size();
        for (int i = 0; i < size; i++) {
            Locale locale = locales.get(i);
            arrayList.add(locale.getLanguage() + '-' + locale.getCountry());
        }
        return CollectionsKt.m18409J(arrayList, ",", null, null, null, 62);
    }
}
