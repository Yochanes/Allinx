package androidx.compose.p013ui.text.input;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/text/input/TextInputSession;", "", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@Deprecated
@SourceDebugExtension
public final class TextInputSession {

    /* JADX INFO: renamed from: a */
    public final TextInputService f20436a;

    /* JADX INFO: renamed from: b */
    public final PlatformTextInputService f20437b;

    public TextInputSession(TextInputService textInputService, PlatformTextInputService platformTextInputService) {
        this.f20436a = textInputService;
        this.f20437b = platformTextInputService;
    }
}
