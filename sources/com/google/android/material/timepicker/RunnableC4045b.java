package com.google.android.material.timepicker;

/* JADX INFO: renamed from: com.google.android.material.timepicker.b */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC4045b implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42519a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f42520b;

    public /* synthetic */ RunnableC4045b(Object obj, int i) {
        this.f42519a = i;
        this.f42520b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f42519a) {
            case 0:
                ((RadialViewGroup) this.f42520b).updateLayoutParams();
                break;
            default:
                MaterialTimePicker.m14749i((MaterialTimePicker) this.f42520b);
                break;
        }
    }
}
