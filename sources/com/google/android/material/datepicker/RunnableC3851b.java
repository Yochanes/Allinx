package com.google.android.material.datepicker;

/* JADX INFO: renamed from: com.google.android.material.datepicker.b */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3851b implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ DateFormatTextWatcher f42463a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f42464b;

    public /* synthetic */ RunnableC3851b(DateFormatTextWatcher dateFormatTextWatcher, long j) {
        this.f42463a = dateFormatTextWatcher;
        this.f42464b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        DateFormatTextWatcher.m14679a(this.f42463a, this.f42464b);
    }
}
