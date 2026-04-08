package androidx.camera.core.imagecapture;

import androidx.annotation.RequiresApi;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
class RequestWithCallback implements TakePictureCallback {

    /* JADX INFO: renamed from: a */
    public final TakePictureRequest f2494a;

    /* JADX INFO: renamed from: b */
    public final TakePictureManager f2495b;

    /* JADX INFO: renamed from: e */
    public CallbackToFutureAdapter.Completer f2498e;

    /* JADX INFO: renamed from: f */
    public CallbackToFutureAdapter.Completer f2499f;

    /* JADX INFO: renamed from: h */
    public ListenableFuture f2501h;

    /* JADX INFO: renamed from: g */
    public boolean f2500g = false;

    /* JADX INFO: renamed from: c */
    public final ListenableFuture f2496c = CallbackToFutureAdapter.m6740a(new C0265e(this, 0));

    /* JADX INFO: renamed from: d */
    public final ListenableFuture f2497d = CallbackToFutureAdapter.m6740a(new C0265e(this, 1));

    public RequestWithCallback(TakePictureRequest takePictureRequest, TakePictureManager takePictureManager) {
        this.f2494a = takePictureRequest;
        this.f2495b = takePictureManager;
    }

    /* JADX INFO: renamed from: a */
    public final void m1366a() {
        Preconditions.m7699f(!this.f2497d.isDone(), "The callback can only complete once.");
        this.f2499f.m6742b(null);
    }
}
