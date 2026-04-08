package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionInvokeDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension
public class ValueParameterDescriptorImpl extends VariableDescriptorImpl implements ValueParameterDescriptor {

    /* JADX INFO: renamed from: g */
    public final int f52602g;

    /* JADX INFO: renamed from: i */
    public final boolean f52603i;

    /* JADX INFO: renamed from: j */
    public final boolean f52604j;

    /* JADX INFO: renamed from: n */
    public final boolean f52605n;

    /* JADX INFO: renamed from: o */
    public final KotlinType f52606o;

    /* JADX INFO: renamed from: p */
    public final ValueParameterDescriptor f52607p;

    /* JADX INFO: compiled from: Proguard */
    public static final class Companion {
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class WithDestructuringDeclaration extends ValueParameterDescriptorImpl {

        /* JADX INFO: renamed from: q */
        public final Lazy f52608q;

        public WithDestructuringDeclaration(FunctionDescriptor functionDescriptor, ValueParameterDescriptor valueParameterDescriptor, int i, Annotations annotations, Name name, KotlinType kotlinType, boolean z2, boolean z3, boolean z4, KotlinType kotlinType2, SourceElement sourceElement, Function0 function0) {
            super(functionDescriptor, valueParameterDescriptor, i, annotations, name, kotlinType, z2, z3, z4, kotlinType2, sourceElement);
            this.f52608q = LazyKt.m18299b(function0);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor
        /* JADX INFO: renamed from: O */
        public final ValueParameterDescriptor mo18976O(FunctionInvokeDescriptor functionInvokeDescriptor, Name name, int i) {
            Annotations annotations = getAnnotations();
            Intrinsics.m18598f(annotations, "annotations");
            KotlinType type = getType();
            Intrinsics.m18598f(type, "type");
            boolean zMo18980o0 = mo18980o0();
            SourceElement sourceElement = SourceElement.f52298a;
            ValueParameterDescriptorImpl$WithDestructuringDeclaration$copy$1 valueParameterDescriptorImpl$WithDestructuringDeclaration$copy$1 = new ValueParameterDescriptorImpl$WithDestructuringDeclaration$copy$1(this);
            return new WithDestructuringDeclaration(functionInvokeDescriptor, null, i, annotations, name, type, zMo18980o0, this.f52604j, this.f52605n, this.f52606o, sourceElement, valueParameterDescriptorImpl$WithDestructuringDeclaration$copy$1);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ValueParameterDescriptorImpl(CallableDescriptor containingDeclaration, ValueParameterDescriptor valueParameterDescriptor, int i, Annotations annotations, Name name, KotlinType outType, boolean z2, boolean z3, boolean z4, KotlinType kotlinType, SourceElement source) {
        super(containingDeclaration, annotations, name, outType, source);
        Intrinsics.m18599g(containingDeclaration, "containingDeclaration");
        Intrinsics.m18599g(annotations, "annotations");
        Intrinsics.m18599g(name, "name");
        Intrinsics.m18599g(outType, "outType");
        Intrinsics.m18599g(source, "source");
        this.f52602g = i;
        this.f52603i = z2;
        this.f52604j = z3;
        this.f52605n = z4;
        this.f52606o = kotlinType;
        this.f52607p = valueParameterDescriptor == null ? this : valueParameterDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl
    /* JADX INFO: renamed from: A0 */
    public final /* bridge */ /* synthetic */ VariableDescriptor mo19066A0() {
        return mo18872a();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* JADX INFO: renamed from: F */
    public final Object mo18881F(DeclarationDescriptorVisitor declarationDescriptorVisitor, Object obj) {
        return declarationDescriptorVisitor.mo18900e(this, obj);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor
    /* JADX INFO: renamed from: O */
    public ValueParameterDescriptor mo18976O(FunctionInvokeDescriptor functionInvokeDescriptor, Name name, int i) {
        Annotations annotations = getAnnotations();
        Intrinsics.m18598f(annotations, "annotations");
        KotlinType type = getType();
        Intrinsics.m18598f(type, "type");
        boolean zMo18980o0 = mo18980o0();
        SourceElement sourceElement = SourceElement.f52298a;
        return new ValueParameterDescriptorImpl(functionInvokeDescriptor, null, i, annotations, name, type, zMo18980o0, this.f52604j, this.f52605n, this.f52606o, sourceElement);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    /* JADX INFO: renamed from: R */
    public final /* bridge */ /* synthetic */ ConstantValue mo18981R() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor
    /* JADX INFO: renamed from: S */
    public final boolean mo18977S() {
        return this.f52605n;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor
    /* JADX INFO: renamed from: V */
    public final boolean mo18978V() {
        return this.f52604j;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ CallableDescriptor mo18872a() {
        return mo18872a();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    /* JADX INFO: renamed from: b */
    public final DeclarationDescriptorNonRoot mo18887b(TypeSubstitutor substitutor) {
        Intrinsics.m18599g(substitutor, "substitutor");
        if (substitutor.f54882a.mo20129e()) {
            return this;
        }
        throw new UnsupportedOperationException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    /* JADX INFO: renamed from: d0 */
    public final boolean mo18982d0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* JADX INFO: renamed from: e */
    public final /* bridge */ /* synthetic */ DeclarationDescriptor mo18828e() {
        return mo18828e();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor
    /* JADX INFO: renamed from: e0 */
    public final KotlinType mo18979e0() {
        return this.f52606o;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor
    public final int getIndex() {
        return this.f52602g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public final DescriptorVisibility getVisibility() {
        DescriptorVisibility LOCAL = DescriptorVisibilities.f52248f;
        Intrinsics.m18598f(LOCAL, "LOCAL");
        return LOCAL;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    /* JADX INFO: renamed from: m */
    public final Collection mo18877m() {
        Collection collectionMo18877m = mo18828e().mo18877m();
        Intrinsics.m18598f(collectionMo18877m, "containingDeclaration.overriddenDescriptors");
        Collection collection = collectionMo18877m;
        ArrayList arrayList = new ArrayList(CollectionsKt.m18452r(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add((ValueParameterDescriptor) ((CallableDescriptor) it.next()).mo18874f().get(this.f52602g));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor
    /* JADX INFO: renamed from: o0 */
    public final boolean mo18980o0() {
        if (!this.f52603i) {
            return false;
        }
        CallableMemberDescriptor.Kind kind = ((CallableMemberDescriptor) mo18828e()).getKind();
        kind.getClass();
        return kind != CallableMemberDescriptor.Kind.f52228b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl
    /* JADX INFO: renamed from: u0 */
    public final /* bridge */ /* synthetic */ DeclarationDescriptorWithSource mo19008u0() {
        return mo18872a();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ DeclarationDescriptor mo18872a() {
        return mo18872a();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* JADX INFO: renamed from: e */
    public final CallableDescriptor mo18828e() {
        DeclarationDescriptor declarationDescriptorMo18828e = super.mo18828e();
        Intrinsics.m18597e(declarationDescriptorMo18828e, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        return (CallableDescriptor) declarationDescriptorMo18828e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* JADX INFO: renamed from: a */
    public final ValueParameterDescriptor mo18872a() {
        ValueParameterDescriptor valueParameterDescriptor = this.f52607p;
        return valueParameterDescriptor == this ? this : valueParameterDescriptor.mo18872a();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    /* JADX INFO: renamed from: b */
    public final VariableDescriptor mo18887b(TypeSubstitutor substitutor) {
        Intrinsics.m18599g(substitutor, "substitutor");
        if (substitutor.f54882a.mo20129e()) {
            return this;
        }
        throw new UnsupportedOperationException();
    }
}
