package androidx.media3.common;

import androidx.media3.common.util.UnstableApi;
import java.util.HashSet;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class MediaLibraryInfo {

    /* JADX INFO: renamed from: a */
    public static final HashSet f25255a = new HashSet();

    /* JADX INFO: renamed from: b */
    public static String f25256b = "media3.common";

    /* JADX INFO: renamed from: a */
    public static synchronized void m9322a(String str) {
        if (f25255a.add(str)) {
            f25256b += ", " + str;
        }
    }
}
