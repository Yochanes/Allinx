package androidx.activity.result;

import androidx.activity.result.contract.ActivityResultContract;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Metadata;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m18302d2 = {"androidx/activity/result/ActivityResultRegistry$register$2", "Landroidx/activity/result/ActivityResultLauncher;", "activity_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class ActivityResultRegistry$register$2 extends ActivityResultLauncher<Object> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ActivityResultRegistry f224a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f225b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ActivityResultContract f226c;

    public ActivityResultRegistry$register$2(ActivityResultRegistry activityResultRegistry, String str, ActivityResultContract activityResultContract) {
        this.f224a = activityResultRegistry;
        this.f225b = str;
        this.f226c = activityResultContract;
    }

    @Override // androidx.activity.result.ActivityResultLauncher
    /* JADX INFO: renamed from: a */
    public final void mo180a(Object obj) throws Exception {
        ActivityResultRegistry activityResultRegistry = this.f224a;
        LinkedHashMap linkedHashMap = activityResultRegistry.f213b;
        String str = this.f225b;
        Object obj2 = linkedHashMap.get(str);
        ActivityResultContract activityResultContract = this.f226c;
        if (obj2 == null) {
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + activityResultContract + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }
        int iIntValue = ((Number) obj2).intValue();
        ArrayList arrayList = activityResultRegistry.f215d;
        arrayList.add(str);
        try {
            activityResultRegistry.mo152c(iIntValue, activityResultContract, obj);
        } catch (Exception e) {
            arrayList.remove(str);
            throw e;
        }
    }
}
