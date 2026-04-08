package androidx.constraintlayout.core.parser;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class CLParsingException extends Exception {

    /* JADX INFO: renamed from: a */
    public final String f21536a;

    /* JADX INFO: renamed from: b */
    public final int f21537b;

    /* JADX INFO: renamed from: c */
    public final String f21538c;

    public CLParsingException(String str, CLElement cLElement) {
        super(str);
        this.f21536a = str;
        if (cLElement != null) {
            this.f21538c = cLElement.m6959f();
            this.f21537b = 0;
        } else {
            this.f21538c = "unknown";
            this.f21537b = 0;
        }
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder("CLParsingException (");
        sb.append(hashCode());
        sb.append(") : ");
        sb.append(this.f21536a + " (" + this.f21538c + " at line " + this.f21537b + ")");
        return sb.toString();
    }
}
