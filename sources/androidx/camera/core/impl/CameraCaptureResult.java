package androidx.camera.core.impl;

import android.hardware.camera2.CaptureResult;
import androidx.annotation.RequiresApi;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CameraCaptureMetaData;
import androidx.camera.core.impl.utils.ExifData;
import java.util.ArrayList;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public interface CameraCaptureResult {

    /* JADX INFO: compiled from: Proguard */
    public static final class EmptyCameraCaptureResult implements CameraCaptureResult {
        @Override // androidx.camera.core.impl.CameraCaptureResult
        /* JADX INFO: renamed from: a */
        public final TagBundle mo864a() {
            return TagBundle.f2798b;
        }

        @Override // androidx.camera.core.impl.CameraCaptureResult
        /* JADX INFO: renamed from: c */
        public final long mo866c() {
            return -1L;
        }

        @Override // androidx.camera.core.impl.CameraCaptureResult
        /* JADX INFO: renamed from: d */
        public final CameraCaptureMetaData.AwbState mo867d() {
            return CameraCaptureMetaData.AwbState.f2623a;
        }

        @Override // androidx.camera.core.impl.CameraCaptureResult
        /* JADX INFO: renamed from: e */
        public final CameraCaptureMetaData.FlashState mo868e() {
            return CameraCaptureMetaData.FlashState.f2629a;
        }

        @Override // androidx.camera.core.impl.CameraCaptureResult
        /* JADX INFO: renamed from: f */
        public final CameraCaptureMetaData.AeState mo869f() {
            return CameraCaptureMetaData.AeState.f2603a;
        }

        @Override // androidx.camera.core.impl.CameraCaptureResult
        /* JADX INFO: renamed from: h */
        public final CameraCaptureMetaData.AfState mo871h() {
            return CameraCaptureMetaData.AfState.f2615a;
        }
    }

    /* JADX INFO: renamed from: a */
    TagBundle mo864a();

    /* JADX INFO: renamed from: b */
    default void mo865b(ExifData.Builder builder) {
        int i;
        CameraCaptureMetaData.FlashState flashStateMo868e = mo868e();
        if (flashStateMo868e == CameraCaptureMetaData.FlashState.f2629a) {
            return;
        }
        int iOrdinal = flashStateMo868e.ordinal();
        if (iOrdinal == 1) {
            i = 32;
        } else if (iOrdinal == 2) {
            i = 0;
        } else {
            if (iOrdinal != 3) {
                Logger.m1288i("ExifData", "Unknown flash state: " + flashStateMo868e);
                return;
            }
            i = 1;
        }
        int i2 = i & 1;
        ArrayList arrayList = builder.f2874a;
        if (i2 == 1) {
            builder.m1601c("LightSource", String.valueOf(4), arrayList);
        }
        builder.m1601c("Flash", String.valueOf(i), arrayList);
    }

    /* JADX INFO: renamed from: c */
    long mo866c();

    /* JADX INFO: renamed from: d */
    CameraCaptureMetaData.AwbState mo867d();

    /* JADX INFO: renamed from: e */
    CameraCaptureMetaData.FlashState mo868e();

    /* JADX INFO: renamed from: f */
    CameraCaptureMetaData.AeState mo869f();

    /* JADX INFO: renamed from: g */
    default CaptureResult mo870g() {
        return new EmptyCameraCaptureResult().mo870g();
    }

    /* JADX INFO: renamed from: h */
    CameraCaptureMetaData.AfState mo871h();
}
