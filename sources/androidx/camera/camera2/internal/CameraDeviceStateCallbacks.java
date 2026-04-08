package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraDevice;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public final class CameraDeviceStateCallbacks {

    /* JADX INFO: compiled from: Proguard */
    public static final class ComboDeviceStateCallback extends CameraDevice.StateCallback {

        /* JADX INFO: renamed from: a */
        public final ArrayList f1717a = new ArrayList();

        public ComboDeviceStateCallback(ArrayList arrayList) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                CameraDevice.StateCallback stateCallback = (CameraDevice.StateCallback) it.next();
                if (!(stateCallback instanceof NoOpDeviceStateCallback)) {
                    this.f1717a.add(stateCallback);
                }
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onClosed(CameraDevice cameraDevice) {
            Iterator it = this.f1717a.iterator();
            while (it.hasNext()) {
                ((CameraDevice.StateCallback) it.next()).onClosed(cameraDevice);
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onDisconnected(CameraDevice cameraDevice) {
            Iterator it = this.f1717a.iterator();
            while (it.hasNext()) {
                ((CameraDevice.StateCallback) it.next()).onDisconnected(cameraDevice);
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onError(CameraDevice cameraDevice, int i) {
            Iterator it = this.f1717a.iterator();
            while (it.hasNext()) {
                ((CameraDevice.StateCallback) it.next()).onError(cameraDevice, i);
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onOpened(CameraDevice cameraDevice) {
            Iterator it = this.f1717a.iterator();
            while (it.hasNext()) {
                ((CameraDevice.StateCallback) it.next()).onOpened(cameraDevice);
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class NoOpDeviceStateCallback extends CameraDevice.StateCallback {
        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onClosed(CameraDevice cameraDevice) {
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onDisconnected(CameraDevice cameraDevice) {
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onOpened(CameraDevice cameraDevice) {
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onError(CameraDevice cameraDevice, int i) {
        }
    }
}
