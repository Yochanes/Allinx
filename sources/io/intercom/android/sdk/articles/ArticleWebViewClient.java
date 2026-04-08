package io.intercom.android.sdk.articles;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.util.TypedValue;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import io.intercom.android.sdk.helpcenter.utils.HelpCenterUrlUtilsKt;
import java.util.Set;
import p001A.AbstractC0000a;
import p050y.C6429a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class ArticleWebViewClient extends WebViewClient {
    private final String articleUrl;
    private final ArticleWebViewListener articleWebViewListener;
    private final Set<String> helpCenterUrls;
    private boolean isArticleNotFound = false;
    private boolean isLoadError;

    public ArticleWebViewClient(String str, ArticleWebViewListener articleWebViewListener, Set<String> set) {
        this.articleUrl = str;
        this.articleWebViewListener = articleWebViewListener;
        this.helpCenterUrls = set;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m15475a(ArticleWebViewClient articleWebViewClient, WebView webView, String str) {
        articleWebViewClient.lambda$scrollToAnchorIfNeeded$0(webView, str);
    }

    private float getDensityIndependentPixels(int i, Context context) {
        return TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    private /* synthetic */ void lambda$scrollToAnchorIfNeeded$0(WebView webView, String str) {
        try {
            this.articleWebViewListener.scrollArticleViewTo((int) getDensityIndependentPixels(Integer.parseInt(str), webView.getContext()));
        } catch (NumberFormatException unused) {
        }
    }

    private void scrollToAnchorIfNeeded(WebView webView, String str) {
        String fragment = Uri.parse(str).getFragment();
        if (fragment != null) {
            webView.evaluateJavascript(AbstractC0000a.m3D("document.getElementById('", fragment, "').offsetTop"), new C6429a(this, webView));
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        if (this.isLoadError || this.isArticleNotFound) {
            return;
        }
        scrollToAnchorIfNeeded(webView, str);
        this.articleWebViewListener.onArticleFinishedLoading();
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        if (this.isArticleNotFound) {
            return;
        }
        this.isLoadError = false;
        this.articleWebViewListener.onArticleStartedLoading();
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        this.isLoadError = true;
        this.articleWebViewListener.onArticleLoadingError();
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        if (webResourceResponse.getStatusCode() == 404 || webResourceResponse.getStatusCode() == 401) {
            this.isLoadError = true;
            this.isArticleNotFound = true;
            this.articleWebViewListener.articleNotFound();
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Uri uri = Uri.parse(str);
        Uri uri2 = Uri.parse(this.articleUrl);
        String lastPathSegment = uri.getLastPathSegment();
        String lastPathSegment2 = uri2.getLastPathSegment();
        Context context = webView.getContext();
        if (!TextUtils.isEmpty(lastPathSegment) && !TextUtils.isEmpty(lastPathSegment2) && lastPathSegment.contains(lastPathSegment2)) {
            return false;
        }
        if (HelpCenterUrlUtilsKt.isHelpCenterArticleUrl(str, this.helpCenterUrls)) {
            HelpCenterUrlUtilsKt.openArticle(context, HelpCenterUrlUtilsKt.extractIdFromLastSegment(lastPathSegment), "article");
            return true;
        }
        if (HelpCenterUrlUtilsKt.isHelpCenterCollectionUrl(str, this.helpCenterUrls)) {
            HelpCenterUrlUtilsKt.openCollection(context, HelpCenterUrlUtilsKt.extractIdFromLastSegment(lastPathSegment), "article");
            return true;
        }
        context.startActivity(new Intent("android.intent.action.VIEW", uri));
        return true;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return shouldOverrideUrlLoading(webView, webResourceRequest.getUrl().toString());
    }
}
