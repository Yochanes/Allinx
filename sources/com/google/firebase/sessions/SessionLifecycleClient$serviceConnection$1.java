package com.google.firebase.sessions;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Messenger;
import android.util.Log;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18301d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\t"}, m18302d2 = {"com/google/firebase/sessions/SessionLifecycleClient$serviceConnection$1", "Landroid/content/ServiceConnection;", "onServiceConnected", "", "className", "Landroid/content/ComponentName;", "serviceBinder", "Landroid/os/IBinder;", "onServiceDisconnected", "com.google.firebase-firebase-sessions"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class SessionLifecycleClient$serviceConnection$1 implements ServiceConnection {
    final /* synthetic */ SessionLifecycleClient this$0;

    public SessionLifecycleClient$serviceConnection$1(SessionLifecycleClient sessionLifecycleClient) {
        this.this$0 = sessionLifecycleClient;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(@Nullable ComponentName className, @Nullable IBinder serviceBinder) {
        Log.d(SessionLifecycleClient.TAG, "Connected to SessionLifecycleService. Queue size " + SessionLifecycleClient.access$getQueuedMessages$p(this.this$0).size());
        SessionLifecycleClient.access$setService$p(this.this$0, new Messenger(serviceBinder));
        SessionLifecycleClient.access$setServiceBound$p(this.this$0, true);
        SessionLifecycleClient sessionLifecycleClient = this.this$0;
        SessionLifecycleClient.access$sendLifecycleEvents(sessionLifecycleClient, SessionLifecycleClient.access$drainQueue(sessionLifecycleClient));
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(@Nullable ComponentName className) {
        Log.d(SessionLifecycleClient.TAG, "Disconnected from SessionLifecycleService");
        SessionLifecycleClient.access$setService$p(this.this$0, null);
        SessionLifecycleClient.access$setServiceBound$p(this.this$0, false);
    }
}
