package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.InputConfiguration;
import android.os.Handler;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat;
import androidx.camera.camera2.internal.compat.CameraDeviceCompatBaseImpl;
import androidx.camera.camera2.internal.compat.params.InputConfigurationCompat;
import androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat;
import androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat;
import androidx.camera.core.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
class CameraDeviceCompatApi24Impl extends CameraDeviceCompatApi23Impl {
    @Override // androidx.camera.camera2.internal.compat.CameraDeviceCompatApi23Impl, androidx.camera.camera2.internal.compat.CameraDeviceCompatBaseImpl, androidx.camera.camera2.internal.compat.CameraDeviceCompat.CameraDeviceCompatImpl
    /* JADX INFO: renamed from: a */
    public void mo1093a(SessionConfigurationCompat sessionConfigurationCompat) throws CameraAccessExceptionCompat {
        CameraDevice cameraDevice = this.f1962a;
        cameraDevice.getClass();
        sessionConfigurationCompat.getClass();
        sessionConfigurationCompat.m1140e().getClass();
        List listM1138c = sessionConfigurationCompat.m1138c();
        if (listM1138c == null) {
            throw new IllegalArgumentException("Invalid output configurations");
        }
        if (sessionConfigurationCompat.m1136a() == null) {
            throw new IllegalArgumentException("Invalid executor");
        }
        String id = cameraDevice.getId();
        Iterator it = listM1138c.iterator();
        while (it.hasNext()) {
            String strM1121c = ((OutputConfigurationCompat) it.next()).m1121c();
            if (strM1121c != null && !strM1121c.isEmpty()) {
                Logger.m1288i("CameraDeviceCompat", AbstractC0000a.m15l("Camera ", id, ": Camera doesn't support physicalCameraId ", strM1121c, ". Ignoring."));
            }
        }
        CameraCaptureSessionCompat.StateCallbackExecutorWrapper stateCallbackExecutorWrapper = new CameraCaptureSessionCompat.StateCallbackExecutorWrapper(sessionConfigurationCompat.m1136a(), sessionConfigurationCompat.m1140e());
        List listM1138c2 = sessionConfigurationCompat.m1138c();
        CameraDeviceCompatBaseImpl.CameraDeviceCompatParamsApi21 cameraDeviceCompatParamsApi21 = (CameraDeviceCompatBaseImpl.CameraDeviceCompatParamsApi21) this.f1963b;
        cameraDeviceCompatParamsApi21.getClass();
        InputConfigurationCompat inputConfigurationCompatM1137b = sessionConfigurationCompat.m1137b();
        Handler handler = cameraDeviceCompatParamsApi21.f1964a;
        try {
            if (inputConfigurationCompatM1137b != null) {
                InputConfiguration inputConfiguration = (InputConfiguration) inputConfigurationCompatM1137b.m1117a();
                inputConfiguration.getClass();
                cameraDevice.createReprocessableCaptureSessionByConfigurations(inputConfiguration, SessionConfigurationCompat.m1135h(listM1138c2), stateCallbackExecutorWrapper, handler);
            } else {
                if (sessionConfigurationCompat.m1139d() != 1) {
                    cameraDevice.createCaptureSessionByOutputConfigurations(SessionConfigurationCompat.m1135h(listM1138c2), stateCallbackExecutorWrapper, handler);
                    return;
                }
                ArrayList arrayList = new ArrayList(listM1138c2.size());
                Iterator it2 = listM1138c2.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((OutputConfigurationCompat) it2.next()).m1122d());
                }
                cameraDevice.createConstrainedHighSpeedCaptureSession(arrayList, stateCallbackExecutorWrapper, handler);
            }
        } catch (CameraAccessException e) {
            throw new CameraAccessExceptionCompat(e);
        }
    }
}
