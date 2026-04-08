package androidx.work;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public interface Operation {

    /* JADX INFO: renamed from: a */
    public static final State.SUCCESS f32594a = new State.SUCCESS();

    /* JADX INFO: renamed from: b */
    public static final State.IN_PROGRESS f32595b = new State.IN_PROGRESS();

    /* JADX INFO: compiled from: Proguard */
    public static abstract class State {

        /* JADX INFO: compiled from: Proguard */
        public static final class FAILURE extends State {

            /* JADX INFO: renamed from: a */
            public final Throwable f32596a;

            public FAILURE(Throwable th) {
                this.f32596a = th;
            }

            public final String toString() {
                return "FAILURE (" + this.f32596a.getMessage() + ")";
            }
        }

        /* JADX INFO: compiled from: Proguard */
        public static final class IN_PROGRESS extends State {
            public final String toString() {
                return "IN_PROGRESS";
            }
        }

        /* JADX INFO: compiled from: Proguard */
        public static final class SUCCESS extends State {
            public final String toString() {
                return "SUCCESS";
            }
        }
    }
}
