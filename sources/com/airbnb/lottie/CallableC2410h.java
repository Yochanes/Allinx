package com.airbnb.lottie;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.airbnb.lottie.h */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class CallableC2410h implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ WeakReference f34457a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f34458b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f34459c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f34460d;

    public /* synthetic */ CallableC2410h(WeakReference weakReference, Context context, int i, String str) {
        this.f34457a = weakReference;
        this.f34458b = context;
        this.f34459c = i;
        this.f34460d = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        HashMap map = LottieCompositionFactory.f34054a;
        Context context = (Context) this.f34457a.get();
        if (context == null) {
            context = this.f34458b;
        }
        return LottieCompositionFactory.m12562f(context, this.f34459c, this.f34460d);
    }
}
