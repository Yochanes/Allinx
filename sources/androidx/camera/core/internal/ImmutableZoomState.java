package androidx.camera.core.internal;

import androidx.annotation.RequiresApi;
import androidx.camera.core.ZoomState;
import com.google.auto.value.AutoValue;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@AutoValue
@RequiresApi
public abstract class ImmutableZoomState implements ZoomState {
    /* JADX INFO: renamed from: e */
    public static ZoomState m1649e() {
        return new AutoValue_ImmutableZoomState(1.0f, 1.0f, 1.0f, 0.0f);
    }

    /* JADX INFO: renamed from: f */
    public static ZoomState m1650f(ZoomState zoomState) {
        return new AutoValue_ImmutableZoomState(zoomState.mo1074c(), zoomState.mo1072a(), zoomState.mo1073b(), zoomState.mo1075d());
    }
}
