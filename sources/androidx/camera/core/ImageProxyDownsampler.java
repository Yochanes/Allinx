package androidx.camera.core;

import androidx.annotation.RequiresApi;
import androidx.camera.core.ImageProxy;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
final class ImageProxyDownsampler {

    /* JADX INFO: renamed from: androidx.camera.core.ImageProxyDownsampler$1 */
    /* JADX INFO: compiled from: Proguard */
    class C02321 implements ImageProxy.PlaneProxy {
        @Override // androidx.camera.core.ImageProxy.PlaneProxy
        /* JADX INFO: renamed from: c */
        public final ByteBuffer mo1181c() {
            return null;
        }

        @Override // androidx.camera.core.ImageProxy.PlaneProxy
        /* JADX INFO: renamed from: d */
        public final int mo1182d() {
            return 0;
        }

        @Override // androidx.camera.core.ImageProxy.PlaneProxy
        /* JADX INFO: renamed from: e */
        public final int mo1183e() {
            return 0;
        }
    }

    /* JADX INFO: renamed from: androidx.camera.core.ImageProxyDownsampler$2 */
    /* JADX INFO: compiled from: Proguard */
    public static /* synthetic */ class C02332 {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f2317a;

        static {
            int[] iArr = new int[DownsamplingMethod.values().length];
            f2317a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2317a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    public static final class DownsamplingMethod {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ DownsamplingMethod[] f2318a = {new DownsamplingMethod("NEAREST_NEIGHBOR", 0), new DownsamplingMethod("AVERAGING", 1)};

        /* JADX INFO: Fake field, exist only in values array */
        DownsamplingMethod EF5;

        public static DownsamplingMethod valueOf(String str) {
            return (DownsamplingMethod) Enum.valueOf(DownsamplingMethod.class, str);
        }

        public static DownsamplingMethod[] values() {
            return (DownsamplingMethod[]) f2318a.clone();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ForwardingImageProxyImpl extends ForwardingImageProxy {
        @Override // androidx.camera.core.ForwardingImageProxy, androidx.camera.core.ImageProxy
        public final int getHeight() {
            return 0;
        }

        @Override // androidx.camera.core.ForwardingImageProxy, androidx.camera.core.ImageProxy
        public final int getWidth() {
            return 0;
        }

        @Override // androidx.camera.core.ForwardingImageProxy, androidx.camera.core.ImageProxy
        /* JADX INFO: renamed from: m */
        public final ImageProxy.PlaneProxy[] mo1179m() {
            return null;
        }
    }
}
