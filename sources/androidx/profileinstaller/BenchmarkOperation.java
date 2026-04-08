package androidx.profileinstaller;

import androidx.annotation.RequiresApi;
import java.io.File;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
class BenchmarkOperation {

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api21ContextHelper {
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api24ContextHelper {
    }

    /* JADX INFO: renamed from: a */
    public static boolean m11490a(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z2 = true;
        for (File file2 : fileArrListFiles) {
            z2 = m11490a(file2) && z2;
        }
        return z2;
    }
}
