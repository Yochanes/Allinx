package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class KotlinTypeRefiner extends AbstractTypeRefiner {
    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeRefiner
    /* JADX INFO: renamed from: a */
    public /* bridge */ /* synthetic */ KotlinType mo20119a(KotlinTypeMarker kotlinTypeMarker) {
        return mo20279f(kotlinTypeMarker);
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo20275b(ClassId classId);

    /* JADX INFO: renamed from: c */
    public abstract void mo20276c(ModuleDescriptor moduleDescriptor);

    /* JADX INFO: renamed from: d */
    public abstract void mo20277d(DeclarationDescriptor declarationDescriptor);

    /* JADX INFO: renamed from: e */
    public abstract Collection mo20278e(ClassDescriptor classDescriptor);

    /* JADX INFO: renamed from: f */
    public abstract KotlinType mo20279f(KotlinTypeMarker kotlinTypeMarker);

    /* JADX INFO: compiled from: Proguard */
    public static final class Default extends KotlinTypeRefiner {

        /* JADX INFO: renamed from: a */
        public static final Default f54906a = new Default();

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner
        /* JADX INFO: renamed from: d */
        public final void mo20277d(DeclarationDescriptor descriptor) {
            Intrinsics.m18599g(descriptor, "descriptor");
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner
        /* JADX INFO: renamed from: e */
        public final Collection mo20278e(ClassDescriptor classDescriptor) {
            Intrinsics.m18599g(classDescriptor, "classDescriptor");
            Collection collectionMo19009a = classDescriptor.mo18830h().mo19009a();
            Intrinsics.m18598f(collectionMo19009a, "classDescriptor.typeConstructor.supertypes");
            return collectionMo19009a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner
        /* JADX INFO: renamed from: f */
        public final KotlinType mo20279f(KotlinTypeMarker type) {
            Intrinsics.m18599g(type, "type");
            return (KotlinType) type;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner
        /* JADX INFO: renamed from: b */
        public final void mo20275b(ClassId classId) {
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner
        /* JADX INFO: renamed from: c */
        public final void mo20276c(ModuleDescriptor moduleDescriptor) {
        }
    }
}
