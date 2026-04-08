package androidx.camera.extensions.internal.sessionprocessor;

import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.extensions.internal.sessionprocessor.CaptureResultImageMatcher;
import androidx.camera.extensions.internal.sessionprocessor.StillCaptureProcessor;
import java.util.List;

/* JADX INFO: renamed from: androidx.camera.extensions.internal.sessionprocessor.b */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0349b implements CaptureResultImageMatcher.ImageReferenceListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ StillCaptureProcessor f3243a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ List f3244b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ StillCaptureProcessor.OnCaptureResultCallback f3245c;

    public /* synthetic */ C0349b(StillCaptureProcessor stillCaptureProcessor, List list, StillCaptureProcessor.OnCaptureResultCallback onCaptureResultCallback) {
        this.f3243a = stillCaptureProcessor;
        this.f3244b = list;
        this.f3245c = onCaptureResultCallback;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.CaptureResultImageMatcher.ImageReferenceListener
    /* JADX INFO: renamed from: a */
    public final void mo1767a(ImageReference imageReference, TotalCaptureResult totalCaptureResult, int i) {
        StillCaptureProcessor.m1771b(this.f3243a, this.f3244b, this.f3245c, imageReference, totalCaptureResult, i);
    }
}
