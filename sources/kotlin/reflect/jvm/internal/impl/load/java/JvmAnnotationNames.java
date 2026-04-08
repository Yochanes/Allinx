package kotlin.reflect.jvm.internal.impl.load.java;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class JvmAnnotationNames {

    /* JADX INFO: renamed from: a */
    public static final FqName f52760a;

    /* JADX INFO: renamed from: b */
    public static final Name f52761b;

    /* JADX INFO: renamed from: c */
    public static final FqName f52762c;

    /* JADX INFO: renamed from: d */
    public static final FqName f52763d;

    /* JADX INFO: renamed from: e */
    public static final FqName f52764e;

    /* JADX INFO: renamed from: f */
    public static final FqName f52765f;

    /* JADX INFO: renamed from: g */
    public static final FqName f52766g;

    /* JADX INFO: renamed from: h */
    public static final FqName f52767h;

    /* JADX INFO: renamed from: i */
    public static final FqName f52768i;

    /* JADX INFO: renamed from: j */
    public static final FqName f52769j;

    /* JADX INFO: renamed from: k */
    public static final FqName f52770k;

    /* JADX INFO: renamed from: l */
    public static final FqName f52771l;

    /* JADX INFO: renamed from: m */
    public static final FqName f52772m;

    /* JADX INFO: renamed from: n */
    public static final FqName f52773n;

    /* JADX INFO: renamed from: o */
    public static final FqName f52774o;

    /* JADX INFO: renamed from: p */
    public static final FqName f52775p;

    /* JADX INFO: renamed from: q */
    public static final FqName f52776q;

    static {
        FqName fqName = new FqName("kotlin.Metadata");
        f52760a = fqName;
        JvmClassName.m19986c(fqName).m19988e();
        f52761b = Name.m19605e("value");
        f52762c = new FqName(Target.class.getName());
        new FqName(ElementType.class.getName());
        f52763d = new FqName(Retention.class.getName());
        new FqName(RetentionPolicy.class.getName());
        f52764e = new FqName(Deprecated.class.getName());
        f52765f = new FqName(Documented.class.getName());
        f52766g = new FqName("java.lang.annotation.Repeatable");
        f52767h = new FqName("org.jetbrains.annotations.NotNull");
        f52768i = new FqName("org.jetbrains.annotations.Nullable");
        f52769j = new FqName("org.jetbrains.annotations.Mutable");
        f52770k = new FqName("org.jetbrains.annotations.ReadOnly");
        f52771l = new FqName("kotlin.annotations.jvm.ReadOnly");
        f52772m = new FqName("kotlin.annotations.jvm.Mutable");
        f52773n = new FqName("kotlin.jvm.PurelyImplements");
        new FqName("kotlin.jvm.internal");
        FqName fqName2 = new FqName("kotlin.jvm.internal.SerializedIr");
        f52774o = fqName2;
        JvmClassName.m19986c(fqName2).m19988e();
        f52775p = new FqName("kotlin.jvm.internal.EnhancedNullability");
        f52776q = new FqName("kotlin.jvm.internal.EnhancedMutability");
    }
}
