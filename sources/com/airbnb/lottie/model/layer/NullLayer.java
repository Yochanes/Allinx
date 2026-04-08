package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class NullLayer extends BaseLayer {
    @Override // com.airbnb.lottie.model.layer.BaseLayer, com.airbnb.lottie.animation.content.DrawingContent
    /* JADX INFO: renamed from: d */
    public final void mo12586d(RectF rectF, Matrix matrix, boolean z2) {
        super.mo12586d(rectF, matrix, z2);
        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer
    /* JADX INFO: renamed from: i */
    public final void mo12659i(Canvas canvas, Matrix matrix, int i) {
    }
}
