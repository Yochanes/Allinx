package androidx.compose.foundation.text.selection;

import androidx.collection.LongObjectMap;
import androidx.compose.p013ui.layout.LayoutCoordinates;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, m18302d2 = {"Landroidx/compose/foundation/text/selection/SelectionRegistrar;", "", "Companion", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public interface SelectionRegistrar {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/foundation/text/selection/SelectionRegistrar$Companion;", "", "foundation_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: renamed from: a */
    void mo3633a(long j);

    /* JADX INFO: renamed from: b */
    long mo3634b();

    /* JADX INFO: renamed from: c */
    void mo3635c();

    /* JADX INFO: renamed from: d */
    LongObjectMap mo3636d();

    /* JADX INFO: renamed from: e */
    Selectable mo3637e(MultiWidgetSelectionDelegate multiWidgetSelectionDelegate);

    /* JADX INFO: renamed from: f */
    void mo3638f(long j);

    /* JADX INFO: renamed from: g */
    void mo3639g(LayoutCoordinates layoutCoordinates, long j, SelectionAdjustment selectionAdjustment, boolean z2);

    /* JADX INFO: renamed from: h */
    void mo3640h(Selectable selectable);

    /* JADX INFO: renamed from: i */
    boolean mo3641i(LayoutCoordinates layoutCoordinates, long j, long j2, SelectionAdjustment selectionAdjustment, boolean z2);
}
