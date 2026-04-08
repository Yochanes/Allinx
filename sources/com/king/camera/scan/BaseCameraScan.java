package com.king.camera.scan;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.view.ScaleGestureDetector;
import android.view.View;
import androidx.camera.core.Camera;
import androidx.camera.core.ZoomState;
import androidx.camera.core.impl.utils.futures.FutureChain;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.camera.view.PreviewView;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.google.common.util.concurrent.ListenableFuture;
import com.king.camera.scan.analyze.Analyzer;
import com.king.camera.scan.config.CameraConfig;
import com.king.camera.scan.config.CameraConfigFactory;
import com.king.camera.scan.manager.AmbientLightManager;
import com.king.camera.scan.manager.BeepManager;
import com.king.logx.LogX;
import p007I.RunnableC0015a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class BaseCameraScan<T> extends CameraScan<T> {

    /* JADX INFO: renamed from: a */
    public final Context f42959a;

    /* JADX INFO: renamed from: b */
    public final LifecycleOwner f42960b;

    /* JADX INFO: renamed from: c */
    public final PreviewView f42961c;

    /* JADX INFO: renamed from: d */
    public ListenableFuture f42962d;

    /* JADX INFO: renamed from: e */
    public Camera f42963e;

    /* JADX INFO: renamed from: f */
    public CameraConfig f42964f;

    /* JADX INFO: renamed from: g */
    public Analyzer f42965g;

    /* JADX INFO: renamed from: h */
    public volatile boolean f42966h = true;

    /* JADX INFO: renamed from: i */
    public volatile boolean f42967i = true;

    /* JADX INFO: renamed from: j */
    public volatile boolean f42968j;

    /* JADX INFO: renamed from: k */
    public View f42969k;

    /* JADX INFO: renamed from: l */
    public final MutableLiveData f42970l;

    /* JADX INFO: renamed from: m */
    public Object f42971m;

    /* JADX INFO: renamed from: n */
    public final Analyzer.OnAnalyzeListener f42972n;

    /* JADX INFO: renamed from: o */
    public final BeepManager f42973o;

    /* JADX INFO: renamed from: p */
    public final AmbientLightManager f42974p;

    /* JADX INFO: renamed from: q */
    public long f42975q;

    /* JADX INFO: renamed from: r */
    public boolean f42976r;

    /* JADX INFO: renamed from: s */
    public float f42977s;

    /* JADX INFO: renamed from: t */
    public float f42978t;

    /* JADX INFO: renamed from: com.king.camera.scan.BaseCameraScan$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C49701 extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        public C49701() {
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            float scaleFactor = scaleGestureDetector.getScaleFactor();
            BaseCameraScan baseCameraScan = BaseCameraScan.this;
            Camera camera = baseCameraScan.f42963e;
            ZoomState zoomState = camera != null ? (ZoomState) camera.mo1213c().mo957p().mo960d() : null;
            if (zoomState == null) {
                return false;
            }
            float fMo1074c = zoomState.mo1074c() * scaleFactor;
            Camera camera2 = baseCameraScan.f42963e;
            ZoomState zoomState2 = camera2 != null ? (ZoomState) camera2.mo1213c().mo957p().mo960d() : null;
            if (zoomState2 == null) {
                return true;
            }
            baseCameraScan.f42963e.mo1212b().mo876b(Math.max(Math.min(fMo1074c, zoomState2.mo1072a()), zoomState2.mo1073b()));
            return true;
        }
    }

    /* JADX INFO: renamed from: com.king.camera.scan.BaseCameraScan$2 */
    /* JADX INFO: compiled from: Proguard */
    class C49712 implements Analyzer.OnAnalyzeListener<Object> {
        public C49712() {
        }

        @Override // com.king.camera.scan.analyze.Analyzer.OnAnalyzeListener
        /* JADX INFO: renamed from: a */
        public final void mo15324a(AnalyzeResult analyzeResult) {
            BaseCameraScan.this.f42970l.m9145i(analyzeResult);
        }

        @Override // com.king.camera.scan.analyze.Analyzer.OnAnalyzeListener
        public final void onFailure() {
            BaseCameraScan.this.f42970l.m9145i(null);
        }
    }

    public BaseCameraScan(Context context, LifecycleOwner lifecycleOwner, PreviewView previewView) {
        C49701 c49701 = new C49701();
        this.f42959a = context;
        this.f42960b = lifecycleOwner;
        this.f42961c = previewView;
        MutableLiveData mutableLiveData = new MutableLiveData();
        this.f42970l = mutableLiveData;
        mutableLiveData.m9142e(lifecycleOwner, new C4973b(this));
        this.f42972n = new C49712();
        previewView.setOnTouchListener(new ViewOnTouchListenerC4974c(this, new ScaleGestureDetector(context, c49701)));
        this.f42973o = new BeepManager(context.getApplicationContext());
        Context applicationContext = context.getApplicationContext();
        AmbientLightManager ambientLightManager = new AmbientLightManager();
        SensorManager sensorManager = (SensorManager) applicationContext.getSystemService("sensor");
        ambientLightManager.f42999a = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(5);
        ambientLightManager.f43000b = defaultSensor;
        ambientLightManager.f43002d = true;
        this.f42974p = ambientLightManager;
        if (defaultSensor != null) {
            sensorManager.registerListener(ambientLightManager, defaultSensor, 3);
        }
        this.f42974p.f43003e = new C4972a(this);
    }

    /* JADX INFO: renamed from: a */
    public final void m15320a(boolean z2) {
        Camera camera = this.f42963e;
        if (camera == null || !camera.mo1213c().mo953l()) {
            return;
        }
        this.f42963e.mo1212b().mo881g(z2);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m15321b() {
        Integer num;
        Camera camera = this.f42963e;
        return (camera == null || (num = (Integer) camera.mo1213c().mo947e().mo960d()) == null || num.intValue() != 1) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public final void m15322c() {
        SensorManager sensorManager;
        this.f42966h = false;
        this.f42969k = null;
        AmbientLightManager ambientLightManager = this.f42974p;
        if (ambientLightManager != null && (sensorManager = ambientLightManager.f42999a) != null && ambientLightManager.f43000b != null) {
            sensorManager.unregisterListener(ambientLightManager);
        }
        BeepManager beepManager = this.f42973o;
        if (beepManager != null) {
            beepManager.close();
        }
        ListenableFuture listenableFuture = this.f42962d;
        if (listenableFuture != null) {
            try {
                ((ProcessCameraProvider) listenableFuture.get()).m1791c();
            } catch (Exception e) {
                LogX.m15346e(e);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m15323d() {
        CameraConfig cameraConfig = this.f42964f;
        Context context = this.f42959a;
        if (cameraConfig == null) {
            this.f42964f = CameraConfigFactory.m15339a(context);
        }
        ListenableFuture listenableFutureM1789b = ProcessCameraProvider.m1789b(context);
        this.f42962d = listenableFutureM1789b;
        ((FutureChain) listenableFutureM1789b).addListener(new RunnableC0015a(this, 24), ContextCompat.m7486c(context));
    }
}
