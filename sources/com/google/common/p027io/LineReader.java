package com.google.common.p027io;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;
import java.util.ArrayDeque;
import java.util.Queue;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@ElementTypesAreNonnullByDefault
@J2ktIncompatible
@GwtIncompatible
public final class LineReader {
    private final char[] buf;
    private final CharBuffer cbuf;
    private final LineBuffer lineBuf;
    private final Queue<String> lines;
    private final Readable readable;

    @CheckForNull
    private final Reader reader;

    /* JADX INFO: renamed from: com.google.common.io.LineReader$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C44601 extends LineBuffer {
        public C44601() {
        }

        @Override // com.google.common.p027io.LineBuffer
        public void handleLine(String str, String str2) {
            LineReader.access$000(LineReader.this).add(str);
        }
    }

    public LineReader(Readable readable) {
        CharBuffer charBufferCreateBuffer = CharStreams.createBuffer();
        this.cbuf = charBufferCreateBuffer;
        this.buf = charBufferCreateBuffer.array();
        this.lines = new ArrayDeque();
        this.lineBuf = new C44601();
        this.readable = (Readable) Preconditions.checkNotNull(readable);
        this.reader = readable instanceof Reader ? (Reader) readable : null;
    }

    public static /* synthetic */ Queue access$000(LineReader lineReader) {
        return lineReader.lines;
    }

    @CanIgnoreReturnValue
    @CheckForNull
    public String readLine() throws IOException {
        int i;
        while (true) {
            if (this.lines.peek() != null) {
                break;
            }
            Java8Compatibility.clear(this.cbuf);
            Reader reader = this.reader;
            if (reader != null) {
                char[] cArr = this.buf;
                i = reader.read(cArr, 0, cArr.length);
            } else {
                i = this.readable.read(this.cbuf);
            }
            if (i == -1) {
                this.lineBuf.finish();
                break;
            }
            this.lineBuf.add(this.buf, 0, i);
        }
        return this.lines.poll();
    }
}
