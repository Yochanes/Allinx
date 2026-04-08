package com.google.android.material.bottomappbar;

import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.google.android.material.shape.EdgeTreatment;
import com.google.android.material.shape.ShapePath;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public class BottomAppBarTopEdgeTreatment extends EdgeTreatment implements Cloneable {
    private static final int ANGLE_LEFT = 180;
    private static final int ANGLE_UP = 270;
    private static final int ARC_HALF = 180;
    private static final int ARC_QUARTER = 90;
    private static final float ROUNDED_CORNER_FAB_OFFSET = 1.75f;
    private float cradleVerticalOffset;
    private float fabCornerSize = -1.0f;
    private float fabDiameter;
    private float fabMargin;
    private float horizontalOffset;
    private float roundedCornerRadius;

    public BottomAppBarTopEdgeTreatment(float f, float f2, float f3) {
        this.fabMargin = f;
        this.roundedCornerRadius = f2;
        setCradleVerticalOffset(f3);
        this.horizontalOffset = 0.0f;
    }

    public float getCradleVerticalOffset() {
        return this.cradleVerticalOffset;
    }

    @Override // com.google.android.material.shape.EdgeTreatment
    public void getEdgePath(float f, float f2, float f3, @NonNull ShapePath shapePath) {
        float f4;
        float f5;
        float f6 = this.fabDiameter;
        if (f6 == 0.0f) {
            shapePath.lineTo(f, 0.0f);
            return;
        }
        float f7 = ((this.fabMargin * 2.0f) + f6) / 2.0f;
        float f8 = f3 * this.roundedCornerRadius;
        float f9 = f2 + this.horizontalOffset;
        float fM4a = AbstractC0000a.m4a(1.0f, f3, f7, this.cradleVerticalOffset * f3);
        if (fM4a / f7 >= 1.0f) {
            shapePath.lineTo(f, 0.0f);
            return;
        }
        float f10 = this.fabCornerSize;
        float f11 = f10 * f3;
        boolean z2 = f10 == -1.0f || Math.abs((f10 * 2.0f) - f6) < 0.1f;
        if (z2) {
            f4 = fM4a;
            f5 = 0.0f;
        } else {
            f5 = ROUNDED_CORNER_FAB_OFFSET;
            f4 = 0.0f;
        }
        float f12 = f7 + f8;
        float f13 = f4 + f8;
        float fSqrt = (float) Math.sqrt((f12 * f12) - (f13 * f13));
        float f14 = f9 - fSqrt;
        float f15 = f9 + fSqrt;
        float degrees = (float) Math.toDegrees(Math.atan(fSqrt / f13));
        float f16 = (90.0f - degrees) + f5;
        shapePath.lineTo(f14, 0.0f);
        float f17 = f14 - f8;
        float f18 = f14 + f8;
        float f19 = f8 * 2.0f;
        shapePath.addArc(f17, 0.0f, f18, f19, 270.0f, degrees);
        if (z2) {
            shapePath.addArc(f9 - f7, (-f7) - f4, f9 + f7, f7 - f4, 180.0f - f16, (f16 * 2.0f) - 180.0f);
        } else {
            float f20 = this.fabMargin;
            float f21 = f11 * 2.0f;
            float f22 = f20 + f21;
            float f23 = f9 - f7;
            shapePath.addArc(f23, -(f11 + f20), f22 + f23, f20 + f11, 180.0f - f16, ((f16 * 2.0f) - 180.0f) / 2.0f);
            float f24 = f9 + f7;
            float f25 = this.fabMargin;
            shapePath.lineTo(f24 - ((f25 / 2.0f) + f11), f25 + f11);
            float f26 = this.fabMargin;
            shapePath.addArc(f24 - (f21 + f26), -(f11 + f26), f24, f26 + f11, 90.0f, f16 - 90.0f);
        }
        shapePath.addArc(f15 - f8, 0.0f, f15 + f8, f19, 270.0f - degrees, degrees);
        shapePath.lineTo(f, 0.0f);
    }

    public float getFabCornerRadius() {
        return this.fabCornerSize;
    }

    public float getFabCradleMargin() {
        return this.fabMargin;
    }

    public float getFabCradleRoundedCornerRadius() {
        return this.roundedCornerRadius;
    }

    @RestrictTo
    public float getFabDiameter() {
        return this.fabDiameter;
    }

    @RestrictTo
    public float getHorizontalOffset() {
        return this.horizontalOffset;
    }

    public void setCradleVerticalOffset(@FloatRange float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
        }
        this.cradleVerticalOffset = f;
    }

    public void setFabCornerSize(float f) {
        this.fabCornerSize = f;
    }

    public void setFabCradleMargin(float f) {
        this.fabMargin = f;
    }

    public void setFabCradleRoundedCornerRadius(float f) {
        this.roundedCornerRadius = f;
    }

    @RestrictTo
    public void setFabDiameter(float f) {
        this.fabDiameter = f;
    }

    public void setHorizontalOffset(float f) {
        this.horizontalOffset = f;
    }
}
