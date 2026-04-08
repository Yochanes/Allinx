package androidx.compose.p013ui.platform.actionmodecallback;

import android.graphics.Rect;
import android.os.Build;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@RequiresApi
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/platform/actionmodecallback/FloatingTextActionModeCallback;", "Landroid/view/ActionMode$Callback2;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class FloatingTextActionModeCallback extends ActionMode.Callback2 {

    /* JADX INFO: renamed from: a */
    public final TextActionModeCallback f19634a;

    public FloatingTextActionModeCallback(TextActionModeCallback textActionModeCallback) {
        this.f19634a = textActionModeCallback;
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r5v5, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        TextActionModeCallback textActionModeCallback = this.f19634a;
        textActionModeCallback.getClass();
        Intrinsics.m18596d(menuItem);
        int itemId = menuItem.getItemId();
        MenuItemOption menuItemOption = MenuItemOption.f19635c;
        if (itemId == 0) {
            Function0 function0 = textActionModeCallback.f19646c;
            if (function0 != null) {
                function0.invoke();
            }
        } else if (itemId == 1) {
            ?? r5 = textActionModeCallback.f19647d;
            if (r5 != 0) {
                r5.invoke();
            }
        } else if (itemId == 2) {
            Function0 function02 = textActionModeCallback.f19648e;
            if (function02 != null) {
                function02.invoke();
            }
        } else if (itemId == 3) {
            ?? r52 = textActionModeCallback.f19649f;
            if (r52 != 0) {
                r52.invoke();
            }
        } else {
            if (itemId != 4) {
                return false;
            }
            ?? r53 = textActionModeCallback.f19650g;
            if (r53 != 0) {
                r53.invoke();
            }
        }
        if (actionMode != null) {
            actionMode.finish();
        }
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        TextActionModeCallback textActionModeCallback = this.f19634a;
        textActionModeCallback.getClass();
        if (menu == null) {
            throw new IllegalArgumentException("onCreateActionMode requires a non-null menu");
        }
        if (actionMode == null) {
            throw new IllegalArgumentException("onCreateActionMode requires a non-null mode");
        }
        if (textActionModeCallback.f19646c != null) {
            TextActionModeCallback.m6204a(menu, MenuItemOption.f19635c);
        }
        if (textActionModeCallback.f19647d != null) {
            TextActionModeCallback.m6204a(menu, MenuItemOption.f19636d);
        }
        if (textActionModeCallback.f19648e != null) {
            TextActionModeCallback.m6204a(menu, MenuItemOption.f19637f);
        }
        if (textActionModeCallback.f19649f != null) {
            TextActionModeCallback.m6204a(menu, MenuItemOption.f19638g);
        }
        if (textActionModeCallback.f19650g == null || Build.VERSION.SDK_INT < 26) {
            return true;
        }
        TextActionModeCallback.m6204a(menu, MenuItemOption.f19639i);
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        this.f19634a.f19644a.invoke();
    }

    @Override // android.view.ActionMode.Callback2
    public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        androidx.compose.p013ui.geometry.Rect rect2 = this.f19634a.f19645b;
        if (rect != null) {
            rect.set((int) rect2.f17526a, (int) rect2.f17527b, (int) rect2.f17528c, (int) rect2.f17529d);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.jvm.functions.Function0] */
    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        TextActionModeCallback textActionModeCallback = this.f19634a;
        textActionModeCallback.getClass();
        if (actionMode == null || menu == null) {
            return false;
        }
        TextActionModeCallback.m6205b(menu, MenuItemOption.f19635c, textActionModeCallback.f19646c);
        TextActionModeCallback.m6205b(menu, MenuItemOption.f19636d, textActionModeCallback.f19647d);
        TextActionModeCallback.m6205b(menu, MenuItemOption.f19637f, textActionModeCallback.f19648e);
        TextActionModeCallback.m6205b(menu, MenuItemOption.f19638g, textActionModeCallback.f19649f);
        TextActionModeCallback.m6205b(menu, MenuItemOption.f19639i, textActionModeCallback.f19650g);
        return true;
    }
}
