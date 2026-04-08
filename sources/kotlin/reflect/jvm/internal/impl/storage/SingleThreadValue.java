package kotlin.reflect.jvm.internal.impl.storage;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
class SingleThreadValue<T> {

    /* JADX INFO: renamed from: a */
    public final Object f54771a;

    /* JADX INFO: renamed from: b */
    public final Thread f54772b = Thread.currentThread();

    public SingleThreadValue(Object obj) {
        this.f54771a = obj;
    }
}
