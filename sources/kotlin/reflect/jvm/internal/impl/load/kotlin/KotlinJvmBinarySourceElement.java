package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class KotlinJvmBinarySourceElement implements DeserializedContainerSource {

    /* JADX INFO: renamed from: b */
    public final KotlinJvmBinaryClass f53271b;

    public KotlinJvmBinarySourceElement(KotlinJvmBinaryClass kotlinJvmBinaryClass, DeserializedContainerAbiStability deserializedContainerAbiStability) {
        this.f53271b = kotlinJvmBinaryClass;
    }

    public final String toString() {
        return "KotlinJvmBinarySourceElement: " + this.f53271b;
    }
}
