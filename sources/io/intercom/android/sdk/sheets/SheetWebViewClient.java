package io.intercom.android.sdk.sheets;

import android.content.Intent;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
class SheetWebViewClient extends WebViewClient {
    private final SheetListener sheetListener;

    public SheetWebViewClient(SheetListener sheetListener) {
        this.sheetListener = sheetListener;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        this.sheetListener.onWebViewFinishedLoad();
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Uri uri = Uri.parse(str);
        String scheme = uri.getScheme();
        if (scheme.equals("http") || scheme.equals("https")) {
            webView.loadUrl(str);
            return false;
        }
        webView.getContext().startActivity(new Intent("android.intent.action.VIEW", uri));
        return true;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return shouldOverrideUrlLoading(webView, webResourceRequest.getUrl().toString());
    }
}
