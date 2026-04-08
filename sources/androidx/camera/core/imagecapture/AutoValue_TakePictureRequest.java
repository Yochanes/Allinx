package androidx.camera.core.imagecapture;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class AutoValue_TakePictureRequest extends TakePictureRequest {
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TakePictureRequest)) {
            return false;
        }
        ((TakePictureRequest) obj).getClass();
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "TakePictureRequest{appExecutor=null, inMemoryCallback=null, onDiskCallback=null, outputFileOptions=null, cropRect=null, sensorToBufferTransform=null, rotationDegrees=0, jpegQuality=0, captureMode=0, sessionConfigCameraCaptureCallbacks=null}";
    }
}
