package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.name.ClassId;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
final class DeserializedPackageFragmentImpl$classDataFinder$1 extends Lambda implements Function1<ClassId, SourceElement> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ DeserializedPackageFragmentImpl f54558a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedPackageFragmentImpl$classDataFinder$1(DeserializedPackageFragmentImpl deserializedPackageFragmentImpl) {
        super(1);
        this.f54558a = deserializedPackageFragmentImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ClassId it = (ClassId) obj;
        Intrinsics.m18599g(it, "it");
        this.f54558a.getClass();
        return SourceElement.f52298a;
    }
}
