package androidx.compose.p013ui.input.nestedscroll;

import androidx.compose.p013ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0003"}, m18302d2 = {"Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public interface NestedScrollConnection {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18303k = 3, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class DefaultImpls {
    }

    /* JADX INFO: renamed from: onPostFling-RZ2iAVY */
    default Object mo21915onPostFlingRZ2iAVY(long j, long j2, Continuation continuation) {
        return new Velocity(0L);
    }

    /* JADX INFO: renamed from: onPostScroll-DzOQY0M */
    default long mo21916onPostScrollDzOQY0M(long j, long j2, int i) {
        return 0L;
    }

    /* JADX INFO: renamed from: onPreFling-QWom1Mo */
    default Object mo21924onPreFlingQWom1Mo(long j, Continuation continuation) {
        return new Velocity(0L);
    }

    /* JADX INFO: renamed from: onPreScroll-OzD1aCk */
    default long mo21925onPreScrollOzD1aCk(long j, int i) {
        return 0L;
    }
}
