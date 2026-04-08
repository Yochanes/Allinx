package com.livechatinc.inappchat;

import android.content.Intent;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public interface ChatWindowView {
    /* JADX INFO: renamed from: a */
    boolean mo15402a(int i, int i2, Intent intent);

    /* JADX INFO: renamed from: b */
    void mo15403b();

    /* JADX INFO: renamed from: c */
    boolean mo15404c(ChatWindowConfiguration chatWindowConfiguration);

    void initialize();

    void setEventsListener(ChatWindowEventsListener chatWindowEventsListener);
}
