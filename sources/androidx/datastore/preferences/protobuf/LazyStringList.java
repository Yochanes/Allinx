package androidx.datastore.preferences.protobuf;

import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public interface LazyStringList extends ProtocolStringList {
    Object getRaw(int i);

    List getUnderlyingElements();

    LazyStringList getUnmodifiableView();

    /* JADX INFO: renamed from: u */
    void mo8527u(ByteString byteString);
}
