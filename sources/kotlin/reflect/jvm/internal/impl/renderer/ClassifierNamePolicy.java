package kotlin.reflect.jvm.internal.impl.renderer;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public interface ClassifierNamePolicy {

    /* JADX INFO: compiled from: Proguard */
    public static final class FULLY_QUALIFIED implements ClassifierNamePolicy {

        /* JADX INFO: renamed from: a */
        public static final FULLY_QUALIFIED f54207a = new FULLY_QUALIFIED();

        @Override // kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy
        /* JADX INFO: renamed from: a */
        public final String mo19730a(ClassifierDescriptor classifierDescriptor, DescriptorRendererImpl descriptorRendererImpl) {
            if (classifierDescriptor instanceof TypeParameterDescriptor) {
                Name name = ((TypeParameterDescriptor) classifierDescriptor).getName();
                Intrinsics.m18598f(name, "classifier.name");
                return descriptorRendererImpl.m19757Q(name, false);
            }
            FqNameUnsafe fqNameUnsafeM19835g = DescriptorUtils.m19835g(classifierDescriptor);
            Intrinsics.m18598f(fqNameUnsafeM19835g, "getFqName(classifier)");
            return descriptorRendererImpl.m19749I(fqNameUnsafeM19835g);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class SHORT implements ClassifierNamePolicy {

        /* JADX INFO: renamed from: a */
        public static final SHORT f54208a = new SHORT();

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor] */
        /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.Named] */
        /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor] */
        @Override // kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy
        /* JADX INFO: renamed from: a */
        public final String mo19730a(ClassifierDescriptor classifierDescriptor, DescriptorRendererImpl descriptorRendererImpl) {
            if (classifierDescriptor instanceof TypeParameterDescriptor) {
                Name name = ((TypeParameterDescriptor) classifierDescriptor).getName();
                Intrinsics.m18598f(name, "classifier.name");
                return descriptorRendererImpl.m19757Q(name, false);
            }
            ArrayList arrayList = new ArrayList();
            do {
                arrayList.add(classifierDescriptor.getName());
                classifierDescriptor = classifierDescriptor.mo18828e();
            } while (classifierDescriptor instanceof ClassDescriptor);
            return RenderingUtilsKt.m19807b(CollectionsKt.m18442m(arrayList));
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class SOURCE_CODE_QUALIFIED implements ClassifierNamePolicy {

        /* JADX INFO: renamed from: a */
        public static final SOURCE_CODE_QUALIFIED f54209a = new SOURCE_CODE_QUALIFIED();

        /* JADX INFO: renamed from: b */
        public static String m19731b(ClassifierDescriptor classifierDescriptor) {
            String strM19807b;
            Name name = classifierDescriptor.getName();
            Intrinsics.m18598f(name, "descriptor.name");
            String strM19806a = RenderingUtilsKt.m19806a(name);
            if (!(classifierDescriptor instanceof TypeParameterDescriptor)) {
                DeclarationDescriptor declarationDescriptorMo18828e = classifierDescriptor.mo18828e();
                Intrinsics.m18598f(declarationDescriptorMo18828e, "descriptor.containingDeclaration");
                if (declarationDescriptorMo18828e instanceof ClassDescriptor) {
                    strM19807b = m19731b((ClassifierDescriptor) declarationDescriptorMo18828e);
                } else if (declarationDescriptorMo18828e instanceof PackageFragmentDescriptor) {
                    FqNameUnsafe fqNameUnsafeM19593i = ((PackageFragmentDescriptor) declarationDescriptorMo18828e).mo18952c().m19593i();
                    Intrinsics.m18598f(fqNameUnsafeM19593i, "descriptor.fqName.toUnsafe()");
                    List listM19598e = fqNameUnsafeM19593i.m19598e();
                    Intrinsics.m18598f(listM19598e, "pathSegments()");
                    strM19807b = RenderingUtilsKt.m19807b(listM19598e);
                } else {
                    strM19807b = null;
                }
                if (strM19807b != null && !strM19807b.equals("")) {
                    return strM19807b + '.' + strM19806a;
                }
            }
            return strM19806a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy
        /* JADX INFO: renamed from: a */
        public final String mo19730a(ClassifierDescriptor classifierDescriptor, DescriptorRendererImpl descriptorRendererImpl) {
            return m19731b(classifierDescriptor);
        }
    }

    /* JADX INFO: renamed from: a */
    String mo19730a(ClassifierDescriptor classifierDescriptor, DescriptorRendererImpl descriptorRendererImpl);
}
