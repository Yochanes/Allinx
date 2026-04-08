package androidx.camera.extensions.internal;

import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.UseCaseConfigFactory;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public final class ExtensionsUseCaseConfigFactory implements UseCaseConfigFactory {

    /* JADX INFO: renamed from: androidx.camera.extensions.internal.ExtensionsUseCaseConfigFactory$1 */
    /* JADX INFO: compiled from: Proguard */
    public static /* synthetic */ class C03381 {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f3224a;

        static {
            int[] iArr = new int[UseCaseConfigFactory.CaptureType.values().length];
            f3224a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3224a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3224a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3224a[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Override // androidx.camera.core.impl.UseCaseConfigFactory
    /* JADX INFO: renamed from: a */
    public final Config mo986a(UseCaseConfigFactory.CaptureType captureType, int i) {
        int iOrdinal = captureType.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            throw null;
        }
        if (iOrdinal != 3) {
            return null;
        }
        throw new IllegalArgumentException("CameraX Extensions doesn't support VideoCapture!");
    }
}
