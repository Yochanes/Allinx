package com.airbnb.lottie.manager;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import com.airbnb.lottie.LottieImageAsset;
import java.util.HashMap;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class ImageAssetManager {

    /* JADX INFO: renamed from: d */
    public static final Object f34475d = new Object();

    /* JADX INFO: renamed from: a */
    public final Context f34476a;

    /* JADX INFO: renamed from: b */
    public final String f34477b;

    /* JADX INFO: renamed from: c */
    public final HashMap f34478c;

    public ImageAssetManager(Drawable.Callback callback, HashMap map) {
        if (!TextUtils.isEmpty(null)) {
            throw null;
        }
        this.f34477b = null;
        this.f34478c = map;
        if (callback instanceof View) {
            this.f34476a = ((View) callback).getContext().getApplicationContext();
        } else {
            this.f34476a = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m12646a(String str, Bitmap bitmap) {
        synchronized (f34475d) {
            ((LottieImageAsset) this.f34478c.get(str)).f34099d = bitmap;
        }
    }
}
