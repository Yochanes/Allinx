package com.tinder.scarlet.internal.utils;

import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, m18302d2 = {"Lcom/tinder/scarlet/internal/utils/RuntimePlatform;", "", "Companion", "Default", "Java8", "Lcom/tinder/scarlet/internal/utils/RuntimePlatform$Default;", "Lcom/tinder/scarlet/internal/utils/RuntimePlatform$Java8;", "scarlet"}, m18303k = 1, m18304mv = {1, 4, 2})
public abstract class RuntimePlatform {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m18302d2 = {"Lcom/tinder/scarlet/internal/utils/RuntimePlatform$Companion;", "", "Lcom/tinder/scarlet/internal/utils/RuntimePlatform;", "PLATFORM", "Lcom/tinder/scarlet/internal/utils/RuntimePlatform;", "scarlet"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class Companion {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/tinder/scarlet/internal/utils/RuntimePlatform$Default;", "Lcom/tinder/scarlet/internal/utils/RuntimePlatform;", "scarlet"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class Default extends RuntimePlatform {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/tinder/scarlet/internal/utils/RuntimePlatform$Java8;", "Lcom/tinder/scarlet/internal/utils/RuntimePlatform;", "scarlet"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class Java8 extends RuntimePlatform {
    }

    static {
        try {
            Class.forName("java.util.Optional");
        } catch (ClassNotFoundException unused) {
        }
    }
}
