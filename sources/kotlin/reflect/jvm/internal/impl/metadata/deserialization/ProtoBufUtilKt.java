package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class ProtoBufUtilKt {
    /* JADX INFO: renamed from: a */
    public static final Object m19535a(GeneratedMessageLite.ExtendableMessage extendableMessage, GeneratedMessageLite.GeneratedExtension extension) {
        Intrinsics.m18599g(extendableMessage, "<this>");
        Intrinsics.m18599g(extension, "extension");
        if (extendableMessage.m19703i(extension)) {
            return extendableMessage.m19700f(extension);
        }
        return null;
    }
}
