package com.tinder.scarlet;

import kotlin.Metadata;
import org.reactivestreams.Publisher;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m18302d2 = {"Lcom/tinder/scarlet/Lifecycle;", "Lorg/reactivestreams/Publisher;", "Lcom/tinder/scarlet/Lifecycle$State;", "State", "scarlet-core"}, m18303k = 1, m18304mv = {1, 4, 2})
public interface Lifecycle extends Publisher<State> {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m18302d2 = {"Lcom/tinder/scarlet/Lifecycle$State;", "", "Destroyed", "Started", "Stopped", "Lcom/tinder/scarlet/Lifecycle$State$Started;", "Lcom/tinder/scarlet/Lifecycle$State$Stopped;", "Lcom/tinder/scarlet/Lifecycle$State$Destroyed;", "scarlet-core"}, m18303k = 1, m18304mv = {1, 4, 2})
    public static abstract class State {

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/tinder/scarlet/Lifecycle$State$Destroyed;", "Lcom/tinder/scarlet/Lifecycle$State;", "scarlet-core"}, m18303k = 1, m18304mv = {1, 4, 2})
        public static final class Destroyed extends State {

            /* JADX INFO: renamed from: a */
            public static final Destroyed f43449a = new Destroyed();
        }

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/tinder/scarlet/Lifecycle$State$Started;", "Lcom/tinder/scarlet/Lifecycle$State;", "scarlet-core"}, m18303k = 1, m18304mv = {1, 4, 2})
        public static final class Started extends State {

            /* JADX INFO: renamed from: a */
            public static final Started f43450a = new Started();
        }

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m18302d2 = {"Lcom/tinder/scarlet/Lifecycle$State$Stopped;", "Lcom/tinder/scarlet/Lifecycle$State;", "AndAborted", "WithReason", "Lcom/tinder/scarlet/Lifecycle$State$Stopped$WithReason;", "Lcom/tinder/scarlet/Lifecycle$State$Stopped$AndAborted;", "scarlet-core"}, m18303k = 1, m18304mv = {1, 4, 2})
        public static abstract class Stopped extends State {

            /* JADX INFO: compiled from: Proguard */
            @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/tinder/scarlet/Lifecycle$State$Stopped$AndAborted;", "Lcom/tinder/scarlet/Lifecycle$State$Stopped;", "scarlet-core"}, m18303k = 1, m18304mv = {1, 4, 2})
            public static final class AndAborted extends Stopped {

                /* JADX INFO: renamed from: a */
                public static final AndAborted f43451a = new AndAborted();
            }

            /* JADX INFO: compiled from: Proguard */
            @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/tinder/scarlet/Lifecycle$State$Stopped$WithReason;", "Lcom/tinder/scarlet/Lifecycle$State$Stopped;", "scarlet-core"}, m18303k = 1, m18304mv = {1, 4, 2})
            public static final /* data */ class WithReason extends Stopped {
                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof WithReason)) {
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
    }
}
