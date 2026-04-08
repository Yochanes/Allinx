package com.chiclaim.android.downloader;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u0003¨\u0006\u0004"}, m18302d2 = {"Lcom/chiclaim/android/downloader/DownloadException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Companion", "downloader_release"}, m18303k = 1, m18304mv = {1, 6, 0}, m18306xi = 48)
public final class DownloadException extends Exception {

    /* JADX INFO: renamed from: a */
    public final int f35032a;

    /* JADX INFO: renamed from: b */
    public final int f35033b;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004¨\u0006\u000b"}, m18302d2 = {"Lcom/chiclaim/android/downloader/DownloadException$Companion;", "", "", "ERROR_CANNOT_RESUME", "I", "ERROR_DM_FAILED", "ERROR_MISSING_LOCATION_WHEN_REDIRECT", "ERROR_MISSING_URI", "ERROR_NO_NETWORK", "ERROR_TOO_MANY_REDIRECTS", "ERROR_UNHANDLED", "downloader_release"}, m18303k = 1, m18304mv = {1, 6, 0}, m18306xi = 48)
    public static final class Companion {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadException(int i, String errMsg, int i2) {
        super(errMsg);
        Intrinsics.m18599g(errMsg, "errMsg");
        this.f35032a = i;
        this.f35033b = i2;
    }
}
