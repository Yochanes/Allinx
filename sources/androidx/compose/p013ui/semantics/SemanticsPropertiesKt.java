package androidx.compose.p013ui.semantics;

import androidx.compose.animation.AbstractC0455a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KProperty;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"ui_release"}, m18303k = 2, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class SemanticsPropertiesKt {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ KProperty[] f19838a;

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "stateDescription", "getStateDescription(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1);
        ReflectionFactory reflectionFactory = Reflection.f51660a;
        f19838a = new KProperty[]{reflectionFactory.mo18615e(mutablePropertyReference1Impl), AbstractC0455a.m2247v(SemanticsPropertiesKt.class, "progressBarRangeInfo", "getProgressBarRangeInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", 1, reflectionFactory), AbstractC0455a.m2247v(SemanticsPropertiesKt.class, "paneTitle", "getPaneTitle(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1, reflectionFactory), AbstractC0455a.m2247v(SemanticsPropertiesKt.class, "liveRegion", "getLiveRegion(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1, reflectionFactory), AbstractC0455a.m2247v(SemanticsPropertiesKt.class, "focused", "getFocused(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1, reflectionFactory), AbstractC0455a.m2247v(SemanticsPropertiesKt.class, "isContainer", "isContainer(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1, reflectionFactory), AbstractC0455a.m2247v(SemanticsPropertiesKt.class, "isTraversalGroup", "isTraversalGroup(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1, reflectionFactory), AbstractC0455a.m2247v(SemanticsPropertiesKt.class, "contentType", "getContentType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/ContentType;", 1, reflectionFactory), AbstractC0455a.m2247v(SemanticsPropertiesKt.class, "contentDataType", "getContentDataType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/ContentDataType;", 1, reflectionFactory), AbstractC0455a.m2247v(SemanticsPropertiesKt.class, "traversalIndex", "getTraversalIndex(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)F", 1, reflectionFactory), AbstractC0455a.m2247v(SemanticsPropertiesKt.class, "horizontalScrollAxisRange", "getHorizontalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1, reflectionFactory), AbstractC0455a.m2247v(SemanticsPropertiesKt.class, "verticalScrollAxisRange", "getVerticalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1, reflectionFactory), AbstractC0455a.m2247v(SemanticsPropertiesKt.class, "role", "getRole(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1, reflectionFactory), AbstractC0455a.m2247v(SemanticsPropertiesKt.class, "testTag", "getTestTag(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1, reflectionFactory), AbstractC0455a.m2247v(SemanticsPropertiesKt.class, "textSubstitution", "getTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1, reflectionFactory), AbstractC0455a.m2247v(SemanticsPropertiesKt.class, "isShowingTextSubstitution", "isShowingTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1, reflectionFactory), AbstractC0455a.m2247v(SemanticsPropertiesKt.class, "inputText", "getInputText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1, reflectionFactory), AbstractC0455a.m2247v(SemanticsPropertiesKt.class, "editableText", "getEditableText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1, reflectionFactory), AbstractC0455a.m2247v(SemanticsPropertiesKt.class, "textSelectionRange", "getTextSelectionRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)J", 1, reflectionFactory), AbstractC0455a.m2247v(SemanticsPropertiesKt.class, "imeAction", "getImeAction(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1, reflectionFactory), AbstractC0455a.m2247v(SemanticsPropertiesKt.class, "selected", "getSelected(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1, reflectionFactory), AbstractC0455a.m2247v(SemanticsPropertiesKt.class, "collectionInfo", "getCollectionInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionInfo;", 1, reflectionFactory), AbstractC0455a.m2247v(SemanticsPropertiesKt.class, "collectionItemInfo", "getCollectionItemInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionItemInfo;", 1, reflectionFactory), AbstractC0455a.m2247v(SemanticsPropertiesKt.class, "toggleableState", "getToggleableState(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/state/ToggleableState;", 1, reflectionFactory), AbstractC0455a.m2247v(SemanticsPropertiesKt.class, "isEditable", "isEditable(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1, reflectionFactory), AbstractC0455a.m2247v(SemanticsPropertiesKt.class, "maxTextLength", "getMaxTextLength(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1, reflectionFactory), AbstractC0455a.m2247v(SemanticsPropertiesKt.class, "customActions", "getCustomActions(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/util/List;", 1, reflectionFactory)};
        SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.f19797a;
        SemanticsPropertyKey semanticsPropertyKey2 = SemanticsActions.f19738a;
    }

    /* JADX INFO: renamed from: a */
    public static final SemanticsPropertyKey m6289a(String str) {
        SemanticsPropertyKey semanticsPropertyKey = new SemanticsPropertyKey(str);
        semanticsPropertyKey.f19844c = true;
        return semanticsPropertyKey;
    }

    /* JADX INFO: renamed from: b */
    public static final SemanticsPropertyKey m6290b(String str, Function2 function2) {
        return new SemanticsPropertyKey(str, true, function2);
    }

    /* JADX INFO: renamed from: c */
    public static final void m6291c(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.f19797a;
        semanticsPropertyReceiver.mo6263c(SemanticsProperties.f19805i, Unit.f51459a);
    }

    /* JADX INFO: renamed from: d */
    public static void m6292d(SemanticsPropertyReceiver semanticsPropertyReceiver, Function0 function0) {
        semanticsPropertyReceiver.mo6263c(SemanticsActions.f19758u, new AccessibilityAction(null, function0));
    }

    /* JADX INFO: renamed from: e */
    public static void m6293e(SemanticsPropertyReceiver semanticsPropertyReceiver, Function0 function0) {
        semanticsPropertyReceiver.mo6263c(SemanticsActions.f19737B, new AccessibilityAction(null, new SemanticsPropertiesKt$getScrollViewportLength$1(function0)));
    }

    /* JADX INFO: renamed from: f */
    public static void m6294f(SemanticsPropertyReceiver semanticsPropertyReceiver, Function1 function1) {
        semanticsPropertyReceiver.mo6263c(SemanticsActions.f19738a, new AccessibilityAction(null, function1));
    }

    /* JADX INFO: renamed from: g */
    public static void m6295g(SemanticsPropertyReceiver semanticsPropertyReceiver, Function0 function0) {
        semanticsPropertyReceiver.mo6263c(SemanticsActions.f19739b, new AccessibilityAction(null, function0));
    }

    /* JADX INFO: renamed from: h */
    public static final void m6296h(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0) {
        semanticsPropertyReceiver.mo6263c(SemanticsActions.f19740c, new AccessibilityAction(str, function0));
    }

    /* JADX INFO: renamed from: i */
    public static final void m6297i(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.f19808l;
        KProperty kProperty = f19838a[5];
        Boolean bool = Boolean.TRUE;
        semanticsPropertyKey.getClass();
        semanticsPropertyReceiver.mo6263c(semanticsPropertyKey, bool);
    }

    /* JADX INFO: renamed from: j */
    public static final void m6298j(String str, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.f19797a;
        semanticsPropertyReceiver.mo6263c(SemanticsProperties.f19797a, CollectionsKt.m18413N(str));
    }

    /* JADX INFO: renamed from: k */
    public static final void m6299k(SemanticsPropertyReceiver semanticsPropertyReceiver, ScrollAxisRange scrollAxisRange) {
        SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.f19797a;
        SemanticsPropertyKey semanticsPropertyKey2 = SemanticsProperties.f19815s;
        KProperty kProperty = f19838a[10];
        semanticsPropertyKey2.getClass();
        semanticsPropertyReceiver.mo6263c(semanticsPropertyKey2, scrollAxisRange);
    }

    /* JADX INFO: renamed from: l */
    public static final void m6300l(SemanticsPropertyReceiver semanticsPropertyReceiver, int i) {
        SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.f19806j;
        KProperty kProperty = f19838a[3];
        LiveRegionMode liveRegionMode = new LiveRegionMode(i);
        semanticsPropertyKey.getClass();
        semanticsPropertyReceiver.mo6263c(semanticsPropertyKey, liveRegionMode);
    }

    /* JADX INFO: renamed from: m */
    public static final void m6301m(String str, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.f19797a;
        SemanticsPropertyKey semanticsPropertyKey2 = SemanticsProperties.f19800d;
        KProperty kProperty = f19838a[2];
        semanticsPropertyKey2.getClass();
        semanticsPropertyReceiver.mo6263c(semanticsPropertyKey2, str);
    }

    /* JADX INFO: renamed from: n */
    public static void m6302n(SemanticsPropertyReceiver semanticsPropertyReceiver, Function1 function1) {
        semanticsPropertyReceiver.mo6263c(SemanticsActions.f19745h, new AccessibilityAction(null, function1));
    }

    /* JADX INFO: renamed from: o */
    public static final void m6303o(SemanticsPropertyReceiver semanticsPropertyReceiver, ProgressBarRangeInfo progressBarRangeInfo) {
        SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.f19797a;
        SemanticsPropertyKey semanticsPropertyKey2 = SemanticsProperties.f19799c;
        KProperty kProperty = f19838a[1];
        semanticsPropertyKey2.getClass();
        semanticsPropertyReceiver.mo6263c(semanticsPropertyKey2, progressBarRangeInfo);
    }

    /* JADX INFO: renamed from: p */
    public static final void m6304p(SemanticsPropertyReceiver semanticsPropertyReceiver, int i) {
        SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.f19819w;
        KProperty kProperty = f19838a[12];
        Role role = new Role(i);
        semanticsPropertyKey.getClass();
        semanticsPropertyReceiver.mo6263c(semanticsPropertyKey, role);
    }

    /* JADX INFO: renamed from: q */
    public static final void m6305q(SemanticsPropertyReceiver semanticsPropertyReceiver, boolean z2) {
        SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.f19797a;
        SemanticsPropertyKey semanticsPropertyKey2 = SemanticsProperties.f19790G;
        KProperty kProperty = f19838a[20];
        Boolean boolValueOf = Boolean.valueOf(z2);
        semanticsPropertyKey2.getClass();
        semanticsPropertyReceiver.mo6263c(semanticsPropertyKey2, boolValueOf);
    }

    /* JADX INFO: renamed from: r */
    public static final void m6306r(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.f19809m;
        KProperty kProperty = f19838a[6];
        Boolean bool = Boolean.TRUE;
        semanticsPropertyKey.getClass();
        semanticsPropertyReceiver.mo6263c(semanticsPropertyKey, bool);
    }

    /* JADX INFO: renamed from: s */
    public static final void m6307s(SemanticsPropertyReceiver semanticsPropertyReceiver, float f) {
        SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.f19797a;
        SemanticsPropertyKey semanticsPropertyKey2 = SemanticsProperties.f19814r;
        KProperty kProperty = f19838a[9];
        Float fValueOf = Float.valueOf(f);
        semanticsPropertyKey2.getClass();
        semanticsPropertyReceiver.mo6263c(semanticsPropertyKey2, fValueOf);
    }

    /* JADX INFO: renamed from: t */
    public static final void m6308t(SemanticsPropertyReceiver semanticsPropertyReceiver, ScrollAxisRange scrollAxisRange) {
        SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.f19797a;
        SemanticsPropertyKey semanticsPropertyKey2 = SemanticsProperties.f19816t;
        KProperty kProperty = f19838a[11];
        semanticsPropertyKey2.getClass();
        semanticsPropertyReceiver.mo6263c(semanticsPropertyKey2, scrollAxisRange);
    }
}
