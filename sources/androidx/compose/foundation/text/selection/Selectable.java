package androidx.compose.foundation.text.selection;

import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.p013ui.layout.LayoutCoordinates;
import androidx.compose.p013ui.text.AnnotatedString;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, m18302d2 = {"Landroidx/compose/foundation/text/selection/Selectable;", "", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public interface Selectable {
    /* JADX INFO: renamed from: a */
    AnnotatedString mo3567a();

    /* JADX INFO: renamed from: b */
    int mo3568b();

    /* JADX INFO: renamed from: c */
    float mo3569c(int i);

    /* JADX INFO: renamed from: d */
    Rect mo3570d(int i);

    /* JADX INFO: renamed from: e */
    long getF9648a();

    /* JADX INFO: renamed from: f */
    float mo3572f(int i);

    /* JADX INFO: renamed from: g */
    float mo3573g(int i);

    /* JADX INFO: renamed from: h */
    Selection mo3574h();

    /* JADX INFO: renamed from: i */
    void mo3575i(SelectionLayoutBuilder selectionLayoutBuilder);

    /* JADX INFO: renamed from: j */
    LayoutCoordinates mo3576j();

    /* JADX INFO: renamed from: k */
    long mo3577k(int i);

    /* JADX INFO: renamed from: l */
    long mo3578l(Selection selection, boolean z2);

    /* JADX INFO: renamed from: m */
    float mo3579m(int i);
}
