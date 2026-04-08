package androidx.compose.foundation.text.input.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import java.util.Set;

/* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.b */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0743b {
    /* JADX INFO: renamed from: A */
    public static /* bridge */ /* synthetic */ void m3378A(ShortcutInfo shortcutInfo) {
        shortcutInfo.isDynamic();
    }

    /* JADX INFO: renamed from: B */
    public static /* bridge */ /* synthetic */ void m3379B(ShortcutInfo shortcutInfo) {
        shortcutInfo.isPinned();
    }

    /* JADX INFO: renamed from: C */
    public static /* bridge */ /* synthetic */ void m3380C(ShortcutInfo shortcutInfo) {
        shortcutInfo.isDeclaredInManifest();
    }

    /* JADX INFO: renamed from: D */
    public static /* bridge */ /* synthetic */ void m3381D(ShortcutInfo shortcutInfo) {
        shortcutInfo.isImmutable();
    }

    /* JADX INFO: renamed from: a */
    public static /* bridge */ /* synthetic */ int m3382a(ShortcutInfo shortcutInfo) {
        return shortcutInfo.getRank();
    }

    /* JADX INFO: renamed from: b */
    public static /* bridge */ /* synthetic */ ComponentName m3383b(ShortcutInfo shortcutInfo) {
        return shortcutInfo.getActivity();
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ ShortcutInfo.Builder m3384c(Context context, String str) {
        return new ShortcutInfo.Builder(context, str);
    }

    /* JADX INFO: renamed from: d */
    public static /* bridge */ /* synthetic */ ShortcutInfo.Builder m3385d(ShortcutInfo.Builder builder, CharSequence charSequence) {
        return builder.setShortLabel(charSequence);
    }

    /* JADX INFO: renamed from: e */
    public static /* bridge */ /* synthetic */ ShortcutInfo.Builder m3386e(ShortcutInfo.Builder builder, Intent[] intentArr) {
        return builder.setIntents(intentArr);
    }

    /* JADX INFO: renamed from: f */
    public static /* bridge */ /* synthetic */ ShortcutInfo m3387f(ShortcutInfo.Builder builder) {
        return builder.build();
    }

    /* JADX INFO: renamed from: g */
    public static /* bridge */ /* synthetic */ ShortcutInfo m3388g(Object obj) {
        return (ShortcutInfo) obj;
    }

    /* JADX INFO: renamed from: h */
    public static /* bridge */ /* synthetic */ PersistableBundle m3389h(ShortcutInfo shortcutInfo) {
        return shortcutInfo.getExtras();
    }

    /* JADX INFO: renamed from: i */
    public static /* bridge */ /* synthetic */ CharSequence m3390i(ShortcutInfo shortcutInfo) {
        return shortcutInfo.getShortLabel();
    }

    /* JADX INFO: renamed from: j */
    public static /* bridge */ /* synthetic */ String m3391j(ShortcutInfo shortcutInfo) {
        return shortcutInfo.getId();
    }

    /* JADX INFO: renamed from: k */
    public static /* bridge */ /* synthetic */ Set m3392k(ShortcutInfo shortcutInfo) {
        return shortcutInfo.getCategories();
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m3393l() {
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ void m3394m(ShortcutInfo.Builder builder, int i) {
        builder.setRank(i);
    }

    /* JADX INFO: renamed from: n */
    public static /* bridge */ /* synthetic */ void m3395n(ShortcutInfo.Builder builder, ComponentName componentName) {
        builder.setActivity(componentName);
    }

    /* JADX INFO: renamed from: o */
    public static /* bridge */ /* synthetic */ void m3396o(ShortcutInfo.Builder builder, Icon icon) {
        builder.setIcon(icon);
    }

    /* JADX INFO: renamed from: p */
    public static /* bridge */ /* synthetic */ void m3397p(ShortcutInfo.Builder builder, PersistableBundle persistableBundle) {
        builder.setExtras(persistableBundle);
    }

    /* JADX INFO: renamed from: q */
    public static /* bridge */ /* synthetic */ void m3398q(ShortcutInfo.Builder builder, CharSequence charSequence) {
        builder.setLongLabel(charSequence);
    }

    /* JADX INFO: renamed from: r */
    public static /* bridge */ /* synthetic */ void m3399r(ShortcutInfo.Builder builder, Set set) {
        builder.setCategories(set);
    }

    /* JADX INFO: renamed from: s */
    public static /* bridge */ /* synthetic */ void m3400s(ShortcutInfo shortcutInfo) {
        shortcutInfo.getPackage();
    }

    /* JADX INFO: renamed from: t */
    public static /* bridge */ /* synthetic */ boolean m3401t(InputConnection inputConnection, InputContentInfo inputContentInfo, int i, Bundle bundle) {
        return inputConnection.commitContent(inputContentInfo, i, bundle);
    }

    /* JADX INFO: renamed from: u */
    public static /* bridge */ /* synthetic */ Intent[] m3402u(ShortcutInfo shortcutInfo) {
        return shortcutInfo.getIntents();
    }

    /* JADX INFO: renamed from: v */
    public static /* bridge */ /* synthetic */ CharSequence m3403v(ShortcutInfo shortcutInfo) {
        return shortcutInfo.getLongLabel();
    }

    /* JADX INFO: renamed from: w */
    public static /* bridge */ /* synthetic */ void m3404w(ShortcutInfo.Builder builder, CharSequence charSequence) {
        builder.setDisabledMessage(charSequence);
    }

    /* JADX INFO: renamed from: x */
    public static /* bridge */ /* synthetic */ void m3405x(ShortcutInfo shortcutInfo) {
        shortcutInfo.getUserHandle();
    }

    /* JADX INFO: renamed from: y */
    public static /* bridge */ /* synthetic */ CharSequence m3406y(ShortcutInfo shortcutInfo) {
        return shortcutInfo.getDisabledMessage();
    }

    /* JADX INFO: renamed from: z */
    public static /* bridge */ /* synthetic */ void m3407z(ShortcutInfo shortcutInfo) {
        shortcutInfo.getLastChangedTimestamp();
    }
}
