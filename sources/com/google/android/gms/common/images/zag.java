package com.google.android.gms.common.images;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.internal.base.zak;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zag {
    final zad zaa;
    protected int zab;

    public zag(Uri uri, int i) {
        this.zab = 0;
        this.zaa = new zad(uri);
        this.zab = i;
    }

    public abstract void zaa(@Nullable Drawable drawable, boolean z2, boolean z3, boolean z4);

    public final void zab(Context context, zak zakVar, boolean z2) {
        int i = this.zab;
        zaa(i != 0 ? context.getResources().getDrawable(i) : null, z2, false, false);
    }

    public final void zac(Context context, Bitmap bitmap, boolean z2) {
        Asserts.checkNotNull(bitmap);
        zaa(new BitmapDrawable(context.getResources(), bitmap), false, false, true);
    }
}
