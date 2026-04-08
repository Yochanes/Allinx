package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class JvmMetadataVersion extends BinaryVersion {

    /* JADX INFO: renamed from: g */
    public static final JvmMetadataVersion f54014g;

    /* JADX INFO: renamed from: h */
    public static final JvmMetadataVersion f54015h;

    /* JADX INFO: renamed from: f */
    public final boolean f54016f;

    /* JADX INFO: compiled from: Proguard */
    public static final class Companion {
    }

    static {
        JvmMetadataVersion jvmMetadataVersion = new JvmMetadataVersion(new int[]{1, 8, 0}, false);
        f54014g = jvmMetadataVersion;
        int i = jvmMetadataVersion.f53867c;
        int i2 = jvmMetadataVersion.f53866b;
        f54015h = (i2 == 1 && i == 9) ? new JvmMetadataVersion(new int[]{2, 0, 0}, false) : new JvmMetadataVersion(new int[]{i2, i + 1, 0}, false);
        new JvmMetadataVersion(new int[0], false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JvmMetadataVersion(int[] versionArray, boolean z2) {
        super(Arrays.copyOf(versionArray, versionArray.length));
        Intrinsics.m18599g(versionArray, "versionArray");
        this.f54016f = z2;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m19565b(JvmMetadataVersion metadataVersionFromLanguageVersion) {
        Intrinsics.m18599g(metadataVersionFromLanguageVersion, "metadataVersionFromLanguageVersion");
        JvmMetadataVersion jvmMetadataVersion = f54014g;
        int i = this.f53866b;
        int i2 = this.f53867c;
        if (i == 2 && i2 == 0 && jvmMetadataVersion.f53866b == 1 && jvmMetadataVersion.f53867c == 8) {
            return true;
        }
        if (!this.f54016f) {
            jvmMetadataVersion = f54015h;
        }
        jvmMetadataVersion.getClass();
        int i3 = metadataVersionFromLanguageVersion.f53866b;
        int i4 = jvmMetadataVersion.f53866b;
        if (i4 > i3 || (i4 >= i3 && jvmMetadataVersion.f53867c > metadataVersionFromLanguageVersion.f53867c)) {
            metadataVersionFromLanguageVersion = jvmMetadataVersion;
        }
        boolean z2 = false;
        if ((i == 1 && i2 == 0) || i == 0) {
            return false;
        }
        int i5 = metadataVersionFromLanguageVersion.f53866b;
        if (i > i5 || (i >= i5 && i2 > metadataVersionFromLanguageVersion.f53867c)) {
            z2 = true;
        }
        return !z2;
    }
}
