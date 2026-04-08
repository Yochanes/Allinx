package com.google.firebase.heartbeatinfo;

import com.google.firebase.components.Component;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public class HeartBeatConsumerComponent {

    /* JADX INFO: renamed from: com.google.firebase.heartbeatinfo.HeartBeatConsumerComponent$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C47141 implements HeartBeatConsumer {
    }

    private HeartBeatConsumerComponent() {
    }

    public static Component<?> create() {
        return Component.intoSet(new C47141(), (Class<C47141>) HeartBeatConsumer.class);
    }
}
