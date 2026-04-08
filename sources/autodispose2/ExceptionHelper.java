package autodispose2;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class ExceptionHelper {

    /* JADX INFO: renamed from: a */
    public static final Throwable f33229a = new Termination("No further exceptions");

    /* JADX INFO: compiled from: Proguard */
    public static final class Termination extends Throwable {
        @Override // java.lang.Throwable
        public final synchronized Throwable fillInStackTrace() {
            return this;
        }
    }
}
