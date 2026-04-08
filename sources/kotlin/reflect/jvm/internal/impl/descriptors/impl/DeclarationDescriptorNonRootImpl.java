package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class DeclarationDescriptorNonRootImpl extends DeclarationDescriptorImpl implements DeclarationDescriptorNonRoot {

    /* JADX INFO: renamed from: c */
    public final DeclarationDescriptor f52437c;

    /* JADX INFO: renamed from: d */
    public final SourceElement f52438d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeclarationDescriptorNonRootImpl(DeclarationDescriptor declarationDescriptor, Annotations annotations, Name name, SourceElement sourceElement) {
        super(annotations, name);
        if (declarationDescriptor == null) {
            m19031A(0);
            throw null;
        }
        if (annotations == null) {
            m19031A(1);
            throw null;
        }
        if (name == null) {
            m19031A(2);
            throw null;
        }
        if (sourceElement == null) {
            m19031A(3);
            throw null;
        }
        this.f52437c = declarationDescriptor;
        this.f52438d = sourceElement;
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m19031A(int i) {
        String str = (i == 4 || i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 4 || i == 5 || i == 6) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i == 4) {
            objArr[1] = "getOriginal";
        } else if (i == 5) {
            objArr[1] = "getContainingDeclaration";
        } else if (i != 6) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i != 4 && i != 5 && i != 6) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 4 && i != 5 && i != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    /* JADX INFO: renamed from: a */
    public /* bridge */ /* synthetic */ DeclarationDescriptor mo18872a() {
        return mo19008u0();
    }

    /* JADX INFO: renamed from: e */
    public DeclarationDescriptor mo18828e() {
        DeclarationDescriptor declarationDescriptor = this.f52437c;
        if (declarationDescriptor != null) {
            return declarationDescriptor;
        }
        m19031A(5);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource
    /* JADX INFO: renamed from: g */
    public SourceElement mo18829g() {
        SourceElement sourceElement = this.f52438d;
        if (sourceElement != null) {
            return sourceElement;
        }
        m19031A(6);
        throw null;
    }

    /* JADX INFO: renamed from: u0 */
    public DeclarationDescriptorWithSource mo19008u0() {
        return this;
    }
}
