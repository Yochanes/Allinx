package com.google.android.material.transition;

import android.graphics.RectF;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.ShapeAppearanceModel;

/* JADX INFO: renamed from: com.google.android.material.transition.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4073a implements ShapeAppearanceModel.CornerSizeUnaryOperator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ RectF f42527a;

    public /* synthetic */ C4073a(RectF rectF) {
        this.f42527a = rectF;
    }

    @Override // com.google.android.material.shape.ShapeAppearanceModel.CornerSizeUnaryOperator
    public final CornerSize apply(CornerSize cornerSize) {
        return TransitionUtils.m14752a(this.f42527a, cornerSize);
    }
}
