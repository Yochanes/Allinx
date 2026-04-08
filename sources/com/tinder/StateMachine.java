package com.tinder;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u0001*\b\b\u0002\u0010\u0004*\u00020\u00012\u00020\u0001:\u0005\u0005\u0006\u0007\b\t¨\u0006\n"}, m18302d2 = {"Lcom/tinder/StateMachine;", "", "STATE", "EVENT", "SIDE_EFFECT", "Companion", "Graph", "GraphBuilder", "Matcher", "Transition", "state-machine"}, m18303k = 1, m18304mv = {1, 4, 0})
public final class StateMachine<STATE, EVENT, SIDE_EFFECT> {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/tinder/StateMachine$Companion;", "", "state-machine"}, m18303k = 1, m18304mv = {1, 4, 0})
    public static final class Companion {
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0086\b\u0018\u0000*\b\b\u0003\u0010\u0002*\u00020\u0001*\b\b\u0004\u0010\u0003*\u00020\u0001*\b\b\u0005\u0010\u0004*\u00020\u00012\u00020\u0001:\u0001\u0005¨\u0006\u0006"}, m18302d2 = {"Lcom/tinder/StateMachine$Graph;", "", "STATE", "EVENT", "SIDE_EFFECT", "State", "state-machine"}, m18303k = 1, m18304mv = {1, 4, 0})
    public static final /* data */ class Graph<STATE, EVENT, SIDE_EFFECT> {

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000*\b\b\u0006\u0010\u0002*\u00020\u0001*\b\b\u0007\u0010\u0003*\u00020\u0001*\b\b\b\u0010\u0004*\u00020\u00012\u00020\u0001:\u0001\u0005¨\u0006\u0006"}, m18302d2 = {"Lcom/tinder/StateMachine$Graph$State;", "", "STATE", "EVENT", "SIDE_EFFECT", "TransitionTo", "state-machine"}, m18303k = 1, m18304mv = {1, 4, 0})
        public static final class State<STATE, EVENT, SIDE_EFFECT> {

            /* JADX INFO: renamed from: a */
            public final ArrayList f43440a = new ArrayList();

            /* JADX INFO: renamed from: b */
            public final LinkedHashMap f43441b;

            /* JADX INFO: compiled from: Proguard */
            @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u0000*\n\b\t\u0010\u0002 \u0001*\u00020\u0001*\n\b\n\u0010\u0003 \u0001*\u00020\u00012\u00020\u0001¨\u0006\u0004"}, m18302d2 = {"Lcom/tinder/StateMachine$Graph$State$TransitionTo;", "", "STATE", "SIDE_EFFECT", "state-machine"}, m18303k = 1, m18304mv = {1, 4, 0})
            public static final /* data */ class TransitionTo<STATE, SIDE_EFFECT> {

                /* JADX INFO: renamed from: a */
                public final com.tinder.scarlet.State f43442a;

                public TransitionTo(com.tinder.scarlet.State state) {
                    this.f43442a = state;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj instanceof TransitionTo) {
                        return this.f43442a.equals(((TransitionTo) obj).f43442a);
                    }
                    return false;
                }

                public final int hashCode() {
                    return this.f43442a.hashCode() * 31;
                }

                public final String toString() {
                    return "TransitionTo(toState=" + this.f43442a + ", sideEffect=null)";
                }
            }

            public State() {
                new ArrayList();
                this.f43441b = new LinkedHashMap();
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Graph)) {
                return false;
            }
            ((Graph) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Graph(initialState=null, stateDefinitions=null, onTransitionListeners=null)";
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000*\b\b\u0003\u0010\u0002*\u00020\u0001*\b\b\u0004\u0010\u0003*\u00020\u0001*\b\b\u0005\u0010\u0004*\u00020\u00012\u00020\u0001:\u0001\u0005¨\u0006\u0006"}, m18302d2 = {"Lcom/tinder/StateMachine$GraphBuilder;", "", "STATE", "EVENT", "SIDE_EFFECT", "StateDefinitionBuilder", "state-machine"}, m18303k = 1, m18304mv = {1, 4, 0})
    public static final class GraphBuilder<STATE, EVENT, SIDE_EFFECT> {

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0086\u0004\u0018\u0000*\b\b\u0006\u0010\u0001*\u00028\u00032\u00020\u0002¨\u0006\u0003"}, m18302d2 = {"Lcom/tinder/StateMachine$GraphBuilder$StateDefinitionBuilder;", "S", "", "state-machine"}, m18303k = 1, m18304mv = {1, 4, 0})
        public final class StateDefinitionBuilder<S extends STATE> {

            /* JADX INFO: renamed from: a */
            public final Graph.State f43443a = new Graph.State();

            /* JADX INFO: renamed from: a */
            public final void m15427a(Matcher matcher, Function2 function2) {
                this.f43443a.f43441b.put(matcher, new StateMachine$GraphBuilder$StateDefinitionBuilder$on$1(function2));
            }

            /* JADX INFO: renamed from: b */
            public final void m15428b(Function2 function2) {
                this.f43443a.f43440a.add(new C5051xbc677dc4(function2));
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000*\b\b\u0003\u0010\u0002*\u00020\u0001*\n\b\u0004\u0010\u0003 \u0001*\u00028\u00032\u00020\u0001:\u0001\u0004¨\u0006\u0005"}, m18302d2 = {"Lcom/tinder/StateMachine$Matcher;", "", "T", "R", "Companion", "state-machine"}, m18303k = 1, m18304mv = {1, 4, 0})
    public static final class Matcher<T, R extends T> {

        /* JADX INFO: renamed from: a */
        public final Class f43446a;

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lcom/tinder/StateMachine$Matcher$Companion;", "", "state-machine"}, m18303k = 1, m18304mv = {1, 4, 0})
        public static final class Companion {
        }

        public Matcher(Class cls) {
            this.f43446a = cls;
            CollectionsKt.m18422W(new StateMachine$Matcher$predicates$1(this));
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\n\b\u0003\u0010\u0002 \u0001*\u00020\u0001*\n\b\u0004\u0010\u0003 \u0001*\u00020\u0001*\n\b\u0005\u0010\u0004 \u0001*\u00020\u00012\u00020\u0001:\u0002\u0005\u0006\u0082\u0001\u0002\u0007\b¨\u0006\t"}, m18302d2 = {"Lcom/tinder/StateMachine$Transition;", "", "STATE", "EVENT", "SIDE_EFFECT", "Invalid", "Valid", "Lcom/tinder/StateMachine$Transition$Valid;", "Lcom/tinder/StateMachine$Transition$Invalid;", "state-machine"}, m18303k = 1, m18304mv = {1, 4, 0})
    public static abstract class Transition<STATE, EVENT, SIDE_EFFECT> {

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u0000*\n\b\u0006\u0010\u0002 \u0001*\u00020\u0001*\n\b\u0007\u0010\u0003 \u0001*\u00020\u0001*\n\b\b\u0010\u0004 \u0001*\u00020\u00012\u0014\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b0\u0005¨\u0006\u0006"}, m18302d2 = {"Lcom/tinder/StateMachine$Transition$Invalid;", "", "STATE", "EVENT", "SIDE_EFFECT", "Lcom/tinder/StateMachine$Transition;", "state-machine"}, m18303k = 1, m18304mv = {1, 4, 0})
        public static final /* data */ class Invalid<STATE, EVENT, SIDE_EFFECT> extends Transition<STATE, EVENT, SIDE_EFFECT> {
            @Override // com.tinder.StateMachine.Transition
            /* JADX INFO: renamed from: a */
            public final Object mo15429a() {
                throw null;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Invalid)) {
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
        @Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u0000*\n\b\u0006\u0010\u0002 \u0001*\u00020\u0001*\n\b\u0007\u0010\u0003 \u0001*\u00020\u0001*\n\b\b\u0010\u0004 \u0001*\u00020\u00012\u0014\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b0\u0005¨\u0006\u0006"}, m18302d2 = {"Lcom/tinder/StateMachine$Transition$Valid;", "", "STATE", "EVENT", "SIDE_EFFECT", "Lcom/tinder/StateMachine$Transition;", "state-machine"}, m18303k = 1, m18304mv = {1, 4, 0})
        public static final /* data */ class Valid<STATE, EVENT, SIDE_EFFECT> extends Transition<STATE, EVENT, SIDE_EFFECT> {
            @Override // com.tinder.StateMachine.Transition
            /* JADX INFO: renamed from: a */
            public final Object mo15429a() {
                throw null;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Valid)) {
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

        /* JADX INFO: renamed from: a */
        public abstract Object mo15429a();
    }
}
