package androidx.constraintlayout.core;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class Pools {

    /* JADX INFO: compiled from: Proguard */
    public interface Pool<T> {
    }

    /* JADX INFO: compiled from: Proguard */
    public static class SimplePool<T> implements Pool<T> {

        /* JADX INFO: renamed from: a */
        public final Object[] f21169a = new Object[256];

        /* JADX INFO: renamed from: b */
        public int f21170b;

        /* JADX INFO: renamed from: a */
        public final boolean m6838a(ArrayRow arrayRow) {
            int i = this.f21170b;
            Object[] objArr = this.f21169a;
            if (i >= objArr.length) {
                return false;
            }
            objArr[i] = arrayRow;
            this.f21170b = i + 1;
            return true;
        }
    }
}
