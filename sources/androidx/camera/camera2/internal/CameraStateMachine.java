package androidx.camera.camera2.internal;

import androidx.annotation.RequiresApi;
import androidx.camera.core.CameraState;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.CameraStateRegistry;
import androidx.lifecycle.MutableLiveData;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
class CameraStateMachine {

    /* JADX INFO: renamed from: a */
    public final CameraStateRegistry f1718a;

    /* JADX INFO: renamed from: b */
    public final MutableLiveData f1719b;

    /* JADX INFO: renamed from: androidx.camera.camera2.internal.CameraStateMachine$1 */
    /* JADX INFO: compiled from: Proguard */
    public static /* synthetic */ class C01641 {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f1720a;

        static {
            int[] iArr = new int[CameraInternal.State.values().length];
            f1720a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1720a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1720a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1720a[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1720a[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1720a[6] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1720a[5] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1720a[7] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public CameraStateMachine(CameraStateRegistry cameraStateRegistry) {
        this.f1718a = cameraStateRegistry;
        MutableLiveData mutableLiveData = new MutableLiveData();
        this.f1719b = mutableLiveData;
        mutableLiveData.m9145i(CameraState.m1222a(CameraState.Type.f2214f));
    }
}
