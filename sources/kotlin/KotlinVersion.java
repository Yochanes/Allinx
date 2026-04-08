package kotlin;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@SinceKotlin
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lkotlin/KotlinVersion;", "", "Companion", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class KotlinVersion implements Comparable<KotlinVersion> {

    /* JADX INFO: renamed from: f */
    public static final KotlinVersion f51416f = new KotlinVersion(2, 1, 10);

    /* JADX INFO: renamed from: a */
    public final int f51417a;

    /* JADX INFO: renamed from: b */
    public final int f51418b;

    /* JADX INFO: renamed from: c */
    public final int f51419c;

    /* JADX INFO: renamed from: d */
    public final int f51420d;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m18302d2 = {"Lkotlin/KotlinVersion$Companion;", "", "", "MAX_COMPONENT_VALUE", "I", "Lkotlin/KotlinVersion;", "CURRENT", "Lkotlin/KotlinVersion;", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final class Companion {
    }

    public KotlinVersion(int i, int i2, int i3) {
        this.f51417a = i;
        this.f51418b = i2;
        this.f51419c = i3;
        if (i >= 0 && i < 256 && i2 >= 0 && i2 < 256 && i3 >= 0 && i3 < 256) {
            this.f51420d = (i << 16) + (i2 << 8) + i3;
            return;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i + '.' + i2 + '.' + i3).toString());
    }

    @Override // java.lang.Comparable
    public final int compareTo(KotlinVersion kotlinVersion) {
        KotlinVersion other = kotlinVersion;
        Intrinsics.m18599g(other, "other");
        return this.f51420d - other.f51420d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        KotlinVersion kotlinVersion = obj instanceof KotlinVersion ? (KotlinVersion) obj : null;
        return kotlinVersion != null && this.f51420d == kotlinVersion.f51420d;
    }

    /* JADX INFO: renamed from: hashCode, reason: from getter */
    public final int getF51420d() {
        return this.f51420d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f51417a);
        sb.append('.');
        sb.append(this.f51418b);
        sb.append('.');
        sb.append(this.f51419c);
        return sb.toString();
    }
}
