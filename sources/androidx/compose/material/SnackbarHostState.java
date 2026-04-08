package androidx.compose.material;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/compose/material/SnackbarHostState;", "", "SnackbarDataImpl", "material_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class SnackbarHostState {

    /* JADX INFO: renamed from: a */
    public final MutableState f11231a;

    /* JADX INFO: compiled from: Proguard */
    @Stable
    @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/material/SnackbarHostState$SnackbarDataImpl;", "Landroidx/compose/material/SnackbarData;", "material_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
    public static final class SnackbarDataImpl implements SnackbarData {
        @Override // androidx.compose.material.SnackbarData
        /* JADX INFO: renamed from: b */
        public final SnackbarDuration mo3780b() {
            return null;
        }

        @Override // androidx.compose.material.SnackbarData
        /* JADX INFO: renamed from: c */
        public final void mo3781c() {
            throw null;
        }

        @Override // androidx.compose.material.SnackbarData
        /* JADX INFO: renamed from: d */
        public final String mo3782d() {
            return null;
        }

        @Override // androidx.compose.material.SnackbarData
        public final void dismiss() {
            throw null;
        }

        @Override // androidx.compose.material.SnackbarData
        public final String getMessage() {
            return null;
        }
    }

    public SnackbarHostState() {
        MutexKt.m20913a();
        this.f11231a = SnapshotStateKt.m4525g(null);
    }
}
