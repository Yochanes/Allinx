package androidx.camera.extensions.internal;

import androidx.annotation.RequiresApi;
import com.intercom.twig.BuildConfig;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public class ClientVersion {

    /* JADX INFO: renamed from: b */
    public static final ClientVersion f3219b = new ClientVersion();

    /* JADX INFO: renamed from: a */
    public final Version f3220a = Version.m1751h(BuildConfig.VERSION_NAME);

    /* JADX INFO: renamed from: a */
    public static boolean m1747a(Version version) {
        return f3219b.f3220a.m1752a(((AutoValue_Version) version).f3215c, ((AutoValue_Version) version).f3216d) >= 0;
    }
}
