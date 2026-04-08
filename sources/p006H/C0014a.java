package p006H;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import androidx.camera.core.Preview;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.internal.C0305a;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.Easing;
import androidx.compose.animation.core.EasingFunctionsKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.p013ui.graphics.colorspace.ColorSpaces;
import androidx.compose.p013ui.graphics.colorspace.DoubleFunction;
import androidx.compose.p013ui.text.AnnotatedString;
import androidx.compose.p013ui.text.TextInclusionStrategy;
import androidx.compose.p013ui.text.input.OffsetMapping;
import androidx.compose.p013ui.text.input.TransformedText;
import androidx.compose.p013ui.text.input.VisualTransformation;
import androidx.media3.common.FlagSet;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MediaLoadData;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import io.intercom.android.sdk.utilities.commons.TimeProvider;
import me.jessyan.retrofiturlmanager.BuildConfig;
import okhttp3.EventListener;

/* JADX INFO: renamed from: H.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0014a implements TimeProvider, EventListener.Factory, Preview.SurfaceProvider, Easing, DoubleFunction, TextInclusionStrategy, VisualTransformation, ListenerSet.Event, ListenerSet.IterationFinishedEvent {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f20a;

    public /* synthetic */ C0014a(int i) {
        this.f20a = i;
    }

    @Override // androidx.camera.core.Preview.SurfaceProvider
    /* JADX INFO: renamed from: a */
    public void mo37a(SurfaceRequest surfaceRequest) {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(surfaceRequest.f2364b.getWidth(), surfaceRequest.f2364b.getHeight());
        surfaceTexture.detachFromGLContext();
        Surface surface = new Surface(surfaceTexture);
        surfaceRequest.m1307a(surface, CameraXExecutors.m1615a(), new C0305a(surface, surfaceTexture));
    }

    @Override // androidx.compose.p013ui.text.TextInclusionStrategy
    /* JADX INFO: renamed from: b */
    public boolean mo38b(Rect rect, Rect rect2) {
        switch (this.f20a) {
            case TYPE_BYTES_VALUE:
                return rect.m5071i(rect2);
            default:
                return rect2.m5064a(rect.m5066d());
        }
    }

    @Override // androidx.compose.animation.core.Easing
    /* JADX INFO: renamed from: c */
    public float mo39c(float f) {
        float f2;
        float f3;
        switch (this.f20a) {
            case 3:
                int i = EasingFunctionsKt.f4401a;
                if (f < 0.36363637f) {
                    return 7.5625f * f * f;
                }
                if (f < 0.72727275f) {
                    float f4 = f - 0.54545456f;
                    f2 = 7.5625f * f4 * f4;
                    f3 = 0.75f;
                } else if (f < 0.90909094f) {
                    float f5 = f - 0.8181818f;
                    f2 = 7.5625f * f5 * f5;
                    f3 = 0.9375f;
                } else {
                    float f6 = f - 0.95454544f;
                    f2 = 7.5625f * f6 * f6;
                    f3 = 0.984375f;
                }
                return f2 + f3;
            default:
                CubicBezierEasing cubicBezierEasing = EasingKt.f4402a;
                return f;
        }
    }

    @Override // io.intercom.android.sdk.utilities.commons.TimeProvider
    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }

    @Override // androidx.compose.p013ui.graphics.colorspace.DoubleFunction
    /* JADX INFO: renamed from: d */
    public double mo40d(double d) {
        switch (this.f20a) {
            case 5:
                float[] fArr = ColorSpaces.f17693a;
                double d2 = d < 0.0d ? -d : d;
                return Math.copySign(d2 >= 0.0031308049535603718d ? (Math.pow(d2, 0.4166666666666667d) - 0.05213270142180095d) / 0.9478672985781991d : d2 / 0.07739938080495357d, d);
            case 6:
                float[] fArr2 = ColorSpaces.f17693a;
                double d3 = d < 0.0d ? -d : d;
                return Math.copySign(d3 >= 0.04045d ? Math.pow((0.9478672985781991d * d3) + 0.05213270142180095d, 2.4d) : 0.07739938080495357d * d3, d);
            case 7:
                float[] fArr3 = ColorSpaces.f17693a;
                return ColorSpaces.m5331b(ColorSpaces.f17695c, d);
            case 8:
                float[] fArr4 = ColorSpaces.f17693a;
                return ColorSpaces.m5330a(ColorSpaces.f17695c, d);
            case 9:
                float[] fArr5 = ColorSpaces.f17693a;
                return ColorSpaces.m5333d(ColorSpaces.f17696d, d);
            case 10:
                float[] fArr6 = ColorSpaces.f17693a;
                return ColorSpaces.m5332c(ColorSpaces.f17696d, d);
            default:
                return d;
        }
    }

    @Override // androidx.media3.common.util.ListenerSet.IterationFinishedEvent
    /* JADX INFO: renamed from: e */
    public void mo41e(Object obj, FlagSet flagSet) {
    }

    @Override // androidx.compose.p013ui.text.input.VisualTransformation
    /* JADX INFO: renamed from: f */
    public TransformedText mo42f(AnnotatedString annotatedString) {
        return new TransformedText(annotatedString, OffsetMapping.Companion.f20383a);
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        AnalyticsListener analyticsListener = (AnalyticsListener) obj;
        switch (this.f20a) {
            case 15:
                analyticsListener.getClass();
                break;
            case 16:
                analyticsListener.getClass();
                break;
            case 17:
                analyticsListener.getClass();
                break;
            case 18:
                analyticsListener.getClass();
                break;
            case 19:
                analyticsListener.getClass();
                break;
            case 20:
                analyticsListener.getClass();
                break;
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                analyticsListener.getClass();
                break;
            case 22:
                analyticsListener.getClass();
                break;
            case ConnectionResult.API_DISABLED /* 23 */:
                analyticsListener.getClass();
                break;
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                analyticsListener.getClass();
                break;
            case BuildConfig.VERSION_CODE /* 25 */:
                analyticsListener.getClass();
                break;
            case 26:
                analyticsListener.getClass();
                break;
            case 27:
                analyticsListener.getClass();
                break;
            default:
                analyticsListener.getClass();
                break;
        }
    }

    public /* synthetic */ C0014a(int i, long j, AnalyticsListener.EventTime eventTime) {
        this.f20a = 16;
    }

    public /* synthetic */ C0014a(AnalyticsListener.EventTime eventTime, int i) {
        this.f20a = i;
    }

    public /* synthetic */ C0014a(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, int i) {
        this.f20a = 28;
    }

    public /* synthetic */ C0014a(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, int i, byte b2) {
        this.f20a = i;
    }

    public /* synthetic */ C0014a(AnalyticsListener.EventTime eventTime, Object obj, int i) {
        this.f20a = i;
    }

    public /* synthetic */ C0014a(AnalyticsListener.EventTime eventTime, boolean z2, int i) {
        this.f20a = 26;
    }
}
