package androidx.camera.extensions.internal;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class AutoValue_Version extends Version {

    /* JADX INFO: renamed from: c */
    public final int f3215c;

    /* JADX INFO: renamed from: d */
    public final int f3216d;

    /* JADX INFO: renamed from: f */
    public final int f3217f;

    /* JADX INFO: renamed from: g */
    public final String f3218g;

    public AutoValue_Version(int i, int i2, int i3, String str) {
        this.f3215c = i;
        this.f3216d = i2;
        this.f3217f = i3;
        if (str == null) {
            throw new NullPointerException("Null description");
        }
        this.f3218g = str;
    }

    @Override // androidx.camera.extensions.internal.Version
    /* JADX INFO: renamed from: c */
    public final String mo1743c() {
        return this.f3218g;
    }

    @Override // androidx.camera.extensions.internal.Version
    /* JADX INFO: renamed from: d */
    public final int mo1744d() {
        return this.f3215c;
    }

    @Override // androidx.camera.extensions.internal.Version
    /* JADX INFO: renamed from: e */
    public final int mo1745e() {
        return this.f3216d;
    }

    @Override // androidx.camera.extensions.internal.Version
    /* JADX INFO: renamed from: f */
    public final int mo1746f() {
        return this.f3217f;
    }
}
