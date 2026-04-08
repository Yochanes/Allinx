package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public interface LazyStringList extends ProtocolStringList {
    /* JADX INFO: renamed from: L */
    void mo19712L(ByteString byteString);

    ByteString getByteString(int i);

    List getUnderlyingElements();

    UnmodifiableLazyStringList getUnmodifiableView();
}
