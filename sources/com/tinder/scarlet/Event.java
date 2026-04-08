package com.tinder.scarlet;

import com.tinder.scarlet.Lifecycle;
import com.tinder.scarlet.WebSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, m18302d2 = {"Lcom/tinder/scarlet/Event;", "", "OnLifecycle", "OnRetry", "OnStateChange", "OnWebSocket", "Lcom/tinder/scarlet/Event$OnLifecycle;", "Lcom/tinder/scarlet/Event$OnWebSocket;", "Lcom/tinder/scarlet/Event$OnStateChange;", "Lcom/tinder/scarlet/Event$OnRetry;", "scarlet"}, m18303k = 1, m18304mv = {1, 4, 2})
public abstract class Event {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m18302d2 = {"Lcom/tinder/scarlet/Event$OnLifecycle;", "Lcom/tinder/scarlet/Event;", "StateChange", "Terminate", "Lcom/tinder/scarlet/Event$OnLifecycle$StateChange;", "Lcom/tinder/scarlet/Event$OnLifecycle$Terminate;", "scarlet"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static abstract class OnLifecycle extends Event {

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\u00020\u0003¨\u0006\u0004"}, m18302d2 = {"Lcom/tinder/scarlet/Event$OnLifecycle$StateChange;", "Lcom/tinder/scarlet/Lifecycle$State;", "T", "Lcom/tinder/scarlet/Event$OnLifecycle;", "scarlet"}, m18303k = 1, m18304mv = {1, 4, 2})
        public static final /* data */ class StateChange<T extends Lifecycle.State> extends OnLifecycle {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof StateChange)) {
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
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/tinder/scarlet/Event$OnLifecycle$Terminate;", "Lcom/tinder/scarlet/Event$OnLifecycle;", "scarlet"}, m18303k = 1, m18304mv = {1, 4, 2})
        public static final class Terminate extends OnLifecycle {
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/tinder/scarlet/Event$OnRetry;", "Lcom/tinder/scarlet/Event;", "scarlet"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final class OnRetry extends Event {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\u00020\u0003¨\u0006\u0004"}, m18302d2 = {"Lcom/tinder/scarlet/Event$OnStateChange;", "Lcom/tinder/scarlet/State;", "T", "Lcom/tinder/scarlet/Event;", "scarlet"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static final /* data */ class OnStateChange<T extends State> extends Event {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnStateChange)) {
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
    @Metadata(m18301d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m18302d2 = {"Lcom/tinder/scarlet/Event$OnWebSocket;", "Lcom/tinder/scarlet/Event;", "Event", "Terminate", "Lcom/tinder/scarlet/Event$OnWebSocket$Event;", "Lcom/tinder/scarlet/Event$OnWebSocket$Terminate;", "scarlet"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static abstract class OnWebSocket extends Event {

        /* JADX INFO: renamed from: com.tinder.scarlet.Event$OnWebSocket$Event, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\u00020\u0003¨\u0006\u0004"}, m18302d2 = {"Lcom/tinder/scarlet/Event$OnWebSocket$Event;", "Lcom/tinder/scarlet/WebSocket$Event;", "T", "Lcom/tinder/scarlet/Event$OnWebSocket;", "scarlet"}, m18303k = 1, m18304mv = {1, 4, 2})
        public static final /* data */ class C6455Event<T extends WebSocket.Event> extends OnWebSocket {

            /* JADX INFO: renamed from: a */
            public final WebSocket.Event f43448a;

            public C6455Event(WebSocket.Event event) {
                Intrinsics.m18599g(event, "event");
                this.f43448a = event;
            }

            public final boolean equals(Object obj) {
                if (this != obj) {
                    return (obj instanceof C6455Event) && Intrinsics.m18594b(this.f43448a, ((C6455Event) obj).f43448a);
                }
                return true;
            }

            public final int hashCode() {
                WebSocket.Event event = this.f43448a;
                if (event != null) {
                    return event.hashCode();
                }
                return 0;
            }

            public final String toString() {
                return "Event(event=" + this.f43448a + ")";
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/tinder/scarlet/Event$OnWebSocket$Terminate;", "Lcom/tinder/scarlet/Event$OnWebSocket;", "scarlet"}, m18303k = 1, m18304mv = {1, 4, 2})
        public static final class Terminate extends OnWebSocket {
        }
    }
}
