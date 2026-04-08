package androidx.compose.material;

import androidx.compose.runtime.Stable;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/material/ScaffoldState;", "", "material_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class ScaffoldState {

    /* JADX INFO: renamed from: a */
    public final DrawerState f11004a;

    /* JADX INFO: renamed from: b */
    public final SnackbarHostState f11005b;

    public ScaffoldState(DrawerState drawerState, SnackbarHostState snackbarHostState) {
        this.f11004a = drawerState;
        this.f11005b = snackbarHostState;
    }
}
