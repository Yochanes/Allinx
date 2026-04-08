package androidx.camera.extensions.internal.sessionprocessor;

import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.extensions.internal.sessionprocessor.CaptureResultImageMatcher;
import androidx.camera.extensions.internal.sessionprocessor.PreviewProcessor;

/* JADX INFO: renamed from: androidx.camera.extensions.internal.sessionprocessor.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0348a implements CaptureResultImageMatcher.ImageReferenceListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ PreviewProcessor f3241a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ PreviewProcessor.OnCaptureResultCallback f3242b;

    public /* synthetic */ C0348a(PreviewProcessor previewProcessor, PreviewProcessor.OnCaptureResultCallback onCaptureResultCallback) {
        this.f3241a = previewProcessor;
        this.f3242b = onCaptureResultCallback;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.CaptureResultImageMatcher.ImageReferenceListener
    /* JADX INFO: renamed from: a */
    public final void mo1767a(ImageReference imageReference, TotalCaptureResult totalCaptureResult, int i) {
        PreviewProcessor.m1769a(this.f3241a, this.f3242b, imageReference, totalCaptureResult, i);
    }
}
