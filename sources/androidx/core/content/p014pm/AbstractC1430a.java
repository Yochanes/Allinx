package androidx.core.content.p014pm;

import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.view.inputmethod.EditorInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: androidx.core.content.pm.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1430a {
    /* JADX INFO: renamed from: a */
    public static /* bridge */ /* synthetic */ int m7514a(ShortcutManager shortcutManager) {
        return shortcutManager.getMaxShortcutCountPerActivity();
    }

    /* JADX INFO: renamed from: b */
    public static /* bridge */ /* synthetic */ ShortcutManager m7515b(Object obj) {
        return (ShortcutManager) obj;
    }

    /* JADX INFO: renamed from: c */
    public static /* bridge */ /* synthetic */ Class m7516c() {
        return ShortcutManager.class;
    }

    /* JADX INFO: renamed from: d */
    public static /* bridge */ /* synthetic */ List m7517d(ShortcutManager shortcutManager) {
        return shortcutManager.getDynamicShortcuts();
    }

    /* JADX INFO: renamed from: e */
    public static /* bridge */ /* synthetic */ void m7518e(ShortcutInfo shortcutInfo) {
        shortcutInfo.isEnabled();
    }

    /* JADX INFO: renamed from: f */
    public static /* bridge */ /* synthetic */ void m7519f(ShortcutManager shortcutManager, String str) {
        shortcutManager.reportShortcutUsed(str);
    }

    /* JADX INFO: renamed from: g */
    public static /* bridge */ /* synthetic */ void m7520g(ShortcutManager shortcutManager, List list) {
        shortcutManager.removeDynamicShortcuts(list);
    }

    /* JADX INFO: renamed from: h */
    public static /* bridge */ /* synthetic */ void m7521h(EditorInfo editorInfo, String[] strArr) {
        editorInfo.contentMimeTypes = strArr;
    }

    /* JADX INFO: renamed from: i */
    public static /* bridge */ /* synthetic */ boolean m7522i(ShortcutManager shortcutManager) {
        return shortcutManager.isRateLimitingActive();
    }

    /* JADX INFO: renamed from: j */
    public static /* bridge */ /* synthetic */ boolean m7523j(ShortcutManager shortcutManager, ArrayList arrayList) {
        return shortcutManager.setDynamicShortcuts(arrayList);
    }

    /* JADX INFO: renamed from: k */
    public static /* bridge */ /* synthetic */ String[] m7524k(EditorInfo editorInfo) {
        return editorInfo.contentMimeTypes;
    }

    /* JADX INFO: renamed from: l */
    public static /* bridge */ /* synthetic */ void m7525l(ShortcutInfo shortcutInfo) {
        shortcutInfo.hasKeyFieldsOnly();
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ void m7526m(ShortcutManager shortcutManager, List list) {
        shortcutManager.addDynamicShortcuts(list);
    }
}
