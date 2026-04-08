package io.intercom.android.sdk.lightcompressor;

import androidx.annotation.MainThread;
import androidx.annotation.WorkerThread;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\"\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH'J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\nH'J\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fH'J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'¨\u0006\u0011"}, m18302d2 = {"Lio/intercom/android/sdk/lightcompressor/CompressionListener;", "", "onStart", "", FirebaseAnalytics.Param.INDEX, "", "onSuccess", "size", "", "path", "", "onFailure", "failureMessage", "onProgress", "percent", "", "onCancelled", "intercom-sdk-lightcompressor_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public interface CompressionListener {
    @WorkerThread
    void onCancelled(int index);

    @MainThread
    void onFailure(int index, @NotNull String failureMessage);

    @WorkerThread
    void onProgress(int index, float percent);

    @MainThread
    void onStart(int index);

    @MainThread
    void onSuccess(int index, long size, @Nullable String path);
}
