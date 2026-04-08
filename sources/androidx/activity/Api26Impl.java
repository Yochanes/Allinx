package androidx.activity;

import android.app.PictureInPictureParams;
import android.graphics.Rect;
import androidx.annotation.RequiresApi;
import com.engagelab.privates.common.constants.MTCommonConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/activity/Api26Impl;", "", "activity_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class Api26Impl {
    /* JADX INFO: renamed from: a */
    public static void m140a(Rect hint) {
        Intrinsics.m18599g(null, MTCommonConstants.Lifecycle.KEY_ACTIVITY);
        Intrinsics.m18599g(hint, "hint");
        new PictureInPictureParams.Builder().setSourceRectHint(hint).build();
        throw null;
    }
}
