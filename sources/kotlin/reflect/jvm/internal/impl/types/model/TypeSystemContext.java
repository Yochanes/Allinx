package kotlin.reflect.jvm.internal.impl.types.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.RawType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext$substitutionSupertypePolicy$2;
import kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension
public interface TypeSystemContext extends TypeSystemOptimizationContext {
    /* JADX INFO: renamed from: A */
    boolean mo19881A(TypeArgumentMarker typeArgumentMarker);

    /* JADX INFO: renamed from: B */
    FlexibleType mo19882B(KotlinTypeMarker kotlinTypeMarker);

    /* JADX INFO: renamed from: C */
    TypeVariance mo19883C(TypeParameterMarker typeParameterMarker);

    /* JADX INFO: renamed from: D */
    CaptureStatus mo19884D(CapturedTypeMarker capturedTypeMarker);

    /* JADX INFO: renamed from: E */
    UnwrappedType mo19885E(KotlinTypeMarker kotlinTypeMarker);

    /* JADX INFO: renamed from: F */
    SimpleType mo19886F(SimpleTypeMarker simpleTypeMarker);

    /* JADX INFO: renamed from: G */
    int mo19887G(TypeArgumentListMarker typeArgumentListMarker);

    /* JADX INFO: renamed from: H */
    TypeProjection mo19888H(CapturedTypeConstructorMarker capturedTypeConstructorMarker);

    /* JADX INFO: renamed from: I */
    TypeConstructor mo19889I(SimpleTypeMarker simpleTypeMarker);

    /* JADX INFO: renamed from: J */
    boolean mo19890J(SimpleTypeMarker simpleTypeMarker);

    /* JADX INFO: renamed from: K */
    SimpleType mo19891K(KotlinTypeMarker kotlinTypeMarker);

    /* JADX INFO: renamed from: L */
    UnwrappedType mo19892L(CapturedTypeMarker capturedTypeMarker);

    /* JADX INFO: renamed from: M */
    boolean mo19893M(TypeConstructorMarker typeConstructorMarker);

    /* JADX INFO: renamed from: N */
    boolean mo19894N(SimpleTypeMarker simpleTypeMarker);

    /* JADX INFO: renamed from: O */
    List mo19895O(KotlinTypeMarker kotlinTypeMarker);

    /* JADX INFO: renamed from: P */
    boolean mo19896P(KotlinTypeMarker kotlinTypeMarker);

    /* JADX INFO: renamed from: Q */
    SimpleType mo19897Q(SimpleTypeMarker simpleTypeMarker, boolean z2);

    /* JADX INFO: renamed from: R */
    boolean mo19898R(TypeConstructorMarker typeConstructorMarker);

    /* JADX INFO: renamed from: S */
    UnwrappedType mo19899S(ArrayList arrayList);

    /* JADX INFO: renamed from: T */
    TypeProjectionImpl mo19900T(KotlinTypeMarker kotlinTypeMarker);

    /* JADX INFO: renamed from: U */
    NewCapturedTypeConstructor mo19901U(CapturedTypeMarker capturedTypeMarker);

    /* JADX INFO: renamed from: V */
    List mo19902V(TypeConstructorMarker typeConstructorMarker);

    /* JADX INFO: renamed from: W */
    SimpleType mo19903W(FlexibleTypeMarker flexibleTypeMarker);

    /* JADX INFO: renamed from: X */
    CapturedTypeMarker mo19904X(SimpleTypeMarker simpleTypeMarker);

    /* JADX INFO: renamed from: Y */
    TypeArgumentMarker mo19905Y(KotlinTypeMarker kotlinTypeMarker, int i);

    /* JADX INFO: renamed from: Z */
    SimpleType mo19906Z(KotlinTypeMarker kotlinTypeMarker);

    /* JADX INFO: renamed from: a */
    int mo19907a(TypeConstructorMarker typeConstructorMarker);

    /* JADX INFO: renamed from: a0 */
    TypeVariance mo19908a0(TypeArgumentMarker typeArgumentMarker);

    /* JADX INFO: renamed from: b */
    int mo19909b(KotlinTypeMarker kotlinTypeMarker);

    /* JADX INFO: renamed from: b0 */
    boolean mo19910b0(TypeConstructorMarker typeConstructorMarker);

    /* JADX INFO: renamed from: c */
    boolean mo19911c(CapturedTypeMarker capturedTypeMarker);

    /* JADX INFO: renamed from: c0 */
    TypeParameterDescriptor mo19912c0(TypeVariableTypeConstructorMarker typeVariableTypeConstructorMarker);

    /* JADX INFO: renamed from: d */
    SimpleType mo19913d(KotlinTypeMarker kotlinTypeMarker);

    /* JADX INFO: renamed from: d0 */
    boolean mo19914d0(SimpleTypeMarker simpleTypeMarker);

    /* JADX INFO: renamed from: e */
    KotlinTypeMarker mo19915e(KotlinTypeMarker kotlinTypeMarker);

    /* JADX INFO: renamed from: e0 */
    boolean mo19916e0(TypeConstructorMarker typeConstructorMarker);

    /* JADX INFO: renamed from: f */
    SimpleTypeMarker mo19917f(SimpleTypeMarker simpleTypeMarker);

    /* JADX INFO: renamed from: f0 */
    DefinitelyNotNullType mo19918f0(SimpleTypeMarker simpleTypeMarker);

    /* JADX INFO: renamed from: g */
    void mo19919g(SimpleTypeMarker simpleTypeMarker, TypeConstructorMarker typeConstructorMarker);

    /* JADX INFO: renamed from: h */
    boolean mo19921h(TypeParameterMarker typeParameterMarker, TypeConstructorMarker typeConstructorMarker);

    /* JADX INFO: renamed from: h0 */
    boolean mo19922h0(TypeConstructorMarker typeConstructorMarker);

    /* JADX INFO: renamed from: i */
    boolean mo19923i(TypeConstructorMarker typeConstructorMarker);

    /* JADX INFO: renamed from: i0 */
    boolean mo19924i0(SimpleTypeMarker simpleTypeMarker);

    /* JADX INFO: renamed from: j */
    boolean mo19925j(CapturedTypeMarker capturedTypeMarker);

    /* JADX INFO: renamed from: j0 */
    boolean mo19926j0(SimpleTypeMarker simpleTypeMarker);

    /* JADX INFO: renamed from: k */
    TypeArgumentListMarker mo19927k(SimpleTypeMarker simpleTypeMarker);

    /* JADX INFO: renamed from: k0 */
    UnwrappedType mo19928k0(TypeArgumentMarker typeArgumentMarker);

    /* JADX INFO: renamed from: l */
    boolean mo19929l(KotlinTypeMarker kotlinTypeMarker);

    /* JADX INFO: renamed from: l0 */
    boolean mo19930l0(TypeConstructorMarker typeConstructorMarker, TypeConstructorMarker typeConstructorMarker2);

    /* JADX INFO: renamed from: m */
    Collection mo19931m(TypeConstructorMarker typeConstructorMarker);

    /* JADX INFO: renamed from: m0 */
    SimpleType mo19932m0(FlexibleTypeMarker flexibleTypeMarker);

    /* JADX INFO: renamed from: n */
    TypeArgumentMarker mo19933n(TypeArgumentListMarker typeArgumentListMarker, int i);

    /* JADX INFO: renamed from: n0 */
    TypeArgumentMarker mo19934n0(SimpleTypeMarker simpleTypeMarker, int i);

    /* JADX INFO: renamed from: o */
    TypeConstructor mo19935o(KotlinTypeMarker kotlinTypeMarker);

    /* JADX INFO: renamed from: o0 */
    boolean mo19936o0(SimpleTypeMarker simpleTypeMarker);

    /* JADX INFO: renamed from: p */
    Collection mo19937p(SimpleTypeMarker simpleTypeMarker);

    /* JADX INFO: renamed from: q */
    boolean mo19938q(TypeConstructorMarker typeConstructorMarker);

    /* JADX INFO: renamed from: r */
    RawType mo19939r(FlexibleTypeMarker flexibleTypeMarker);

    /* JADX INFO: renamed from: s */
    boolean mo19940s(KotlinTypeMarker kotlinTypeMarker);

    /* JADX INFO: renamed from: t */
    ClassicTypeSystemContext$substitutionSupertypePolicy$2 mo19941t(SimpleTypeMarker simpleTypeMarker);

    /* JADX INFO: renamed from: u */
    boolean mo19942u(KotlinTypeMarker kotlinTypeMarker);

    /* JADX INFO: renamed from: v */
    TypeParameterMarker mo19943v(TypeConstructorMarker typeConstructorMarker, int i);

    /* JADX INFO: renamed from: x */
    SimpleType mo19945x(DefinitelyNotNullTypeMarker definitelyNotNullTypeMarker);

    /* JADX INFO: renamed from: y */
    boolean mo19946y(KotlinTypeMarker kotlinTypeMarker);

    /* JADX INFO: renamed from: z */
    boolean mo19947z(SimpleTypeMarker simpleTypeMarker);
}
