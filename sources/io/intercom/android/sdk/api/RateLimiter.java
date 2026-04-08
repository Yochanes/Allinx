package io.intercom.android.sdk.api;

import androidx.annotation.VisibleForTesting;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.utilities.commons.TimeProvider;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
class RateLimiter {
    private final AppConfig appConfig;
    private int limitedRequestCount;
    private long periodStartTimestamp;
    private final TimeProvider timeProvider;
    private final Twig twig;

    public RateLimiter(AppConfig appConfig) {
        this(appConfig, TimeProvider.SYSTEM);
    }

    private boolean hasReachedMaxCount() {
        return this.limitedRequestCount >= this.appConfig.getRateLimitCount();
    }

    private boolean isInsideCurrentTimePeriod() {
        return this.timeProvider.currentTimeMillis() - this.periodStartTimestamp < this.appConfig.getRateLimitPeriodMs();
    }

    public boolean isLimited() {
        return isInsideCurrentTimePeriod() && hasReachedMaxCount();
    }

    public void logError() {
        this.twig.m15305e("Your app is being rate limited because you're performing too many requests per minute", new Object[0]);
    }

    public void recordRequest() {
        if (!isInsideCurrentTimePeriod()) {
            this.periodStartTimestamp = this.timeProvider.currentTimeMillis();
            this.limitedRequestCount = 0;
        }
        this.limitedRequestCount++;
    }

    @VisibleForTesting
    public RateLimiter(AppConfig appConfig, TimeProvider timeProvider) {
        this.twig = LumberMill.getLogger();
        this.appConfig = appConfig;
        this.timeProvider = timeProvider;
    }
}
