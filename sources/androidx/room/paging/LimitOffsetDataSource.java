package androidx.room.paging;

import androidx.annotation.RestrictTo;
import androidx.paging.PositionalDataSource;
import androidx.room.InvalidationTracker;
import java.util.Set;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
public abstract class LimitOffsetDataSource<T> extends PositionalDataSource<T> {

    /* JADX INFO: renamed from: androidx.room.paging.LimitOffsetDataSource$1 */
    /* JADX INFO: compiled from: Proguard */
    class C21941 extends InvalidationTracker.Observer {
        @Override // androidx.room.InvalidationTracker.Observer
        /* JADX INFO: renamed from: a */
        public final void mo11790a(Set set) {
            throw null;
        }
    }

    @Override // androidx.paging.DataSource
    /* JADX INFO: renamed from: a */
    public final boolean mo11328a() {
        throw null;
    }
}
