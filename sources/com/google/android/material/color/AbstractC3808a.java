package com.google.android.material.color;

import android.app.UiModeManager;
import android.app.UiModeManager$ContrastChangeListener;
import android.widget.EditText;
import com.google.android.material.search.RunnableC3953g;
import com.google.android.material.search.SearchBar;
import java.util.concurrent.Executor;
import kotlinx.serialization.internal.ClassValueReferences;

/* JADX INFO: renamed from: com.google.android.material.color.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC3808a {
    /* JADX INFO: renamed from: a */
    public static /* bridge */ /* synthetic */ Object m14508a(ClassValueReferences classValueReferences, Class cls) {
        return classValueReferences.get(cls);
    }

    /* JADX INFO: renamed from: b */
    public static /* bridge */ /* synthetic */ void m14509b(UiModeManager uiModeManager, Executor executor, UiModeManager$ContrastChangeListener uiModeManager$ContrastChangeListener) {
        uiModeManager.addContrastChangeListener(executor, uiModeManager$ContrastChangeListener);
    }

    /* JADX INFO: renamed from: c */
    public static /* bridge */ /* synthetic */ void m14510c(EditText editText) {
        editText.setIsHandwritingDelegate(true);
    }

    /* JADX INFO: renamed from: d */
    public static /* bridge */ /* synthetic */ void m14511d(SearchBar searchBar, float f, float f2) {
        searchBar.setHandwritingBoundsOffsets(f, 0.0f, f2, 0.0f);
    }

    /* JADX INFO: renamed from: e */
    public static /* bridge */ /* synthetic */ void m14512e(SearchBar searchBar, RunnableC3953g runnableC3953g) {
        searchBar.setHandwritingDelegatorCallback(runnableC3953g);
    }
}
