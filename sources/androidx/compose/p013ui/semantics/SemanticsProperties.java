package androidx.compose.p013ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/semantics/SemanticsProperties;", "", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class SemanticsProperties {

    /* JADX INFO: renamed from: a */
    public static final SemanticsPropertyKey f19797a = SemanticsPropertiesKt.m6290b("ContentDescription", SemanticsProperties$ContentDescription$1.f19824a);

    /* JADX INFO: renamed from: b */
    public static final SemanticsPropertyKey f19798b = SemanticsPropertiesKt.m6289a("StateDescription");

    /* JADX INFO: renamed from: c */
    public static final SemanticsPropertyKey f19799c = SemanticsPropertiesKt.m6289a("ProgressBarRangeInfo");

    /* JADX INFO: renamed from: d */
    public static final SemanticsPropertyKey f19800d = SemanticsPropertiesKt.m6290b("PaneTitle", SemanticsProperties$PaneTitle$1.f19831a);

    /* JADX INFO: renamed from: e */
    public static final SemanticsPropertyKey f19801e = SemanticsPropertiesKt.m6289a("SelectableGroup");

    /* JADX INFO: renamed from: f */
    public static final SemanticsPropertyKey f19802f = SemanticsPropertiesKt.m6289a("CollectionInfo");

    /* JADX INFO: renamed from: g */
    public static final SemanticsPropertyKey f19803g = SemanticsPropertiesKt.m6289a("CollectionItemInfo");

    /* JADX INFO: renamed from: h */
    public static final SemanticsPropertyKey f19804h = SemanticsPropertiesKt.m6289a("Heading");

    /* JADX INFO: renamed from: i */
    public static final SemanticsPropertyKey f19805i = SemanticsPropertiesKt.m6289a("Disabled");

    /* JADX INFO: renamed from: j */
    public static final SemanticsPropertyKey f19806j = SemanticsPropertiesKt.m6289a("LiveRegion");

    /* JADX INFO: renamed from: k */
    public static final SemanticsPropertyKey f19807k = SemanticsPropertiesKt.m6289a("Focused");

    /* JADX INFO: renamed from: l */
    public static final SemanticsPropertyKey f19808l = SemanticsPropertiesKt.m6289a("IsContainer");

    /* JADX INFO: renamed from: m */
    public static final SemanticsPropertyKey f19809m = new SemanticsPropertyKey("IsTraversalGroup");

    /* JADX INFO: renamed from: n */
    public static final SemanticsPropertyKey f19810n = new SemanticsPropertyKey("InvisibleToUser", SemanticsProperties$InvisibleToUser$1.f19827a);

    /* JADX INFO: renamed from: o */
    public static final SemanticsPropertyKey f19811o = new SemanticsPropertyKey("HideFromAccessibility", SemanticsProperties$HideFromAccessibility$1.f19826a);

    /* JADX INFO: renamed from: p */
    public static final SemanticsPropertyKey f19812p = new SemanticsPropertyKey("ContentType", SemanticsProperties$ContentType$1.f19825a);

    /* JADX INFO: renamed from: q */
    public static final SemanticsPropertyKey f19813q = new SemanticsPropertyKey("ContentDataType", SemanticsProperties$ContentDataType$1.f19823a);

    /* JADX INFO: renamed from: r */
    public static final SemanticsPropertyKey f19814r = new SemanticsPropertyKey("TraversalIndex", SemanticsProperties$TraversalIndex$1.f19835a);

    /* JADX INFO: renamed from: s */
    public static final SemanticsPropertyKey f19815s = SemanticsPropertiesKt.m6289a("HorizontalScrollAxisRange");

    /* JADX INFO: renamed from: t */
    public static final SemanticsPropertyKey f19816t = SemanticsPropertiesKt.m6289a("VerticalScrollAxisRange");

    /* JADX INFO: renamed from: u */
    public static final SemanticsPropertyKey f19817u = SemanticsPropertiesKt.m6290b("IsPopup", SemanticsProperties$IsPopup$1.f19829a);

    /* JADX INFO: renamed from: v */
    public static final SemanticsPropertyKey f19818v = SemanticsPropertiesKt.m6290b("IsDialog", SemanticsProperties$IsDialog$1.f19828a);

    /* JADX INFO: renamed from: w */
    public static final SemanticsPropertyKey f19819w = SemanticsPropertiesKt.m6290b("Role", SemanticsProperties$Role$1.f19832a);

    /* JADX INFO: renamed from: x */
    public static final SemanticsPropertyKey f19820x = new SemanticsPropertyKey("TestTag", false, SemanticsProperties$TestTag$1.f19833a);

    /* JADX INFO: renamed from: y */
    public static final SemanticsPropertyKey f19821y = new SemanticsPropertyKey("LinkTestMarker", false, SemanticsProperties$LinkTestMarker$1.f19830a);

    /* JADX INFO: renamed from: z */
    public static final SemanticsPropertyKey f19822z = SemanticsPropertiesKt.m6290b("Text", SemanticsProperties$Text$1.f19834a);

    /* JADX INFO: renamed from: A */
    public static final SemanticsPropertyKey f19784A = new SemanticsPropertyKey("TextSubstitution");

    /* JADX INFO: renamed from: B */
    public static final SemanticsPropertyKey f19785B = new SemanticsPropertyKey("IsShowingTextSubstitution");

    /* JADX INFO: renamed from: C */
    public static final SemanticsPropertyKey f19786C = SemanticsPropertiesKt.m6289a("InputText");

    /* JADX INFO: renamed from: D */
    public static final SemanticsPropertyKey f19787D = SemanticsPropertiesKt.m6289a("EditableText");

    /* JADX INFO: renamed from: E */
    public static final SemanticsPropertyKey f19788E = SemanticsPropertiesKt.m6289a("TextSelectionRange");

    /* JADX INFO: renamed from: F */
    public static final SemanticsPropertyKey f19789F = SemanticsPropertiesKt.m6289a("ImeAction");

    /* JADX INFO: renamed from: G */
    public static final SemanticsPropertyKey f19790G = SemanticsPropertiesKt.m6289a("Selected");

    /* JADX INFO: renamed from: H */
    public static final SemanticsPropertyKey f19791H = SemanticsPropertiesKt.m6289a("ToggleableState");

    /* JADX INFO: renamed from: I */
    public static final SemanticsPropertyKey f19792I = SemanticsPropertiesKt.m6289a("Password");

    /* JADX INFO: renamed from: J */
    public static final SemanticsPropertyKey f19793J = SemanticsPropertiesKt.m6289a("Error");

    /* JADX INFO: renamed from: K */
    public static final SemanticsPropertyKey f19794K = new SemanticsPropertyKey("IndexForKey");

    /* JADX INFO: renamed from: L */
    public static final SemanticsPropertyKey f19795L = new SemanticsPropertyKey("IsEditable");

    /* JADX INFO: renamed from: M */
    public static final SemanticsPropertyKey f19796M = new SemanticsPropertyKey("MaxTextLength");
}
