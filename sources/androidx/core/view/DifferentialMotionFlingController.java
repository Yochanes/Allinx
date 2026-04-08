package androidx.core.view;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.view.InputDevice;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.VelocityTrackerCompat;
import androidx.core.view.ViewConfigurationCompat;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class DifferentialMotionFlingController {

    /* JADX INFO: renamed from: a */
    public final Context f23362a;

    /* JADX INFO: renamed from: b */
    public final DifferentialMotionFlingTarget f23363b;

    /* JADX INFO: renamed from: c */
    public VelocityTracker f23364c;

    /* JADX INFO: renamed from: d */
    public float f23365d;

    /* JADX INFO: renamed from: e */
    public int f23366e = -1;

    /* JADX INFO: renamed from: f */
    public int f23367f = -1;

    /* JADX INFO: renamed from: g */
    public int f23368g = -1;

    /* JADX INFO: renamed from: h */
    public final int[] f23369h = {Integer.MAX_VALUE, 0};

    /* JADX INFO: compiled from: Proguard */
    @VisibleForTesting
    public interface DifferentialVelocityProvider {
    }

    /* JADX INFO: compiled from: Proguard */
    @VisibleForTesting
    public interface FlingVelocityThresholdCalculator {
    }

    public DifferentialMotionFlingController(Context context, DifferentialMotionFlingTarget differentialMotionFlingTarget) {
        this.f23362a = context;
        this.f23363b = differentialMotionFlingTarget;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x017c  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m7718a(MotionEvent motionEvent, int i) {
        int i2;
        int i3;
        int i4;
        int scaledMinimumFlingVelocity;
        int scaledMaximumFlingVelocity;
        boolean z2;
        float f;
        float yVelocity;
        long j;
        float f2;
        float fSqrt;
        float f3;
        int i5;
        float f4;
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        int i6 = this.f23367f;
        int[] iArr = this.f23369h;
        if (i6 == source && this.f23368g == deviceId && this.f23366e == i) {
            z2 = false;
            i2 = 1;
            i3 = 20;
            i4 = 0;
        } else {
            Context context = this.f23362a;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int deviceId2 = motionEvent.getDeviceId();
            i2 = 1;
            int source2 = motionEvent.getSource();
            i3 = 20;
            int i7 = Build.VERSION.SDK_INT;
            i4 = 0;
            if (i7 >= 34) {
                Method method = ViewConfigurationCompat.f23423a;
                scaledMinimumFlingVelocity = ViewConfigurationCompat.Api34Impl.m7865b(viewConfiguration, deviceId2, i, source2);
            } else {
                Method method2 = ViewConfigurationCompat.f23423a;
                InputDevice device = InputDevice.getDevice(deviceId2);
                if ((device == null || device.getMotionRange(i, source2) == null) ? false : true) {
                    Resources resources = context.getResources();
                    int identifier = (source2 == 4194304 && i == 26) ? resources.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                    Objects.requireNonNull(viewConfiguration);
                    if (identifier == -1) {
                        scaledMinimumFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
                    } else if (identifier == 0 || (scaledMinimumFlingVelocity = resources.getDimensionPixelSize(identifier)) < 0) {
                    }
                } else {
                    scaledMinimumFlingVelocity = Integer.MAX_VALUE;
                }
            }
            iArr[0] = scaledMinimumFlingVelocity;
            int deviceId3 = motionEvent.getDeviceId();
            int source3 = motionEvent.getSource();
            if (i7 >= 34) {
                scaledMaximumFlingVelocity = ViewConfigurationCompat.Api34Impl.m7864a(viewConfiguration, deviceId3, i, source3);
            } else {
                InputDevice device2 = InputDevice.getDevice(deviceId3);
                if ((device2 == null || device2.getMotionRange(i, source3) == null) ? false : true) {
                    Resources resources2 = context.getResources();
                    int identifier2 = (source3 == 4194304 && i == 26) ? resources2.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                    Objects.requireNonNull(viewConfiguration);
                    if (identifier2 == -1) {
                        scaledMaximumFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
                    } else if (identifier2 == 0 || (scaledMaximumFlingVelocity = resources2.getDimensionPixelSize(identifier2)) < 0) {
                    }
                } else {
                    scaledMaximumFlingVelocity = Integer.MIN_VALUE;
                }
            }
            iArr[1] = scaledMaximumFlingVelocity;
            this.f23367f = source;
            this.f23368g = deviceId;
            this.f23366e = i;
            z2 = true;
        }
        if (iArr[i4] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker = this.f23364c;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f23364c = null;
                return;
            }
            return;
        }
        if (this.f23364c == null) {
            this.f23364c = VelocityTracker.obtain();
        }
        VelocityTracker velocityTracker2 = this.f23364c;
        Map map = VelocityTrackerCompat.f23399a;
        velocityTracker2.addMovement(motionEvent);
        float f5 = 0.0f;
        if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
            Map map2 = VelocityTrackerCompat.f23399a;
            if (!map2.containsKey(velocityTracker2)) {
                map2.put(velocityTracker2, new VelocityTrackerFallback());
            }
            VelocityTrackerFallback velocityTrackerFallback = (VelocityTrackerFallback) map2.get(velocityTracker2);
            velocityTrackerFallback.getClass();
            long eventTime = motionEvent.getEventTime();
            int i8 = velocityTrackerFallback.f23403d;
            long[] jArr = velocityTrackerFallback.f23401b;
            if (i8 != 0 && eventTime - jArr[velocityTrackerFallback.f23404e] > 40) {
                velocityTrackerFallback.f23403d = i4;
                velocityTrackerFallback.f23402c = 0.0f;
            }
            int i9 = (velocityTrackerFallback.f23404e + 1) % 20;
            velocityTrackerFallback.f23404e = i9;
            int i10 = velocityTrackerFallback.f23403d;
            if (i10 != i3) {
                velocityTrackerFallback.f23403d = i10 + 1;
            }
            velocityTrackerFallback.f23400a[i9] = motionEvent.getAxisValue(26);
            jArr[velocityTrackerFallback.f23404e] = eventTime;
        }
        int i11 = 1000;
        velocityTracker2.computeCurrentVelocity(1000, Float.MAX_VALUE);
        VelocityTrackerFallback velocityTrackerFallback2 = (VelocityTrackerFallback) VelocityTrackerCompat.f23399a.get(velocityTracker2);
        if (velocityTrackerFallback2 != null) {
            int i12 = velocityTrackerFallback2.f23403d;
            if (i12 < 2) {
                f2 = Float.MAX_VALUE;
                fSqrt = 0.0f;
                f = 0.0f;
                f4 = fSqrt * i11;
                velocityTrackerFallback2.f23402c = f4;
                if (f4 >= (-Math.abs(f2))) {
                    velocityTrackerFallback2.f23402c = -Math.abs(f2);
                } else if (velocityTrackerFallback2.f23402c > Math.abs(f2)) {
                    velocityTrackerFallback2.f23402c = Math.abs(f2);
                }
            } else {
                int i13 = velocityTrackerFallback2.f23404e;
                int i14 = ((i13 + 20) - (i12 - 1)) % 20;
                long[] jArr2 = velocityTrackerFallback2.f23401b;
                long j2 = jArr2[i13];
                while (true) {
                    j = jArr2[i14];
                    if (j2 - j <= 100) {
                        break;
                    }
                    velocityTrackerFallback2.f23403d--;
                    i14 = (i14 + 1) % 20;
                }
                int i15 = velocityTrackerFallback2.f23403d;
                if (i15 >= 2) {
                    float[] fArr = velocityTrackerFallback2.f23400a;
                    if (i15 == 2) {
                        int i16 = (i14 + 1) % 20;
                        if (j != jArr2[i16]) {
                            fSqrt = fArr[i16] / (r22 - j);
                            f2 = Float.MAX_VALUE;
                            f = 0.0f;
                        }
                    } else {
                        f2 = Float.MAX_VALUE;
                        float fAbs = 0.0f;
                        int i17 = 0;
                        int i18 = 0;
                        while (true) {
                            if (i17 >= velocityTrackerFallback2.f23403d - 1) {
                                break;
                            }
                            int i19 = i17 + i14;
                            long j3 = jArr2[i19 % 20];
                            int i20 = (i19 + 1) % 20;
                            if (jArr2[i20] == j3) {
                                f3 = f5;
                                i5 = i2;
                            } else {
                                i18++;
                                f3 = f5;
                                float fSqrt2 = (fAbs < f5 ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(fAbs) * 2.0f));
                                float f6 = fArr[i20] / (jArr2[i20] - j3);
                                fAbs += Math.abs(f6) * (f6 - fSqrt2);
                                i5 = i2;
                                if (i18 == i5) {
                                    fAbs *= 0.5f;
                                }
                            }
                            i17 += i5;
                            i2 = i5;
                            f5 = f3;
                        }
                        f = f5;
                        fSqrt = (fAbs < f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(fAbs) * 2.0f));
                        i11 = 1000;
                    }
                    f4 = fSqrt * i11;
                    velocityTrackerFallback2.f23402c = f4;
                    if (f4 >= (-Math.abs(f2))) {
                    }
                }
            }
        } else {
            f = 0.0f;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            yVelocity = VelocityTrackerCompat.Api34Impl.m7764a(velocityTracker2, i);
        } else if (i == 0) {
            yVelocity = velocityTracker2.getXVelocity();
        } else if (i == 1) {
            yVelocity = velocityTracker2.getYVelocity();
        } else {
            VelocityTrackerFallback velocityTrackerFallback3 = (VelocityTrackerFallback) VelocityTrackerCompat.f23399a.get(velocityTracker2);
            yVelocity = (velocityTrackerFallback3 == null || i != 26) ? f : velocityTrackerFallback3.f23402c;
        }
        DifferentialMotionFlingTarget differentialMotionFlingTarget = this.f23363b;
        float fMo7720b = differentialMotionFlingTarget.mo7720b() * yVelocity;
        float fSignum = Math.signum(fMo7720b);
        if (z2 || (fSignum != Math.signum(this.f23365d) && fSignum != f)) {
            differentialMotionFlingTarget.mo7721c();
        }
        if (Math.abs(fMo7720b) < iArr[0]) {
            return;
        }
        float fMax = Math.max(-r1, Math.min(fMo7720b, iArr[1]));
        this.f23365d = differentialMotionFlingTarget.mo7719a(fMax) ? fMax : f;
    }
}
