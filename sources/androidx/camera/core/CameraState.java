package androidx.camera.core;

import androidx.annotation.RequiresApi;
import com.google.auto.value.AutoValue;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@AutoValue
@RequiresApi
public abstract class CameraState {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    public static final class ErrorType {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ ErrorType[] f2209a = {new ErrorType("RECOVERABLE", 0), new ErrorType("CRITICAL", 1)};

        /* JADX INFO: Fake field, exist only in values array */
        ErrorType EF5;

        public static ErrorType valueOf(String str) {
            return (ErrorType) Enum.valueOf(ErrorType.class, str);
        }

        public static ErrorType[] values() {
            return (ErrorType[]) f2209a.clone();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @AutoValue
    public static abstract class StateError {
        /* JADX INFO: renamed from: a */
        public static StateError m1224a(int i) {
            return new AutoValue_CameraState_StateError(i, null);
        }

        /* JADX INFO: renamed from: b */
        public static StateError m1225b(int i, Throwable th) {
            return new AutoValue_CameraState_StateError(i, th);
        }

        /* JADX INFO: renamed from: c */
        public abstract Throwable mo1193c();

        /* JADX INFO: renamed from: d */
        public abstract int mo1194d();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    public static final class Type {

        /* JADX INFO: renamed from: a */
        public static final Type f2210a;

        /* JADX INFO: renamed from: b */
        public static final Type f2211b;

        /* JADX INFO: renamed from: c */
        public static final Type f2212c;

        /* JADX INFO: renamed from: d */
        public static final Type f2213d;

        /* JADX INFO: renamed from: f */
        public static final Type f2214f;

        /* JADX INFO: renamed from: g */
        public static final /* synthetic */ Type[] f2215g;

        static {
            Type type = new Type("PENDING_OPEN", 0);
            f2210a = type;
            Type type2 = new Type("OPENING", 1);
            f2211b = type2;
            Type type3 = new Type("OPEN", 2);
            f2212c = type3;
            Type type4 = new Type("CLOSING", 3);
            f2213d = type4;
            Type type5 = new Type("CLOSED", 4);
            f2214f = type5;
            f2215g = new Type[]{type, type2, type3, type4, type5};
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f2215g.clone();
        }
    }

    /* JADX INFO: renamed from: a */
    public static CameraState m1222a(Type type) {
        return new AutoValue_CameraState(type, null);
    }

    /* JADX INFO: renamed from: b */
    public static CameraState m1223b(Type type, StateError stateError) {
        return new AutoValue_CameraState(type, stateError);
    }

    /* JADX INFO: renamed from: c */
    public abstract StateError mo1191c();

    /* JADX INFO: renamed from: d */
    public abstract Type mo1192d();
}
