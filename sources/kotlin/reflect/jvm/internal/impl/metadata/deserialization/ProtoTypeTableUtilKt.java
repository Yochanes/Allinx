package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension
public final class ProtoTypeTableUtilKt {
    /* JADX INFO: renamed from: a */
    public static final ProtoBuf.Type m19536a(ProtoBuf.Type type, TypeTable typeTable) {
        Intrinsics.m18599g(type, "<this>");
        int i = type.f53682c;
        if ((i & 256) == 256) {
            return type.f53692r;
        }
        if ((i & 512) == 512) {
            return typeTable.m19541a(type.f53693s);
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static final ProtoBuf.Type m19537b(ProtoBuf.Function function, TypeTable typeTable) {
        Intrinsics.m18599g(function, "<this>");
        Intrinsics.m18599g(typeTable, "typeTable");
        int i = function.f53540c;
        if ((i & 32) == 32) {
            return function.f53547o;
        }
        if ((i & 64) == 64) {
            return typeTable.m19541a(function.f53548p);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static final ProtoBuf.Type m19538c(ProtoBuf.Function function, TypeTable typeTable) {
        Intrinsics.m18599g(function, "<this>");
        Intrinsics.m18599g(typeTable, "typeTable");
        int i = function.f53540c;
        if ((i & 8) == 8) {
            ProtoBuf.Type returnType = function.f53544i;
            Intrinsics.m18598f(returnType, "returnType");
            return returnType;
        }
        if ((i & 16) == 16) {
            return typeTable.m19541a(function.f53545j);
        }
        throw new IllegalStateException("No returnType in ProtoBuf.Function");
    }

    /* JADX INFO: renamed from: d */
    public static final ProtoBuf.Type m19539d(ProtoBuf.Property property, TypeTable typeTable) {
        Intrinsics.m18599g(property, "<this>");
        Intrinsics.m18599g(typeTable, "typeTable");
        int i = property.f53612c;
        if ((i & 8) == 8) {
            ProtoBuf.Type returnType = property.f53616i;
            Intrinsics.m18598f(returnType, "returnType");
            return returnType;
        }
        if ((i & 16) == 16) {
            return typeTable.m19541a(property.f53617j);
        }
        throw new IllegalStateException("No returnType in ProtoBuf.Property");
    }

    /* JADX INFO: renamed from: e */
    public static final ProtoBuf.Type m19540e(ProtoBuf.ValueParameter valueParameter, TypeTable typeTable) {
        Intrinsics.m18599g(typeTable, "typeTable");
        int i = valueParameter.f53797c;
        if ((i & 4) == 4) {
            ProtoBuf.Type type = valueParameter.f53800g;
            Intrinsics.m18598f(type, "type");
            return type;
        }
        if ((i & 8) == 8) {
            return typeTable.m19541a(valueParameter.f53801i);
        }
        throw new IllegalStateException("No type in ProtoBuf.ValueParameter");
    }
}
