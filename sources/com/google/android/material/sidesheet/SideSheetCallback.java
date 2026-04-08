package com.google.android.material.sidesheet;

import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public abstract class SideSheetCallback implements SheetCallback {
    @Override // com.google.android.material.sidesheet.SheetCallback
    public abstract void onSlide(@NonNull View view, float f);

    @Override // com.google.android.material.sidesheet.SheetCallback
    public abstract void onStateChanged(@NonNull View view, int i);

    public void onLayout(@NonNull View view) {
    }
}
