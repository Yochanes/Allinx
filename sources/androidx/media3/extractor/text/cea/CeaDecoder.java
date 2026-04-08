package androidx.media3.extractor.text.cea;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.text.Subtitle;
import androidx.media3.extractor.text.SubtitleDecoder;
import androidx.media3.extractor.text.SubtitleInputBuffer;
import androidx.media3.extractor.text.SubtitleOutputBuffer;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
abstract class CeaDecoder implements SubtitleDecoder {

    /* JADX INFO: renamed from: a */
    public final ArrayDeque f29107a = new ArrayDeque();

    /* JADX INFO: renamed from: b */
    public final ArrayDeque f29108b;

    /* JADX INFO: renamed from: c */
    public final ArrayDeque f29109c;

    /* JADX INFO: renamed from: d */
    public CeaInputBuffer f29110d;

    /* JADX INFO: renamed from: e */
    public long f29111e;

    /* JADX INFO: renamed from: f */
    public long f29112f;

    /* JADX INFO: renamed from: g */
    public long f29113g;

    /* JADX INFO: compiled from: Proguard */
    public static final class CeaInputBuffer extends SubtitleInputBuffer implements Comparable<CeaInputBuffer> {

        /* JADX INFO: renamed from: o */
        public long f29114o;

        @Override // java.lang.Comparable
        public final int compareTo(CeaInputBuffer ceaInputBuffer) {
            CeaInputBuffer ceaInputBuffer2 = ceaInputBuffer;
            if (m9735f(4) != ceaInputBuffer2.m9735f(4)) {
                return m9735f(4) ? 1 : -1;
            }
            long j = this.f25938g - ceaInputBuffer2.f25938g;
            if (j == 0) {
                j = this.f29114o - ceaInputBuffer2.f29114o;
                if (j == 0) {
                    return 0;
                }
            }
            return j > 0 ? 1 : -1;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class CeaOutputBuffer extends SubtitleOutputBuffer {

        /* JADX INFO: renamed from: i */
        public C1972b f29115i;

        @Override // androidx.media3.decoder.DecoderOutputBuffer
        /* JADX INFO: renamed from: i */
        public final void mo9746i() {
            C1972b c1972b = this.f29115i;
            c1972b.getClass();
            CeaDecoder ceaDecoder = c1972b.f29117a;
            ceaDecoder.getClass();
            mo9745h();
            ceaDecoder.f29108b.add(this);
        }
    }

    public CeaDecoder() {
        for (int i = 0; i < 10; i++) {
            this.f29107a.add(new CeaInputBuffer(1));
        }
        this.f29108b = new ArrayDeque();
        for (int i2 = 0; i2 < 2; i2++) {
            ArrayDeque arrayDeque = this.f29108b;
            C1972b c1972b = new C1972b(this);
            CeaOutputBuffer ceaOutputBuffer = new CeaOutputBuffer();
            ceaOutputBuffer.f29115i = c1972b;
            arrayDeque.add(ceaOutputBuffer);
        }
        this.f29109c = new ArrayDeque();
        this.f29113g = -9223372036854775807L;
    }

    @Override // androidx.media3.decoder.Decoder
    /* JADX INFO: renamed from: a */
    public /* bridge */ /* synthetic */ Object mo9737a() {
        return mo10965i();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    @Override // androidx.media3.decoder.Decoder
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo9738b(Object obj) {
        SubtitleInputBuffer subtitleInputBuffer = (SubtitleInputBuffer) obj;
        Assertions.m9460a(subtitleInputBuffer == this.f29110d);
        CeaInputBuffer ceaInputBuffer = (CeaInputBuffer) subtitleInputBuffer;
        if (!ceaInputBuffer.m9735f(4)) {
            long j = ceaInputBuffer.f25938g;
            if (j != Long.MIN_VALUE) {
                long j2 = this.f29113g;
                if (j2 == -9223372036854775807L || j >= j2) {
                    long j3 = this.f29112f;
                    this.f29112f = 1 + j3;
                    ceaInputBuffer.f29114o = j3;
                    this.f29109c.add(ceaInputBuffer);
                } else {
                    ceaInputBuffer.mo9741h();
                    this.f29107a.add(ceaInputBuffer);
                }
            }
        }
        this.f29110d = null;
    }

    @Override // androidx.media3.decoder.Decoder
    /* JADX INFO: renamed from: c */
    public final void mo9739c(long j) {
        this.f29113g = j;
    }

    @Override // androidx.media3.extractor.text.SubtitleDecoder
    /* JADX INFO: renamed from: d */
    public void mo10958d(long j) {
        this.f29111e = j;
    }

    @Override // androidx.media3.decoder.Decoder
    /* JADX INFO: renamed from: e */
    public final Object mo9740e() {
        Assertions.m9464e(this.f29110d == null);
        ArrayDeque arrayDeque = this.f29107a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        CeaInputBuffer ceaInputBuffer = (CeaInputBuffer) arrayDeque.pollFirst();
        this.f29110d = ceaInputBuffer;
        return ceaInputBuffer;
    }

    @Override // androidx.media3.decoder.Decoder
    public void flush() {
        ArrayDeque arrayDeque;
        this.f29112f = 0L;
        this.f29111e = 0L;
        while (true) {
            ArrayDeque arrayDeque2 = this.f29109c;
            boolean zIsEmpty = arrayDeque2.isEmpty();
            arrayDeque = this.f29107a;
            if (zIsEmpty) {
                break;
            }
            CeaInputBuffer ceaInputBuffer = (CeaInputBuffer) arrayDeque2.poll();
            int i = Util.f25665a;
            ceaInputBuffer.mo9741h();
            arrayDeque.add(ceaInputBuffer);
        }
        CeaInputBuffer ceaInputBuffer2 = this.f29110d;
        if (ceaInputBuffer2 != null) {
            ceaInputBuffer2.mo9741h();
            arrayDeque.add(ceaInputBuffer2);
            this.f29110d = null;
        }
    }

    /* JADX INFO: renamed from: g */
    public abstract Subtitle mo10963g();

    /* JADX INFO: renamed from: h */
    public abstract void mo10964h(SubtitleInputBuffer subtitleInputBuffer);

    /* JADX INFO: renamed from: i */
    public SubtitleOutputBuffer mo10965i() {
        ArrayDeque arrayDeque = this.f29108b;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        while (true) {
            ArrayDeque arrayDeque2 = this.f29109c;
            if (arrayDeque2.isEmpty()) {
                return null;
            }
            CeaInputBuffer ceaInputBuffer = (CeaInputBuffer) arrayDeque2.peek();
            int i = Util.f25665a;
            if (ceaInputBuffer.f25938g > this.f29111e) {
                return null;
            }
            CeaInputBuffer ceaInputBuffer2 = (CeaInputBuffer) arrayDeque2.poll();
            boolean zM9735f = ceaInputBuffer2.m9735f(4);
            ArrayDeque arrayDeque3 = this.f29107a;
            if (zM9735f) {
                SubtitleOutputBuffer subtitleOutputBuffer = (SubtitleOutputBuffer) arrayDeque.pollFirst();
                subtitleOutputBuffer.m9734e(4);
                ceaInputBuffer2.mo9741h();
                arrayDeque3.add(ceaInputBuffer2);
                return subtitleOutputBuffer;
            }
            mo10964h(ceaInputBuffer2);
            if (mo10966j()) {
                Subtitle subtitleMo10963g = mo10963g();
                SubtitleOutputBuffer subtitleOutputBuffer2 = (SubtitleOutputBuffer) arrayDeque.pollFirst();
                long j = ceaInputBuffer2.f25938g;
                subtitleOutputBuffer2.f25941b = j;
                subtitleOutputBuffer2.f28997f = subtitleMo10963g;
                subtitleOutputBuffer2.f28998g = j;
                ceaInputBuffer2.mo9741h();
                arrayDeque3.add(ceaInputBuffer2);
                return subtitleOutputBuffer2;
            }
            ceaInputBuffer2.mo9741h();
            arrayDeque3.add(ceaInputBuffer2);
        }
    }

    /* JADX INFO: renamed from: j */
    public abstract boolean mo10966j();

    @Override // androidx.media3.decoder.Decoder
    public void release() {
    }
}
