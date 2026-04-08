package kotlin.reflect.jvm.internal.impl.descriptors.deserialization;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public interface PlatformDependentTypeTransformer {

    /* JADX INFO: compiled from: Proguard */
    public static final class None implements PlatformDependentTypeTransformer {

        /* JADX INFO: renamed from: a */
        public static final None f52396a = new None();

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentTypeTransformer
        /* JADX INFO: renamed from: a */
        public final SimpleType mo19000a(ClassId classId, SimpleType computedType) {
            Intrinsics.m18599g(computedType, "computedType");
            return computedType;
        }
    }

    /* JADX INFO: renamed from: a */
    SimpleType mo19000a(ClassId classId, SimpleType simpleType);
}
