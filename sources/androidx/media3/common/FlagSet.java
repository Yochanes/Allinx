package androidx.media3.common;

import android.util.SparseBooleanArray;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class FlagSet {

    /* JADX INFO: renamed from: a */
    public final SparseBooleanArray f25130a;

    /* JADX INFO: compiled from: Proguard */
    public static final class Builder {

        /* JADX INFO: renamed from: a */
        public final SparseBooleanArray f25131a = new SparseBooleanArray();

        /* JADX INFO: renamed from: b */
        public boolean f25132b;

        /* JADX INFO: renamed from: a */
        public final void m9245a(int i) {
            Assertions.m9464e(!this.f25132b);
            this.f25131a.append(i, true);
        }

        /* JADX INFO: renamed from: b */
        public final FlagSet m9246b() {
            Assertions.m9464e(!this.f25132b);
            this.f25132b = true;
            return new FlagSet(this.f25131a);
        }
    }

    public FlagSet(SparseBooleanArray sparseBooleanArray) {
        this.f25130a = sparseBooleanArray;
    }

    /* JADX INFO: renamed from: a */
    public final int m9244a(int i) {
        SparseBooleanArray sparseBooleanArray = this.f25130a;
        Assertions.m9462c(i, sparseBooleanArray.size());
        return sparseBooleanArray.keyAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlagSet)) {
            return false;
        }
        FlagSet flagSet = (FlagSet) obj;
        int i = Util.f25665a;
        SparseBooleanArray sparseBooleanArray = this.f25130a;
        if (i >= 24) {
            return sparseBooleanArray.equals(flagSet.f25130a);
        }
        if (sparseBooleanArray.size() != flagSet.f25130a.size()) {
            return false;
        }
        for (int i2 = 0; i2 < sparseBooleanArray.size(); i2++) {
            if (m9244a(i2) != flagSet.m9244a(i2)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = Util.f25665a;
        SparseBooleanArray sparseBooleanArray = this.f25130a;
        if (i >= 24) {
            return sparseBooleanArray.hashCode();
        }
        int size = sparseBooleanArray.size();
        for (int i2 = 0; i2 < sparseBooleanArray.size(); i2++) {
            size = (size * 31) + m9244a(i2);
        }
        return size;
    }
}
