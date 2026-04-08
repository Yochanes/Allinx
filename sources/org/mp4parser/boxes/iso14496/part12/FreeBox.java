package org.mp4parser.boxes.iso14496.part12;

import java.nio.channels.WritableByteChannel;
import org.mp4parser.ParsableBox;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class FreeBox implements ParsableBox {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return true;
    }

    @Override // org.mp4parser.Box
    public final void getBox(WritableByteChannel writableByteChannel) {
        throw null;
    }

    @Override // org.mp4parser.Box
    public final long getSize() {
        throw null;
    }

    public final int hashCode() {
        return 0;
    }
}
