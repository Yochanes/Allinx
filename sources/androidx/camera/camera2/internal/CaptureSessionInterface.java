package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraDevice;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.SessionConfig;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
interface CaptureSessionInterface {
    /* JADX INFO: renamed from: a */
    void mo993a();

    /* JADX INFO: renamed from: b */
    void mo994b(HashMap map);

    /* JADX INFO: renamed from: c */
    List mo995c();

    void close();

    /* JADX INFO: renamed from: d */
    void mo996d(List list);

    /* JADX INFO: renamed from: e */
    SessionConfig mo997e();

    /* JADX INFO: renamed from: f */
    void mo998f(SessionConfig sessionConfig);

    /* JADX INFO: renamed from: g */
    ListenableFuture mo999g(SessionConfig sessionConfig, CameraDevice cameraDevice, SynchronizedCaptureSessionOpener synchronizedCaptureSessionOpener);

    ListenableFuture release();
}
