package com.google.android.material.datepicker;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@RestrictTo
public abstract class OnSelectionChangedListener<S> {
    public abstract void onSelectionChanged(@NonNull S s);

    public void onIncompleteSelectionChanged() {
    }
}
