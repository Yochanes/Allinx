package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public interface KotlinTypeChecker {

    /* JADX INFO: renamed from: a */
    public static final NewKotlinTypeCheckerImpl f54904a;

    /* JADX INFO: compiled from: Proguard */
    public interface TypeConstructorEquality {
        /* JADX INFO: renamed from: a */
        boolean mo19816a(TypeConstructor typeConstructor, TypeConstructor typeConstructor2);
    }

    static {
        NewKotlinTypeChecker.f54924b.getClass();
        f54904a = NewKotlinTypeChecker.Companion.f54926b;
    }
}
