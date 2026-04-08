package androidx.camera.core.imagecapture;

import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.futures.FutureCallback;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
class SingleBundlingNode implements BundlingNode {

    /* JADX INFO: renamed from: a */
    public ProcessingRequest f2511a;

    /* JADX INFO: renamed from: b */
    public AutoValue_ProcessingNode_In f2512b;

    /* JADX INFO: renamed from: androidx.camera.core.imagecapture.SingleBundlingNode$1 */
    /* JADX INFO: compiled from: Proguard */
    class C02591 implements FutureCallback<Void> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ProcessingRequest f2513a;

        public C02591(ProcessingRequest processingRequest) {
            this.f2513a = processingRequest;
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public final void onFailure(Throwable th) {
            Threads.m1607a();
            SingleBundlingNode singleBundlingNode = SingleBundlingNode.this;
            if (this.f2513a == singleBundlingNode.f2511a) {
                singleBundlingNode.f2511a = null;
            }
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        }
    }
}
