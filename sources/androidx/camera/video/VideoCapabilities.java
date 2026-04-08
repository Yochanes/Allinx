package androidx.camera.video;

import android.util.Size;
import androidx.annotation.RequiresApi;
import androidx.camera.core.DynamicRange;
import androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy;
import java.util.ArrayList;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public interface VideoCapabilities {

    /* JADX INFO: renamed from: a */
    public static final VideoCapabilities f3343a = new C03721();

    /* JADX INFO: renamed from: androidx.camera.video.VideoCapabilities$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C03721 implements VideoCapabilities {
        @Override // androidx.camera.video.VideoCapabilities
        /* JADX INFO: renamed from: c */
        public final ArrayList mo1832c(DynamicRange dynamicRange) {
            return new ArrayList();
        }
    }

    /* JADX INFO: renamed from: a */
    default VideoValidatedEncoderProfilesProxy mo1830a(Quality quality, DynamicRange dynamicRange) {
        return null;
    }

    /* JADX INFO: renamed from: b */
    default VideoValidatedEncoderProfilesProxy mo1831b(Size size, DynamicRange dynamicRange) {
        return null;
    }

    /* JADX INFO: renamed from: c */
    ArrayList mo1832c(DynamicRange dynamicRange);
}
