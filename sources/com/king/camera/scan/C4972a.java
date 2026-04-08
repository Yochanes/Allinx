package com.king.camera.scan;

import android.view.View;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.SettableImageProxy;
import com.king.camera.scan.analyze.Analyzer;
import com.king.camera.scan.manager.AmbientLightManager;

/* JADX INFO: renamed from: com.king.camera.scan.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C4972a implements ImageAnalysis.Analyzer, AmbientLightManager.OnLightSensorEventListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ BaseCameraScan f42988a;

    public /* synthetic */ C4972a(BaseCameraScan baseCameraScan) {
        this.f42988a = baseCameraScan;
    }

    @Override // androidx.camera.core.ImageAnalysis.Analyzer
    /* JADX INFO: renamed from: a */
    public void mo1247a(SettableImageProxy settableImageProxy) throws Exception {
        Analyzer analyzer;
        BaseCameraScan baseCameraScan = this.f42988a;
        if (baseCameraScan.f42966h && !baseCameraScan.f42968j && (analyzer = baseCameraScan.f42965g) != null) {
            analyzer.mo15335a(settableImageProxy, baseCameraScan.f42972n);
        }
        settableImageProxy.close();
    }

    /* JADX INFO: renamed from: b */
    public void m15334b(boolean z2) {
        BaseCameraScan baseCameraScan = this.f42988a;
        View view = baseCameraScan.f42969k;
        if (view != null) {
            if (z2) {
                if (view.getVisibility() != 0) {
                    baseCameraScan.f42969k.setVisibility(0);
                    baseCameraScan.f42969k.setSelected(baseCameraScan.m15321b());
                    return;
                }
                return;
            }
            if (view.getVisibility() != 0 || baseCameraScan.m15321b()) {
                return;
            }
            baseCameraScan.f42969k.setVisibility(4);
            baseCameraScan.f42969k.setSelected(false);
        }
    }
}
