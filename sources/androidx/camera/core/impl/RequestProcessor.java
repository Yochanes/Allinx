package androidx.camera.core.impl;

import androidx.annotation.RequiresApi;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public interface RequestProcessor {

    /* JADX INFO: compiled from: Proguard */
    public interface Request {
        Config getParameters();

        List getTargetOutputConfigIds();

        int getTemplateId();
    }

    /* JADX INFO: renamed from: a */
    void mo978a();

    /* JADX INFO: renamed from: b */
    int mo979b(Request request, Callback callback);

    /* JADX INFO: renamed from: c */
    void mo980c();

    /* JADX INFO: renamed from: d */
    int mo981d(List list, Callback callback);

    /* JADX INFO: renamed from: e */
    int mo982e(Request request, Callback callback);

    /* JADX INFO: compiled from: Proguard */
    public interface Callback {
        default void onCaptureSequenceAborted(int i) {
        }

        default void onCaptureCompleted(Request request, CameraCaptureResult cameraCaptureResult) {
        }

        default void onCaptureFailed(Request request, CameraCaptureFailure cameraCaptureFailure) {
        }

        default void onCaptureProgressed(Request request, CameraCaptureResult cameraCaptureResult) {
        }

        default void onCaptureSequenceCompleted(int i, long j) {
        }

        default void onCaptureBufferLost(Request request, long j, int i) {
        }

        default void onCaptureStarted(Request request, long j, long j2) {
        }
    }
}
