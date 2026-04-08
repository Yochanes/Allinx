package androidx.camera.extensions.internal.sessionprocessor;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Pair;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.extensions.impl.PreviewImageProcessorImpl;
import androidx.camera.extensions.impl.ProcessResultImpl;
import androidx.camera.extensions.internal.ClientVersion;
import androidx.camera.extensions.internal.ExtensionVersion;
import androidx.camera.extensions.internal.Version;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
class PreviewProcessor {
    private static final String TAG = "PreviewProcessor";

    @NonNull
    final PreviewImageProcessorImpl mPreviewImageProcessor;

    @NonNull
    final CaptureResultImageMatcher mCaptureResultImageMatcher = new CaptureResultImageMatcher();
    final Object mLock = new Object();

    @GuardedBy
    boolean mIsClosed = false;

    /* JADX INFO: compiled from: Proguard */
    public interface OnCaptureResultCallback {
        void onCaptureResult(long j, @NonNull List<Pair<CaptureResult.Key, Object>> list);
    }

    public PreviewProcessor(@NonNull PreviewImageProcessorImpl previewImageProcessorImpl, @NonNull Surface surface, @NonNull Size size) {
        this.mPreviewImageProcessor = previewImageProcessorImpl;
        previewImageProcessorImpl.onResolutionUpdate(size);
        previewImageProcessorImpl.onOutputSurface(surface, 1);
        previewImageProcessorImpl.onImageFormatUpdate(35);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m1769a(PreviewProcessor previewProcessor, OnCaptureResultCallback onCaptureResultCallback, ImageReference imageReference, TotalCaptureResult totalCaptureResult, int i) {
        previewProcessor.lambda$start$0(onCaptureResultCallback, imageReference, totalCaptureResult, i);
    }

    private /* synthetic */ void lambda$start$0(OnCaptureResultCallback onCaptureResultCallback, ImageReference imageReference, TotalCaptureResult totalCaptureResult, int i) {
        synchronized (this.mLock) {
            try {
                if (this.mIsClosed) {
                    imageReference.mo1768a();
                    Logger.m1280a(TAG, "Ignore image in closed state");
                    return;
                }
                Version version = Version.f3225a;
                if (ClientVersion.m1747a(version) && ExtensionVersion.m1748b(version)) {
                    this.mPreviewImageProcessor.process(imageReference.get(), totalCaptureResult, new C03461(onCaptureResultCallback), CameraXExecutors.m1617c());
                } else {
                    this.mPreviewImageProcessor.process(imageReference.get(), totalCaptureResult);
                }
                imageReference.mo1768a();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void close() {
        synchronized (this.mLock) {
            this.mIsClosed = true;
            this.mCaptureResultImageMatcher.m1763b();
            CaptureResultImageMatcher captureResultImageMatcher = this.mCaptureResultImageMatcher;
            synchronized (captureResultImageMatcher.f3232a) {
                captureResultImageMatcher.f3236e = null;
            }
        }
    }

    public void notifyCaptureResult(@NonNull TotalCaptureResult totalCaptureResult) {
        this.mCaptureResultImageMatcher.m1762a(totalCaptureResult, 0);
    }

    public void notifyImage(@NonNull ImageReference imageReference) {
        this.mCaptureResultImageMatcher.m1764c(imageReference);
    }

    public void start(@NonNull OnCaptureResultCallback onCaptureResultCallback) {
        CaptureResultImageMatcher captureResultImageMatcher = this.mCaptureResultImageMatcher;
        C0348a c0348a = new C0348a(this, onCaptureResultCallback);
        synchronized (captureResultImageMatcher.f3232a) {
            captureResultImageMatcher.f3236e = c0348a;
        }
    }

    /* JADX INFO: renamed from: androidx.camera.extensions.internal.sessionprocessor.PreviewProcessor$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C03461 implements ProcessResultImpl {
        final /* synthetic */ OnCaptureResultCallback val$onResultCallback;

        public C03461(OnCaptureResultCallback onCaptureResultCallback) {
            this.val$onResultCallback = onCaptureResultCallback;
        }

        public void onCaptureCompleted(long j, @NonNull List<Pair<CaptureResult.Key, Object>> list) {
            this.val$onResultCallback.onCaptureResult(j, list);
        }

        public void onCaptureProcessProgressed(int i) {
        }
    }
}
