package androidx.compose.p013ui.platform;

import android.view.View;
import androidx.compose.p013ui.InternalComposeUiApi;
import androidx.compose.runtime.Recomposer;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bç\u0080\u0001\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, m18302d2 = {"Landroidx/compose/ui/platform/WindowRecomposerFactory;", "", "Companion", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@InternalComposeUiApi
public interface WindowRecomposerFactory {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/platform/WindowRecomposerFactory$Companion;", "", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final C1321q f19581a = new C1321q();
    }

    /* JADX INFO: renamed from: a */
    Recomposer mo6194a(View view);
}
