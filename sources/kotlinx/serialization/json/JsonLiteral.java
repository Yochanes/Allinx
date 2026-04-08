package kotlinx.serialization.json;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.internal.StringOpsKt;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Lkotlinx/serialization/json/JsonLiteral;", "Lkotlinx/serialization/json/JsonPrimitive;", "kotlinx-serialization-json"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public final class JsonLiteral extends JsonPrimitive {

    /* JADX INFO: renamed from: a */
    public final boolean f56836a;

    /* JADX INFO: renamed from: b */
    public final SerialDescriptor f56837b;

    /* JADX INFO: renamed from: c */
    public final String f56838c;

    public JsonLiteral(Serializable body, boolean z2, SerialDescriptor serialDescriptor) {
        Intrinsics.m18599g(body, "body");
        this.f56836a = z2;
        this.f56837b = serialDescriptor;
        this.f56838c = body.toString();
        if (serialDescriptor != null && !serialDescriptor.isInline()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getF56838c() {
        return this.f56838c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || JsonLiteral.class != obj.getClass()) {
            return false;
        }
        JsonLiteral jsonLiteral = (JsonLiteral) obj;
        return this.f56836a == jsonLiteral.f56836a && Intrinsics.m18594b(this.f56838c, jsonLiteral.f56838c);
    }

    public final int hashCode() {
        return this.f56838c.hashCode() + (Boolean.hashCode(this.f56836a) * 31);
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    public final String toString() {
        boolean z2 = this.f56836a;
        String str = this.f56838c;
        if (!z2) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        StringOpsKt.m21153a(str, sb);
        String string = sb.toString();
        Intrinsics.m18598f(string, "toString(...)");
        return string;
    }
}
