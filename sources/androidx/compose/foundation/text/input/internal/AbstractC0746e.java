package androidx.compose.foundation.text.input.internal;

import android.graphics.ColorSpace;
import android.graphics.PointF;
import android.graphics.RectF;
import android.net.http.HeaderBlock;
import android.net.http.UploadDataProvider;
import android.net.http.UploadDataSink;
import android.net.http.UrlRequest;
import android.net.http.UrlResponseInfo;
import android.os.CancellationSignal;
import android.text.GraphemeClusterSegmentFinder;
import android.text.Layout;
import android.text.SegmentFinder;
import android.text.TextPaint;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectRangeGesture;
import androidx.compose.p013ui.text.android.C1328a;
import com.google.common.net.HttpHeaders;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.e */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0746e {
    /* JADX INFO: renamed from: A */
    public static /* bridge */ /* synthetic */ void m3438A(UploadDataSink uploadDataSink) {
        uploadDataSink.onRewindSucceeded();
    }

    /* JADX INFO: renamed from: B */
    public static /* bridge */ /* synthetic */ void m3439B(UrlRequest.Builder builder, String str) {
        builder.setHttpMethod(str);
    }

    /* JADX INFO: renamed from: C */
    public static /* bridge */ /* synthetic */ boolean m3440C(Object obj) {
        return obj instanceof SelectRangeGesture;
    }

    /* JADX INFO: renamed from: D */
    public static /* bridge */ /* synthetic */ boolean m3441D(Object obj) {
        return obj instanceof DeleteRangeGesture;
    }

    /* JADX INFO: renamed from: a */
    public static /* bridge */ /* synthetic */ ColorSpace.Named m3442a() {
        return ColorSpace.Named.BT2020_HLG;
    }

    /* JADX INFO: renamed from: b */
    public static /* bridge */ /* synthetic */ PointF m3443b(JoinOrSplitGesture joinOrSplitGesture) {
        return joinOrSplitGesture.getJoinOrSplitPoint();
    }

    /* JADX INFO: renamed from: c */
    public static /* bridge */ /* synthetic */ PointF m3444c(RemoveSpaceGesture removeSpaceGesture) {
        return removeSpaceGesture.getStartPoint();
    }

    /* JADX INFO: renamed from: d */
    public static /* bridge */ /* synthetic */ RectF m3445d(SelectRangeGesture selectRangeGesture) {
        return selectRangeGesture.getSelectionStartArea();
    }

    /* JADX INFO: renamed from: e */
    public static /* bridge */ /* synthetic */ HeaderBlock m3446e(UrlResponseInfo urlResponseInfo) {
        return urlResponseInfo.getHeaders();
    }

    /* JADX INFO: renamed from: f */
    public static /* bridge */ /* synthetic */ UrlRequest.Builder m3447f(UrlRequest.Builder builder) {
        return builder.setDirectExecutorAllowed(true);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ GraphemeClusterSegmentFinder m3448g(TextPaint textPaint, CharSequence charSequence) {
        return new GraphemeClusterSegmentFinder(charSequence, textPaint);
    }

    /* JADX INFO: renamed from: h */
    public static /* bridge */ /* synthetic */ SegmentFinder m3449h(Object obj) {
        return (SegmentFinder) obj;
    }

    /* JADX INFO: renamed from: i */
    public static /* bridge */ /* synthetic */ DeleteGesture m3450i(Object obj) {
        return (DeleteGesture) obj;
    }

    /* JADX INFO: renamed from: j */
    public static /* bridge */ /* synthetic */ DeleteRangeGesture m3451j(Object obj) {
        return (DeleteRangeGesture) obj;
    }

    /* JADX INFO: renamed from: k */
    public static /* bridge */ /* synthetic */ SelectRangeGesture m3452k(Object obj) {
        return (SelectRangeGesture) obj;
    }

    /* JADX INFO: renamed from: l */
    public static /* bridge */ /* synthetic */ String m3453l(UrlResponseInfo urlResponseInfo) {
        return urlResponseInfo.getUrl();
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ String m3454m(HandwritingGesture handwritingGesture) {
        return handwritingGesture.getFallbackText();
    }

    /* JADX INFO: renamed from: n */
    public static /* bridge */ /* synthetic */ Map m3455n(HeaderBlock headerBlock) {
        return headerBlock.getAsMap();
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m3456o() {
    }

    /* JADX INFO: renamed from: p */
    public static /* bridge */ /* synthetic */ void m3457p(UploadDataSink uploadDataSink) {
        uploadDataSink.onReadSucceeded(false);
    }

    /* JADX INFO: renamed from: q */
    public static /* bridge */ /* synthetic */ void m3458q(UrlRequest.Builder builder, UploadDataProvider uploadDataProvider) {
        builder.setUploadDataProvider(uploadDataProvider, null);
    }

    /* JADX INFO: renamed from: r */
    public static /* bridge */ /* synthetic */ void m3459r(UrlRequest.Builder builder, String str) {
        builder.addHeader(HttpHeaders.RANGE, str);
    }

    /* JADX INFO: renamed from: s */
    public static /* bridge */ /* synthetic */ void m3460s(UrlRequest.Builder builder, String str, String str2) {
        builder.addHeader(str, str2);
    }

    /* JADX INFO: renamed from: t */
    public static /* bridge */ /* synthetic */ void m3461t(InputConnection inputConnection, HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        inputConnection.performHandwritingGesture(handwritingGesture, executor, intConsumer);
    }

    /* JADX INFO: renamed from: u */
    public static /* bridge */ /* synthetic */ boolean m3462u(InputConnection inputConnection, PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        return inputConnection.previewHandwritingGesture(previewableHandwritingGesture, cancellationSignal);
    }

    /* JADX INFO: renamed from: v */
    public static /* bridge */ /* synthetic */ boolean m3463v(Object obj) {
        return obj instanceof DeleteGesture;
    }

    /* JADX INFO: renamed from: w */
    public static /* bridge */ /* synthetic */ int[] m3464w(Layout layout, RectF rectF, SegmentFinder segmentFinder, C1328a c1328a) {
        return layout.getRangeForRect(rectF, segmentFinder, c1328a);
    }

    /* JADX INFO: renamed from: x */
    public static /* bridge */ /* synthetic */ ColorSpace.Named m3465x() {
        return ColorSpace.Named.BT2020_PQ;
    }

    /* JADX INFO: renamed from: y */
    public static /* bridge */ /* synthetic */ PointF m3466y(RemoveSpaceGesture removeSpaceGesture) {
        return removeSpaceGesture.getEndPoint();
    }

    /* JADX INFO: renamed from: z */
    public static /* bridge */ /* synthetic */ RectF m3467z(SelectRangeGesture selectRangeGesture) {
        return selectRangeGesture.getSelectionEndArea();
    }
}
