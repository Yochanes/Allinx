package com.google.android.material.chip;

import android.widget.CompoundButton;

/* JADX INFO: renamed from: com.google.android.material.chip.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3796a implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Chip f42426a;

    public /* synthetic */ C3796a(Chip chip) {
        this.f42426a = chip;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
        Chip.m14507a(this.f42426a, compoundButton, z2);
    }
}
