package androidx.room;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import androidx.room.IMultiInstanceInvalidationService;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"androidx/room/MultiInstanceInvalidationClient$serviceConnection$1", "Landroid/content/ServiceConnection;", "room-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class MultiInstanceInvalidationClient$serviceConnection$1 implements ServiceConnection {
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName name, IBinder service) {
        Intrinsics.m18599g(name, "name");
        Intrinsics.m18599g(service, "service");
        int i = IMultiInstanceInvalidationService.Stub.f31897a;
        IInterface iInterfaceQueryLocalInterface = service.queryLocalInterface(IMultiInstanceInvalidationService.f31896i);
        if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof IMultiInstanceInvalidationService)) {
        }
        throw null;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName name) {
        Intrinsics.m18599g(name, "name");
        throw null;
    }
}
