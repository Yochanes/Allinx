package androidx.compose.p013ui.platform.actionmodecallback;

import android.R;
import android.os.Build;
import android.view.Menu;
import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/platform/actionmodecallback/TextActionModeCallback;", "", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
@SourceDebugExtension
public final class TextActionModeCallback {

    /* JADX INFO: renamed from: a */
    public final Function0 f19644a;

    /* JADX INFO: renamed from: b */
    public Rect f19645b;

    /* JADX INFO: renamed from: c */
    public Function0 f19646c;

    /* JADX INFO: renamed from: d */
    public Lambda f19647d;

    /* JADX INFO: renamed from: e */
    public Function0 f19648e;

    /* JADX INFO: renamed from: f */
    public Object f19649f;

    /* JADX INFO: renamed from: g */
    public Lambda f19650g;

    public TextActionModeCallback(Function0 function0) {
        Rect rect = Rect.f17525e;
        this.f19644a = function0;
        this.f19645b = rect;
        this.f19646c = null;
        this.f19647d = null;
        this.f19648e = null;
        this.f19649f = null;
        this.f19650g = null;
    }

    /* JADX INFO: renamed from: a */
    public static void m6204a(Menu menu, MenuItemOption menuItemOption) {
        int i;
        int iOrdinal = menuItemOption.ordinal();
        if (iOrdinal == 0) {
            i = R.string.copy;
        } else if (iOrdinal == 1) {
            i = R.string.paste;
        } else if (iOrdinal == 2) {
            i = R.string.cut;
        } else if (iOrdinal == 3) {
            i = R.string.selectAll;
        } else {
            if (iOrdinal != 4) {
                throw new NoWhenBranchMatchedException();
            }
            i = Build.VERSION.SDK_INT <= 26 ? com.exchange.allin.R.string.autofill : R.string.autofill;
        }
        menu.add(0, menuItemOption.f19642a, menuItemOption.f19643b, i).setShowAsAction(1);
    }

    /* JADX INFO: renamed from: b */
    public static void m6205b(Menu menu, MenuItemOption menuItemOption, Function0 function0) {
        int i = menuItemOption.f19642a;
        if (function0 != null && menu.findItem(i) == null) {
            m6204a(menu, menuItemOption);
        } else {
            if (function0 != null || menu.findItem(i) == null) {
                return;
            }
            menu.removeItem(i);
        }
    }
}
