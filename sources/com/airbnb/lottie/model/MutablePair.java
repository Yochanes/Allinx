package com.airbnb.lottie.model;

import androidx.annotation.RestrictTo;
import androidx.core.util.Pair;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
public class MutablePair<T> {

    /* JADX INFO: renamed from: a */
    public String f34512a;

    /* JADX INFO: renamed from: b */
    public String f34513b;

    public final boolean equals(Object obj) {
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.f23338a;
        String str = this.f34512a;
        if (obj2 != str && (obj2 == null || !obj2.equals(str))) {
            return false;
        }
        String str2 = this.f34513b;
        Object obj3 = pair.f23339b;
        if (obj3 != str2) {
            return obj3 != null && obj3.equals(str2);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f34512a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f34513b;
        return iHashCode ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "Pair{" + ((Object) this.f34512a) + " " + ((Object) this.f34513b) + "}";
    }
}
