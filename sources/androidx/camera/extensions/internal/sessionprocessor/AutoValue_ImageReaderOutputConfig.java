package androidx.camera.extensions.internal.sessionprocessor;

import android.util.Size;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class AutoValue_ImageReaderOutputConfig extends ImageReaderOutputConfig {
    @Override // androidx.camera.extensions.internal.sessionprocessor.ImageReaderOutputConfig
    /* JADX INFO: renamed from: a */
    public final int mo1756a() {
        return 0;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.ImageReaderOutputConfig
    /* JADX INFO: renamed from: b */
    public final int mo1757b() {
        return 0;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.ImageReaderOutputConfig
    /* JADX INFO: renamed from: c */
    public final Size mo1758c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImageReaderOutputConfig)) {
            return false;
        }
        ((AutoValue_ImageReaderOutputConfig) ((ImageReaderOutputConfig) obj)).getClass();
        Object obj2 = null;
        obj2.getClass();
        return false;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageReaderOutputConfig{id=");
        sb.append(0);
        sb.append(", surfaceGroupId=");
        sb.append(0);
        sb.append(", physicalCameraId=");
        sb.append((String) null);
        sb.append(", surfaceSharingOutputConfigs=");
        sb.append((Object) null);
        sb.append(", size=");
        sb.append((Object) null);
        sb.append(", imageFormat=");
        sb.append(0);
        sb.append(", maxImages=");
        return AbstractC0000a.m11h(0, "}", sb);
    }
}
