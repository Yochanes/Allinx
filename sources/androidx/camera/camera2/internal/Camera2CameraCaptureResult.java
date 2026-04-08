package androidx.camera.camera2.internal;

import android.graphics.Rect;
import android.hardware.camera2.CaptureResult;
import androidx.annotation.RequiresApi;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CameraCaptureMetaData;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.TagBundle;
import androidx.camera.core.impl.utils.ExifData;
import java.nio.BufferUnderflowException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public class Camera2CameraCaptureResult implements CameraCaptureResult {

    /* JADX INFO: renamed from: a */
    public final TagBundle f1546a;

    /* JADX INFO: renamed from: b */
    public final CaptureResult f1547b;

    public Camera2CameraCaptureResult(TagBundle tagBundle, CaptureResult captureResult) {
        this.f1546a = tagBundle;
        this.f1547b = captureResult;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    /* JADX INFO: renamed from: a */
    public final TagBundle mo864a() {
        return this.f1546a;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    /* JADX INFO: renamed from: b */
    public final void mo865b(ExifData.Builder builder) {
        super.mo865b(builder);
        CaptureResult.Key key = CaptureResult.SCALER_CROP_REGION;
        CaptureResult captureResult = this.f1547b;
        Rect rect = (Rect) captureResult.get(key);
        ArrayList arrayList = builder.f2874a;
        if (rect != null) {
            builder.m1601c("ImageWidth", String.valueOf(rect.width()), arrayList);
            builder.m1601c("ImageLength", String.valueOf(rect.height()), arrayList);
        }
        try {
            Integer num = (Integer) captureResult.get(CaptureResult.JPEG_ORIENTATION);
            if (num != null) {
                builder.m1603e(num.intValue());
            }
        } catch (BufferUnderflowException unused) {
            Logger.m1288i("C2CameraCaptureResult", "Failed to get JPEG orientation.");
        }
        if (((Long) captureResult.get(CaptureResult.SENSOR_EXPOSURE_TIME)) != null) {
            builder.m1601c("ExposureTime", String.valueOf(r0.longValue() / TimeUnit.SECONDS.toNanos(1L)), arrayList);
        }
        Float f = (Float) captureResult.get(CaptureResult.LENS_APERTURE);
        if (f != null) {
            builder.m1601c("FNumber", String.valueOf(f.floatValue()), arrayList);
        }
        Integer numValueOf = (Integer) captureResult.get(CaptureResult.SENSOR_SENSITIVITY);
        if (numValueOf != null) {
            if (((Integer) captureResult.get(CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST)) != null) {
                numValueOf = Integer.valueOf(numValueOf.intValue() * ((int) (r3.intValue() / 100.0f)));
            }
            int iIntValue = numValueOf.intValue();
            builder.m1601c("SensitivityType", String.valueOf(3), arrayList);
            builder.m1601c("PhotographicSensitivity", String.valueOf(Math.min(65535, iIntValue)), arrayList);
        }
        Float f2 = (Float) captureResult.get(CaptureResult.LENS_FOCAL_LENGTH);
        if (f2 != null) {
            builder.m1602d(f2.floatValue());
        }
        Integer num2 = (Integer) captureResult.get(CaptureResult.CONTROL_AWB_MODE);
        if (num2 != null) {
            ExifData.WhiteBalanceMode whiteBalanceMode = ExifData.WhiteBalanceMode.f2879a;
            if (num2.intValue() == 0) {
                whiteBalanceMode = ExifData.WhiteBalanceMode.f2880b;
            }
            int iOrdinal = whiteBalanceMode.ordinal();
            builder.m1601c("WhiteBalance", iOrdinal != 0 ? iOrdinal != 1 ? null : String.valueOf(1) : String.valueOf(0), arrayList);
        }
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    /* JADX INFO: renamed from: c */
    public final long mo866c() {
        Long l = (Long) this.f1547b.get(CaptureResult.SENSOR_TIMESTAMP);
        if (l == null) {
            return -1L;
        }
        return l.longValue();
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    /* JADX INFO: renamed from: d */
    public final CameraCaptureMetaData.AwbState mo867d() {
        Integer num = (Integer) this.f1547b.get(CaptureResult.CONTROL_AWB_STATE);
        CameraCaptureMetaData.AwbState awbState = CameraCaptureMetaData.AwbState.f2623a;
        if (num == null) {
            return awbState;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            return CameraCaptureMetaData.AwbState.f2624b;
        }
        if (iIntValue == 1) {
            return CameraCaptureMetaData.AwbState.f2625c;
        }
        if (iIntValue == 2) {
            return CameraCaptureMetaData.AwbState.f2626d;
        }
        if (iIntValue == 3) {
            return CameraCaptureMetaData.AwbState.f2627f;
        }
        Logger.m1282c("C2CameraCaptureResult", "Undefined awb state: " + num);
        return awbState;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    /* JADX INFO: renamed from: e */
    public final CameraCaptureMetaData.FlashState mo868e() {
        Integer num = (Integer) this.f1547b.get(CaptureResult.FLASH_STATE);
        CameraCaptureMetaData.FlashState flashState = CameraCaptureMetaData.FlashState.f2629a;
        if (num == null) {
            return flashState;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0 || iIntValue == 1) {
            return CameraCaptureMetaData.FlashState.f2630b;
        }
        if (iIntValue == 2) {
            return CameraCaptureMetaData.FlashState.f2631c;
        }
        if (iIntValue == 3 || iIntValue == 4) {
            return CameraCaptureMetaData.FlashState.f2632d;
        }
        Logger.m1282c("C2CameraCaptureResult", "Undefined flash state: " + num);
        return flashState;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    /* JADX INFO: renamed from: f */
    public final CameraCaptureMetaData.AeState mo869f() {
        Integer num = (Integer) this.f1547b.get(CaptureResult.CONTROL_AE_STATE);
        CameraCaptureMetaData.AeState aeState = CameraCaptureMetaData.AeState.f2603a;
        if (num == null) {
            return aeState;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            return CameraCaptureMetaData.AeState.f2604b;
        }
        if (iIntValue != 1) {
            if (iIntValue == 2) {
                return CameraCaptureMetaData.AeState.f2607f;
            }
            if (iIntValue == 3) {
                return CameraCaptureMetaData.AeState.f2608g;
            }
            if (iIntValue == 4) {
                return CameraCaptureMetaData.AeState.f2606d;
            }
            if (iIntValue != 5) {
                Logger.m1282c("C2CameraCaptureResult", "Undefined ae state: " + num);
                return aeState;
            }
        }
        return CameraCaptureMetaData.AeState.f2605c;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    /* JADX INFO: renamed from: g */
    public final CaptureResult mo870g() {
        return this.f1547b;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    /* JADX INFO: renamed from: h */
    public final CameraCaptureMetaData.AfState mo871h() {
        Integer num = (Integer) this.f1547b.get(CaptureResult.CONTROL_AF_STATE);
        CameraCaptureMetaData.AfState afState = CameraCaptureMetaData.AfState.f2615a;
        if (num == null) {
            return afState;
        }
        switch (num.intValue()) {
            case 0:
                break;
            case 1:
            case 3:
                break;
            case 2:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            default:
                Logger.m1282c("C2CameraCaptureResult", "Undefined af state: " + num);
                break;
        }
        return afState;
    }

    /* JADX INFO: renamed from: i */
    public final CameraCaptureMetaData.AfMode m872i() {
        Integer num = (Integer) this.f1547b.get(CaptureResult.CONTROL_AF_MODE);
        CameraCaptureMetaData.AfMode afMode = CameraCaptureMetaData.AfMode.f2610a;
        if (num == null) {
            return afMode;
        }
        int iIntValue = num.intValue();
        if (iIntValue != 0) {
            if (iIntValue == 1 || iIntValue == 2) {
                return CameraCaptureMetaData.AfMode.f2612c;
            }
            if (iIntValue == 3 || iIntValue == 4) {
                return CameraCaptureMetaData.AfMode.f2613d;
            }
            if (iIntValue != 5) {
                Logger.m1282c("C2CameraCaptureResult", "Undefined af mode: " + num);
                return afMode;
            }
        }
        return CameraCaptureMetaData.AfMode.f2611b;
    }

    public Camera2CameraCaptureResult(CaptureResult captureResult) {
        this(TagBundle.f2798b, captureResult);
    }
}
