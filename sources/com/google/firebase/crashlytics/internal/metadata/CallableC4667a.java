package com.google.firebase.crashlytics.internal.metadata;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.metadata.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class CallableC4667a implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42799a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f42800b;

    public /* synthetic */ CallableC4667a(Object obj, int i) {
        this.f42799a = i;
        this.f42800b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f42799a) {
            case 0:
                return UserMetadata.SerializeableKeysMap.m15186a((UserMetadata.SerializeableKeysMap) this.f42800b);
            default:
                return UserMetadata.m15185b((UserMetadata) this.f42800b);
        }
    }
}
