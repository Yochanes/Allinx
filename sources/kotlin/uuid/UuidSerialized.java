package kotlin.uuid;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m18302d2 = {"Lkotlin/uuid/UuidSerialized;", "Ljava/io/Externalizable;", "<init>", "()V", "Companion", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
@ExperimentalUuidApi
final class UuidSerialized implements Externalizable {

    /* JADX INFO: renamed from: a */
    public long f55234a = 0;

    /* JADX INFO: renamed from: b */
    public long f55235b = 0;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m18302d2 = {"Lkotlin/uuid/UuidSerialized$Companion;", "", "", "serialVersionUID", "J", "kotlin-stdlib"}, m18303k = 1, m18304mv = {2, 1, 0}, m18306xi = 48)
    public static final class Companion {
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput input) {
        Intrinsics.m18599g(input, "input");
        this.f55234a = input.readLong();
        this.f55235b = input.readLong();
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput output) throws IOException {
        Intrinsics.m18599g(output, "output");
        output.writeLong(this.f55234a);
        output.writeLong(this.f55235b);
    }
}
