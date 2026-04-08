package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.p013ui.platform.SoftwareKeyboardController;
import androidx.compose.p013ui.text.input.PlatformTextInputService;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b \u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter;", "Landroidx/compose/ui/text/input/PlatformTextInputService;", "LegacyPlatformTextInputNode", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public abstract class LegacyPlatformTextInputServiceAdapter implements PlatformTextInputService {

    /* JADX INFO: renamed from: a */
    public LegacyAdaptingPlatformTextInputModifierNode f8979a;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, m18302d2 = {"Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;", "", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public interface LegacyPlatformTextInputNode {
    }

    @Override // androidx.compose.p013ui.text.input.PlatformTextInputService
    /* JADX INFO: renamed from: b */
    public final void mo3339b() {
        SoftwareKeyboardController softwareKeyboardControllerM3335X1;
        LegacyAdaptingPlatformTextInputModifierNode legacyAdaptingPlatformTextInputModifierNode = this.f8979a;
        if (legacyAdaptingPlatformTextInputModifierNode == null || (softwareKeyboardControllerM3335X1 = legacyAdaptingPlatformTextInputModifierNode.m3335X1()) == null) {
            return;
        }
        softwareKeyboardControllerM3335X1.show();
    }

    @Override // androidx.compose.p013ui.text.input.PlatformTextInputService
    /* JADX INFO: renamed from: d */
    public final void mo3340d() {
        SoftwareKeyboardController softwareKeyboardControllerM3335X1;
        LegacyAdaptingPlatformTextInputModifierNode legacyAdaptingPlatformTextInputModifierNode = this.f8979a;
        if (legacyAdaptingPlatformTextInputModifierNode == null || (softwareKeyboardControllerM3335X1 = legacyAdaptingPlatformTextInputModifierNode.m3335X1()) == null) {
            return;
        }
        softwareKeyboardControllerM3335X1.hide();
    }

    /* JADX INFO: renamed from: i */
    public abstract void mo3298i();

    /* JADX INFO: renamed from: j */
    public final void m3341j(LegacyAdaptingPlatformTextInputModifierNode legacyAdaptingPlatformTextInputModifierNode) {
        if (this.f8979a != legacyAdaptingPlatformTextInputModifierNode) {
            InlineClassHelperKt.m2707c("Expected textInputModifierNode to be " + legacyAdaptingPlatformTextInputModifierNode + " but was " + this.f8979a);
        }
        this.f8979a = null;
    }
}
