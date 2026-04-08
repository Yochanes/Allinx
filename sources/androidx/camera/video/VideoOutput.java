package androidx.camera.video;

import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.ConstantObservable;
import androidx.camera.core.impl.Observable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public interface VideoOutput {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    @RestrictTo
    public static final class SourceState {

        /* JADX INFO: renamed from: a */
        public static final SourceState f3371a;

        /* JADX INFO: renamed from: b */
        public static final SourceState f3372b;

        /* JADX INFO: renamed from: c */
        public static final SourceState f3373c;

        /* JADX INFO: renamed from: d */
        public static final /* synthetic */ SourceState[] f3374d;

        static {
            SourceState sourceState = new SourceState("ACTIVE_STREAMING", 0);
            f3371a = sourceState;
            SourceState sourceState2 = new SourceState("ACTIVE_NON_STREAMING", 1);
            f3372b = sourceState2;
            SourceState sourceState3 = new SourceState("INACTIVE", 2);
            f3373c = sourceState3;
            f3374d = new SourceState[]{sourceState, sourceState2, sourceState3};
        }

        public static SourceState valueOf(String str) {
            return (SourceState) Enum.valueOf(SourceState.class, str);
        }

        public static SourceState[] values() {
            return (SourceState[]) f3374d.clone();
        }
    }

    /* JADX INFO: renamed from: a */
    void mo1823a(SurfaceRequest surfaceRequest);

    /* JADX INFO: renamed from: b */
    default VideoCapabilities mo1824b(CameraInfo cameraInfo) {
        return VideoCapabilities.f3343a;
    }

    /* JADX INFO: renamed from: c */
    default Observable mo1825c() {
        return ConstantObservable.f2688b;
    }

    /* JADX INFO: renamed from: d */
    default Observable mo1826d() {
        return StreamInfo.f3339c;
    }

    /* JADX INFO: renamed from: f */
    default void mo1828f(SurfaceRequest surfaceRequest) {
        mo1823a(surfaceRequest);
    }

    /* JADX INFO: renamed from: e */
    default void mo1827e() {
    }
}
