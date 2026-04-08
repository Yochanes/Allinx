package androidx.camera.video.internal;

import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.Observable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public interface BufferProvider<T> extends Observable<State> {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    public static final class State {

        /* JADX INFO: renamed from: a */
        public static final State f3401a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ State[] f3402b;

        static {
            State state = new State("ACTIVE", 0);
            f3401a = state;
            f3402b = new State[]{state, new State("INACTIVE", 1)};
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) f3402b.clone();
        }
    }
}
