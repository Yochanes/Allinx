package androidx.camera.core.impl;

import android.content.Context;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.Camera2UseCaseConfigFactory;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public interface UseCaseConfigFactory {

    /* JADX INFO: renamed from: a */
    public static final UseCaseConfigFactory f2819a = new C02741();

    /* JADX INFO: renamed from: androidx.camera.core.impl.UseCaseConfigFactory$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C02741 implements UseCaseConfigFactory {
        @Override // androidx.camera.core.impl.UseCaseConfigFactory
        /* JADX INFO: renamed from: a */
        public final Config mo986a(CaptureType captureType, int i) {
            return null;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    public static final class CaptureType {

        /* JADX INFO: renamed from: a */
        public static final CaptureType f2820a;

        /* JADX INFO: renamed from: b */
        public static final CaptureType f2821b;

        /* JADX INFO: renamed from: c */
        public static final CaptureType f2822c;

        /* JADX INFO: renamed from: d */
        public static final CaptureType f2823d;

        /* JADX INFO: renamed from: f */
        public static final CaptureType f2824f;

        /* JADX INFO: renamed from: g */
        public static final CaptureType f2825g;

        /* JADX INFO: renamed from: i */
        public static final /* synthetic */ CaptureType[] f2826i;

        static {
            CaptureType captureType = new CaptureType("IMAGE_CAPTURE", 0);
            f2820a = captureType;
            CaptureType captureType2 = new CaptureType("PREVIEW", 1);
            f2821b = captureType2;
            CaptureType captureType3 = new CaptureType("IMAGE_ANALYSIS", 2);
            f2822c = captureType3;
            CaptureType captureType4 = new CaptureType("VIDEO_CAPTURE", 3);
            f2823d = captureType4;
            CaptureType captureType5 = new CaptureType("STREAM_SHARING", 4);
            f2824f = captureType5;
            CaptureType captureType6 = new CaptureType("METERING_REPEATING", 5);
            f2825g = captureType6;
            f2826i = new CaptureType[]{captureType, captureType2, captureType3, captureType4, captureType5, captureType6};
        }

        public static CaptureType valueOf(String str) {
            return (CaptureType) Enum.valueOf(CaptureType.class, str);
        }

        public static CaptureType[] values() {
            return (CaptureType[]) f2826i.clone();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface Provider {
        /* JADX INFO: renamed from: a */
        Camera2UseCaseConfigFactory mo1575a(Context context);
    }

    /* JADX INFO: renamed from: a */
    Config mo986a(CaptureType captureType, int i);
}
