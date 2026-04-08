package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.KotlinVersion;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class JavaNullabilityAnnotationsStatus {

    /* JADX INFO: renamed from: d */
    public static final JavaNullabilityAnnotationsStatus f52742d = new JavaNullabilityAnnotationsStatus(ReportLevel.STRICT, 6);

    /* JADX INFO: renamed from: a */
    public final ReportLevel f52743a;

    /* JADX INFO: renamed from: b */
    public final KotlinVersion f52744b;

    /* JADX INFO: renamed from: c */
    public final ReportLevel f52745c;

    /* JADX INFO: compiled from: Proguard */
    public static final class Companion {
    }

    public JavaNullabilityAnnotationsStatus(ReportLevel reportLevel, KotlinVersion kotlinVersion, ReportLevel reportLevel2) {
        this.f52743a = reportLevel;
        this.f52744b = kotlinVersion;
        this.f52745c = reportLevel2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JavaNullabilityAnnotationsStatus)) {
            return false;
        }
        JavaNullabilityAnnotationsStatus javaNullabilityAnnotationsStatus = (JavaNullabilityAnnotationsStatus) obj;
        return this.f52743a == javaNullabilityAnnotationsStatus.f52743a && Intrinsics.m18594b(this.f52744b, javaNullabilityAnnotationsStatus.f52744b) && this.f52745c == javaNullabilityAnnotationsStatus.f52745c;
    }

    public final int hashCode() {
        int iHashCode = this.f52743a.hashCode() * 31;
        KotlinVersion kotlinVersion = this.f52744b;
        return this.f52745c.hashCode() + ((iHashCode + (kotlinVersion == null ? 0 : kotlinVersion.f51420d)) * 31);
    }

    public final String toString() {
        return "JavaNullabilityAnnotationsStatus(reportLevelBefore=" + this.f52743a + ", sinceVersion=" + this.f52744b + ", reportLevelAfter=" + this.f52745c + ')';
    }

    public JavaNullabilityAnnotationsStatus(ReportLevel reportLevel, int i) {
        this(reportLevel, (i & 2) != 0 ? new KotlinVersion(1, 0, 0) : null, reportLevel);
    }
}
