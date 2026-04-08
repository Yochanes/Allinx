package io.intercom.android.sdk.lightcompressor;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\t"}, m18302d2 = {"Lio/intercom/android/sdk/lightcompressor/CompressionProgressListener;", "", "onProgressChanged", "", FirebaseAnalytics.Param.INDEX, "", "percent", "", "onProgressCancelled", "intercom-sdk-lightcompressor_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public interface CompressionProgressListener {
    void onProgressCancelled(int index);

    void onProgressChanged(int index, float percent);
}
