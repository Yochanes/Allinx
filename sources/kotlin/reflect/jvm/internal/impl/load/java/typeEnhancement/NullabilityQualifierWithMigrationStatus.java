package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import androidx.compose.animation.AbstractC0455a;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class NullabilityQualifierWithMigrationStatus {

    /* JADX INFO: renamed from: a */
    public final NullabilityQualifier f53133a;

    /* JADX INFO: renamed from: b */
    public final boolean f53134b;

    public NullabilityQualifierWithMigrationStatus(NullabilityQualifier nullabilityQualifier) {
        this.f53133a = nullabilityQualifier;
        this.f53134b = false;
    }

    /* JADX INFO: renamed from: a */
    public static NullabilityQualifierWithMigrationStatus m19329a(NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus, NullabilityQualifier qualifier, boolean z2, int i) {
        if ((i & 1) != 0) {
            qualifier = nullabilityQualifierWithMigrationStatus.f53133a;
        }
        if ((i & 2) != 0) {
            z2 = nullabilityQualifierWithMigrationStatus.f53134b;
        }
        nullabilityQualifierWithMigrationStatus.getClass();
        Intrinsics.m18599g(qualifier, "qualifier");
        return new NullabilityQualifierWithMigrationStatus(qualifier, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NullabilityQualifierWithMigrationStatus)) {
            return false;
        }
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus = (NullabilityQualifierWithMigrationStatus) obj;
        return this.f53133a == nullabilityQualifierWithMigrationStatus.f53133a && this.f53134b == nullabilityQualifierWithMigrationStatus.f53134b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public final int hashCode() {
        int iHashCode = this.f53133a.hashCode() * 31;
        boolean z2 = this.f53134b;
        ?? r1 = z2;
        if (z2) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NullabilityQualifierWithMigrationStatus(qualifier=");
        sb.append(this.f53133a);
        sb.append(", isForWarningOnly=");
        return AbstractC0455a.m2243r(sb, this.f53134b, ')');
    }

    public NullabilityQualifierWithMigrationStatus(NullabilityQualifier nullabilityQualifier, boolean z2) {
        this.f53133a = nullabilityQualifier;
        this.f53134b = z2;
    }
}
