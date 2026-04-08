package io.intercom.android.sdk.utilities;

import androidx.annotation.Nullable;
import java.io.Closeable;
import java.io.File;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class IoUtils {
    public static void closeQuietly(@Nullable Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    public static void safelyDelete(File file) {
        try {
            if (file.delete()) {
                return;
            }
            file.deleteOnExit();
        } catch (Exception unused) {
        }
    }
}
