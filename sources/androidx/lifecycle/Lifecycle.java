package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/lifecycle/Lifecycle;", "", "Event", "State", "lifecycle-common"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public abstract class Lifecycle {

    /* JADX INFO: renamed from: a */
    public final AtomicReference f24878a = new AtomicReference();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m18302d2 = {"Landroidx/lifecycle/Lifecycle$Event;", "", "Companion", "ON_CREATE", "ON_START", "ON_RESUME", "ON_PAUSE", "ON_STOP", "ON_DESTROY", "ON_ANY", "lifecycle-common"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class Event {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Event[] $VALUES;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE;
        public static final Event ON_ANY;
        public static final Event ON_CREATE;
        public static final Event ON_DESTROY;
        public static final Event ON_PAUSE;
        public static final Event ON_RESUME;
        public static final Event ON_START;
        public static final Event ON_STOP;

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/lifecycle/Lifecycle$Event$Companion;", "", "lifecycle-common"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
        public static final class Companion {

            /* JADX INFO: compiled from: Proguard */
            @Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
            public /* synthetic */ class WhenMappings {
                static {
                    int[] iArr = new int[State.values().length];
                    try {
                        iArr[2] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        State state = State.f24880a;
                        iArr[3] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        State state2 = State.f24880a;
                        iArr[4] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        State state3 = State.f24880a;
                        iArr[0] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        State state4 = State.f24880a;
                        iArr[1] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                }
            }

            /* JADX INFO: renamed from: a */
            public static Event m9127a(State state) {
                Intrinsics.m18599g(state, "state");
                int iOrdinal = state.ordinal();
                if (iOrdinal == 2) {
                    return Event.ON_DESTROY;
                }
                if (iOrdinal == 3) {
                    return Event.ON_STOP;
                }
                if (iOrdinal != 4) {
                    return null;
                }
                return Event.ON_PAUSE;
            }

            /* JADX INFO: renamed from: b */
            public static Event m9128b(State state) {
                Intrinsics.m18599g(state, "state");
                int iOrdinal = state.ordinal();
                if (iOrdinal == 2) {
                    return Event.ON_CREATE;
                }
                if (iOrdinal == 3) {
                    return Event.ON_START;
                }
                if (iOrdinal != 4) {
                    return null;
                }
                return Event.ON_RESUME;
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
        public /* synthetic */ class WhenMappings {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f24879a;

            static {
                int[] iArr = new int[Event.values().length];
                try {
                    iArr[Event.ON_CREATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Event.ON_STOP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Event.ON_START.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Event.ON_PAUSE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[Event.ON_RESUME.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[Event.ON_DESTROY.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[Event.ON_ANY.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                f24879a = iArr;
            }
        }

        static {
            Event event = new Event("ON_CREATE", 0);
            ON_CREATE = event;
            Event event2 = new Event("ON_START", 1);
            ON_START = event2;
            Event event3 = new Event("ON_RESUME", 2);
            ON_RESUME = event3;
            Event event4 = new Event("ON_PAUSE", 3);
            ON_PAUSE = event4;
            Event event5 = new Event("ON_STOP", 4);
            ON_STOP = event5;
            Event event6 = new Event("ON_DESTROY", 5);
            ON_DESTROY = event6;
            Event event7 = new Event("ON_ANY", 6);
            ON_ANY = event7;
            Event[] eventArr = {event, event2, event3, event4, event5, event6, event7};
            $VALUES = eventArr;
            $ENTRIES = EnumEntriesKt.m18563a(eventArr);
            INSTANCE = new Companion();
        }

        public static Event valueOf(String str) {
            return (Event) Enum.valueOf(Event.class, str);
        }

        public static Event[] values() {
            return (Event[]) $VALUES.clone();
        }

        /* JADX INFO: renamed from: a */
        public final State m9126a() {
            switch (WhenMappings.f24879a[ordinal()]) {
                case 1:
                case 2:
                    return State.f24882c;
                case 3:
                case 4:
                    return State.f24883d;
                case 5:
                    return State.f24884f;
                case 6:
                    return State.f24880a;
                case 7:
                    throw new IllegalArgumentException(this + " has no target state");
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/lifecycle/Lifecycle$State;", "", "lifecycle-common"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class State {

        /* JADX INFO: renamed from: a */
        public static final State f24880a;

        /* JADX INFO: renamed from: b */
        public static final State f24881b;

        /* JADX INFO: renamed from: c */
        public static final State f24882c;

        /* JADX INFO: renamed from: d */
        public static final State f24883d;

        /* JADX INFO: renamed from: f */
        public static final State f24884f;

        /* JADX INFO: renamed from: g */
        public static final /* synthetic */ State[] f24885g;

        /* JADX INFO: renamed from: i */
        public static final /* synthetic */ EnumEntries f24886i;

        static {
            State state = new State("DESTROYED", 0);
            f24880a = state;
            State state2 = new State("INITIALIZED", 1);
            f24881b = state2;
            State state3 = new State("CREATED", 2);
            f24882c = state3;
            State state4 = new State("STARTED", 3);
            f24883d = state4;
            State state5 = new State("RESUMED", 4);
            f24884f = state5;
            State[] stateArr = {state, state2, state3, state4, state5};
            f24885g = stateArr;
            f24886i = EnumEntriesKt.m18563a(stateArr);
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) f24885g.clone();
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo9123a(LifecycleObserver lifecycleObserver);

    /* JADX INFO: renamed from: b */
    public abstract State mo9124b();

    /* JADX INFO: renamed from: c */
    public abstract void mo9125c(LifecycleObserver lifecycleObserver);
}
