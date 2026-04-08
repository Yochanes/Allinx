package kotlin.random;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001\u0004¨\u0006\u0005"}, m18302d2 = {"Lkotlin/random/XorWowRandom;", "Lkotlin/random/Random;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "Companion", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
@SourceDebugExtension
public final class XorWowRandom extends Random implements Serializable {

    /* JADX INFO: renamed from: b */
    public int f51670b;

    /* JADX INFO: renamed from: c */
    public int f51671c;

    /* JADX INFO: renamed from: d */
    public int f51672d;

    /* JADX INFO: renamed from: f */
    public int f51673f;

    /* JADX INFO: renamed from: g */
    public int f51674g;

    /* JADX INFO: renamed from: i */
    public int f51675i;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m18302d2 = {"Lkotlin/random/XorWowRandom$Companion;", "", "", "serialVersionUID", "J", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final class Companion {
    }

    @Override // kotlin.random.Random
    /* JADX INFO: renamed from: a */
    public final int mo18643a(int i) {
        return ((-i) >> 31) & (mo18645d() >>> (32 - i));
    }

    @Override // kotlin.random.Random
    /* JADX INFO: renamed from: d */
    public final int mo18645d() {
        int i = this.f51670b;
        int i2 = i ^ (i >>> 2);
        this.f51670b = this.f51671c;
        this.f51671c = this.f51672d;
        this.f51672d = this.f51673f;
        int i3 = this.f51674g;
        this.f51673f = i3;
        int i4 = ((i2 ^ (i2 << 1)) ^ i3) ^ (i3 << 4);
        this.f51674g = i4;
        int i5 = this.f51675i + 362437;
        this.f51675i = i5;
        return i4 + i5;
    }
}
