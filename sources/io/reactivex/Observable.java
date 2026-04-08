package io.reactivex;

import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.plugins.RxJavaPlugins;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class Observable<T> implements ObservableSource<T> {

    /* JADX INFO: renamed from: io.reactivex.Observable$1 */
    /* JADX INFO: compiled from: Proguard */
    public static /* synthetic */ class C59541 {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f47535a;

        static {
            int[] iArr = new int[BackpressureStrategy.values().length];
            f47535a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f47535a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f47535a[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f47535a[1] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Override // io.reactivex.ObservableSource
    /* JADX INFO: renamed from: a */
    public final void mo17591a(Observer observer) {
        ObjectHelper.m17628b(observer, "observer is null");
        try {
            mo17592b(observer);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            Exceptions.m17612a(th);
            RxJavaPlugins.m17911b(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo17592b(Observer observer);
}
