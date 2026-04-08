package androidx.compose.p013ui.text.input;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Deprecated;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Deprecated
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/text/input/TextInputService;", "", "ui-text_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public class TextInputService {

    /* JADX INFO: renamed from: a */
    public final PlatformTextInputService f20408a;

    /* JADX INFO: renamed from: b */
    public final AtomicReference f20409b = new AtomicReference(null);

    public TextInputService(PlatformTextInputService platformTextInputService) {
        this.f20408a = platformTextInputService;
    }
}
