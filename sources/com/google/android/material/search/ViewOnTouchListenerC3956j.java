package com.google.android.material.search;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: com.google.android.material.search.j */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnTouchListenerC3956j implements View.OnTouchListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SearchView f42487a;

    public /* synthetic */ ViewOnTouchListenerC3956j(SearchView searchView) {
        this.f42487a = searchView;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return SearchView.m14701c(this.f42487a, view, motionEvent);
    }
}
