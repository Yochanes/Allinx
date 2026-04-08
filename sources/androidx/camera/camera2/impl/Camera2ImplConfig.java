package androidx.camera.camera2.impl;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import androidx.annotation.OptIn;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.interop.CaptureRequestOptions;
import androidx.camera.core.ExtendableBuilder;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.MutableConfig;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.OptionsBundle;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@OptIn
@RequiresApi
public final class Camera2ImplConfig extends CaptureRequestOptions {

    /* JADX INFO: renamed from: G */
    public static final Config.Option f1520G = Config.Option.m1472a(Integer.TYPE, "camera2.captureRequest.templateType");

    /* JADX INFO: renamed from: H */
    public static final Config.Option f1521H = Config.Option.m1472a(Long.TYPE, "camera2.cameraCaptureSession.streamUseCase");

    /* JADX INFO: renamed from: I */
    public static final Config.Option f1522I = Config.Option.m1472a(CameraDevice.StateCallback.class, "camera2.cameraDevice.stateCallback");

    /* JADX INFO: renamed from: J */
    public static final Config.Option f1523J = Config.Option.m1472a(CameraCaptureSession.StateCallback.class, "camera2.cameraCaptureSession.stateCallback");

    /* JADX INFO: renamed from: K */
    public static final Config.Option f1524K = Config.Option.m1472a(CameraCaptureSession.CaptureCallback.class, "camera2.cameraCaptureSession.captureCallback");

    /* JADX INFO: renamed from: L */
    public static final Config.Option f1525L = Config.Option.m1472a(CameraEventCallbacks.class, "camera2.cameraEvent.callback");

    /* JADX INFO: renamed from: M */
    public static final Config.Option f1526M = Config.Option.m1472a(Object.class, "camera2.captureRequest.tag");

    /* JADX INFO: renamed from: N */
    public static final Config.Option f1527N = Config.Option.m1472a(String.class, "camera2.cameraCaptureSession.physicalCameraId");

    /* JADX INFO: compiled from: Proguard */
    public static final class Builder implements ExtendableBuilder<Camera2ImplConfig> {

        /* JADX INFO: renamed from: a */
        public final MutableOptionsBundle f1528a = MutableOptionsBundle.m1507T();

        @Override // androidx.camera.core.ExtendableBuilder
        /* JADX INFO: renamed from: a */
        public final MutableConfig mo814a() {
            throw null;
        }

        /* JADX INFO: renamed from: c */
        public final Camera2ImplConfig m815c() {
            return new Camera2ImplConfig(OptionsBundle.m1511S(this.f1528a));
        }

        /* JADX INFO: renamed from: d */
        public final void m816d(CaptureRequest.Key key, Object obj) {
            this.f1528a.mo1506u(Camera2ImplConfig.m813S(key), obj);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Extender<T> {
    }

    /* JADX INFO: renamed from: S */
    public static Config.Option m813S(CaptureRequest.Key key) {
        return Config.Option.m1473b("camera2.captureRequest.option." + key.getName(), key);
    }
}
