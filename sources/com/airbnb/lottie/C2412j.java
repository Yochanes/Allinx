package com.airbnb.lottie;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.airbnb.lottie.j */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2412j implements LottieListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f34462a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f34463b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AtomicBoolean f34464c;

    public /* synthetic */ C2412j(String str, AtomicBoolean atomicBoolean, int i) {
        this.f34462a = i;
        this.f34463b = str;
        this.f34464c = atomicBoolean;
    }

    @Override // com.airbnb.lottie.LottieListener
    public final void onResult(Object obj) {
        switch (this.f34462a) {
            case 0:
                HashMap map = LottieCompositionFactory.f34054a;
                map.remove(this.f34463b);
                this.f34464c.set(true);
                if (map.size() == 0) {
                    LottieCompositionFactory.m12565i(true);
                }
                break;
            default:
                HashMap map2 = LottieCompositionFactory.f34054a;
                map2.remove(this.f34463b);
                this.f34464c.set(true);
                if (map2.size() == 0) {
                    LottieCompositionFactory.m12565i(true);
                }
                break;
        }
    }
}
