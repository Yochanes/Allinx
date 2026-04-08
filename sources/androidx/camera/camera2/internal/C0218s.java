package androidx.camera.camera2.internal;

import androidx.arch.core.util.Function;
import androidx.camera.camera2.internal.Camera2CapturePipeline;
import java.util.List;

/* JADX INFO: renamed from: androidx.camera.camera2.internal.s */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0218s implements Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2143a;

    public /* synthetic */ C0218s(int i) {
        this.f2143a = i;
    }

    @Override // androidx.arch.core.util.Function
    public final Object apply(Object obj) {
        switch (this.f2143a) {
            case 0:
                int i = Camera2CapturePipeline.TorchTask.f1693f;
                return Boolean.FALSE;
            case 1:
                return Boolean.TRUE;
            default:
                return Boolean.valueOf(((List) obj).contains(Boolean.TRUE));
        }
    }
}
