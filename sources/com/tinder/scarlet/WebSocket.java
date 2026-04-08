package com.tinder.scarlet;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m18302d2 = {"Lcom/tinder/scarlet/WebSocket;", "", "Event", "Factory", "scarlet-core"}, m18303k = 1, m18304mv = {1, 4, 2})
public interface WebSocket {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, m18302d2 = {"Lcom/tinder/scarlet/WebSocket$Event;", "", "OnConnectionClosed", "OnConnectionClosing", "OnConnectionFailed", "OnConnectionOpened", "OnMessageReceived", "Lcom/tinder/scarlet/WebSocket$Event$OnConnectionOpened;", "Lcom/tinder/scarlet/WebSocket$Event$OnMessageReceived;", "Lcom/tinder/scarlet/WebSocket$Event$OnConnectionClosing;", "Lcom/tinder/scarlet/WebSocket$Event$OnConnectionClosed;", "Lcom/tinder/scarlet/WebSocket$Event$OnConnectionFailed;", "scarlet-core"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static abstract class Event {

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/tinder/scarlet/WebSocket$Event$OnConnectionClosed;", "Lcom/tinder/scarlet/WebSocket$Event;", "scarlet-core"}, m18303k = 1, m18304mv = {1, 4, 2})
        public static final /* data */ class OnConnectionClosed extends Event {

            /* JADX INFO: renamed from: a */
            public final ShutdownReason f43457a;

            public OnConnectionClosed(ShutdownReason shutdownReason) {
                this.f43457a = shutdownReason;
            }

            public final boolean equals(Object obj) {
                if (this != obj) {
                    return (obj instanceof OnConnectionClosed) && Intrinsics.m18594b(this.f43457a, ((OnConnectionClosed) obj).f43457a);
                }
                return true;
            }

            public final int hashCode() {
                ShutdownReason shutdownReason = this.f43457a;
                if (shutdownReason != null) {
                    return shutdownReason.hashCode();
                }
                return 0;
            }

            public final String toString() {
                return "OnConnectionClosed(shutdownReason=" + this.f43457a + ")";
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/tinder/scarlet/WebSocket$Event$OnConnectionClosing;", "Lcom/tinder/scarlet/WebSocket$Event;", "scarlet-core"}, m18303k = 1, m18304mv = {1, 4, 2})
        public static final /* data */ class OnConnectionClosing extends Event {

            /* JADX INFO: renamed from: a */
            public final ShutdownReason f43458a;

            public OnConnectionClosing(ShutdownReason shutdownReason) {
                this.f43458a = shutdownReason;
            }

            public final boolean equals(Object obj) {
                if (this != obj) {
                    return (obj instanceof OnConnectionClosing) && Intrinsics.m18594b(this.f43458a, ((OnConnectionClosing) obj).f43458a);
                }
                return true;
            }

            public final int hashCode() {
                ShutdownReason shutdownReason = this.f43458a;
                if (shutdownReason != null) {
                    return shutdownReason.hashCode();
                }
                return 0;
            }

            public final String toString() {
                return "OnConnectionClosing(shutdownReason=" + this.f43458a + ")";
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/tinder/scarlet/WebSocket$Event$OnConnectionFailed;", "Lcom/tinder/scarlet/WebSocket$Event;", "scarlet-core"}, m18303k = 1, m18304mv = {1, 4, 2})
        public static final /* data */ class OnConnectionFailed extends Event {

            /* JADX INFO: renamed from: a */
            public final Exception f43459a;

            public OnConnectionFailed(Exception exc) {
                this.f43459a = exc;
            }

            public final boolean equals(Object obj) {
                if (this != obj) {
                    return (obj instanceof OnConnectionFailed) && this.f43459a.equals(((OnConnectionFailed) obj).f43459a);
                }
                return true;
            }

            public final int hashCode() {
                return this.f43459a.hashCode();
            }

            public final String toString() {
                return "OnConnectionFailed(throwable=" + this.f43459a + ")";
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\u00020\u0003¨\u0006\u0004"}, m18302d2 = {"Lcom/tinder/scarlet/WebSocket$Event$OnConnectionOpened;", "", "WEB_SOCKET", "Lcom/tinder/scarlet/WebSocket$Event;", "scarlet-core"}, m18303k = 1, m18304mv = {1, 4, 2})
        public static final /* data */ class OnConnectionOpened<WEB_SOCKET> extends Event {

            /* JADX INFO: renamed from: a */
            public final okhttp3.WebSocket f43460a;

            public OnConnectionOpened(okhttp3.WebSocket webSocket) {
                this.f43460a = webSocket;
            }

            public final boolean equals(Object obj) {
                if (this != obj) {
                    return (obj instanceof OnConnectionOpened) && this.f43460a.equals(((OnConnectionOpened) obj).f43460a);
                }
                return true;
            }

            public final int hashCode() {
                return this.f43460a.hashCode();
            }

            public final String toString() {
                return "OnConnectionOpened(webSocket=" + this.f43460a + ")";
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/tinder/scarlet/WebSocket$Event$OnMessageReceived;", "Lcom/tinder/scarlet/WebSocket$Event;", "scarlet-core"}, m18303k = 1, m18304mv = {1, 4, 2})
        public static final /* data */ class OnMessageReceived extends Event {

            /* JADX INFO: renamed from: a */
            public final Message f43461a;

            public OnMessageReceived(Message message) {
                this.f43461a = message;
            }

            public final boolean equals(Object obj) {
                if (this != obj) {
                    return (obj instanceof OnMessageReceived) && Intrinsics.m18594b(this.f43461a, ((OnMessageReceived) obj).f43461a);
                }
                return true;
            }

            public final int hashCode() {
                Message message = this.f43461a;
                if (message != null) {
                    return message.hashCode();
                }
                return 0;
            }

            public final String toString() {
                return "OnMessageReceived(message=" + this.f43461a + ")";
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/tinder/scarlet/WebSocket$Factory;", "", "scarlet-core"}, m18303k = 1, m18304mv = {1, 4, 2})
    public interface Factory {
    }
}
