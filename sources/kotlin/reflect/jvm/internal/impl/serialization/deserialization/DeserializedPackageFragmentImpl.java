package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.builtins.BuiltInsBinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolverImpl;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPackageMemberScope;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class DeserializedPackageFragmentImpl extends DeserializedPackageFragment {

    /* JADX INFO: renamed from: i */
    public final BuiltInsBinaryVersion f54553i;

    /* JADX INFO: renamed from: j */
    public final NameResolverImpl f54554j;

    /* JADX INFO: renamed from: n */
    public final ProtoBasedClassDataFinder f54555n;

    /* JADX INFO: renamed from: o */
    public ProtoBuf.PackageFragment f54556o;

    /* JADX INFO: renamed from: p */
    public DeserializedPackageMemberScope f54557p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedPackageFragmentImpl(FqName fqName, LockBasedStorageManager lockBasedStorageManager, ModuleDescriptor module, ProtoBuf.PackageFragment packageFragment, BuiltInsBinaryVersion builtInsBinaryVersion) {
        super(module, fqName);
        Intrinsics.m18599g(fqName, "fqName");
        Intrinsics.m18599g(module, "module");
        Intrinsics.m18599g(fqName, "fqName");
        Intrinsics.m18599g(module, "module");
        this.f54553i = builtInsBinaryVersion;
        ProtoBuf.StringTable stringTable = packageFragment.f53598d;
        Intrinsics.m18598f(stringTable, "proto.strings");
        ProtoBuf.QualifiedNameTable qualifiedNameTable = packageFragment.f53599f;
        Intrinsics.m18598f(qualifiedNameTable, "proto.qualifiedNames");
        NameResolverImpl nameResolverImpl = new NameResolverImpl(stringTable, qualifiedNameTable);
        this.f54554j = nameResolverImpl;
        this.f54555n = new ProtoBasedClassDataFinder(packageFragment, nameResolverImpl, builtInsBinaryVersion, new DeserializedPackageFragmentImpl$classDataFinder$1(this));
        this.f54556o = packageFragment;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragment
    /* JADX INFO: renamed from: A0 */
    public final ProtoBasedClassDataFinder mo20018A0() {
        return this.f54555n;
    }

    /* JADX INFO: renamed from: G0 */
    public final void m20019G0(DeserializationComponents components) {
        Intrinsics.m18599g(components, "components");
        ProtoBuf.PackageFragment packageFragment = this.f54556o;
        if (packageFragment == null) {
            throw new IllegalStateException("Repeated call to DeserializedPackageFragmentImpl::initialize");
        }
        this.f54556o = null;
        ProtoBuf.Package r4 = packageFragment.f53600g;
        Intrinsics.m18598f(r4, "proto.`package`");
        this.f54557p = new DeserializedPackageMemberScope(this, r4, this.f54554j, this.f54553i, null, components, "scope of " + this, new DeserializedPackageFragmentImpl$initialize$1(this));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor
    /* JADX INFO: renamed from: o */
    public final MemberScope mo18867o() {
        DeserializedPackageMemberScope deserializedPackageMemberScope = this.f54557p;
        if (deserializedPackageMemberScope != null) {
            return deserializedPackageMemberScope;
        }
        Intrinsics.m18606n("_memberScope");
        throw null;
    }
}
