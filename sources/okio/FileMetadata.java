package okio;

import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lokio/FileMetadata;", "", "okio"}, m18303k = 1, m18304mv = {1, 9, 0}, m18306xi = 48)
public final class FileMetadata {

    /* JADX INFO: renamed from: a */
    public final boolean f57854a;

    /* JADX INFO: renamed from: b */
    public final boolean f57855b;

    /* JADX INFO: renamed from: c */
    public final Path f57856c;

    /* JADX INFO: renamed from: d */
    public final Long f57857d;

    /* JADX INFO: renamed from: e */
    public final Long f57858e;

    /* JADX INFO: renamed from: f */
    public final Long f57859f;

    /* JADX INFO: renamed from: g */
    public final Long f57860g;

    /* JADX INFO: renamed from: h */
    public final Map f57861h;

    public FileMetadata(boolean z2, boolean z3, Path path, Long l, Long l2, Long l3, Long l4, Map extras) {
        Intrinsics.m18599g(extras, "extras");
        this.f57854a = z2;
        this.f57855b = z3;
        this.f57856c = path;
        this.f57857d = l;
        this.f57858e = l2;
        this.f57859f = l3;
        this.f57860g = l4;
        this.f57861h = MapsKt.m18490m(extras);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.f57854a) {
            arrayList.add("isRegularFile");
        }
        if (this.f57855b) {
            arrayList.add("isDirectory");
        }
        Long l = this.f57857d;
        if (l != null) {
            arrayList.add("byteCount=" + l);
        }
        Long l2 = this.f57858e;
        if (l2 != null) {
            arrayList.add("createdAt=" + l2);
        }
        Long l3 = this.f57859f;
        if (l3 != null) {
            arrayList.add("lastModifiedAt=" + l3);
        }
        Long l4 = this.f57860g;
        if (l4 != null) {
            arrayList.add("lastAccessedAt=" + l4);
        }
        Map map = this.f57861h;
        if (!map.isEmpty()) {
            arrayList.add("extras=" + map);
        }
        return CollectionsKt.m18409J(arrayList, ", ", "FileMetadata(", ")", null, 56);
    }

    public /* synthetic */ FileMetadata(boolean z2, boolean z3, Path path, Long l, Long l2, Long l3, Long l4) {
        this(z2, z3, path, l, l2, l3, l4, MapsKt.m18481d());
    }
}
