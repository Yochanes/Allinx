package io.intercom.android.sdk.helpcenter.webview;

import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.google.gson.Gson;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.helpcenter.utils.ConstantsKt;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.HashMap;
import java.util.Map;
import p051z.RunnableC6430a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class HelpCenterWebViewInterface {
    public static final String METRIC_EVENT = "METRIC_EVENT";
    public static final String TRACK_REACTION = "TRACK_REACTION";
    private final Api api;
    private final Gson gson;
    private final boolean isFromSearchBrowse;
    private final MetricTracker metricTracker;
    private final WebView webView;

    public HelpCenterWebViewInterface(WebView webView, Gson gson, MetricTracker metricTracker, Api api, boolean z2) {
        this.webView = webView;
        this.gson = gson;
        this.metricTracker = metricTracker;
        this.api = api;
        this.isFromSearchBrowse = z2;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m15524a(HelpCenterWebViewInterface helpCenterWebViewInterface, Map map) {
        helpCenterWebViewInterface.lambda$handleAction$1(map);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m15525b(HelpCenterWebViewInterface helpCenterWebViewInterface, Map map) {
        helpCenterWebViewInterface.lambda$handleAction$0(map);
    }

    private /* synthetic */ void lambda$handleAction$0(Map map) {
        String str = (String) map.get("action");
        String str2 = (String) map.get("object");
        String str3 = (String) map.get("place");
        HashMap map2 = new HashMap();
        if (map.get("metadata") instanceof Map) {
            map2.putAll((Map) map.get("metadata"));
        }
        if (this.isFromSearchBrowse) {
            map2.put(ConstantsKt.KEY_ARTICLE_SOURCE, "search_browse");
        }
        this.metricTracker.educateWebviewMetric(str, str2, str3, map2, MetricTracker.Context.FROM_HELP_CENTER_WEBVIEW);
    }

    private /* synthetic */ void lambda$handleAction$1(Map map) {
        Double d = (Double) map.get("article_id");
        Double d2 = (Double) map.get("article_content_id");
        Double d3 = (Double) map.get("reaction_index");
        if (d == null || d2 == null || d3 == null) {
            return;
        }
        this.api.reactToLink(String.valueOf(d.intValue()), String.valueOf(d2.intValue()), d3.intValue(), true);
    }

    @JavascriptInterface
    public void handleAction(String str) {
        HelpCenterWebViewAction helpCenterWebViewAction = (HelpCenterWebViewAction) this.gson.fromJson(str, HelpCenterWebViewAction.class);
        String type = helpCenterWebViewAction.getType();
        Map<String, Object> value = helpCenterWebViewAction.getValue();
        if (type == null || value == null) {
            return;
        }
        if (type.equals(TRACK_REACTION)) {
            this.webView.post(new RunnableC6430a(this, value, 1));
        } else if (type.equals(METRIC_EVENT)) {
            this.webView.post(new RunnableC6430a(this, value, 0));
        }
    }
}
