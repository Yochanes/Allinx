package com.yariksoffice.lingver;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18300bv = {1, 0, 3}, m18301d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m18302d2 = {"<anonymous>", "", "it", "Landroid/app/Activity;", "invoke"}, m18303k = 3, m18304mv = {1, 1, 16})
final class Lingver$initialize$1 extends Lambda implements Function1<Activity, Unit> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Lingver f43491a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Lingver$initialize$1(Lingver lingver) {
        super(1);
        this.f43491a = lingver;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Activity it = (Activity) obj;
        Intrinsics.m18600h(it, "it");
        Locale locale = Lingver.f43487c;
        Locale locale2 = this.f43491a.f43490b.m15439a();
        Intrinsics.m18600h(locale2, "locale");
        UpdateLocaleDelegate.m15438a(it, locale2);
        Context appContext = it.getApplicationContext();
        if (appContext != it) {
            Intrinsics.m18595c(appContext, "appContext");
            UpdateLocaleDelegate.m15438a(appContext, locale2);
        }
        try {
            int i = it.getPackageManager().getActivityInfo(it.getComponentName(), UserMetadata.MAX_ROLLOUT_ASSIGNMENTS).labelRes;
            if (i != 0) {
                it.setTitle(i);
            }
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return Unit.f51459a;
    }
}
