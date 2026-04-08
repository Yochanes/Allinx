package androidx.camera.extensions.internal;

import androidx.annotation.RequiresApi;
import androidx.camera.core.Logger;
import androidx.camera.extensions.impl.ExtensionVersionImpl;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public abstract class ExtensionVersion {

    /* JADX INFO: renamed from: a */
    public static volatile ExtensionVersion f3221a;

    /* JADX INFO: compiled from: Proguard */
    public static class DefaultExtenderVersioning extends ExtensionVersion {
        @Override // androidx.camera.extensions.internal.ExtensionVersion
        /* JADX INFO: renamed from: a */
        public final Version mo1749a() {
            return null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class VendorExtenderVersioning extends ExtensionVersion {

        /* JADX INFO: renamed from: c */
        public static ExtensionVersionImpl f3222c;

        /* JADX INFO: renamed from: b */
        public final Version f3223b;

        public VendorExtenderVersioning() {
            if (f3222c == null) {
                f3222c = new ExtensionVersionImpl();
            }
            ExtensionVersionImpl extensionVersionImpl = f3222c;
            ClientVersion clientVersion = ClientVersion.f3219b;
            Version versionM1751h = Version.m1751h(extensionVersionImpl.checkApiVersion(clientVersion.f3220a.toString()));
            if (versionM1751h != null && ((AutoValue_Version) clientVersion.f3220a).f3215c == ((AutoValue_Version) versionM1751h).f3215c) {
                this.f3223b = versionM1751h;
            }
            Logger.m1280a("ExtenderVersion", "Selected vendor runtime: " + this.f3223b);
        }

        @Override // androidx.camera.extensions.internal.ExtensionVersion
        /* JADX INFO: renamed from: a */
        public final Version mo1749a() {
            return this.f3223b;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m1748b(Version version) {
        ExtensionVersion extensionVersion;
        if (f3221a != null) {
            extensionVersion = f3221a;
        } else {
            synchronized (ExtensionVersion.class) {
                if (f3221a == null) {
                    try {
                        f3221a = new VendorExtenderVersioning();
                    } catch (NoClassDefFoundError unused) {
                        Logger.m1280a("ExtenderVersion", "No versioning extender found. Falling back to default.");
                        f3221a = new DefaultExtenderVersioning();
                    }
                }
            }
            extensionVersion = f3221a;
        }
        return extensionVersion.mo1749a().m1752a(((AutoValue_Version) version).f3215c, ((AutoValue_Version) version).f3216d) >= 0;
    }

    /* JADX INFO: renamed from: a */
    public abstract Version mo1749a();
}
