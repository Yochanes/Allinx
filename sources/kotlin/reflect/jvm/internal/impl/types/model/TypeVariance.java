package kotlin.reflect.jvm.internal.impl.types.model;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public enum TypeVariance {
    IN("in"),
    OUT("out"),
    INV("");


    /* JADX INFO: renamed from: a */
    public final String f55008a;

    TypeVariance(String str) {
        this.f55008a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f55008a;
    }
}
