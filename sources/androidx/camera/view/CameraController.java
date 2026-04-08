package androidx.camera.view;

import android.content.Context;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.camera.core.CameraControl;
import androidx.camera.core.FocusMeteringResult;
import androidx.camera.core.Logger;
import androidx.camera.core.Preview;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.video.VideoRecordEvent;
import androidx.core.util.Consumer;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public abstract class CameraController {

    /* JADX INFO: renamed from: a */
    public Preview.SurfaceProvider f3497a;

    /* JADX INFO: renamed from: androidx.camera.view.CameraController$1 */
    /* JADX INFO: compiled from: Proguard */
    class C03971 implements Consumer<VideoRecordEvent> {
        @Override // androidx.core.util.Consumer
        public final void accept(Object obj) {
            if (!(((VideoRecordEvent) obj) instanceof VideoRecordEvent.Finalize) || !Threads.m1608b()) {
                throw null;
            }
            throw null;
        }
    }

    /* JADX INFO: renamed from: androidx.camera.view.CameraController$2 */
    /* JADX INFO: compiled from: Proguard */
    class C03982 implements FutureCallback<FocusMeteringResult> {
        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public final void onFailure(Throwable th) {
            if (th instanceof CameraControl.OperationCanceledException) {
                Logger.m1280a("CameraController", "Tap-to-focus is canceled by new action.");
            } else {
                Logger.m1281b("CameraController", "Tap to focus failed.", th);
                throw null;
            }
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public final void onSuccess(Object obj) {
            FocusMeteringResult focusMeteringResult = (FocusMeteringResult) obj;
            if (focusMeteringResult == null) {
                return;
            }
            Logger.m1280a("CameraController", "Tap to focus onSuccess: " + focusMeteringResult.f2263a);
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api30Impl {
        @NonNull
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static Context m1926a(@NonNull Context context, @Nullable String str) {
            return context.createAttributionContext(str);
        }

        @Nullable
        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static String m1927b(@NonNull Context context) {
            return context.getAttributionTag();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static final class OutputSize {

        /* JADX INFO: compiled from: Proguard */
        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo
        public @interface OutputAspectRatio {
        }

        public final String toString() {
            return "aspect ratio: 0 resolution: null";
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface UseCases {
    }
}
