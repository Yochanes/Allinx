package com.airbnb.lottie.manager;

import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.airbnb.lottie.model.MutablePair;
import com.airbnb.lottie.utils.Logger;
import java.util.HashMap;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class FontAssetManager {

    /* JADX INFO: renamed from: d */
    public final AssetManager f34473d;

    /* JADX INFO: renamed from: a */
    public final MutablePair f34470a = new MutablePair();

    /* JADX INFO: renamed from: b */
    public final HashMap f34471b = new HashMap();

    /* JADX INFO: renamed from: c */
    public final HashMap f34472c = new HashMap();

    /* JADX INFO: renamed from: e */
    public final String f34474e = ".ttf";

    public FontAssetManager(Drawable.Callback callback) {
        if (callback instanceof View) {
            this.f34473d = ((View) callback).getContext().getAssets();
        } else {
            Logger.m12736b("LottieDrawable must be inside of a view for images to work.");
            this.f34473d = null;
        }
    }
}
