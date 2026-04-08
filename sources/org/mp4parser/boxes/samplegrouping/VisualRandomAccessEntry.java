package org.mp4parser.boxes.samplegrouping;

import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class VisualRandomAccessEntry extends GroupEntry {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (0 * 31) + 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VisualRandomAccessEntry{numLeadingSamplesKnown=");
        sb.append(false);
        sb.append(", numLeadingSamples=");
        return AbstractC0000a.m17n(sb, 0, '}');
    }
}
