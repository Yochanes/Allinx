package org.mp4parser;

import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class BasicContainer implements Container {

    /* JADX INFO: renamed from: a */
    public ArrayList f58259a;

    /* JADX INFO: renamed from: a */
    public final void m21816a(Box box) {
        if (box != null) {
            ArrayList arrayList = new ArrayList(this.f58259a);
            this.f58259a = arrayList;
            arrayList.add(box);
        }
    }

    /* JADX INFO: renamed from: b */
    public final long m21817b() {
        long size = 0;
        for (int i = 0; i < this.f58259a.size(); i++) {
            size += ((Box) this.f58259a.get(i)).getSize();
        }
        return size;
    }

    /* JADX INFO: renamed from: d */
    public final void m21818d(WritableByteChannel writableByteChannel) {
        Iterator it = this.f58259a.iterator();
        while (it.hasNext()) {
            ((Box) it.next()).getBox(writableByteChannel);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[");
        for (int i = 0; i < this.f58259a.size(); i++) {
            if (i > 0) {
                sb.append(";");
            }
            sb.append(this.f58259a.get(i));
        }
        sb.append("]");
        return sb.toString();
    }
}
