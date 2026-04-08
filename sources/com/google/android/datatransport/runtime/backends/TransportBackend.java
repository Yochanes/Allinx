package com.google.android.datatransport.runtime.backends;

import com.google.android.datatransport.runtime.EventInternal;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public interface TransportBackend {
    EventInternal decorate(EventInternal eventInternal);

    BackendResponse send(BackendRequest backendRequest);
}
