package io.intercom.android.sdk.utilities.commons;

import android.text.Html;
import android.text.Spanned;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class HtmlCompat {
    public static Spanned fromHtml(String str) {
        return Html.fromHtml(str, 0);
    }
}
