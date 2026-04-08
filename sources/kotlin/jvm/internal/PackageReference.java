package kotlin.jvm.internal;

import kotlin.Metadata;
import kotlin.SinceKotlin;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@SinceKotlin
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlin/jvm/internal/PackageReference;", "Lkotlin/jvm/internal/ClassBasedDeclarationContainer;", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class PackageReference implements ClassBasedDeclarationContainer {

    /* JADX INFO: renamed from: a */
    public final Class f51654a;

    public PackageReference(Class jClass, String str) {
        Intrinsics.m18599g(jClass, "jClass");
        this.f51654a = jClass;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof PackageReference) {
            return Intrinsics.m18594b(this.f51654a, ((PackageReference) obj).f51654a);
        }
        return false;
    }

    @Override // kotlin.jvm.internal.ClassBasedDeclarationContainer
    /* JADX INFO: renamed from: f, reason: from getter */
    public final Class getF51654a() {
        return this.f51654a;
    }

    public final int hashCode() {
        return this.f51654a.hashCode();
    }

    public final String toString() {
        return this.f51654a + " (Kotlin reflection is not available)";
    }
}
