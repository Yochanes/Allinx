package androidx.activity;

import android.view.View;
import android.view.Window;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
@Metadata(m18301d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001J?\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0017¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m18302d2 = {"Landroidx/activity/EdgeToEdgeApi23;", "Landroidx/activity/EdgeToEdgeBase;", "Landroidx/activity/SystemBarStyle;", "statusBarStyle", "navigationBarStyle", "Landroid/view/Window;", "window", "Landroid/view/View;", "view", "", "statusBarIsDark", "navigationBarIsDark", "", "a", "(Landroidx/activity/SystemBarStyle;Landroidx/activity/SystemBarStyle;Landroid/view/Window;Landroid/view/View;ZZ)V", "activity_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
final class EdgeToEdgeApi23 extends EdgeToEdgeBase {
    @Override // androidx.activity.EdgeToEdgeBase, androidx.activity.EdgeToEdgeImpl
    @DoNotInline
    /* JADX INFO: renamed from: a */
    public void mo156a(@NotNull SystemBarStyle statusBarStyle, @NotNull SystemBarStyle navigationBarStyle, @NotNull Window window, @NotNull View view, boolean statusBarIsDark, boolean navigationBarIsDark) {
        Intrinsics.m18599g(statusBarStyle, "statusBarStyle");
        Intrinsics.m18599g(navigationBarStyle, "navigationBarStyle");
        Intrinsics.m18599g(window, "window");
        Intrinsics.m18599g(view, "view");
        WindowCompat.m7873a(window, false);
        window.setStatusBarColor(statusBarIsDark ? statusBarStyle.f117b : statusBarStyle.f116a);
        window.setNavigationBarColor(navigationBarStyle.f117b);
        new WindowInsetsControllerCompat(window, view).m7957f(!statusBarIsDark);
    }
}
