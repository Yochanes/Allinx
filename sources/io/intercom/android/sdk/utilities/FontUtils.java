package io.intercom.android.sdk.utilities;

import android.graphics.Typeface;
import android.widget.TextView;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class FontUtils {
    public static void setRobotoLightTypeface(TextView textView) {
        textView.setTypeface(Typeface.create("sans-serif-light", 0));
    }

    public static void setRobotoMediumTypeface(TextView textView) {
        textView.setTypeface(Typeface.create("sans-serif-medium", 0));
    }
}
