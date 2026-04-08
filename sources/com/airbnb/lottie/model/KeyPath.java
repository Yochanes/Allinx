package com.airbnb.lottie.model;

import androidx.compose.animation.AbstractC0455a;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class KeyPath {

    /* JADX INFO: renamed from: a */
    public final List f34506a;

    static {
        new KeyPath("COMPOSITION");
    }

    public KeyPath(String... strArr) {
        this.f34506a = Arrays.asList(strArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f34506a.equals(((KeyPath) obj).f34506a);
    }

    public final int hashCode() {
        return (this.f34506a.hashCode() * 31) + 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KeyPath{keys=");
        sb.append(this.f34506a);
        sb.append(",resolved=");
        return AbstractC0455a.m2243r(sb, false, '}');
    }
}
