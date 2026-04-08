package coil.map;

import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import coil.request.Options;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Lcoil/map/ResourceUriMapper;", "Lcoil/map/Mapper;", "Landroid/net/Uri;", "coil-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public final class ResourceUriMapper implements Mapper<Uri, Uri> {
    @Override // coil.map.Mapper
    /* JADX INFO: renamed from: a */
    public final Object mo12474a(Object obj, Options options) throws PackageManager.NameNotFoundException {
        String authority;
        Uri uri = (Uri) obj;
        if (!Intrinsics.m18594b(uri.getScheme(), "android.resource") || (authority = uri.getAuthority()) == null || StringsKt.m20448x(authority) || uri.getPathSegments().size() != 2) {
            return null;
        }
        String authority2 = uri.getAuthority();
        if (authority2 == null) {
            authority2 = "";
        }
        Resources resourcesForApplication = options.f33896a.getPackageManager().getResourcesForApplication(authority2);
        List<String> pathSegments = uri.getPathSegments();
        int identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority2);
        if (identifier == 0) {
            throw new IllegalStateException(("Invalid android.resource URI: " + uri).toString());
        }
        return Uri.parse("android.resource://" + authority2 + '/' + identifier);
    }
}
