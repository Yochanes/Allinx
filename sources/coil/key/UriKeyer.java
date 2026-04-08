package coil.key;

import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.net.Uri;
import coil.request.Options;
import coil.util.Utils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Lcoil/key/UriKeyer;", "Lcoil/key/Keyer;", "Landroid/net/Uri;", "coil-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class UriKeyer implements Keyer<Uri> {
    @Override // coil.key.Keyer
    /* JADX INFO: renamed from: a */
    public final String mo12473a(Object obj, Options options) {
        Uri uri = (Uri) obj;
        if (!Intrinsics.m18594b(uri.getScheme(), "android.resource")) {
            return uri.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(uri);
        sb.append('-');
        Configuration configuration = options.f33896a.getResources().getConfiguration();
        Bitmap.Config[] configArr = Utils.f33996a;
        sb.append(configuration.uiMode & 48);
        return sb.toString();
    }
}
