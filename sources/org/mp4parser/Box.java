package org.mp4parser;

import java.nio.channels.WritableByteChannel;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public interface Box {
    void getBox(WritableByteChannel writableByteChannel);

    long getSize();
}
