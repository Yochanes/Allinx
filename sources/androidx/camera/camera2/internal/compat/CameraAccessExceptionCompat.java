package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraAccessException;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import flash.kline.p031v1.FlashProto;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public class CameraAccessExceptionCompat extends Exception {

    /* JADX INFO: renamed from: b */
    public static final Set f1943b = Collections.unmodifiableSet(new HashSet(Arrays.asList(4, 5, 1, 2, 3)));

    /* JADX INFO: renamed from: c */
    public static final Set f1944c = Collections.unmodifiableSet(new HashSet(Arrays.asList(Integer.valueOf(FlashProto.action.ACTION_SUB_SCRIBE_SPOT_TICKER_VALUE), Integer.valueOf(FlashProto.action.ACTION_SUBSCRIBE_SPOT_KLINE_VALUE))));

    /* JADX INFO: renamed from: a */
    public final int f1945a;

    /* JADX INFO: compiled from: Proguard */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface AccessError {
    }

    public CameraAccessExceptionCompat(RuntimeException runtimeException) {
        super("Some API 28 devices cannot access the camera when the device is in \"Do Not Disturb\" mode. The camera will not be accessible until \"Do Not Disturb\" mode is disabled.", runtimeException);
        this.f1945a = FlashProto.action.ACTION_SUB_SCRIBE_SPOT_TICKER_VALUE;
        if (f1943b.contains(Integer.valueOf(FlashProto.action.ACTION_SUB_SCRIBE_SPOT_TICKER_VALUE))) {
            new CameraAccessException(FlashProto.action.ACTION_SUB_SCRIBE_SPOT_TICKER_VALUE, null, runtimeException);
        }
    }

    public CameraAccessExceptionCompat(CameraAccessException cameraAccessException) {
        super(cameraAccessException.getMessage(), cameraAccessException.getCause());
        this.f1945a = cameraAccessException.getReason();
    }

    public CameraAccessExceptionCompat(String str, AssertionError assertionError) {
        super(String.format("%s (%d): %s", "CAMERA_CHARACTERISTICS_CREATION_ERROR", Integer.valueOf(FlashProto.action.ACTION_SUBSCRIBE_SPOT_KLINE_VALUE), str), assertionError);
        this.f1945a = FlashProto.action.ACTION_SUBSCRIBE_SPOT_KLINE_VALUE;
        if (f1943b.contains(Integer.valueOf(FlashProto.action.ACTION_SUBSCRIBE_SPOT_KLINE_VALUE))) {
            new CameraAccessException(FlashProto.action.ACTION_SUBSCRIBE_SPOT_KLINE_VALUE, str, assertionError);
        }
    }
}
