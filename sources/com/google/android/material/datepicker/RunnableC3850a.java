package com.google.android.material.datepicker;

/* JADX INFO: renamed from: com.google.android.material.datepicker.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3850a implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ DateFormatTextWatcher f42461a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f42462b;

    public /* synthetic */ RunnableC3850a(DateFormatTextWatcher dateFormatTextWatcher, String str) {
        this.f42461a = dateFormatTextWatcher;
        this.f42462b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        DateFormatTextWatcher.m14680b(this.f42461a, this.f42462b);
    }
}
