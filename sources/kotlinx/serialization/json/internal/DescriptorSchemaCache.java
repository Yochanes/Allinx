package kotlinx.serialization.json.internal;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m18302d2 = {"Lkotlinx/serialization/json/internal/DescriptorSchemaCache;", "", "Key", "kotlinx-serialization-json"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public final class DescriptorSchemaCache {

    /* JADX INFO: renamed from: a */
    public final ConcurrentHashMap f56883a = new ConcurrentHashMap(16);

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Lkotlinx/serialization/json/internal/DescriptorSchemaCache$Key;", "", "T", "kotlinx-serialization-json"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
    public static final class Key<T> {
    }

    /* JADX INFO: renamed from: a */
    public final Object m21115a(SerialDescriptor descriptor, Key key) {
        Intrinsics.m18599g(descriptor, "descriptor");
        Map map = (Map) this.f56883a.get(descriptor);
        Object obj = map != null ? map.get(key) : null;
        if (obj == null) {
            return null;
        }
        return obj;
    }
}
