package com.google.common.base;

import com.engagelab.privates.common.BuildConfig;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible(emulated = BuildConfig.IS_FOR_ENGAGELAB)
@ElementTypesAreNonnullByDefault
public final class Splitter {
    private final int limit;
    private final boolean omitEmptyStrings;
    private final Strategy strategy;
    private final CharMatcher trimmer;

    /* JADX INFO: renamed from: com.google.common.base.Splitter$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C41181 implements Strategy {
        final /* synthetic */ CharMatcher val$separatorMatcher;

        /* JADX INFO: renamed from: com.google.common.base.Splitter$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: Proguard */
        public class AnonymousClass1 extends SplittingIterator {
            public AnonymousClass1(Splitter splitter, CharSequence charSequence) {
                super(splitter, charSequence);
            }

            @Override // com.google.common.base.Splitter.SplittingIterator
            public int separatorEnd(int i) {
                return i + 1;
            }

            @Override // com.google.common.base.Splitter.SplittingIterator
            public int separatorStart(int i) {
                return C41181.this.val$separatorMatcher.indexIn(this.toSplit, i);
            }
        }

        public C41181(CharMatcher charMatcher) {
            this.val$separatorMatcher = charMatcher;
        }

        @Override // com.google.common.base.Splitter.Strategy
        public /* bridge */ /* synthetic */ Iterator iterator(Splitter splitter, CharSequence charSequence) {
            return iterator(splitter, charSequence);
        }

        @Override // com.google.common.base.Splitter.Strategy
        public SplittingIterator iterator(Splitter splitter, CharSequence charSequence) {
            return new AnonymousClass1(splitter, charSequence);
        }
    }

    /* JADX INFO: renamed from: com.google.common.base.Splitter$2 */
    /* JADX INFO: compiled from: Proguard */
    public class C41192 implements Strategy {
        final /* synthetic */ String val$separator;

        /* JADX INFO: renamed from: com.google.common.base.Splitter$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: Proguard */
        public class AnonymousClass1 extends SplittingIterator {
            public AnonymousClass1(Splitter splitter, CharSequence charSequence) {
                super(splitter, charSequence);
            }

            @Override // com.google.common.base.Splitter.SplittingIterator
            public int separatorEnd(int i) {
                return C41192.this.val$separator.length() + i;
            }

            /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
            
                r6 = r6 + 1;
             */
            @Override // com.google.common.base.Splitter.SplittingIterator
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public int separatorStart(int i) {
                int length = C41192.this.val$separator.length();
                int length2 = this.toSplit.length() - length;
                while (i <= length2) {
                    for (int i2 = 0; i2 < length; i2++) {
                        if (this.toSplit.charAt(i2 + i) != C41192.this.val$separator.charAt(i2)) {
                            break;
                        }
                    }
                    return i;
                }
                return -1;
            }
        }

        public C41192(String str) {
            this.val$separator = str;
        }

        @Override // com.google.common.base.Splitter.Strategy
        public /* bridge */ /* synthetic */ Iterator iterator(Splitter splitter, CharSequence charSequence) {
            return iterator(splitter, charSequence);
        }

        @Override // com.google.common.base.Splitter.Strategy
        public SplittingIterator iterator(Splitter splitter, CharSequence charSequence) {
            return new AnonymousClass1(splitter, charSequence);
        }
    }

    /* JADX INFO: renamed from: com.google.common.base.Splitter$3 */
    /* JADX INFO: compiled from: Proguard */
    public class C41203 implements Strategy {
        final /* synthetic */ CommonPattern val$separatorPattern;

        /* JADX INFO: renamed from: com.google.common.base.Splitter$3$1, reason: invalid class name */
        /* JADX INFO: compiled from: Proguard */
        public class AnonymousClass1 extends SplittingIterator {
            final /* synthetic */ C41203 this$0;
            final /* synthetic */ CommonMatcher val$matcher;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(C41203 c41203, Splitter splitter, CharSequence charSequence, CommonMatcher commonMatcher) {
                super(splitter, charSequence);
                this.val$matcher = commonMatcher;
                this.this$0 = c41203;
            }

            @Override // com.google.common.base.Splitter.SplittingIterator
            public int separatorEnd(int i) {
                return this.val$matcher.end();
            }

            @Override // com.google.common.base.Splitter.SplittingIterator
            public int separatorStart(int i) {
                if (this.val$matcher.find(i)) {
                    return this.val$matcher.start();
                }
                return -1;
            }
        }

        public C41203(CommonPattern commonPattern) {
            this.val$separatorPattern = commonPattern;
        }

        @Override // com.google.common.base.Splitter.Strategy
        public /* bridge */ /* synthetic */ Iterator iterator(Splitter splitter, CharSequence charSequence) {
            return iterator(splitter, charSequence);
        }

        @Override // com.google.common.base.Splitter.Strategy
        public SplittingIterator iterator(Splitter splitter, CharSequence charSequence) {
            return new AnonymousClass1(this, splitter, charSequence, this.val$separatorPattern.matcher(charSequence));
        }
    }

    /* JADX INFO: renamed from: com.google.common.base.Splitter$4 */
    /* JADX INFO: compiled from: Proguard */
    public class C41214 implements Strategy {
        final /* synthetic */ int val$length;

        public C41214(int i) {
            this.val$length = i;
        }

        @Override // com.google.common.base.Splitter.Strategy
        public /* bridge */ /* synthetic */ Iterator iterator(Splitter splitter, CharSequence charSequence) {
            return iterator(splitter, charSequence);
        }

        @Override // com.google.common.base.Splitter.Strategy
        public SplittingIterator iterator(Splitter splitter, CharSequence charSequence) {
            return new AnonymousClass1(splitter, charSequence);
        }

        /* JADX INFO: renamed from: com.google.common.base.Splitter$4$1, reason: invalid class name */
        /* JADX INFO: compiled from: Proguard */
        public class AnonymousClass1 extends SplittingIterator {
            public AnonymousClass1(Splitter splitter, CharSequence charSequence) {
                super(splitter, charSequence);
            }

            @Override // com.google.common.base.Splitter.SplittingIterator
            public int separatorStart(int i) {
                int i2 = i + C41214.this.val$length;
                if (i2 < this.toSplit.length()) {
                    return i2;
                }
                return -1;
            }

            @Override // com.google.common.base.Splitter.SplittingIterator
            public int separatorEnd(int i) {
                return i;
            }
        }
    }

    /* JADX INFO: renamed from: com.google.common.base.Splitter$5 */
    /* JADX INFO: compiled from: Proguard */
    public class C41225 implements Iterable<String> {
        final /* synthetic */ Splitter this$0;
        final /* synthetic */ CharSequence val$sequence;

        public C41225(Splitter splitter, CharSequence charSequence) {
            this.val$sequence = charSequence;
            this.this$0 = splitter;
        }

        @Override // java.lang.Iterable
        public Iterator<String> iterator() {
            return Splitter.access$000(this.this$0, this.val$sequence);
        }

        public String toString() {
            Joiner joinerM14761on = Joiner.m14761on(", ");
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            StringBuilder sbAppendTo = joinerM14761on.appendTo(sb, (Iterable<? extends Object>) this);
            sbAppendTo.append(']');
            return sbAppendTo.toString();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class MapSplitter {
        private static final String INVALID_ENTRY_MESSAGE = "Chunk [%s] is not a valid entry";
        private final Splitter entrySplitter;
        private final Splitter outerSplitter;

        public /* synthetic */ MapSplitter(Splitter splitter, Splitter splitter2, C41181 c41181) {
            this(splitter, splitter2);
        }

        public Map<String, String> split(CharSequence charSequence) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (String str : this.outerSplitter.split(charSequence)) {
                Iterator itAccess$000 = Splitter.access$000(this.entrySplitter, str);
                Preconditions.checkArgument(itAccess$000.hasNext(), INVALID_ENTRY_MESSAGE, str);
                String str2 = (String) itAccess$000.next();
                Preconditions.checkArgument(!linkedHashMap.containsKey(str2), "Duplicate key [%s] found.", str2);
                Preconditions.checkArgument(itAccess$000.hasNext(), INVALID_ENTRY_MESSAGE, str);
                linkedHashMap.put(str2, (String) itAccess$000.next());
                Preconditions.checkArgument(!itAccess$000.hasNext(), INVALID_ENTRY_MESSAGE, str);
            }
            return Collections.unmodifiableMap(linkedHashMap);
        }

        private MapSplitter(Splitter splitter, Splitter splitter2) {
            this.outerSplitter = splitter;
            this.entrySplitter = (Splitter) Preconditions.checkNotNull(splitter2);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static abstract class SplittingIterator extends AbstractIterator<String> {
        int limit;
        int offset = 0;
        final boolean omitEmptyStrings;
        final CharSequence toSplit;
        final CharMatcher trimmer;

        public SplittingIterator(Splitter splitter, CharSequence charSequence) {
            this.trimmer = Splitter.access$200(splitter);
            this.omitEmptyStrings = Splitter.access$300(splitter);
            this.limit = Splitter.access$400(splitter);
            this.toSplit = charSequence;
        }

        @Override // com.google.common.base.AbstractIterator
        @CheckForNull
        public /* bridge */ /* synthetic */ String computeNext() {
            return computeNext2();
        }

        public abstract int separatorEnd(int i);

        public abstract int separatorStart(int i);

        @Override // com.google.common.base.AbstractIterator
        @CheckForNull
        /* JADX INFO: renamed from: computeNext, reason: avoid collision after fix types in other method */
        public String computeNext2() {
            int iSeparatorStart;
            int i = this.offset;
            while (true) {
                int i2 = this.offset;
                if (i2 == -1) {
                    return endOfData();
                }
                iSeparatorStart = separatorStart(i2);
                if (iSeparatorStart == -1) {
                    iSeparatorStart = this.toSplit.length();
                    this.offset = -1;
                } else {
                    this.offset = separatorEnd(iSeparatorStart);
                }
                int i3 = this.offset;
                if (i3 == i) {
                    int i4 = i3 + 1;
                    this.offset = i4;
                    if (i4 > this.toSplit.length()) {
                        this.offset = -1;
                    }
                } else {
                    while (i < iSeparatorStart && this.trimmer.matches(this.toSplit.charAt(i))) {
                        i++;
                    }
                    while (iSeparatorStart > i && this.trimmer.matches(this.toSplit.charAt(iSeparatorStart - 1))) {
                        iSeparatorStart--;
                    }
                    if (!this.omitEmptyStrings || i != iSeparatorStart) {
                        break;
                    }
                    i = this.offset;
                }
            }
            int i5 = this.limit;
            if (i5 == 1) {
                iSeparatorStart = this.toSplit.length();
                this.offset = -1;
                while (iSeparatorStart > i && this.trimmer.matches(this.toSplit.charAt(iSeparatorStart - 1))) {
                    iSeparatorStart--;
                }
            } else {
                this.limit = i5 - 1;
            }
            return this.toSplit.subSequence(i, iSeparatorStart).toString();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface Strategy {
        Iterator<String> iterator(Splitter splitter, CharSequence charSequence);
    }

    private Splitter(Strategy strategy) {
        this(strategy, false, CharMatcher.none(), Integer.MAX_VALUE);
    }

    public static /* synthetic */ Iterator access$000(Splitter splitter, CharSequence charSequence) {
        return splitter.splittingIterator(charSequence);
    }

    public static /* synthetic */ CharMatcher access$200(Splitter splitter) {
        return splitter.trimmer;
    }

    public static /* synthetic */ boolean access$300(Splitter splitter) {
        return splitter.omitEmptyStrings;
    }

    public static /* synthetic */ int access$400(Splitter splitter) {
        return splitter.limit;
    }

    public static Splitter fixedLength(int i) {
        Preconditions.checkArgument(i > 0, "The length may not be less than 1");
        return new Splitter(new C41214(i));
    }

    /* JADX INFO: renamed from: on */
    public static Splitter m14767on(char c2) {
        return m14768on(CharMatcher.m14758is(c2));
    }

    @GwtIncompatible
    public static Splitter onPattern(String str) {
        return onPatternInternal(Platform.compilePattern(str));
    }

    public static Splitter onPatternInternal(CommonPattern commonPattern) {
        Preconditions.checkArgument(!commonPattern.matcher("").matches(), "The pattern may not match the empty string: %s", commonPattern);
        return new Splitter(new C41203(commonPattern));
    }

    private Iterator<String> splittingIterator(CharSequence charSequence) {
        return this.strategy.iterator(this, charSequence);
    }

    public Splitter limit(int i) {
        Preconditions.checkArgument(i > 0, "must be greater than zero: %s", i);
        return new Splitter(this.strategy, this.omitEmptyStrings, this.trimmer, i);
    }

    public Splitter omitEmptyStrings() {
        return new Splitter(this.strategy, true, this.trimmer, this.limit);
    }

    public Iterable<String> split(CharSequence charSequence) {
        Preconditions.checkNotNull(charSequence);
        return new C41225(this, charSequence);
    }

    public List<String> splitToList(CharSequence charSequence) {
        Preconditions.checkNotNull(charSequence);
        Iterator<String> itSplittingIterator = splittingIterator(charSequence);
        ArrayList arrayList = new ArrayList();
        while (itSplittingIterator.hasNext()) {
            arrayList.add(itSplittingIterator.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public Splitter trimResults() {
        return trimResults(CharMatcher.whitespace());
    }

    public MapSplitter withKeyValueSeparator(String str) {
        return withKeyValueSeparator(m14769on(str));
    }

    private Splitter(Strategy strategy, boolean z2, CharMatcher charMatcher, int i) {
        this.strategy = strategy;
        this.omitEmptyStrings = z2;
        this.trimmer = charMatcher;
        this.limit = i;
    }

    /* JADX INFO: renamed from: on */
    public static Splitter m14768on(CharMatcher charMatcher) {
        Preconditions.checkNotNull(charMatcher);
        return new Splitter(new C41181(charMatcher));
    }

    public Splitter trimResults(CharMatcher charMatcher) {
        Preconditions.checkNotNull(charMatcher);
        return new Splitter(this.strategy, this.omitEmptyStrings, charMatcher, this.limit);
    }

    public MapSplitter withKeyValueSeparator(char c2) {
        return withKeyValueSeparator(m14767on(c2));
    }

    public MapSplitter withKeyValueSeparator(Splitter splitter) {
        return new MapSplitter(this, splitter, null);
    }

    /* JADX INFO: renamed from: on */
    public static Splitter m14769on(String str) {
        Preconditions.checkArgument(str.length() != 0, "The separator may not be the empty string.");
        if (str.length() == 1) {
            return m14767on(str.charAt(0));
        }
        return new Splitter(new C41192(str));
    }

    @GwtIncompatible
    /* JADX INFO: renamed from: on */
    public static Splitter m14770on(Pattern pattern) {
        return onPatternInternal(new JdkPattern(pattern));
    }
}
