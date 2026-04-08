package com.tinder.scarlet.internal.connection;

import com.tinder.StateMachine;
import com.tinder.scarlet.Event;
import com.tinder.scarlet.SideEffect;
import com.tinder.scarlet.State;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002H\n¢\u0006\u0002\b\u0006"}, m18302d2 = {"<anonymous>", "", "Lcom/tinder/StateMachine$GraphBuilder;", "Lcom/tinder/scarlet/State;", "Lcom/tinder/scarlet/Event;", "Lcom/tinder/scarlet/SideEffect;", "invoke"}, m18303k = 3, m18304mv = {1, 4, 2})
final class Connection$StateManager$stateMachine$1 extends Lambda implements Function1<StateMachine.GraphBuilder<State, Event, SideEffect>, Unit> {

    /* JADX INFO: renamed from: com.tinder.scarlet.internal.connection.Connection$StateManager$stateMachine$1$1 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u001e\u0012\u0004\u0012\u00020\u00030\u0002R\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004H\n¢\u0006\u0002\b\b"}, m18302d2 = {"<anonymous>", "", "Lcom/tinder/StateMachine$GraphBuilder$StateDefinitionBuilder;", "Lcom/tinder/scarlet/State$Disconnected;", "Lcom/tinder/StateMachine$GraphBuilder;", "Lcom/tinder/scarlet/State;", "Lcom/tinder/scarlet/Event;", "Lcom/tinder/scarlet/SideEffect;", "invoke"}, m18303k = 3, m18304mv = {1, 4, 2})
    final class C50531 extends Lambda implements Function1<StateMachine.GraphBuilder<State, Event, SideEffect>.StateDefinitionBuilder<State.Disconnected>, Unit> {

        /* JADX INFO: renamed from: com.tinder.scarlet.internal.connection.Connection$StateManager$stateMachine$1$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m18302d2 = {"<anonymous>", "", "Lcom/tinder/scarlet/State$Disconnected;", "it", "Lcom/tinder/scarlet/Event;", "invoke"}, m18303k = 3, m18304mv = {1, 4, 2})
        final class AnonymousClass1 extends Lambda implements Function2<State.Disconnected, Event, Unit> {
            public AnonymousClass1() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                State.Disconnected receiver = (State.Disconnected) obj;
                Event it = (Event) obj2;
                Intrinsics.m18599g(receiver, "$receiver");
                Intrinsics.m18599g(it, "it");
                Connection$StateManager$stateMachine$1.this.getClass();
                throw null;
            }
        }

        /* JADX INFO: renamed from: com.tinder.scarlet.internal.connection.Connection$StateManager$stateMachine$1$1$2, reason: invalid class name */
        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006H\n¢\u0006\u0002\b\u0007"}, m18302d2 = {"<anonymous>", "Lcom/tinder/StateMachine$Graph$State$TransitionTo;", "Lcom/tinder/scarlet/State;", "Lcom/tinder/scarlet/SideEffect;", "Lcom/tinder/scarlet/State$Disconnected;", "it", "Lcom/tinder/scarlet/Event$OnLifecycle$StateChange;", "invoke"}, m18303k = 3, m18304mv = {1, 4, 2})
        final class AnonymousClass2 extends Lambda implements Function2<State.Disconnected, Event.OnLifecycle.StateChange<?>, StateMachine.Graph.State.TransitionTo<? extends State, ? extends SideEffect>> {
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                State.Disconnected receiver = (State.Disconnected) obj;
                Event.OnLifecycle.StateChange it = (Event.OnLifecycle.StateChange) obj2;
                Intrinsics.m18599g(receiver, "$receiver");
                Intrinsics.m18599g(it, "it");
                throw null;
            }
        }

        /* JADX INFO: renamed from: com.tinder.scarlet.internal.connection.Connection$StateManager$stateMachine$1$1$3, reason: invalid class name */
        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006H\n¢\u0006\u0002\b\u0007"}, m18302d2 = {"<anonymous>", "Lcom/tinder/StateMachine$Graph$State$TransitionTo;", "Lcom/tinder/scarlet/State;", "Lcom/tinder/scarlet/SideEffect;", "Lcom/tinder/scarlet/State$Disconnected;", "it", "Lcom/tinder/scarlet/Event$OnLifecycle$StateChange;", "invoke"}, m18303k = 3, m18304mv = {1, 4, 2})
        final class AnonymousClass3 extends Lambda implements Function2<State.Disconnected, Event.OnLifecycle.StateChange<?>, StateMachine.Graph.State.TransitionTo<? extends State, ? extends SideEffect>> {
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                State.Disconnected receiver = (State.Disconnected) obj;
                Event.OnLifecycle.StateChange it = (Event.OnLifecycle.StateChange) obj2;
                Intrinsics.m18599g(receiver, "$receiver");
                Intrinsics.m18599g(it, "it");
                throw null;
            }
        }

        /* JADX INFO: renamed from: com.tinder.scarlet.internal.connection.Connection$StateManager$stateMachine$1$1$4, reason: invalid class name */
        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, m18302d2 = {"<anonymous>", "Lcom/tinder/StateMachine$Graph$State$TransitionTo;", "Lcom/tinder/scarlet/State;", "Lcom/tinder/scarlet/SideEffect;", "Lcom/tinder/scarlet/State$Disconnected;", "it", "Lcom/tinder/scarlet/Event$OnLifecycle$Terminate;", "invoke"}, m18303k = 3, m18304mv = {1, 4, 2})
        final class AnonymousClass4 extends Lambda implements Function2<State.Disconnected, Event.OnLifecycle.Terminate, StateMachine.Graph.State.TransitionTo<? extends State, ? extends SideEffect>> {
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                State.Disconnected receiver = (State.Disconnected) obj;
                Event.OnLifecycle.Terminate it = (Event.OnLifecycle.Terminate) obj2;
                Intrinsics.m18599g(receiver, "$receiver");
                Intrinsics.m18599g(it, "it");
                throw null;
            }
        }

        public C50531() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            StateMachine.GraphBuilder.StateDefinitionBuilder receiver = (StateMachine.GraphBuilder.StateDefinitionBuilder) obj;
            Intrinsics.m18599g(receiver, "$receiver");
            receiver.m15428b(new AnonymousClass1());
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.tinder.scarlet.internal.connection.Connection$StateManager$stateMachine$1$2 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u001e\u0012\u0004\u0012\u00020\u00030\u0002R\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004H\n¢\u0006\u0002\b\b"}, m18302d2 = {"<anonymous>", "", "Lcom/tinder/StateMachine$GraphBuilder$StateDefinitionBuilder;", "Lcom/tinder/scarlet/State$WaitingToRetry;", "Lcom/tinder/StateMachine$GraphBuilder;", "Lcom/tinder/scarlet/State;", "Lcom/tinder/scarlet/Event;", "Lcom/tinder/scarlet/SideEffect;", "invoke"}, m18303k = 3, m18304mv = {1, 4, 2})
    final class C50542 extends Lambda implements Function1<StateMachine.GraphBuilder<State, Event, SideEffect>.StateDefinitionBuilder<State.WaitingToRetry>, Unit> {

        /* JADX INFO: renamed from: com.tinder.scarlet.internal.connection.Connection$StateManager$stateMachine$1$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m18302d2 = {"<anonymous>", "", "Lcom/tinder/scarlet/State$WaitingToRetry;", "it", "Lcom/tinder/scarlet/Event;", "invoke"}, m18303k = 3, m18304mv = {1, 4, 2})
        final class AnonymousClass1 extends Lambda implements Function2<State.WaitingToRetry, Event, Unit> {
            public AnonymousClass1() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                State.WaitingToRetry receiver = (State.WaitingToRetry) obj;
                Event it = (Event) obj2;
                Intrinsics.m18599g(receiver, "$receiver");
                Intrinsics.m18599g(it, "it");
                throw null;
            }
        }

        /* JADX INFO: renamed from: com.tinder.scarlet.internal.connection.Connection$StateManager$stateMachine$1$2$2, reason: invalid class name */
        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, m18302d2 = {"<anonymous>", "Lcom/tinder/StateMachine$Graph$State$TransitionTo;", "Lcom/tinder/scarlet/State;", "Lcom/tinder/scarlet/SideEffect;", "Lcom/tinder/scarlet/State$WaitingToRetry;", "it", "Lcom/tinder/scarlet/Event$OnRetry;", "invoke"}, m18303k = 3, m18304mv = {1, 4, 2})
        final class AnonymousClass2 extends Lambda implements Function2<State.WaitingToRetry, Event.OnRetry, StateMachine.Graph.State.TransitionTo<? extends State, ? extends SideEffect>> {
            public AnonymousClass2(StateMachine.GraphBuilder.StateDefinitionBuilder stateDefinitionBuilder) {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                State.WaitingToRetry receiver = (State.WaitingToRetry) obj;
                Event.OnRetry it = (Event.OnRetry) obj2;
                Intrinsics.m18599g(receiver, "$receiver");
                Intrinsics.m18599g(it, "it");
                throw null;
            }
        }

        /* JADX INFO: renamed from: com.tinder.scarlet.internal.connection.Connection$StateManager$stateMachine$1$2$3, reason: invalid class name */
        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006H\n¢\u0006\u0002\b\u0007"}, m18302d2 = {"<anonymous>", "Lcom/tinder/StateMachine$Graph$State$TransitionTo;", "Lcom/tinder/scarlet/State;", "Lcom/tinder/scarlet/SideEffect;", "Lcom/tinder/scarlet/State$WaitingToRetry;", "it", "Lcom/tinder/scarlet/Event$OnLifecycle$StateChange;", "invoke"}, m18303k = 3, m18304mv = {1, 4, 2})
        final class AnonymousClass3 extends Lambda implements Function2<State.WaitingToRetry, Event.OnLifecycle.StateChange<?>, StateMachine.Graph.State.TransitionTo<? extends State, ? extends SideEffect>> {
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                State.WaitingToRetry receiver = (State.WaitingToRetry) obj;
                Event.OnLifecycle.StateChange it = (Event.OnLifecycle.StateChange) obj2;
                Intrinsics.m18599g(receiver, "$receiver");
                Intrinsics.m18599g(it, "it");
                throw null;
            }
        }

        /* JADX INFO: renamed from: com.tinder.scarlet.internal.connection.Connection$StateManager$stateMachine$1$2$4, reason: invalid class name */
        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006H\n¢\u0006\u0002\b\u0007"}, m18302d2 = {"<anonymous>", "Lcom/tinder/StateMachine$Graph$State$TransitionTo;", "Lcom/tinder/scarlet/State;", "Lcom/tinder/scarlet/SideEffect;", "Lcom/tinder/scarlet/State$WaitingToRetry;", "it", "Lcom/tinder/scarlet/Event$OnLifecycle$StateChange;", "invoke"}, m18303k = 3, m18304mv = {1, 4, 2})
        final class AnonymousClass4 extends Lambda implements Function2<State.WaitingToRetry, Event.OnLifecycle.StateChange<?>, StateMachine.Graph.State.TransitionTo<? extends State, ? extends SideEffect>> {
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                State.WaitingToRetry receiver = (State.WaitingToRetry) obj;
                Event.OnLifecycle.StateChange it = (Event.OnLifecycle.StateChange) obj2;
                Intrinsics.m18599g(receiver, "$receiver");
                Intrinsics.m18599g(it, "it");
                throw null;
            }
        }

        /* JADX INFO: renamed from: com.tinder.scarlet.internal.connection.Connection$StateManager$stateMachine$1$2$5, reason: invalid class name */
        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, m18302d2 = {"<anonymous>", "Lcom/tinder/StateMachine$Graph$State$TransitionTo;", "Lcom/tinder/scarlet/State;", "Lcom/tinder/scarlet/SideEffect;", "Lcom/tinder/scarlet/State$WaitingToRetry;", "it", "Lcom/tinder/scarlet/Event$OnLifecycle$Terminate;", "invoke"}, m18303k = 3, m18304mv = {1, 4, 2})
        final class AnonymousClass5 extends Lambda implements Function2<State.WaitingToRetry, Event.OnLifecycle.Terminate, StateMachine.Graph.State.TransitionTo<? extends State, ? extends SideEffect>> {
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                State.WaitingToRetry receiver = (State.WaitingToRetry) obj;
                Event.OnLifecycle.Terminate it = (Event.OnLifecycle.Terminate) obj2;
                Intrinsics.m18599g(receiver, "$receiver");
                Intrinsics.m18599g(it, "it");
                throw null;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            StateMachine.GraphBuilder.StateDefinitionBuilder receiver = (StateMachine.GraphBuilder.StateDefinitionBuilder) obj;
            Intrinsics.m18599g(receiver, "$receiver");
            receiver.m15428b(new AnonymousClass1());
            receiver.m15427a(new StateMachine.Matcher(Event.OnRetry.class), new AnonymousClass2(receiver));
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.tinder.scarlet.internal.connection.Connection$StateManager$stateMachine$1$3 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u001e\u0012\u0004\u0012\u00020\u00030\u0002R\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004H\n¢\u0006\u0002\b\b"}, m18302d2 = {"<anonymous>", "", "Lcom/tinder/StateMachine$GraphBuilder$StateDefinitionBuilder;", "Lcom/tinder/scarlet/State$Connecting;", "Lcom/tinder/StateMachine$GraphBuilder;", "Lcom/tinder/scarlet/State;", "Lcom/tinder/scarlet/Event;", "Lcom/tinder/scarlet/SideEffect;", "invoke"}, m18303k = 3, m18304mv = {1, 4, 2})
    final class C50553 extends Lambda implements Function1<StateMachine.GraphBuilder<State, Event, SideEffect>.StateDefinitionBuilder<State.Connecting>, Unit> {

        /* JADX INFO: renamed from: com.tinder.scarlet.internal.connection.Connection$StateManager$stateMachine$1$3$1, reason: invalid class name */
        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006H\n¢\u0006\u0002\b\u0007"}, m18302d2 = {"<anonymous>", "Lcom/tinder/StateMachine$Graph$State$TransitionTo;", "Lcom/tinder/scarlet/State;", "Lcom/tinder/scarlet/SideEffect;", "Lcom/tinder/scarlet/State$Connecting;", "it", "Lcom/tinder/scarlet/Event$OnWebSocket$Event;", "invoke"}, m18303k = 3, m18304mv = {1, 4, 2})
        final class AnonymousClass1 extends Lambda implements Function2<State.Connecting, Event.OnWebSocket.C6455Event<?>, StateMachine.Graph.State.TransitionTo<? extends State, ? extends SideEffect>> {
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                State.Connecting receiver = (State.Connecting) obj;
                Event.OnWebSocket.C6455Event it = (Event.OnWebSocket.C6455Event) obj2;
                Intrinsics.m18599g(receiver, "$receiver");
                Intrinsics.m18599g(it, "it");
                throw null;
            }
        }

        /* JADX INFO: renamed from: com.tinder.scarlet.internal.connection.Connection$StateManager$stateMachine$1$3$2, reason: invalid class name */
        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, m18302d2 = {"<anonymous>", "Lcom/tinder/StateMachine$Graph$State$TransitionTo;", "Lcom/tinder/scarlet/State;", "Lcom/tinder/scarlet/SideEffect;", "Lcom/tinder/scarlet/State$Connecting;", "it", "Lcom/tinder/scarlet/Event$OnWebSocket$Terminate;", "invoke"}, m18303k = 3, m18304mv = {1, 4, 2})
        final class AnonymousClass2 extends Lambda implements Function2<State.Connecting, Event.OnWebSocket.Terminate, StateMachine.Graph.State.TransitionTo<? extends State, ? extends SideEffect>> {
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                State.Connecting receiver = (State.Connecting) obj;
                Event.OnWebSocket.Terminate it = (Event.OnWebSocket.Terminate) obj2;
                Intrinsics.m18599g(receiver, "$receiver");
                Intrinsics.m18599g(it, "it");
                throw null;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            StateMachine.GraphBuilder.StateDefinitionBuilder receiver = (StateMachine.GraphBuilder.StateDefinitionBuilder) obj;
            Intrinsics.m18599g(receiver, "$receiver");
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.tinder.scarlet.internal.connection.Connection$StateManager$stateMachine$1$4 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u001e\u0012\u0004\u0012\u00020\u00030\u0002R\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004H\n¢\u0006\u0002\b\b"}, m18302d2 = {"<anonymous>", "", "Lcom/tinder/StateMachine$GraphBuilder$StateDefinitionBuilder;", "Lcom/tinder/scarlet/State$Connected;", "Lcom/tinder/StateMachine$GraphBuilder;", "Lcom/tinder/scarlet/State;", "Lcom/tinder/scarlet/Event;", "Lcom/tinder/scarlet/SideEffect;", "invoke"}, m18303k = 3, m18304mv = {1, 4, 2})
    final class C50564 extends Lambda implements Function1<StateMachine.GraphBuilder<State, Event, SideEffect>.StateDefinitionBuilder<State.Connected>, Unit> {

        /* JADX INFO: renamed from: com.tinder.scarlet.internal.connection.Connection$StateManager$stateMachine$1$4$1, reason: invalid class name */
        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m18302d2 = {"<anonymous>", "", "Lcom/tinder/scarlet/State$Connected;", "it", "Lcom/tinder/scarlet/Event;", "invoke"}, m18303k = 3, m18304mv = {1, 4, 2})
        final class AnonymousClass1 extends Lambda implements Function2<State.Connected, Event, Unit> {
            public AnonymousClass1() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                State.Connected receiver = (State.Connected) obj;
                Event it = (Event) obj2;
                Intrinsics.m18599g(receiver, "$receiver");
                Intrinsics.m18599g(it, "it");
                throw null;
            }
        }

        /* JADX INFO: renamed from: com.tinder.scarlet.internal.connection.Connection$StateManager$stateMachine$1$4$2, reason: invalid class name */
        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006H\n¢\u0006\u0002\b\u0007"}, m18302d2 = {"<anonymous>", "Lcom/tinder/StateMachine$Graph$State$TransitionTo;", "Lcom/tinder/scarlet/State;", "Lcom/tinder/scarlet/SideEffect;", "Lcom/tinder/scarlet/State$Connected;", "it", "Lcom/tinder/scarlet/Event$OnLifecycle$StateChange;", "invoke"}, m18303k = 3, m18304mv = {1, 4, 2})
        final class AnonymousClass2 extends Lambda implements Function2<State.Connected, Event.OnLifecycle.StateChange<?>, StateMachine.Graph.State.TransitionTo<? extends State, ? extends SideEffect>> {
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                State.Connected receiver = (State.Connected) obj;
                Event.OnLifecycle.StateChange it = (Event.OnLifecycle.StateChange) obj2;
                Intrinsics.m18599g(receiver, "$receiver");
                Intrinsics.m18599g(it, "it");
                throw null;
            }
        }

        /* JADX INFO: renamed from: com.tinder.scarlet.internal.connection.Connection$StateManager$stateMachine$1$4$3, reason: invalid class name */
        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006H\n¢\u0006\u0002\b\u0007"}, m18302d2 = {"<anonymous>", "Lcom/tinder/StateMachine$Graph$State$TransitionTo;", "Lcom/tinder/scarlet/State;", "Lcom/tinder/scarlet/SideEffect;", "Lcom/tinder/scarlet/State$Connected;", "it", "Lcom/tinder/scarlet/Event$OnLifecycle$StateChange;", "invoke"}, m18303k = 3, m18304mv = {1, 4, 2})
        final class AnonymousClass3 extends Lambda implements Function2<State.Connected, Event.OnLifecycle.StateChange<?>, StateMachine.Graph.State.TransitionTo<? extends State, ? extends SideEffect>> {
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                State.Connected receiver = (State.Connected) obj;
                Event.OnLifecycle.StateChange it = (Event.OnLifecycle.StateChange) obj2;
                Intrinsics.m18599g(receiver, "$receiver");
                Intrinsics.m18599g(it, "it");
                throw null;
            }
        }

        /* JADX INFO: renamed from: com.tinder.scarlet.internal.connection.Connection$StateManager$stateMachine$1$4$4, reason: invalid class name */
        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, m18302d2 = {"<anonymous>", "Lcom/tinder/StateMachine$Graph$State$TransitionTo;", "Lcom/tinder/scarlet/State;", "Lcom/tinder/scarlet/SideEffect;", "Lcom/tinder/scarlet/State$Connected;", "it", "Lcom/tinder/scarlet/Event$OnLifecycle$Terminate;", "invoke"}, m18303k = 3, m18304mv = {1, 4, 2})
        final class AnonymousClass4 extends Lambda implements Function2<State.Connected, Event.OnLifecycle.Terminate, StateMachine.Graph.State.TransitionTo<? extends State, ? extends SideEffect>> {
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                State.Connected receiver = (State.Connected) obj;
                Event.OnLifecycle.Terminate it = (Event.OnLifecycle.Terminate) obj2;
                Intrinsics.m18599g(receiver, "$receiver");
                Intrinsics.m18599g(it, "it");
                throw null;
            }
        }

        /* JADX INFO: renamed from: com.tinder.scarlet.internal.connection.Connection$StateManager$stateMachine$1$4$5, reason: invalid class name */
        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, m18302d2 = {"<anonymous>", "Lcom/tinder/StateMachine$Graph$State$TransitionTo;", "Lcom/tinder/scarlet/State;", "Lcom/tinder/scarlet/SideEffect;", "Lcom/tinder/scarlet/State$Connected;", "it", "Lcom/tinder/scarlet/Event$OnWebSocket$Terminate;", "invoke"}, m18303k = 3, m18304mv = {1, 4, 2})
        final class AnonymousClass5 extends Lambda implements Function2<State.Connected, Event.OnWebSocket.Terminate, StateMachine.Graph.State.TransitionTo<? extends State, ? extends SideEffect>> {
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                State.Connected receiver = (State.Connected) obj;
                Event.OnWebSocket.Terminate it = (Event.OnWebSocket.Terminate) obj2;
                Intrinsics.m18599g(receiver, "$receiver");
                Intrinsics.m18599g(it, "it");
                throw null;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            StateMachine.GraphBuilder.StateDefinitionBuilder receiver = (StateMachine.GraphBuilder.StateDefinitionBuilder) obj;
            Intrinsics.m18599g(receiver, "$receiver");
            receiver.m15428b(new AnonymousClass1());
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.tinder.scarlet.internal.connection.Connection$StateManager$stateMachine$1$5 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u001e\u0012\u0004\u0012\u00020\u00030\u0002R\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004H\n¢\u0006\u0002\b\b"}, m18302d2 = {"<anonymous>", "", "Lcom/tinder/StateMachine$GraphBuilder$StateDefinitionBuilder;", "Lcom/tinder/scarlet/State$Disconnecting;", "Lcom/tinder/StateMachine$GraphBuilder;", "Lcom/tinder/scarlet/State;", "Lcom/tinder/scarlet/Event;", "Lcom/tinder/scarlet/SideEffect;", "invoke"}, m18303k = 3, m18304mv = {1, 4, 2})
    final class C50575 extends Lambda implements Function1<StateMachine.GraphBuilder<State, Event, SideEffect>.StateDefinitionBuilder<State.Disconnecting>, Unit> {

        /* JADX INFO: renamed from: com.tinder.scarlet.internal.connection.Connection$StateManager$stateMachine$1$5$1, reason: invalid class name */
        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, m18302d2 = {"<anonymous>", "Lcom/tinder/StateMachine$Graph$State$TransitionTo;", "Lcom/tinder/scarlet/State;", "Lcom/tinder/scarlet/SideEffect;", "Lcom/tinder/scarlet/State$Disconnecting;", "it", "Lcom/tinder/scarlet/Event$OnWebSocket$Terminate;", "invoke"}, m18303k = 3, m18304mv = {1, 4, 2})
        final class AnonymousClass1 extends Lambda implements Function2<State.Disconnecting, Event.OnWebSocket.Terminate, StateMachine.Graph.State.TransitionTo<? extends State, ? extends SideEffect>> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ StateMachine.GraphBuilder.StateDefinitionBuilder f43467a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(StateMachine.GraphBuilder.StateDefinitionBuilder stateDefinitionBuilder) {
                super(2);
                this.f43467a = stateDefinitionBuilder;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                State.Disconnecting receiver = (State.Disconnecting) obj;
                Event.OnWebSocket.Terminate it = (Event.OnWebSocket.Terminate) obj2;
                Intrinsics.m18599g(receiver, "$receiver");
                Intrinsics.m18599g(it, "it");
                State.Disconnected disconnected = State.Disconnected.f43456a;
                this.f43467a.getClass();
                return new StateMachine.Graph.State.TransitionTo(disconnected);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            StateMachine.GraphBuilder.StateDefinitionBuilder receiver = (StateMachine.GraphBuilder.StateDefinitionBuilder) obj;
            Intrinsics.m18599g(receiver, "$receiver");
            receiver.m15427a(new StateMachine.Matcher(Event.OnWebSocket.Terminate.class), new AnonymousClass1(receiver));
            return Unit.f51459a;
        }
    }

    /* JADX INFO: renamed from: com.tinder.scarlet.internal.connection.Connection$StateManager$stateMachine$1$6 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u001e\u0012\u0004\u0012\u00020\u00030\u0002R\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004H\n¢\u0006\u0002\b\b"}, m18302d2 = {"<anonymous>", "", "Lcom/tinder/StateMachine$GraphBuilder$StateDefinitionBuilder;", "Lcom/tinder/scarlet/State$Destroyed;", "Lcom/tinder/StateMachine$GraphBuilder;", "Lcom/tinder/scarlet/State;", "Lcom/tinder/scarlet/Event;", "Lcom/tinder/scarlet/SideEffect;", "invoke"}, m18303k = 3, m18304mv = {1, 4, 2})
    final class C50586 extends Lambda implements Function1<StateMachine.GraphBuilder<State, Event, SideEffect>.StateDefinitionBuilder<State.Destroyed>, Unit> {

        /* JADX INFO: renamed from: com.tinder.scarlet.internal.connection.Connection$StateManager$stateMachine$1$6$1, reason: invalid class name */
        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m18302d2 = {"<anonymous>", "", "Lcom/tinder/scarlet/State$Destroyed;", "it", "Lcom/tinder/scarlet/Event;", "invoke"}, m18303k = 3, m18304mv = {1, 4, 2})
        final class AnonymousClass1 extends Lambda implements Function2<State.Destroyed, Event, Unit> {
            public AnonymousClass1() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                State.Destroyed receiver = (State.Destroyed) obj;
                Event it = (Event) obj2;
                Intrinsics.m18599g(receiver, "$receiver");
                Intrinsics.m18599g(it, "it");
                throw null;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            StateMachine.GraphBuilder.StateDefinitionBuilder receiver = (StateMachine.GraphBuilder.StateDefinitionBuilder) obj;
            Intrinsics.m18599g(receiver, "$receiver");
            receiver.m15428b(new AnonymousClass1());
            return Unit.f51459a;
        }
    }

    /* JADX INFO: renamed from: com.tinder.scarlet.internal.connection.Connection$StateManager$stateMachine$1$7 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0018\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0003H\n¢\u0006\u0002\b\u0007"}, m18302d2 = {"<anonymous>", "", "transition", "Lcom/tinder/StateMachine$Transition;", "Lcom/tinder/scarlet/State;", "Lcom/tinder/scarlet/Event;", "Lcom/tinder/scarlet/SideEffect;", "invoke"}, m18303k = 3, m18304mv = {1, 4, 2})
    final class C50597 extends Lambda implements Function1<StateMachine.Transition<? extends State, ? extends Event, ? extends SideEffect>, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            StateMachine.Transition transition = (StateMachine.Transition) obj;
            Intrinsics.m18599g(transition, "transition");
            if (!(transition instanceof StateMachine.Transition.Valid)) {
                return Unit.f51459a;
            }
            throw null;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        StateMachine.GraphBuilder receiver = (StateMachine.GraphBuilder) obj;
        Intrinsics.m18599g(receiver, "$receiver");
        C50531 c50531 = new C50531();
        new StateMachine.Matcher(State.Disconnected.class);
        c50531.invoke(new StateMachine.GraphBuilder.StateDefinitionBuilder());
        throw null;
    }
}
