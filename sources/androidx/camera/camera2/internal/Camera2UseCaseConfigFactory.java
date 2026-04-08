package androidx.camera.camera2.internal;

import android.content.Context;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.OptionsBundle;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public final class Camera2UseCaseConfigFactory implements UseCaseConfigFactory {

    /* JADX INFO: renamed from: b */
    public final DisplayInfoManager f1713b;

    public Camera2UseCaseConfigFactory(Context context) {
        this.f1713b = DisplayInfoManager.m1012b(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0018  */
    @Override // androidx.camera.core.impl.UseCaseConfigFactory
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Config mo986a(UseCaseConfigFactory.CaptureType captureType, int i) {
        int i2;
        MutableOptionsBundle mutableOptionsBundleM1507T = MutableOptionsBundle.m1507T();
        SessionConfig.Builder builder = new SessionConfig.Builder();
        int iOrdinal = captureType.ordinal();
        int i3 = 5;
        if (iOrdinal != 0) {
            i2 = (iOrdinal == 3 || iOrdinal == 4) ? 3 : 1;
        } else if (i == 2) {
            i2 = 5;
        }
        builder.m1537r(i2);
        mutableOptionsBundleM1507T.mo1506u(UseCaseConfig.f2809q, builder.m1531k());
        mutableOptionsBundleM1507T.mo1506u(UseCaseConfig.f2811s, Camera2SessionOptionUnpacker.f1712a);
        CaptureConfig.Builder builder2 = new CaptureConfig.Builder();
        int iOrdinal2 = captureType.ordinal();
        if (iOrdinal2 != 0) {
            i3 = (iOrdinal2 == 3 || iOrdinal2 == 4) ? 3 : 1;
        } else if (i != 2) {
            i3 = 2;
        }
        builder2.f2678c = i3;
        mutableOptionsBundleM1507T.mo1506u(UseCaseConfig.f2810r, builder2.m1461e());
        mutableOptionsBundleM1507T.mo1506u(UseCaseConfig.f2812t, captureType == UseCaseConfigFactory.CaptureType.f2820a ? ImageCaptureOptionUnpacker.f1816b : Camera2CaptureOptionUnpacker.f1656a);
        UseCaseConfigFactory.CaptureType captureType2 = UseCaseConfigFactory.CaptureType.f2821b;
        DisplayInfoManager displayInfoManager = this.f1713b;
        if (captureType == captureType2) {
            mutableOptionsBundleM1507T.mo1506u(ImageOutputConfig.f2736m, displayInfoManager.m1016e());
        }
        mutableOptionsBundleM1507T.mo1506u(ImageOutputConfig.f2731h, Integer.valueOf(displayInfoManager.m1015c(true).getRotation()));
        if (captureType == UseCaseConfigFactory.CaptureType.f2823d || captureType == UseCaseConfigFactory.CaptureType.f2824f) {
            mutableOptionsBundleM1507T.mo1506u(UseCaseConfig.f2816x, Boolean.TRUE);
        }
        return OptionsBundle.m1511S(mutableOptionsBundleM1507T);
    }
}
