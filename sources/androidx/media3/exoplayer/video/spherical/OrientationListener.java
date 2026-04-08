package androidx.media3.exoplayer.video.spherical;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class OrientationListener implements SensorEventListener {

    /* JADX INFO: renamed from: a */
    public final float[] f28023a = new float[16];

    /* JADX INFO: renamed from: b */
    public final float[] f28024b = new float[16];

    /* JADX INFO: renamed from: c */
    public final float[] f28025c = new float[16];

    /* JADX INFO: renamed from: d */
    public final float[] f28026d = new float[3];

    /* JADX INFO: renamed from: e */
    public final Display f28027e;

    /* JADX INFO: renamed from: f */
    public final Listener[] f28028f;

    /* JADX INFO: renamed from: g */
    public boolean f28029g;

    /* JADX INFO: compiled from: Proguard */
    public interface Listener {
        /* JADX INFO: renamed from: a */
        void mo10756a(float f, float[] fArr);
    }

    public OrientationListener(Display display, Listener... listenerArr) {
        this.f28027e = display;
        this.f28028f = listenerArr;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        int i;
        float[] fArr = sensorEvent.values;
        float[] fArr2 = this.f28023a;
        SensorManager.getRotationMatrixFromVector(fArr2, fArr);
        int rotation = this.f28027e.getRotation();
        float[] fArr3 = this.f28024b;
        if (rotation != 0) {
            int i2 = 129;
            if (rotation != 1) {
                i = 130;
                if (rotation != 2) {
                    if (rotation != 3) {
                        throw new IllegalStateException();
                    }
                    i2 = 130;
                    i = 1;
                }
            } else {
                i = 129;
                i2 = 2;
            }
            System.arraycopy(fArr2, 0, fArr3, 0, fArr3.length);
            SensorManager.remapCoordinateSystem(fArr3, i2, i, fArr2);
        }
        SensorManager.remapCoordinateSystem(fArr2, 1, 131, fArr3);
        float[] fArr4 = this.f28026d;
        SensorManager.getOrientation(fArr3, fArr4);
        float f = fArr4[2];
        Matrix.rotateM(fArr2, 0, 90.0f, 1.0f, 0.0f, 0.0f);
        boolean z2 = this.f28029g;
        float[] fArr5 = this.f28025c;
        if (!z2) {
            FrameRotationQueue.m10755a(fArr5, fArr2);
            this.f28029g = true;
        }
        System.arraycopy(fArr2, 0, fArr3, 0, fArr3.length);
        Matrix.multiplyMM(fArr2, 0, fArr3, 0, fArr5, 0);
        for (Listener listener : this.f28028f) {
            listener.mo10756a(f, fArr2);
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }
}
