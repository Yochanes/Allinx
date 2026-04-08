package androidx.camera.extensions.internal.sessionprocessor;

import androidx.camera.core.impl.ImageReaderProxy;

/* JADX INFO: renamed from: androidx.camera.extensions.internal.sessionprocessor.c */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0350c implements ImageReaderProxy.OnImageAvailableListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ StillCaptureProcessor f3246a;

    public /* synthetic */ C0350c(StillCaptureProcessor stillCaptureProcessor) {
        this.f3246a = stillCaptureProcessor;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener
    /* JADX INFO: renamed from: b */
    public final void mo1168b(ImageReaderProxy imageReaderProxy) {
        StillCaptureProcessor.m1770a(this.f3246a, imageReaderProxy);
    }
}
