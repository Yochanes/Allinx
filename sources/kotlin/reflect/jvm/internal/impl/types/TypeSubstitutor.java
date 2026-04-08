package kotlin.reflect.jvm.internal.impl.types;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.zxing.aztec.encoder.Encoder;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.CompositeAnnotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.FilteredAnnotations;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.typesApproximation.CapturedTypeApproximationKt;
import kotlin.reflect.jvm.internal.impl.utils.ExceptionUtilsKt;
import me.jessyan.autosize.BuildConfig;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class TypeSubstitutor {

    /* JADX INFO: renamed from: b */
    public static final TypeSubstitutor f54881b = new TypeSubstitutor(TypeSubstitution.f54879a);

    /* JADX INFO: renamed from: a */
    public final TypeSubstitution f54882a;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor$1 */
    /* JADX INFO: compiled from: Proguard */
    final class C62161 implements Function1<FqName, Boolean> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            if (((FqName) obj) != null) {
                return Boolean.valueOf(!r2.equals(StandardNames.FqNames.f52118y));
            }
            throw new IllegalArgumentException("Argument for @NotNull parameter 'name' of kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor$1.invoke must not be null");
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor$2 */
    /* JADX INFO: compiled from: Proguard */
    public static /* synthetic */ class C62172 {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f54883a;

        static {
            int[] iArr = new int[VarianceConflictType.values().length];
            f54883a = iArr;
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f54883a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f54883a[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class SubstitutionException extends Exception {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    public static final class VarianceConflictType {

        /* JADX INFO: renamed from: a */
        public static final VarianceConflictType f54884a;

        /* JADX INFO: renamed from: b */
        public static final VarianceConflictType f54885b;

        /* JADX INFO: renamed from: c */
        public static final VarianceConflictType f54886c;

        /* JADX INFO: renamed from: d */
        public static final /* synthetic */ VarianceConflictType[] f54887d;

        static {
            VarianceConflictType varianceConflictType = new VarianceConflictType("NO_CONFLICT", 0);
            f54884a = varianceConflictType;
            VarianceConflictType varianceConflictType2 = new VarianceConflictType("IN_IN_OUT_POSITION", 1);
            f54885b = varianceConflictType2;
            VarianceConflictType varianceConflictType3 = new VarianceConflictType("OUT_IN_IN_POSITION", 2);
            f54886c = varianceConflictType3;
            f54887d = new VarianceConflictType[]{varianceConflictType, varianceConflictType2, varianceConflictType3};
        }

        public static VarianceConflictType valueOf(String str) {
            return (VarianceConflictType) Enum.valueOf(VarianceConflictType.class, str);
        }

        public static VarianceConflictType[] values() {
            return (VarianceConflictType[]) f54887d.clone();
        }
    }

    public TypeSubstitutor(TypeSubstitution typeSubstitution) {
        this.f54882a = typeSubstitution;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b8  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void m20189a(int i) {
        String str;
        int i2;
        if (i != 1 && i != 2 && i != 8 && i != 34 && i != 37) {
            switch (i) {
                default:
                    switch (i) {
                        default:
                            switch (i) {
                                default:
                                    switch (i) {
                                        case 40:
                                        case BuildConfig.VERSION_CODE /* 41 */:
                                        case 42:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    break;
                            }
                        case 19:
                        case 20:
                        case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                        case 22:
                        case ConnectionResult.API_DISABLED /* 23 */:
                        case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                        case me.jessyan.retrofiturlmanager.BuildConfig.VERSION_CODE /* 25 */:
                            break;
                    }
                case 11:
                case TYPE_BYTES_VALUE:
                case 13:
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 1 && i != 2 && i != 8 && i != 34 && i != 37) {
            switch (i) {
                case 11:
                case TYPE_BYTES_VALUE:
                case 13:
                    i2 = 2;
                    break;
                default:
                    switch (i) {
                        case 19:
                        case 20:
                        case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                        case 22:
                        case ConnectionResult.API_DISABLED /* 23 */:
                        case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                        case me.jessyan.retrofiturlmanager.BuildConfig.VERSION_CODE /* 25 */:
                            i2 = 2;
                            break;
                        default:
                            switch (i) {
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    i2 = 2;
                                    break;
                                default:
                                    switch (i) {
                                        case 40:
                                        case BuildConfig.VERSION_CODE /* 41 */:
                                        case 42:
                                            i2 = 2;
                                            break;
                                        default:
                                            i2 = 3;
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            i2 = 2;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 2:
            case 8:
            case 11:
            case TYPE_BYTES_VALUE:
            case 13:
            case 19:
            case 20:
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
            case 22:
            case ConnectionResult.API_DISABLED /* 23 */:
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
            case me.jessyan.retrofiturlmanager.BuildConfig.VERSION_CODE /* 25 */:
            case 29:
            case 30:
            case 31:
            case 32:
            case 34:
            case 37:
            case 40:
            case BuildConfig.VERSION_CODE /* 41 */:
            case 42:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                break;
            case 3:
                objArr[0] = "first";
                break;
            case 4:
                objArr[0] = "second";
                break;
            case 5:
                objArr[0] = "substitutionContext";
                break;
            case 6:
                objArr[0] = "context";
                break;
            case 7:
            default:
                objArr[0] = "substitution";
                break;
            case 9:
            case 14:
                objArr[0] = "type";
                break;
            case 10:
            case 15:
                objArr[0] = "howThisTypeIsUsed";
                break;
            case 16:
            case 17:
            case 36:
                objArr[0] = "typeProjection";
                break;
            case 18:
            case 28:
                objArr[0] = "originalProjection";
                break;
            case 26:
                objArr[0] = "originalType";
                break;
            case 27:
                objArr[0] = "substituted";
                break;
            case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                objArr[0] = "annotations";
                break;
            case 35:
            case 38:
                objArr[0] = "typeParameterVariance";
                break;
            case 39:
                objArr[0] = "projectionKind";
                break;
        }
        if (i == 1) {
            objArr[1] = "replaceWithNonApproximatingSubstitution";
        } else if (i == 2) {
            objArr[1] = "replaceWithContravariantApproximatingSubstitution";
        } else if (i == 8) {
            objArr[1] = "getSubstitution";
        } else if (i == 34) {
            objArr[1] = "filterOutUnsafeVariance";
        } else if (i != 37) {
            switch (i) {
                case 11:
                case TYPE_BYTES_VALUE:
                case 13:
                    objArr[1] = "safeSubstitute";
                    break;
                default:
                    switch (i) {
                        case 19:
                        case 20:
                        case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                        case 22:
                        case ConnectionResult.API_DISABLED /* 23 */:
                        case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                        case me.jessyan.retrofiturlmanager.BuildConfig.VERSION_CODE /* 25 */:
                            objArr[1] = "unsafeSubstitute";
                            break;
                        default:
                            switch (i) {
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    objArr[1] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                                    break;
                                default:
                                    switch (i) {
                                        case 40:
                                        case BuildConfig.VERSION_CODE /* 41 */:
                                        case 42:
                                            objArr[1] = "combine";
                                            break;
                                        default:
                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        switch (i) {
            case 1:
            case 2:
            case 8:
            case 11:
            case TYPE_BYTES_VALUE:
            case 13:
            case 19:
            case 20:
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
            case 22:
            case ConnectionResult.API_DISABLED /* 23 */:
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
            case me.jessyan.retrofiturlmanager.BuildConfig.VERSION_CODE /* 25 */:
            case 29:
            case 30:
            case 31:
            case 32:
            case 34:
            case 37:
            case 40:
            case BuildConfig.VERSION_CODE /* 41 */:
            case 42:
                break;
            case 3:
            case 4:
                objArr[2] = "createChainedSubstitutor";
                break;
            case 5:
            case 6:
            default:
                objArr[2] = "create";
                break;
            case 7:
                objArr[2] = "<init>";
                break;
            case 9:
            case 10:
                objArr[2] = "safeSubstitute";
                break;
            case 14:
            case 15:
            case 16:
                objArr[2] = "substitute";
                break;
            case 17:
                objArr[2] = "substituteWithoutApproximation";
                break;
            case 18:
                objArr[2] = "unsafeSubstitute";
                break;
            case 26:
            case 27:
            case 28:
                objArr[2] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                break;
            case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                objArr[2] = "filterOutUnsafeVariance";
                break;
            case 35:
            case 36:
            case 38:
            case 39:
                objArr[2] = "combine";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 1 && i != 2 && i != 8 && i != 34 && i != 37) {
            switch (i) {
                case 11:
                case TYPE_BYTES_VALUE:
                case 13:
                    break;
                default:
                    switch (i) {
                        case 19:
                        case 20:
                        case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                        case 22:
                        case ConnectionResult.API_DISABLED /* 23 */:
                        case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                        case me.jessyan.retrofiturlmanager.BuildConfig.VERSION_CODE /* 25 */:
                            break;
                        default:
                            switch (i) {
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    break;
                                default:
                                    switch (i) {
                                        case 40:
                                        case BuildConfig.VERSION_CODE /* 41 */:
                                        case 42:
                                            break;
                                        default:
                                            throw new IllegalArgumentException(str2);
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        throw new IllegalStateException(str2);
    }

    /* JADX INFO: renamed from: b */
    public static Variance m20190b(Variance variance, Variance variance2) {
        if (variance == null) {
            m20189a(38);
            throw null;
        }
        if (variance2 == null) {
            m20189a(39);
            throw null;
        }
        Variance variance3 = Variance.f54896c;
        if (variance == variance3) {
            if (variance2 != null) {
                return variance2;
            }
            m20189a(40);
            throw null;
        }
        if (variance2 == variance3) {
            if (variance != null) {
                return variance;
            }
            m20189a(41);
            throw null;
        }
        if (variance == variance2) {
            if (variance2 != null) {
                return variance2;
            }
            m20189a(42);
            throw null;
        }
        throw new AssertionError("Variance conflict: type parameter variance '" + variance + "' and projection kind '" + variance2 + "' cannot be combined");
    }

    /* JADX INFO: renamed from: c */
    public static VarianceConflictType m20191c(Variance variance, Variance variance2) {
        Variance variance3 = Variance.f54897d;
        Variance variance4 = Variance.f54898f;
        return (variance == variance3 && variance2 == variance4) ? VarianceConflictType.f54886c : (variance == variance4 && variance2 == variance3) ? VarianceConflictType.f54885b : VarianceConflictType.f54884a;
    }

    /* JADX INFO: renamed from: d */
    public static TypeSubstitutor m20192d(KotlinType kotlinType) {
        if (kotlinType == null) {
            m20189a(6);
            throw null;
        }
        return new TypeSubstitutor(TypeConstructorSubstitution.f54868b.m20180a(kotlinType.mo19953I0(), kotlinType.mo19951G0()));
    }

    /* JADX INFO: renamed from: e */
    public static TypeSubstitutor m20193e(TypeSubstitution typeSubstitution, TypeSubstitution typeSubstitution2) {
        if (typeSubstitution == null) {
            m20189a(3);
            throw null;
        }
        if (typeSubstitution2 == null) {
            m20189a(4);
            throw null;
        }
        if (typeSubstitution.mo20129e()) {
            typeSubstitution = typeSubstitution2;
        } else if (!typeSubstitution2.mo20129e()) {
            typeSubstitution = new DisjointKeysUnionTypeSubstitution(typeSubstitution, typeSubstitution2);
        }
        return new TypeSubstitutor(typeSubstitution);
    }

    /* JADX INFO: renamed from: h */
    public static String m20194h(Object obj) {
        try {
            return obj.toString();
        } catch (Throwable th) {
            if (ExceptionUtilsKt.m20342a(th)) {
                throw th;
            }
            return "[Exception while computing toString(): " + th + "]";
        }
    }

    /* JADX INFO: renamed from: f */
    public final TypeSubstitution m20195f() {
        TypeSubstitution typeSubstitution = this.f54882a;
        if (typeSubstitution != null) {
            return typeSubstitution;
        }
        m20189a(8);
        throw null;
    }

    /* JADX INFO: renamed from: g */
    public final KotlinType m20196g(KotlinType kotlinType, Variance variance) {
        if (kotlinType == null) {
            m20189a(9);
            throw null;
        }
        if (this.f54882a.mo20129e()) {
            return kotlinType;
        }
        try {
            KotlinType type = m20198j(new TypeProjectionImpl(kotlinType, variance), null, 0).getType();
            if (type != null) {
                return type;
            }
            m20189a(12);
            throw null;
        } catch (SubstitutionException e) {
            return ErrorUtils.m20300c(ErrorTypeKind.f54982p, e.getMessage());
        }
    }

    /* JADX INFO: renamed from: i */
    public final KotlinType m20197i(KotlinType kotlinType, Variance variance) {
        if (kotlinType == null) {
            m20189a(14);
            throw null;
        }
        if (variance == null) {
            m20189a(15);
            throw null;
        }
        TypeProjection typeProjectionImpl = new TypeProjectionImpl(m20195f().mo20130f(kotlinType, variance), variance);
        TypeSubstitution typeSubstitution = this.f54882a;
        if (!typeSubstitution.mo20129e()) {
            try {
                typeProjectionImpl = m20198j(typeProjectionImpl, null, 0);
            } catch (SubstitutionException unused) {
                typeProjectionImpl = null;
            }
        }
        if (typeSubstitution.mo20127a() || typeSubstitution.mo19957b()) {
            typeProjectionImpl = CapturedTypeApproximationKt.m20320b(typeProjectionImpl, typeSubstitution.mo19957b());
        }
        if (typeProjectionImpl == null) {
            return null;
        }
        return typeProjectionImpl.getType();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0130  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final TypeProjection m20198j(TypeProjection typeProjection, TypeParameterDescriptor typeParameterDescriptor, int i) throws SubstitutionException {
        char c2;
        TypeSubstitutor typeSubstitutor;
        TypeSubstitutor typeSubstitutor2 = this;
        int i2 = 0;
        KotlinType kotlinTypeM20197i = null;
        if (typeProjection == null) {
            m20189a(18);
            throw null;
        }
        TypeSubstitution typeSubstitution = typeSubstitutor2.f54882a;
        if (i > 100) {
            throw new IllegalStateException("Recursion too deep. Most likely infinite loop while substituting " + m20194h(typeProjection) + "; substitution: " + m20194h(typeSubstitution));
        }
        if (!typeProjection.mo20160c()) {
            KotlinType type = typeProjection.getType();
            if (type instanceof TypeWithEnhancement) {
                TypeWithEnhancement typeWithEnhancement = (TypeWithEnhancement) type;
                UnwrappedType unwrappedTypeMo20138A0 = typeWithEnhancement.mo20138A0();
                KotlinType kotlinTypeMo20137A = typeWithEnhancement.mo20137A();
                TypeProjection typeProjectionM20198j = typeSubstitutor2.m20198j(new TypeProjectionImpl(unwrappedTypeMo20138A0, typeProjection.mo20158a()), typeParameterDescriptor, i + 1);
                return typeProjectionM20198j.mo20160c() ? typeProjectionM20198j : new TypeProjectionImpl(TypeWithEnhancementKt.m20215c(typeProjectionM20198j.getType().mo20144L0(), typeSubstitutor2.m20197i(kotlinTypeMo20137A, typeProjection.mo20158a())), typeProjectionM20198j.mo20158a());
            }
            if (!DynamicTypesKt.m20134a(type) && !(type.mo20144L0() instanceof RawType)) {
                TypeProjection typeProjectionMo19297d = typeSubstitution.mo19297d(type);
                if (typeProjectionMo19297d == null) {
                    typeProjectionMo19297d = null;
                } else if (type.getAnnotations().mo18994H(StandardNames.FqNames.f52118y)) {
                    TypeConstructor typeConstructorMo19953I0 = typeProjectionMo19297d.getType().mo19953I0();
                    if (typeConstructorMo19953I0 instanceof NewCapturedTypeConstructor) {
                        TypeProjection typeProjection2 = ((NewCapturedTypeConstructor) typeConstructorMo19953I0).f54914a;
                        Variance varianceMo20158a = typeProjection2.mo20158a();
                        VarianceConflictType varianceConflictTypeM20191c = m20191c(typeProjection.mo20158a(), varianceMo20158a);
                        VarianceConflictType varianceConflictType = VarianceConflictType.f54886c;
                        if (varianceConflictTypeM20191c == varianceConflictType) {
                            typeProjectionMo19297d = new TypeProjectionImpl(typeProjection2.getType());
                        } else if (typeParameterDescriptor != null && m20191c(typeParameterDescriptor.mo18884k(), varianceMo20158a) == varianceConflictType) {
                            typeProjectionMo19297d = new TypeProjectionImpl(typeProjection2.getType());
                        }
                    }
                }
                Variance varianceMo20158a2 = typeProjection.mo20158a();
                if (typeProjectionMo19297d == null && FlexibleTypesKt.m20139a(type)) {
                    Object objMo20144L0 = type.mo20144L0();
                    CustomTypeParameter customTypeParameter = objMo20144L0 instanceof CustomTypeParameter ? (CustomTypeParameter) objMo20144L0 : null;
                    if (!(customTypeParameter != null ? customTypeParameter.mo19328u0() : false)) {
                        FlexibleType flexibleType = (FlexibleType) type.mo20144L0();
                        SimpleType simpleType = flexibleType.f54810b;
                        int i3 = i + 1;
                        TypeProjection typeProjectionM20198j2 = typeSubstitutor2.m20198j(new TypeProjectionImpl(simpleType, varianceMo20158a2), typeParameterDescriptor, i3);
                        SimpleType simpleType2 = flexibleType.f54811c;
                        TypeProjection typeProjectionM20198j3 = typeSubstitutor2.m20198j(new TypeProjectionImpl(simpleType2, varianceMo20158a2), typeParameterDescriptor, i3);
                        Variance varianceMo20158a3 = typeProjectionM20198j2.mo20158a();
                        if (typeProjectionM20198j2.getType() != simpleType || typeProjectionM20198j3.getType() != simpleType2) {
                            return new TypeProjectionImpl(KotlinTypeFactory.m20146b(TypeSubstitutionKt.m20185a(typeProjectionM20198j2.getType()), TypeSubstitutionKt.m20185a(typeProjectionM20198j3.getType())), varianceMo20158a3);
                        }
                    }
                } else if (!KotlinBuiltIns.m18777D(type) && !KotlinTypeKt.m20151a(type)) {
                    if (typeProjectionMo19297d != null) {
                        VarianceConflictType varianceConflictTypeM20191c2 = m20191c(varianceMo20158a2, typeProjectionMo19297d.mo20158a());
                        if (!(type.mo19953I0() instanceof CapturedTypeConstructor)) {
                            int iOrdinal = varianceConflictTypeM20191c2.ordinal();
                            if (iOrdinal == 1) {
                                return new TypeProjectionImpl(type.mo19953I0().mo19010l().m18803n(), Variance.f54898f);
                            }
                            if (iOrdinal == 2) {
                                throw new SubstitutionException("Out-projection in in-position");
                            }
                        }
                        Object objMo20144L02 = type.mo20144L0();
                        CustomTypeParameter customTypeParameter2 = objMo20144L02 instanceof CustomTypeParameter ? (CustomTypeParameter) objMo20144L02 : null;
                        if (customTypeParameter2 == null || !customTypeParameter2.mo19328u0()) {
                            customTypeParameter2 = null;
                        }
                        if (typeProjectionMo19297d.mo20160c()) {
                            return typeProjectionMo19297d;
                        }
                        KotlinType kotlinTypeMo19322E = customTypeParameter2 != null ? customTypeParameter2.mo19322E(typeProjectionMo19297d.getType()) : TypeUtils.m20206h(typeProjectionMo19297d.getType(), type.mo19323J0());
                        if (!type.getAnnotations().isEmpty()) {
                            Annotations annotationsMo20128c = typeSubstitution.mo20128c(type.getAnnotations());
                            if (annotationsMo20128c == null) {
                                m20189a(33);
                                throw null;
                            }
                            if (annotationsMo20128c.mo18994H(StandardNames.FqNames.f52118y)) {
                                annotationsMo20128c = new FilteredAnnotations(annotationsMo20128c, new C62161());
                            }
                            kotlinTypeMo19322E = TypeUtilsKt.m20316l(kotlinTypeMo19322E, new CompositeAnnotations(kotlinTypeMo19322E.getAnnotations(), annotationsMo20128c));
                        }
                        if (varianceConflictTypeM20191c2 == VarianceConflictType.f54884a) {
                            varianceMo20158a2 = m20190b(varianceMo20158a2, typeProjectionMo19297d.mo20158a());
                        }
                        return new TypeProjectionImpl(kotlinTypeMo19322E, varianceMo20158a2);
                    }
                    KotlinType type2 = typeProjection.getType();
                    Variance varianceMo20158a4 = typeProjection.mo20158a();
                    if (!(type2.mo19953I0().mo18838b() instanceof TypeParameterDescriptor)) {
                        UnwrappedType unwrappedTypeMo20144L0 = type2.mo20144L0();
                        AbbreviatedType abbreviatedType = unwrappedTypeMo20144L0 instanceof AbbreviatedType ? (AbbreviatedType) unwrappedTypeMo20144L0 : null;
                        SimpleType simpleType3 = abbreviatedType != null ? abbreviatedType.f54774c : null;
                        Variance variance = Variance.f54896c;
                        if (simpleType3 != null) {
                            if ((typeSubstitution instanceof IndexedParametersSubstitution) && typeSubstitution.mo19957b()) {
                                IndexedParametersSubstitution indexedParametersSubstitution = (IndexedParametersSubstitution) typeSubstitution;
                                typeSubstitutor = new TypeSubstitutor(new IndexedParametersSubstitution(indexedParametersSubstitution.f54814b, indexedParametersSubstitution.f54815c, false));
                            } else {
                                typeSubstitutor = typeSubstitutor2;
                            }
                            kotlinTypeM20197i = typeSubstitutor.m20197i(simpleType3, variance);
                        }
                        List parameters = type2.mo19953I0().getParameters();
                        List newArguments = type2.mo19951G0();
                        ArrayList arrayList = new ArrayList(parameters.size());
                        boolean z2 = false;
                        while (i2 < parameters.size()) {
                            TypeParameterDescriptor typeParameterDescriptor2 = (TypeParameterDescriptor) parameters.get(i2);
                            TypeProjection typeProjection3 = (TypeProjection) newArguments.get(i2);
                            TypeProjection typeProjectionM20198j4 = typeSubstitutor2.m20198j(typeProjection3, typeParameterDescriptor2, i + 1);
                            int iOrdinal2 = m20191c(typeParameterDescriptor2.mo18884k(), typeProjectionM20198j4.mo20158a()).ordinal();
                            if (iOrdinal2 != 0) {
                                if (iOrdinal2 != 1) {
                                    c2 = 2;
                                    if (iOrdinal2 == 2) {
                                    }
                                } else {
                                    c2 = 2;
                                }
                                typeProjectionM20198j4 = TypeUtils.m20208j(typeParameterDescriptor2);
                            } else {
                                c2 = 2;
                                if (typeParameterDescriptor2.mo18884k() != variance && !typeProjectionM20198j4.mo20160c()) {
                                    typeProjectionM20198j4 = new TypeProjectionImpl(typeProjectionM20198j4.getType(), variance);
                                }
                            }
                            if (typeProjectionM20198j4 != typeProjection3) {
                                z2 = true;
                            }
                            arrayList.add(typeProjectionM20198j4);
                            i2++;
                            typeSubstitutor2 = this;
                        }
                        if (z2) {
                            newArguments = arrayList;
                        }
                        Annotations newAnnotations = typeSubstitution.mo20128c(type2.getAnnotations());
                        Intrinsics.m18599g(newArguments, "newArguments");
                        Intrinsics.m18599g(newAnnotations, "newAnnotations");
                        KotlinType kotlinTypeM20187c = TypeSubstitutionKt.m20187c(type2, newArguments, newAnnotations, 4);
                        if ((kotlinTypeM20187c instanceof SimpleType) && (kotlinTypeM20197i instanceof SimpleType)) {
                            kotlinTypeM20187c = SpecialTypesKt.m20157c((SimpleType) kotlinTypeM20187c, (SimpleType) kotlinTypeM20197i);
                        }
                        return new TypeProjectionImpl(kotlinTypeM20187c, varianceMo20158a4);
                    }
                }
            }
        }
        return typeProjection;
    }
}
