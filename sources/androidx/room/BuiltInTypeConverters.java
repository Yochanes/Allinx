package androidx.room;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;

/* JADX WARN: Method from annotation default annotation not found: byteBuffer */
/* JADX WARN: Method from annotation default annotation not found: enums */
/* JADX WARN: Method from annotation default annotation not found: uuid */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Target({})
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\u0002\u0018\u00002\u00020\u0001:\u0001\bB%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, m18302d2 = {"Landroidx/room/BuiltInTypeConverters;", "", "Landroidx/room/BuiltInTypeConverters$State;", "enums", "uuid", "byteBuffer", "<init>", "(Landroidx/room/BuiltInTypeConverters$State;Landroidx/room/BuiltInTypeConverters$State;Landroidx/room/BuiltInTypeConverters$State;)V", "State", "room-common"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@kotlin.annotation.Target
@Retention(RetentionPolicy.CLASS)
@kotlin.annotation.Retention
public @interface BuiltInTypeConverters {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/room/BuiltInTypeConverters$State;", "", "room-common"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class State {

        /* JADX INFO: renamed from: a */
        public static final State f31855a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ State[] f31856b;

        /* JADX INFO: Fake field, exist only in values array */
        State EF0;

        static {
            State state = new State("ENABLED", 0);
            State state2 = new State("DISABLED", 1);
            State state3 = new State("INHERITED", 2);
            f31855a = state3;
            f31856b = new State[]{state, state2, state3};
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) f31856b.clone();
        }
    }
}
