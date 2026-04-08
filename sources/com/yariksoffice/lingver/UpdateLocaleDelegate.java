package com.yariksoffice.lingver;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.LocaleList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/yariksoffice/lingver/UpdateLocaleDelegate;", "", "com.yariksoffice.lingver.library"}, m18303k = 1, m18304mv = {1, 4, 0})
public final class UpdateLocaleDelegate {
    /* JADX INFO: renamed from: a */
    public static void m15438a(Context context, Locale locale) {
        Locale.setDefault(locale);
        Resources res = context.getResources();
        Intrinsics.m18595c(res, "res");
        Configuration configuration = res.getConfiguration();
        Intrinsics.m18595c(configuration, "res.configuration");
        if (library.m15436a(configuration).equals(locale)) {
            return;
        }
        Configuration configuration2 = new Configuration(res.getConfiguration());
        LinkedHashSet linkedHashSetM18498b = SetsKt.m18498b(locale);
        LocaleList localeList = LocaleList.getDefault();
        Intrinsics.m18595c(localeList, "LocaleList.getDefault()");
        int size = localeList.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            Locale locale2 = localeList.get(i);
            Intrinsics.m18595c(locale2, "defaultLocales[it]");
            arrayList.add(locale2);
        }
        linkedHashSetM18498b.addAll(arrayList);
        Object[] array = linkedHashSetM18498b.toArray(new Locale[0]);
        if (array == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        Locale[] localeArr = (Locale[]) array;
        configuration2.setLocales(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
        res.updateConfiguration(configuration2, res.getDisplayMetrics());
    }
}
