package androidx.compose.p013ui.node;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.platform.InspectableValue;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier.Node;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\u00020\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/Modifier$Node;", "N", "Landroidx/compose/ui/Modifier$Element;", "Landroidx/compose/ui/platform/InspectableValue;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public abstract class ModifierNodeElement<N extends Modifier.Node> implements Modifier.Element, InspectableValue {
    /* JADX INFO: renamed from: a */
    public abstract Modifier.Node mo2159a();

    /* JADX INFO: renamed from: b */
    public abstract void mo2160b(Modifier.Node node);
}
