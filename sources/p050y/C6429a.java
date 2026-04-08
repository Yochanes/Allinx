package p050y;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import io.intercom.android.sdk.articles.ArticleWebViewClient;

/* JADX INFO: renamed from: y.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C6429a implements ValueCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ArticleWebViewClient f59485a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ WebView f59486b;

    public /* synthetic */ C6429a(ArticleWebViewClient articleWebViewClient, WebView webView) {
        this.f59485a = articleWebViewClient;
        this.f59486b = webView;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        ArticleWebViewClient.m15475a(this.f59485a, this.f59486b, (String) obj);
    }
}
