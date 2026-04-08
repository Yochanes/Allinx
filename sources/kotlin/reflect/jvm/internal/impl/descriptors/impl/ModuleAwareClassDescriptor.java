package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ModuleAwareClassDescriptor implements ClassDescriptor {

    /* JADX INFO: compiled from: Proguard */
    public static final class Companion {
    }

    /* JADX INFO: renamed from: A */
    public abstract MemberScope mo19002A(TypeSubstitution typeSubstitution, KotlinTypeRefiner kotlinTypeRefiner);

    /* JADX INFO: renamed from: E */
    public abstract MemberScope mo18821E(KotlinTypeRefiner kotlinTypeRefiner);

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* JADX INFO: renamed from: a */
    public /* bridge */ /* synthetic */ ClassifierDescriptor mo18872a() {
        return mo18872a();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* JADX INFO: renamed from: a */
    public /* bridge */ /* synthetic */ DeclarationDescriptor mo18872a() {
        return mo18872a();
    }
}
