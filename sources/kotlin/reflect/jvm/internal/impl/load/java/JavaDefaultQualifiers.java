package kotlin.reflect.jvm.internal.impl.load.java;

import androidx.compose.animation.AbstractC0455a;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class JavaDefaultQualifiers {

    /* JADX INFO: renamed from: a */
    public final NullabilityQualifierWithMigrationStatus f52731a;

    /* JADX INFO: renamed from: b */
    public final Collection f52732b;

    /* JADX INFO: renamed from: c */
    public final boolean f52733c;

    public JavaDefaultQualifiers(NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus, Collection qualifierApplicabilityTypes, boolean z2) {
        Intrinsics.m18599g(qualifierApplicabilityTypes, "qualifierApplicabilityTypes");
        this.f52731a = nullabilityQualifierWithMigrationStatus;
        this.f52732b = qualifierApplicabilityTypes;
        this.f52733c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JavaDefaultQualifiers)) {
            return false;
        }
        JavaDefaultQualifiers javaDefaultQualifiers = (JavaDefaultQualifiers) obj;
        return Intrinsics.m18594b(this.f52731a, javaDefaultQualifiers.f52731a) && Intrinsics.m18594b(this.f52732b, javaDefaultQualifiers.f52732b) && this.f52733c == javaDefaultQualifiers.f52733c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public final int hashCode() {
        int iHashCode = (this.f52732b.hashCode() + (this.f52731a.hashCode() * 31)) * 31;
        boolean z2 = this.f52733c;
        ?? r0 = z2;
        if (z2) {
            r0 = 1;
        }
        return iHashCode + r0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JavaDefaultQualifiers(nullabilityQualifier=");
        sb.append(this.f52731a);
        sb.append(", qualifierApplicabilityTypes=");
        sb.append(this.f52732b);
        sb.append(", definitelyNotNull=");
        return AbstractC0455a.m2243r(sb, this.f52733c, ')');
    }

    public JavaDefaultQualifiers(NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus, Collection collection) {
        this(nullabilityQualifierWithMigrationStatus, collection, nullabilityQualifierWithMigrationStatus.f53133a == NullabilityQualifier.f53131c);
    }
}
