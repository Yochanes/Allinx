package com.google.android.material.search;

import android.view.View;

/* JADX INFO: renamed from: com.google.android.material.search.f */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC3952f implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42482a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SearchView f42483b;

    public /* synthetic */ ViewOnClickListenerC3952f(SearchView searchView, int i) {
        this.f42482a = i;
        this.f42483b = searchView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f42482a) {
            case 0:
                SearchView.m14708j(this.f42483b, view);
                break;
            case 1:
                SearchView.m14704f(this.f42483b, view);
                break;
            default:
                SearchView.m14699a(this.f42483b, view);
                break;
        }
    }
}
