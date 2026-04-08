package com.exchange.allin.p024ui.page.nexus;

import android.util.Log;
import android.webkit.ConsoleMessage;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.activity.result.PickVisualMediaRequestKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"com/exchange/allin/ui/page/nexus/NexusPageKt$NexusPage$1$1$1$3", "Landroid/webkit/WebChromeClient;", "app_localRelease"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class NexusPageKt$NexusPage$1$1$1$3 extends WebChromeClient {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Ref.ObjectRef f40328a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ManagedActivityResultLauncher f40329b;

    public NexusPageKt$NexusPage$1$1$1$3(Ref.ObjectRef objectRef, ManagedActivityResultLauncher managedActivityResultLauncher) {
        this.f40328a = objectRef;
        this.f40329b = managedActivityResultLauncher;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        Intrinsics.m18599g(consoleMessage, "consoleMessage");
        Log.d("WebViewLog", "[" + consoleMessage.messageLevel() + "] " + consoleMessage.message() + " (at " + consoleMessage.sourceId() + ':' + consoleMessage.lineNumber() + ')');
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        this.f40328a.f51659a = valueCallback;
        this.f40329b.mo180a(PickVisualMediaRequestKt.m229a());
        return true;
    }
}
