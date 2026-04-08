package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.ElementMarker;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlinx/serialization/json/internal/JsonElementMarker;", "", "kotlinx-serialization-json"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class JsonElementMarker {

    /* JADX INFO: renamed from: a */
    public final ElementMarker f56886a;

    /* JADX INFO: renamed from: b */
    public boolean f56887b;

    public JsonElementMarker(SerialDescriptor descriptor) {
        Intrinsics.m18599g(descriptor, "descriptor");
        this.f56886a = new ElementMarker(descriptor, new JsonElementMarker$origin$1(2, this, JsonElementMarker.class, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", 0));
    }
}
