package io.intercom.android.sdk.p032m5.utils;

import android.net.Uri;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.lightcompressor.CompressionListener;
import java.io.File;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\"\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\nH\u0016J\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0011"}, m18302d2 = {"io/intercom/android/sdk/m5/utils/MediaCompressionKt$getCompressedVideoData$2$1", "Lio/intercom/android/sdk/lightcompressor/CompressionListener;", "onStart", "", FirebaseAnalytics.Param.INDEX, "", "onSuccess", "size", "", "path", "", "onFailure", "failureMessage", "onProgress", "percent", "", "onCancelled", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public final class MediaCompressionKt$getCompressedVideoData$2$1 implements CompressionListener {
    final /* synthetic */ Continuation<Pair<? extends Uri, Long>> $continuation;
    final /* synthetic */ Twig $twig;

    /* JADX WARN: Multi-variable type inference failed */
    public MediaCompressionKt$getCompressedVideoData$2$1(Twig twig, Continuation<? super Pair<? extends Uri, Long>> continuation) {
        this.$twig = twig;
        this.$continuation = continuation;
    }

    @Override // io.intercom.android.sdk.lightcompressor.CompressionListener
    public void onCancelled(int index) {
        this.$twig.internal("Video compression cancelled.");
        this.$continuation.resumeWith(ResultKt.m18312a(new CancellationException()));
    }

    @Override // io.intercom.android.sdk.lightcompressor.CompressionListener
    public void onFailure(int index, String failureMessage) {
        Intrinsics.m18599g(failureMessage, "failureMessage");
        this.$twig.internal("Video compression failed: " + failureMessage + '.');
        this.$continuation.resumeWith(ResultKt.m18312a(new Throwable(failureMessage)));
    }

    @Override // io.intercom.android.sdk.lightcompressor.CompressionListener
    public void onProgress(int index, float percent) {
        this.$twig.internal("Video compression in progress: " + percent + '.');
    }

    @Override // io.intercom.android.sdk.lightcompressor.CompressionListener
    public void onStart(int index) {
        this.$twig.internal("Video compression started.");
    }

    @Override // io.intercom.android.sdk.lightcompressor.CompressionListener
    public void onSuccess(int index, long size, String path) {
        this.$twig.internal("Video compression succeeded. Video saved in " + path + '.');
        this.$continuation.resumeWith(new Pair(Uri.fromFile(path != null ? new File(path) : null), Long.valueOf(size)));
    }
}
