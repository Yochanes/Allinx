package androidx.camera.core.impl;

import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class AutoValue_Identifier extends Identifier {

    /* JADX INFO: renamed from: a */
    public final Object f2571a;

    public AutoValue_Identifier(Object obj) {
        this.f2571a = obj;
    }

    @Override // androidx.camera.core.impl.Identifier
    /* JADX INFO: renamed from: b */
    public final Object mo1407b() {
        return this.f2571a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Identifier) {
            return this.f2571a.equals(((Identifier) obj).mo1407b());
        }
        return false;
    }

    public final int hashCode() {
        return this.f2571a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return AbstractC0000a.m18o(new StringBuilder("Identifier{value="), this.f2571a, "}");
    }
}
