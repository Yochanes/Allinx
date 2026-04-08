package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypePreparator;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class NewKotlinTypeCheckerImpl implements NewKotlinTypeChecker {

    /* JADX INFO: renamed from: c */
    public final KotlinTypePreparator f54927c = KotlinTypePreparator.Default.f54905a;

    /* JADX INFO: renamed from: d */
    public final OverridingUtil f54928d = new OverridingUtil(OverridingUtil.f54341d);

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker
    /* JADX INFO: renamed from: a */
    public final OverridingUtil mo20281a() {
        return this.f54928d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker
    /* JADX INFO: renamed from: b */
    public final KotlinTypeRefiner mo20282b() {
        return KotlinTypeRefiner.Default.f54906a;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m20283c(KotlinType a2, KotlinType b2) {
        Intrinsics.m18599g(a2, "a");
        Intrinsics.m18599g(b2, "b");
        return AbstractTypeChecker.m20112e(ClassicTypeCheckerStateKt.m20216a(false, this.f54927c, 6), a2.mo20144L0(), b2.mo20144L0());
    }

    /* JADX INFO: renamed from: d */
    public final boolean m20284d(KotlinType subtype, KotlinType supertype) {
        Intrinsics.m18599g(subtype, "subtype");
        Intrinsics.m18599g(supertype, "supertype");
        return AbstractTypeChecker.m20116i(AbstractTypeChecker.f54775a, ClassicTypeCheckerStateKt.m20216a(true, this.f54927c, 6), subtype.mo20144L0(), supertype.mo20144L0());
    }
}
