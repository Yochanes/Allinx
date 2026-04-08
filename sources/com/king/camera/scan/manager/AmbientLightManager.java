package com.king.camera.scan.manager;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.king.camera.scan.C4972a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class AmbientLightManager implements SensorEventListener {

    /* JADX INFO: renamed from: a */
    public SensorManager f42999a;

    /* JADX INFO: renamed from: b */
    public Sensor f43000b;

    /* JADX INFO: renamed from: c */
    public long f43001c;

    /* JADX INFO: renamed from: d */
    public boolean f43002d;

    /* JADX INFO: renamed from: e */
    public C4972a f43003e;

    /* JADX INFO: compiled from: Proguard */
    public interface OnLightSensorEventListener {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (this.f43002d) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - this.f43001c < 200) {
                return;
            }
            this.f43001c = jCurrentTimeMillis;
            C4972a c4972a = this.f43003e;
            if (c4972a != null) {
                float f = sensorEvent.values[0];
                if (f <= 45.0f) {
                    c4972a.m15334b(true);
                } else if (f >= 100.0f) {
                    c4972a.m15334b(false);
                }
            }
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }
}
