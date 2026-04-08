package androidx.media3.common.util;

import android.os.Handler;
import android.os.Message;
import androidx.media3.common.FlagSet;
import androidx.media3.common.util.ListenerSet;

/* JADX INFO: renamed from: androidx.media3.common.util.b */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1749b implements Handler.Callback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ListenerSet f25679a;

    public /* synthetic */ C1749b(ListenerSet listenerSet) {
        this.f25679a = listenerSet;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        ListenerSet listenerSet = this.f25679a;
        for (ListenerSet.ListenerHolder listenerHolder : listenerSet.f25607d) {
            if (!listenerHolder.f25616d && listenerHolder.f25615c) {
                FlagSet flagSetM9246b = listenerHolder.f25614b.m9246b();
                listenerHolder.f25614b = new FlagSet.Builder();
                listenerHolder.f25615c = false;
                listenerSet.f25606c.mo41e(listenerHolder.f25613a, flagSetM9246b);
            }
            if (listenerSet.f25605b.mo9485a()) {
                return true;
            }
        }
        return true;
    }
}
