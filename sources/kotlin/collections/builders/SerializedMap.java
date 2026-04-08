package kotlin.collections.builders;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m18302d2 = {"Lkotlin/collections/builders/SerializedMap;", "Ljava/io/Externalizable;", "<init>", "()V", "Companion", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
final class SerializedMap implements Externalizable {

    /* JADX INFO: renamed from: a */
    public Object f51567a = MapsKt.m18481d();

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m18302d2 = {"Lkotlin/collections/builders/SerializedMap$Companion;", "", "", "serialVersionUID", "J", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final class Companion {
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput input) throws IOException {
        Intrinsics.m18599g(input, "input");
        byte b2 = input.readByte();
        if (b2 != 0) {
            throw new InvalidObjectException(AbstractC0000a.m9f(b2, "Unsupported flags value: "));
        }
        int i = input.readInt();
        if (i < 0) {
            throw new InvalidObjectException("Illegal size value: " + i + '.');
        }
        MapBuilder mapBuilder = new MapBuilder(i);
        for (int i2 = 0; i2 < i; i2++) {
            mapBuilder.put(input.readObject(), input.readObject());
        }
        this.f51567a = mapBuilder.m18531e();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.Map] */
    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput output) throws IOException {
        Intrinsics.m18599g(output, "output");
        output.writeByte(0);
        output.writeInt(this.f51567a.size());
        for (Map.Entry entry : this.f51567a.entrySet()) {
            output.writeObject(entry.getKey());
            output.writeObject(entry.getValue());
        }
    }
}
