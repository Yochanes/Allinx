package androidx.navigation;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/navigation/NavDeepLinkRequest;", "", "Builder", "navigation-common_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public class NavDeepLinkRequest {

    /* JADX INFO: renamed from: a */
    public final Uri f30227a;

    /* JADX INFO: renamed from: b */
    public final String f30228b;

    /* JADX INFO: renamed from: c */
    public final String f30229c;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Landroidx/navigation/NavDeepLinkRequest$Builder;", "", "Companion", "navigation-common_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static final class Builder {

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/navigation/NavDeepLinkRequest$Builder$Companion;", "", "navigation-common_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
        public static final class Companion {
        }
    }

    public NavDeepLinkRequest(String str, String str2, Uri uri) {
        this.f30227a = uri;
        this.f30228b = str;
        this.f30229c = str2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavDeepLinkRequest{");
        Uri uri = this.f30227a;
        if (uri != null) {
            sb.append(" uri=");
            sb.append(String.valueOf(uri));
        }
        String str = this.f30228b;
        if (str != null) {
            sb.append(" action=");
            sb.append(str);
        }
        String str2 = this.f30229c;
        if (str2 != null) {
            sb.append(" mimetype=");
            sb.append(str2);
        }
        sb.append(" }");
        String string = sb.toString();
        Intrinsics.m18598f(string, "toString(...)");
        return string;
    }
}
