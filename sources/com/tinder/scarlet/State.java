package com.tinder.scarlet;

import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, m18302d2 = {"Lcom/tinder/scarlet/State;", "", "Connected", "Connecting", "Destroyed", "Disconnected", "Disconnecting", "WaitingToRetry", "Lcom/tinder/scarlet/State$WaitingToRetry;", "Lcom/tinder/scarlet/State$Connecting;", "Lcom/tinder/scarlet/State$Connected;", "Lcom/tinder/scarlet/State$Disconnecting;", "Lcom/tinder/scarlet/State$Disconnected;", "Lcom/tinder/scarlet/State$Destroyed;", "scarlet"}, m18303k = 1, m18304mv = {1, 4, 2})
public abstract class State {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/tinder/scarlet/State$Connected;", "Lcom/tinder/scarlet/State;", "scarlet"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final /* data */ class Connected extends State {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Connected)) {
                return false;
            }
            throw null;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/tinder/scarlet/State$Connecting;", "Lcom/tinder/scarlet/State;", "scarlet"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final /* data */ class Connecting extends State {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Connecting)) {
                return false;
            }
            throw null;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/tinder/scarlet/State$Destroyed;", "Lcom/tinder/scarlet/State;", "scarlet"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class Destroyed extends State {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/tinder/scarlet/State$Disconnected;", "Lcom/tinder/scarlet/State;", "scarlet"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class Disconnected extends State {

        /* JADX INFO: renamed from: a */
        public static final Disconnected f43456a = new Disconnected();
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/tinder/scarlet/State$Disconnecting;", "Lcom/tinder/scarlet/State;", "scarlet"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class Disconnecting extends State {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/tinder/scarlet/State$WaitingToRetry;", "Lcom/tinder/scarlet/State;", "scarlet"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final /* data */ class WaitingToRetry extends State {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WaitingToRetry)) {
                return false;
            }
            throw null;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            throw null;
        }
    }
}
