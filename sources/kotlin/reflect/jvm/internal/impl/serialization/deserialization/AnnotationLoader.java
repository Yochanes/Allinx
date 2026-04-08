package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public interface AnnotationLoader<A> {
    /* JADX INFO: renamed from: a */
    ArrayList mo19351a(ProtoBuf.TypeParameter typeParameter, NameResolver nameResolver);

    /* JADX INFO: renamed from: b */
    ArrayList mo19352b(ProtoContainer.Class r1);

    /* JADX INFO: renamed from: c */
    ArrayList mo19353c(ProtoBuf.Type type, NameResolver nameResolver);

    /* JADX INFO: renamed from: e */
    List mo19354e(ProtoContainer protoContainer, ProtoBuf.EnumEntry enumEntry);

    /* JADX INFO: renamed from: f */
    List mo19355f(ProtoContainer protoContainer, GeneratedMessageLite.ExtendableMessage extendableMessage, AnnotatedCallableKind annotatedCallableKind, int i, ProtoBuf.ValueParameter valueParameter);

    /* JADX INFO: renamed from: g */
    List mo19356g(ProtoContainer protoContainer, GeneratedMessageLite.ExtendableMessage extendableMessage, AnnotatedCallableKind annotatedCallableKind);

    /* JADX INFO: renamed from: h */
    List mo19357h(ProtoContainer protoContainer, ProtoBuf.Property property);

    /* JADX INFO: renamed from: i */
    List mo19358i(ProtoContainer protoContainer, ProtoBuf.Property property);

    /* JADX INFO: renamed from: j */
    List mo19359j(ProtoContainer protoContainer, GeneratedMessageLite.ExtendableMessage extendableMessage, AnnotatedCallableKind annotatedCallableKind);
}
