package androidx.activity;

import android.view.Window;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
@Metadata(m18301d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m18302d2 = {"Landroidx/activity/EdgeToEdgeApi30;", "Landroidx/activity/EdgeToEdgeApi29;", "Landroid/view/Window;", "window", "", "b", "(Landroid/view/Window;)V", "activity_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
final class EdgeToEdgeApi30 extends EdgeToEdgeApi29 {
    @Override // androidx.activity.EdgeToEdgeApi28, androidx.activity.EdgeToEdgeBase, androidx.activity.EdgeToEdgeImpl
    @DoNotInline
    /* JADX INFO: renamed from: b */
    public void mo157b(@NotNull Window window) {
        Intrinsics.m18599g(window, "window");
        AbstractC0050i.m194C(window.getAttributes());
    }
}
