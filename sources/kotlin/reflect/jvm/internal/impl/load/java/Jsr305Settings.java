package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class Jsr305Settings {

    /* JADX INFO: renamed from: a */
    public final ReportLevel f52752a;

    /* JADX INFO: renamed from: b */
    public final ReportLevel f52753b;

    /* JADX INFO: renamed from: c */
    public final Map f52754c;

    /* JADX INFO: renamed from: d */
    public final Lazy f52755d;

    /* JADX INFO: renamed from: e */
    public final boolean f52756e;

    public Jsr305Settings(ReportLevel reportLevel, ReportLevel reportLevel2) {
        Map mapM18481d = MapsKt.m18481d();
        this.f52752a = reportLevel;
        this.f52753b = reportLevel2;
        this.f52754c = mapM18481d;
        this.f52755d = LazyKt.m18299b(new Jsr305Settings$description$2(this));
        ReportLevel reportLevel3 = ReportLevel.IGNORE;
        this.f52756e = reportLevel == reportLevel3 && reportLevel2 == reportLevel3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Jsr305Settings)) {
            return false;
        }
        Jsr305Settings jsr305Settings = (Jsr305Settings) obj;
        return this.f52752a == jsr305Settings.f52752a && this.f52753b == jsr305Settings.f52753b && Intrinsics.m18594b(this.f52754c, jsr305Settings.f52754c);
    }

    public final int hashCode() {
        int iHashCode = this.f52752a.hashCode() * 31;
        ReportLevel reportLevel = this.f52753b;
        return this.f52754c.hashCode() + ((iHashCode + (reportLevel == null ? 0 : reportLevel.hashCode())) * 31);
    }

    public final String toString() {
        return "Jsr305Settings(globalLevel=" + this.f52752a + ", migrationLevel=" + this.f52753b + ", userDefinedLevelForSpecificAnnotation=" + this.f52754c + ')';
    }
}
