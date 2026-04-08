package androidx.work.impl.utils;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.Logger;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class PackageManagerHelper {

    /* JADX INFO: renamed from: a */
    public static final String f33074a = Logger.m12101g("PackageManagerHelper");

    /* JADX INFO: renamed from: a */
    public static void m12282a(Context context, Class cls, boolean z2) {
        String str = f33074a;
        try {
            int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, cls.getName()));
            boolean z3 = false;
            if (componentEnabledSetting != 0 && componentEnabledSetting == 1) {
                z3 = true;
            }
            if (z2 == z3) {
                Logger.m12100e().mo12102a(str, "Skipping component enablement for ".concat(cls.getName()));
                return;
            }
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z2 ? 1 : 2, 1);
            Logger loggerM12100e = Logger.m12100e();
            StringBuilder sb = new StringBuilder();
            sb.append(cls.getName());
            sb.append(" ");
            sb.append(z2 ? "enabled" : "disabled");
            loggerM12100e.mo12102a(str, sb.toString());
        } catch (Exception e) {
            Logger loggerM12100e2 = Logger.m12100e();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cls.getName());
            sb2.append("could not be ");
            sb2.append(z2 ? "enabled" : "disabled");
            loggerM12100e2.mo12103b(str, sb2.toString(), e);
        }
    }
}
