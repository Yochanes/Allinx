package androidx.camera.video;

import android.util.Size;
import androidx.camera.core.internal.utils.SizeUtil;
import java.util.Comparator;
import java.util.HashMap;

/* JADX INFO: renamed from: androidx.camera.video.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0378a implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3378a;

    public /* synthetic */ C0378a(int i) {
        this.f3378a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        HashMap map = QualityRatioToResolutionsTable.f3311b;
        int iM1663a = SizeUtil.m1663a((Size) obj);
        int i = this.f3378a;
        return Math.abs(iM1663a - i) - Math.abs(SizeUtil.m1663a((Size) obj2) - i);
    }
}
