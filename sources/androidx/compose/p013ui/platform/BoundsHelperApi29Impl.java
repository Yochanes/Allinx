package androidx.compose.p013ui.platform;

import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Rect;
import androidx.annotation.RequiresApi;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/compose/ui/platform/BoundsHelperApi29Impl;", "Landroidx/compose/ui/platform/BoundsHelper;", "ui_release"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
final class BoundsHelperApi29Impl implements BoundsHelper {

    /* JADX INFO: renamed from: a */
    public static final BoundsHelperApi29Impl f19314a = new BoundsHelperApi29Impl();

    @Override // androidx.compose.p013ui.platform.BoundsHelper
    /* JADX INFO: renamed from: a */
    public final Rect mo6101a(Activity activity) throws Exception {
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", new Class[0]).invoke(obj, new Object[0]);
            Intrinsics.m18597e(objInvoke, "null cannot be cast to non-null type android.graphics.Rect");
            return new Rect((Rect) objInvoke);
        } catch (Exception e) {
            if (e instanceof NoSuchFieldException ? true : e instanceof NoSuchMethodException ? true : e instanceof IllegalAccessException ? true : e instanceof InvocationTargetException) {
                return BoundsHelperApi28Impl.f19313a.mo6101a(activity);
            }
            throw e;
        }
    }
}
