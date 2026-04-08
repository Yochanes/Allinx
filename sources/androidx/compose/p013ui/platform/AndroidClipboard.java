package androidx.compose.p013ui.platform;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Build;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/platform/AndroidClipboard;", "Landroidx/compose/ui/platform/Clipboard;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class AndroidClipboard implements Clipboard {

    /* JADX INFO: renamed from: a */
    public final AndroidClipboardManager f19039a;

    public AndroidClipboard(AndroidClipboardManager androidClipboardManager) {
        this.f19039a = androidClipboardManager;
    }

    @Override // androidx.compose.p013ui.platform.Clipboard
    /* JADX INFO: renamed from: a */
    public final void mo5993a(ClipEntry clipEntry) {
        ClipboardManager clipboardManager = this.f19039a.f19040a;
        if (clipEntry != null) {
            clipboardManager.setPrimaryClip(clipEntry.f19345a);
        } else if (Build.VERSION.SDK_INT >= 28) {
            AbstractC1316l.m6250a(clipboardManager);
        } else {
            clipboardManager.setPrimaryClip(ClipData.newPlainText("", ""));
        }
    }

    @Override // androidx.compose.p013ui.platform.Clipboard
    /* JADX INFO: renamed from: b */
    public final ClipEntry mo5994b() {
        ClipData primaryClip = this.f19039a.f19040a.getPrimaryClip();
        if (primaryClip != null) {
            return new ClipEntry(primaryClip);
        }
        return null;
    }
}
