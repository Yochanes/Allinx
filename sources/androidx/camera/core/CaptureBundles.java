package androidx.camera.core;

import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.camera.core.impl.CaptureBundle;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.CaptureStage;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
@RestrictTo
public final class CaptureBundles {

    /* JADX INFO: compiled from: Proguard */
    public static final class CaptureBundleImpl implements CaptureBundle {

        /* JADX INFO: renamed from: a */
        public final List f2245a;

        public CaptureBundleImpl(List list) {
            if (list == null || list.isEmpty()) {
                throw new IllegalArgumentException("Cannot set an empty CaptureStage list.");
            }
            this.f2245a = Collections.unmodifiableList(new ArrayList(list));
        }

        @Override // androidx.camera.core.impl.CaptureBundle
        /* JADX INFO: renamed from: a */
        public final List mo1228a() {
            return this.f2245a;
        }
    }

    /* JADX INFO: renamed from: a */
    public static CaptureBundle m1227a() {
        CaptureStage.DefaultCaptureStage defaultCaptureStage = new CaptureStage.DefaultCaptureStage();
        new CaptureConfig.Builder().m1461e();
        return new CaptureBundleImpl(Arrays.asList(defaultCaptureStage));
    }
}
