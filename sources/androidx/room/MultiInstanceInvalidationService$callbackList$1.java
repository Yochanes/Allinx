package androidx.room;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"androidx/room/MultiInstanceInvalidationService$callbackList$1", "Landroid/os/RemoteCallbackList;", "Landroidx/room/IMultiInstanceInvalidationCallback;", "room-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class MultiInstanceInvalidationService$callbackList$1 extends RemoteCallbackList<IMultiInstanceInvalidationCallback> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ MultiInstanceInvalidationService f31932a;

    public MultiInstanceInvalidationService$callbackList$1(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f31932a = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final void onCallbackDied(IInterface iInterface, Object cookie) {
        IMultiInstanceInvalidationCallback callback = (IMultiInstanceInvalidationCallback) iInterface;
        Intrinsics.m18599g(callback, "callback");
        Intrinsics.m18599g(cookie, "cookie");
        this.f31932a.f31928b.remove((Integer) cookie);
    }
}
