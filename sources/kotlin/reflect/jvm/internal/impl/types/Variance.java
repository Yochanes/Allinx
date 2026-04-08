package kotlin.reflect.jvm.internal.impl.types;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public enum Variance {
    f54896c("", true),
    f54897d("in", false),
    f54898f("out", true);


    /* JADX INFO: renamed from: a */
    public final String f54900a;

    /* JADX INFO: renamed from: b */
    public final boolean f54901b;

    Variance(String str, boolean z2) {
        this.f54900a = str;
        this.f54901b = z2;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f54900a;
    }
}
