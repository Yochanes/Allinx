package io.intercom.android.sdk.p032m5.home.p035ui.helpers;

import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.common.internal.ImagesContract;
import io.intercom.android.sdk.blocks.messengercard.CardWebView;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\u001a\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0000\u001a\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0003H\u0000\u001a\"\u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u0002H\u0002\u001a\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002\u001a\b\u0010\r\u001a\u00020\u0007H\u0000\"\u001a\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m18302d2 = {"webViewCache", "", "", "Lio/intercom/android/sdk/blocks/messengercard/CardWebView;", "getCachedWebView", ImagesContract.URL, "cacheWebView", "", "webView", "getFromURL", "attribute", "missingAttributeValue", "getIdFromURL", "clearWebViewCache", "intercom-sdk-base_release"}, m18303k = 2, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class InMemoryWebViewCacheKt {

    @NotNull
    private static Map<String, CardWebView> webViewCache = new LinkedHashMap();

    public static final void cacheWebView(@NotNull String url, @NotNull CardWebView webView) {
        Intrinsics.m18599g(url, "url");
        Intrinsics.m18599g(webView, "webView");
        String idFromURL = getIdFromURL(url);
        ViewParent parent = webView.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(webView);
        }
        webViewCache.put(idFromURL, webView);
    }

    public static final void clearWebViewCache() {
        webViewCache.clear();
    }

    @Nullable
    public static final CardWebView getCachedWebView(@NotNull String url) {
        Intrinsics.m18599g(url, "url");
        CardWebView cardWebView = webViewCache.get(getIdFromURL(url));
        if (cardWebView != null) {
            ViewParent parent = cardWebView.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(cardWebView);
            }
        }
        return cardWebView;
    }

    private static final String getFromURL(String str, String str2, String str3) {
        return StringsKt.m20423U(StringsKt.m20419Q(str, str2 + '=', str3), "&");
    }

    public static /* synthetic */ String getFromURL$default(String str, String str2, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = str;
        }
        return getFromURL(str, str2, str3);
    }

    private static final String getIdFromURL(String str) {
        return getFromURL$default(str, "card_id", null, 4, null) + '#' + getFromURL(str, "theme", "");
    }
}
