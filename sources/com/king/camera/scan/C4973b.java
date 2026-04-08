package com.king.camera.scan;

import androidx.lifecycle.Observer;
import com.king.camera.scan.manager.BeepManager;

/* JADX INFO: renamed from: com.king.camera.scan.b */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C4973b implements Observer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ BaseCameraScan f42989a;

    public /* synthetic */ C4973b(BaseCameraScan baseCameraScan) {
        this.f42989a = baseCameraScan;
    }

    /* JADX WARN: Type inference failed for: r3v9, types: [com.king.camera.scan.CameraScan$OnScanResultCallback, java.lang.Object] */
    @Override // androidx.lifecycle.Observer
    /* JADX INFO: renamed from: a */
    public final void mo1166a(Object obj) {
        BaseCameraScan baseCameraScan = this.f42989a;
        if (((AnalyzeResult) obj) == null) {
            Object obj2 = baseCameraScan.f42971m;
            return;
        }
        synchronized (baseCameraScan) {
            try {
                if (!baseCameraScan.f42968j && baseCameraScan.f42966h) {
                    baseCameraScan.f42968j = true;
                    if (baseCameraScan.f42967i) {
                        baseCameraScan.f42966h = false;
                    }
                    BeepManager beepManager = baseCameraScan.f42973o;
                    if (beepManager != null) {
                        synchronized (beepManager) {
                        }
                    }
                    ?? r3 = baseCameraScan.f42971m;
                    if (r3 != 0) {
                        r3.m15333b();
                    }
                    baseCameraScan.f42968j = false;
                }
            } finally {
            }
        }
    }
}
