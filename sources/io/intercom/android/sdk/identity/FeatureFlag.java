package io.intercom.android.sdk.identity;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Retention(RetentionPolicy.SOURCE)
public @interface FeatureFlag {
    public static final String BLOCK_RENDERING_FALLBACK = "new-block-rendering-killswitch";
    public static final String DISABLE_ERROR_REPORTING = "disable-error-reporting";
    public static final String LAZY_MESSAGES_LIST_ENABLED = "lazy-messages-list-enabled";
    public static final String NEW_ARTICLE_SCREEN = "new-article-screen";
    public static final String POST_V2_RENDERING_ENABLED = "new-post-rendering-enabled";
}
