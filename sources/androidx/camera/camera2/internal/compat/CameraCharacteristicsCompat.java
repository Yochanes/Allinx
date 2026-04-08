package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.workaround.OutputSizesCorrector;
import java.util.HashMap;
import java.util.Set;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public class CameraCharacteristicsCompat {

    /* JADX INFO: renamed from: b */
    public final CameraCharacteristicsCompatImpl f1956b;

    /* JADX INFO: renamed from: c */
    public final String f1957c;

    /* JADX INFO: renamed from: a */
    public final HashMap f1955a = new HashMap();

    /* JADX INFO: renamed from: d */
    public StreamConfigurationMapCompat f1958d = null;

    /* JADX INFO: compiled from: Proguard */
    public interface CameraCharacteristicsCompatImpl {
        /* JADX INFO: renamed from: a */
        Set mo1088a();
    }

    public CameraCharacteristicsCompat(CameraCharacteristics cameraCharacteristics, String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f1956b = new CameraCharacteristicsApi28Impl(cameraCharacteristics);
        } else {
            this.f1956b = new CameraCharacteristicsBaseImpl(cameraCharacteristics);
        }
        this.f1957c = str;
    }

    /* JADX INFO: renamed from: a */
    public final Object m1089a(CameraCharacteristics.Key key) {
        if (key.equals(CameraCharacteristics.SENSOR_ORIENTATION)) {
            return ((CameraCharacteristicsBaseImpl) this.f1956b).f1954a.get(key);
        }
        synchronized (this) {
            try {
                Object obj = this.f1955a.get(key);
                if (obj != null) {
                    return obj;
                }
                Object obj2 = ((CameraCharacteristicsBaseImpl) this.f1956b).f1954a.get(key);
                if (obj2 != null) {
                    this.f1955a.put(key, obj2);
                }
                return obj2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final StreamConfigurationMapCompat m1090b() {
        if (this.f1958d == null) {
            try {
                StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) m1089a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                if (streamConfigurationMap == null) {
                    throw new IllegalArgumentException("StreamConfigurationMap is null!");
                }
                this.f1958d = new StreamConfigurationMapCompat(streamConfigurationMap, new OutputSizesCorrector(this.f1957c));
            } catch (AssertionError e) {
                throw new IllegalArgumentException(e.getMessage());
            }
        }
        return this.f1958d;
    }

    /* JADX INFO: renamed from: c */
    public final CameraCharacteristics m1091c() {
        return ((CameraCharacteristicsBaseImpl) this.f1956b).f1954a;
    }
}
