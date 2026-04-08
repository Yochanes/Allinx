package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.name.ClassId;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt$findNonGenericClassAcrossDependencies$typeParametersCount$2 */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
final class C6026x24bfe127 extends Lambda implements Function1<ClassId, Integer> {

    /* JADX INFO: renamed from: a */
    public static final C6026x24bfe127 f52262a = new C6026x24bfe127(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ClassId it = (ClassId) obj;
        Intrinsics.m18599g(it, "it");
        return 0;
    }
}
