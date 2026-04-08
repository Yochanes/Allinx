package androidx.media3.extractor;

import androidx.media3.common.util.UnstableApi;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class Ac3Util {

    /* JADX INFO: renamed from: a */
    public static final int[] f28116a = {1, 2, 3, 6};

    /* JADX INFO: renamed from: b */
    public static final int[] f28117b = {48000, 44100, 32000};

    /* JADX INFO: renamed from: c */
    public static final int[] f28118c = {24000, 22050, 16000};

    /* JADX INFO: renamed from: d */
    public static final int[] f28119d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* JADX INFO: renamed from: e */
    public static final int[] f28120e = {32, 40, 48, 56, 64, 80, 96, 112, UserMetadata.MAX_ROLLOUT_ASSIGNMENTS, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};

    /* JADX INFO: renamed from: f */
    public static final int[] f28121f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* JADX INFO: compiled from: Proguard */
    public static final class SyncFrameInfo {

        /* JADX INFO: compiled from: Proguard */
        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface StreamType {
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m10764a(int i, int i2) {
        int i3 = i2 / 2;
        if (i < 0 || i >= 3 || i2 < 0 || i3 >= 19) {
            return -1;
        }
        int i4 = f28117b[i];
        if (i4 == 44100) {
            return ((i2 % 2) + f28121f[i3]) * 2;
        }
        int i5 = f28120e[i3];
        return i4 == 32000 ? i5 * 6 : i5 * 4;
    }
}
