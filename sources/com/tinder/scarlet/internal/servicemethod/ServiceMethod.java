package com.tinder.scarlet.internal.servicemethod;

import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m18302d2 = {"Lcom/tinder/scarlet/internal/servicemethod/ServiceMethod;", "", "Companion", "Factory", "Receive", "Send", "Lcom/tinder/scarlet/internal/servicemethod/ServiceMethod$Send;", "Lcom/tinder/scarlet/internal/servicemethod/ServiceMethod$Receive;", "scarlet"}, m18303k = 1, m18304mv = {1, 4, 2})
public abstract class ServiceMethod {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/tinder/scarlet/internal/servicemethod/ServiceMethod$Companion;", "", "scarlet"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class Companion {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/tinder/scarlet/internal/servicemethod/ServiceMethod$Factory;", "", "scarlet"}, m18303k = 1, m18304mv = {1, 4, 2})
    public interface Factory {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lcom/tinder/scarlet/internal/servicemethod/ServiceMethod$Receive;", "Lcom/tinder/scarlet/internal/servicemethod/ServiceMethod;", "Factory", "scarlet"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class Receive extends ServiceMethod {

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/tinder/scarlet/internal/servicemethod/ServiceMethod$Receive$Factory;", "Lcom/tinder/scarlet/internal/servicemethod/ServiceMethod$Factory;", "scarlet"}, m18303k = 1, m18304mv = {1, 4, 2})
        public static final class Factory implements Factory {
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lcom/tinder/scarlet/internal/servicemethod/ServiceMethod$Send;", "Lcom/tinder/scarlet/internal/servicemethod/ServiceMethod;", "Factory", "scarlet"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class Send extends ServiceMethod {

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/tinder/scarlet/internal/servicemethod/ServiceMethod$Send$Factory;", "Lcom/tinder/scarlet/internal/servicemethod/ServiceMethod$Factory;", "scarlet"}, m18303k = 1, m18304mv = {1, 4, 2})
        public static final class Factory implements Factory {
        }
    }
}
