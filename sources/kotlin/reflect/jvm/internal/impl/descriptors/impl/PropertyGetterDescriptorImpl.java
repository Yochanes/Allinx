package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class PropertyGetterDescriptorImpl extends PropertyAccessorDescriptorImpl implements PropertyGetterDescriptor {

    /* JADX INFO: renamed from: r */
    public KotlinType f52584r;

    /* JADX INFO: renamed from: s */
    public final PropertyGetterDescriptor f52585s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PropertyGetterDescriptorImpl(PropertyDescriptor propertyDescriptor, Annotations annotations, Modality modality, DescriptorVisibility descriptorVisibility, boolean z2, boolean z3, boolean z4, CallableMemberDescriptor.Kind kind, PropertyGetterDescriptor propertyGetterDescriptor, SourceElement sourceElement) {
        super(modality, descriptorVisibility, propertyDescriptor, annotations, Name.m19607h("<get-" + propertyDescriptor.getName() + ">"), z2, z3, z4, kind, sourceElement);
        if (annotations == null) {
            m19074A(1);
            throw null;
        }
        if (modality == null) {
            m19074A(2);
            throw null;
        }
        if (descriptorVisibility == null) {
            m19074A(3);
            throw null;
        }
        if (kind == null) {
            m19074A(4);
            throw null;
        }
        if (sourceElement == null) {
            m19074A(5);
            throw null;
        }
        this.f52585s = propertyGetterDescriptor != null ? propertyGetterDescriptor : this;
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m19074A(int i) {
        String str = (i == 6 || i == 7 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 6 || i == 7 || i == 8) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "visibility";
                break;
            case 4:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        if (i == 6) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i == 7) {
            objArr[1] = "getValueParameters";
        } else if (i != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i != 6 && i != 7 && i != 8) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 6 && i != 7 && i != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyAccessorDescriptorImpl
    /* JADX INFO: renamed from: A0 */
    public final /* bridge */ /* synthetic */ PropertyAccessorDescriptor mo19062A0() {
        return m19075H0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* JADX INFO: renamed from: F */
    public final Object mo18881F(DeclarationDescriptorVisitor declarationDescriptorVisitor, Object obj) {
        return declarationDescriptorVisitor.mo18904k(this, obj);
    }

    /* JADX INFO: renamed from: H0 */
    public final PropertyGetterDescriptor m19075H0() {
        PropertyGetterDescriptor propertyGetterDescriptor = this.f52585s;
        if (propertyGetterDescriptor != null) {
            return propertyGetterDescriptor;
        }
        m19074A(8);
        throw null;
    }

    /* JADX INFO: renamed from: I0 */
    public final void m19076I0(KotlinType kotlinType) {
        if (kotlinType == null) {
            kotlinType = mo18964v0().getType();
        }
        this.f52584r = kotlinType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyAccessorDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ CallableDescriptor mo18872a() {
        return m19075H0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    /* JADX INFO: renamed from: f */
    public final List mo18874f() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        m19074A(7);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public final KotlinType getReturnType() {
        return this.f52584r;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    /* JADX INFO: renamed from: m */
    public final Collection mo18877m() {
        return m19063G0(true);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyAccessorDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl
    /* JADX INFO: renamed from: u0 */
    public final /* bridge */ /* synthetic */ DeclarationDescriptorWithSource mo19008u0() {
        return m19075H0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyAccessorDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ CallableMemberDescriptor mo18872a() {
        return m19075H0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyAccessorDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ DeclarationDescriptor mo18872a() {
        return m19075H0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyAccessorDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ FunctionDescriptor mo18872a() {
        return m19075H0();
    }
}
