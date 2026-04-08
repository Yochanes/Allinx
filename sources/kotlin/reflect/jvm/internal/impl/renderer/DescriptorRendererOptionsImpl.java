package kotlin.reflect.jvm.internal.impl.renderer;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension
public final class DescriptorRendererOptionsImpl implements DescriptorRendererOptions {

    /* JADX INFO: renamed from: W */
    public static final /* synthetic */ KProperty[] f54253W;

    /* JADX INFO: renamed from: A */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f54254A;

    /* JADX INFO: renamed from: B */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f54255B;

    /* JADX INFO: renamed from: C */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f54256C;

    /* JADX INFO: renamed from: D */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f54257D;

    /* JADX INFO: renamed from: E */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f54258E;

    /* JADX INFO: renamed from: F */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f54259F;

    /* JADX INFO: renamed from: G */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f54260G;

    /* JADX INFO: renamed from: H */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f54261H;

    /* JADX INFO: renamed from: I */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f54262I;

    /* JADX INFO: renamed from: J */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f54263J;

    /* JADX INFO: renamed from: K */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f54264K;

    /* JADX INFO: renamed from: L */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f54265L;

    /* JADX INFO: renamed from: M */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f54266M;

    /* JADX INFO: renamed from: N */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f54267N;

    /* JADX INFO: renamed from: O */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f54268O;

    /* JADX INFO: renamed from: P */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f54269P;

    /* JADX INFO: renamed from: Q */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f54270Q;

    /* JADX INFO: renamed from: R */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f54271R;

    /* JADX INFO: renamed from: S */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f54272S;

    /* JADX INFO: renamed from: T */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f54273T;

    /* JADX INFO: renamed from: U */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f54274U;

    /* JADX INFO: renamed from: V */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f54275V;

    /* JADX INFO: renamed from: a */
    public boolean f54276a;

    /* JADX INFO: renamed from: b */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f54277b = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(ClassifierNamePolicy.SOURCE_CODE_QUALIFIED.f54209a, this);

    /* JADX INFO: renamed from: c */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f54278c;

    /* JADX INFO: renamed from: d */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f54279d;

    /* JADX INFO: renamed from: e */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f54280e;

    /* JADX INFO: renamed from: f */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f54281f;

    /* JADX INFO: renamed from: g */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f54282g;

    /* JADX INFO: renamed from: h */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f54283h;

    /* JADX INFO: renamed from: i */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f54284i;

    /* JADX INFO: renamed from: j */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f54285j;

    /* JADX INFO: renamed from: k */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f54286k;

    /* JADX INFO: renamed from: l */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f54287l;

    /* JADX INFO: renamed from: m */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f54288m;

    /* JADX INFO: renamed from: n */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f54289n;

    /* JADX INFO: renamed from: o */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f54290o;

    /* JADX INFO: renamed from: p */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f54291p;

    /* JADX INFO: renamed from: q */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f54292q;

    /* JADX INFO: renamed from: r */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f54293r;

    /* JADX INFO: renamed from: s */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f54294s;

    /* JADX INFO: renamed from: t */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f54295t;

    /* JADX INFO: renamed from: u */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f54296u;

    /* JADX INFO: renamed from: v */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f54297v;

    /* JADX INFO: renamed from: w */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f54298w;

    /* JADX INFO: renamed from: x */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f54299x;

    /* JADX INFO: renamed from: y */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f54300y;

    /* JADX INFO: renamed from: z */
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 f54301z;

    static {
        ReflectionFactory reflectionFactory = Reflection.f51660a;
        f54253W = new KProperty[]{reflectionFactory.mo18615e(new MutablePropertyReference1Impl(reflectionFactory.mo18612b(DescriptorRendererOptionsImpl.class), "classifierNamePolicy", "getClassifierNamePolicy()Lorg/jetbrains/kotlin/renderer/ClassifierNamePolicy;")), reflectionFactory.mo18615e(new MutablePropertyReference1Impl(reflectionFactory.mo18612b(DescriptorRendererOptionsImpl.class), "withDefinedIn", "getWithDefinedIn()Z")), reflectionFactory.mo18615e(new MutablePropertyReference1Impl(reflectionFactory.mo18612b(DescriptorRendererOptionsImpl.class), "withSourceFileForTopLevel", "getWithSourceFileForTopLevel()Z")), reflectionFactory.mo18615e(new MutablePropertyReference1Impl(reflectionFactory.mo18612b(DescriptorRendererOptionsImpl.class), "modifiers", "getModifiers()Ljava/util/Set;")), reflectionFactory.mo18615e(new MutablePropertyReference1Impl(reflectionFactory.mo18612b(DescriptorRendererOptionsImpl.class), "startFromName", "getStartFromName()Z")), reflectionFactory.mo18615e(new MutablePropertyReference1Impl(reflectionFactory.mo18612b(DescriptorRendererOptionsImpl.class), "startFromDeclarationKeyword", "getStartFromDeclarationKeyword()Z")), reflectionFactory.mo18615e(new MutablePropertyReference1Impl(reflectionFactory.mo18612b(DescriptorRendererOptionsImpl.class), "debugMode", "getDebugMode()Z")), reflectionFactory.mo18615e(new MutablePropertyReference1Impl(reflectionFactory.mo18612b(DescriptorRendererOptionsImpl.class), "classWithPrimaryConstructor", "getClassWithPrimaryConstructor()Z")), reflectionFactory.mo18615e(new MutablePropertyReference1Impl(reflectionFactory.mo18612b(DescriptorRendererOptionsImpl.class), "verbose", "getVerbose()Z")), reflectionFactory.mo18615e(new MutablePropertyReference1Impl(reflectionFactory.mo18612b(DescriptorRendererOptionsImpl.class), "unitReturnType", "getUnitReturnType()Z")), reflectionFactory.mo18615e(new MutablePropertyReference1Impl(reflectionFactory.mo18612b(DescriptorRendererOptionsImpl.class), "withoutReturnType", "getWithoutReturnType()Z")), reflectionFactory.mo18615e(new MutablePropertyReference1Impl(reflectionFactory.mo18612b(DescriptorRendererOptionsImpl.class), "enhancedTypes", "getEnhancedTypes()Z")), reflectionFactory.mo18615e(new MutablePropertyReference1Impl(reflectionFactory.mo18612b(DescriptorRendererOptionsImpl.class), "normalizedVisibilities", "getNormalizedVisibilities()Z")), reflectionFactory.mo18615e(new MutablePropertyReference1Impl(reflectionFactory.mo18612b(DescriptorRendererOptionsImpl.class), "renderDefaultVisibility", "getRenderDefaultVisibility()Z")), reflectionFactory.mo18615e(new MutablePropertyReference1Impl(reflectionFactory.mo18612b(DescriptorRendererOptionsImpl.class), "renderDefaultModality", "getRenderDefaultModality()Z")), reflectionFactory.mo18615e(new MutablePropertyReference1Impl(reflectionFactory.mo18612b(DescriptorRendererOptionsImpl.class), "renderConstructorDelegation", "getRenderConstructorDelegation()Z")), reflectionFactory.mo18615e(new MutablePropertyReference1Impl(reflectionFactory.mo18612b(DescriptorRendererOptionsImpl.class), "renderPrimaryConstructorParametersAsProperties", "getRenderPrimaryConstructorParametersAsProperties()Z")), reflectionFactory.mo18615e(new MutablePropertyReference1Impl(reflectionFactory.mo18612b(DescriptorRendererOptionsImpl.class), "actualPropertiesInPrimaryConstructor", "getActualPropertiesInPrimaryConstructor()Z")), reflectionFactory.mo18615e(new MutablePropertyReference1Impl(reflectionFactory.mo18612b(DescriptorRendererOptionsImpl.class), "uninferredTypeParameterAsName", "getUninferredTypeParameterAsName()Z")), reflectionFactory.mo18615e(new MutablePropertyReference1Impl(reflectionFactory.mo18612b(DescriptorRendererOptionsImpl.class), "includePropertyConstant", "getIncludePropertyConstant()Z")), reflectionFactory.mo18615e(new MutablePropertyReference1Impl(reflectionFactory.mo18612b(DescriptorRendererOptionsImpl.class), "withoutTypeParameters", "getWithoutTypeParameters()Z")), reflectionFactory.mo18615e(new MutablePropertyReference1Impl(reflectionFactory.mo18612b(DescriptorRendererOptionsImpl.class), "withoutSuperTypes", "getWithoutSuperTypes()Z")), reflectionFactory.mo18615e(new MutablePropertyReference1Impl(reflectionFactory.mo18612b(DescriptorRendererOptionsImpl.class), "typeNormalizer", "getTypeNormalizer()Lkotlin/jvm/functions/Function1;")), reflectionFactory.mo18615e(new MutablePropertyReference1Impl(reflectionFactory.mo18612b(DescriptorRendererOptionsImpl.class), "defaultParameterValueRenderer", "getDefaultParameterValueRenderer()Lkotlin/jvm/functions/Function1;")), reflectionFactory.mo18615e(new MutablePropertyReference1Impl(reflectionFactory.mo18612b(DescriptorRendererOptionsImpl.class), "secondaryConstructorsAsPrimary", "getSecondaryConstructorsAsPrimary()Z")), reflectionFactory.mo18615e(new MutablePropertyReference1Impl(reflectionFactory.mo18612b(DescriptorRendererOptionsImpl.class), "overrideRenderingPolicy", "getOverrideRenderingPolicy()Lorg/jetbrains/kotlin/renderer/OverrideRenderingPolicy;")), reflectionFactory.mo18615e(new MutablePropertyReference1Impl(reflectionFactory.mo18612b(DescriptorRendererOptionsImpl.class), "valueParametersHandler", "getValueParametersHandler()Lorg/jetbrains/kotlin/renderer/DescriptorRenderer$ValueParametersHandler;")), reflectionFactory.mo18615e(new MutablePropertyReference1Impl(reflectionFactory.mo18612b(DescriptorRendererOptionsImpl.class), "textFormat", "getTextFormat()Lorg/jetbrains/kotlin/renderer/RenderingFormat;")), reflectionFactory.mo18615e(new MutablePropertyReference1Impl(reflectionFactory.mo18612b(DescriptorRendererOptionsImpl.class), "parameterNameRenderingPolicy", "getParameterNameRenderingPolicy()Lorg/jetbrains/kotlin/renderer/ParameterNameRenderingPolicy;")), reflectionFactory.mo18615e(new MutablePropertyReference1Impl(reflectionFactory.mo18612b(DescriptorRendererOptionsImpl.class), "receiverAfterName", "getReceiverAfterName()Z")), reflectionFactory.mo18615e(new MutablePropertyReference1Impl(reflectionFactory.mo18612b(DescriptorRendererOptionsImpl.class), "renderCompanionObjectName", "getRenderCompanionObjectName()Z")), reflectionFactory.mo18615e(new MutablePropertyReference1Impl(reflectionFactory.mo18612b(DescriptorRendererOptionsImpl.class), "propertyAccessorRenderingPolicy", "getPropertyAccessorRenderingPolicy()Lorg/jetbrains/kotlin/renderer/PropertyAccessorRenderingPolicy;")), reflectionFactory.mo18615e(new MutablePropertyReference1Impl(reflectionFactory.mo18612b(DescriptorRendererOptionsImpl.class), "renderDefaultAnnotationArguments", "getRenderDefaultAnnotationArguments()Z")), reflectionFactory.mo18615e(new MutablePropertyReference1Impl(reflectionFactory.mo18612b(DescriptorRendererOptionsImpl.class), "eachAnnotationOnNewLine", "getEachAnnotationOnNewLine()Z")), reflectionFactory.mo18615e(new MutablePropertyReference1Impl(reflectionFactory.mo18612b(DescriptorRendererOptionsImpl.class), "excludedAnnotationClasses", "getExcludedAnnotationClasses()Ljava/util/Set;")), reflectionFactory.mo18615e(new MutablePropertyReference1Impl(reflectionFactory.mo18612b(DescriptorRendererOptionsImpl.class), "excludedTypeAnnotationClasses", "getExcludedTypeAnnotationClasses()Ljava/util/Set;")), reflectionFactory.mo18615e(new MutablePropertyReference1Impl(reflectionFactory.mo18612b(DescriptorRendererOptionsImpl.class), "annotationFilter", "getAnnotationFilter()Lkotlin/jvm/functions/Function1;")), reflectionFactory.mo18615e(new MutablePropertyReference1Impl(reflectionFactory.mo18612b(DescriptorRendererOptionsImpl.class), "annotationArgumentsRenderingPolicy", "getAnnotationArgumentsRenderingPolicy()Lorg/jetbrains/kotlin/renderer/AnnotationArgumentsRenderingPolicy;")), reflectionFactory.mo18615e(new MutablePropertyReference1Impl(reflectionFactory.mo18612b(DescriptorRendererOptionsImpl.class), "alwaysRenderModifiers", "getAlwaysRenderModifiers()Z")), reflectionFactory.mo18615e(new MutablePropertyReference1Impl(reflectionFactory.mo18612b(DescriptorRendererOptionsImpl.class), "renderConstructorKeyword", "getRenderConstructorKeyword()Z")), reflectionFactory.mo18615e(new MutablePropertyReference1Impl(reflectionFactory.mo18612b(DescriptorRendererOptionsImpl.class), "renderUnabbreviatedType", "getRenderUnabbreviatedType()Z")), reflectionFactory.mo18615e(new MutablePropertyReference1Impl(reflectionFactory.mo18612b(DescriptorRendererOptionsImpl.class), "renderTypeExpansions", "getRenderTypeExpansions()Z")), reflectionFactory.mo18615e(new MutablePropertyReference1Impl(reflectionFactory.mo18612b(DescriptorRendererOptionsImpl.class), "includeAdditionalModifiers", "getIncludeAdditionalModifiers()Z")), reflectionFactory.mo18615e(new MutablePropertyReference1Impl(reflectionFactory.mo18612b(DescriptorRendererOptionsImpl.class), "parameterNamesInFunctionalTypes", "getParameterNamesInFunctionalTypes()Z")), reflectionFactory.mo18615e(new MutablePropertyReference1Impl(reflectionFactory.mo18612b(DescriptorRendererOptionsImpl.class), "renderFunctionContracts", "getRenderFunctionContracts()Z")), reflectionFactory.mo18615e(new MutablePropertyReference1Impl(reflectionFactory.mo18612b(DescriptorRendererOptionsImpl.class), "presentableUnresolvedTypes", "getPresentableUnresolvedTypes()Z")), reflectionFactory.mo18615e(new MutablePropertyReference1Impl(reflectionFactory.mo18612b(DescriptorRendererOptionsImpl.class), "boldOnlyForNamesInHtml", "getBoldOnlyForNamesInHtml()Z")), reflectionFactory.mo18615e(new MutablePropertyReference1Impl(reflectionFactory.mo18612b(DescriptorRendererOptionsImpl.class), "informativeErrorType", "getInformativeErrorType()Z"))};
    }

    public DescriptorRendererOptionsImpl() {
        Boolean bool = Boolean.TRUE;
        this.f54278c = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool, this);
        this.f54279d = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool, this);
        this.f54280e = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(DescriptorRendererModifier.f54235b, this);
        Boolean bool2 = Boolean.FALSE;
        this.f54281f = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.f54282g = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.f54283h = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.f54284i = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.f54285j = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.f54286k = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool, this);
        this.f54287l = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.f54288m = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.f54289n = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.f54290o = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool, this);
        this.f54291p = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool, this);
        this.f54292q = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.f54293r = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.f54294s = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.f54295t = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.f54296u = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.f54297v = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.f54298w = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.f54299x = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(DescriptorRendererOptionsImpl$typeNormalizer$2.f54304a, this);
        this.f54300y = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(DescriptorRendererOptionsImpl$defaultParameterValueRenderer$2.f54302a, this);
        this.f54301z = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool, this);
        this.f54254A = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(OverrideRenderingPolicy.f54308b, this);
        this.f54255B = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(DescriptorRenderer.ValueParametersHandler.DEFAULT.f54223a, this);
        this.f54256C = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(RenderingFormat.f54317a, this);
        this.f54257D = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(ParameterNameRenderingPolicy.f54310a, this);
        this.f54258E = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.f54259F = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.f54260G = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(PropertyAccessorRenderingPolicy.f54314a, this);
        this.f54261H = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.f54262I = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.f54263J = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(EmptySet.f51498a, this);
        this.f54264K = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(ExcludedTypeAnnotations.f54305a, this);
        this.f54265L = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(null, this);
        this.f54266M = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(AnnotationArgumentsRenderingPolicy.NO_ARGUMENTS, this);
        this.f54267N = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.f54268O = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool, this);
        this.f54269P = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool, this);
        this.f54270Q = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.f54271R = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool, this);
        this.f54272S = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool, this);
        new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.f54273T = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.f54274U = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.f54275V = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool, this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* JADX INFO: renamed from: a */
    public final void mo19766a() {
        this.f54258E.setValue(this, f54253W[29], Boolean.TRUE);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* JADX INFO: renamed from: b */
    public final void mo19768b() {
        this.f54283h.setValue(this, f54253W[6], Boolean.TRUE);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* JADX INFO: renamed from: c */
    public final void mo19770c() {
        this.f54259F.setValue(this, f54253W[30], Boolean.TRUE);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* JADX INFO: renamed from: d */
    public final void mo19772d(Set set) {
        Intrinsics.m18599g(set, "<set-?>");
        this.f54280e.setValue(this, f54253W[3], set);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* JADX INFO: renamed from: e */
    public final void mo19774e(ParameterNameRenderingPolicy parameterNameRenderingPolicy) {
        this.f54257D.setValue(this, f54253W[28], parameterNameRenderingPolicy);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* JADX INFO: renamed from: f */
    public final void mo19776f(LinkedHashSet linkedHashSet) {
        this.f54264K.setValue(this, f54253W[35], linkedHashSet);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* JADX INFO: renamed from: g */
    public final void mo19778g() {
        this.f54297v.setValue(this, f54253W[20], Boolean.TRUE);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* JADX INFO: renamed from: h */
    public final void mo19780h(ClassifierNamePolicy classifierNamePolicy) {
        this.f54277b.setValue(this, f54253W[0], classifierNamePolicy);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* JADX INFO: renamed from: i */
    public final void mo19782i() {
        this.f54285j.setValue(this, f54253W[8], Boolean.TRUE);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* JADX INFO: renamed from: j */
    public final void mo19784j() {
        AnnotationArgumentsRenderingPolicy annotationArgumentsRenderingPolicy = AnnotationArgumentsRenderingPolicy.UNLESS_EMPTY;
        this.f54266M.setValue(this, f54253W[37], annotationArgumentsRenderingPolicy);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* JADX INFO: renamed from: k */
    public final void mo19786k() {
        this.f54281f.setValue(this, f54253W[4], Boolean.TRUE);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* JADX INFO: renamed from: l */
    public final void mo19788l() {
        this.f54278c.setValue(this, f54253W[1], Boolean.FALSE);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* JADX INFO: renamed from: m */
    public final Set mo19790m() {
        return (Set) this.f54264K.getValue(this, f54253W[35]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* JADX INFO: renamed from: n */
    public final void mo19791n() {
        RenderingFormat renderingFormat = RenderingFormat.f54318b;
        this.f54256C.setValue(this, f54253W[27], renderingFormat);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    /* JADX INFO: renamed from: o */
    public final void mo19792o() {
        this.f54298w.setValue(this, f54253W[21], Boolean.TRUE);
    }

    /* JADX INFO: renamed from: p */
    public final boolean m19804p() {
        return ((Boolean) this.f54283h.getValue(this, f54253W[6])).booleanValue();
    }
}
