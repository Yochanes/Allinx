package autodispose2;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class OutsideScopeException extends RuntimeException {
    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return this;
    }
}
