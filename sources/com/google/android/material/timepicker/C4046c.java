package com.google.android.material.timepicker;

import com.google.android.material.button.MaterialButtonToggleGroup;

/* JADX INFO: renamed from: com.google.android.material.timepicker.c */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4046c implements MaterialButtonToggleGroup.OnButtonCheckedListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42521a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f42522b;

    public /* synthetic */ C4046c(Object obj, int i) {
        this.f42521a = i;
        this.f42522b = obj;
    }

    @Override // com.google.android.material.button.MaterialButtonToggleGroup.OnButtonCheckedListener
    public final void onButtonChecked(MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z2) {
        switch (this.f42521a) {
            case 0:
                TimePickerTextInputPresenter.m14750a((TimePickerTextInputPresenter) this.f42522b, materialButtonToggleGroup, i, z2);
                break;
            default:
                TimePickerView.m14751c((TimePickerView) this.f42522b, materialButtonToggleGroup, i, z2);
                break;
        }
    }
}
