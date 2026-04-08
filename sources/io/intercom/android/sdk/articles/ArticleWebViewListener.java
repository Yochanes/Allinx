package io.intercom.android.sdk.articles;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public interface ArticleWebViewListener {
    void articleNotFound();

    void onArticleFinishedLoading();

    void onArticleLoadingError();

    void onArticleStartedLoading();

    void scrollArticleViewTo(int i);
}
