package com.google.android.material.resources;

import android.graphics.Typeface;
import androidx.annotation.RestrictTo;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@RestrictTo
public abstract class TextAppearanceFontCallback {
    public abstract void onFontRetrievalFailed(int i);

    public abstract void onFontRetrieved(Typeface typeface, boolean z2);
}
