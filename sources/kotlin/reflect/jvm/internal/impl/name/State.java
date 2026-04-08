package kotlin.reflect.jvm.internal.impl.name;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
final class State {

    /* JADX INFO: renamed from: a */
    public static final State f54068a;

    /* JADX INFO: renamed from: b */
    public static final State f54069b;

    /* JADX INFO: renamed from: c */
    public static final State f54070c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ State[] f54071d;

    static {
        State state = new State("BEGINNING", 0);
        f54068a = state;
        State state2 = new State("MIDDLE", 1);
        f54069b = state2;
        State state3 = new State("AFTER_DOT", 2);
        f54070c = state3;
        f54071d = new State[]{state, state2, state3};
    }

    public static State valueOf(String str) {
        return (State) Enum.valueOf(State.class, str);
    }

    public static State[] values() {
        return (State[]) f54071d.clone();
    }
}
