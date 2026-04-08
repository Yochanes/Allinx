package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import androidx.compose.animation.AbstractC0455a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class ShapeData {

    /* JADX INFO: renamed from: a */
    public final ArrayList f34605a;

    /* JADX INFO: renamed from: b */
    public PointF f34606b;

    /* JADX INFO: renamed from: c */
    public boolean f34607c;

    public ShapeData(PointF pointF, boolean z2, List list) {
        this.f34606b = pointF;
        this.f34607c = z2;
        this.f34605a = new ArrayList(list);
    }

    /* JADX INFO: renamed from: a */
    public final void m12655a(float f, float f2) {
        if (this.f34606b == null) {
            this.f34606b = new PointF();
        }
        this.f34606b.set(f, f2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShapeData{numCurves=");
        sb.append(this.f34605a.size());
        sb.append("closed=");
        return AbstractC0455a.m2243r(sb, this.f34607c, '}');
    }

    public ShapeData() {
        this.f34605a = new ArrayList();
    }
}
