package androidx.media3.container;

import androidx.annotation.RestrictTo;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.PriorityQueue;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo
@UnstableApi
public final class ReorderingSeiMessageQueue {

    /* JADX INFO: renamed from: a */
    public final SeiConsumer f25779a;

    /* JADX INFO: renamed from: b */
    public final ArrayDeque f25780b = new ArrayDeque();

    /* JADX INFO: renamed from: c */
    public final ArrayDeque f25781c = new ArrayDeque();

    /* JADX INFO: renamed from: d */
    public final PriorityQueue f25782d = new PriorityQueue();

    /* JADX INFO: renamed from: e */
    public int f25783e = -1;

    /* JADX INFO: renamed from: f */
    public SampleSeiMessages f25784f;

    /* JADX INFO: compiled from: Proguard */
    public static final class SampleSeiMessages implements Comparable<SampleSeiMessages> {

        /* JADX INFO: renamed from: b */
        public long f25786b = -9223372036854775807L;

        /* JADX INFO: renamed from: a */
        public final ArrayList f25785a = new ArrayList();

        @Override // java.lang.Comparable
        public final int compareTo(SampleSeiMessages sampleSeiMessages) {
            return Long.compare(this.f25786b, sampleSeiMessages.f25786b);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface SeiConsumer {
        /* JADX INFO: renamed from: b */
        void mo186b(long j, ParsableByteArray parsableByteArray);
    }

    public ReorderingSeiMessageQueue(SeiConsumer seiConsumer) {
        this.f25779a = seiConsumer;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        if (r8 < r0.f25786b) goto L32;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m9667a(long j, ParsableByteArray parsableByteArray) {
        int i = this.f25783e;
        if (i != 0) {
            PriorityQueue priorityQueue = this.f25782d;
            if (i != -1 && priorityQueue.size() >= this.f25783e) {
                SampleSeiMessages sampleSeiMessages = (SampleSeiMessages) priorityQueue.peek();
                int i2 = Util.f25665a;
            }
            ArrayDeque arrayDeque = this.f25780b;
            ParsableByteArray parsableByteArray2 = arrayDeque.isEmpty() ? new ParsableByteArray() : (ParsableByteArray) arrayDeque.pop();
            parsableByteArray2.m9543D(parsableByteArray.m9548a());
            System.arraycopy(parsableByteArray.f25644a, parsableByteArray.f25645b, parsableByteArray2.f25644a, 0, parsableByteArray2.m9548a());
            SampleSeiMessages sampleSeiMessages2 = this.f25784f;
            if (sampleSeiMessages2 != null && j == sampleSeiMessages2.f25786b) {
                sampleSeiMessages2.f25785a.add(parsableByteArray2);
                return;
            }
            ArrayDeque arrayDeque2 = this.f25781c;
            SampleSeiMessages sampleSeiMessages3 = arrayDeque2.isEmpty() ? new SampleSeiMessages() : (SampleSeiMessages) arrayDeque2.pop();
            sampleSeiMessages3.getClass();
            Assertions.m9460a(j != -9223372036854775807L);
            ArrayList arrayList = sampleSeiMessages3.f25785a;
            Assertions.m9464e(arrayList.isEmpty());
            sampleSeiMessages3.f25786b = j;
            arrayList.add(parsableByteArray2);
            priorityQueue.add(sampleSeiMessages3);
            this.f25784f = sampleSeiMessages3;
            int i3 = this.f25783e;
            if (i3 != -1) {
                m9668b(i3);
                return;
            }
            return;
        }
        this.f25779a.mo186b(j, parsableByteArray);
    }

    /* JADX INFO: renamed from: b */
    public final void m9668b(int i) {
        ArrayList arrayList;
        while (true) {
            PriorityQueue priorityQueue = this.f25782d;
            if (priorityQueue.size() <= i) {
                return;
            }
            SampleSeiMessages sampleSeiMessages = (SampleSeiMessages) priorityQueue.poll();
            int i2 = Util.f25665a;
            int i3 = 0;
            while (true) {
                int size = sampleSeiMessages.f25785a.size();
                arrayList = sampleSeiMessages.f25785a;
                if (i3 >= size) {
                    break;
                }
                this.f25779a.mo186b(sampleSeiMessages.f25786b, (ParsableByteArray) arrayList.get(i3));
                this.f25780b.push((ParsableByteArray) arrayList.get(i3));
                i3++;
            }
            arrayList.clear();
            SampleSeiMessages sampleSeiMessages2 = this.f25784f;
            if (sampleSeiMessages2 != null && sampleSeiMessages2.f25786b == sampleSeiMessages.f25786b) {
                this.f25784f = null;
            }
            this.f25781c.push(sampleSeiMessages);
        }
    }
}
