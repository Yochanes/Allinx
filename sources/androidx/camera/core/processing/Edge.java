package androidx.camera.core.processing;

import androidx.core.util.Consumer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class Edge<T> implements Consumer<T> {

    /* JADX INFO: renamed from: a */
    public Consumer f3073a;

    @Override // androidx.core.util.Consumer
    public final void accept(Object obj) {
        Intrinsics.m18597e(this.f3073a, "Listener is not set.");
        this.f3073a.accept(obj);
    }
}
