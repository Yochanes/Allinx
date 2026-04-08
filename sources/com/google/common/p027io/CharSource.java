package com.google.common.p027io;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Ascii;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.base.Splitter;
import com.google.common.collect.AbstractIterator;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@ElementTypesAreNonnullByDefault
@J2ktIncompatible
@GwtIncompatible
public abstract class CharSource {

    /* JADX INFO: compiled from: Proguard */
    public final class AsByteSource extends ByteSource {
        final Charset charset;

        public AsByteSource(Charset charset) {
            this.charset = (Charset) Preconditions.checkNotNull(charset);
        }

        @Override // com.google.common.p027io.ByteSource
        public CharSource asCharSource(Charset charset) {
            return charset.equals(this.charset) ? CharSource.this : super.asCharSource(charset);
        }

        @Override // com.google.common.p027io.ByteSource
        public InputStream openStream() {
            return new ReaderInputStream(CharSource.this.openStream(), this.charset, UserMetadata.MAX_INTERNAL_KEY_SIZE);
        }

        public String toString() {
            return CharSource.this.toString() + ".asByteSource(" + this.charset + ")";
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class CharSequenceCharSource extends CharSource {
        private static final Splitter LINE_SPLITTER = Splitter.onPattern("\r\n|\n|\r");
        protected final CharSequence seq;

        /* JADX INFO: renamed from: com.google.common.io.CharSource$CharSequenceCharSource$1 */
        /* JADX INFO: compiled from: Proguard */
        public class C44531 extends AbstractIterator<String> {
            Iterator<String> lines;

            public C44531() {
                this.lines = CharSequenceCharSource.access$100().split(CharSequenceCharSource.this.seq).iterator();
            }

            @Override // com.google.common.collect.AbstractIterator
            @CheckForNull
            public /* bridge */ /* synthetic */ String computeNext() {
                return computeNext2();
            }

            @Override // com.google.common.collect.AbstractIterator
            @CheckForNull
            /* JADX INFO: renamed from: computeNext, reason: avoid collision after fix types in other method */
            public String computeNext2() {
                if (this.lines.hasNext()) {
                    String next = this.lines.next();
                    if (this.lines.hasNext() || !next.isEmpty()) {
                        return next;
                    }
                }
                return endOfData();
            }
        }

        public CharSequenceCharSource(CharSequence charSequence) {
            this.seq = (CharSequence) Preconditions.checkNotNull(charSequence);
        }

        public static /* synthetic */ Splitter access$100() {
            return LINE_SPLITTER;
        }

        private Iterator<String> linesIterator() {
            return new C44531();
        }

        @Override // com.google.common.p027io.CharSource
        public boolean isEmpty() {
            return this.seq.length() == 0;
        }

        @Override // com.google.common.p027io.CharSource
        public long length() {
            return this.seq.length();
        }

        @Override // com.google.common.p027io.CharSource
        public Optional<Long> lengthIfKnown() {
            return Optional.m14762of(Long.valueOf(this.seq.length()));
        }

        @Override // com.google.common.p027io.CharSource
        public Reader openStream() {
            return new CharSequenceReader(this.seq);
        }

        @Override // com.google.common.p027io.CharSource
        public String read() {
            return this.seq.toString();
        }

        @Override // com.google.common.p027io.CharSource
        @CheckForNull
        public String readFirstLine() {
            Iterator<String> itLinesIterator = linesIterator();
            if (itLinesIterator.hasNext()) {
                return itLinesIterator.next();
            }
            return null;
        }

        @Override // com.google.common.p027io.CharSource
        public ImmutableList<String> readLines() {
            return ImmutableList.copyOf(linesIterator());
        }

        public String toString() {
            return "CharSource.wrap(" + Ascii.truncate(this.seq, 30, "...") + ")";
        }

        @Override // com.google.common.p027io.CharSource
        @ParametricNullness
        public <T> T readLines(LineProcessor<T> lineProcessor) {
            Iterator<String> itLinesIterator = linesIterator();
            while (itLinesIterator.hasNext() && lineProcessor.processLine(itLinesIterator.next())) {
            }
            return lineProcessor.getResult();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class ConcatenatedCharSource extends CharSource {
        private final Iterable<? extends CharSource> sources;

        public ConcatenatedCharSource(Iterable<? extends CharSource> iterable) {
            this.sources = (Iterable) Preconditions.checkNotNull(iterable);
        }

        @Override // com.google.common.p027io.CharSource
        public boolean isEmpty() {
            Iterator<? extends CharSource> it = this.sources.iterator();
            while (it.hasNext()) {
                if (!it.next().isEmpty()) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.common.p027io.CharSource
        public long length() {
            Iterator<? extends CharSource> it = this.sources.iterator();
            long length = 0;
            while (it.hasNext()) {
                length += it.next().length();
            }
            return length;
        }

        @Override // com.google.common.p027io.CharSource
        public Optional<Long> lengthIfKnown() {
            Iterator<? extends CharSource> it = this.sources.iterator();
            long jLongValue = 0;
            while (it.hasNext()) {
                Optional<Long> optionalLengthIfKnown = it.next().lengthIfKnown();
                if (!optionalLengthIfKnown.isPresent()) {
                    return Optional.absent();
                }
                jLongValue += optionalLengthIfKnown.get().longValue();
            }
            return Optional.m14762of(Long.valueOf(jLongValue));
        }

        @Override // com.google.common.p027io.CharSource
        public Reader openStream() {
            return new MultiReader(this.sources.iterator());
        }

        public String toString() {
            return "CharSource.concat(" + this.sources + ")";
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class EmptyCharSource extends StringCharSource {
        private static final EmptyCharSource INSTANCE = new EmptyCharSource();

        private EmptyCharSource() {
            super("");
        }

        public static /* synthetic */ EmptyCharSource access$000() {
            return INSTANCE;
        }

        @Override // com.google.common.io.CharSource.CharSequenceCharSource
        public String toString() {
            return "CharSource.empty()";
        }
    }

    public static CharSource concat(Iterable<? extends CharSource> iterable) {
        return new ConcatenatedCharSource(iterable);
    }

    private long countBySkipping(Reader reader) throws IOException {
        long j = 0;
        while (true) {
            long jSkip = reader.skip(Long.MAX_VALUE);
            if (jSkip == 0) {
                return j;
            }
            j += jSkip;
        }
    }

    public static CharSource empty() {
        return EmptyCharSource.access$000();
    }

    public static CharSource wrap(CharSequence charSequence) {
        return charSequence instanceof String ? new StringCharSource((String) charSequence) : new CharSequenceCharSource(charSequence);
    }

    public ByteSource asByteSource(Charset charset) {
        return new AsByteSource(charset);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: X */
    @CanIgnoreReturnValue
    public long copyTo(Appendable appendable) throws X {
        Preconditions.checkNotNull(appendable);
        try {
            return CharStreams.copy((Reader) Closer.create().register(openStream()), appendable);
        } finally {
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: X */
    public boolean isEmpty() throws X {
        Optional<Long> optionalLengthIfKnown = lengthIfKnown();
        if (optionalLengthIfKnown.isPresent()) {
            return optionalLengthIfKnown.get().longValue() == 0;
        }
        try {
            return ((Reader) Closer.create().register(openStream())).read() == -1;
        } finally {
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: X */
    public long length() throws X {
        Optional<Long> optionalLengthIfKnown = lengthIfKnown();
        if (optionalLengthIfKnown.isPresent()) {
            return optionalLengthIfKnown.get().longValue();
        }
        try {
            return countBySkipping((Reader) Closer.create().register(openStream()));
        } finally {
        }
    }

    public Optional<Long> lengthIfKnown() {
        return Optional.absent();
    }

    public BufferedReader openBufferedStream() {
        Reader readerOpenStream = openStream();
        return readerOpenStream instanceof BufferedReader ? (BufferedReader) readerOpenStream : new BufferedReader(readerOpenStream);
    }

    public abstract Reader openStream();

    /* JADX INFO: Thrown type has an unknown type hierarchy: X */
    public String read() throws X {
        try {
            return CharStreams.toString((Reader) Closer.create().register(openStream()));
        } finally {
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: X */
    @CheckForNull
    public String readFirstLine() throws X {
        try {
            return ((BufferedReader) Closer.create().register(openBufferedStream())).readLine();
        } finally {
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: X */
    public ImmutableList<String> readLines() throws X {
        try {
            BufferedReader bufferedReader = (BufferedReader) Closer.create().register(openBufferedStream());
            ArrayList arrayListNewArrayList = Lists.newArrayList();
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    return ImmutableList.copyOf((Collection) arrayListNewArrayList);
                }
                arrayListNewArrayList.add(line);
            }
        } finally {
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class StringCharSource extends CharSequenceCharSource {
        public StringCharSource(String str) {
            super(str);
        }

        @Override // com.google.common.p027io.CharSource
        public long copyTo(Appendable appendable) throws IOException {
            appendable.append(this.seq);
            return this.seq.length();
        }

        @Override // com.google.common.io.CharSource.CharSequenceCharSource, com.google.common.p027io.CharSource
        public Reader openStream() {
            return new StringReader((String) this.seq);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: X */
        @Override // com.google.common.p027io.CharSource
        public long copyTo(CharSink charSink) throws X {
            Preconditions.checkNotNull(charSink);
            try {
                ((Writer) Closer.create().register(charSink.openStream())).write((String) this.seq);
                return this.seq.length();
            } finally {
            }
        }
    }

    public static CharSource concat(Iterator<? extends CharSource> it) {
        return concat(ImmutableList.copyOf(it));
    }

    public static CharSource concat(CharSource... charSourceArr) {
        return concat(ImmutableList.copyOf(charSourceArr));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: X */
    @CanIgnoreReturnValue
    public long copyTo(CharSink charSink) throws X {
        Preconditions.checkNotNull(charSink);
        Closer closerCreate = Closer.create();
        try {
            return CharStreams.copy((Reader) closerCreate.register(openStream()), (Writer) closerCreate.register(charSink.openStream()));
        } finally {
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: X */
    @CanIgnoreReturnValue
    @ParametricNullness
    public <T> T readLines(LineProcessor<T> lineProcessor) throws X {
        Preconditions.checkNotNull(lineProcessor);
        try {
            return (T) CharStreams.readLines((Reader) Closer.create().register(openStream()), lineProcessor);
        } finally {
        }
    }
}
