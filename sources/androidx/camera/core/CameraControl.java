package androidx.camera.core;

import androidx.annotation.RequiresApi;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public interface CameraControl {

    /* JADX INFO: compiled from: Proguard */
    public static final class OperationCanceledException extends Exception {
    }

    /* JADX INFO: renamed from: b */
    ListenableFuture mo876b(float f);

    /* JADX INFO: renamed from: g */
    ListenableFuture mo881g(boolean z2);

    /* JADX INFO: renamed from: j */
    ListenableFuture mo884j(FocusMeteringAction focusMeteringAction);
}
