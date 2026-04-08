package com.google.android.datatransport;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final class Encoding {
    private final String name;

    private Encoding(@NonNull String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.name = str;
    }

    /* JADX INFO: renamed from: of */
    public static Encoding m14408of(@NonNull String str) {
        return new Encoding(str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Encoding) {
            return this.name.equals(((Encoding) obj).name);
        }
        return false;
    }

    public String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.name.hashCode() ^ 1000003;
    }

    @NonNull
    public String toString() {
        return AbstractC0000a.m19p(new StringBuilder("Encoding{name=\""), this.name, "\"}");
    }
}
