package androidx.navigation;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/navigation/NavUriUtils;", "", "navigation-common_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class NavUriUtils {
    /* JADX INFO: renamed from: a */
    public static String m11249a(String s) {
        Intrinsics.m18599g(s, "s");
        String strEncode = Uri.encode(s, null);
        Intrinsics.m18598f(strEncode, "encode(...)");
        return strEncode;
    }

    /* JADX INFO: renamed from: b */
    public static Uri m11250b(String uriString) {
        Intrinsics.m18599g(uriString, "uriString");
        Uri uri = Uri.parse(uriString);
        Intrinsics.m18598f(uri, "parse(...)");
        return uri;
    }
}
