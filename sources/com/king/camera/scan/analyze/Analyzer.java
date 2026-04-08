package com.king.camera.scan.analyze;

import androidx.camera.core.SettableImageProxy;
import com.king.camera.scan.AnalyzeResult;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public interface Analyzer<T> {

    /* JADX INFO: compiled from: Proguard */
    public interface OnAnalyzeListener<T> {
        /* JADX INFO: renamed from: a */
        void mo15324a(AnalyzeResult analyzeResult);

        void onFailure();
    }

    /* JADX INFO: renamed from: a */
    void mo15335a(SettableImageProxy settableImageProxy, OnAnalyzeListener onAnalyzeListener);
}
