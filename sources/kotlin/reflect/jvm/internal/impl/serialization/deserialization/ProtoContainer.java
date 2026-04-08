package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmPackagePartSource;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ProtoContainer {

    /* JADX INFO: renamed from: a */
    public final NameResolver f54602a;

    /* JADX INFO: renamed from: b */
    public final TypeTable f54603b;

    /* JADX INFO: renamed from: c */
    public final SourceElement f54604c;

    /* JADX INFO: compiled from: Proguard */
    public static final class Class extends ProtoContainer {

        /* JADX INFO: renamed from: d */
        public final ProtoBuf.Class f54605d;

        /* JADX INFO: renamed from: e */
        public final Class f54606e;

        /* JADX INFO: renamed from: f */
        public final ClassId f54607f;

        /* JADX INFO: renamed from: g */
        public final ProtoBuf.Class.Kind f54608g;

        /* JADX INFO: renamed from: h */
        public final boolean f54609h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Class(ProtoBuf.Class classProto, NameResolver nameResolver, TypeTable typeTable, SourceElement sourceElement, Class r6) {
            super(nameResolver, typeTable, sourceElement);
            Intrinsics.m18599g(classProto, "classProto");
            Intrinsics.m18599g(nameResolver, "nameResolver");
            this.f54605d = classProto;
            this.f54606e = r6;
            this.f54607f = NameResolverUtilKt.m20028a(nameResolver, classProto.f53407f);
            ProtoBuf.Class.Kind kind = (ProtoBuf.Class.Kind) Flags.f53888f.mo19527c(classProto.f53406d);
            this.f54608g = kind == null ? ProtoBuf.Class.Kind.CLASS : kind;
            this.f54609h = Flags.f53889g.m19529e(classProto.f53406d).booleanValue();
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer
        /* JADX INFO: renamed from: a */
        public final FqName mo20030a() {
            return this.f54607f.m19577b();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Package extends ProtoContainer {

        /* JADX INFO: renamed from: d */
        public final FqName f54610d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Package(FqName fqName, NameResolver nameResolver, TypeTable typeTable, JvmPackagePartSource jvmPackagePartSource) {
            super(nameResolver, typeTable, jvmPackagePartSource);
            Intrinsics.m18599g(fqName, "fqName");
            Intrinsics.m18599g(nameResolver, "nameResolver");
            this.f54610d = fqName;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer
        /* JADX INFO: renamed from: a */
        public final FqName mo20030a() {
            return this.f54610d;
        }
    }

    public ProtoContainer(NameResolver nameResolver, TypeTable typeTable, SourceElement sourceElement) {
        this.f54602a = nameResolver;
        this.f54603b = typeTable;
        this.f54604c = sourceElement;
    }

    /* JADX INFO: renamed from: a */
    public abstract FqName mo20030a();

    public final String toString() {
        return getClass().getSimpleName() + ": " + mo20030a();
    }
}
