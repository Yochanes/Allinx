package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public interface NewKotlinTypeChecker extends KotlinTypeChecker {

    /* JADX INFO: renamed from: b */
    public static final Companion f54924b = Companion.f54925a;

    /* JADX INFO: compiled from: Proguard */
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f54925a = new Companion();

        /* JADX INFO: renamed from: b */
        public static final NewKotlinTypeCheckerImpl f54926b = new NewKotlinTypeCheckerImpl();
    }

    /* JADX INFO: renamed from: a */
    OverridingUtil mo20281a();

    /* JADX INFO: renamed from: b */
    KotlinTypeRefiner mo20282b();
}
