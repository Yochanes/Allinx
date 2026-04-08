package androidx.emoji2.text.flatbuffer;

/* JADX INFO: renamed from: androidx.emoji2.text.flatbuffer.b */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1643b extends ThreadLocal {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1642a f24378a;

    public /* synthetic */ C1643b(C1642a c1642a) {
        this.f24378a = c1642a;
    }

    @Override // java.lang.ThreadLocal
    public final /* synthetic */ Object initialValue() {
        return this.f24378a.get();
    }
}
