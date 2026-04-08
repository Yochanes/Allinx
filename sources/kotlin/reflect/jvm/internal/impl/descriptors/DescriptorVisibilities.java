package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.Set;
import kotlin.collections.ArraysKt;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.SuperCallReceiverValue;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ThisClassReceiver;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.util.ModuleVisibilityHelper;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class DescriptorVisibilities {

    /* JADX INFO: renamed from: a */
    public static final DescriptorVisibility f52243a;

    /* JADX INFO: renamed from: b */
    public static final DescriptorVisibility f52244b;

    /* JADX INFO: renamed from: c */
    public static final DescriptorVisibility f52245c;

    /* JADX INFO: renamed from: d */
    public static final DescriptorVisibility f52246d;

    /* JADX INFO: renamed from: e */
    public static final DescriptorVisibility f52247e;

    /* JADX INFO: renamed from: f */
    public static final DescriptorVisibility f52248f;

    /* JADX INFO: renamed from: g */
    public static final DescriptorVisibility f52249g;

    /* JADX INFO: renamed from: h */
    public static final DescriptorVisibility f52250h;

    /* JADX INFO: renamed from: i */
    public static final DescriptorVisibility f52251i;

    /* JADX INFO: renamed from: j */
    public static final Set f52252j;

    /* JADX INFO: renamed from: k */
    public static final Map f52253k;

    /* JADX INFO: renamed from: l */
    public static final DescriptorVisibility f52254l;

    /* JADX INFO: renamed from: m */
    public static final ReceiverValue f52255m;

    /* JADX INFO: renamed from: n */
    public static final ReceiverValue f52256n;

    /* JADX INFO: renamed from: o */
    public static final ReceiverValue f52257o;

    /* JADX INFO: renamed from: p */
    public static final ModuleVisibilityHelper f52258p;

    /* JADX INFO: renamed from: q */
    public static final HashMap f52259q;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities$1 */
    /* JADX INFO: compiled from: Proguard */
    public static class C60131 extends DelegatedDescriptorVisibility {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v12 */
        /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility] */
        /* JADX WARN: Type inference failed for: r4v6, types: [kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor] */
        /* JADX WARN: Type inference failed for: r4v7, types: [kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor] */
        /* JADX WARN: Type inference failed for: r4v9, types: [kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor] */
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
        /* JADX INFO: renamed from: c */
        public final boolean mo18918c(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor) {
            if (declarationDescriptor == null) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$1", "isVisible"));
            }
            if (DescriptorUtils.m19847s(declarationDescriptorWithVisibility) && DescriptorUtils.m19834f(declarationDescriptor) != SourceFile.f52299a) {
                return DescriptorVisibilities.m18914d(declarationDescriptorWithVisibility, declarationDescriptor);
            }
            if (declarationDescriptorWithVisibility instanceof ConstructorDescriptor) {
                ((ConstructorDescriptor) declarationDescriptorWithVisibility).mo18828e();
            }
            while (declarationDescriptorWithVisibility != 0) {
                declarationDescriptorWithVisibility = declarationDescriptorWithVisibility.mo18828e();
                if (((declarationDescriptorWithVisibility instanceof ClassDescriptor) && !DescriptorUtils.m19840l(declarationDescriptorWithVisibility)) || (declarationDescriptorWithVisibility instanceof PackageFragmentDescriptor)) {
                    break;
                }
            }
            if (declarationDescriptorWithVisibility == 0) {
                return false;
            }
            while (declarationDescriptor != null) {
                if (declarationDescriptorWithVisibility == declarationDescriptor) {
                    return true;
                }
                if (declarationDescriptor instanceof PackageFragmentDescriptor) {
                    return (declarationDescriptorWithVisibility instanceof PackageFragmentDescriptor) && ((PackageFragmentDescriptor) declarationDescriptorWithVisibility).mo18952c().equals(((PackageFragmentDescriptor) declarationDescriptor).mo18952c()) && DescriptorUtils.m19832d(declarationDescriptor).equals(DescriptorUtils.m19832d(declarationDescriptorWithVisibility));
                }
                declarationDescriptor = declarationDescriptor.mo18828e();
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities$10 */
    /* JADX INFO: compiled from: Proguard */
    public static class C601410 implements ReceiverValue {
        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue
        public final KotlinType getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities$11 */
    /* JADX INFO: compiled from: Proguard */
    public static class C601511 implements ReceiverValue {
        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue
        public final KotlinType getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities$12 */
    /* JADX INFO: compiled from: Proguard */
    public static class C601612 implements ReceiverValue {
        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue
        public final KotlinType getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities$2 */
    /* JADX INFO: compiled from: Proguard */
    public static class C60172 extends DelegatedDescriptorVisibility {
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
        /* JADX INFO: renamed from: c */
        public final boolean mo18918c(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor) {
            DeclarationDescriptor declarationDescriptorM19837i;
            if (declarationDescriptor == null) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$2", "isVisible"));
            }
            if (!DescriptorVisibilities.f52243a.mo18918c(receiverValue, declarationDescriptorWithVisibility, declarationDescriptor)) {
                return false;
            }
            if (receiverValue == DescriptorVisibilities.f52256n) {
                return true;
            }
            if (receiverValue == DescriptorVisibilities.f52255m || (declarationDescriptorM19837i = DescriptorUtils.m19837i(declarationDescriptorWithVisibility, ClassDescriptor.class, true)) == null || !(receiverValue instanceof ThisClassReceiver)) {
                return false;
            }
            return ((ThisClassReceiver) receiverValue).mo20008p().mo18872a().equals(declarationDescriptorM19837i.mo18872a());
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities$3 */
    /* JADX INFO: compiled from: Proguard */
    public static class C60183 extends DelegatedDescriptorVisibility {
        /* JADX WARN: Code restructure failed: missing block: B:45:0x0089, code lost:
        
            if (kotlin.reflect.jvm.internal.impl.types.DynamicTypesKt.m20134a(r0) == false) goto L49;
         */
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
        /* JADX INFO: renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean mo18918c(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor) {
            ClassDescriptor classDescriptor;
            if (declarationDescriptor == null) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$3", "isVisible"));
            }
            ClassDescriptor classDescriptor2 = (ClassDescriptor) DescriptorUtils.m19837i(declarationDescriptorWithVisibility, ClassDescriptor.class, true);
            ClassDescriptor classDescriptor3 = (ClassDescriptor) DescriptorUtils.m19837i(declarationDescriptor, ClassDescriptor.class, false);
            if (classDescriptor3 != null) {
                if (classDescriptor2 == null || !DescriptorUtils.m19840l(classDescriptor2) || (classDescriptor = (ClassDescriptor) DescriptorUtils.m19837i(classDescriptor2, ClassDescriptor.class, true)) == null || !DescriptorUtils.m19846r(classDescriptor3.mo18885q(), classDescriptor.mo18872a())) {
                    DeclarationDescriptorWithVisibility declarationDescriptorWithVisibilityM19848t = declarationDescriptorWithVisibility instanceof CallableMemberDescriptor ? DescriptorUtils.m19848t((CallableMemberDescriptor) declarationDescriptorWithVisibility) : declarationDescriptorWithVisibility;
                    ClassDescriptor classDescriptor4 = (ClassDescriptor) DescriptorUtils.m19837i(declarationDescriptorWithVisibilityM19848t, ClassDescriptor.class, true);
                    if (classDescriptor4 != null) {
                        if (DescriptorUtils.m19846r(classDescriptor3.mo18885q(), classDescriptor4.mo18872a()) && receiverValue != DescriptorVisibilities.f52257o) {
                            if ((declarationDescriptorWithVisibilityM19848t instanceof CallableMemberDescriptor) && !(declarationDescriptorWithVisibilityM19848t instanceof ConstructorDescriptor) && receiverValue != DescriptorVisibilities.f52256n) {
                                if (receiverValue != DescriptorVisibilities.f52255m && receiverValue != null) {
                                    if (!(receiverValue instanceof SuperCallReceiverValue)) {
                                        ((C601511) receiverValue).getType();
                                        throw null;
                                    }
                                    KotlinType kotlinTypeM20009b = ((SuperCallReceiverValue) receiverValue).m20009b();
                                    if (!DescriptorUtils.m19846r(kotlinTypeM20009b, classDescriptor3)) {
                                    }
                                }
                            }
                        }
                        return mo18918c(receiverValue, declarationDescriptorWithVisibility, classDescriptor3.mo18828e());
                    }
                }
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities$4 */
    /* JADX INFO: compiled from: Proguard */
    public static class C60194 extends DelegatedDescriptorVisibility {
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
        /* JADX INFO: renamed from: c */
        public final boolean mo18918c(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor) {
            if (declarationDescriptor == null) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$4", "isVisible"));
            }
            if (!DescriptorUtils.m19832d(declarationDescriptor).mo18947Y(DescriptorUtils.m19832d(declarationDescriptorWithVisibility))) {
                return false;
            }
            DescriptorVisibilities.f52258p.mo20329a(declarationDescriptorWithVisibility, declarationDescriptor);
            return true;
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities$5 */
    /* JADX INFO: compiled from: Proguard */
    public static class C60205 extends DelegatedDescriptorVisibility {
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
        /* JADX INFO: renamed from: c */
        public final boolean mo18918c(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor) {
            if (declarationDescriptor != null) {
                return true;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$5", "isVisible"));
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities$6 */
    /* JADX INFO: compiled from: Proguard */
    public static class C60216 extends DelegatedDescriptorVisibility {
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
        /* JADX INFO: renamed from: c */
        public final boolean mo18918c(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor) {
            if (declarationDescriptor == null) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$6", "isVisible"));
            }
            throw new IllegalStateException("This method shouldn't be invoked for LOCAL visibility");
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities$7 */
    /* JADX INFO: compiled from: Proguard */
    public static class C60227 extends DelegatedDescriptorVisibility {
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
        /* JADX INFO: renamed from: c */
        public final boolean mo18918c(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor) {
            if (declarationDescriptor == null) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$7", "isVisible"));
            }
            throw new IllegalStateException("Visibility is unknown yet");
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities$8 */
    /* JADX INFO: compiled from: Proguard */
    public static class C60238 extends DelegatedDescriptorVisibility {
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
        /* JADX INFO: renamed from: c */
        public final boolean mo18918c(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor) {
            if (declarationDescriptor != null) {
                return false;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$8", "isVisible"));
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities$9 */
    /* JADX INFO: compiled from: Proguard */
    public static class C60249 extends DelegatedDescriptorVisibility {
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
        /* JADX INFO: renamed from: c */
        public final boolean mo18918c(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor) {
            if (declarationDescriptor != null) {
                return false;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$9", "isVisible"));
        }
    }

    static {
        C60131 c60131 = new C60131(Visibilities.Private.f52309c);
        f52243a = c60131;
        C60172 c60172 = new C60172(Visibilities.PrivateToThis.f52310c);
        f52244b = c60172;
        C60183 c60183 = new C60183(Visibilities.Protected.f52311c);
        f52245c = c60183;
        C60194 c60194 = new C60194(Visibilities.Internal.f52306c);
        f52246d = c60194;
        C60205 c60205 = new C60205(Visibilities.Public.f52312c);
        f52247e = c60205;
        C60216 c60216 = new C60216(Visibilities.Local.f52308c);
        f52248f = c60216;
        C60227 c60227 = new C60227(Visibilities.Inherited.f52305c);
        f52249g = c60227;
        C60238 c60238 = new C60238(Visibilities.InvisibleFake.f52307c);
        f52250h = c60238;
        C60249 c60249 = new C60249(Visibilities.Unknown.f52313c);
        f52251i = c60249;
        f52252j = Collections.unmodifiableSet(ArraysKt.m18372h0(new DescriptorVisibility[]{c60131, c60172, c60194, c60216}));
        HashMap map = new HashMap(6);
        map.put(c60172, 0);
        map.put(c60131, 0);
        map.put(c60194, 1);
        map.put(c60183, 1);
        map.put(c60205, 2);
        f52253k = Collections.unmodifiableMap(map);
        f52254l = c60205;
        f52255m = new C601410();
        f52256n = new C601511();
        f52257o = new C601612();
        Iterator it = ServiceLoader.load(ModuleVisibilityHelper.class, ModuleVisibilityHelper.class.getClassLoader()).iterator();
        f52258p = it.hasNext() ? (ModuleVisibilityHelper) it.next() : ModuleVisibilityHelper.EMPTY.f55040a;
        f52259q = new HashMap();
        m18916f(c60131);
        m18916f(c60172);
        m18916f(c60183);
        m18916f(c60194);
        m18916f(c60205);
        m18916f(c60216);
        m18916f(c60227);
        m18916f(c60238);
        m18916f(c60249);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void m18911a(int i) {
        String str = i != 16 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 16 ? 3 : 2];
        if (i != 1 && i != 3 && i != 5 && i != 7) {
            switch (i) {
                case 9:
                    break;
                case 10:
                case TYPE_BYTES_VALUE:
                    objArr[0] = "first";
                    break;
                case 11:
                case 13:
                    objArr[0] = "second";
                    break;
                case 14:
                case 15:
                    objArr[0] = "visibility";
                    break;
                case 16:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
                    break;
                default:
                    objArr[0] = "what";
                    break;
            }
        } else {
            objArr[0] = "from";
        }
        if (i != 16) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
        } else {
            objArr[1] = "toDescriptorVisibility";
        }
        switch (i) {
            case 2:
            case 3:
                objArr[2] = "isVisibleIgnoringReceiver";
                break;
            case 4:
            case 5:
                objArr[2] = "isVisibleWithAnyReceiver";
                break;
            case 6:
            case 7:
                objArr[2] = "inSameFile";
                break;
            case 8:
            case 9:
                objArr[2] = "findInvisibleMember";
                break;
            case 10:
            case 11:
                objArr[2] = "compareLocal";
                break;
            case TYPE_BYTES_VALUE:
            case 13:
                objArr[2] = "compare";
                break;
            case 14:
                objArr[2] = "isPrivate";
                break;
            case 15:
                objArr[2] = "toDescriptorVisibility";
                break;
            case 16:
                break;
            default:
                objArr[2] = "isVisible";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i == 16) {
            throw new IllegalStateException(str2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static Integer m18912b(DescriptorVisibility descriptorVisibility, DescriptorVisibility descriptorVisibility2) {
        if (descriptorVisibility == null) {
            m18911a(12);
            throw null;
        }
        if (descriptorVisibility2 == null) {
            m18911a(13);
            throw null;
        }
        Integer numMo18986a = descriptorVisibility.mo18906a().mo18986a(descriptorVisibility2.mo18906a());
        if (numMo18986a != null) {
            return numMo18986a;
        }
        Integer numMo18986a2 = descriptorVisibility2.mo18906a().mo18986a(descriptorVisibility.mo18906a());
        if (numMo18986a2 != null) {
            return Integer.valueOf(-numMo18986a2.intValue());
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static DeclarationDescriptorWithVisibility m18913c(ReceiverValue receiverValue, CallableMemberDescriptor callableMemberDescriptor, DeclarationDescriptor declarationDescriptor) {
        DeclarationDescriptorWithVisibility declarationDescriptorWithVisibilityM18913c;
        if (callableMemberDescriptor == null) {
            m18911a(8);
            throw null;
        }
        if (declarationDescriptor == null) {
            m18911a(9);
            throw null;
        }
        for (DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility = (DeclarationDescriptorWithVisibility) callableMemberDescriptor.mo18872a(); declarationDescriptorWithVisibility != null && declarationDescriptorWithVisibility.getVisibility() != f52248f; declarationDescriptorWithVisibility = (DeclarationDescriptorWithVisibility) DescriptorUtils.m19837i(declarationDescriptorWithVisibility, DeclarationDescriptorWithVisibility.class, true)) {
            if (!declarationDescriptorWithVisibility.getVisibility().mo18918c(receiverValue, declarationDescriptorWithVisibility, declarationDescriptor)) {
                return declarationDescriptorWithVisibility;
            }
        }
        if (!(callableMemberDescriptor instanceof TypeAliasConstructorDescriptor) || (declarationDescriptorWithVisibilityM18913c = m18913c(receiverValue, ((TypeAliasConstructorDescriptor) callableMemberDescriptor).mo19087j0(), declarationDescriptor)) == null) {
            return null;
        }
        return declarationDescriptorWithVisibilityM18913c;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m18914d(DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            m18911a(7);
            throw null;
        }
        SourceFile sourceFileM19834f = DescriptorUtils.m19834f(declarationDescriptor);
        if (sourceFileM19834f != SourceFile.f52299a) {
            return sourceFileM19834f.equals(DescriptorUtils.m19834f(declarationDescriptorWithVisibility));
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m18915e(DescriptorVisibility descriptorVisibility) {
        if (descriptorVisibility != null) {
            return descriptorVisibility == f52243a || descriptorVisibility == f52244b;
        }
        m18911a(14);
        throw null;
    }

    /* JADX INFO: renamed from: f */
    public static void m18916f(DelegatedDescriptorVisibility delegatedDescriptorVisibility) {
        f52259q.put(delegatedDescriptorVisibility.f52242a, delegatedDescriptorVisibility);
    }

    /* JADX INFO: renamed from: g */
    public static DescriptorVisibility m18917g(Visibility visibility) {
        if (visibility == null) {
            m18911a(15);
            throw null;
        }
        DescriptorVisibility descriptorVisibility = (DescriptorVisibility) f52259q.get(visibility);
        if (descriptorVisibility != null) {
            return descriptorVisibility;
        }
        throw new IllegalArgumentException("Inapplicable visibility: " + visibility);
    }
}
