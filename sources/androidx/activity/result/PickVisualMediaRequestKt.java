package androidx.activity.result;

import androidx.activity.result.PickVisualMediaRequest;
import androidx.activity.result.contract.ActivityResultContracts;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p011a.AbstractC0024a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m18302d2 = {"activity_release"}, m18303k = 2, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class PickVisualMediaRequestKt {
    /* JADX INFO: renamed from: a */
    public static PickVisualMediaRequest m229a() {
        ActivityResultContracts.PickVisualMedia.ImageOnly imageOnly = ActivityResultContracts.PickVisualMedia.ImageOnly.f250a;
        ActivityResultContracts.PickVisualMedia.ImageAndVideo imageAndVideo = ActivityResultContracts.PickVisualMedia.ImageAndVideo.f249a;
        int iM79a = ActivityResultContracts.PickVisualMedia.Companion.m233c() ? AbstractC0024a.m79a() : Integer.MAX_VALUE;
        ActivityResultContracts.PickVisualMedia.DefaultTab.PhotosTab photosTab = ActivityResultContracts.PickVisualMedia.DefaultTab.PhotosTab.f248a;
        PickVisualMediaRequest.Builder builder = new PickVisualMediaRequest.Builder();
        builder.f240a = imageAndVideo;
        if (ActivityResultContracts.PickVisualMedia.Companion.m233c()) {
            AbstractC0024a.m79a();
        }
        builder.f240a = imageOnly;
        builder.f241b = iM79a;
        builder.f242c = photosTab;
        PickVisualMediaRequest pickVisualMediaRequest = new PickVisualMediaRequest();
        pickVisualMediaRequest.f237a = imageAndVideo;
        pickVisualMediaRequest.f238b = ActivityResultContracts.PickVisualMedia.Companion.m233c() ? AbstractC0024a.m79a() : Integer.MAX_VALUE;
        pickVisualMediaRequest.f239c = photosTab;
        ActivityResultContracts.PickVisualMedia.VisualMediaType visualMediaType = builder.f240a;
        Intrinsics.m18599g(visualMediaType, "<set-?>");
        pickVisualMediaRequest.f237a = visualMediaType;
        pickVisualMediaRequest.f238b = builder.f241b;
        ActivityResultContracts.PickVisualMedia.DefaultTab defaultTab = builder.f242c;
        Intrinsics.m18599g(defaultTab, "<set-?>");
        pickVisualMediaRequest.f239c = defaultTab;
        return pickVisualMediaRequest;
    }
}
