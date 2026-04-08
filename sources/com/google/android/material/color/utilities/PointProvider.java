package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@RestrictTo
public interface PointProvider {
    double distance(double[] dArr, double[] dArr2);

    double[] fromInt(int i);

    int toInt(double[] dArr);
}
