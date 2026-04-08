package androidx.camera.core;

import androidx.annotation.RequiresApi;
import androidx.camera.core.internal.utils.ImageUtil;
import java.io.IOException;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
final class ImageSaver implements Runnable {

    /* JADX INFO: renamed from: androidx.camera.core.ImageSaver$1 */
    /* JADX INFO: compiled from: Proguard */
    public static /* synthetic */ class C02341 {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f2319a;

        static {
            int[] iArr = new int[ImageUtil.CodecFailedException.FailureType.values().length];
            f2319a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2319a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2319a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface OnImageSavedCallback {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    public static final class SaveError {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ SaveError[] f2320a = {new SaveError("FILE_IO_FAILED", 0), new SaveError("ENCODE_FAILED", 1), new SaveError("CROP_FAILED", 2), new SaveError("UNKNOWN", 3)};

        /* JADX INFO: Fake field, exist only in values array */
        SaveError EF5;

        public static SaveError valueOf(String str) {
            return (SaveError) Enum.valueOf(SaveError.class, str);
        }

        public static SaveError[] values() {
            return (SaveError[]) f2320a.clone();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:?, code lost:
    
        throw null;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        try {
            throw null;
        } catch (IOException unused) {
            throw null;
        }
    }
}
