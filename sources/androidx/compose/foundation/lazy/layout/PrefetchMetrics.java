package androidx.compose.foundation.lazy.layout;

import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/lazy/layout/PrefetchMetrics;", "", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class PrefetchMetrics {

    /* JADX INFO: renamed from: a */
    public final Averages f7463a = new Averages();

    /* JADX INFO: renamed from: b */
    public final MutableScatterMap f7464b;

    /* JADX INFO: renamed from: c */
    public Object f7465c;

    /* JADX INFO: renamed from: d */
    public Averages f7466d;

    public PrefetchMetrics() {
        long[] jArr = ScatterMapKt.f3844a;
        this.f7464b = new MutableScatterMap();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: a */
    public final Averages m3095a(Object obj) {
        Averages averages = this.f7466d;
        if (this.f7465c == obj && averages != null) {
            return averages;
        }
        MutableScatterMap mutableScatterMap = this.f7464b;
        Object objM2109e = mutableScatterMap.m2109e(obj);
        Object obj2 = objM2109e;
        if (objM2109e == null) {
            Averages averages2 = new Averages();
            Averages averages3 = this.f7463a;
            averages2.f7176a = averages3.f7176a;
            averages2.f7177b = averages3.f7177b;
            mutableScatterMap.m2081m(obj, averages2);
            obj2 = averages2;
        }
        Averages averages4 = (Averages) obj2;
        this.f7465c = obj;
        this.f7466d = averages4;
        return averages4;
    }
}
