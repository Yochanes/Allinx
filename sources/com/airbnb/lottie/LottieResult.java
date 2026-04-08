package com.airbnb.lottie;

import java.util.Arrays;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final class LottieResult<V> {

    /* JADX INFO: renamed from: a */
    public final Object f34100a;

    /* JADX INFO: renamed from: b */
    public final Throwable f34101b;

    public LottieResult(Object obj) {
        this.f34100a = obj;
        this.f34101b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LottieResult)) {
            return false;
        }
        LottieResult lottieResult = (LottieResult) obj;
        Object obj2 = this.f34100a;
        if (obj2 != null && obj2.equals(lottieResult.f34100a)) {
            return true;
        }
        Throwable th = this.f34101b;
        if (th == null || lottieResult.f34101b == null) {
            return false;
        }
        return th.toString().equals(th.toString());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f34100a, this.f34101b});
    }

    public LottieResult(Throwable th) {
        this.f34101b = th;
        this.f34100a = null;
    }
}
