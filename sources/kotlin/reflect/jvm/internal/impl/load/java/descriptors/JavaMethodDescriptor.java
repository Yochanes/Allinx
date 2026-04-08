package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

import com.google.android.gms.common.api.CommonStatusCodes;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ReceiverParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations;
import kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElement;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.util.Check;
import kotlin.reflect.jvm.internal.impl.util.CheckResult;
import kotlin.reflect.jvm.internal.impl.util.Checks;
import kotlin.reflect.jvm.internal.impl.util.OperatorChecks;
import kotlin.text.Regex;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class JavaMethodDescriptor extends SimpleFunctionDescriptorImpl implements JavaCallableMemberDescriptor {

    /* JADX INFO: renamed from: L */
    public static final CallableDescriptor.UserDataKey f52871L = new C60591();

    /* JADX INFO: renamed from: M */
    public static final CallableDescriptor.UserDataKey f52872M = new C60602();

    /* JADX INFO: renamed from: J */
    public ParameterNamesStatus f52873J;

    /* JADX INFO: renamed from: K */
    public final boolean f52874K;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor$1 */
    /* JADX INFO: compiled from: Proguard */
    public static class C60591 implements CallableDescriptor.UserDataKey<ValueParameterDescriptor> {
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor$2 */
    /* JADX INFO: compiled from: Proguard */
    public static class C60602 implements CallableDescriptor.UserDataKey<Boolean> {
    }

    /* JADX INFO: compiled from: Proguard */
    public enum ParameterNamesStatus {
        NON_STABLE_DECLARED(false, false),
        STABLE_DECLARED(true, false),
        NON_STABLE_SYNTHESIZED(false, true),
        STABLE_SYNTHESIZED(true, true);


        /* JADX INFO: renamed from: a */
        public final boolean f52880a;

        /* JADX INFO: renamed from: b */
        public final boolean f52881b;

        ParameterNamesStatus(boolean z2, boolean z3) {
            this.f52880a = z2;
            this.f52881b = z3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JavaMethodDescriptor(DeclarationDescriptor declarationDescriptor, SimpleFunctionDescriptor simpleFunctionDescriptor, Annotations annotations, Name name, CallableMemberDescriptor.Kind kind, SourceElement sourceElement, boolean z2) {
        super(declarationDescriptor, simpleFunctionDescriptor, annotations, name, kind, sourceElement);
        if (declarationDescriptor == null) {
            m19224A(0);
            throw null;
        }
        if (annotations == null) {
            m19224A(1);
            throw null;
        }
        if (name == null) {
            m19224A(2);
            throw null;
        }
        if (kind == null) {
            m19224A(3);
            throw null;
        }
        if (sourceElement == null) {
            m19224A(4);
            throw null;
        }
        this.f52873J = null;
        this.f52874K = z2;
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m19224A(int i) {
        String str = (i == 13 || i == 18 || i == 21) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 13 || i == 18 || i == 21) ? 2 : 3];
        switch (i) {
            case 1:
            case 6:
            case 16:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 15:
                objArr[0] = "kind";
                break;
            case 4:
            case 8:
            case 17:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 9:
                objArr[0] = "contextReceiverParameters";
                break;
            case 10:
                objArr[0] = "typeParameters";
                break;
            case 11:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case TYPE_BYTES_VALUE:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
                break;
            case 14:
                objArr[0] = "newOwner";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i == 13) {
            objArr[1] = "initialize";
        } else if (i == 18) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "createJavaMethod";
                break;
            case 9:
            case 10:
            case 11:
            case TYPE_BYTES_VALUE:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                break;
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 13 && i != 18 && i != 21) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX INFO: renamed from: U0 */
    public static JavaMethodDescriptor m19225U0(DeclarationDescriptor declarationDescriptor, LazyJavaAnnotations lazyJavaAnnotations, Name name, JavaSourceElement javaSourceElement, boolean z2) {
        if (declarationDescriptor == null) {
            m19224A(5);
            throw null;
        }
        if (name == null) {
            m19224A(7);
            throw null;
        }
        if (javaSourceElement != null) {
            return new JavaMethodDescriptor(declarationDescriptor, null, lazyJavaAnnotations, name, CallableMemberDescriptor.Kind.f52227a, javaSourceElement, z2);
        }
        m19224A(8);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    /* JADX INFO: renamed from: G0 */
    public final FunctionDescriptorImpl mo18846G0(CallableMemberDescriptor.Kind kind, DeclarationDescriptor declarationDescriptor, FunctionDescriptor functionDescriptor, SourceElement sourceElement, Annotations annotations, Name name) {
        if (declarationDescriptor == null) {
            m19224A(14);
            throw null;
        }
        if (kind == null) {
            m19224A(15);
            throw null;
        }
        if (annotations == null) {
            m19224A(16);
            throw null;
        }
        SimpleFunctionDescriptor simpleFunctionDescriptor = (SimpleFunctionDescriptor) functionDescriptor;
        if (name == null) {
            name = getName();
        }
        JavaMethodDescriptor javaMethodDescriptor = new JavaMethodDescriptor(declarationDescriptor, simpleFunctionDescriptor, annotations, name, kind, sourceElement, this.f52874K);
        ParameterNamesStatus parameterNamesStatus = this.f52873J;
        javaMethodDescriptor.m19226V0(parameterNamesStatus.f52880a, parameterNamesStatus.f52881b);
        return javaMethodDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl
    /* JADX INFO: renamed from: T0 */
    public final SimpleFunctionDescriptorImpl mo19086T0(ReceiverParameterDescriptorImpl receiverParameterDescriptorImpl, ReceiverParameterDescriptor receiverParameterDescriptor, List list, List list2, List list3, KotlinType kotlinType, Modality modality, DescriptorVisibility descriptorVisibility, Map map) {
        CheckResult illegalSignature;
        if (list == null) {
            m19224A(9);
            throw null;
        }
        if (list2 == null) {
            m19224A(10);
            throw null;
        }
        if (list3 == null) {
            m19224A(11);
            throw null;
        }
        if (descriptorVisibility == null) {
            m19224A(12);
            throw null;
        }
        super.mo19086T0(receiverParameterDescriptorImpl, receiverParameterDescriptor, list, list2, list3, kotlinType, modality, descriptorVisibility, map);
        List list4 = OperatorChecks.f55046a;
        for (Checks checks : OperatorChecks.f55046a) {
            checks.getClass();
            Name name = checks.f55027a;
            if (name == null || Intrinsics.m18594b(getName(), name)) {
                Regex regex = checks.f55028b;
                if (regex != null) {
                    String strM19608b = getName().m19608b();
                    Intrinsics.m18598f(strM19608b, "functionDescriptor.name.asString()");
                    if (!regex.m20398d(strM19608b)) {
                        continue;
                    }
                }
                Collection collection = checks.f55029c;
                if (collection == null || collection.contains(getName())) {
                    Check[] checkArr = checks.f55031e;
                    int length = checkArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            illegalSignature = ((String) checks.f55030d.invoke(this)) != null ? new CheckResult.IllegalSignature(false) : CheckResult.SuccessCheck.f55026b;
                        } else {
                            if (checkArr[i].mo20327c(this) != null) {
                                illegalSignature = new CheckResult.IllegalSignature(false);
                                break;
                            }
                            i++;
                        }
                    }
                    this.f52468r = illegalSignature.f55024a;
                    return this;
                }
            }
        }
        illegalSignature = CheckResult.IllegalFunctionName.f55025b;
        this.f52468r = illegalSignature.f55024a;
        return this;
    }

    /* JADX INFO: renamed from: V0 */
    public final void m19226V0(boolean z2, boolean z3) {
        this.f52873J = z2 ? z3 ? ParameterNamesStatus.STABLE_SYNTHESIZED : ParameterNamesStatus.STABLE_DECLARED : z3 ? ParameterNamesStatus.NON_STABLE_SYNTHESIZED : ParameterNamesStatus.NON_STABLE_DECLARED;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor
    /* JADX INFO: renamed from: h0 */
    public final JavaCallableMemberDescriptor mo19220h0(KotlinType kotlinType, ArrayList arrayList, KotlinType kotlinType2, Pair pair) {
        ArrayList arrayListM19229a = UtilKt.m19229a(arrayList, mo18874f(), this);
        ReceiverParameterDescriptorImpl receiverParameterDescriptorImplM19824h = kotlinType == null ? null : DescriptorFactory.m19824h(this, kotlinType, Annotations.Companion.f52337a);
        FunctionDescriptorImpl.CopyConfiguration copyConfigurationM19049K0 = m19049K0(TypeSubstitutor.f54881b);
        copyConfigurationM19049K0.f52486g = arrayListM19229a;
        copyConfigurationM19049K0.f52490k = kotlinType2;
        copyConfigurationM19049K0.f52488i = receiverParameterDescriptorImplM19824h;
        copyConfigurationM19049K0.f52495p = true;
        copyConfigurationM19049K0.f52494o = true;
        JavaMethodDescriptor javaMethodDescriptor = (JavaMethodDescriptor) copyConfigurationM19049K0.f52503x.mo18847H0(copyConfigurationM19049K0);
        if (pair != null) {
            javaMethodDescriptor.m19050L0((CallableDescriptor.UserDataKey) pair.f51426a, pair.f51427b);
        }
        if (javaMethodDescriptor != null) {
            return javaMethodDescriptor;
        }
        m19224A(21);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    /* JADX INFO: renamed from: z */
    public final boolean mo18878z() {
        return this.f52873J.f52881b;
    }
}
