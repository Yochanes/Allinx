package com.google.android.material.search;

/* JADX INFO: renamed from: com.google.android.material.search.g */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3953g implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42484a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SearchView f42485b;

    public /* synthetic */ RunnableC3953g(SearchView searchView, int i) {
        this.f42484a = i;
        this.f42485b = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f42484a) {
            case 0:
                SearchView.m14702d(this.f42485b);
                break;
            case 1:
                SearchView.m14703e(this.f42485b);
                break;
            case 2:
                this.f42485b.show();
                break;
            default:
                this.f42485b.requestFocusAndShowKeyboardIfNeeded();
                break;
        }
    }
}
