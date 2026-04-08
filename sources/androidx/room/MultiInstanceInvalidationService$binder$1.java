package androidx.room;

import android.os.RemoteException;
import android.util.Log;
import androidx.room.IMultiInstanceInvalidationService;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"androidx/room/MultiInstanceInvalidationService$binder$1", "Landroidx/room/IMultiInstanceInvalidationService$Stub;", "room-runtime_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class MultiInstanceInvalidationService$binder$1 extends IMultiInstanceInvalidationService.Stub {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MultiInstanceInvalidationService f31931b;

    public MultiInstanceInvalidationService$binder$1(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f31931b = multiInstanceInvalidationService;
        attachInterface(this, IMultiInstanceInvalidationService.f31896i);
    }

    @Override // androidx.room.IMultiInstanceInvalidationService
    /* JADX INFO: renamed from: q */
    public final void mo11795q(String[] tables, int i) {
        Intrinsics.m18599g(tables, "tables");
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.f31931b;
        synchronized (multiInstanceInvalidationService.f31929c) {
            String str = (String) multiInstanceInvalidationService.f31928b.get(Integer.valueOf(i));
            if (str == null) {
                Log.w("ROOM", "Remote invalidation client ID not registered");
                return;
            }
            int iBeginBroadcast = multiInstanceInvalidationService.f31929c.beginBroadcast();
            for (int i2 = 0; i2 < iBeginBroadcast; i2++) {
                try {
                    Object broadcastCookie = multiInstanceInvalidationService.f31929c.getBroadcastCookie(i2);
                    Intrinsics.m18597e(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                    Integer num = (Integer) broadcastCookie;
                    int iIntValue = num.intValue();
                    String str2 = (String) multiInstanceInvalidationService.f31928b.get(num);
                    if (i != iIntValue && str.equals(str2)) {
                        try {
                            multiInstanceInvalidationService.f31929c.getBroadcastItem(i2).mo11794d(tables);
                        } catch (RemoteException e) {
                            Log.w("ROOM", "Error invoking a remote callback", e);
                        }
                    }
                } finally {
                    multiInstanceInvalidationService.f31929c.finishBroadcast();
                }
            }
        }
    }
}
