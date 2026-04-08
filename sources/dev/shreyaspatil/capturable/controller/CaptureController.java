package dev.shreyaspatil.capturable.controller;

import android.graphics.Bitmap;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Ldev/shreyaspatil/capturable/controller/CaptureController;", "", "CaptureRequest", "capturable_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class CaptureController {

    /* JADX INFO: renamed from: a */
    public final SharedFlowImpl f43534a;

    /* JADX INFO: renamed from: b */
    public final SharedFlow f43535b;

    /* JADX INFO: compiled from: Proguard */
    @StabilityInferred
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Ldev/shreyaspatil/capturable/controller/CaptureController$CaptureRequest;", "", "capturable_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class CaptureRequest {

        /* JADX INFO: renamed from: a */
        public final CompletableDeferred f43536a;

        /* JADX INFO: renamed from: b */
        public final Bitmap.Config f43537b;

        public CaptureRequest(CompletableDeferred completableDeferred, Bitmap.Config config) {
            this.f43536a = completableDeferred;
            this.f43537b = config;
        }
    }

    public CaptureController() {
        SharedFlowImpl sharedFlowImplM20794b = SharedFlowKt.m20794b(1, 5, null);
        this.f43534a = sharedFlowImplM20794b;
        this.f43535b = FlowKt.m20741a(sharedFlowImplM20794b);
    }

    /* JADX INFO: renamed from: a */
    public static Deferred m15446a(CaptureController captureController) {
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        captureController.getClass();
        Intrinsics.m18599g(config, "config");
        CompletableDeferred completableDeferredM20548a = CompletableDeferredKt.m20548a();
        captureController.f43534a.mo20773g(new CaptureRequest(completableDeferredM20548a, config));
        return completableDeferredM20548a;
    }
}
