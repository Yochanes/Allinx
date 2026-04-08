package kotlin.reflect.jvm.internal.impl.descriptors.java;

import kotlin.collections.builders.MapBuilder;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class JavaVisibilities {

    /* JADX INFO: compiled from: Proguard */
    public static final class PackageVisibility extends Visibility {

        /* JADX INFO: renamed from: c */
        public static final PackageVisibility f52614c = new PackageVisibility("package", false);

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
        /* JADX INFO: renamed from: a */
        public final Integer mo18986a(Visibility visibility) {
            Intrinsics.m18599g(visibility, "visibility");
            if (this == visibility) {
                return 0;
            }
            MapBuilder mapBuilder = Visibilities.f52304a;
            return (visibility == Visibilities.Private.f52309c || visibility == Visibilities.PrivateToThis.f52310c) ? 1 : -1;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
        /* JADX INFO: renamed from: b */
        public final String mo18985b() {
            return "public/*package*/";
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
        /* JADX INFO: renamed from: c */
        public final Visibility mo18987c() {
            return Visibilities.Protected.f52311c;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ProtectedAndPackage extends Visibility {

        /* JADX INFO: renamed from: c */
        public static final ProtectedAndPackage f52615c = new ProtectedAndPackage("protected_and_package", true);

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
        /* JADX INFO: renamed from: a */
        public final Integer mo18986a(Visibility visibility) {
            Intrinsics.m18599g(visibility, "visibility");
            if (equals(visibility)) {
                return 0;
            }
            if (visibility == Visibilities.Internal.f52306c) {
                return null;
            }
            MapBuilder mapBuilder = Visibilities.f52304a;
            return visibility == Visibilities.Private.f52309c || visibility == Visibilities.PrivateToThis.f52310c ? 1 : -1;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
        /* JADX INFO: renamed from: b */
        public final String mo18985b() {
            return "protected/*protected and package*/";
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
        /* JADX INFO: renamed from: c */
        public final Visibility mo18987c() {
            return Visibilities.Protected.f52311c;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ProtectedStaticVisibility extends Visibility {

        /* JADX INFO: renamed from: c */
        public static final ProtectedStaticVisibility f52616c = new ProtectedStaticVisibility("protected_static", true);

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
        /* JADX INFO: renamed from: b */
        public final String mo18985b() {
            return "protected/*protected static*/";
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.Visibility
        /* JADX INFO: renamed from: c */
        public final Visibility mo18987c() {
            return Visibilities.Protected.f52311c;
        }
    }
}
