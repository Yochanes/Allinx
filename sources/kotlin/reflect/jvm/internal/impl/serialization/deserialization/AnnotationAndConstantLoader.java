package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public interface AnnotationAndConstantLoader<A, C> extends AnnotationLoader<A> {
    /* JADX INFO: renamed from: d */
    Object mo19342d(ProtoContainer protoContainer, ProtoBuf.Property property, KotlinType kotlinType);

    /* JADX INFO: renamed from: k */
    Object mo19343k(ProtoContainer protoContainer, ProtoBuf.Property property, KotlinType kotlinType);
}
