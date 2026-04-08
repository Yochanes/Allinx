package io.intercom.android.nexus;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public interface NexusListener {
    void notifyEvent(@NonNull NexusEvent nexusEvent);

    void onConnect();

    void onConnectFailed();

    void onShutdown();
}
