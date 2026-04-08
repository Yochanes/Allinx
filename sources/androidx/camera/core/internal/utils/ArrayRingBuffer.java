package androidx.camera.core.internal.utils;

import androidx.camera.camera2.internal.C0216q;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class ArrayRingBuffer<T> implements RingBuffer<T> {

    /* JADX INFO: renamed from: c */
    public final C0216q f3010c;

    /* JADX INFO: renamed from: b */
    public final Object f3009b = new Object();

    /* JADX INFO: renamed from: a */
    public final ArrayDeque f3008a = new ArrayDeque(3);

    public ArrayRingBuffer(C0216q c0216q) {
        this.f3010c = c0216q;
    }

    /* JADX INFO: renamed from: a */
    public final Object m1661a() {
        Object objRemoveLast;
        synchronized (this.f3009b) {
            objRemoveLast = this.f3008a.removeLast();
        }
        return objRemoveLast;
    }
}
