package androidx.camera.video.internal.workaround;

import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.Timebase;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public class VideoTimebaseConverter {

    /* JADX INFO: renamed from: androidx.camera.video.internal.workaround.VideoTimebaseConverter$1 */
    /* JADX INFO: compiled from: Proguard */
    public static /* synthetic */ class C03961 {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f3496a;

        static {
            int[] iArr = new int[Timebase.values().length];
            f3496a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3496a[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }
}
