package io.reactivex.rxjava3.schedulers;

import java.util.Objects;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class Timed<T> {

    /* JADX INFO: renamed from: a */
    public final Object f51301a;

    /* JADX INFO: renamed from: b */
    public final long f51302b;

    public Timed(long j, Object obj) {
        Objects.requireNonNull(obj, "value is null");
        this.f51301a = obj;
        this.f51302b = j;
        Objects.requireNonNull((Object) null, "unit is null");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Timed)) {
            return false;
        }
        Timed timed = (Timed) obj;
        return Objects.equals(this.f51301a, timed.f51301a) && this.f51302b == timed.f51302b;
    }

    public final int hashCode() {
        this.f51301a.hashCode();
        throw null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Timed[time=");
        sb.append(this.f51302b);
        sb.append(", unit=null, value=");
        return AbstractC0000a.m18o(sb, this.f51301a, "]");
    }
}
