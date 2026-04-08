package coil.map;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import coil.request.Options;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, m18302d2 = {"Lcoil/map/ResourceIntMapper;", "Lcoil/map/Mapper;", "", "Landroid/net/Uri;", "coil-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public final class ResourceIntMapper implements Mapper<Integer, Uri> {
    @Override // coil.map.Mapper
    /* JADX INFO: renamed from: a */
    public final Object mo12474a(Object obj, Options options) {
        Context context = options.f33896a;
        int iIntValue = ((Number) obj).intValue();
        try {
            if (context.getResources().getResourceEntryName(iIntValue) == null) {
                return null;
            }
            return Uri.parse("android.resource://" + context.getPackageName() + '/' + iIntValue);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }
}
