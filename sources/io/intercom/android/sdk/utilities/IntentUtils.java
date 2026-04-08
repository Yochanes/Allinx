package io.intercom.android.sdk.utilities;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.logger.LumberMill;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class IntentUtils {
    private static final Twig twig = LumberMill.getLogger();

    public static void safelyOpenIntent(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 30) {
            intent.addCategory("android.intent.category.BROWSABLE");
            try {
                context.startActivity(intent);
                return;
            } catch (ActivityNotFoundException unused) {
                twig.m15308i("This device has no application that can handle the Uri passed in", new Object[0]);
                return;
            }
        }
        if (context.getPackageManager().resolveActivity(intent, 65536) == null) {
            twig.m15308i("This device has no application that can handle the Uri passed in", new Object[0]);
        } else {
            context.startActivity(intent);
        }
    }
}
