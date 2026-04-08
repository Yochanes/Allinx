package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.state.helpers.Facade;
import androidx.constraintlayout.core.widgets.ConstraintWidget;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public interface Reference {
    /* JADX INFO: renamed from: a */
    void mo6964a(ConstraintWidget constraintWidget);

    void apply();

    /* JADX INFO: renamed from: b */
    ConstraintWidget mo6965b();

    /* JADX INFO: renamed from: c */
    Facade mo6966c();

    Object getKey();
}
