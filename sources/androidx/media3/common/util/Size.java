package androidx.media3.common.util;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class Size {

    /* JADX INFO: renamed from: c */
    public static final Size f25651c = new Size(-1, -1);

    /* JADX INFO: renamed from: a */
    public final int f25652a;

    /* JADX INFO: renamed from: b */
    public final int f25653b;

    static {
        new Size(0, 0);
    }

    public Size(int i, int i2) {
        Assertions.m9460a((i == -1 || i >= 0) && (i2 == -1 || i2 >= 0));
        this.f25652a = i;
        this.f25653b = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof Size) {
            Size size = (Size) obj;
            if (this.f25652a == size.f25652a && this.f25653b == size.f25653b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f25652a;
        return ((i >>> 16) | (i << 16)) ^ this.f25653b;
    }

    public final String toString() {
        return this.f25652a + "x" + this.f25653b;
    }
}
