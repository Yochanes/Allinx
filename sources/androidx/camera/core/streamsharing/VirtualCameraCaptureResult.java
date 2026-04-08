package androidx.camera.core.streamsharing;

import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.CameraCaptureMetaData;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.TagBundle;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public class VirtualCameraCaptureResult implements CameraCaptureResult {

    /* JADX INFO: renamed from: a */
    public final CameraCaptureResult f3204a;

    /* JADX INFO: renamed from: b */
    public final TagBundle f3205b;

    /* JADX INFO: renamed from: c */
    public final long f3206c;

    public VirtualCameraCaptureResult(CameraCaptureResult cameraCaptureResult, TagBundle tagBundle, long j) {
        this.f3204a = cameraCaptureResult;
        this.f3205b = tagBundle;
        this.f3206c = j;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    /* JADX INFO: renamed from: a */
    public final TagBundle mo864a() {
        return this.f3205b;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    /* JADX INFO: renamed from: c */
    public final long mo866c() {
        CameraCaptureResult cameraCaptureResult = this.f3204a;
        if (cameraCaptureResult != null) {
            return cameraCaptureResult.mo866c();
        }
        long j = this.f3206c;
        if (j != -1) {
            return j;
        }
        throw new IllegalStateException("No timestamp is available.");
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    /* JADX INFO: renamed from: d */
    public final CameraCaptureMetaData.AwbState mo867d() {
        CameraCaptureResult cameraCaptureResult = this.f3204a;
        return cameraCaptureResult != null ? cameraCaptureResult.mo867d() : CameraCaptureMetaData.AwbState.f2623a;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    /* JADX INFO: renamed from: e */
    public final CameraCaptureMetaData.FlashState mo868e() {
        CameraCaptureResult cameraCaptureResult = this.f3204a;
        return cameraCaptureResult != null ? cameraCaptureResult.mo868e() : CameraCaptureMetaData.FlashState.f2629a;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    /* JADX INFO: renamed from: f */
    public final CameraCaptureMetaData.AeState mo869f() {
        CameraCaptureResult cameraCaptureResult = this.f3204a;
        return cameraCaptureResult != null ? cameraCaptureResult.mo869f() : CameraCaptureMetaData.AeState.f2603a;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    /* JADX INFO: renamed from: h */
    public final CameraCaptureMetaData.AfState mo871h() {
        CameraCaptureResult cameraCaptureResult = this.f3204a;
        return cameraCaptureResult != null ? cameraCaptureResult.mo871h() : CameraCaptureMetaData.AfState.f2615a;
    }
}
