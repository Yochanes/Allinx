package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
final class zzlq<K> implements Iterator<Map.Entry<K, Object>> {
    private Iterator<Map.Entry<K, Object>> zza;

    public zzlq(Iterator<Map.Entry<K, Object>> it) {
        this.zza = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Map.Entry<K, Object> next = this.zza.next();
        return next.getValue() instanceof zzlp ? new zzlo(next, null) : next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.zza.remove();
    }
}
