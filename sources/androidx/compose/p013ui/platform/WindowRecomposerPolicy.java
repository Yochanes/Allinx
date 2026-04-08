package androidx.compose.p013ui.platform;

import androidx.compose.p013ui.InternalComposeUiApi;
import androidx.compose.p013ui.platform.WindowRecomposerFactory;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/platform/WindowRecomposerPolicy;", "", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@InternalComposeUiApi
public final class WindowRecomposerPolicy {

    /* JADX INFO: renamed from: a */
    public static final AtomicReference f19582a = new AtomicReference(WindowRecomposerFactory.Companion.f19581a);
}
