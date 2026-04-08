package androidx.camera.core;

import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.LiveData;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public interface CameraInfo {

    /* JADX INFO: compiled from: Proguard */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface ImplementationType {
    }

    /* JADX INFO: renamed from: b */
    int mo944b();

    /* JADX INFO: renamed from: d */
    default boolean mo946d(FocusMeteringAction focusMeteringAction) {
        return false;
    }

    /* JADX INFO: renamed from: e */
    LiveData mo947e();

    /* JADX INFO: renamed from: h */
    default int mo949h() {
        return -1;
    }

    /* JADX INFO: renamed from: j */
    String mo951j();

    /* JADX INFO: renamed from: k */
    int mo952k(int i);

    /* JADX INFO: renamed from: l */
    boolean mo953l();

    /* JADX INFO: renamed from: p */
    LiveData mo957p();
}
