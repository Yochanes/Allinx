package androidx.compose.foundation.text.input.internal;

import android.graphics.PointF;
import android.graphics.RectF;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.d */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0745d {
    /* JADX INFO: renamed from: A */
    public static /* bridge */ /* synthetic */ boolean m3408A(Object obj) {
        return obj instanceof JoinOrSplitGesture;
    }

    /* JADX INFO: renamed from: B */
    public static /* bridge */ /* synthetic */ Class m3409B() {
        return JoinOrSplitGesture.class;
    }

    /* JADX INFO: renamed from: C */
    public static /* bridge */ /* synthetic */ Class m3410C() {
        return InsertGesture.class;
    }

    /* JADX INFO: renamed from: D */
    public static /* bridge */ /* synthetic */ Class m3411D() {
        return RemoveSpaceGesture.class;
    }

    /* JADX INFO: renamed from: a */
    public static /* bridge */ /* synthetic */ int m3412a(DeleteGesture deleteGesture) {
        return deleteGesture.getGranularity();
    }

    /* JADX INFO: renamed from: b */
    public static /* bridge */ /* synthetic */ int m3413b(DeleteRangeGesture deleteRangeGesture) {
        return deleteRangeGesture.getGranularity();
    }

    /* JADX INFO: renamed from: c */
    public static /* bridge */ /* synthetic */ int m3414c(SelectGesture selectGesture) {
        return selectGesture.getGranularity();
    }

    /* JADX INFO: renamed from: d */
    public static /* bridge */ /* synthetic */ int m3415d(SelectRangeGesture selectRangeGesture) {
        return selectRangeGesture.getGranularity();
    }

    /* JADX INFO: renamed from: e */
    public static /* bridge */ /* synthetic */ PointF m3416e(InsertGesture insertGesture) {
        return insertGesture.getInsertionPoint();
    }

    /* JADX INFO: renamed from: f */
    public static /* bridge */ /* synthetic */ RectF m3417f(DeleteGesture deleteGesture) {
        return deleteGesture.getDeletionArea();
    }

    /* JADX INFO: renamed from: g */
    public static /* bridge */ /* synthetic */ RectF m3418g(DeleteRangeGesture deleteRangeGesture) {
        return deleteRangeGesture.getDeletionStartArea();
    }

    /* JADX INFO: renamed from: h */
    public static /* bridge */ /* synthetic */ RectF m3419h(SelectGesture selectGesture) {
        return selectGesture.getSelectionArea();
    }

    /* JADX INFO: renamed from: i */
    public static /* bridge */ /* synthetic */ HandwritingGesture m3420i(Object obj) {
        return (HandwritingGesture) obj;
    }

    /* JADX INFO: renamed from: j */
    public static /* bridge */ /* synthetic */ InsertGesture m3421j(Object obj) {
        return (InsertGesture) obj;
    }

    /* JADX INFO: renamed from: k */
    public static /* bridge */ /* synthetic */ JoinOrSplitGesture m3422k(Object obj) {
        return (JoinOrSplitGesture) obj;
    }

    /* JADX INFO: renamed from: l */
    public static /* bridge */ /* synthetic */ RemoveSpaceGesture m3423l(Object obj) {
        return (RemoveSpaceGesture) obj;
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ SelectGesture m3424m(Object obj) {
        return (SelectGesture) obj;
    }

    /* JADX INFO: renamed from: n */
    public static /* bridge */ /* synthetic */ Class m3425n() {
        return SelectGesture.class;
    }

    /* JADX INFO: renamed from: o */
    public static /* bridge */ /* synthetic */ String m3426o(InsertGesture insertGesture) {
        return insertGesture.getTextToInsert();
    }

    /* JADX INFO: renamed from: p */
    public static /* bridge */ /* synthetic */ void m3427p(CursorAnchorInfo.Builder builder, float f, float f2, float f3, float f4) {
        builder.addVisibleLineBounds(f, f2, f3, f4);
    }

    /* JADX INFO: renamed from: q */
    public static /* bridge */ /* synthetic */ void m3428q(EditorInfo editorInfo, List list) {
        editorInfo.setSupportedHandwritingGestures(list);
    }

    /* JADX INFO: renamed from: r */
    public static /* bridge */ /* synthetic */ void m3429r(EditorInfo editorInfo, Set set) {
        editorInfo.setSupportedHandwritingGesturePreviews(set);
    }

    /* JADX INFO: renamed from: s */
    public static /* bridge */ /* synthetic */ void m3430s(android.view.inputmethod.InputMethodManager inputMethodManager, View view) {
        inputMethodManager.acceptStylusHandwritingDelegation(view);
    }

    /* JADX INFO: renamed from: t */
    public static /* bridge */ /* synthetic */ boolean m3431t(Object obj) {
        return obj instanceof SelectGesture;
    }

    /* JADX INFO: renamed from: u */
    public static /* bridge */ /* synthetic */ RectF m3432u(DeleteRangeGesture deleteRangeGesture) {
        return deleteRangeGesture.getDeletionEndArea();
    }

    /* JADX INFO: renamed from: v */
    public static /* bridge */ /* synthetic */ Class m3433v() {
        return SelectRangeGesture.class;
    }

    /* JADX INFO: renamed from: w */
    public static /* bridge */ /* synthetic */ boolean m3434w(Object obj) {
        return obj instanceof InsertGesture;
    }

    /* JADX INFO: renamed from: x */
    public static /* bridge */ /* synthetic */ Class m3435x() {
        return DeleteRangeGesture.class;
    }

    /* JADX INFO: renamed from: y */
    public static /* bridge */ /* synthetic */ boolean m3436y(Object obj) {
        return obj instanceof RemoveSpaceGesture;
    }

    /* JADX INFO: renamed from: z */
    public static /* bridge */ /* synthetic */ Class m3437z() {
        return DeleteGesture.class;
    }
}
