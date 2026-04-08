package com.google.android.material.internal;

import android.widget.Checkable;
import androidx.annotation.IdRes;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.android.material.internal.MaterialCheckable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@RestrictTo
public interface MaterialCheckable<T extends MaterialCheckable<T>> extends Checkable {

    /* JADX INFO: compiled from: Proguard */
    public interface OnCheckedChangeListener<C> {
        void onCheckedChanged(C c2, boolean z2);
    }

    @IdRes
    int getId();

    void setInternalOnCheckedChangeListener(@Nullable OnCheckedChangeListener<T> onCheckedChangeListener);
}
