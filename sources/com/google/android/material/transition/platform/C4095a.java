package com.google.android.material.transition.platform;

import android.graphics.RectF;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.ShapeAppearanceModel;

/* JADX INFO: renamed from: com.google.android.material.transition.platform.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4095a implements ShapeAppearanceModel.CornerSizeUnaryOperator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ RectF f42532a;

    public /* synthetic */ C4095a(RectF rectF) {
        this.f42532a = rectF;
    }

    @Override // com.google.android.material.shape.ShapeAppearanceModel.CornerSizeUnaryOperator
    public final CornerSize apply(CornerSize cornerSize) {
        return TransitionUtils.m14753a(this.f42532a, cornerSize);
    }
}
