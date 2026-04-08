package androidx.camera.extensions.internal.sessionprocessor;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Pair;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.GuardedBy;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.Camera2CameraCaptureResult;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.ImageReaderProxys;
import androidx.camera.core.Logger;
import androidx.camera.core.SettableImageProxy;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.internal.CameraCaptureResultImageInfo;
import androidx.camera.extensions.impl.CaptureProcessorImpl;
import androidx.camera.extensions.impl.ProcessResultImpl;
import androidx.camera.extensions.internal.ClientVersion;
import androidx.camera.extensions.internal.ExtensionVersion;
import androidx.camera.extensions.internal.Version;
import androidx.camera.extensions.internal.sessionprocessor.YuvToJpegConverter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
class StillCaptureProcessor {
    private static final int MAX_IMAGES = 2;
    private static final String TAG = "StillCaptureProcessor";

    @NonNull
    final CaptureProcessorImpl mCaptureProcessorImpl;

    @NonNull
    final CaptureResultImageMatcher mCaptureResultImageMatcher;

    @NonNull
    @GuardedBy
    HashMap<Integer, Pair<ImageReference, TotalCaptureResult>> mCaptureResults;

    @GuardedBy
    boolean mIsClosed;
    final Object mLock;

    @GuardedBy
    OnCaptureResultCallback mOnCaptureResultCallback;

    @NonNull
    final ImageReaderProxy mProcessedYuvImageReader;

    @GuardedBy
    TotalCaptureResult mSourceCaptureResult;

    @NonNull
    YuvToJpegConverter mYuvToJpegConverter;

    /* JADX INFO: compiled from: Proguard */
    public interface OnCaptureResultCallback {
        void onCaptureResult(long j, @NonNull List<Pair<CaptureResult.Key, Object>> list);

        void onCompleted();

        void onError(@NonNull Exception exc);
    }

    public StillCaptureProcessor(@NonNull CaptureProcessorImpl captureProcessorImpl, @NonNull Surface surface, @NonNull Size size) {
        this.mCaptureResultImageMatcher = new CaptureResultImageMatcher();
        this.mLock = new Object();
        this.mCaptureResults = new HashMap<>();
        this.mOnCaptureResultCallback = null;
        this.mSourceCaptureResult = null;
        this.mIsClosed = false;
        this.mCaptureProcessorImpl = captureProcessorImpl;
        ImageReaderProxy imageReaderProxyM1278a = ImageReaderProxys.m1278a(size.getWidth(), size.getHeight(), 35, 2);
        this.mProcessedYuvImageReader = imageReaderProxyM1278a;
        this.mYuvToJpegConverter = new YuvToJpegConverter(surface);
        imageReaderProxyM1278a.mo1190h(new C0350c(this), CameraXExecutors.m1617c());
        captureProcessorImpl.onOutputSurface(imageReaderProxyM1278a.mo1184a(), 35);
        captureProcessorImpl.onImageFormatUpdate(35);
        captureProcessorImpl.onResolutionUpdate(size);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m1770a(StillCaptureProcessor stillCaptureProcessor, ImageReaderProxy imageReaderProxy) {
        stillCaptureProcessor.lambda$new$0(imageReaderProxy);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m1771b(StillCaptureProcessor stillCaptureProcessor, List list, OnCaptureResultCallback onCaptureResultCallback, ImageReference imageReference, TotalCaptureResult totalCaptureResult, int i) {
        stillCaptureProcessor.lambda$startCapture$1(list, onCaptureResultCallback, imageReference, totalCaptureResult, i);
    }

    private /* synthetic */ void lambda$new$0(ImageReaderProxy imageReaderProxy) {
        synchronized (this.mLock) {
            try {
                if (this.mIsClosed) {
                    Logger.m1280a(TAG, "Ignore JPEG processing in closed state");
                    return;
                }
                ImageProxy imageProxyMo1189g = imageReaderProxy.mo1189g();
                TotalCaptureResult totalCaptureResult = this.mSourceCaptureResult;
                OnCaptureResultCallback onCaptureResultCallback = null;
                if (totalCaptureResult != null) {
                    SettableImageProxy settableImageProxy = new SettableImageProxy(imageProxyMo1189g, null, new CameraCaptureResultImageInfo(new Camera2CameraCaptureResult(totalCaptureResult)));
                    this.mSourceCaptureResult = null;
                    imageProxyMo1189g = settableImageProxy;
                }
                if (imageProxyMo1189g != null) {
                    try {
                        this.mYuvToJpegConverter.m1772a(imageProxyMo1189g);
                        e = null;
                    } catch (YuvToJpegConverter.ConversionFailedException e) {
                        e = e;
                    }
                    OnCaptureResultCallback onCaptureResultCallback2 = this.mOnCaptureResultCallback;
                    if (onCaptureResultCallback2 != null) {
                        this.mOnCaptureResultCallback = null;
                        onCaptureResultCallback = onCaptureResultCallback2;
                    }
                } else {
                    e = null;
                }
                if (onCaptureResultCallback != null) {
                    if (e != null) {
                        onCaptureResultCallback.onError(e);
                    } else {
                        onCaptureResultCallback.onCompleted();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private /* synthetic */ void lambda$startCapture$1(List list, OnCaptureResultCallback onCaptureResultCallback, ImageReference imageReference, TotalCaptureResult totalCaptureResult, int i) {
        synchronized (this.mLock) {
            try {
                if (this.mIsClosed) {
                    imageReference.mo1768a();
                    Logger.m1280a(TAG, "Ignore image in closed state");
                    return;
                }
                Logger.m1280a(TAG, "onImageReferenceIncoming  captureStageId=" + i);
                this.mCaptureResults.put(Integer.valueOf(i), new Pair<>(imageReference, totalCaptureResult));
                Logger.m1280a(TAG, "mCaptureResult has capture stage Id: " + this.mCaptureResults.keySet());
                Exception exc = null;
                if (this.mCaptureResults.keySet().containsAll(list)) {
                    HashMap map = new HashMap();
                    for (Integer num : this.mCaptureResults.keySet()) {
                        Pair<ImageReference, TotalCaptureResult> pair = this.mCaptureResults.get(num);
                        map.put(num, new Pair(((ImageReference) pair.first).get(), (TotalCaptureResult) pair.second));
                    }
                    Logger.m1280a(TAG, "CaptureProcessorImpl.process()");
                    try {
                        Version version = Version.f3225a;
                        if (ExtensionVersion.m1748b(version) && ClientVersion.m1747a(version)) {
                            this.mCaptureProcessorImpl.process(map, new C03471(onCaptureResultCallback), CameraXExecutors.m1617c());
                        } else {
                            this.mCaptureProcessorImpl.process(map);
                        }
                    } catch (Exception e) {
                        this.mOnCaptureResultCallback = null;
                        exc = e;
                    }
                    clearCaptureResults();
                }
                if (exc == null || onCaptureResultCallback == null) {
                    return;
                }
                onCaptureResultCallback.onError(exc);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void clearCaptureResults() {
        synchronized (this.mLock) {
            try {
                Iterator<Pair<ImageReference, TotalCaptureResult>> it = this.mCaptureResults.values().iterator();
                while (it.hasNext()) {
                    ((ImageReference) it.next().first).mo1768a();
                }
                this.mCaptureResults.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void close() {
        Logger.m1280a(TAG, "Close the processor");
        synchronized (this.mLock) {
            this.mIsClosed = true;
            clearCaptureResults();
            this.mProcessedYuvImageReader.mo1187e();
            CaptureResultImageMatcher captureResultImageMatcher = this.mCaptureResultImageMatcher;
            synchronized (captureResultImageMatcher.f3232a) {
                captureResultImageMatcher.f3236e = null;
            }
            this.mCaptureResultImageMatcher.m1763b();
            this.mProcessedYuvImageReader.close();
        }
    }

    public void notifyCaptureResult(@NonNull TotalCaptureResult totalCaptureResult, int i) {
        this.mCaptureResultImageMatcher.m1762a(totalCaptureResult, i);
        synchronized (this.mLock) {
            try {
                if (this.mSourceCaptureResult == null) {
                    this.mSourceCaptureResult = totalCaptureResult;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void notifyImage(@NonNull ImageReference imageReference) {
        this.mCaptureResultImageMatcher.m1764c(imageReference);
    }

    public void setJpegQuality(@IntRange int i) {
        this.mYuvToJpegConverter.f3239b = i;
    }

    public void setRotationDegrees(int i) {
        this.mYuvToJpegConverter.f3240c = i;
    }

    public void startCapture(@NonNull List<Integer> list, @NonNull OnCaptureResultCallback onCaptureResultCallback) {
        Logger.m1280a(TAG, "Start the processor");
        synchronized (this.mLock) {
            this.mOnCaptureResultCallback = onCaptureResultCallback;
            clearCaptureResults();
        }
        this.mCaptureResultImageMatcher.m1763b();
        CaptureResultImageMatcher captureResultImageMatcher = this.mCaptureResultImageMatcher;
        C0349b c0349b = new C0349b(this, list, onCaptureResultCallback);
        synchronized (captureResultImageMatcher.f3232a) {
            captureResultImageMatcher.f3236e = c0349b;
        }
    }

    public StillCaptureProcessor(@NonNull CaptureProcessorImpl captureProcessorImpl, @NonNull Surface surface, @NonNull Size size, @NonNull YuvToJpegConverter yuvToJpegConverter) {
        this(captureProcessorImpl, surface, size);
        this.mYuvToJpegConverter = yuvToJpegConverter;
    }

    /* JADX INFO: renamed from: androidx.camera.extensions.internal.sessionprocessor.StillCaptureProcessor$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C03471 implements ProcessResultImpl {
        final /* synthetic */ OnCaptureResultCallback val$onCaptureResultCallback;

        public C03471(OnCaptureResultCallback onCaptureResultCallback) {
            this.val$onCaptureResultCallback = onCaptureResultCallback;
        }

        public void onCaptureCompleted(long j, @NonNull List<Pair<CaptureResult.Key, Object>> list) {
            this.val$onCaptureResultCallback.onCaptureResult(j, list);
        }

        public void onCaptureProcessProgressed(int i) {
        }
    }
}
