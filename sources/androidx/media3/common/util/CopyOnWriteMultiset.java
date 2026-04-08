package androidx.media3.common.util;

import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class CopyOnWriteMultiset<E> implements Iterable<E> {

    /* JADX INFO: renamed from: a */
    public final Object f25588a = new Object();

    /* JADX INFO: renamed from: b */
    public final HashMap f25589b = new HashMap();

    /* JADX INFO: renamed from: c */
    public Set f25590c = Collections.EMPTY_SET;

    /* JADX INFO: renamed from: d */
    public List f25591d = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: a */
    public final int m9478a(DrmSessionEventListener.EventDispatcher eventDispatcher) {
        int iIntValue;
        synchronized (this.f25588a) {
            try {
                iIntValue = this.f25589b.containsKey(eventDispatcher) ? ((Integer) this.f25589b.get(eventDispatcher)).intValue() : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iIntValue;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator<E> it;
        synchronized (this.f25588a) {
            it = this.f25591d.iterator();
        }
        return it;
    }
}
