package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.reflect.jvm.internal.impl.descriptors.DeserializedDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public interface DeserializedMemberDescriptor extends DeserializedDescriptor, MemberDescriptor, DescriptorWithContainerSource {
    /* JADX INFO: renamed from: N */
    TypeTable mo20045N();

    /* JADX INFO: renamed from: T */
    NameResolver mo20046T();

    /* JADX INFO: renamed from: W */
    DeserializedContainerSource mo20048W();

    /* JADX INFO: renamed from: x */
    MessageLite mo20049x();
}
