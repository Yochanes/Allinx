package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class NameResolverUtilKt {
    /* JADX INFO: renamed from: a */
    public static final ClassId m20028a(NameResolver nameResolver, int i) {
        Intrinsics.m18599g(nameResolver, "<this>");
        return ClassId.m19575e(nameResolver.mo19532a(i), nameResolver.mo19533b(i));
    }

    /* JADX INFO: renamed from: b */
    public static final Name m20029b(NameResolver nameResolver, int i) {
        Intrinsics.m18599g(nameResolver, "<this>");
        return Name.m19604d(nameResolver.getString(i));
    }
}
