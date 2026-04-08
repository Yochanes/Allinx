package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import kotlin.reflect.jvm.internal.impl.name.ClassId;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class KotlinClassFinderKt {
    /* JADX INFO: renamed from: a */
    public static final KotlinJvmBinaryClass m19396a(KotlinClassFinder kotlinClassFinder, ClassId classId, JvmMetadataVersion jvmMetadataVersion) {
        Intrinsics.m18599g(kotlinClassFinder, "<this>");
        Intrinsics.m18599g(classId, "classId");
        Intrinsics.m18599g(jvmMetadataVersion, "jvmMetadataVersion");
        KotlinClassFinder.Result.KotlinClass kotlinClassMo19110a = kotlinClassFinder.mo19110a(classId, jvmMetadataVersion);
        if (kotlinClassMo19110a != null) {
            return kotlinClassMo19110a.f53269a;
        }
        return null;
    }
}
