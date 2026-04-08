package org.aspectj.lang;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class NoAspectBoundException extends RuntimeException {

    /* JADX INFO: renamed from: a */
    public Throwable f57990a;

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f57990a;
    }
}
