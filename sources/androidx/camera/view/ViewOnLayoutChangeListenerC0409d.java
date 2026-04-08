package androidx.camera.view;

import android.view.View;

/* JADX INFO: renamed from: androidx.camera.view.d */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnLayoutChangeListenerC0409d implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ PreviewView f3585a;

    public /* synthetic */ ViewOnLayoutChangeListenerC0409d(PreviewView previewView) {
        this.f3585a = previewView;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = PreviewView.f3518t;
        PreviewView previewView = this.f3585a;
        if (i3 - i == i7 - i5 && i4 - i2 == i8 - i6) {
            return;
        }
        previewView.m1937b();
        previewView.m1936a(true);
    }
}
