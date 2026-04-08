package org.aspectj.runtime.internal;

import com.google.firebase.crashlytics.internal.common.IdManager;
import com.google.firebase.ktx.BuildConfig;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class CFlowCounter {
    static {
        String property;
        try {
            property = System.getProperty("aspectj.runtime.cflowstack.usethreadlocal", BuildConfig.VERSION_NAME);
        } catch (SecurityException unused) {
            property = BuildConfig.VERSION_NAME;
        }
        if (property.equals(BuildConfig.VERSION_NAME)) {
            System.getProperty("java.class.version", IdManager.DEFAULT_VERSION_NAME).compareTo("46.0");
        } else {
            if (property.equals("yes")) {
                return;
            }
            property.equals("true");
        }
    }
}
