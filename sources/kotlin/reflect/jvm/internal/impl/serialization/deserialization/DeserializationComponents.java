package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentTypeTransformer;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker;
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmPackagePartSource;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import kotlin.reflect.jvm.internal.impl.resolve.sam.SamConversionResolverImpl;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ContractDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.LocalClassifierTypeSettings;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.types.DefaultTypeAttributeTranslator;
import kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeCheckerImpl;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class DeserializationComponents {

    /* JADX INFO: renamed from: a */
    public final LockBasedStorageManager f54522a;

    /* JADX INFO: renamed from: b */
    public final ModuleDescriptor f54523b;

    /* JADX INFO: renamed from: c */
    public final DeserializationConfiguration.Default f54524c;

    /* JADX INFO: renamed from: d */
    public final ClassDataFinder f54525d;

    /* JADX INFO: renamed from: e */
    public final AnnotationAndConstantLoader f54526e;

    /* JADX INFO: renamed from: f */
    public final PackageFragmentProviderOptimized f54527f;

    /* JADX INFO: renamed from: g */
    public final LocalClassifierTypeSettings.Default f54528g;

    /* JADX INFO: renamed from: h */
    public final ErrorReporter f54529h;

    /* JADX INFO: renamed from: i */
    public final LookupTracker.DO_NOTHING f54530i;

    /* JADX INFO: renamed from: j */
    public final FlexibleTypeDeserializer f54531j;

    /* JADX INFO: renamed from: k */
    public final Iterable f54532k;

    /* JADX INFO: renamed from: l */
    public final NotFoundClasses f54533l;

    /* JADX INFO: renamed from: m */
    public final ContractDeserializer$Companion$DEFAULT$1 f54534m;

    /* JADX INFO: renamed from: n */
    public final AdditionalClassPartsProvider f54535n;

    /* JADX INFO: renamed from: o */
    public final PlatformDependentDeclarationFilter f54536o;

    /* JADX INFO: renamed from: p */
    public final ExtensionRegistryLite f54537p;

    /* JADX INFO: renamed from: q */
    public final NewKotlinTypeChecker f54538q;

    /* JADX INFO: renamed from: r */
    public final PlatformDependentTypeTransformer f54539r;

    /* JADX INFO: renamed from: s */
    public final List f54540s;

    /* JADX INFO: renamed from: t */
    public final ClassDeserializer f54541t;

    public DeserializationComponents(LockBasedStorageManager lockBasedStorageManager, ModuleDescriptor moduleDescriptor, ClassDataFinder classDataFinder, AnnotationAndConstantLoader annotationAndConstantLoader, PackageFragmentProviderOptimized packageFragmentProviderOptimized, ErrorReporter errorReporter, FlexibleTypeDeserializer flexibleTypeDeserializer, Iterable fictitiousClassDescriptorFactories, NotFoundClasses notFoundClasses, AdditionalClassPartsProvider additionalClassPartsProvider, PlatformDependentDeclarationFilter platformDependentDeclarationFilter, ExtensionRegistryLite extensionRegistryLite, NewKotlinTypeCheckerImpl newKotlinTypeCheckerImpl, SamConversionResolverImpl samConversionResolverImpl, List list, int i) {
        NewKotlinTypeCheckerImpl kotlinTypeChecker;
        DeserializationConfiguration.Default r4 = DeserializationConfiguration.Default.f54542a;
        LocalClassifierTypeSettings.Default r5 = LocalClassifierTypeSettings.Default.f54568a;
        LookupTracker.DO_NOTHING do_nothing = LookupTracker.DO_NOTHING.f52682a;
        ContractDeserializer$Companion$DEFAULT$1 contractDeserializer$Companion$DEFAULT$1 = ContractDeserializer.Companion.f54521a;
        if ((i & 65536) != 0) {
            NewKotlinTypeChecker.f54924b.getClass();
            kotlinTypeChecker = NewKotlinTypeChecker.Companion.f54926b;
        } else {
            kotlinTypeChecker = newKotlinTypeCheckerImpl;
        }
        PlatformDependentTypeTransformer.None none = PlatformDependentTypeTransformer.None.f52396a;
        List listM18413N = (i & 524288) != 0 ? CollectionsKt.m18413N(DefaultTypeAttributeTranslator.f54799a) : list;
        Intrinsics.m18599g(moduleDescriptor, "moduleDescriptor");
        Intrinsics.m18599g(fictitiousClassDescriptorFactories, "fictitiousClassDescriptorFactories");
        Intrinsics.m18599g(additionalClassPartsProvider, "additionalClassPartsProvider");
        Intrinsics.m18599g(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
        Intrinsics.m18599g(extensionRegistryLite, "extensionRegistryLite");
        Intrinsics.m18599g(kotlinTypeChecker, "kotlinTypeChecker");
        this.f54522a = lockBasedStorageManager;
        this.f54523b = moduleDescriptor;
        this.f54524c = r4;
        this.f54525d = classDataFinder;
        this.f54526e = annotationAndConstantLoader;
        this.f54527f = packageFragmentProviderOptimized;
        this.f54528g = r5;
        this.f54529h = errorReporter;
        this.f54530i = do_nothing;
        this.f54531j = flexibleTypeDeserializer;
        this.f54532k = fictitiousClassDescriptorFactories;
        this.f54533l = notFoundClasses;
        this.f54534m = contractDeserializer$Companion$DEFAULT$1;
        this.f54535n = additionalClassPartsProvider;
        this.f54536o = platformDependentDeclarationFilter;
        this.f54537p = extensionRegistryLite;
        this.f54538q = kotlinTypeChecker;
        this.f54539r = none;
        this.f54540s = listM18413N;
        this.f54541t = new ClassDeserializer(this);
    }

    /* JADX INFO: renamed from: a */
    public final DeserializationContext m20014a(PackageFragmentDescriptor descriptor, NameResolver nameResolver, TypeTable typeTable, VersionRequirementTable versionRequirementTable, BinaryVersion metadataVersion, JvmPackagePartSource jvmPackagePartSource) {
        Intrinsics.m18599g(descriptor, "descriptor");
        Intrinsics.m18599g(nameResolver, "nameResolver");
        Intrinsics.m18599g(metadataVersion, "metadataVersion");
        return new DeserializationContext(this, nameResolver, descriptor, typeTable, versionRequirementTable, metadataVersion, jvmPackagePartSource, null, EmptyList.f51496a);
    }

    /* JADX INFO: renamed from: b */
    public final ClassDescriptor m20015b(ClassId classId) {
        Intrinsics.m18599g(classId, "classId");
        Set set = ClassDeserializer.f54515c;
        return this.f54541t.m20013a(classId, null);
    }
}
